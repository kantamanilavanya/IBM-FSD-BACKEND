package com.employee.management;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeService<T> implements EmployeeInterface<T> {
	Employee<T> employee2 = new Employee<T>();

	Employee<T> employee1;
	Scanner input = new Scanner(System.in);
	
	

	Comparator<Employee<T>> EMPLOYEE_SORT_BY_NAME = new Comparator<Employee<T>>() {

		@Override
		public int compare(Employee<T> o1, Employee<T> o2) {
			// TODO Auto-generated method stub
			if (o1 instanceof Employee && o2 instanceof Employee) {
				return ((Employee<T>) o1).getEmployeeName().compareTo(((Employee<T>) o2).getEmployeeName());
			}

			return 0;
		}
	};
	Comparator<Employee<T>> EMPLOYEE_SORT_BY_AGE = new Comparator<Employee<T>>() {

		@Override
		public int compare(Employee<T> o1, Employee<T> o2) {
			// TODO Auto-generated method stub
			if (o1 instanceof Employee && o2 instanceof Employee) {
				return ((Employee<T>) o1).getEmployeeAge() - (((Employee<T>) o2).getEmployeeAge());
			}
			return 0;
		}
	};
	TreeMap<Integer, Employee<T>> employeeData = new TreeMap<Integer, Employee<T>>();

	@Override
	public void addEmployeeData(Employee<T> employee1) {

		employeeData.put(employee1.getEmployeeId(), employee1);
		System.out.println("Data inserted succesfully");

	}

	List<Employee<T>> employeeSorted;

	@Override
	public void listEmployeeData() {
		employeeSorted = new ArrayList<Employee<T>>(employeeData.values());
		Collections.sort(employeeSorted, EMPLOYEE_SORT_BY_AGE);

		if (!employeeSorted.isEmpty()) {
			System.out.format("EmployeeId    EmployeeName    Age    gender    Designation    Department    Salary \n");
			System.out.println(
					"----------------------------------------------------------------------------------------------------");
			for (Employee<T> emps : employeeSorted) {

				System.out.format("%6d\t%15s\t%6s%15s\t%15s\t%15s\t%15s \n", emps.getEmployeeId(),
						emps.getEmployeeName(), emps.getEmployeeAge(), emps.getGender(), emps.getDesignation(),
						emps.getDepartment(), emps.getSalary());

			}

		} else {
			System.out.println("No data to display");
		}

	}

	@Override
	public void displayEmployeeBasedOnId(int id) {

		boolean flag = false;
		if (!employeeData.isEmpty()) {

			for (Employee<T> emps : employeeData.values()) {
				while (!flag) {
					if (emps.getEmployeeId() == id) {
						System.out.format(
								"EmployeeId    EmployeeName    Age    gender    Designation    Department    Salary \n");
						System.out.println(
								"----------------------------------------------------------------------------------------------------");

						System.out.format("%6d\t%15s\t%6s%15s\t%15s\t%15s\t%15s \n", emps.getEmployeeId(),
								emps.getEmployeeName(), emps.getEmployeeAge(), emps.getGender(), emps.getDesignation(),
								emps.getDepartment(), emps.getSalary());

						flag = true;
					} else {
						System.out.println("Entered key doesnt exist please enter valid value");
						id = input.nextInt();
					}

				}
			}
		} else {
			System.out.println("No data to display");
		}

	}

	@Override
	public void updateEmployeeData(int value) {

		boolean flag = false;

		while (!flag) {
			if (employeeData.containsKey(value)) {
				System.out.print("Enter Employee Name:");
				String employeeName = input.next();
				boolean flag1 = false;
				String name = "[a-zA-Z ]+";
				while (!flag1) {
					if ((employeeName.matches(name))) {

						flag1 = true;

					} else {
						System.out.println("enter only alphabets");
						employeeName = input.next();
					}
				}
				System.out.println("Enter the DOB of employee");
				String date = input.next();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");

				LocalDateTime time = LocalDateTime.now();
				LocalDate localDate = time.toLocalDate();

				LocalDate ageDate = LocalDate.parse(date, format);
				Period period = Period.between(ageDate, localDate);
				int localDate1 = period.getYears();

				int employeeAge = localDate1;

				System.out.print("Enter Employee Designation:");
				String designation = input.next();

				System.out.print("Enter Employee Department:");

				String department = input.next();

				System.out.print("Enter salary:");

				Double salary = input.nextDouble();

				employeeData.get(value).setEmployeeName(employeeName);
				employeeData.get(value).setEmployeeAge(employeeAge);
				employeeData.get(value).setDesignation(designation);
				employeeData.get(value).setDepartment(department);
				employeeData.get(value).setSalary(salary);

				System.out.println("Data Updated succesfully");
				flag = true;

			}

			else {
				System.out.println("No available key to update enter valid key");
				value = input.nextInt();

			}
		}

	}

	@Override
	public void deleteEmployeeData(int value) {

		boolean flag = false;

		while (!flag) {
			if (employeeData.containsKey(value)) {
				employeeData.remove(value);
				flag = true;
				System.out.println("Deleted Succesfully");
			} else {
				System.out.println("Entered value doesnt exist to delete enter valid value");
				value = input.nextInt();

			}
		}
	}

	public String toString() {
		return "Employee [employeeId=" + employee1.getEmployeeId() + "]";
	}

	@Override
	public void printStatistics() {
		long sals = employeeSorted.stream().filter(employee1 -> employee1.getEmployeeAge() < 30).count();
		System.out.println("total " + sals + " employees of age lessthan 30");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = (ArrayList<Integer>) employeeSorted.stream().filter(employee -> employee.getEmployeeAge() < 30)
				.map(employee -> employee.getEmployeeId()).collect(Collectors.toList());
		System.out.println("EmployeeId where age lessthan 30");
		System.out.println(list);

		Map<Object, Long> map = new TreeMap<Object, Long>();

		map = employeeSorted.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Employees in each Department");
		System.out.println(map);
		Map<String, Double> salary = employeeSorted.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println("Average salary based on department");
		System.out.println(salary);

		Map<String, Double> age = employeeSorted.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getEmployeeAge)));
		System.out.println("Average age based on department");
		System.out.println(age);

		List<String> totalEmp = employeeSorted.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream()
				.filter(value -> value.getValue() > 2).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Departments of count greaterthan 2");
		System.out.println(totalEmp);
		List<String> emp = employeeSorted.stream().filter(employee -> employee.getEmployeeName().startsWith("s"))
				.map(Employee::getEmployeeName).collect(Collectors.toList());

		System.out.println("Employee name starting with s");
		System.out.println(emp);
		Map<String, Long> sort = employeeSorted.stream().sorted(Comparator.comparing(Employee::getDepartment))
				.collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()));
		System.out.println(sort);
	}

	public synchronized void export() {
		// TODO Auto-generated method stub
		BufferedWriter writer;
		int len = 0;
		try {
			FileWriter file = new FileWriter("C:\\Users\\LavanyaKantamani\\Desktop\\Employee1.txt");
			writer = new BufferedWriter(file);
			for (Entry<Integer, Employee<T>> data : employeeData.entrySet()) {
				writer.write(data.getValue().getEmployeeId() + "," + data.getValue().getEmployeeName() + ","
						+ data.getValue().getEmployeeAge() + "," + data.getValue().getGender() + ","
						+ data.getValue().getDepartment() + "," + data.getValue().getDesignation() + ","
						+ data.getValue().getSalary());
				writer.newLine();
				writer.flush();
				len = employeeData.size();

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Exported " + len + " records to file");

	}

	@Override
	public synchronized void imported() {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		int count = 0;
		try {
			FileReader file = new FileReader("C:\\Users\\LavanyaKantamani\\Desktop\\Employee.txt");
			reader = new BufferedReader(file);
			String s;

			while ((s = reader.readLine()) != null) {
				String[] array = s.split(",");
				int id = Integer.parseInt(array[0]);
				String name = array[1];
				int age = Integer.parseInt(array[2]);
				String gender = array[3];
				String department = array[4];
				String designation = array[5];
				Double salary = Double.parseDouble(array[6]);
				Employee<T> emp = new Employee<T>(id, name, age, gender, department, designation, salary);
				employeeData.put(emp.getEmployeeId(), emp);
				count++;
			}

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
		}
		System.out.println("Imported " + count + " records from file");
	}
}

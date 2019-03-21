package com.Employee.Management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService<T> implements EmployeeImpl<T> {
	// Employee<T> employee2 = new Employee<T>();
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
				return ((Employee<T>) o1).getEmployeeAge().compareTo(((Employee<T>) o2).getEmployeeAge());
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

	@SuppressWarnings("unchecked")
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
				System.out.print("Enter Employee Age:");
				String employeeAge = input.next();
				boolean isAge = false;
				String ageValidation = "[0-9]+";

				while (!isAge) {
					if (employeeAge.matches(ageValidation)) {
						int agevalue = Integer.parseInt(employeeAge);
						if (agevalue < 20 || agevalue > 80) {
							System.out.println("Enter valid age between 20 and 80");
							employeeAge = input.next();
						} else {

							isAge = true;
						}

					} else {
						System.out.println("enter only numbers");
						employeeAge = input.next();

					}
				}
				System.out.print("Enter Employee Designation:");
				String designation = input.next();

				System.out.print("Enter Employee Department:");

				String department = input.next();

				System.out.print("Enter salary:");

				T salary = (T) input.next();
				String sal = "[0-9.]+";
				boolean isSal = false;
				while (!isSal) {
					if (salary.toString().matches(sal)) {

						isSal = true;
					} else {
						System.out.println("Enter only numbers");
						salary = (T) input.next();

					}
				}
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
		//long count = 0;
		//count = employeeSorted.stream().filter(employee1 -> employee1.getDepartment().contains("IT")).count();
		
	long sals = employeeSorted.stream().filter(employee1 -> Integer.parseInt(employee1.getEmployeeAge()) > 30).count();

		//System.out.println("total " + count + " from IT department");
		System.out.println("total " + sals + " of age lessthan 30");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = (ArrayList<Integer>) employeeSorted.stream()
				.filter(employee1 -> Integer.parseInt(employee1.getEmployeeAge()) > 30)
				.map(employee1 -> employee1.getEmployeeId()).collect(Collectors.toList());
		System.out.println(list);

		Map<Object, Long> map = new TreeMap<Object,Long>();

		map = employeeSorted.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	
		System.out.println(map);
		
		
	
	}

}

package com.Employee.Management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeService implements EmployeeImpl{
	Employee employee2 = new Employee();
	Employee employee1;
	Scanner input = new Scanner(System.in);

	Comparator<Employee> EMPLOYEE_SORT_BY_NAME = new Comparator<Employee>() {
		

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			if (o1 instanceof Employee && o2 instanceof Employee) {
				return ((Employee) o1).getEmployeeName().compareTo(((Employee) o2).getEmployeeName());
			}
			
			return 0;
		}
	};
	Comparator<Employee> EMPLOYEE_SORT_BY_AGE = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			if (o1 instanceof Employee && o2 instanceof Employee) {
				return ((Employee) o1).getEmployeeAge()-(((Employee) o2).getEmployeeAge());
			}
			return 0;
		}
	};
	TreeMap<Integer, Employee> employeeData = new TreeMap<Integer, Employee>();

	@SuppressWarnings("unchecked")
	@Override
	public void addEmployeeData(Employee employee1) {
		

		employeeData.put(employee1.getEmployeeId(), employee1);
		System.out.println("Data inserted succesfully");

	}

	@Override
	public void listEmployeeData() {
		List<Employee> employeeSorted = new ArrayList<Employee>(employeeData.values());
		Collections.sort(employeeSorted, EMPLOYEE_SORT_BY_AGE);

		if (!employeeSorted.isEmpty()) {
			System.out.format("EmployeeId    EmployeeName    Age    gender    Designation    Department    Salary \n");
			System.out.println(
					"----------------------------------------------------------------------------------------------------");
			for (Employee emps : employeeSorted) {

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

			for (Employee emps : employeeData.values()) {
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
						employee2.setEmployeeName(employeeName);
						flag1 = true;

					} else {
						System.out.println("enter only alphabets");
						employeeName = input.next();
					}
				}
				System.out.print("Enter Employee Age:");
				int employeeAge = input.nextInt();
				boolean isAge = false;
				String ageValidation = "[0-9]+";

				/*
				 * while (!isAge) { if (employeeAge.matches(ageValidation)) { int agevalue =
				 * Integer.parseInt(employeeAge); if (agevalue < 20 || agevalue > 80) {
				 * System.out.println("Enter valid age between 20 and 80"); employeeAge =
				 * input.next(); } else { employee2.setEmployeeAge(employeeAge); isAge = true; }
				 * 
				 * } else { System.out.println("enter only numbers"); employeeAge =
				 * input.next();
				 * 
				 * } }
				 */
				System.out.print("Enter Employee Designation:");
				String designation = input.next();
				employee2.setDesignation(designation);
				System.out.print("Enter Employee Department:");

				String department = input.next();
				employee2.setDepartment(department);

				System.out.print("Enter salary:");
				
				int salary = input.nextInt();
				String sal = "[0-9.]+";
				/*
				 * boolean isSal = false; while (!isSal) { if (salary.toString().matches(sal)) {
				 * employee2.setSalary(salary); isSal = true; } else {
				 * System.out.println("Enter only numbers"); salary = (T) input.next();
				 * 
				 * } }
				 */
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

	@Override
	public void printStatistics() {
		/*
		 * int count1 = 0; int count2 = 0; int countValue = employeeData.size(); int
		 * salaries; int salaryValue = 0; for (Employee<T> emps : employeeData.values())
		 * { //String age = emps.getEmployeeAge().toString(); int aged =
		 * Integer.parseInt(age); if (aged >= 30) { count1++; } else if (aged >= 20) {
		 * count2++; } } System.out.println("Total " + count2 +
		 * " employees are of age greaterthan 20"); System.out.println("Total " + count1
		 * + " employees are of age greaterthan 30"); for (Employee<T> emps :
		 * employeeData.values()) {
		 * 
		 * String sal = emps.getSalary().toString(); salaries = Integer.parseInt(sal);
		 * salaryValue += salaries; } int averageSalary = (salaryValue) / (countValue);
		 * System.out.println("Average Salary of " + countValue + " employees " +
		 * averageSalary);
		 * 
		 * 
		 */	}

}

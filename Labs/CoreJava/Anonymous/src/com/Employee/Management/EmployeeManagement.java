package com.Employee.Management;

import java.util.InputMismatchException;

import java.util.Scanner;
import java.util.function.Predicate;

public class EmployeeManagement {

	public interface validateEmployee {
		public boolean check(int age, double salary);
	}

	static boolean validate(Employee emp, Predicate validate) {
		if (!validate.test(emp)) 
			//System.out.println("invalid arguments");
			return false;
		else
			return true;

	}

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeService employee = new EmployeeService();
		Employee employee2 = new Employee();
		Employee employee1;

		int choice = 0;
		boolean menu = false;
		Scanner input = new Scanner(System.in);

		while (!menu) {
			System.out.println("*******Menu*******");
			System.out.println("1. Add Employee Data");
			System.out.println("2. List Employee Data");
			System.out.println("3. Update Employee Data");
			System.out.println("4. Delete Employee Data");
			System.out.println("5. Display Employee Based On Id");
			System.out.println("6. Print Statistics");
			System.out.println("7. Exit");
			System.out.println("Enter the choice");

			try {

				choice = input.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Please enter only numbers");
				input.next();
				continue;

			}

			switch (choice) {
			case 1:
				try {
					System.out.print("Enter Employee Name:");
					String name = input.next();

					boolean flag = false;
					String names = "[a-zA-Z ]+";
					while (!flag) {
						if (name.isEmpty() || !(name.matches(names))) {

							System.out.println("enter only alphabets or name cannot be empty");
							name = input.next();

						} else {

							flag = true;

						}
					}

					System.out.print("Enter Employee Age:");
					int age = input.nextInt();

					System.out.print("Enter salary:");
					int salary = input.nextInt();

					System.out.print("Enter Gender:");
					String gender = input.next();
					String match = "[a-zA-Z]+";
					boolean isGender = false;
					while (!isGender) {

						if (!gender.matches(match) || gender.isEmpty()) {
							System.out.println("Enter either male or female");
							gender = input.nextLine();

						} else {
							employee2.setGender(gender);
							isGender = true;

						}
					}
					System.out.print("Enter Employee Designation:");
					String designation = input.next();
					employee2.setDesignation(designation);
					System.out.print("Enter Employee Department:");
					String department = input.next();
					employee2.setDesignation(designation);
					Predicate<Employee> validator = emp->emp.getEmployeeAge()>20&&emp.getSalary()<35000;
					validate(employee2, validator);
					employee1 = new Employee(employee2.getEmployeeId(), name, age, gender, designation, department,
							salary);
					
				}
				// }
				catch (Exception e) {

				}

				break;
			case 2:
				try {
					employee.listEmployeeData();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					int id;
					System.out.println("Enter the id to update");
					id = input.nextInt();
					employee.updateEmployeeData(id);
				} catch (Exception e) {
					System.out.println("please enter the integer value for key");
				}

				break;
			case 4:
				try {
					int id;
					System.out.println("Enter the id to delete data");
					id = input.nextInt();
					employee.deleteEmployeeData(id);
				} catch (Exception e) {
					System.out.println("please enter the integer value for key");
				}
				break;
			case 5:
				try {
					int id;
					System.out.println("Enter the id to displayData");
					id = input.nextInt();
					employee.displayEmployeeBasedOnId(id);
					
				} catch (Exception e) {
					System.out.println("please enter the integer value for key");
				}

				break;
			case 6:
				employee.printStatistics();
				break;
			case 7:
				menu = true;
				System.out.println("Stopped Execution");
				break;
			default:
				System.out.println("Enter options given in  the menu");

			}
		}
		input.close();
	}

}

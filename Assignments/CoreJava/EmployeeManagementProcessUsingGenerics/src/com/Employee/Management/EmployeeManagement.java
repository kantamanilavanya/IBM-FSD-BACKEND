package com.Employee.Management;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeManagement<T> {
	 

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeService<T> employee = new EmployeeService<T>();
		Employee<T> employees=new Employee<T>();
		
		
		

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
					System.out.println("Enter Employee Name:");
					String name = input.next();

					boolean flag = false;
					String names = "[a-zA-Z ]+";
					while (!flag) {
						if (!(name.matches(names))) {

							System.out.print("enter only alphabets and name cannot be empty");
							
							name = input.next();

						} else {
							
							flag = true;

						}
					}

					System.out.print("Enter Employee Age:");
					String age = input.next();
					boolean isAge = false;
					String ageValidation = "[0-9]+";

					while (!isAge) {
						if (!age.matches(ageValidation)) {
							System.out.println("enter only numbers ");
							age = input.next();

						} else {

							int agevalue = Integer.parseInt(age);
							if (agevalue < 20 || agevalue > 80) {
								System.out.println("Enter valid age between 20 and 80");
								age = input.next();
							} else {
								
								isAge = true;
							}

						}
					}

					System.out.print("Enter Gender:");
					String gender = input.next();
					String match = "(fe)?male";
					boolean isGender = false;
					while (!isGender) {

						if (!gender.matches(match)) {
							System.out.println("Enter either male or female");
							gender = input.next();

						} else {
							
							isGender = true;

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
					
					Employee<T> employee1 = new Employee<T>(employees.getEmployeeId(), name, age, gender, designation, department,
							salary);

					employee.addEmployeeData(employee1);
				} catch (Exception e) {

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

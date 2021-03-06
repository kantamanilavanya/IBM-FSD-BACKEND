package com.Employee.Management;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeManagement<T> {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeService<T> employee = new EmployeeService<T>();
		Employee<T> employees = new Employee<T>();

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
			System.out.println("7. Import");
			System.out.println("8. Export");
			System.out.println("9. Exit");
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
					System.out.println("Enter the DOB of Employee:");

					String date = input.next();
					DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");

					LocalDateTime time = LocalDateTime.now();
					LocalDate localDate = time.toLocalDate();

					LocalDate ageDate = LocalDate.parse(date, format);
					Period period = Period.between(ageDate, localDate);
					int localDate1 = period.getYears();

					int age = localDate1;

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
					Double salary = input.nextDouble();
					boolean isSal=false;
					while(!isSal) {
					if(salary==null) {
						System.out.println("salary cannot be empty");
						 salary=input.nextDouble();
					}
					else
						isSal=true;
					}

					Employee<T> employee1 = new Employee<T>(employees.getEmployeeId(), name, age, gender, designation,
							department, salary);

					employee.addEmployeeData(employee1);
				} catch (DateTimeParseException e) {
					System.out.println("invalid date format");

				} catch (Exception e) {
					e.printStackTrace();

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
				try {
					employee.printStatistics();
				} catch (Exception e) {
					System.out.println("No data to give statistics");
				}
				break;

			case 7:
				try {
					employee.imported();
				} catch (Exception e) {
					System.out.println("No data to import");
				}
			case 8:
				try {
					employee.export();
				} catch (Exception e) {
					System.out.println("No data to export");
				}
				break;
			case 9:
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

package com.Employee.Management;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmployeeManagementApp {
	public EmployeeServiceImpl getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeServiceImpl employeeService) {
		this.employeeService = employeeService;
	}

	EmployeeServiceImpl employeeService;
	EmployeeManagementApp(){
		
	}

	public void operations() {
		// TODO Auto-generated method stub

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
					boolean isSal = false;
					while (!isSal) {
						if (salary == null) {
							System.out.println("salary cannot be empty");
							salary = input.nextDouble();
						} else
							isSal = true;
					}

					Employee employee = new Employee(name, age, gender, designation, department, salary);

					employeeService.addEmployee(employee);
				} catch (DateTimeParseException e) {
					System.out.println("invalid date format");

				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					e.printStackTrace();

				}

				break;
			case 2:
				try {
					employeeService.listEmployee();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					int id;
					System.out.println("Enter the id to update");
					id = input.nextInt();
					int count = employeeService.updateEmployee(id);
					boolean flag = false;
					while (!flag) {
						if (count == 0) {
							System.out.println("id doesnt exist");
							id = input.nextInt();
							count = employeeService.updateEmployee(id);
						} else {
							System.out.println("updated Succesfully");
							flag = true;
						}
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					// System.out.println("please enter the integer value for key");
					e.printStackTrace();
				}

				break;
			case 4:
				try {
					int id;
					System.out.println("Enter the id to delete data");
					id = input.nextInt();
					boolean flag = false;
					int count = employeeService.deleteEmployeeById(id);
					while (!flag) {
						if (count == 0) {
							System.out.println("Id doesnt exist");
							id = input.nextInt();
							count = employeeService.deleteEmployeeById(id);
						} else {
							flag = true;
						}
					}

				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println("please enter the integer value for key");
				}
				break;
			case 5:
				try {
					int id;
					System.out.println("Enter the id to displayData");
					id = input.nextInt();
					employeeService.listEmployeeById(id);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					// System.out.println("please enter the integer value for key");
					e.printStackTrace();
				}

				break;
			case 6:
				try {
					employeeService.printStatistics();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println("No data to give statistics");
				}
				break;

			case 7:

				Callable<Boolean> importThread = new Callable<Boolean>() {

					
					public Boolean call() throws Exception {
						// TODO Auto-generated method stub
						System.out.println(Thread.currentThread() + "waiting.....");
						Thread.sleep(1000);
						String data = employeeService.importData();
						System.out.println(data);
						return true;
					}

				};
				ExecutorService executor = Executors.newFixedThreadPool(3);
				Future<Boolean> importfuture = executor.submit(importThread);

				System.out.println(Thread.currentThread().getName() + "Import process Triggered");
				break;
			case 8:

				Callable<Boolean> exportThreads = new Callable<Boolean>() {

					
					public Boolean call() throws Exception {
						// TODO Auto-generated method stub
						System.out.println(Thread.currentThread() + "waiting......");
						Thread.sleep(1000);
						String data = employeeService.export();
						System.out.println(data);
						return true;
					}

				};
				ExecutorService executors = Executors.newFixedThreadPool(10);
				Future<Boolean> importfutures = executors.submit(exportThreads);
				System.out.println(Thread.currentThread().getName() + "export process Triggered");

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

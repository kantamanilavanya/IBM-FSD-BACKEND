package com.Employee.Management;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {

	Scanner input = new Scanner(System.in);
	private static AtomicInteger idGenerator = new AtomicInteger(100);
	private final int employeeId;
	private String employeeName;
	private int employeeAge;
	private String gender;
	private String designation;
	private String department;
	private int salary;

	public Employee() {
		employeeId = idGenerator.getAndIncrement();
	}

	public Employee(int employeeId, String employeeName, int employeeAge, String gender, String designation,
			String department, int salary) {

		this.employeeId = idGenerator.getAndIncrement();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.gender = gender;
		this.designation = designation;
		this.department = department;
		this.salary = salary;

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

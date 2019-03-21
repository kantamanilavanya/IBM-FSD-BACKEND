package com.Employee.Management;

import java.util.Scanner;
public class Employee {

	Scanner input = new Scanner(System.in);

	private int employeeId;
	private String employeeName;
	private String date;
	private int employeeAge;
	private String gender;
	private String designation;
	private String department;
	private Double salary;

	public Employee() {

	}

	public Employee(String employeeName, int employeeAge, String gender, String designation, String department,
			Double salary) {

		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.gender = gender;
		this.designation = designation;
		this.department = department;
		this.salary = salary;

	}

	public Employee(int employeeId, String employeeName, int employeeAge, String gender, String designation,
			String department, Double salary) {
		super();
		this.employeeId = employeeId;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", gender=" + gender + ", designation=" + designation + ", department=" + department + ", salary="
				+ salary + "]";
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}

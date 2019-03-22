package com.employee.management;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee<T> {

	Scanner input = new Scanner(System.in);
	private static AtomicInteger idGenerator = new AtomicInteger(101);
	private final int employeeId;
	private String employeeName;
	private String employeeAge;
	private String gender;
	private String designation;
	private String department;
	private T salary;

	public Employee() {
		employeeId = 0;
	}

	public Employee(int employeeId, String employeeName, String employeeAge, String gender, String designation,
			String department, T salary) {

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

	public String getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
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

	public T getSalary() {
		return salary;
	}

	public void setSalary(T salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", gender=" + gender + ", designation=" + designation + ", department=" + department + ", salary="
				+ salary + "]";
	}

}

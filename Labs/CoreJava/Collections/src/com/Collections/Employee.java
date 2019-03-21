package com.Collections;

import java.util.Collection;

public class Employee<T> {
	private int empId;
	private String employeeName;
	private String gender;
	private int age;
	private String designation;
	private String department;
	private T salary;

	public Employee(int empId, String employeeName, String gender, int age, String designation, String department,
			T salary) {

		this.empId = empId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.age = age;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
		empId++;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		return "Employee [employeeId=" + empId + ",employeeName=" + employeeName + ", gender=" + gender + ", age=" + age
				+ ", designation=" + designation + ", department=" + department + ", salary=" + salary + "]";
	}

	public void printDetails() {
		// TODO Auto-generated method stub
		// System.out.println("EmployeeId:" + getEmpId());
		System.out.println("EmployeeName:" + getEmployeeName());
		System.out.println("EmployeeAge:" + getAge());
		System.out.println("EmployeeGender:" + getGender());
		System.out.println("EmployeeDesignation:" + getDesignation());
		System.out.println("EmployeeDepartment:" + getDepartment());
		System.out.println("EmployeeSalray:" + getSalary());

	}

	public T averageSalary(Object[] objects) {

	
		return (T) objects;


	}

	@Override
	public int hashCode() {
		return getEmpId() % 15;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

}

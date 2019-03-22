package com.oops;

public class PermanentEmployee extends Person implements Appraisable {
	int empId;

	public int getEmpId() {
		return empId;
	}

	String designation;
	String department;
	double salary;

	public PermanentEmployee(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee() {

		System.out.println("Inside Employee Class");
	}

	public PermanentEmployee(String name, String gender, int age, int empId, String designation, String department,
			double salary) {
		super(name, gender, age);
		this.empId = empId;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {

		return "Employee [empId=" + empId + ", designation=" + designation + ", department=" + department + ", salary="
				+ salary + "]";
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("EmployeeId:" + getEmpId());
		super.printDetails();
		System.out.println("EmployeeDesignation:" + getDesignation());
		System.out.println("EmployeeDepartment:" + getDepartment());
		System.out.println("EmployeeSalray:" + getSalary());

	}
	
	public void printData(int age) {
		System.out.println("Age is"+age);
	}
	
	public void printData(String name) {
		System.out.println("Name is"+name);
	}

	@Override
	public void appraisable(double sal) {
		// TODO Auto-generated method stub
		sal=sal+getSalary();
		System.out.println("New Salary:"+sal);
		
		
	}

}

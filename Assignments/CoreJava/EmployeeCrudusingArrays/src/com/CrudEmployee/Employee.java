package com.CrudEmployee;

public class Employee {
	private static int empId = 1;
	private String employeeName;
	private String gender;
	private int age;
	private String designation;
	private String department;
	private double salary;

	public Employee(String employeeName, String gender, int age, String designation, String department, double salary) {
		super();
		this.employeeName = employeeName;
		this.gender = gender;
		this.age = age;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
		empId++;
	}

	public static int getEmpId() {
		return empId;
	}

	public static void setEmpId(int empId) {
		Employee.empId = empId;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", gender=" + gender + ", age=" + age + ", designation="
				+ designation + ", department=" + department + ", salary=" + salary + "]";
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

	public void delete(Employee emp) {
		
		emp=null;
		
		

	}

}

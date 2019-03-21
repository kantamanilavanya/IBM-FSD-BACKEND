package com.Employee;

public class Employee {

	private static int id = 1;
	private String name;
	private int age;
	private String gender;
	private String designation;
	private double salary;

	public Employee() {

	}

	public Employee(String name, int age, String gender, String designation, double salary) {

		// this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.designation = designation;
		this.salary = salary;
		id++;
	}
	

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Employee.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ",name=" + name + ", age=" + age + ", gender=" + gender + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	public void printEmployeeDetails() {
		String data = toString();
		System.out.println(data);
		System.out.println();

	}

	

	/*
	 * public void updateDetails(double salary, String name) { this.salary = salary;
	 * this.name = name; System.out.println("updated EmployeeDetails");
	 * printEmployeeDetails(); }
	 */

}

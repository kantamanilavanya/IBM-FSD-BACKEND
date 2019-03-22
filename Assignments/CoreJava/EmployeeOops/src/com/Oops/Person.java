package com.oops;

/*
 *1.cannot create instance 
 *2. contains one or more abstract methods
*/
public class Person {

	private String name;
	private String gender;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Person() {
		System.out.println("Inside person Class");
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, String gender, int age) {

		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	public void printDetails() {
		System.out.println("EmployeeName:" + getName());
		System.out.println("EmployeeAge:" + getAge());
		System.out.println("EmployeeGender:" + getGender());
	}

}

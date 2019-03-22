package com.Employee.Spring;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	LocalDate dob;
	
	private String name;
	
	private String designation;
	
	private double salary;
	private List skills;

	

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Autowired
	private Address address;
	
	private boolean fullTime;
	public Employee() {
		
	}
	/*
	 * public Employee(Address address) { this.address = address; }
	 */

	public Employee(Address address, LocalDate dob) {
		this.address = address;
		this.dob = dob;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", dob=" + dob + ", name=" + name + ", designation=" + designation + ", salary="
				+ salary + ", skills=" + skills + ", address=" + address + ", fullTime=" + fullTime + "]";
	}

	public Employee(int id, LocalDate dob, String name, String designation, double salary, List skills, Address address,
			boolean fullTime) {
		
		this.id = id;
		this.dob = dob;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.skills = skills;
		this.address = address;
		this.fullTime = fullTime;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List getSkills() {
		return skills;
	}

	public void setSkills(List skills) {
		this.skills = skills;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isFullTime() {
		return fullTime;
	}

	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
	}

}

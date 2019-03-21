package com.Employee.Management;

public interface EmployeeImpl{
	
	public void addEmployeeData(Employee employee);
	public void listEmployeeData();
	public void deleteEmployeeData(int id);
	public void updateEmployeeData(int id);
	public void displayEmployeeBasedOnId(int id);
	public void printStatistics();
	default public void add() {
		System.out.println("inside default");
		
	}
	static public void display() {
		System.out.println("inside static method");
	}
	
	
	

}

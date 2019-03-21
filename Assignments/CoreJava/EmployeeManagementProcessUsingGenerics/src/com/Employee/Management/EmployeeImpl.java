package com.Employee.Management;

public interface EmployeeImpl<T> {
	
	public void addEmployeeData(Employee<T> employee);
	public void listEmployeeData();
	public void deleteEmployeeData(int id);
	public void updateEmployeeData(int id);
	public void displayEmployeeBasedOnId(int id);
	public void printStatistics();
	
	
	

}

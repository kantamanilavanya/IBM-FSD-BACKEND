package com.employee.management;
public interface EmployeeInterface<T> {
	
	public void addEmployeeData(Employee<T> employee);
	public void listEmployeeData();
	public void deleteEmployeeData(int id);
	public void updateEmployeeData(int id);
	public void displayEmployeeBasedOnId(int id);
	public void printStatistics();
	public void export();
	public void imported();
	
	
	

}

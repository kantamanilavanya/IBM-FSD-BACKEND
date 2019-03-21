package com.Employee.Management;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
	public Employee addEmployee(Employee emp) throws SQLException;

	public int updateEmployee(int id) throws SQLException;

	public List<Employee> listEmployee() throws SQLException;

	public int deleteEmployeeById(int id) throws SQLException;

	public Employee listEmployeeById(int id) throws SQLException;

	public String importData();

	public String export() throws SQLException, IOException;
	
	public void printStatistics() throws SQLException;

}

package com.employee.management;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDAOImpl employeeDAO=new EmployeeDAOImpl();
	

	
	public Employee addEmployee(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(emp);
	}

	
	public int updateEmployee(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(emp);
	}

	@SuppressWarnings("unchecked")
	
	public List<Employee> listEmployee() throws SQLException {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeDAO.listEmployee();
	}

	
	public int deleteEmployeeById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return employeeDAO.deleteEmployeeById(id);
	}

	
	public Employee listEmployeeById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return employeeDAO.listEmployeeById(id);
	}

	
	public String importData() {
		// TODO Auto-generated method stub
		return employeeDAO.importData();
	}

	
	public String export() throws SQLException, IOException {
		// TODO Auto-generated method stub
		return employeeDAO.export();
	}

	
	public void printStatistics() throws SQLException {
		// TODO Auto-generated method stub
		employeeDAO.printStatistics();
		
	}

}

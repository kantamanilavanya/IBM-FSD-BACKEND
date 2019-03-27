package com.Employee.Management;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
	
	
	public EmployeeDAOImpl getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAOImpl employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public EmployeeServiceImpl(){
		
	}
	
	EmployeeDAOImpl employeeDAO;
	

	@Override
	public Employee addEmployee(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(emp);
	}

	@Override
	public int updateEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> listEmployee() throws SQLException {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeDAO.listEmployee();
	}

	@Override
	public int deleteEmployeeById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return employeeDAO.deleteEmployeeById(id);
	}

	@Override
	public Employee listEmployeeById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return employeeDAO.listEmployeeById(id);
	}

	@Override
	public String importData() {
		// TODO Auto-generated method stub
		return employeeDAO.importData();
	}

	@Override
	public String export() throws SQLException, IOException {
		// TODO Auto-generated method stub
		return employeeDAO.export();
	}

	@Override
	public void printStatistics() throws SQLException {
		// TODO Auto-generated method stub
		employeeDAO.printStatistics();
		
	}

}

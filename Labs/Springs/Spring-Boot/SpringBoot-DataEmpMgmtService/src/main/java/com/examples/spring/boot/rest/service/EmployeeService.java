package com.examples.spring.boot.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.spring.boot.rest.model.Employee;

import com.examples.spring.boot.rest.repository.EmployeeRepository;




@Service
public class EmployeeService {
	

	@Autowired
	private EmployeeRepository employeeRepository;

	public void add(Employee employee) {
//		int empId = employees.size() + 1;	
//		employee.setId(empId);			
//		employees.put(employee.getId(), employee);
		employeeRepository.save(employee);
	}

	public void update(Employee employee) {

//		employees.put(employee.getId(), employee);
		employeeRepository.save(employee);
	}

	public Employee get(int empId) {
		return employeeRepository.findById(empId).get();
	}

	public void delete(int empId) {
		employeeRepository.deleteById(empId);
	}

	public List<Employee> list() {		
//		return new ArrayList<Employee>(employees.values());
		return (List<Employee>) employeeRepository.findAll();
	}

	
}

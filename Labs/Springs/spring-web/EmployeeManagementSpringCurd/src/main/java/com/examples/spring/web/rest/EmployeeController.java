package com.examples.spring.web.rest;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {
	EmployeeService emp=new EmployeeService();

	
	
	@RequestMapping(value = "/EmployeeValue", method = RequestMethod.POST, consumes = { 
	"application/json" })
public Employee postEmployee(@RequestBody Employee employee) {
		
		emp.add(employee);
		
return employee;
}
	
	@GetMapping("/list")
	public List<Employee> listEmployee(){
		List<Employee> empList = emp.list();
		
		return  empList;
		
	}
@GetMapping(value="/listValue/{id}",consumes= {"application/json"})
@ResponseBody
public Employee listEmployee(@PathVariable String id){
	return emp.get(id);
	
}
	
}

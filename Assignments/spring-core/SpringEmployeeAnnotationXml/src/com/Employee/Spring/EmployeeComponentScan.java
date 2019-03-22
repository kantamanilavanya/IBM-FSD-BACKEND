package com.Employee.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class EmployeeComponentScan {
	@Bean
	public Employee details() {
		return new Employee(address());
	}
	
	@Bean
	public Address address() {
		return new Address("Chennai","India",123789);
	}
	

}

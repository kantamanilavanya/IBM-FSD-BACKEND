package com.Employee.Spring;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class EmployeeComponentScan {

	@Bean
	public LocalDate date() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date = LocalDate.parse("1997/05/11", format);
		return date;

	}

	public List<?> data() {
		List values = new ArrayList();
		values.add("oracle");
		values.add("SAP");

		return values;

	}

	@Bean
	public Employee employee() {
		return new Employee(100, date(), "suma", "java", 78000, data(), address(), true);
	}

	@Bean
	public Address address() {
		return new Address("Chennai", "India", 123789);
	}

}

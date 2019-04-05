package com.examples.spring.web.mvc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.examples.spring.web.mvc.model.Employee;
import com.examples.spring.web.mvc.model.Register;

public class RegisterService {
	
	private static Map<String, Register> employees = new LinkedHashMap<String, Register>();
	

	public void add(Register register)
	{

		register.setId(UUID.randomUUID().toString());
		employees.put(register.getName(), register);
		System.out.println("Name"+register.getName());
			
		//employees.put(employee.getId(), employee);
	}
	
	public Map<String, Register> getMap() {
        return   (Map<String, Register>) employees;
   }
	
	
}

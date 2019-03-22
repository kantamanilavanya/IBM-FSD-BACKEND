package com.employee.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		Employee employee1=(Employee) context.getBean("employee");
		System.out.println(employee1.toString());
		Employee employee2=(Employee) context.getBean("employee1");
		System.out.println(employee2.toString());
		}

}
 
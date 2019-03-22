package com.Employee.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeComponentScan.class);
		Employee employee1=(Employee) context.getBean("employee");
		System.out.println(employee1.toString());
		
		}

}
 
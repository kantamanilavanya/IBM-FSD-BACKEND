package com.Employee.Management;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		EmployeeManagementApp employee1=(EmployeeManagementApp) context.getBean("employeeManagement");
		employee1.operations();
		
		}

}
 
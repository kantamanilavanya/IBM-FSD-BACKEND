package com.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("beans-config.xml");
		Greetings greetings=(Greetings) context.getBean("greetings");
		System.out.println(greetings.getMessage());
		Greetings greetings1=(Greetings) context.getBean("greetings1");
		System.out.println(greetings1.getMessage());
		

	}

}

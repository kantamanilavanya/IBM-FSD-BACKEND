package com.Example.Springs.Core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SpringHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");

		Greetings greetings = (Greetings) context.getBean("greetings");
		System.out.println(greetings.getMessage());

		Greetings greetings1 = (Greetings) context.getBean("greetings2");
		System.out.println(greetings1.getMessage());
		Greetings greetings2 = (Greetings) context.getBean("greetingsType");
		System.out.println(greetings2.getMessage());
		Greetings greetings3 = (Greetings) context.getBean("greetingsIndex");
		System.out.println(greetings3.getMessage());

		


	}

}

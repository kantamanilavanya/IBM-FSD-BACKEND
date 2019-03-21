package com.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

//import com.CrudEmployee.Employee;

public class VectorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList countries = new LinkedList();

		Employee employee = new Employee(10,"lavanya", "female", 23, "java developer", "Technical", 450000);
		Employee employee1 = new Employee(20,"janaki", "male", 23, "java developer", "IT", 550000);
		Employee employee2 = new Employee(30,"gayathri", "female", 21, "oracle developer", "Technical", 350000);
		Employee employee3=employee2;
		// ArrayList list = new ArrayList();
		countries.add("india");
		countries.add("usa");
		countries.add("cannada");
		countries.add("malaysia");
		System.out.println(countries.size());
		for (Object items : countries) {

			System.out.println(items);
		}
		countries.addFirst("china");
		countries.addLast("london");

		countries.remove(1);
		System.out.println("******After removing *******");
		for (Object items : countries) {

			System.out.println(items);
		}
		countries.removeAll(countries);
		System.out.println("******After removing *******");
		for (Object items : countries) {

			System.out.println(items);
		}

		Set fruits = new HashSet();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("pineapple");
		System.out.println("**********HashSet***********");
		Iterator itr = fruits.iterator();
		while (itr.hasNext()) {
			Object fruit = itr.next();
			System.out.println(fruit);
		}

		fruits.hashCode();
		Set animals = new HashSet();
		animals.add("dog");
		animals.add("cat");
		animals.add("rat");
		animals.add("cow");
		Iterator itr1 = animals.iterator();
		while (itr1.hasNext()) {
			Object animal = itr1.next();
			System.out.println(animal);
		}
		Set emp = new HashSet();
		emp.add(employee);
		emp.add(employee1);
		emp.add(employee2);
		emp.add(employee3);
		Iterator itr2 = emp.iterator();
		while (itr2.hasNext()) {
			Object emps = itr2.next();
			System.out.println(emps);
		}

		System.out.println(fruits.hashCode());
		System.out.println(animals.hashCode());
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		
		

	}

}

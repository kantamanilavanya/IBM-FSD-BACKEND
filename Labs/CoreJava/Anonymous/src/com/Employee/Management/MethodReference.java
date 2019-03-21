package com.Employee.Management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class MethodReference {
	public void display(String item) {
		System.out.println(item);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReference me=new MethodReference();
		String[] countries = { "india", "USA", "china" };
		Collection<String> country = Arrays.asList(countries);
		for (String countries1 : country) {
			System.out.println(countries1);

		}
		
		

		System.out.println("****ForEachMethod*****");
		country.forEach(countries1 -> System.out.println(countries1));
		System.out.println("*****Calling method*******");
		country.forEach(item -> displayItem(item));
		System.out.println("********method reference*******");
		country.forEach(MethodReference::displayItem);
		System.out.println("*****instance method*****");
		country.forEach(me::display);
		
		Supplier<List<String>> createList=()->{return new ArrayList<String>();
		};
		List<String> citiesList=createList.get();
		System.out.println(citiesList);
		//Constructor
		Supplier<List<String>> createLists=ArrayList::new;
		List<String> citiesLists=createLists.get();
		System.out.println(citiesLists);
		
		
		
		
		

	}

	private static void displayItem(String item) {
		// TODO Auto-generated method stub
		System.out.println(item);
	}

}

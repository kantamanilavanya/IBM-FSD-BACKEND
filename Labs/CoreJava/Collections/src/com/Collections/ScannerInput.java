package com.Collections;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=input.next();
		System.out.println("Enter age:");
		int age=input.nextInt();
		System.out.println("Enter Gender:");
		String gender=input.next();
		System.out.println("Enter designation:");
		String designation=input.next();
		System.out.println("Enter salary:");
		int salary=input.nextInt();
		
		  System.out.println("Employee Name: "+name);
		  System.out.println("Employee Age: "+age);
		  System.out.println("Employee Gender: "+gender);
		  System.out.println("Employee Designation: "+designation);
		  System.out.println("Employee Salary: "+salary);
		 
		
		
		

	}

}

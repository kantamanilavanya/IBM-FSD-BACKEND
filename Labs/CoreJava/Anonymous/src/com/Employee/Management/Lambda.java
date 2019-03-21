package com.Employee.Management;

interface Sayable{
	public String say(String name);
}
interface Add{
	public int add(int number1,int number2);
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s=(name)->
			 "Hello "+name;
		
		
		Add add=(number1,number2)-> number1+number2;
		
		
	System.out.println(s.say("lavanya"));
	System.out.println("addition :"+add.add(10, 20));

	}

}

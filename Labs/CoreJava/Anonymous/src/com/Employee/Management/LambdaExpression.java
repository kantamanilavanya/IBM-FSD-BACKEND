package com.Employee.Management;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class LambdaExpression<T> {
	
	
	public static  void main(String args[]) {
		Employee emp=new Employee();
		Supplier<Employee> employee=()->{
		return new Employee(100,"lavanya",23,"female","java","IT",26000);
		};
		Employee exp=employee.get();
		
		LambdaExpression lamExp = new LambdaExpression();

		// with type declaration
		BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;

		// with out type declaration
		BiFunction<Integer, Integer, Integer> subtraction = (a, b) -> a - b;
		// with return statement along with curly braces
		BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;

		// without return statement and without curly braces
		BiFunction<Integer, Integer, Integer> division = (a, b) -> a / b;

		System.out.println("10 + 5 = " + lamExp.operate(10,5,addition));
		System.out.println("10 - 5 = " + lamExp.operate(10,5,subtraction));
		System.out.println("10 x 5 = " + lamExp.operate(10,5,multiplication));
		System.out.println("10 / 5 = " + lamExp.operate(10,5,division));
		System.out.println("name"+exp.getEmployeeName()+"age"+exp.getEmployeeAge());
		
		

	}

	private int operate(int a, int b, BiFunction<Integer,Integer,Integer> biFunction) {
		return (int) biFunction.apply(a, b);
	}
	
	
	
	
		

}

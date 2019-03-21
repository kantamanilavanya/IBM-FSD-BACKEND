package com.lambda;

import java.util.function.BiFunction;



public class LambdaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaCalculator lamExp = new LambdaCalculator();

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
		
		
		

	}

	private int operate(int a, int b, BiFunction<Integer,Integer,Integer> biFunction) {
		return (int) biFunction.apply(a, b);
	}
	
	
	

	}



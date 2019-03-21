package com.swap;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****Swap two  Numbers*******");
		int a = 15;
		int b = 20;
		System.out.println("Numbers are a=" + a + " and b=" + b + " before swapping");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers are a=" + a + " and b=" + b + " after swapping");

	}

}

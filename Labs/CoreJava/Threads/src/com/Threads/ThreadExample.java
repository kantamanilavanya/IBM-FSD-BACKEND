package com.Threads;

import java.util.Scanner;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("thread Demo");
		try {
			System.out.println("Thread is about to sleep...");
			System.out.println("Thread is sleeping now zzzzzzzzzzzzzzzzzzzzzzzz");
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("ThreadInterruptedException");
			e.printStackTrace();
		}
		System.out.println("Thread wokeup haaaaaaaaaaaaaaaa....");
		Scanner input=new Scanner(System.in);
		System.out.println(input.nextLine());
		System.out.println(Thread.currentThread().getName());

	}

}

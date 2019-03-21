package com.Threads;

public class ExtendsThreadExample extends Thread {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			System.out.println("Custom thread sleeping...");
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("ThreadInterruptedException");
			e.printStackTrace();
		}
		System.out.println("Custom thread Wokeup");
	}
	

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		// TODO Auto-generated method stub
		ExtendsThreadExample thread1=new ExtendsThreadExample();
		thread1.start();
		try {
			System.out.println("Main thread sleeping");
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("ThreadInterruptedException");
			e.printStackTrace();
		}
		System.out.println("Main thread Wokeup");

	}

}

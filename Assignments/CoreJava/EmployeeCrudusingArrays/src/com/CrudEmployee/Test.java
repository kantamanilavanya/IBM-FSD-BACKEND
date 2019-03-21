package com.CrudEmployee;

public class Test {
	
	private int a=10;
	private int b=20;
	Test1 t=new Test1();
	public void add() {
		System.out.println(t.value1+t.value2);
	}
	
	interface TestInterface{
		public void add(); 
			
		
		
	}
	
	public   class Test1 implements TestInterface{
		int value1=10;
		int value2=20;
		
		public void add() {

			System.out.println("inside test class");
			System.out.println(a+b);
			
		}
	}
		
		public static class Test2{
			static int value1=10;
			static int value2=20;
			public void display() {
				System.out.println("Hello inner class");
			}
			
		}
		
	
	public static void main(String[] args) {
		Test t=new Test();
		Test.Test1 nestedClass=t.new Test1();
		nestedClass.add();
		//static
		Test.Test2 nestedInnerClass=new Test.Test2();
		nestedInnerClass.display();
		
		
	
	}
	
	

}

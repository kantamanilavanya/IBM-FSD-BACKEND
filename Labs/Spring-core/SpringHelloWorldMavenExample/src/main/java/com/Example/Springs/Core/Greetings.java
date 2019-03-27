package com.Example.Springs.Core;

public class Greetings {
	
	private String message="Spring HelloWorld";
	public Greetings() {
		
	}
	

	public Greetings(String message) {
		
		this.message = message;
	}
	
public Greetings(String message1,String message2) {
		
		this.message = message1+""+message2;
	}
public Greetings(String message1,Integer number1,Integer number2) {
	
	this.message = message1+""+number1+""+number2;
}
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

package com.Employee.Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Address {
	//@Value("Bangalore")
	private String city;
	//@Value("India")
	private String country;
	//@Value("56789")
	private int pinCode;
	
	
	public Address() {
		
	}

	public Address(String city, String country, int pinCode) {
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pinCode=" + pinCode + "]";
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	

}

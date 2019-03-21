package com.Oops;

public class ContractEmployee extends Person {
	int id;
	String startDate;
	String endDate;

	public ContractEmployee(String name, String gender, int age, int id, String startDate, String endDate) {
		super(name, gender, age);
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.printDetails();
		System.out.println("project StartDate:" + getStartDate());
		System.out.println("project EndDate:" + getEndDate());

	}

}

package com.Employee;
public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1=new Employee();
		employee1.setAge(22);
		employee1.setName("lavanya kantamani");
		employee1.setGender("female");
		employee1.setDesignation("java full stack developer");
		employee1.setSalary(500000);
		employee1.printEmployeeDetails();
		
		Employee employee2=new Employee("janaki",23,"male","java developer",350000);
		employee2.printEmployeeDetails();
		System.out.println(employee2.getName());
		
		
		Employee employee3=new Employee("gayathri",21,"female","oracle developer",150000);
		employee3.printEmployeeDetails();

	}

}

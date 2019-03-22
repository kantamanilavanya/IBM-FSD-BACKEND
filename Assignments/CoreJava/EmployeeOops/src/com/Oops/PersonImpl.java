package com.oops;

public class PersonImpl {

	public static void main(String[] args) { // TODO Auto-generated method stub
		System.out.println("************RuntimePolymorphism overridding*************");
		System.out.println("*********PermanentEmployee************");
		Person person;
		person = new PermanentEmployee("lavanya", "female", 23, 100, "javadeveloper", "IT", 500000);

		
		person.printDetails();
		person.toString();

		System.out.println("*********ContractEmployee************");

		person = new ContractEmployee("gayathri", "female", 23, 100, "06-03-2019",
				"12-12-2020");

		person.printDetails();
		
		System.out.println("************Inheritance*************");
		System.out.println("*********PermanentEmployee************");
		
		PermanentEmployee permanentEmployee = new PermanentEmployee("sushma", "female", 23, 100, "javadeveloper", "IT", 500000);

		
		permanentEmployee.printDetails();
		System.out.println("*********CompiletimePolymorphism overloading************");
		permanentEmployee.printData(24);
		permanentEmployee.printData("jankai");
		permanentEmployee.appraisable(10000);
		

		System.out.println("*********ContractEmployee************");

		ContractEmployee contractEmployee = new ContractEmployee("vandana", "female", 23, 100, "06-03-2019",
				"12-12-2020");

		contractEmployee.printDetails();
		
		
		
	}

}

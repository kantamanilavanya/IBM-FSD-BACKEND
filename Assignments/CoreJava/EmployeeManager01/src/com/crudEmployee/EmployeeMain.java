package com.crudEmployee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("lavanya", "female", 23, "java developer", "Technical", 450000);
		Employee employee1 = new Employee("janaki", "male", 23, "java developer", "IT", 550000);
		Employee employee2 = new Employee("gayathri", "female", 21, "oracle developer", "Technical", 350000);
		Employee[] emp = new Employee[] { employee, employee1, employee2 };

		System.out.println("***************Employee Details*****************");
		for (int i = 0; i < emp.length; i++) {
			System.out.println("****Employee " + i + " details*****");
			System.out.println(emp[i].toString());
			System.out.println();
		}

		System.out.println("**************updated Details***********");
		employee.setEmployeeName("lavanya Kantamani");
		employee1.setEmployeeName("janaki pattipati");
		employee2.setEmployeeName("gayathri kantamani");
		employee.setDesignation("java full stack");

		

		for (Employee i : emp) {
			System.out.println(i.toString());
		}

		// employee = null;
		Employee[] empArray = new Employee[2];

		for (int i = 0, j = 0; i < emp.length && j < empArray.length; i++, j++) {

			emp[0]=null;
			if (emp[i].equals(null)) {
				continue;

			}

			empArray[j] = emp[i];

		}

		// System.out.println(empArray.length);

		System.out.println("*********Deleted Employee**********");

		for (int i = 0; i < empArray.length; i++) {

			{
				// emp[0].delete(employee);

				System.out.println("****Employee " + i + " details*****");
				empArray[i].printDetails();
				System.out.println();
			}
		}
		employee.printDetails();

	}

}

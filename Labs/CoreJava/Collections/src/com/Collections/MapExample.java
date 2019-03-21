package com.Collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Comparator EMPLOYEE_SORT_BY_AGE = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				if (o1 instanceof Employee && o2 instanceof Employee) {
					return ((Employee<?>) o1).getEmployeeName() .compareTo( ((Employee<?>) o2).getEmployeeName());
				}
				return 0;
			}
		};

		// TODO Auto-generated method stub
		Map employees = new HashMap();
		employees.put(100, new Employee<Object>(100, "lavanya", "female", 23, "java developer", "Technical", 450000));
		employees.put(200, new Employee<Object>(200, "janaki", "male", 24, "java developer", "Technical", 550000));
		employees.put(300, new Employee<Object>(300, "gayathri", "female", 21, "oracle developer", "Technical", 250000));
		for (Object emp : employees.values()) {
			Employee<?> employ = (Employee<?>) emp;
			System.out.println(employ);
		}
		System.out.println();
		
		System.out.println("***************Sort using TreeMap******************");

		TreeMap<Integer,Employee> employeeSet = new TreeMap<>();
		Employee<String> employee= new Employee(100, "lavanya", "female", 23, "java developer", "Technical", 450000.500);
		Employee<String> employee1=new Employee(200, "janaki", "male", 24, "java developer", "Technical", 550000);
		Employee<String> employee2=new Employee(300, "gayathri", "female", 21, "oracle developer", "Technical", 250000);
		employeeSet.put(100,employee);
		employeeSet.put(200,employee1 );
		employeeSet.put(300,employee2 );
		List<Employee> employeeSorted = new ArrayList<Employee>(employeeSet.values());
		Collections.sort(employeeSorted, EMPLOYEE_SORT_BY_AGE);
		for(Object employeesData:employeeSorted) {
			System.out.println(employeesData);
			
		}
		//System.out.println(employee.averageSalary(employeeSet.get(key)));
		

	}

}

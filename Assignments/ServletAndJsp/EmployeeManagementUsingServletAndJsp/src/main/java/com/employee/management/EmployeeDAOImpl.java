package com.employee.management;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet result = null;
	Scanner input = new Scanner(System.in);

	public EmployeeDAOImpl() {

		try {
			String JDBC_DRIVER = "com.mysql.jdbc.Driver";
			String DB_URL = "jdbc:mysql://localhost/employeeapp";
			String USER = "root";
			String PASS = "";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException se) {

			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Employee addEmployee(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		if (conn != null) {
			String s = ("insert into employeeManagementApp (employeeName,DOB,employeeAge,gender,city,emailId,department,designation,salary) values(?,?,?,?,?,?,?,?,?)");
			PreparedStatement prepare = conn.prepareStatement(s);
			prepare.setString(1, emp.getEmployeeName());
			prepare.setString(2, emp.getDate());
			prepare.setInt(3, emp.getEmployeeAge());
			prepare.setString(4, emp.getGender());
			prepare.setString(5, emp.getCity());
			prepare.setString(6, emp.getEmailId());
			prepare.setString(7, emp.getDepartment());
			prepare.setString(8, emp.getDesignation());
			prepare.setDouble(9, emp.getSalary());
			int count = prepare.executeUpdate();
			System.out.println("Added succesfully" + count + " employee");

		}

		return emp;
	}

	public int updateEmployee(Employee emp) throws SQLException {
		// TODO Auto-generated method stub

		String update = ("update employeeManagementApp set employeeName=?,DOB=?,employeeAge=?,gender=?,city=?,emailId=?,designation=?,department=?,salary=? where employeeId=?");

		PreparedStatement prepare = conn.prepareStatement(update);
		prepare.setString(1, emp.getEmployeeName());

		prepare.setString(2, emp.getDate());
		prepare.setInt(3, emp.getEmployeeAge());

		prepare.setString(4, emp.getGender());
		prepare.setString(5, emp.getCity());
		prepare.setString(6, emp.getEmailId());
		prepare.setString(7, emp.getDepartment());
		prepare.setString(8, emp.getDesignation());
		prepare.setDouble(9, emp.getSalary());
		prepare.setInt(10, emp.getEmployeeId());
		int count = prepare.executeUpdate();
		if (count == 0)
			return 0;
		else
			return 1;
	}

	public List<Employee> listEmployee() throws SQLException {
		// TODO Auto-generated method stub
		List<Employee> emps = new ArrayList<Employee>();
		if (conn != null) {
			String list = ("select * from employeeManagementApp");
			PreparedStatement prepare = conn.prepareStatement(list);
			result = prepare.executeQuery();

			// System.out.format("EmployeeID \t EmployeeName \t EmployeeAge \t gender \t
			// Designation \t Department \t Salary \n ");

			while (result.next()) {
				int id = result.getInt("employeeId");
				String name = result.getString("employeeName");
				String dob = result.getString("DOB");
				int age = result.getInt("employeeAge");
				String gender = result.getString("gender");
				String city = result.getString("city");
				String emailId = result.getString("emailId");

				String designation = result.getString("designation");
				String department = result.getString("department");
				Double salary = result.getDouble("salary");
				Employee employee = new Employee(id, name, dob, age, gender, city, emailId, designation, department,
						salary);
				emps.add(employee);

			}

		}
		return emps;

	}

	public int deleteEmployeeById(int id) throws SQLException {
		// TODO Auto-generated method stub
		int count = 0;
		if (conn != null) {
			String delete = ("delete from employeeManagementApp where employeeId=?");
			PreparedStatement prepare = conn.prepareStatement(delete);
			prepare.setInt(1, id);
			count = prepare.executeUpdate();

		}
		if (count == 0) {
			return count;
		} else {
			System.out.println("deleted succesfully");
			return 1;

		}

	}

	public Employee listEmployeeById(int id) throws SQLException {
		// TODO Auto-generated method stub
		if (conn != null) {
			String listById = ("select employeeId,employeeName,employeeAge,gender,department,designation,salary from employeeManagement where employeeId=?");
			PreparedStatement prepare = conn.prepareStatement(listById);
			prepare.setInt(1, id);
			result = prepare.executeQuery();

			while (result.next()) {
				int idValue = result.getInt("employeeId");
				String name = result.getString("employeeName");
				int age = result.getInt("employeeAge");
				String gender = result.getString("gender");
				String designation = result.getString("designation");
				String department = result.getString("department");
				Double salary = result.getDouble("salary");
				System.out.format(
						"EmployeeID \t EmployeeName \t EmployeeAge \t Gender \t Designation \t Department \t Salary \n ");

				System.out.format("%6d \t %15s \t %6d \t %15s \t %15s \t %15s \n", idValue, name, age, gender,
						department, designation, salary);

			}
		}
		return null;
	}

	public String importData() {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		int count = 0;
		try {
			FileReader file = new FileReader("C:\\Users\\LavanyaKantamani\\Desktop\\Employee.txt");
			reader = new BufferedReader(file);
			String s;

			while ((s = reader.readLine()) != null) {
				String[] array = s.split(",");
				int id = Integer.parseInt(array[0]);
				String name = array[1];
				int age = Integer.parseInt(array[2]);
				String gender = array[3];
				String department = array[4];
				String designation = array[5];
				Double salary = Double.parseDouble(array[6]);
				count++;
				if (conn != null) {
					String importData = ("insert into employeeManagement (employeeName,employeeAge,gender,department,designation,salary) values(?,?,?,?,?,?)");
					PreparedStatement prepare = conn.prepareStatement(importData);
					prepare.setString(1, name);
					prepare.setInt(2, age);
					prepare.setString(3, gender);
					prepare.setString(4, department);
					prepare.setString(5, designation);
					prepare.setDouble(6, salary);
					int count1 = prepare.executeUpdate();
				}
			}

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
		}

		return "Imported " + count + " records from file";
	}

	@SuppressWarnings("resource")

	public String export() throws SQLException, IOException {
		// TODO Auto-generated method stub
		BufferedWriter writer;
		FileWriter file = new FileWriter("C:\\Users\\LavanyaKantamani\\Desktop\\Employee1.txt");
		int len = 0;
		if (conn != null) {
			String list = ("select * from employeeManagement");
			PreparedStatement prepare = conn.prepareStatement(list);
			result = prepare.executeQuery();

			while (result.next())
				try {
					{
						len++;
						int id = result.getInt("employeeId");
						String name = result.getString("employeeName");
						int age = result.getInt("employeeAge");
						String gender = result.getString("gender");
						String designation = result.getString("designation");
						String department = result.getString("department");
						Double salary = result.getDouble("salary");

						writer = new BufferedWriter(file);
						String add = id + "," + name + "," + age + "," + gender + "," + designation + "," + department
								+ "," + salary;

						writer.write(add);
						writer.newLine();
						writer.flush();

					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return "Exported " + len + " records to file";
	}

	TreeMap<Integer, Employee> employeeData = new TreeMap<Integer, Employee>();
	ArrayList<Employee> employeeSorted;

	public void printStatistics() throws SQLException {
		// TODO Auto-generated method stub

		/*
		 * if (conn != null) { String list = ("select * from employeeManagement");
		 * PreparedStatement prepare = conn.prepareStatement(list); result =
		 * prepare.executeQuery(); while (result.next()) { int id =
		 * result.getInt("employeeId"); String name = result.getString("employeeName");
		 * int age = result.getInt("employeeAge"); String
		 * gender=result.getString("gender"); String designation =
		 * result.getString("designation"); String department =
		 * result.getString("department"); Double salary = result.getDouble("salary");
		 * Employee employee=new
		 * Employee(id,name,age,gender,designation,department,salary);
		 * employeeData.put(id, employee);
		 * 
		 * } employeeSorted = new ArrayList<Employee>(employeeData.values()); long sals
		 * = employeeSorted.stream().filter(employee1 -> employee1.getEmployeeAge() <
		 * 30).count(); System.out.println("total " + sals +
		 * " employees of age lessthan 30"); ArrayList<Integer> lists = new
		 * ArrayList<Integer>(); lists = (ArrayList<Integer>)
		 * employeeSorted.stream().filter(employee -> employee.getEmployeeAge() < 30)
		 * .map(employee -> employee.getEmployeeId()).collect(Collectors.toList());
		 * System.out.println("EmployeeId where age lessthan 30");
		 * System.out.println(lists);
		 * 
		 * Map<Object, Long> map = new TreeMap<Object, Long>();
		 * 
		 * map = employeeSorted.stream().collect(Collectors.groupingBy(Employee::
		 * getDepartment, Collectors.counting()));
		 * System.out.println("Employees in each Department"); System.out.println(map);
		 * Map<String, Double> salary = employeeSorted.stream().collect(
		 * Collectors.groupingBy(Employee::getDepartment,
		 * Collectors.averagingDouble(Employee::getSalary)));
		 * 
		 * System.out.println("Average salary based on department");
		 * System.out.println(salary);
		 * 
		 * Map<String, Double> age = employeeSorted.stream().collect(
		 * Collectors.groupingBy(Employee::getDepartment,
		 * Collectors.averagingInt(Employee::getEmployeeAge)));
		 * System.out.println("Average age based on department");
		 * System.out.println(age);
		 * 
		 * List<String> totalEmp = employeeSorted.stream()
		 * .collect(Collectors.groupingBy(Employee::getDepartment,
		 * Collectors.counting())).entrySet().stream() .filter(value -> value.getValue()
		 * > 2).map(Map.Entry::getKey).collect(Collectors.toList());
		 * System.out.println("Departments of count greaterthan 2");
		 * System.out.println(totalEmp); List<String> emp =
		 * employeeSorted.stream().filter(employee ->
		 * employee.getEmployeeName().startsWith("s"))
		 * .map(Employee::getEmployeeName).collect(Collectors.toList());
		 * 
		 * System.out.println("Employee name starting with s"); System.out.println(emp);
		 * Map<String, Long> sort =
		 * employeeSorted.stream().sorted(Comparator.comparing(Employee::getDepartment))
		 * .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new,
		 * Collectors.counting())); System.out.println(sort); }
		 */

	}

	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

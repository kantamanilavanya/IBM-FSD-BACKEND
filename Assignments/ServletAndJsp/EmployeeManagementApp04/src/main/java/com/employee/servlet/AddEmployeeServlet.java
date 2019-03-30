package com.employee.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.management.Employee;
import com.employee.management.EmployeeServiceImpl;

public class AddEmployeeServlet extends HttpServlet {
	EmployeeServiceImpl employeeService =new EmployeeServiceImpl();


	public void init() {
		System.out.println("Employee Servlet Initialized");
		
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Calling doGet Method");
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		//System.out.println(session.getId());

		//String id = request.getParameter("employeeId");
		

		String firstName = request.getParameter("employeeName");
		String designation = request.getParameter("designation");
		String department = request.getParameter("department");
		String salary=request.getParameter("salary");
		Double sal=Double.parseDouble(salary);
		String gender = request.getParameter("gender");
		String city=request.getParameter("city");
		String emailId=request.getParameter("emailId");
		
		String date=request.getParameter("DOB");
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");

		LocalDateTime time = LocalDateTime.now();
		LocalDate localDate = time.toLocalDate();

		LocalDate ageDate = LocalDate.parse(date, format);
		Period period = Period.between(ageDate, localDate);
		int localDate1 = period.getYears();
		int age=localDate1;
		//request.setAttribute("age", date);
		/*
		 * session.setAttribute("id", id); session.setAttribute("userName", firstName);
		 * session.setAttribute("lastName", lastName); session.setAttribute("age", age);
		 * session.setAttribute("email", email);
		 * 
		 * session.setAttribute("gender", gender); session.setAttribute("city", city);
		 */
		Employee emp=new Employee(firstName,date,age,gender,city,emailId,designation,department,sal);
		try {
			employeeService.addEmployee(emp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("listEmployee.jsp");
		

		

	}

}

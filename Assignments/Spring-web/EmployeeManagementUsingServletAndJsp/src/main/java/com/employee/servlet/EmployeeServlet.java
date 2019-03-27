package com.employee.servlet;

import java.io.IOException;

import java.io.PrintWriter;
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

public class EmployeeServlet extends HttpServlet {

	public void init() {
		System.out.println("Employee Servlet Initialized");
		
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Calling doGet Method");
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());

		String id = request.getParameter("employeeId");

		String firstName = request.getParameter("employeeFirstName");
		String lastName = request.getParameter("employeeLastName");
		String password = request.getParameter("password");
		String email=request.getParameter("email");
		String gender = request.getParameter("gender");
		String date=request.getParameter("DOB");
		String city = request.getParameter("city");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");

		LocalDateTime time = LocalDateTime.now();
		LocalDate localDate = time.toLocalDate();

		LocalDate ageDate = LocalDate.parse(date, format);
		Period period = Period.between(ageDate, localDate);
		int localDate1 = period.getYears();
		int age=localDate1;
		session.setAttribute("id", id);
		session.setAttribute("userName", firstName);
		session.setAttribute("lastName", lastName);
		session.setAttribute("age", age);
		session.setAttribute("email", email);
		session.setAttribute("password", password);
		
		session.setAttribute("gender", gender);
		session.setAttribute("city", city);
		response.setContentType("text/html");
		response.sendRedirect("data.jsp");

		

	}

}

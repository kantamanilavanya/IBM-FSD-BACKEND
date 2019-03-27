package com.employee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeServlet extends HttpServlet {

	public void init() {
		System.out.println("Employee Servlet Initialized");
		ServletConfig config=getServletConfig();
		System.out.println("Servlet Config");
		Enumeration<String> configNames=config.getInitParameterNames();
		while(configNames.hasMoreElements()) {
			String params=configNames.nextElement();
			System.out.println("Parameters"+config.getInitParameter(params));
		}
		
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
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		session.setAttribute("userName", firstName);
		session.setAttribute("password", password);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html><body>");
		out.println("<h1>Added succesfully</h1>");
		out.println("<h3>Employee Id: " + id + "</h3>");
		out.println("<h3>Employee firstName: " + firstName + "</h3>");
		out.println("<h3>Employee lastName: " + lastName + "</h3>");
		out.println("<h3>Employee gender: " + gender + "</h3>");
		out.println("<h3>Employee city: " + city + "</h3>");

		out.println("</body></html>");

	}

}

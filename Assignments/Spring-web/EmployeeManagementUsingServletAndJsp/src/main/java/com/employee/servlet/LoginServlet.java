package com.employee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.management.Employee;
import com.employee.management.EmployeeServiceImpl;

public class LoginServlet extends HttpServlet {
	
	Employee employee=new Employee();
	EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
	
	
	public void init() {
		System.out.println("Employee Servlet Initialized");
		ServletContext context=getServletContext();
		Enumeration<String> con=context.getInitParameterNames();
		while(con.hasMoreElements()) {
			String params=con.nextElement();
			System.out.println("Context Params: "+context.getInitParameter(params));
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Calling doGet Method");
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		String passwords=request.getParameter("password");
		String userName=request.getParameter("userName");
		PrintWriter out=response.getWriter();
		HttpSession session =request.getSession();
		String userName1=(String) session.getAttribute("userName");
		String pass=(String) session.getAttribute("password");
		
		if(userName.equals(userName1)&& passwords.equals(pass)) {
			
			
			response.sendRedirect("success.jsp");
			
		}
		else {
			response.sendRedirect("error.jsp");
		}
		
		
		
		

	}


}

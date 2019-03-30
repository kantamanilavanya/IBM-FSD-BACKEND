package com.employee.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.management.Employee;
import com.employee.management.EmployeeServiceImpl;

public class ListEmployeeServlet extends HttpServlet {
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
		try {
		List<Employee>list=employeeService.listEmployee();
		request.setAttribute("employeeDetails",list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		response.sendRedirect("listEmployee.jsp");
		

		

	}

}

package com.employee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
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
			out.println("<!DOCTYPE html>");
			out.println("<html><body>");
			out.println("<h1>Authenticated succesfully</h1>");
			out.println("<h3>Employee firstName: "+userName+"</h3>");
			
			out.println("</body></html>");
			//RequestDispatcher rd=request.getRequestDispatcher("register.do");
			//rd.forward(request, response);
			response.sendRedirect("http://localhost:8080/ServletFormExample/employeeLanding.html");
		}
		else {
			out.println("<h1>User is Not Authenticated </h1>");
		}
		
		
		
		

	}


}

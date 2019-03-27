package com.examples.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	//called when getting loaded into container
	public void init() {
		System.out.println("HelloWorld Servlet Initilaized");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("doGet Method got called");
		doPost(request,response);
	}
	//called for every HTTP request
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		System.out.println("Servlet service method invoked ");
		System.out.println("Context Path:"+request.getContextPath());
		System.out.println(request.getRemoteHost());
		Enumeration<String> headerNames=request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String headerName=headerNames.nextElement();
			System.out.println("header Name"+request.getHeader(headerName));
		}
		response.setContentType("text/html");
		//Auto refresh every 5 seconds
		//response.setIntHeader("refresh", 5);
		//output stream to write data into HTTP response 
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html><body>");
		out.println("<h1>Hello World</h1>");
		out.println("<h2>Welcome Lavanya<h2>");
		out.println("<h3>Current Time:"+LocalDate.now()+"</h3>");
		out.println("</body></html>");
		
		
	}

	/*
	 * called when getting unloaded from web container we can specift clean up logic
	 * here
	 */
	public void destroy() {
		System.out.println("HelloWorld Servlet destroyed");
	}
	
	

}

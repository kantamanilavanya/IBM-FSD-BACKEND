package com.example.java.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener{
	private static int currentUserCount=0;
	private static int totalUsers=0;
	
	
	
	public void sessionCreated(HttpSessionEvent se) {
		ServletContext context=se.getSession().getServletContext();
		currentUserCount=(Integer) context.getAttribute("currentUsers");
		context.setAttribute("currentUsers", currentUserCount++);
		
	}
	
	public void  sessionDestroyed(HttpSessionEvent se) {
		ServletContext context=se.getSession().getServletContext();
		 currentUserCount=(Integer) context.getAttribute("currentUsers");
		context.setAttribute("currentUsers", currentUserCount--);
		System.out.println(currentUserCount);
		
	}

}

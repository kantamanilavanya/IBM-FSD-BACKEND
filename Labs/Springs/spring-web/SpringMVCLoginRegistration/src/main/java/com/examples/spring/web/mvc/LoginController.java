package com.examples.spring.web.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@Scope("session")
@SessionAttributes({"user"})
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET) // Handler Mapping
	public String home(Model model) {

		return "index";
	}
	
	/*
	 * @RequestMapping(value = "/registers", method = RequestMethod.POST) // Handler
	 * Mapping public String registration(Model model, HttpServletRequest request,
	 * 
	 * @RequestParam("employeeFirstName") String
	 * employeeFirstName, @RequestParam("email") String email,
	 * 
	 * @RequestParam("password") String password,
	 * 
	 * @RequestParam("gender") String gender,
	 * 
	 * @RequestParam("city") String city,
	 * 
	 * @RequestParam("DOB") String DOB) {
	 * 
	 * HttpSession session = request.getSession(); session.setAttribute("userName",
	 * employeeFirstName); session.setAttribute("password", password);
	 * model.addAttribute("name", employeeFirstName); model.addAttribute("email",
	 * email); model.addAttribute("gender", gender); model.addAttribute("city",
	 * city); model.addAttribute("DOB", DOB);
	 * 
	 * 
	 * return "home"; }
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.GET) // Handler
	 * Mapping public String register(Model model) {
	 * 
	 * return "register"; }
	 */
	@RequestMapping(value = "/logins", method = RequestMethod.POST) // Handler Mapping
	public String login(Model model, HttpServletRequest request, @RequestParam("userName") String employeeFirstName,
			@RequestParam("password") String password) {
		HttpSession session = request.getSession();
		String userName1 = (String) session.getAttribute("userName");
		String pass = (String) session.getAttribute("password");
		if (employeeFirstName.equals(userName1) && password.equals(pass)) {
			model.addAttribute("name", employeeFirstName);

			return "success";
		} else
			return "error";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET) // Handler Mapping
	public String login(Model model) {

		return "login";
	}

}

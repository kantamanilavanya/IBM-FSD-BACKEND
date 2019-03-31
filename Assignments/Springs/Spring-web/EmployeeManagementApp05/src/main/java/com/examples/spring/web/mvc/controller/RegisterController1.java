package com.examples.spring.web.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.examples.spring.web.mvc.exception.LoginException;
import com.examples.spring.web.mvc.model.Login;
import com.examples.spring.web.mvc.model.Register;

/**
 * Handles requests for the application login page.
 */
@Controller
@RequestMapping(value = {"/registers"})
public class RegisterController1 {
	
	@RequestMapping(value = "/registerdata", method = RequestMethod.GET)	
	public ModelAndView register(Model model) {
		return new ModelAndView("register");

		//return new ModelAndView("register", "command", new Register());
	}
	
	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	@ExceptionHandler(LoginException.class)
	public ModelAndView authenticate(@ModelAttribute Register register, Model model, HttpSession session) {
		
		
			model.addAttribute("userName", "admin");
			return new ModelAndView("redirect:/employee/list");
		
	}
	
	public List<Login> getUsers()
	{
		List<Login> users = new ArrayList<Login>();
		users.add(new Login("admin","admin@123"));
		users.add(new Login("manager", "manager@123"));
		users.add(new Login("user", "user@123"));
	
		return users;
	}
	
	
	@RequestMapping(value = "/logoutUser", method = RequestMethod.GET)
	public String logoutUser(HttpSession session, SessionStatus sessionStatus)
	{		
		sessionStatus.setComplete();
//		session.removeAttribute("userName");		
//		session.invalidate();
		return "redirect:/";
	}
}
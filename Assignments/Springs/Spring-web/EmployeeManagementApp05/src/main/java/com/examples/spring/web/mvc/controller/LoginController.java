package com.examples.spring.web.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.examples.spring.web.mvc.exception.LoginException;
import com.examples.spring.web.mvc.model.Login;
import com.examples.spring.web.mvc.model.Register;
import com.examples.spring.web.mvc.service.RegisterService;

/**
 * Handles requests for the application login page.
 */
@Controller
@RequestMapping(value= {"/loginController"})

public class LoginController {
	@Autowired 
	  RegisterService regService;
	@Autowired
	  @Qualifier("loginValidator")
	  private Validator validator;
	  
	  
	 
	  
	  @InitBinder private void initBinder(WebDataBinder binder) {
	  binder.setValidator(validator); }
	
	  @GetMapping("/login")
	  //@RequestMapping(value = "/login", method = RequestMethod.GET)	
	public ModelAndView login(Model model) {

		return new ModelAndView("login");
		//return new ModelAndView("register", "command", new Login());
	}
	@ModelAttribute("login")
	public Login createLoginModel() {
		return new Login();
	}
	
	//(value = "/authenticate", method = RequestMethod.POST)
	@PostMapping("/authenticate")
	//@ExceptionHandler(LoginException.class)
	public ModelAndView authenticate(@ModelAttribute("login") Login login, BindingResult bindingResult,Model model, HttpSession session) {
		
		Map<String, Register> user= regService.getMap();
		for(Register  t:user.values())
		{
			if(login.getUserName().equals(t.getName()) && login.getPassword().equals(t.getPassword())){
				return new ModelAndView("redirect:/employee/list");
			}
		}
		
		return new ModelAndView("redirect:/loginController/login");
		
	}
	
	public List<Login> getUsers()
	{
		List<Login> users = new ArrayList<Login>();
		users.add(new Login("admin","admin@123"));
		users.add(new Login("manager", "manager@123"));
		users.add(new Login("user", "user@123"));
	
		return users;
	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session, SessionStatus sessionStatus)
	{		
		sessionStatus.setComplete();
//		session.removeAttribute("userName");		
//		session.invalidate();
		return "redirect:/";
	}
}
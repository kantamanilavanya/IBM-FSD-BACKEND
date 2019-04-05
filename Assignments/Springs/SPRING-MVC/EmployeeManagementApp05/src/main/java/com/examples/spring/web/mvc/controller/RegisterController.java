package com.examples.spring.web.mvc.controller;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import org.springframework.web.servlet.ModelAndView;
import com.examples.spring.web.mvc.exception.LoginException;
import com.examples.spring.web.mvc.model.Login;
import com.examples.spring.web.mvc.model.Register;
import com.examples.spring.web.mvc.service.EmployeeService;
import com.examples.spring.web.mvc.service.RegisterService;

@Controller
@RequestMapping(value= {"/registerController"})

@SessionAttributes("userList")

public class RegisterController {
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	
	  @Autowired
	  @Qualifier("registerValidator")
	  private Validator validator;
	  
	  @Autowired 
	  RegisterService regService;
	 
	  
	
	  @InitBinder private void initBinder(WebDataBinder binder) {
	  binder.setValidator(validator); }
	 
	 
	
	//@RequestMapping(value = "/register", method = RequestMethod.GET)	
	@GetMapping("/registerp")
	public ModelAndView register(Model model) {
		model.addAttribute("register", new Register());

		return new ModelAndView("register","command",new Register());
		//return "register";
	}
	@ModelAttribute("genderOptions")
	public Map<String, String> getGenderOptions() {
		Map<String, String> genderOptions = new LinkedHashMap<String, String>();
		genderOptions.put("M", "Male");
		genderOptions.put("F", "Female");
		return genderOptions;
	}

	@ModelAttribute("countries")
	public Map<String, String> getCountries() {
		Map<String, String> getCountries = new LinkedHashMap<String, String>();
		getCountries.put("India", "India");
		getCountries.put("USA", "USA");
		getCountries.put("UK", "UK");
		getCountries.put("China", "China");
		return getCountries;
	}
	@ModelAttribute("register")
	public Register createRegisterModel() {
		return new Register();
	}

	
	
	@PostMapping("/register")
	
	public ModelAndView authenticate( @Valid Register register,BindingResult bindingResult, Model model, HttpSession session) {
		
		
		
		
	if (bindingResult.hasErrors()) {
		logger.info("Returning custSave.jsp page");
		return new ModelAndView("redirect:/registerController/registerp");
	}
	    regService.add(register);
		return new ModelAndView("redirect:/");
		
		
	}
	
	public List<Login> getUsers()
	{
		List<Login> users = new ArrayList<Login>();
		users.add(new Login("admin","admin@123"));
		users.add(new Login("manager", "manager@123"));
		users.add(new Login("user", "user@123"));
	
		return users;
	}
	
	
	
}
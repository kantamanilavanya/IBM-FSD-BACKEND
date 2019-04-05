package com.examples.spring.web.mvc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.examples.spring.web.mvc.model.Employee;
import com.examples.spring.web.mvc.model.Login;
import com.examples.spring.web.mvc.model.Register;

@Component(value = "loginValidator")
public class LoginValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		return Login.class.isAssignableFrom(arg0);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "name.required", "Field name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required", "Field password is required.");
		
	
	}

}

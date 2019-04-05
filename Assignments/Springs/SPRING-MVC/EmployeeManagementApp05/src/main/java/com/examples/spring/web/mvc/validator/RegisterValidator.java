package com.examples.spring.web.mvc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.examples.spring.web.mvc.model.Employee;
import com.examples.spring.web.mvc.model.Register;

@Component(value = "registerValidator")
public class RegisterValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		return Register.class.isAssignableFrom(arg0);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required", "Field name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "age.required", "Field age is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "gender.required", "Field gender is required.");
		
		Register employee = (Register) target;
		if(employee.getAge() != null && employee.getAge() < 0)
		{
			errors.rejectValue("age", "age.negative", "Age should not be negative value.");
		}	
		
	}

}

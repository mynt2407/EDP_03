package com.vti.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.vti.service.GroupService;

public class NameNotExistValidator implements ConstraintValidator<NameNotExist, String>{
	
	private GroupService service;

	@Override 
	public void initialize(NameNotExist constraintAnnotation) {
		service = new GroupService();
	}
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
	if (value == null ) {
		return false;
	}
		return service.isGroupExistsByName(value);
	}

}

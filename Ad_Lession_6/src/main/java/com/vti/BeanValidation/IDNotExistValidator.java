package com.vti.BeanValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.vti.Service.AccountService;

public class IDNotExistValidator implements ConstraintValidator<IDNotExist, Short> {

	private AccountService service;

	@Override
	public void initialize(IDNotExist constraintAnnotation) {
		service = new AccountService();
	}

	//check xem email nhap vao co null khong. Neu khong null thi cho xuong server xu ly tiep
	@Override
	public boolean isValid(Short value, ConstraintValidatorContext context) {
		if (value == null|| service.isAccountExistById(value) == true) {
			return true;
		}
		return !service.isAccountExistById(value);

	}

}

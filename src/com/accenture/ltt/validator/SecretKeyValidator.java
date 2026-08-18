package com.accenture.ltt.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.accenture.ltt.business.bean.EmployeeBean;

public class SecretKeyValidator implements ConstraintValidator<SecretKeyValidatorVal, Object>{
																//name of the related annotation
	@Override
	public void initialize(SecretKeyValidatorVal arg0) { //name of the related annotation
	}
	@Override
	public boolean isValid(Object targetObject, ConstraintValidatorContext arg1) {
		//Cross Field Validation Logic
		EmployeeBean employeeBean =(EmployeeBean)targetObject;
		if(employeeBean.getPassword().equals(employeeBean.getConfirmPassword())){
			return true;
		}else{
			return false;
		}
	}
}

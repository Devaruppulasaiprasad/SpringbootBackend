package com.accenture.ltt.service;

import org.springframework.stereotype.Service;

import com.accenture.ltt.business.bean.EmployeeBean;
import com.accenture.ltt.exceptions.InvalidCountryNameAndAgeCombinationException;

@Service
public class EmployeeService {
	
	
	//from India(1) Employees age should be greater 23
	//from US(2)    Employees age should be greater 28
	//from US(3)    Employees age should be greater 30
	
	public void validateCountryAndAge (EmployeeBean employeeBean) throws Exception{
		
		String countryCode= employeeBean.getCountry();
		Integer age  =  employeeBean.getAge(); 
		int flag=0;
		if(countryCode.equals("1") && age<23){
			flag=1;
		}
		else if(countryCode.equals("2") && age<28){
			flag=1;
		}else if(countryCode.equals("3") && age<30){
			flag=1;
		}
		
		if(flag==1){
			throw new InvalidCountryNameAndAgeCombinationException();
		}
	}

}

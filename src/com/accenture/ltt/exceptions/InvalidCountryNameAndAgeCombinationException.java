package com.accenture.ltt.exceptions;

@SuppressWarnings("serial")
public class InvalidCountryNameAndAgeCombinationException extends Exception{
	
	public InvalidCountryNameAndAgeCombinationException(){
		super("Invalid Country and Age combination");
	}
	

}

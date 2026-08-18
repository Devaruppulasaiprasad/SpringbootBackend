package com.accenture.ltt.web.controlleradvice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.ltt.exceptions.InvalidCountryNameAndAgeCombinationException;

@ControllerAdvice
public class GlobalExceptionHandlerAdvice {

	public  GlobalExceptionHandlerAdvice() {
		System.out.println("****GlobalExceptionHandler****");
	}
	
	@ExceptionHandler(value=InvalidCountryNameAndAgeCombinationException.class)
	public ModelAndView handleInvalidCountryNameAndAgeCombinationException(InvalidCountryNameAndAgeCombinationException exception){
		
		ModelAndView  modelAndView = new ModelAndView();
		modelAndView.setViewName("ExceptionHandlerPage");
		modelAndView.addObject("message", exception.getMessage());
		modelAndView.addObject("exception", exception);
		return modelAndView;
	}
	@ExceptionHandler(value=Exception.class)
	public ModelAndView handleAllExceptions(Exception exception){
		
		ModelAndView  modelAndView = new ModelAndView();
		modelAndView.setViewName("GeneralizedExceptionHandlerPage");
		modelAndView.addObject("message", exception.getMessage());
		modelAndView.addObject("exception", exception);
		return modelAndView;
	}

}
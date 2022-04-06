package controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import exception.MyException;

@ControllerAdvice
public class GlobalExceptionController {
	

	@ExceptionHandler(MyException.class)
	public ModelAndView handleUserExcep(Exception e) {
		ModelAndView mView = new ModelAndView();
		mView.addObject("exception",e);
		mView.setViewName("error");
		return mView;
	}
	
//	@ExceptionHandler({MyException.class,IllegalArgumentException.class})
//	we can have any number of exceptionhandler method here

}

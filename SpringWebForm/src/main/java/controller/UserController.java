package controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dto.User;
import exception.MyException;

@Controller
//@RequestMapping(value = "/all")
public class UserController {

	@RequestMapping(value = "/registeruser", method = RequestMethod.GET)
	public String regUser(Model model) {
		model.addAttribute(new User());
		return "registerUser";
	}
	
	@RequestMapping(value = "/showreguser" , method = RequestMethod.POST)
	public String showUser(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "registerUser";
		}
		checkEmails(user);
		model.addAttribute("user",user);
		return "showreguser";
	}
	
//	@ExceptionHandler(MyException.class)
//	public ModelAndView handleUserExcep(Exception e) {
//		ModelAndView mView = new ModelAndView();
//		mView.addObject("exception",e);
//		mView.setViewName("error");
//		return mView;
//	}
	
	private void checkEmails(User u) {
		List<String> el = Arrays.asList("abc@def.com","ghi@jkl.com","mno@pqr.com");
		if(el.contains(u.getEmail())) {
			throw new MyException("Email already exist try with another one.");
		}
	}

}

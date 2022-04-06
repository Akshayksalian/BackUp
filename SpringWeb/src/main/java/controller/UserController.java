package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dto.User;

@Controller
//@RequestMapping(value = "/all")
public class UserController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String registerUser(Model model) {
		model.addAttribute(new User());
		model.addAttribute("message","MVC Example with dynamic Url");
		return "user";
	}
	
	@RequestMapping(value = "/showUser" , method = RequestMethod.POST)
	public String showUser(@ModelAttribute("user") User user,Model model) {
		System.out.println(" "+user.getFirstName());
		model.addAttribute("user",user);
//		model.addAttribute("firstName",user.getFirstName());
//		model.addAttribute("lastName",user.getLastName());
		return "showuser";
	}
	
	@RequestMapping(value = "/finduser", method = RequestMethod.GET)
	public String showHome(Model model) {
		model.addAttribute("message","Dynamic Url Example");
		return "finduser";
	}
	
	@RequestMapping(value = "/user/{userId}",method = RequestMethod.POST)
	public String getUserById(@PathVariable("userId") int userId,Model model) {
//		 getting dummy method for id had has been created generaly we get id from db.
		model.addAttribute("user",findUserById(userId));
		return "showuser";
	}

//	dummy method to get userId
	private User findUserById(int userId) {
		System.out.println("User Id "+userId);
		User u = new User();
		u.setId(userId);
		u.setFirstName("Akshay");
		u.setLastName("k Salian");
		return u;
	}
	
//	http://localhost:8080/SpringWeb/displayUser?fn=akshy&ln=ksalian
	@RequestMapping(value = "/displayUser",method = RequestMethod.GET)
	public String showUser(@RequestParam("fn") String firstName,
							@RequestParam("ln") String lastName,Model model) {
		User u = new User();
		u.setFirstName(firstName);
		u.setLastName(lastName);
		model.addAttribute("user",u);
		return "showuser";
	}
}

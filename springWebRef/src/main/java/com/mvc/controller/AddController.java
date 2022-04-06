package com.mvc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping(value="/add")
	public String add() {
		return "add";
	}
	
	@RequestMapping(value ="/result")
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j) {
		
		AddService as = new AddService();
		int k =as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("ans",k);
		
		return mv;
		
	}
	


}

package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping("home")
	public ModelAndView show(Alien obj)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("alien", obj);	
		mv.setViewName("home");
		return mv;
	}
}

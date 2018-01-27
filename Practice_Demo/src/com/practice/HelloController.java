package com.practice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;



  @Controller
    public class HelloController {
	@RequestMapping("/welcome")
	public ModelAndView getHello() {
		
		ModelAndView modelandview =new ModelAndView("HelloPage");
		modelandview.addObject("welcomemessage","Hi User has  successfully deployed this web site on local host using annotation");
		
		return modelandview;
	}
	
	 

}

package com.practice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;




    public class HelloController extends AbstractController{
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView modelandview =new ModelAndView("HelloPage");
		modelandview.addObject("welcomemessage","Hi User i am successfully deployed this web site on local host");
		
		return modelandview;
	}
	
	 

}

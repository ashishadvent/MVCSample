package com.practice;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




  @Controller
  @RequestMapping("/greet")
    public class HelloController {
	@RequestMapping("/welcome")
	public ModelAndView getHello() {
		
		ModelAndView modelandview =new ModelAndView("HelloPage");
		modelandview.addObject("welcomemessage","Hi User has now  successfully deployed this web site on local host using annotation");
		
		return modelandview;
	}
	@RequestMapping("/hi")
	public ModelAndView getHi() {
		
		ModelAndView modelandview =new ModelAndView("HelloPage");
		modelandview.addObject("welcomemessage","New Message for welcome SUer ");
		
		return modelandview;
	
	}

}

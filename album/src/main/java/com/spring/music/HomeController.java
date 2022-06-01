package com.spring.music;


import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	
	
		System.out.println("home");
		
		
		
		return "index";
	}
	@RequestMapping(value ="/about", method = RequestMethod.GET)
	public String about(Model model) {
		
		return "about";
		
	}
	
	@RequestMapping(value ="/shop", method = RequestMethod.GET)
	public String shop(Model model) {
		
		return "shop";
		
	}
	
	
}

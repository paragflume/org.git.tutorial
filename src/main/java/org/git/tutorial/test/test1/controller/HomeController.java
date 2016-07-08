package org.git.tutorial.test.test1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//second comment
//third comment
//fouth comment
@Controller
public class HomeController {
	
	private int counter = 0;
	
	@RequestMapping(value = { "/home/homepage.html" }, method = { RequestMethod.GET })
	public String homePage(HttpServletRequest req) {
		return "homepage";
	}

	@RequestMapping(value = { "admin/homepage.html" }, method = { RequestMethod.GET })
	public String adminPage(HttpServletRequest req) {
		// working fine..
		return "adminpage";
	}
	
	@RequestMapping(value = { "admin/increment.html" }, method = { RequestMethod.GET })
	public String adminPage(HttpServletRequest req) {
		counter++;
		return "adminpage";
	}

}

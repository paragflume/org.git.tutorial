package org.git.tutorial.test.test1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private Integer counter = 0;
	
	@RequestMapping(value = { "admin/homepage.html" }, method = { RequestMethod.GET })
	public String adminPage(HttpServletRequest req) {
		return "adminpage";
	}
	
	@RequestMapping(value = { "/home/homepage.html" }, method = { RequestMethod.GET })
	public String homePage(HttpServletRequest req) {
		return "home/homepage";
	}
	
	@RequestMapping(value = { "admin/incrementpage.html" }, method = { RequestMethod.GET })
	public String incrementPage(HttpServletRequest req) {
		counter++;
		return "pages/increment";
	}
	
	@RequestMapping(value = { "admin/decremaentpage.html" }, method = { RequestMethod.GET })
	public String decrementPage(HttpServletRequest req) {
		counter--;
		req.setAttribute("counter", counter);
		return "pages/decrement";
	}

	@RequestMapping(value = { "admin/profilepage.html" }, method = { RequestMethod.GET })
	public String profilePage(HttpServletRequest req) {
		return "admin/profliepage";
	}

}

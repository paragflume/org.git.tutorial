package org.git.tutorial.test.test1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//second comment
//third comment
//fouth comment
// change tag 1
@Controller
public class HomeController {

	@RequestMapping(value = { "/home/homepage.html" }, method = { RequestMethod.GET })
	public String homePage(HttpServletRequest req) {
		return "homepage";
	}

	@RequestMapping(value = { "admin/homepage.html" }, method = { RequestMethod.GET })
	public String adminPage(HttpServletRequest req) {
		return "adminpage";
	}

	public int add(int a,int b){
		return 0;
	}

	public int  subtruct(int a, int b){
		return a-b;
	}

	public int multiply(int a, int b){
		return 0;
	}

	public int divide(int a, int b){
		return 0;
	}

}

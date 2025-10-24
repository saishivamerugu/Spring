package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	 @RequestMapping("/hi") 
	public String hi() {
		return "home";
	} 
	 
	 // we has to understand the difference between them ...
	 
	 @RequestMapping("/home")
	 @ResponseBody 
		public String hello() {
			return "home";
		}
	 
	 @RequestMapping("/data")
	 public String home(Model model) {
		 model.addAttribute("name","sai");
	 	 return "home"; 
	 }
	 
	 @PostMapping("/signup")
	 public String signUp(Model model, HttpServletRequest http) {
		 String email = (String) http.getParameter("email");
		 String password = (String) http.getParameter("password");
		 
		 model.addAttribute("email",email);
		 model.addAttribute("password",password);
		 
		 return "data";
	 }
}

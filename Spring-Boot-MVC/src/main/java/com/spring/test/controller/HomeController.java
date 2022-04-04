package com.spring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/123")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("Detected");
		return "test.html";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home");
		return "home.html";
	}
	
	
	@RequestMapping("/jsp")
	public String getJSP() {
		System.out.println("This is JSP");
		return "spring.jsp";
	}
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	
}

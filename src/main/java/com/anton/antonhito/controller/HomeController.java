package com.anton.antonhito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showForm() {
		System.out.println("Controller");
		return "login";
	}
	
	@GetMapping("/showUsers")
	public String showUsers() {
		System.out.println("Controller");
		return "showUsers";
	}
}

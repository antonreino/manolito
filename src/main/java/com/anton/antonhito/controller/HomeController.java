package com.anton.antonhito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.anton.antonhito.entity.User;
import com.anton.antonhito.repository.UserRepository;

@Controller
public class HomeController {

	@Autowired(required=true)
	private UserRepository userService;

//	@GetMapping("/")
//	public String showForm() {
//		System.out.println("Controller");
//		return "login";
//	}

	@GetMapping("/show")
	public String showUsers(Model modelo) {
		List<User> userList = userService.findAll();
		modelo.addAttribute("mensaje","hola desde thymeleaf");
	    return "users";
	}
}

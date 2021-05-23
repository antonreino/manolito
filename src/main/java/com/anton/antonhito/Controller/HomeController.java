package com.anton.antonhito.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/login")
    public String showForm() {
        return "login";
    }
	
	
}

package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "This is my First Spring MVC Example | Index");
		return "index";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("message", "This is my First Spring MVC Example | About");
		return "about";
	}
	
}

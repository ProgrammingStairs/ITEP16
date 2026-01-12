package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("message", "This is an example of Spring MVC");
		return "index";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
}

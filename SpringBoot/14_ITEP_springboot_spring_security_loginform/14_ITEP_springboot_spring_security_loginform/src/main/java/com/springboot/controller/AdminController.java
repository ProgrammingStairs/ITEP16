package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/")
	public String admin() {
		return "admin";
	}

	@GetMapping("/home")
	public String adminHome() {
		return "adminHome";
	}
}

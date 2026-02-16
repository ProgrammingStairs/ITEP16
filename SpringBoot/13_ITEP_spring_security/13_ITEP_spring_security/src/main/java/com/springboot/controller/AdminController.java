package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/")
	public String admin() {
		return "Welcome to Admin Panel";
	}

	@GetMapping("/home")
	public String adminHome() {
		return "Welcome to Admin Home";
	}

}

package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@PostMapping("/register")
	public String register() {
		return null;
	}

	@GetMapping("/login")
	public String login() {
		return null;
	}

}

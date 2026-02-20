package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	/*
	 on postman :
	 method : get
	 url : http://localhost:8080/admin/home
	 Headers -> add key by name Authorization and set token in its value by writing Bearer<space>token  
	 */
	
	
	@GetMapping("/home")
	public String adminHome() {
		return "<h2>Welcome to Admin Home</h2>";
	}
}

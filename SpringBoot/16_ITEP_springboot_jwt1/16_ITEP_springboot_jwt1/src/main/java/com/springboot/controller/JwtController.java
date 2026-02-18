package com.springboot.controller;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.JwtService;

@RestController
public class JwtController {
	private JwtService jwtService;
	public JwtController(JwtService jwtService) {
		this.jwtService = jwtService;
	}
	@GetMapping("/")
	public String home() {
		return "<h2>Welcome to JWT concept</h2>";
	}
	
	@PostMapping("/generateToken")
	public String generateToken(@RequestBody String username) {
		return jwtService.generateToken(username);
	}
	
	// you need to copy the above token and then click on Headers in postman ---> add key Authorization and set its value by Writing Bearer<space>received_token
	
	@GetMapping("/validateToken")
	public String validateToken(@RequestHeader("Authorization") String tk) {
//		System.out.println("Received Token : "+tk);
		String token = tk.substring(7);
		String str = jwtService.validateToken(token) ? "Valid Token" : "Invalid Token";
		return str;
	}
}

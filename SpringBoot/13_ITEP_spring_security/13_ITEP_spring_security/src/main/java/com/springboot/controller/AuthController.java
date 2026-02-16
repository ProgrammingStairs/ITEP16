package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@GetMapping("/")
	public String home() {
		return "<h2>Hit : </h2> http://localhost:8080/admin/ <br> http://localhost:8080/admin/home <br> http://localhost:8080/user/ <br> http://localhost:8080/user/home <br>";
	}
}


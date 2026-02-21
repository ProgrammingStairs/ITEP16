package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;
import com.springboot.service.UserService;

@RestController
public class UserController {
	
	private UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/")
	public String home() {
		return "<h2>Welcome to Home Page</h2>";
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/findUserById/{id}")
	public User findUserById(@PathVariable("id") int id) {
		return userService.findUser(id);
	}
}

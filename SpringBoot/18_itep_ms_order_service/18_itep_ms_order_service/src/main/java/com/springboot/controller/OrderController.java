package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.User;

@RestController
public class OrderController {
	private OrderService orderService;
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@GetMapping("/")
	public String home() {
		return "<h2>Welcome to Home</h2>";
	}
	
	@GetMapping("/getUserByProductId/{pid}")
	public User getUser(@PathVariable("pid") int pid) {
		return orderService.getUser(pid);
	}
}	

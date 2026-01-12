package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentPortalController {
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("message", "This is an example of Spring MVC | Student Portal");
		return "student";
	}
	
}

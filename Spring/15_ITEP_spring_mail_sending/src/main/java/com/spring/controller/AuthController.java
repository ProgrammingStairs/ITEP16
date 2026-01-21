package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.entity.User;
import com.spring.service.MailService;
import com.spring.service.UserService;
import com.spring.service.VerificationTokenService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AuthController {

	private UserService userService;
	private VerificationTokenService verificationTokenService;
	private MailService mailService;
	
	public AuthController(UserService userService,VerificationTokenService verificationTokenService,MailService mailService) {
		this.userService = userService;
		this.verificationTokenService=verificationTokenService;
		this.mailService=mailService;
	}
	
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@PostMapping("/register")
	public String addUser(@ModelAttribute User user,Model model,HttpServletRequest request) {
		try {
			User userObj = userService.addUser(user);
			String token = verificationTokenService.createVerificationToken(userObj);
			String link = request.getRequestURL().toString().replace("register", "verify?token="+token);
			mailService.sendMail(userObj.getEmail(), "Verification Mail", "Hello "+userObj.getEmail()+",<br> This is verification mail, aand you need to verify yourself by clicking on the link given below : <br><br>"+link);
			model.addAttribute("message", "Mail Sent Successfully, Please verify");	
		}catch(Exception e) {
			System.out.println("Exception : "+e);
			model.addAttribute("message", "Something went wrong");	
		}
		return "login";
	}
}
















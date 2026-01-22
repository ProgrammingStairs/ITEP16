package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.entity.User;
import com.spring.entity.VerificationToken;
import com.spring.service.MailService;
import com.spring.service.UserService;
import com.spring.service.VerificationTokenService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

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
		//try {
			User userObj = userService.addUser(user);
			System.out.println("---------> "+userObj);
			String token = verificationTokenService.createVerificationToken(userObj);
			String link = request.getRequestURL().toString().replace("register", "verify?token="+token);
			mailService.sendMail(userObj.getEmail(), "Verification Mail", "Hello "+userObj.getEmail()+",<br> This is verification mail, aand you need to verify yourself by clicking on the link given below : <br><br>"+link);
			model.addAttribute("message", "Mail Sent Successfully, Please verify");	
//		}catch(Exception e) {
//			System.out.println("Exception : "+e);
//			model.addAttribute("message", "Please Try with Another Mail Id");	
//		}
		return "login";
	}
	
	@GetMapping("/verify")
	public String verifyByMail(@RequestParam("token") String token,Model model) {
		VerificationToken vt = verificationTokenService.findByToken(token);
		if(vt==null) {
			model.addAttribute("message", "Invalid User");
			return "failure_page";
		}
		User user = vt.getUser();
		user.setEnabled(true);
		userService.addUser(user);
		model.addAttribute("message", "Verified Successfully");
		return "login";
	}
	@PostMapping("/login")
	public String login(@RequestParam("email") String email,
						@RequestParam("password") String password,
						Model model,HttpServletRequest request) {
		User user = userService.findByEmail(email);
		if(user==null) {
			model.addAttribute("message", "Invalid User");
			return "login";
		}
		if(user!=null && !user.getPassword().equals(password)) {
			model.addAttribute("message", "Credentials Mismatched");
			return "login";			
		}
		if(!user.isEnabled()) {
			model.addAttribute("message", "Yet Not Verified | Please Verify First");
			return "login";		
		}
		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		 return "profile";
	}
	
	@GetMapping("/logout")
	public String logout(Model model,HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("email", null);
		session.invalidate();
		model.addAttribute("message", "Logout Successfull");
		return "login";
	}
}
















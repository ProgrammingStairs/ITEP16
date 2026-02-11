package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;
import com.springboot.entity.VerificationToken;
import com.springboot.service.MailService;
import com.springboot.service.UserService;
import com.springboot.service.VerificationTokenService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class AuthController {

	private UserService userService;
	private VerificationTokenService verificationTokenService;
	private MailService mailService;
	
	public AuthController(UserService userService,VerificationTokenService verificationTokenService,MailService mailService) {
		this.userService = userService;
		this.verificationTokenService=verificationTokenService;
		this.mailService=mailService;
	}
	
	@PostMapping("/register")
	public String addUser(@RequestBody User user,HttpServletRequest request) {
		//try {
			User userObj = userService.addUser(user);
			System.out.println("---------> "+userObj);
			String token = verificationTokenService.createVerificationToken(userObj);
			String link = request.getRequestURL().toString().replace("register", "verify?token="+token);
			mailService.sendMail(userObj.getEmail(), "Verification Mail", "Hello "+userObj.getEmail()+",<br> This is verification mail, aand you need to verify yourself by clicking on the link given below : <br><br>"+link);	
//		}catch(Exception e) {
//			System.out.println("Exception : "+e);
//			model.addAttribute("message", "Please Try with Another Mail Id");	
//		}
		return "Mail Sent Successfully, Please verify";
	}
	
	@GetMapping("/verify")
	public String verifyByMail(@RequestParam("token") String token) {
		VerificationToken vt = verificationTokenService.findByToken(token);
		if(vt==null) {
			return "Invalid User";
		}
		User user = vt.getUser();
		user.setEnabled(true);
		userService.addUser(user);
		return "Verified Successfully";
	}
	@PostMapping("/login")
	public String login(@RequestParam("email") String email,
						@RequestParam("password") String password,
						HttpServletRequest request) {
		User user = userService.findByEmail(email);
		if(user==null) {
			return "Invalid User";
		}
		if(user!=null && !user.getPassword().equals(password)) {
			return "Credentials Mismatched";			
		}
		if(!user.isEnabled()) {
			return "Yet Not Verified | Please Verify First";		
		}
		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		 return "Welcome "+email;
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("email", null);
		session.invalidate();
		return "Logout Successfull";
	}
}
















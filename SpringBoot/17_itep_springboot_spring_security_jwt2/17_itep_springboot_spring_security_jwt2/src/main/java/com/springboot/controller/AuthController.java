package com.springboot.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;
import com.springboot.service.JwtService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	private BCryptPasswordEncoder passwordEncoder;
	private JwtService jwtService;
	private UserRepository userRepository;
	public AuthController(BCryptPasswordEncoder passwordEncoder,UserRepository userRepository,JwtService jwtService) {
		this.passwordEncoder = passwordEncoder;
		this.userRepository = userRepository;
		this.jwtService = jwtService;
	}
	
	/*
	 on Postman : 
	 method : post
	 url : http://localhost:8080/auth/register
	 body-> raw-> json 
	 
	 {
	    "email":"andrew@gmail.com",
	    "password":"12345678",
	    "role":"ADMIN"
	 } 
	*/
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		return new ResponseEntity<String>("User Added Successfully",HttpStatus.OK);
	}

	/*
	 on Postman : 
	 method : get
	 url : http://localhost:8080/auth/login
	 body-> raw-> json 
	 
	 {
	    "email":"andrew@gmail.com",
	    "password":"12345678"
	 }
	 
	  output : 
	  {
	    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbmRyZXdAZ21haWwuY29tIiwicm9sZSI6IkFETUlOIiwiaWF0IjoxNzcxNTY1MjgwLCJleHAiOjE3NzE1NjU4ODB9.A-v--L0NLCwOrNI_Hat05HLDgMKaaJFpFbAEMaRPP5U",
	    "message": "/admin/home",
	    "role": "ADMIN"
	  }
	*/

	@GetMapping("/login")
	public Map<String,String> login(@RequestBody User user) {
		String email = user.getEmail();
		String password = user.getPassword();
		
		User userObj = userRepository.findByEmail(email).orElseThrow(()-> new RuntimeException("User Not Found"));
		
		if(!passwordEncoder.matches(password, userObj.getPassword())) {
			throw new RuntimeException("Credential Not matched");
		}
		
		String token = jwtService.generateToken(email, userObj.getRole());
		
		return Map.of(
					"token",token,
					"role",userObj.getRole(),
					"message",userObj.getRole().equals("ADMIN")?"/admin/home":"/user/home"
			   );
	}

}

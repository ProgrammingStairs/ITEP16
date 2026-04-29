package com.springboot.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.LoginRequestDTO;
import com.springboot.dto.LoginResponseDTO;
import com.springboot.service.JwtService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {
	private JwtService jwtService;
	private AuthenticationManager authentication;
	public AuthController(AuthenticationManager authentication,JwtService jwtService) {
		this.authentication= authentication;
		this.jwtService = jwtService;
	}
	
	@PostMapping("/login")
	public LoginResponseDTO login(@RequestBody LoginRequestDTO request,HttpServletResponse response) {
		String email = request.getEmail();
		String password = request.getPassword();
		System.out.println("email : "+email);
		System.out.println("password : "+password);
		Authentication authenticate = authentication.authenticate(
				new UsernamePasswordAuthenticationToken(email, password)
		);
		if(authenticate.isAuthenticated()) {
			UserDetails userDetails =  (UserDetails)authenticate.getPrincipal();
			String role = userDetails.getAuthorities().iterator().next().getAuthority();
			String token = jwtService.generateToken(email, role);
			
			Cookie cookie = new Cookie("jwtToken",token);
			cookie.setHttpOnly(true);
			cookie.setSecure(false);
			cookie.setPath("/");
			cookie.setMaxAge(24*60*60);
			response.addCookie(cookie);
			
			LoginResponseDTO responseDTO = new LoginResponseDTO();
			responseDTO.setToken(token);
			responseDTO.setEmail(email);
			responseDTO.setRole(role);
			return responseDTO;
		}
		throw new RuntimeException("User Not Found");
	}
}

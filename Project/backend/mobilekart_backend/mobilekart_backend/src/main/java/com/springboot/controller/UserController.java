package com.springboot.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.UserRequestDTO;
import com.springboot.dto.UserResponseDTO;
import com.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	private UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	@PostMapping("/registration")
	public ResponseEntity<Map<String,Object>> userRegistration(@RequestBody UserRequestDTO request){
		UserResponseDTO response = userService.userRegistration(request);
		return ResponseEntity.status(HttpStatus.OK).body(
				Map.of(
						"message","User Registration Successfull",
						"userDto", response,
						"status",200
				)
		);
	}
}









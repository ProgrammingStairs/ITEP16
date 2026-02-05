package com.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
		return "<h2>Example of QueryMethod _ Pagination _ Sorting</h2>";
	}
	
	@PostMapping("/save")
	public ResponseEntity<User> saveData(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(user));
	}
	
	@GetMapping("/username")
	public ResponseEntity<List<User>> getUsername(@RequestParam String username){
		return ResponseEntity.ok(userService.findUserByUsername(username));
	}

	@GetMapping("/address")
	public ResponseEntity<List<User>> getAddress(@RequestParam String address){
		return ResponseEntity.ok(userService.findUserByAddress(address));
	}

	@GetMapping("/gender")
	public ResponseEntity<List<User>> getGender(@RequestParam String gender){
		return ResponseEntity.ok(userService.findUserByGender(gender));
	}

	@GetMapping("/hobby")
	public ResponseEntity<List<User>> getHobby(@RequestParam String hobby){
		return ResponseEntity.ok(userService.findUserByHobbies(hobby));
	}

	@GetMapping("/gender_and_address")
	public ResponseEntity<List<User>> getGenderAndAddress(@RequestParam String gender,@RequestParam String address){
		return ResponseEntity.ok(userService.findUserByGenderAndAddress(gender,address));
	}

	@GetMapping("/gender_or_address")
	public ResponseEntity<List<User>> getGenderOrAddress(@RequestParam String gender,@RequestParam String address){
		return ResponseEntity.ok(userService.findUserByGenderOrAddress(gender,address));
	}

	@GetMapping("/gender_not")
	public ResponseEntity<List<User>> getGenderNot(@RequestParam String gender){
		return ResponseEntity.ok(userService.findUserByGenderNot(gender));
	}

	@GetMapping("/usernameContaining")
	public ResponseEntity<List<User>> getUsernameContaining(@RequestParam String username){
		return ResponseEntity.ok(userService.findUserByUsernameContaining(username));
	}
	
	@GetMapping("/usernameIgnoreCase")
	public ResponseEntity<List<User>> getUsernameIgnoreCase(@RequestParam String username){
		return ResponseEntity.ok(userService.findUserByUsernameIgnoreCase(username));
	}

	@GetMapping("/usernameContainingIgnoreCase")
	public ResponseEntity<List<User>> getUsernameContainingIgnore(@RequestParam String username){
		return ResponseEntity.ok(userService.findUserByUsernameContainingIgnoreCase(username));
	}

}


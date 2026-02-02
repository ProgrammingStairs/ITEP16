package com.springboot.controller;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;
import com.springboot.service.UserService;

@RestController
public class AppController {
	
	private UserService userService;
	public AppController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/")
	public String home() {
		return "<h2>Welcome to RestAPI NO Database Example</h2>";
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		return ResponseEntity.ok(userService.findAll());
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
	}
	
//	@PostMapping("/addUser")
//	public ResponseEntity<User> addUser(RequestEntity<User> user) {
//		User userObj = user.getBody();
//		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userObj));
//	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<User> findById(@PathVariable("id") int id){
		return new ResponseEntity<User>(userService.findById(id),HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<User> update(@PathVariable("id") int id,@RequestBody User user){
		return new ResponseEntity<User>(userService.update(id, user),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id){
		boolean status = userService.delete(id);
		if(status) {
			return ResponseEntity.ok("Data deleted successfully");
		}else {
			return ResponseEntity.noContent().build();
		}
	}
}

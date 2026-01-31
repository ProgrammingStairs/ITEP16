package com.springboot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;

@RestController
public class AppController {
	
	@GetMapping("/")
	public String home() {
		return "<h2>Home Page</h2>";
	}

	@GetMapping("/services")
	public String service() {
		return "<h2>Services Page</h2>";
	}

	@GetMapping("/about")
	public String about() {
		return "<h2>About Page</h2>";
	}

	@GetMapping("/contact")
	public String contact() {
		return "<h2>Contact Page</h2>";
	}

	@GetMapping("/getStudDetails")
	public Student getStudDetails() {
		return new Student(101, "Andrew Anderson", "andrew@gmail.com", "andrew@123", "Indore");
	}
	// through form-data
	@PostMapping("/setDetails")
	public String getDetails(@RequestParam String email,
			@RequestParam String password) {
		return "EmailId : "+email+"<br>Password : "+password;
	}
// http://localhost:8080/setGetDetails?email=abc@gmail.com&password=indore
	@GetMapping("/setGetDetails")
	public String getDetail(@RequestParam String email,
			@RequestParam String password) {
		return "EmailId : "+email+"<br>Password : "+password;
	}

	@PostMapping("/setJSONDetails")
	public String getJsonDetails(@RequestBody Student stud) {
		return "EmailId : "+stud.getEmail()+"<br>Password : "+stud.getPassword();
	}
	
	@PutMapping("/updateDetails/{id}")
	public String updateDetails(@PathVariable int id) {
		return "Student with id : "+id+" is going to be updated";
	}

	@DeleteMapping("/deleteDetails/{id}")
	public String deleteDetails(@PathVariable int id) {
		return "Student with id : "+id+" is going to be deleted";
	}

	@GetMapping("/showData/{email}/{address}")
	public String showDetails(@PathVariable String email,@PathVariable String address) {
		return "Student Email : "+email+"<br>Student Address : "+address;
	}
}

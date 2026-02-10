package com.springboot.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	//http://localhost:8080/findUserByAddressIn?address=indore
	//needs to give data in form-data by adding two keys by same name address = bhopal and address = ujjain
	@GetMapping("/findUserByAddressIn")
	 public ResponseEntity<List<User>> findUserByAddressIn(@RequestParam List<String> address){
		 return ResponseEntity.ok(userService.findUserByAddressIn(address));
	 }
	@GetMapping("/findUserByGenderOrderByAddressAsc/{gender}")
	 public ResponseEntity<List<User>> findUserByGenderOrderByAddressAsc(@PathVariable("gender") String gender){
		 return  ResponseEntity.ok(userService.findUserByGenderOrderByAddressAsc(gender));
	 }
	@GetMapping("/findUserByPagination/{page}/{size}")
	 public ResponseEntity<Page<User>> findUserByPagination(@PathVariable("page") int page,@PathVariable("size") int size){
		 return ResponseEntity.ok(userService.findUserByPagination(page,size));
	 }
	@GetMapping("/findUserBySorting/{field}")
	 public ResponseEntity<Page<User>> findUserBySorting(@PathVariable("field") String field){
		 return ResponseEntity.ok(userService.findUserBySorting(field));
	 }
	@GetMapping("/findUserByPaginationAndSorting")
	 public ResponseEntity<Page<User>> findUserByPaginationAndSorting(@RequestParam int page,@RequestParam int size,@RequestParam String field){
		 return ResponseEntity.ok(userService.findUserByPaginationAndSorting(page, size,field));
	 }
	@GetMapping("/findUserByGender")
	 public ResponseEntity<Page<User>> findUserByGender(@RequestParam String gender,@RequestParam int page,@RequestParam int size){
		 return ResponseEntity.ok(userService.findUserByGender(gender,page,size));
	 }
	@GetMapping("/searchUserByAddress/{address}")
	 public ResponseEntity<List<User>> searchUserByAddress(@PathVariable("address") String address){
		 return ResponseEntity.ok(userService.searchUserByAddress(address));
	 }
	@GetMapping("/searchUserByGender/{gender}")
	 public ResponseEntity<List<User>> searchUserByGender(@PathVariable("gender") String gender){
		 return ResponseEntity.ok(userService.searchUserByGender(gender));
	 }
	@GetMapping("/searchUserByHobby/{hobby}")
	 public ResponseEntity<List<User>> searchUserByHobby(@PathVariable("hobby") String hobby){
		 return ResponseEntity.ok(userService.searchUserByHobby(hobby));
	 }
	@GetMapping("/searchUserByAddressAgain/{address}")
	 public ResponseEntity<List<User>> searchUserByAddressAgain(@PathVariable("address") String address){
		 return ResponseEntity.ok(userService.searchUserByAddressAgain(address));
	 }

}


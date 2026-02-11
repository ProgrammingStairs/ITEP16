package com.springboot.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.dto.UserDto;
import com.springboot.entity.UserEntity;
import com.springboot.service.UserService;

@RestController
public class UserController {
	private UserService userService;
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
//	public UserController() {
//		System.out.println("User controller test run");
//	}
	
	@Autowired
	public Environment env;
	
	@GetMapping("/")
	public String index() {
		return "Welcome to file Upload";
	}
	
	@PostMapping("/uploadFormData")
	public String uploadFormData(@ModelAttribute UserDto userDto) throws IOException {
		MultipartFile file = userDto.getFilename();
		String filePath = env.getProperty("upload.filepath");
		File uploadPath = new File(filePath);
		if(!uploadPath.exists())
			uploadPath.mkdir();
		
		String fileName = System.currentTimeMillis()+file.getOriginalFilename();
		File destination = new File(uploadPath,fileName);
		file.transferTo(destination);
		
		UserEntity userEntity = new UserEntity();
		userEntity.setUsername(userDto.getUsername());
		userEntity.setDescription(userDto.getDescription());
		userEntity.setFilename(fileName);
		
		userService.addUser(userEntity);
		return "File Uploaded Successfully";
	}
	
	@GetMapping("/viewAllList")
	public ResponseEntity<List<UserEntity>> viewAllList() {
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
}

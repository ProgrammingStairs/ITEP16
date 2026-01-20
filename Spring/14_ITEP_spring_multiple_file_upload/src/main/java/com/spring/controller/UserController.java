package com.spring.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.spring.dto.UserDto;
import com.spring.entity.UserEntity;
import com.spring.service.UserService;

@Controller
public class UserController {
	private UserService userService;
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@Autowired
	public Environment env;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/uploadForm")
	public String uploadForm() {
		return "uploadFormData";
	}
	
	@PostMapping("/uploadFormData")
	public String uploadFormData(@ModelAttribute UserDto userDto,Model model) throws IOException {
		MultipartFile[] file = userDto.getFilename();
		String filePath = env.getProperty("upload.filepath");
		File uploadPath = new File(filePath);
		if(!uploadPath.exists())
			uploadPath.mkdir();
		
		StringBuilder sb = new StringBuilder();
		for(MultipartFile fileObj : file) {
			String fileName = System.currentTimeMillis()+fileObj.getOriginalFilename();
			File destination = new File(uploadPath,fileName);
			fileObj.transferTo(destination);
			sb.append(fileName).append(",");
		}
		
		String str = sb.toString();
		String fileNames = str.substring(0, str.length()-1);
		
		UserEntity userEntity = new UserEntity();
		userEntity.setUsername(userDto.getUsername());
		userEntity.setDescription(userDto.getDescription());
		userEntity.setFilename(fileNames);
		
		userService.addUser(userEntity);
		model.addAttribute("message", "File Uploaded Successfully");
		return "uploadFormData";
	}
	
	@GetMapping("/viewAllList")
	public String viewAllList(Model model) {
		model.addAttribute("listData", userService.getAllUsers());
		return "viewAllList";
	}
	
}

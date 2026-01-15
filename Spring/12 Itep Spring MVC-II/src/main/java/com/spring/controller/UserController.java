package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.User;
import com.spring.service.UserService;

import jakarta.validation.Valid;

@Controller
//@RestController = @Controller + @ResponseBody
public class UserController {
	
	private UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("message", "This is an example of Spring MVC");
		return "index";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping(value="/registerData",produces="application/json",consumes="application/json")
	@ResponseBody // if we use @RestController, then we do not needs to write @ResponseBody
	public Map<String, Object> registerUser(@Valid @RequestBody User user,BindingResult result){
		Map<String,Object> map = new HashMap<String, Object>();

		if(result.hasErrors()) {
			String fields[] = {"username","email","password","gender","hobbies","subject"};
			for(String field : fields) {
				if(result.getFieldError(field)!=null) {
					map.put("field",field);
					map.put("message", result.getFieldError(field).getDefaultMessage());
					map.put("status", 403);
					return map;
				}
			}
		}
		
		
		try {
			userService.addUser(user);
			System.out.println("User Added Successfully");
			map.put("status",201);
			map.put("message","User Added Successfully");
//			return map;
		}catch(Exception e) {
			System.out.println("Error while adding user");
			map.put("status",500);
			map.put("message","Something went wrong");
//			return map;
		}
		return map;
	}
}
















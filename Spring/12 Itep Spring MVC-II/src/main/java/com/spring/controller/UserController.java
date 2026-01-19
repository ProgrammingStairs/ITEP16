package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.User;
import com.spring.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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
		}catch(Exception e) {
			System.out.println("Error while adding user");
			map.put("status",500);
			map.put("message","Something went wrong");
		}
		return map;
	}
	

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/loginData")
	public String loginData(@ModelAttribute User obj,Model model,HttpServletRequest request) {
		boolean result = userService.checkLogin(obj.getEmail(), obj.getPassword());
		System.out.println("gets emtry "+obj);
		if(result) {
			HttpSession session = request.getSession();
			session.setAttribute("email", obj.getEmail());
			return "profile";
		}else {
			model.addAttribute("message", "Credential Not Matched");
			return "login";
		}
	}

	@GetMapping("/viewList")
	public String viewList(Model model) {
		model.addAttribute("userList", userService.getAllUsers());
		return "viewUserList";
	}
	
	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("uid") int id,Model model) {
		boolean result = userService.deleteUser(id);
		
		if(result) {
			model.addAttribute("message", "User deleted successfully");
			model.addAttribute("userList", userService.getAllUsers());			
		}else {
			model.addAttribute("message", "Error while deleting user");
			model.addAttribute("userList", userService.getAllUsers());
		}
		return "viewUserList";
	}
	
	@GetMapping("/updateUser/{id}")
	public String updateUserForm(@PathVariable("id") int id,Model model) {
		model.addAttribute("userObj", userService.getUserById(id));
		return "updateForm";
	}
	
	@PostMapping("/updateFormData")
	public String updateFormData(@ModelAttribute User user,Model model) {
		userService.updateUser(user);
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("message", "Data Updated Successfully");
		return "viewUserList";
	}
	
	@GetMapping("/logout")
	public String logout(Model model,HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("email", null);
		session.invalidate();
		model.addAttribute("message", "Logout Successfull");
		return "login";
	}
}
















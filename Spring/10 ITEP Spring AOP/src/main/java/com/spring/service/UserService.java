package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public void displayUserService() {
		System.out.println("displayUserService method invoked");
	}

	public void drawUserService() {
		System.out.println("drawUserService method invoked");
	}

	public void showUserService() {
		//System.out.println("showUserService method invoked");
		throw new RuntimeException("Runtime exception takes place");
	}
	
	public String printName() {
		return "Andrew Anderson";
	}

}

package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public User findUser(int id) {
		return userRepository.findById(id).orElse(null);
	}
}

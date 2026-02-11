package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
	private UserRepository userRepository;
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}


package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public User findById(int id) {
		return userRepository.findById(id);
	}
	
	public User update(int uid , User user) {
		return userRepository.update(uid, user);
	}

	public boolean delete(int id) {
		return userRepository.delete(id);
	}
}

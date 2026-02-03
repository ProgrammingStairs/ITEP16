package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.User;
import com.springboot.globalexception.UserNotFoundException;
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
		return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("User Not Found"));
	}
	
	public User update(int uid , User user) {
		User userObj = userRepository.findById(uid).orElse(null);
		if(userObj!=null) {
				userObj.setUsername(user.getUsername());
				userObj.setEmail(user.getEmail());
				userObj.setGender(user.getGender());
				userObj.setHobbies(user.getHobbies());
				return userRepository.save(userObj);
		}
		else
			throw new UserNotFoundException("User not found");
	}

	public boolean delete(int id) {
		boolean status = false;
		User userObj = userRepository.findById(id).orElse(null);
		if(userObj!=null) {
			status = true;
			userRepository.deleteById(id);
		}
		return status;
	}
}

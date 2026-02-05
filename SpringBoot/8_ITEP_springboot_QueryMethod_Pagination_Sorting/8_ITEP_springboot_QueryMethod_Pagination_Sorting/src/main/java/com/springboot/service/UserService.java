package com.springboot.service;

import java.util.List;

import com.springboot.entity.User;

public interface UserService {
	
	 User addUser(User user);
	 List<User> findUserByUsername(String username);
	 List<User> findUserByGender(String gender);
	 List<User> findUserByAddress(String address);

	 List<User> findUserByHobbies(String hobby);
	 List<User> findUserByGenderAndAddress(String gender, String address);
	 List<User> findUserByGenderOrAddress(String gender, String address);
	 List<User> findUserByGenderNot(String gender);
	 
	 List<User> findUserByUsernameContaining(String username);
	 List<User> findUserByUsernameIgnoreCase(String username);
	 List<User> findUserByUsernameContainingIgnoreCase(String username);

}

package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	 private UserRepository userRepository;
	 public UserServiceImpl(UserRepository userRepository) {
		 this.userRepository = userRepository;
	 }
	 
	 @Override
	 public User addUser(User user) {
		 return userRepository.save(user);
	 }
	 
	 @Override
	 public List<User> findUserByUsername(String username){
		 return userRepository.findByUsername(username);
	 }
	 @Override
	 public List<User> findUserByGender(String gender){
		 return userRepository.findByGender(gender);
	 }
	 @Override
	 public List<User> findUserByAddress(String address){
		 return userRepository.findByAddress(address);
	 }
	 @Override
	 public List<User> findUserByHobbies(String hobby){
		 return userRepository.findByHobbies(hobby);
	 }
	 @Override
	 public List<User> findUserByGenderAndAddress(String gender, String address){
		 return userRepository.findByGenderAndAddress(gender,address);
	 }
	 @Override
	 public List<User> findUserByGenderOrAddress(String gender, String address){
		 return userRepository.findByGenderOrAddress(gender,address);
	 }
	 @Override
	 public List<User> findUserByGenderNot(String gender){
		 return userRepository.findByGenderNot(gender);
	 }
	 @Override
	 public List<User> findUserByUsernameContaining(String username){
		 return userRepository.findByUsernameContaining(username);
	 }
	 @Override
	 public List<User> findUserByUsernameIgnoreCase(String username){
		 return userRepository.findByUsernameIgnoreCase(username);
	 }
	 @Override
	 public List<User> findUserByUsernameContainingIgnoreCase(String username){
		 return userRepository.findByUsernameContainingIgnoreCase(username);		 
	 }

}

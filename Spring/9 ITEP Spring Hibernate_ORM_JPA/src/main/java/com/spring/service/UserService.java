package com.spring.service;

import java.util.List;

import com.spring.model.User;

public interface UserService {
	public void addUserService(User user);
	public void updateUserService(User user);
	public void deleteUserService(int id) throws Exception;
	public User getUserByIdService(int id);
	public List<User> getAllUserService();

}

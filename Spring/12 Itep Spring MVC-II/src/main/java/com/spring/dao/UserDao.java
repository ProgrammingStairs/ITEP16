package com.spring.dao;

import java.util.List;

import com.spring.entity.User;

public interface UserDao {
	public void addUser(User user);
	public boolean checkLogin(String email,String password);
	public boolean deleteUser(int id);
	public User getUserById(int id);
	public User updateUser(User user);
	public List<User> getAllUserList();
}

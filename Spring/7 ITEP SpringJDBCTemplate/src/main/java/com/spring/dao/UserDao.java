package com.spring.dao;

import java.util.List;

import com.spring.model.User;

public interface UserDao {
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(int id);
	User getUser(int id);
	List<User> getAllUser();
}

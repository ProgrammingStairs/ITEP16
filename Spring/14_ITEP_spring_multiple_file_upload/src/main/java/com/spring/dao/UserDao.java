package com.spring.dao;

import java.util.List;

import com.spring.entity.UserEntity;

public interface UserDao {
	public void addUser(UserEntity user);
	public List<UserEntity> getAllUsers();
}

package com.springboot.dao;

import java.util.List;

import com.springboot.entity.UserEntity;

public interface UserDao {
	public void addUser(UserEntity user);
	public List<UserEntity> getAllUsers();
}

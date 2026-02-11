package com.springboot.service;

import java.util.List;

import com.springboot.entity.UserEntity;

public interface UserService {
	public void addUser(UserEntity user);
	public List<UserEntity> getAllUsers();
}

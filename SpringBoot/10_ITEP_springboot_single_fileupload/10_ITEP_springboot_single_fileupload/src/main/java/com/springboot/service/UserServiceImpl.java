package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.dao.UserDao;
import com.springboot.entity.UserEntity;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	private UserDao userDao;
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void addUser(UserEntity user) {
		userDao.addUser(user);
	}
	@Override
	public List<UserEntity> getAllUsers(){
		return userDao.getAllUsers();
	}

}

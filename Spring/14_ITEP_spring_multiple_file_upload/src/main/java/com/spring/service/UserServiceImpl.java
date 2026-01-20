package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.entity.UserEntity;

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

package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.entity.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}
}

package com.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.UserDao;
import com.spring.model.User;

@Service
public class UserService {
	
	private UserDao userDao;
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Transactional
	public void actionPerformed(User user) {
		userDao.addUser(user);
		userDao.addAuditLog("Welcome to AuditLog : "+user.getUsername());
		if(true)
			throw new RuntimeException("Rollback takes place"); 
	}
}

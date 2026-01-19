package com.spring.service;

import java.util.List;

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
	@Override
	public boolean checkLogin(String email,String password) {
		return userDao.checkLogin(email, password);
	}
	@Override
	public List<User> getAllUsers(){
		return userDao.getAllUserList();
	}
	@Override
	public boolean deleteUser(int id) {
		return userDao.deleteUser(id);
	}
	@Override
	public User getUserById(int id) {
		return  userDao.getUserById(id);
	}
	@Override
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}
}

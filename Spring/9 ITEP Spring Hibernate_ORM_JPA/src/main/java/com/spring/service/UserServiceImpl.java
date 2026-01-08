package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.UserDao;
import com.spring.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void addUserService(User user) {
		userDao.addUser(user);
	}
	
	@Override
	public void updateUserService(User user) {
		userDao.updateUser(user);
	}
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteUserService(int id) throws Exception{
		userDao.deleteUser(id);
		if(true)
			throw new Exception("Rollback takes place");
	}
	
	@Override
	@Transactional(readOnly = true)
	public User getUserByIdService(int id) {
		User user = userDao.getUserById(id);
		return user;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<User> getAllUserService(){
		List<User> users = userDao.getAllUser();
		return users;
	}

}

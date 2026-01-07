package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Override
	public void addUserService(User user) {}
	@Override
	public void updateUserService(User user) {}
	@Override
	public void deleteUserService(int id) {}
	
	@Override
	@Transactional(readOnly = true)
	public User getUserByIdService(int id) {
		return null;
	}
	@Override
	@Transactional(readOnly = true)
	public List<User> getAllUserService(){
		return null;
	}

}

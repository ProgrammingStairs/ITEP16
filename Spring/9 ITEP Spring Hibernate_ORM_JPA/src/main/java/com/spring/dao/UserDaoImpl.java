package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addUser(User user) {}
	@Override
	public void updateUser(User user) {}
	@Override
	public void deleteUser(int id) {}
	@Override
	public User getUserById(int id) {
		return null;
	}
	@Override
	public List<User> getAllUser(){
		return null;
	}

}

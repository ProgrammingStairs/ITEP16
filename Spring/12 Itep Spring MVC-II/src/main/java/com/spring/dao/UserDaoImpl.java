package com.spring.dao;

import org.springframework.stereotype.Repository;

import com.spring.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addUser(User user) {
		 em.persist(user);
	}
}

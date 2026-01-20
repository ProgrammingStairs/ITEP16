package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.entity.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addUser(UserEntity user) {
		em.persist(user);
	}
	@Override
	public List<UserEntity> getAllUsers(){
		return em.createQuery("from UserEntity",UserEntity.class).getResultList();
	}
}

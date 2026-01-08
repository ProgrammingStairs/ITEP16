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
	public void addUser(User user) {
		em.persist(user);
		System.out.println("User Added successfully");
	}
	@Override
	public void updateUser(User user) {
		em.merge(user);
		System.out.println("User Updated successfully");
	}
	@Override
	public void deleteUser(int id) {
		User user = em.find(User.class, id);
		if(user!=null) {
			em.remove(user);
			System.out.println("User deleted successfully");
		}else
			System.out.println("User Not Found");
	}
	@Override
	public User getUserById(int id) {
		User user = em.find(User.class, id);
		return user;
	}
	
	@Override
	public List<User> getAllUser(){
		return em.createQuery("from User", User.class).getResultList();
	}

}

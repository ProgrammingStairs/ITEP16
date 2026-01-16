package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addUser(User user) {
		 em.persist(user);
	}
	
	@Override
	public boolean checkLogin(String email,String password) {
		TypedQuery<User> query = em.createQuery("select u from User u where u.email='"+email+"'",User.class);
		User u = query.getSingleResult();
		if(u!=null && u.getEmail().equals(email) && u.getPassword().equals(password)) 
			return true;
		else
			return false;
	}
	
	@Override
	public List<User> getAllUserList(){
		return em.createQuery("from User",User.class).getResultList();
	}
	@Override
	public boolean deleteUser(int id) {
		User user = em.find(User.class, id);
		if(user!=null) {
			em.remove(user);
			return true;
		}else
			return false;
	}
	@Override
	public User getUserById(int id) {
		return em.find(User.class, id);
	}
}

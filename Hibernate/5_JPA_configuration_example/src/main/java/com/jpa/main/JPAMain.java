package com.jpa.main;

import com.jpa.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JPAMain{
	public static void main(String args[]) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mypunit");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			User user = new User();
			user.setUsername("Andrew Anderson");
			user.setEmail("andrew@gmail.com");
			user.setPassword("andrew@123");
			try {	
				em.persist(user); 
				tx.commit();
			}catch(Exception e) {
				if(tx!=null)
					tx.rollback();
				System.out.println("Rollback takes place..!!");
			}
			em.close();
		emf.close();
	}
}
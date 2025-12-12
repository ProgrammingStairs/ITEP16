package com.jpa.main;

import java.util.List;
import java.util.Scanner;

import com.jpa.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class JPAMain1{
	public static void main(String args[]){
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
	 	EntityManager em = emf.createEntityManager();
	 	EntityTransaction tx = null;
	 	try {
		 	tx = em.getTransaction();
		 	tx.begin();

		 	CriteriaBuilder criteriaBuilder =  em.getCriteriaBuilder();
		 	CriteriaQuery<String> query = criteriaBuilder.createQuery(String.class);
		 	Root<User> root =  query.from(User.class);
		 	query.select(root.get("username"));
		 	
		 	TypedQuery<String> q =  em.createQuery(query);
		 	List<String> list = q.getResultList();
		 	for(String username : list) {
		 		System.out.println("Username : "+username);
		 	}
		 	
		 	tx.commit();
	 	}catch(Exception e) {
	 		if(tx!=null)
	 			tx.rollback();
	 		System.out.println("Rollback takes place..!!");
	 		System.out.println("Exception : "+e);
	 	}
	 	em.close();
	 	emf.close();
	}
}
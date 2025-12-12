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

public class JPAMain2{
	public static void main(String args[]){
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
	 	EntityManager em = emf.createEntityManager();
	 	EntityTransaction tx = null;
	 	try {
		 	tx = em.getTransaction();
		 	tx.begin();

		 	CriteriaBuilder criteriaBuilder =  em.getCriteriaBuilder();
		 	CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
		 	Root<User> root =  query.from(User.class);
		 	query.multiselect(root.get("uid"),root.get("username"),root.get("email"),root.get("password"));
		 	
		 	TypedQuery<Object[]> q =  em.createQuery(query);
		 	List<Object[]> list = q.getResultList();
		 	for(Object[] row : list) {
		 		System.out.println("\nUid : "+row[0]);
		 		System.out.println("Username: "+row[1]);
		 		System.out.println("Email : "+row[2]);
		 		System.out.println("Password : "+row[3]);
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

























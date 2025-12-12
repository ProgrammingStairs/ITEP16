package com.jpa.main;

import com.jpa.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class JPAMain1{
	public static void main(String args[]){
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
	 	EntityManager em = emf.createEntityManager();
	 	EntityTransaction tx = null;
	 	try {
		 	tx = em.getTransaction();
		 	tx.begin();
		 	String query = "update User set username=:username, password=:password, address=:address, salary=:salary where email=:email";
		 	Query q = em.createQuery(query);
		 	q.setParameter("username", "Andy");
		 	q.setParameter("password", "12345678");
		 	q.setParameter("address", "Indore Madhya Pradesh");
		 	q.setParameter("salary", 90000);
		 	q.setParameter("email", "andrew@gmail.com");
		 	
		 	int affectedRows = q.executeUpdate();
		 	System.out.println("Data updated successfully : "+affectedRows);
		 	
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
// pagination example
package com.jpa.main;

import java.util.List;

import com.jpa.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class JPAMain4{
	public static void main(String args[]){
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
	 	EntityManager em = emf.createEntityManager();
	 	EntityTransaction tx = null;
	 	try {
		 	tx = em.getTransaction();
		 	tx.begin();
		 	int pageNumber = 3;
		 	int pageSize = 2;
		 	
		 	String query = "select u from User u";
		 	TypedQuery<User> q = em.createQuery(query,User.class);
		 	q.setFirstResult((pageNumber-1)*pageSize);
		 	q.setMaxResults(pageSize);
		 	
		 	List<User> user = q.getResultList();
		 	for(User u : user) {
				System.out.println(u.getUsername()+"\t"+u.getEmail()+"\t"+u.getPassword()+"\t"+u.getAddress()+"\t"+u.getSalary()+"\t");
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
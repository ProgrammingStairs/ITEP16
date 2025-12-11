// aggregate functions
package com.jpa.main;

import java.util.List;

import com.jpa.entity.User;
import com.jpa.entity.User1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class JPAMain6{
	public static void main(String args[]){
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
	 	EntityManager em = emf.createEntityManager();
	 	EntityTransaction tx = null;
	 	try {
		 	tx = em.getTransaction();
		 	tx.begin();
		 	
		 	// named query with annotation
		 	/*
			TypedQuery<User1> query = em.createNamedQuery("User1.findByEmail", User1.class);
		 	query.setParameter("email", "andrew@gmail.com");
		 	
		 	User1 user = query.getSingleResult();
			System.out.println("UserId: "+user.getUid());
			System.out.println("Username : "+user.getUsername());
			System.out.println("Email : "+user.getEmail());
			System.out.println("Password : "+user.getPassword());
			System.out.println("Address : "+user.getAddress());
			System.out.println("Salary : "+user.getSalary());
			*/
		 	
		 	// native query without annotation
		 	/*
		 	String query = "select * from user_hql where email = ?";
		 	Query q = em.createNativeQuery(query,User1.class);
		 	q.setParameter(1, "andrew@gmail.com");
		 	
		 	User1 user =  (User1)q.getSingleResult();
			System.out.println("UserId: "+user.getUid());
			System.out.println("Username : "+user.getUsername());
			System.out.println("Email : "+user.getEmail());
			System.out.println("Password : "+user.getPassword());
			System.out.println("Address : "+user.getAddress());
			System.out.println("Salary : "+user.getSalary());
			*/ 

		 	// native query with annotation
		 	/*
			TypedQuery<User1> query = em.createNamedQuery("User1.findByEmailNative", User1.class);
		 	query.setParameter(1, "andrew@gmail.com");
		 	
		 	User1 user = query.getSingleResult();
			System.out.println("UserId: "+user.getUid());
			System.out.println("Username : "+user.getUsername());
			System.out.println("Email : "+user.getEmail());
			System.out.println("Password : "+user.getPassword());
			System.out.println("Address : "+user.getAddress());
			System.out.println("Salary : "+user.getSalary());
		 	*/
		 	
		 	// native query with annotation
		 	TypedQuery<Object[]> query = em.createNamedQuery("User1.getUsernameAndEmail", Object[].class);
		 	List<Object[]> data = query.getResultList();
		 	
		 	for(Object[] user : data) {
				System.out.println("\nUsername: "+user[0]);
				System.out.println("Email : "+user[1]);
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
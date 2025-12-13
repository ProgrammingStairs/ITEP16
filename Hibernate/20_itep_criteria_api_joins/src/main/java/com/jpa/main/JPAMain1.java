package com.jpa.main;

import com.jpa.model.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
public class JPAMain1{
	public static void main(String args[]) {
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx=null;
		try {
			tx = em.getTransaction();
			tx.begin();
			
			// first level caching example
			
			Department d1 =  em.find(Department.class,1);
			System.out.println("Department name : "+d1.getDeptName());
			
			Department d2 =  em.find(Department.class,1);
			System.out.println("Department name : "+d2.getDeptName());
			
			
			tx.commit();
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();
				System.out.println("Rollback takes place");
			}
		}
	}
}
// aggregate functions
package com.jpa.main;

import java.util.List;

import com.jpa.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class JPAMain5{
	public static void main(String args[]){
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
	 	EntityManager em = emf.createEntityManager();
	 	EntityTransaction tx = null;
	 	try {
		 	tx = em.getTransaction();
		 	tx.begin();
		 	
		 	/*
		 	String query = "select count(*) from User u";
		 	TypedQuery<Long> q = em.createQuery(query,Long.class);
		 	Long count = q.getSingleResult();
		 	System.out.println("No. of entries : "+count);
		 	*/
		 	
		 	/*
		 	List<Long> user = q.getResultList();
		 	for(Long u : user) {
				System.out.println(u);
		 	}
		 	*/
		 	/*
		 	String query = "select min(u.salary) from User u";
		 	TypedQuery<Integer> q = em.createQuery(query,Integer.class);
		 	Integer minSalary = q.getSingleResult();
		 	System.out.println("MinSalary : "+minSalary);
		 	*/

		 	/*
		 	String query = "select max(u.salary) from User u";
		 	TypedQuery<Integer> q = em.createQuery(query,Integer.class);
		 	Integer maxSalary = q.getSingleResult();
		 	System.out.println("MaxSalary : "+maxSalary);
		 	*/

		 	/*	
		 	String query = "select sum(u.salary) from User u";
		 	TypedQuery<Long> q = em.createQuery(query,Long.class);
		 	Long sumSalary = q.getSingleResult();
		 	System.out.println("SumSalary : "+sumSalary);
			*/
		 	
		 	/*
		 	String query = "select avg(u.salary) from User u";
		 	TypedQuery<Double> q = em.createQuery(query,Double.class);
		 	Double avgSalary = q.getSingleResult();
		 	System.out.println("AvgSalary : "+avgSalary);
			*/
		 	
		 	/*
		 	String query = "select max(u.salary) from User u";
		 	TypedQuery<Integer> q = em.createQuery(query,Integer.class);
		 	Integer maxSalary = q.getSingleResult();
		 	
		 	String que = "select u from User u where u.salary=:maxSalary";
		 	TypedQuery<User> qu = em.createQuery(que,User.class);
		 	qu.setParameter("maxSalary", maxSalary);
		 	
		 	User u = qu.getSingleResult();
		 	System.out.println("Name of Max salary : "+u.getUsername());
		 	*/
		 	
		 	/*
		 	String query = "select max(u.salary) from User u";
		 	TypedQuery<Integer> q = em.createQuery(query,Integer.class);
		 	Integer maxSalary = q.getSingleResult();
		 	
		 	String que = "select u.username from User u where u.salary=:maxSalary";
		 	TypedQuery<String> qu = em.createQuery(que,String.class);
		 	qu.setParameter("maxSalary", maxSalary);
		 	
		 	String username = qu.getSingleResult();
		 	System.out.println("Name of Max salary : "+username);
		 	*/
		 	
		 	/*
		 	String que = "select u.username from User u";
		 	TypedQuery<String> qu = em.createQuery(que,String.class);
		 	
		 	List<String> list = qu.getResultList();
		 	for(String name : list)
		 		System.out.println("Username  : "+name);
		 	*/
		 	
		 	/*
		 	String query = "select u.username,u.salary from User u";
		 	TypedQuery<Object[]> q = em.createQuery(query,Object[].class);
		 	List<Object[]> list = q.getResultList();
		 	for(Object[] rows : list)
		 		System.out.println("Username  : "+rows[0]+" salary : "+rows[1]);
		 	*/

		 	/*
		 	String query = "select u.username,u.salary from User u where u.salary>:sal";
		 	TypedQuery<Object[]> q = em.createQuery(query,Object[].class);
		 	q.setParameter("sal", 50000);
		 	List<Object[]> list = q.getResultList();
		 	for(Object[] rows : list)
		 		System.out.println("Username  : "+rows[0]+" salary : "+rows[1]);
			*/
		 	
		 	String query = "select u.address,count(*) from User u group by u.address";
		 	TypedQuery<Object[]> q = em.createQuery(query,Object[].class);
		 	List<Object[]> list = q.getResultList();
		 	for(Object[] rows : list)
		 		System.out.println("Address  : "+rows[0]+" Count : "+rows[1]);
			
		 	
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
package com.hibernate.main;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class HibernateMain{
	public static void main(String args[]) {
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx=null;
		try {
			tx = em.getTransaction();
			tx.begin();
			//String query = "select e.empname, d.deptName from Employee e JOIN e.department d";	
			//String query = "select e.empname, d.deptName from Employee e INNER JOIN e.department d";	
			//String query = "select e.empname, d.deptName from Employee e LEFT JOIN e.department d";	
			//String query = "select e.empname, d.deptName from Employee e Right JOIN e.department d";	
			String query = "select e.empname, d.deptName from Department d Right JOIN d.employee e";	
			
			TypedQuery<Object[]> que = em.createQuery(query, Object[].class);
			List<Object[]> list = que.getResultList();
			for(Object[] row :  list) {
				System.out.println("EmployeeName : "+row[0]+" DepartmentName : "+row[1]);
			}
			
			tx.commit();
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();
				System.out.println("Rollback takes place");
			}
		}
	
	}
}
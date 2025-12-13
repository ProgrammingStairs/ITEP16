package com.jpa.main;

import java.util.List;

import com.jpa.model.Department;
import com.jpa.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;

public class JPAMain{
	public static void main(String args[]) {
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx=null;
		try {
			tx = em.getTransaction();
			tx.begin();
			
			CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		    CriteriaQuery<Department> query = criteriaBuilder.createQuery(Department.class);	
			Root<Department> dept_root = query.from(Department.class);
			Join<Department, Employee> empJoin = dept_root.join("employee", JoinType.INNER);
		  //  query.select(dept_root).where(criteriaBuilder.like(empJoin.get("empname"),"Andrew%"));
			  query.select(dept_root).distinct(true).where(criteriaBuilder.like(empJoin.get("empname"),"Andrew%"));
				
		    TypedQuery<Department> q = em.createQuery(query);
		    List<Department> d = q.getResultList();
		    for(Department dept : d) {
		    	System.out.println("Department name : "+dept.getDeptName());
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
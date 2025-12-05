package com.jpa.main;

import com.jpa.model.Department;
import com.jpa.model.Employee;

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
			Department dept = new Department();
			dept.setDeptName("Finance");
			
			Employee e1 = new Employee();
			e1.setEmpname("Andrew Anderson");
			e1.setDepartment(dept);
			
			Employee e2 = new Employee();
			e2.setEmpname("Peter Parker");
			e2.setDepartment(dept);
			
			try {	
				em.persist(dept);
				em.persist(e1);
				em.persist(e2);
				
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
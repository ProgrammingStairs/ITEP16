// aggregate functionality
package com.jpa.main;
import java.util.List;
import com.jpa.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class JPAMain5{
	public static void main(String args[]){
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
	 	EntityManager em = emf.createEntityManager();
	 	EntityTransaction tx = null;
	 	try {
		 	tx = em.getTransaction();
		 	tx.begin();

		 	CriteriaBuilder criteriaBuilder =  em.getCriteriaBuilder();
		 	/*
		 	CriteriaQuery<Integer> query = criteriaBuilder.createQuery(Integer.class);
		 	Root<User> root =  query.from(User.class);
		 	query.select(criteriaBuilder.min(root.get("salary")));
		 	
		 	TypedQuery<Integer> q =  em.createQuery(query);
		 	Integer minSalary = q.getSingleResult();
		 	System.out.println("Minimum salary : "+minSalary);
		 	*/
		 	/*
		 	CriteriaQuery<Integer> query = criteriaBuilder.createQuery(Integer.class);
		 	Root<User> root =  query.from(User.class);
		 	query.select(criteriaBuilder.max(root.get("salary")));
		 	
		 	TypedQuery<Integer> q =  em.createQuery(query);
		 	Integer maxSalary = q.getSingleResult();
		 	System.out.println("Maximum salary : "+maxSalary);
		 	*/
		 	
		 	/*
		 	CriteriaQuery<Integer> query = criteriaBuilder.createQuery(Integer.class);
		 	Root<User> root =  query.from(User.class);
		 	query.select(criteriaBuilder.sum(root.get("salary")));
		 	
		 	TypedQuery<Integer> q =  em.createQuery(query);
		 	Integer sumSalary = q.getSingleResult();
		 	System.out.println("Sum salary : "+sumSalary);
		 	*/
		 	
		 	CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
		 	Root<User> root = query.from(User.class);

		 	query.select(criteriaBuilder.sum(root.get("salary").as(Long.class)));

		 	TypedQuery<Long> q = em.createQuery(query);
		 	Long sumSalary = q.getSingleResult();

		 	System.out.println("Sum salary : " + sumSalary);

		 	/*
		 	CriteriaQuery<Double> query = criteriaBuilder.createQuery(Double.class);
		 	Root<User> root =  query.from(User.class);
		 	query.select(criteriaBuilder.avg(root.get("salary")));
		 	
		 	TypedQuery<Double> q =  em.createQuery(query);
		 	Double avgSalary = q.getSingleResult();
		 	System.out.println("Average salary : "+avgSalary);
		 	*/
		 	
		 	/*
		 	CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
		 	Root<User> root =  query.from(User.class);
		 	//query.select(criteriaBuilder.count(root.get("salary")));
		 	//query.select(criteriaBuilder.count(root.get("uid")));
		 	query.select(criteriaBuilder.count(root));
		 	
		 	TypedQuery<Long> q =  em.createQuery(query);
		 	Long count = q.getSingleResult();
		 	System.out.println("No. of entities : "+count);
			*/
		 	
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

























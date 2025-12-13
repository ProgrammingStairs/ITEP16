// pagination example
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

public class JPAMain6{
	public static void main(String args[]){
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mypunit");
	 	EntityManager em = emf.createEntityManager();
	 	EntityTransaction tx = null;
	 	try {
		 	tx = em.getTransaction();
		 	tx.begin();

		 	CriteriaBuilder criteriaBuilder =  em.getCriteriaBuilder();
		 	CriteriaQuery<User> query = criteriaBuilder.createQuery(User.class);
		 	Root<User> root =  query.from(User.class);
		 	query.select(root);
		 	int pageNumber = 2;
		 	int pageSize = 2;
		 	
		 	TypedQuery<User> q =  em.createQuery(query);
		 	q.setFirstResult((pageNumber-1)*pageSize);
		 	q.setMaxResults(pageSize);
		 	
		 	List<User> list = q.getResultList();
		 	for(User user : list) {
		 		System.out.println("\nuserId : "+user.getUid());
		 		System.out.println("Username : "+user.getUsername());
		 		System.out.println("Email : "+user.getEmail());
		 		System.out.println("Password : "+user.getPassword());
		 		System.out.println("Address : "+user.getAddress());
		 		System.out.println("Salary : "+user.getSalary());
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

























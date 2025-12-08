package com.jpa.main;
import java.util.List;

import com.hibernate.model.Passport;
import com.hibernate.model.Student;
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
		
		Student stud = new Student();
		stud.setName("Peter Parker");
		stud.setEmail("peter@gmail.com");
		stud.setPassword("peter@123");
		stud.setAddress("Indore");
		
		Passport passport = new Passport();
		passport.setPassportNumber("PASS123PETER");
		
		stud.setPassport(passport);
		
			try {	
				em.persist(stud);
				tx.commit();
				
				Student s = em.find(Student.class, 1);
				System.out.println("stud_id : "+s.getSid());
				System.out.println("passport_id : "+s.getPassport().getPid()+"\nPassportNumber : "+s.getPassport().getPassportNumber());
				
				
			}catch(Exception e) {
				if(tx!=null)
					tx.rollback();
				System.out.println("Rollback takes place..!!");
			}
			em.close();
		emf.close();
	}
}
/*
 Fetch Type: Eager
 
 Hibernate: 
    insert 
    into
        fetch_passport
        (passportNumber) 
    values
        (?)
Hibernate: 
    insert 
    into
        fetch_student
        (address, email, name, passport_id, password) 
    values
        (?, ?, ?, ?, ?)
Hibernate: 
    select
        s1_0.sid,
        s1_0.address,
        s1_0.email,
        s1_0.name,
        p1_0.pid,
        p1_0.passportNumber,
        s1_0.password 
    from
        fetch_student s1_0 
    left join
        fetch_passport p1_0 
            on p1_0.pid=s1_0.passport_id 
    where
        s1_0.sid=?

 stud_id : 1
 passport_id : 1
 PassportNumber : PASS123ANDREW
        
 ######### Fetch Type : Lazy 
 
 Hibernate: 
    insert 
    into
        fetch_passport
        (passportNumber) 
    values
        (?)
Hibernate: 
    insert 
    into
        fetch_student
        (address, email, name, passport_id, password) 
    values
        (?, ?, ?, ?, ?)
Hibernate: 
    select
        s1_0.sid,
        s1_0.address,
        s1_0.email,
        s1_0.name,
        s1_0.passport_id,
        s1_0.password 
    from
        fetch_student s1_0 
    where
        s1_0.sid=?
stud_id : 1
Hibernate: 
    select
        p1_0.pid,
        p1_0.passportNumber 
    from
        fetch_passport p1_0 
    where
        p1_0.pid=?
passport_id : 1
PassportNumber : PASS123ANDREW
 
 */

package com.hibernate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.Passport;
import com.hibernate.model.Student;
import com.hibernate.utils.HibernateUtils;

public class HibernateMain{
	public static void main(String args[]) {
		createDatabaseIfNotExists();
		Student student = new Student();
		student.setUsername("Peter Parker");
		student.setEmail("peter@gmail.com");
		student.setPassword("peter@123");
		student.setAddress("Indore Madhya Pradesh");
		
		Passport passport = new Passport();
		passport.setPassportNumber("PNO_124PETER");
		
		student.setPassport(passport);
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
			// session.persist(passport); uncomment it when cascadetype.all is not written in student class
			session.persist(student);
			tx.commit(); // session.flush(); is called automatically when tx.commit() called, or u can write explicitly session.flush() before tx.commit()

			
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();
				System.out.println("Rollback takes place");
			}
		}
		Student stud = session.get(Student.class, 1);
		System.out.println("Passport Object : "+stud.getPassport());
		System.out.println("Passport Number : "+stud.getPassport().getPassportNumber());
		
	}
	public static void createDatabaseIfNotExists() {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/";
		String USER = "root";
		String PASS = "root";
		String DATABASE = "itep16";
		try {
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, USER, PASS);
			if(con!=null) {
				String query = "create database if not exists "+DATABASE;
				Statement stmt = con.createStatement();
				stmt.execute(query);
			}else {
				System.out.println("Something Went Wrong..!!");
			}
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
	}

}
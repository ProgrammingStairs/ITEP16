package com.hibernate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.User;
import com.hibernate.utils.HibernateUtils;

public class HibernateMain2 {
	public static void main(String args[]) {
		createDatabaseIfNotExists();
		User user = new User();
//		System.out.println("LocalDateTime.now() : "+LocalDateTime.now());
		user.setUsername("Simon Sim");
		user.setEmail("simon@gmail.com");
		user.setPassword("simon@123");
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = null;
		// insertion of data
		try {
			tx = session.beginTransaction();
			session.persist(user);
			session.flush(); // (optional)
			tx.commit();
			System.out.println("Task Completed..!!");
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();
				System.out.println("Rollback takes place..!!");
			}
		}
		
		// read data
		try {
//			List<User> list = session.createQuery("from User", User.class).list();
			List<User> list = session.createQuery("from User", User.class).getResultList();
			System.out.println("######### User Data #########");
			for(User userObj : list) {
//				System.out.println(userObj);
				System.out.println("\nUid : "+userObj.getUid());
				System.out.println("Username : "+userObj.getUsername());
				System.out.println("Email : "+userObj.getEmail());
				System.out.println("Password : "+userObj.getPassword());
				System.out.println("CreatedAt : "+userObj.getCreatedat());
				System.out.println("UpdatedAt : "+userObj.getUpdatedat());
			}
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
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
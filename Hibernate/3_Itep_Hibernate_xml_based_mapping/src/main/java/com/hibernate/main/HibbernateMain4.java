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

public class HibbernateMain4 {
	public static void main(String args[]) {
		createDatabaseIfNotExists();
		User user = new User();
//		System.out.println("LocalDateTime.now() : "+LocalDateTime.now());
		user.setUsername("jackson jack");
		user.setEmail("jackson123@gmail.com");
		user.setPassword("jackson@123");
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
		finally {
			session.close();
		}
		
		session = HibernateUtils.getSessionFactory().openSession();
		// read data
		try {
			List<User> list = session.createQuery("from User", User.class).getResultList();
			// here we are dealing with hibernate configuration thats why "from User" is considered as HQL
			System.out.println("######### User Data #########");
			for(User userObj : list) {
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
		
		// specific data
		try {
			User userObj = session.get(User.class, user.getUid()); // here user.getUid() or any parameter which we define must be primary key
			System.out.println("\nspecific data : \nUid : "+userObj.getUid());
			System.out.println("Username : "+userObj.getUsername());
			System.out.println("Email : "+userObj.getEmail());
			System.out.println("Password : "+userObj.getPassword());
			System.out.println("CreatedAt : "+userObj.getCreatedat());
			System.out.println("UpdatedAt : "+userObj.getUpdatedat());
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
		// update 
		try {
			tx = session.beginTransaction();
			User userObj = session.get(User.class, user.getUid());
			userObj.setUsername("SimonUpdate");
			session.merge(userObj);
			tx.commit(); // if we forget to commit then in that case automatically rollback occurs
			System.out.println("Data updated successfully");
			System.out.println("updated Username : "+userObj.getUsername());
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
	
		// delete 
//		try {
//			tx = session.beginTransaction();
//			User userObj = session.get(User.class, user.getUid());
//			session.remove(userObj);
//			tx.commit(); // if we forget to commit then in that case automatically rollback occurs
//			System.out.println("Data deleted successfully");
//		}catch(Exception e) {
//			System.out.println("Exception : "+e);
//		}
		
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

/*
 option-I
 in case of user.setCreatedat(LocalDateTime.now()); we only needs <property name="createdat" column="createdat"></property>
 in case of user.setupdatedat(LocalDateTime.now()); we only needs <property name="updatedat" column="createdat"></property>
 
 
 option-II
 run this on mysql command line client
 
 ALTER TABLE your_table
MODIFY created_at DATETIME DEFAULT CURRENT_TIMESTAMP;

ALTER TABLE your_table
MODIFY updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
 
<property name="createdat" column="createdat"  type="org.hibernate.type.LocalDateTimeType" insert="false" update="false" generated="insert"></property>
<property name="updatedat" column="updatedat"  type="org.hibernate.type.LocalDateTimeType" insert="false" update="false" generated="always"></property>

option-III
@CreationTimestamp annotation
@UpdateTimestamp annotation
 */
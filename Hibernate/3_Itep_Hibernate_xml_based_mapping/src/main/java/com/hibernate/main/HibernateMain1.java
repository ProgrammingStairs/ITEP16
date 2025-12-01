package com.hibernate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.User;
import com.hibernate.utils.HibernateUtils;

public class HibernateMain1 {
	public static void main(String args[]) {
		createDatabaseIfNotExists();
		User user = new User();
//		System.out.println("LocalDateTime.now() : "+LocalDateTime.now());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username = sc.nextLine();
		
		System.out.println("Enter Email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter Password: ");
		String password = sc.nextLine();
		
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = null;
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
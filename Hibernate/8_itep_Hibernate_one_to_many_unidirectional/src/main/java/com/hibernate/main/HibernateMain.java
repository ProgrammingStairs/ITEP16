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

		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
			// session.persist(passport); uncomment it when cascadetype.all is not written in student class
		
			tx.commit(); // session.flush(); is called automatically when tx.commit() called, or u can write explicitly session.flush() before tx.commit()

			
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();
				System.out.println("Rollback takes place");
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
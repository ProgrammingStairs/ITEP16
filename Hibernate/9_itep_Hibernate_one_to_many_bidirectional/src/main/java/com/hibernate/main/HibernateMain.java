package com.hibernate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.Department;
import com.hibernate.model.Employee;
import com.hibernate.utils.HibernateUtils;

public class HibernateMain{
	public static void main(String args[]) {
		createDatabaseIfNotExists();
		Department dept = new Department();
		dept.setDeptName("CS");
		
		Employee e1 = new Employee();
		e1.setEmpname("Andrew Anderson");
		
		Employee e2 = new Employee();
		e2.setEmpname("Peter Parker");
		
		dept.addDepartment(e1);
		dept.addDepartment(e2);
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
			session.persist(dept);
			session.persist(e1);
			session.persist(e2);
			
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
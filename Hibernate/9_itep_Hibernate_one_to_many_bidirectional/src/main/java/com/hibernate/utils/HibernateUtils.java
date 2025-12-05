package com.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Department;
import com.hibernate.model.Employee;

public class HibernateUtils{
	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = null;
		try {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(Department.class);
			configuration.addAnnotatedClass(Employee.class);
			sessionFactory =  configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			System.out.println("sessionfactory : "+sessionFactory);
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return sessionFactory;
	}
}
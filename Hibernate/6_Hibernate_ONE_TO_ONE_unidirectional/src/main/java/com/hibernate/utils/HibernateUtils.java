package com.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Student;
import com.hibernate.model.Passport;

public class HibernateUtils{
	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = null;
		try {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(Student.class);
			configuration.addAnnotatedClass(Passport.class);
			sessionFactory =  configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			System.out.println("sessionfactory : "+sessionFactory);
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return sessionFactory;
	}
}
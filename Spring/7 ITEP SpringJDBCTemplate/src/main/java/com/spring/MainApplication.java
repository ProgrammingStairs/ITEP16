package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.dao.UserDao;
import com.spring.model.User;

public class MainApplication {
	
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userDao =  context.getBean(UserDao.class);
		
		userDao.addUser(new User(101,"Andrew Anderson","andrew@gmail.com","Indore"));
		userDao.addUser(new User(102,"Peter Parker","peter@gmail.com","Dewas"));
		userDao.addUser(new User(103,"Jackson Jack","jackson@gmail.com","Ujjain"));
		userDao.addUser(new User(104,"Mathew Math","mathew@gmail.com","Nagda"));
		userDao.addUser(new User(105,"Simon Sim","simon@gmail.com","Jabalpur"));
		System.out.println("\nData inserted successfully");
		
		userDao.updateUser(new User(102,"Peter Parker updated","peter123@gmail.com","Dewas MP"));
		System.out.println("\nData updated successfully");
		
		userDao.deleteUser(103);
		System.out.println("\nData deleted successfully");
		
		User user = userDao.getUser(104);
		System.out.println("\nUser : "+user);
		
		List<User> users = userDao.getAllUser();
		System.out.println("\nAll users \n");
		for(User u : users) {
			System.out.println("User : "+u);		
		}
	}
}

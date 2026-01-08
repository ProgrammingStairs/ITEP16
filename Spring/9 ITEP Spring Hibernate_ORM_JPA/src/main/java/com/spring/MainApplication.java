package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.model.User;
import com.spring.service.UserService;

public class MainApplication {
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService service =  context.getBean(UserService.class);
		
		try {
			User user1 = new User("Andrew Anderson","andrew@gmail.com","Indore");
			service.addUserService(user1);
			
			User user2 = new User("Andrew Anderson","andrew@gmail.com","Indore");
			service.addUserService(user2);

			User user3 = new User("Peter Parker","peter@gmail.com","Indore");
			service.addUserService(user3);

			User u = service.getUserByIdService(1);
			u.setUsername("Andrew Andy");
			u.setEmail("andrew@gmail.com");
			u.setAddress("Indore");
			service.updateUserService(u);
						
			User view = service.getUserByIdService(3);
			System.out.println("\nView User : "+view);
			
			List<User> allUsers = service.getAllUserService();
			System.out.println("\nAll Users List ");
			for(User us : allUsers) {
				System.out.println(us);
			}
			
			System.out.println("Before delete operation");
			service.deleteUserService(2);
			System.out.println("After delete operation");			

		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
	}
}

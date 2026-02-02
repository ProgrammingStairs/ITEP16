package com.springboot.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.entity.User;

@Repository
public class UserRepository {
	
	public List<User> list = new ArrayList<User>();
	
	public UserRepository() {
		list.add(new User(101,"Peter Parker","peter@gmail.com","peter@123","Male",Arrays.asList("Cricket","BasketBall","Hockey")));
		User u = new User(102,"Andrew Anderson","andrew@gmail.com","andrew@123","Male",Arrays.asList("FootBall","Hockey"));
		list.add(u);
	}
	
	public List<User> findAll(){
		return list;
	}
	
	public User save(User user) {
		list.add(user);
		return user;
	}
	
	public User findById(int id) {
		return list.stream()
				.filter(obj-> obj.getUid()==id)
				.findFirst()
				.orElse(null);
	}
	
	public User update(int uid , User user) {
		User existing = findById(uid);
		if(existing!=null) {
			existing.setUid(user.getUid());
			existing.setUsername(user.getUsername());
			existing.setEmail(user.getEmail());
			existing.setPassword(user.getPassword());
			existing.setGender(user.getGender());
			existing.setHobbies(user.getHobbies());
		}
		return user;
	}
	
	public boolean delete(int id) {
		User existing = findById(id);
		boolean status = false;
		if(existing!=null) {
			status = list.removeIf(obj-> obj.getUid()==id);
		}
		return status;
	}
}
















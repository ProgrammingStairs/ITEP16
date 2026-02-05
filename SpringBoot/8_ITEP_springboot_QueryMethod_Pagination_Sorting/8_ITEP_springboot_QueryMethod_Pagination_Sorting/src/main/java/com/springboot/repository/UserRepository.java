package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
/*
  Some Predefined methods : 
  		a. findById
  		b. findAll 
  		c. findAll(Pageable pageable)
  		d. count
  		e. deleteById 
  		f. save etc
*/

// Here we are going to deal with some custom or userdefined query methods	
	
	 List<User> findByUsername(String username);
	 List<User> findByGender(String gender);
	 List<User> findByAddress(String address);
	 
	 List<User> findByHobbies(String hobby);
	 List<User> findByGenderAndAddress(String gender, String address);
	 List<User> findByGenderOrAddress(String gender, String address);
	 List<User> findByGenderNot(String gender);
	 
	 List<User> findByUsernameContaining(String username);
	 List<User> findByUsernameIgnoreCase(String username);
	 List<User> findByUsernameContainingIgnoreCase(String username);
	 
	 
}



















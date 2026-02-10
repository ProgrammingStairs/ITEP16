package com.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.entity.User;

public interface UserService {
	
	 User addUser(User user);
	 List<User> findUserByUsername(String username);
	 List<User> findUserByGender(String gender);
	 List<User> findUserByAddress(String address);

	 List<User> findUserByHobbies(String hobby);
	 List<User> findUserByGenderAndAddress(String gender, String address);
	 List<User> findUserByGenderOrAddress(String gender, String address);
	 List<User> findUserByGenderNot(String gender);
	 
	 List<User> findUserByUsernameContaining(String username);
	 List<User> findUserByUsernameIgnoreCase(String username);
	 List<User> findUserByUsernameContainingIgnoreCase(String username);

	 List<User> findUserByAddressIn(List<String> address);
	 List<User> findUserByGenderOrderByAddressAsc(String gender);
	 
	 Page<User> findUserByPagination(int page,int size);
	 Page<User> findUserBySorting(String field);
	 Page<User> findUserByPaginationAndSorting(int page,int size,String field);
	 Page<User> findUserByGender(String gender,int page,int size);
	 
	 List<User> searchUserByAddress(@Param("address") String address);
	 List<User> searchUserByGender(@Param("gender") String gender);
	 List<User> searchUserByHobby(@Param("hobby") String hobby);
	 List<User> searchUserByAddressAgain(@Param("address") String address);
	 
}

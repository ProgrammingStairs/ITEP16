package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.User;

@Repository
public class UserDao {
	
	private JdbcTemplate jdbcTemplate;
	public UserDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void addUser(User user) {
		String query = "insert into mytable(username,email,address) values(?,?,?)";
		jdbcTemplate.update(query,user.getUsername(),user.getEmail(),user.getAddress());
	}
	
	public void addAuditLog(String message) {
		String query = "insert into myauditlog(auditmessage) value(?)";
		jdbcTemplate.update(query,message);
	}
}

package com.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  
@Table(name="user3") 
public class User{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uid") 
	int uid;

	@Column(name="username") // jpa annotation
	String username;
	
	@Column(name="email") // jpa annotation
	String email;
	
	@Column(name="password") // jpa annotation
	String password;
	
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
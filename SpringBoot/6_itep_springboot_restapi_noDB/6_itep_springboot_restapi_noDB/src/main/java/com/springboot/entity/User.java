package com.springboot.entity;

import java.util.List;

public class User {
	private int uid;
	private String username, email, password, gender;
	private List<String> hobbies;
	
	public User() {
		super();
	}
	
	public User(int uid, String username, String email, String password, String gender, List<String> hobbies) {
		super();
		this.uid = uid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.hobbies = hobbies;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
}

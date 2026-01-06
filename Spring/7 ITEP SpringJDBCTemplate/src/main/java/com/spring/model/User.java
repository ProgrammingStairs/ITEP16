package com.spring.model;

public class User {
	private int uid;
	private String username,email,address;
	public User() {}
	public User(int uid, String username, String email, String address) {
		super();
		this.uid = uid;
		this.username = username;
		this.email = email;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", email=" + email + ", address=" + address + "]";
	}
	
	
}

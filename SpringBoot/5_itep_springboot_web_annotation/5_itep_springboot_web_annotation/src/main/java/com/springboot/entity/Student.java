package com.springboot.entity;

public class Student {
	
	private int sid;
	private String username;
	private String email;
	private String password;
	private String address;
	
	public Student(int sid, String username, String email, String password, String address) {
		super();
		this.sid = sid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}

package com.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="user_mvc")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int uid;

	@NotBlank(message="Username Required")
	@Column(name="username")
	String username;
	
	@NotBlank(message="Email Required")
	@Email(message="Please Enter Valid Email")
	@Column(name="email")
	String email;

	@NotBlank(message="Password Required")
	@Pattern(regexp="^(?=.+?[0-9])(?=.+?[A-Z])(?=.+?[a-z])(?=.+?[~!@#$%^&*()_+]).{8}$", message="Password must contains one special character, one digit, one uppercase, one lowercase and it should be 8 characters in length")
	@Column(name="password")
	String password;

	@NotBlank(message="Gender Required")
	@Column(name="gender")
	String gender;

	@NotBlank(message="Hobbies Required")
	@Column(name="hobbies")
	String hobbies;

	@NotBlank(message="Subject Required")
	@Column(name="subject")
	String subject;

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

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
}



















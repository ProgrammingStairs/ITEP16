package com.hibernate.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity    // jpa annotation
@Table(name="user2") // jpa annotation
public class User{
	
//	@Id // jpa annotation
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // JPA Annotation
//	@Column(name="uid") // jpa annotation
//	int uid;

	@Id // jpa annotation
	@GenericGenerator(name="uuid_gen",strategy="uuid2") // hibernate annotation
	@GeneratedValue(generator = "uuid_gen") // jpa annotation
	@Column(name="uid") // jpa annotation
	String uid;

	// uuid gives 32 chars
	// uuid2 gives 36 chars
	
	
	@Column(name="username") // jpa annotation
	String username;
	
	@Column(name="email") // jpa annotation
	String email;
	
	@Column(name="password") // jpa annotation
	String password;
	
	@CreationTimestamp // hibernate annotation
	@Column(name="createdat") // jpa annotation
	LocalDateTime createdat;
	
	@UpdateTimestamp // hibernate annotation
	@Column(name="updatedat") // jpa annotation
	LocalDateTime updatedat;

	public LocalDateTime getCreatedat() {
		return createdat;
	}

	public void setCreatedat(LocalDateTime createdat) {
		this.createdat = createdat;
	}

	public LocalDateTime getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(LocalDateTime updatedat) {
		this.updatedat = updatedat;
	}

	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
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
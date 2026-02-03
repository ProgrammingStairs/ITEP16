package com.springboot.entity;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="user_rest")
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	@NotBlank(message="Username Required")
	@Size(min=3,message="Username must contains atleast 3 Characters")
	@Column(name="username")
	private String username;

	@NotBlank(message="Email Required")
	@Email(message="Please enter valid Email")
	@Column(name="email")
	private String email;
	
	@NotBlank(message="Password Required")
	@Column(name="password")
	private String password;
	
	@NotBlank(message="Gender Required")
	@Column(name="gender")
	private String gender;
	
	@ElementCollection
	@NotEmpty(message="Mention atleast One Hobby")
	@CollectionTable(
		name="user_rest_hobbies",
		joinColumns = @JoinColumn(name="user_id")
	)
	@Column(name="hobbies")
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

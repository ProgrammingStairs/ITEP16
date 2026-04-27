package com.springboot.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="seller")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sellerid;
	
	@Column(name="shopname")
	private String shopname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="gstno")
	private String gstno;
	
	@Column(name="panno")
	private String panno;
	
	@Column(name="address")
	private String address;
	
	@Column(name="accountno")
	private String accountno;
	
	@Column(name="sellerstatus")
	private String sellerstatus="Active";
	
	@Column(name="emailVerify")
	private String emailVerify="Not Verified";
	
	@Column(name="adminVerify")
	private String adminVerify="Not Verified";
	
	@Column(name="createdat",updatable = false)
	@CreationTimestamp
	private LocalDateTime createdat;
	
	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalDateTime updatedat;
}

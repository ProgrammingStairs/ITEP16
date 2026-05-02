package com.springboot.entity;

import java.time.LocalDateTime;

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
@Table(name="validatetoken")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidateToken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vid;
	
	@Column(name="email")
	private String email;
	
	@Column(name="token")
	private String token;
	
	@Column(name="expirytime")
	private LocalDateTime expirytime;
}

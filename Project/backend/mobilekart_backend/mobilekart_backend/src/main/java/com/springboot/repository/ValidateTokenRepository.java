package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.ValidateToken;

public interface ValidateTokenRepository extends JpaRepository<ValidateToken, Integer> {
	ValidateToken findByToken(String token);
}

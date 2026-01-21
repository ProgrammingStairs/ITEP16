package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Integer> {
	public VerificationToken findByToken(String token);
}

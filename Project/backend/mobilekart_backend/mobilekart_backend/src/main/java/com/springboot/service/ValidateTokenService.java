package com.springboot.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springboot.entity.ValidateToken;
import com.springboot.repository.ValidateTokenRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ValidateTokenService {
	private ValidateTokenRepository validateTokenRepository;
	public ValidateTokenService(ValidateTokenRepository validateTokenRepository) {
		this.validateTokenRepository = validateTokenRepository;
	}
	public String createValidationToken(String email) {
		ValidateToken vt = new ValidateToken();
		String token = UUID.randomUUID().toString();
		vt.setToken(token);
		vt.setEmail(email);
		vt.setExpirytime(LocalDateTime.now().plusHours(24));
		validateTokenRepository.save(vt);
		return token;
	}
	
	public ValidateToken findByToken(String token) {
		return validateTokenRepository.findByToken(token);
	}
}

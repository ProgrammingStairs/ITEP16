package com.spring.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.spring.entity.User;
import com.spring.entity.VerificationToken;
import com.spring.repository.VerificationTokenRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class VerificationTokenService {
	
	private VerificationTokenRepository verificationTokenRepository;
	public VerificationTokenService(VerificationTokenRepository verificationTokenRepository) {
		this.verificationTokenRepository = verificationTokenRepository;
	}
	
	public String createVerificationToken(User user) {
		VerificationToken vt = new VerificationToken();
		
		String token = UUID.randomUUID().toString();
		vt.setToken(token);
		vt.setUser(user);
		vt.setLocalDateTime(LocalDateTime.now().plusHours(24));
		
		verificationTokenRepository.save(vt);
		return token;
	}
	
	public VerificationToken findByToken(String token) {
		return verificationTokenRepository.findByToken(token);
	}
}

package com.springboot.service;

import java.security.Key;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {
	
	String data = "qwertyuio12345678asdfghjkzxcvbnm";
	public String generateToken(String email,String role) {
		Key key = Keys.hmacShaKeyFor(data.getBytes());
		return Jwts.builder()
					.setSubject(email)
					.addClaims(Map.of("role",role))
					.setIssuedAt(new Date())
					.setExpiration(new Date(System.currentTimeMillis()+24*60*60*1000))
					.signWith(key, SignatureAlgorithm.HS256)
					.compact();
	}
	
	public Claims validateToken(String token) {
		Key key = Keys.hmacShaKeyFor(data.getBytes());
		return Jwts.parserBuilder()
				   .setSigningKey(key)
				   .build()
				   .parseClaimsJws(token)
				   .getBody();
	}
}


















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
	
	private final String DATA = "qwertyuiop12345678wertyuivbn567fghj";
	public String generateToken(String email,String role) {
		Key key = Keys.hmacShaKeyFor(DATA.getBytes());
		return Jwts.builder()
				   .setSubject(email)
				   .addClaims(Map.of("role",role))
				   .setIssuedAt(new Date())
				   .setExpiration(new Date(System.currentTimeMillis()+600000))
				   .signWith(key, SignatureAlgorithm.HS256)
				   .compact();
	}
	
	public Claims validateToken(String token) {
		Key key = Keys.hmacShaKeyFor(DATA.getBytes());
		return Jwts.parserBuilder()
				   .setSigningKey(key)
				   .build()
				   .parseClaimsJws(token)
				   .getBody();
	}
}

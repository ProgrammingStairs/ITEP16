package com.springboot.service;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

// https://dev.to/mayank_tamrkar/jwt-vs-jws-vs-jwe-whats-the-difference-when-to-use-each-16l2
// https://www.geeksforgeeks.org/web-tech/json-web-token-jwt/
 
@Service
public class JwtService {
	private final String SECRET = "qwertyuioasdfghj23456789zxcvbnm5678ty";
	
	public String generateToken(String username) {
		Key key =  Keys.hmacShaKeyFor(SECRET.getBytes());
		return Jwts.builder()
					.setSubject(username)
					.setIssuedAt(new Date())
					.setExpiration(new Date(System.currentTimeMillis()+600000))
					.signWith(key, SignatureAlgorithm.HS256)
					.compact();
	}

	public boolean validateToken(String token) {
		try {
			Key key =  Keys.hmacShaKeyFor(SECRET.getBytes());
			Jwts.parserBuilder()
				.setSigningKey(key)
				.build()
				.parseClaimsJws(token);
				
			return true;
		}catch(Exception e) {
			System.out.println("Exception : "+e);
			return false;
		}
	}
}


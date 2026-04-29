package com.springboot.filter;

import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.HandlerExceptionResolver;

import com.springboot.exception.JwtCustomException;
import com.springboot.service.JwtService;

import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter{
	
	private JwtService jwtService;
	private HandlerExceptionResolver handlerExceptionResolver;
	public JwtFilter(JwtService jwtService,HandlerExceptionResolver handlerExceptionResolver) {
		this.jwtService = jwtService;
		this.handlerExceptionResolver=handlerExceptionResolver;
	}
	@Override
	public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) {
		System.out.println("gets entry in filter...............");
		try {
			String token = "";
			Cookie cookies[] = request.getCookies();
			if(cookies!=null) {
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals("jwtToken")) {
						token = cookie.getValue(); 
					}
				}
			}
			
			if(token!=null && !token.isEmpty()) {
				Claims claim = jwtService.validateToken(token);
				String email = claim.getSubject();
				String role = claim.get("role",String.class);
				
				String path = request.getRequestURI();
				if(path.startsWith("/user") && !role.equals("ROLE_USER")) {
					throw new JwtCustomException("Something went wrong in User route");
				}
				if(path.startsWith("/admin") && !role.equals("ROLE_ADMIN")) {
					throw new JwtCustomException("Something went wrong in Admin route");
				}
				if(path.startsWith("/seller") && !role.equals("ROLE_SELLER")) {
					throw new JwtCustomException("Something went wrong in Seller route");
				}
				
				UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
						email, null , List.of(new SimpleGrantedAuthority(role)));
				
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
			chain.doFilter(request, response);
			
		}catch(Exception e) {
			System.out.println("Exception in JwtFilter : "+e);
			handlerExceptionResolver.resolveException(request, response, null, e);
		}
	}
}

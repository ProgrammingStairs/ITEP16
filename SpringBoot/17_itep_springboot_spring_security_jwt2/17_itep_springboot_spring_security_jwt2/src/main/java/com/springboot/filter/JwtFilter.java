package com.springboot.filter;

import java.io.IOException;
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
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter{
	private JwtService jwtService;
	private HandlerExceptionResolver handlerExceptionResolver;
	public JwtFilter(JwtService jwtService,HandlerExceptionResolver handlerExceptionResolver) {
		this.jwtService = jwtService;
		this.handlerExceptionResolver = handlerExceptionResolver;
	}
	@Override 
	public void doFilterInternal(HttpServletRequest request,HttpServletResponse response, FilterChain chain)	{
		try {
			String tk = request.getHeader("Authorization");
			if(tk!=null && tk.startsWith("Bearer ")) {
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>> "+tk);
				String token = tk.substring(7);
				Claims claim = jwtService.validateToken(token);
				String email = claim.getSubject();
				String role = claim.get("role", String.class);
				
				String path = request.getRequestURI();
				System.out.println("################ "+path);
				
				if(path.startsWith("/admin") && !role.equals("ADMIN")) {
					throw new JwtCustomException("Invalid url with respect to role");
				}
				if(path.startsWith("/user") && !role.equals("USER")) {
					throw new JwtCustomException("Invalid url with respect to role");
				}
				
				UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
						email, 
						null,
						List.of(new SimpleGrantedAuthority("ROLE_"+role))
				);
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
			chain.doFilter(request, response);
		}catch(Exception ex) {
			System.out.println("Exception : "+ex);
			handlerExceptionResolver.resolveException(request, response, null, ex);
		}
	}
}

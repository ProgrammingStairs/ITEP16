package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.springboot.service.CustomUserDetailsService;

@Configuration
public class SpringSecurityConfig {
	private CustomUserDetailsService customUserDetailsService;
	public SpringSecurityConfig(CustomUserDetailsService customUserDetailsService) {
		this.customUserDetailsService = customUserDetailsService;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(customUserDetailsService);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.csrf(csrf->csrf.disable())
			.authorizeHttpRequests(auth-> auth
					.requestMatchers("/").permitAll()
					.requestMatchers("/admin/**").hasRole("ADMIN")
					.requestMatchers("/user/**").hasAnyRole("ADMIN","USER")
					.anyRequest().authenticated()
			)
			.formLogin(form-> form
					.loginPage("/login")
					.loginProcessingUrl("/doLogin")
					.defaultSuccessUrl("/home",true)
					.failureUrl("/login?error=true")
					.permitAll()
			)
			.logout(logout-> logout
					.logoutUrl("/logout")
					.logoutSuccessUrl("/login?status=true")
					.invalidateHttpSession(true)
					.clearAuthentication(true)
					.permitAll()
			);
			
		return http.build();
	}
	
}

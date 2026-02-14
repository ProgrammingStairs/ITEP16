package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

	@Bean
	public SecurityFilterChain doInternalFilter(HttpSecurity http) throws Exception {
		http
			.csrf(csrf->csrf.disable())
			.authorizeHttpRequests(auth-> auth
					.requestMatchers("/admin/**").hasRole("ADMIN")
					.requestMatchers("/user/**").hasAnyRole("ADMIN","USER")
					.anyRequest().authenticated()
			)
			.httpBasic(Customizer.withDefaults());
			
		return http.build();
	}
	
}

package com.springboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppRepository {
	
	public String repositoryMessage() {
		return "This is repository method";
	}
}

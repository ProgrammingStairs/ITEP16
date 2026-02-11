package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByEmail(String email);
}

/*
 Note : Needs to put @EnableJpaRepositories("com.spring.repository")  on HibernateConfig.class
 */
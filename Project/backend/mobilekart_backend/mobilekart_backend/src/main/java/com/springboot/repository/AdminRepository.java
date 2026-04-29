package com.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	    Optional<Admin> findByEmail(String email);
	    boolean existsByEmail(String email);
}

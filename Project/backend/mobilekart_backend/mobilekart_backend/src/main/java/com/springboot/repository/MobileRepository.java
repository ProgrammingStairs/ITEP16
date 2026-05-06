package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer>{
	
}

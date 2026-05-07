package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer>{
	List<Mobile> findBySellerId(int id);
}

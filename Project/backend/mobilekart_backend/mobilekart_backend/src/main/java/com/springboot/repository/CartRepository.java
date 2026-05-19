package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
	Cart findByVariantid(int vid);
	List<Cart> findByUserid(int id);
	void deleteByUserid(int id);
}

package com.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
	Optional<Seller> findByEmail(String email);
    boolean existsByEmail(String email);
}

package com.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.MobileVariant;

public interface MobileVariantRepository extends JpaRepository<MobileVariant, Integer> {
//	Optional<MobileVariant> findByMobilevariantid(int id);
}


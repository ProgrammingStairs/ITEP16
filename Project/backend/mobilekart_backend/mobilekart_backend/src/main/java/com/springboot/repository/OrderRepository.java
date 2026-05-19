package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
	List<Orders> findByUserid(int id);
}

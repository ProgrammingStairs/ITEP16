package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.entity.Product;
import com.springboot.repository.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product findProduct(int id) {
		return productRepository.findById(id).orElse(null);
	}
}

package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Product;
import com.springboot.service.ProductService;

@RestController
public class ProductController {
	
	private ProductService productService;
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/")
	public String home() {
		return "<h2>Welcome to Home Page</h2>";
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping("/findProductById/{id}")
	public Product findProductById(@PathVariable("id") int id) {
		return productService.findProduct(id);
	}
}

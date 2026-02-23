package com.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.dto.Product;
import com.springboot.dto.User;

@Service
public class OrderService {
	private RestTemplate restTemplate;
	public OrderService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	public User getUser(int pid) {
		Product pobj = restTemplate.getForObject("http://localhost:8082/findProductById/"+pid, Product.class);
		int uid = pobj.getUid();
		User uObj = restTemplate.getForObject("http://localhost:8081/findUserById/"+uid, User.class);
		return uObj;
	}
}

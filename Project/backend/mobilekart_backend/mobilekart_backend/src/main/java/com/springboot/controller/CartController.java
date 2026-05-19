package com.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.CartResponseDTO;
import com.springboot.entity.User;
import com.springboot.repository.UserRepository;
import com.springboot.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	private CartService cartService;
	private UserRepository userRepository;	
	public CartController(UserRepository userRepository,CartService cartService) {
		this.userRepository = userRepository;
		this.cartService = cartService;
	}
	@GetMapping("/viewCart")
	public ResponseEntity<List<CartResponseDTO>> viewCart(Authentication authentication){
		String email = authentication.getName();
		User userObj = userRepository.findByEmail(email)
			.orElseThrow(()-> new RuntimeException("User not found"));
		List<CartResponseDTO> response = cartService.viewCartList(userObj.getUserid());
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	@GetMapping("/removeItem/{cartid}")
	public String removeItem(@PathVariable("cartid") int cartid) {
		String message = cartService.removeCartItem(cartid);
		return message;
	}
}

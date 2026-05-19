package com.springboot.service;

import java.util.List;

import com.springboot.dto.CartResponseDTO;

public interface CartService {
	List<CartResponseDTO> viewCartList(int id);
	String removeCartItem(int cartid);
}

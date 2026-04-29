package com.springboot.dto;

import lombok.Data;

@Data
public class CartRequestDTO {
	private int userid;
	private int variantid;
	private int quantity;
	private double price;
}

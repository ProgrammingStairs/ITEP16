package com.springboot.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CartResponseDTO {
	private int cartid;
	private int userid;
	private int variantid;
	private int quantity;
	private double price;
	private String brand;
	private String modelName;
	private LocalDateTime createdat;
	private LocalDateTime updatedat;
	public CartResponseDTO(int cartid, int userid, int variantid, int quantity, double price, String brand,
			String modelName) {
		super();
		this.cartid = cartid;
		this.userid = userid;
		this.variantid = variantid;
		this.quantity = quantity;
		this.price = price;
		this.brand = brand;
		this.modelName = modelName;
	}

	
}

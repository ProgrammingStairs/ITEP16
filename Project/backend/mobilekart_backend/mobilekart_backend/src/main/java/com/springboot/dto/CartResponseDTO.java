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
}

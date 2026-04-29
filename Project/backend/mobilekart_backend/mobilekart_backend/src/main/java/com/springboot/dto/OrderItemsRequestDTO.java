package com.springboot.dto;

import lombok.Data;

@Data
public class OrderItemsRequestDTO {
	private int orderid;
	private int variantid;
	private int quantity;
	private double price;
	private double totalprice;
	private String brand;
	private String modelname;
}

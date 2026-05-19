package com.springboot.dto;

import com.springboot.entity.OrderItems;

import lombok.Data;

@Data
public class OrderItemsResponseDTO {
	private int orderitemsid;
	private int orderid;
	private int variantid;
	private int quantity;
	private double price;
	private double totalprice;
	private String brand;
	private String modelname;
	public OrderItemsResponseDTO(OrderItems orderItems) {
		super();
		this.orderitemsid = orderItems.getOrderitemsid();
		this.variantid = orderItems.getVariantid();
		this.quantity = orderItems.getQuantity();
		this.price = orderItems.getPrice();
		this.totalprice = orderItems.getTotalprice();
	}
	
	
}

package com.springboot.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class OrderResponseDTO {
	private int orderid;
	private int userid;
	private double totalamount;
	private String orderstatus;
	private String paymentstatus;
	private String paymentmethod;
	private String address;
	private String city;
	private String state;
	private String pincode;
	private LocalDateTime createdat;
	private LocalDateTime updatedat;
	private List<OrderItemsResponseDTO> orderitems = new ArrayList<OrderItemsResponseDTO>();

}

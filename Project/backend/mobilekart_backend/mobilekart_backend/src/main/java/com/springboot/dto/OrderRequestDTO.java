package com.springboot.dto;

import java.util.ArrayList;
import java.util.List;


import lombok.Data;

@Data
public class OrderRequestDTO {
	private int userid;
	private double totalamount;
	private String address;
	private String city;
	private String state;
	private String pincode;
	
	private List<OrderItemsRequestDTO> orderitems = new ArrayList<OrderItemsRequestDTO>();

}

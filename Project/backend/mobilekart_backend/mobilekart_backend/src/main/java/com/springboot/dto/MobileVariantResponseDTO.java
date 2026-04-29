package com.springboot.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MobileVariantResponseDTO {
	private int mobilevariantid;
	private double price;
	private double discountprice;
	private int stock;
	private String sku;
	private String color;
	private String ram;
	private String storage;
	private String processor;
	private String displaysize;
	private String displaytype;
	private String battery;
	private String operatingsystem;
	private String rearcamera;
	private String frontcamera;
	private String network;
	private String simtype;
	private String weight;
	private int sellerid;
	private int mobileid;
	private String imagename;
	private String imageurl;
}

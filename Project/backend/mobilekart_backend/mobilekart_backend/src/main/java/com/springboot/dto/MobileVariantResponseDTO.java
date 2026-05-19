package com.springboot.dto;

import org.springframework.web.multipart.MultipartFile;

import com.springboot.entity.MobileVariant;

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
	
	public MobileVariantResponseDTO(MobileVariant mobileVariant) {
		this.mobilevariantid = mobileVariant.getMobilevariantid();
		this.price = mobileVariant.getPrice();
		this.discountprice=mobileVariant.getDiscountprice(); 
		this.stock=mobileVariant.getStock();
		this.sku=mobileVariant.getSku();
		this.color=mobileVariant.getColor();
		this.ram=mobileVariant.getRam();
		this.storage=mobileVariant.getStorage();
		this.processor=mobileVariant.getProcessor();
		this.displaysize=mobileVariant.getDisplaysize();
		this.displaytype=mobileVariant.getDisplaytype();
		this.battery=mobileVariant.getBattery();
		this.operatingsystem=mobileVariant.getOperatingsystem();
		this.rearcamera=mobileVariant.getRearcamera();
		this.frontcamera=mobileVariant.getFrontcamera();
		this.network=mobileVariant.getNetwork();
		this.simtype=mobileVariant.getSimtype();
		this.weight=mobileVariant.getWeight();
		this.sellerid=mobileVariant.getSellerid();
		this.mobileid=mobileVariant.getMobile().getMobileid();
		this.imagename=mobileVariant.getImagename();
		this.imageurl="http://localhost:8080/uploads/"+mobileVariant.getImagename();
	}
}

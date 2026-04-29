package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="mobilevariant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MobileVariant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mobilevariantid;
	
	@Column(name="price")
	private double price;
	
	@Column(name="discountprice")
	private double discountprice;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="sku")
	private String sku;
	
	@Column(name="color")
	private String color;
	
	@Column(name="ram")
	private String ram;
	
	@Column(name="storage")
	private String storage;
	
	@Column(name="processor")
	private String processor;
	
	@Column(name="displaysize")
	private String displaysize;

	@Column(name="displaytype")
	private String displaytype;
	
	@Column(name="battery")
	private String battery;
	
	@Column(name="operatingsystem")
	private String operatingsystem;
	
	@Column(name="rearcamera")
	private String rearcamera;
	
	@Column(name="frontcamera")
	private String frontcamera;
	
	@Column(name="network")
	private String network;
	
	@Column(name="simtype")
	private String simtype;
	
	@Column(name="weight")
	private String weight;
	
	@Column(name="imagename")
	private String imagename;
	
	@Column(name="sellerid")
	private int sellerid;
	
	@ManyToOne
	@JoinColumn(name="mobileid")
	private Mobile mobile;
}

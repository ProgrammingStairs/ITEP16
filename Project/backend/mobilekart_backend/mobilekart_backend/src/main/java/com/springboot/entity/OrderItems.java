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
@Table(name="orderitems")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItems {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderitemsid;
	
	@Column(name="orderid")
	private int orderid;
	
	@Column(name="variantid")
	private int variantid;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private double price;
	
	@Column(name="totalprice")
	private double totalprice;
	
	@Column(name="brandname")
	private String brandname;
	
	@Column(name="modelname")
	private String modelname;
	
	@ManyToOne
	@JoinColumn(name="orderid")
	private Order order;
}

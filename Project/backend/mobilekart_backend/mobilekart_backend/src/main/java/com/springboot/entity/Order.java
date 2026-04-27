package com.springboot.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderid;
	
	@Column(name="userid")
	private int userid;
	
	@Column(name="totalamount")
	private double totalamount;
	
	@Column(name="orderstatus")	
	private String orderstatus="Pending";
	
	@Column(name="paymentstatus")
	private String paymentstatus="UnPaid";
	
	@Column(name="paymentmethod")
	private String paymentmethod="COD";
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="createdat",updatable = false)
	@CreationTimestamp
	private LocalDateTime createdat;
	
	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalDateTime updatedat;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL,orphanRemoval = true)
	private List<OrderItems> orderitems = new ArrayList<OrderItems>();

	public void addOrderItems(OrderItems item) {
		orderitems.add(item);
		item.setOrder(this);
	}
	
	public void removeOrderItems(OrderItems item) {
		orderitems.remove(item);
		item.setOrder(null);
	}
	
}

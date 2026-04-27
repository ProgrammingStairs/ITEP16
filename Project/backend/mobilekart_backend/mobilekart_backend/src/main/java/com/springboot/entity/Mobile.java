package com.springboot.entity;

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
@Table(name="mobile")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mobileid;
	
	@Column(name="sellerid")
	private int sellerid;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="modelname")
	private String modelname;
	
	@Column(name="description")
	private String description;
	
	@Column(name="createdat",updatable = false)
	@CreationTimestamp
	private LocalDateTime createdat;
	
	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalDateTime updatedat;
	
	@OneToMany(mappedBy = "mobile",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<MobileVariant> variants = new ArrayList<>();
	
	public void addVariant(MobileVariant variant) {
		variants.add(variant);
		variant.setMobile(this);
	}
	
	public void removeVariant(MobileVariant variant) {
		variants.remove(variant);
		variant.setMobile(null);
	}
	
}

package com.tejas.JWT_Project.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String product_name;
	private String description;
	private long price;
	private LocalDateTime createdAt;
	
	
	
	
	public Product() {
		super();
		
	}
	
	
	public Product(int id, String product_name, String description, long price, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.description = description;
		this.price = price;
		this.createdAt = createdAt;
	}
	
	
	
	

}

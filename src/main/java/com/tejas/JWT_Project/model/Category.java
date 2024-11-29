package com.tejas.JWT_Project.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String c_name ; 
    private String description;
    private LocalDateTime createdAt;
    
    @OneToMany
    private Product product;
    
    
    
    
	public Category() {
		super();
		
	}




	public Category(int id, String c_name, String description, LocalDateTime createdAt, Product product) {
		super();
		this.id = id;
		this.c_name = c_name;
		this.description = description;
		this.createdAt = createdAt;
		this.product = product;
	}
	
	
	
	
	
	
   
	

}

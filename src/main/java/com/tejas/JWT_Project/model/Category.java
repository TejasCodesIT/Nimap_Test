package com.tejas.JWT_Project.model;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
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
    
    @OneToMany(mappedBy = "category") 
    private List<Product> products;
    
    
    @PrePersist
    public void prePersist() {
    	
        this.createdAt = LocalDateTime.now();
        
    }
  
    
	public Category() {
		super();
		
	}


	public Category(int id, String c_name, String description, LocalDateTime createdAt, List<Product> products) {
		super();
		this.id = id;
		this.c_name = c_name;
		this.description = description;
		this.createdAt = createdAt;
		this.products = products;
	}



}

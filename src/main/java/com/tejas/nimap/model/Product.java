package com.tejas.nimap.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private String description;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "c_id")
    private Category category;
 

	public Product(int id, String name, double price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}





	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}





	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
	
	
    
    
}


































//Name : - Tejas Wakchaure
//Batch : - JSD Mumbai Batch
//Mob :- 9022215242 
//Email : - wakchaurtejas66@gmail.com


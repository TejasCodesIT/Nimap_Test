package com.tejas.JWT_Project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejas.JWT_Project.model.Product;
import com.tejas.JWT_Project.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	public List<Product> getProducts() {
		
		
		return productRepository.findAll();
		
	}
	
	public String insertProduct(Product product) {
		
		
		productRepository.save(product);
		return "Product inserted";
		
	}
	
	
	public String updateProduct(Product product) {
		
		productRepository.save(product);
		
		return "Product Updated";
		
	}
	
	
	public String deleteProduct(int id) {
		
		
		
		productRepository.deleteById(id);
		
		return "Product deleted";
		
	}
	
	

}

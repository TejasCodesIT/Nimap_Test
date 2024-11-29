package com.tejas.JWT_Project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tejas.JWT_Project.model.Product;
import com.tejas.JWT_Project.services.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	
	@GetMapping
	public List<Product> getProduct(@RequestParam(value = "pageNumber" ,defaultValue = "1") int pageNumber,
			@RequestParam(value = "pageSize",  defaultValue = "2") int pageSize) {
		
		
		
		
		
		return  productService.getProducts(pageNumber,pageSize);
		
		
	}
	
	@PostMapping
	public String postProduct(@RequestBody Product product) {
		
		
		return productService.insertProduct(product) ; 
		
		
	}
	
	@PutMapping
	public String putProduct(@RequestBody Product product) {
		
		
		
		return productService.updateProduct(product);
	}
	
	@DeleteMapping
	public String deleteProduct(@RequestParam int id) {
		
		return productService.deleteProduct(id);
		
	}
	
	

}

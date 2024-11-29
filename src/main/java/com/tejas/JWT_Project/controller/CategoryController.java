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

import com.tejas.JWT_Project.model.Category;
import com.tejas.JWT_Project.services.CategoryService;

@RestController
@RequestMapping("category")
public class CategoryController {
	
	
	@Autowired
	private CategoryService categoryService;
	
	
	@GetMapping
	public List<Category> getCategory() {
		
	  return 	categoryService.getCategories();	
		
	}
	
	@PostMapping
	public String postCategory(@RequestBody Category category) {
		
		return categoryService.postCategory(category) ;
	}
	
	@PutMapping
	public String updateCategory(@RequestBody Category category) {
		
		return categoryService.updateCategory(category);
		
	}
	
	@DeleteMapping
	public String deleteByID(@RequestParam int id) {
		
		
        return categoryService.deleteCategoryById(id);
		
		
	}
	

	
	
}

















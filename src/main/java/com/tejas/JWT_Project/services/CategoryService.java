package com.tejas.JWT_Project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejas.JWT_Project.model.Category;
import com.tejas.JWT_Project.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	
	
	public List<Category> getCategories() {
		
		
		return categoryRepository.findAll();
		
	}
	
	public Optional<Category> getById(int id) {
		
		
		return categoryRepository.findById(id);
		
	}
	
	
	
	public String postCategory(Category category) {
		
		
		categoryRepository.save(category);
		
		return "inserted";
	}
	
	public String updateCategory(Category category) {
		
		categoryRepository.save(category);
		
		return "Updated" ;
		
	}
	
	public String deleteCategoryById(int id) {
		
		categoryRepository.deleteById(id);
		
		return "Deleted";
		
	}
	
	

}

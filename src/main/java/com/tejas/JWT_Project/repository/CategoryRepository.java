package com.tejas.JWT_Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tejas.JWT_Project.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
	
	

}

package com.brian.products_and_categories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brian.products_and_categories.models.Category;
import com.brian.products_and_categories.models.Product;
import com.brian.products_and_categories.repos.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;


	//Create category
	public Category createCategory(Category c) {
		return categoryRepo.save(c);
	}
	
	//Get all categories
	public List<Category> allCategories(){
		return categoryRepo.findAll();
	}
	
	//Get categories for specific product
	public List<Category> findCategoriesByProduct(Product p){
		return categoryRepo.findAllByProducts(p);
	}
	
	//Get list of categories a specific product does not belong to
	
	public List <Category> findByProductNotContains(Product p){
		return categoryRepo.findByProductsNotContains(p);
	}
	}

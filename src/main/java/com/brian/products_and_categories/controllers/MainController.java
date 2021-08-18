package com.brian.products_and_categories.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.brian.products_and_categories.models.Category;
import com.brian.products_and_categories.models.Product;
import com.brian.products_and_categories.services.CategoryService;
import com.brian.products_and_categories.services.ProdService;

@Controller
public class MainController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProdService prodService;
	
	@GetMapping("/")
	public String index(@ModelAttribute Category category, Product product) {
		return "index.jsp";
	}
	
	// New Category
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute Category category, Model model) {
		return "newCategory.jsp";
	}
	@PostMapping("/categories/new")
	public String createCategory( @ModelAttribute Category category, BindingResult res) {
		categoryService.createCategory(category);
		return "redirect:/";
	}
	
	//New Product
	@GetMapping("/products/new")
	public String newProd(@ModelAttribute Product product, Model model) {
		model.addAttribute("categories", categoryService.allCategories());
		return "newProd.jsp";
	}
	
	@PostMapping("/products/new")
	public String createprod( @ModelAttribute Product product, BindingResult res) {
		prodService.createProd(product);
		return "redirect:/";
	}
}

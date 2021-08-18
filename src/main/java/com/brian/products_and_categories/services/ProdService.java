package com.brian.products_and_categories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brian.products_and_categories.models.Product;
import com.brian.products_and_categories.repos.ProdRepo;

@Service
public class ProdService {
	
	@Autowired
	private ProdRepo prodRepo;
	
	public List <Product> allProducts(){
		return prodRepo.findAll();
	}

	public Product createProd(Product p) {
		return prodRepo.save(p);
	}

}

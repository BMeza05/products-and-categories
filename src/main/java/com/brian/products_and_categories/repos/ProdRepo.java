package com.brian.products_and_categories.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brian.products_and_categories.models.Product;

@Repository
public interface ProdRepo extends CrudRepository<Product, Long> {

	List<Product> findAll();
}

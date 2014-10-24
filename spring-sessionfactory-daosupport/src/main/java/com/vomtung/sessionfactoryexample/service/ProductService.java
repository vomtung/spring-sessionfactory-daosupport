package com.vomtung.sessionfactoryexample.service;

import com.vomtung.sessionfactoryexample.entity.Product;

public interface ProductService {
	
	void addProduct(Product product);
		
	void deleteProduct(Product product);
	
	void updateProduct(Product product);
	
	Product findbyId(Long key);
}

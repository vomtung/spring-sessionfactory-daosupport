package com.vomtung.sessionfactoryexample.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.vomtung.sessionfactoryexample.dao.ProductDAO;
import com.vomtung.sessionfactoryexample.entity.Product;
import com.vomtung.sessionfactoryexample.service.ProductService;

@Component
@Transactional
public class ProductServiceImpl implements ProductService {

	@Resource
	ProductDAO productDAO;
	
	
	@Override
	@Transactional
	public void addProduct(Product product) {
		productDAO.save(product);
	}

	@Override
	@Transactional
	public void deleteProduct(Product product) {
		productDAO.delete(product);
	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		productDAO.save(product);

	}

	@Override
	@Transactional
	public Product findbyId(Long key) {
		// TODO Auto-generated method stub
		return productDAO.findById(key);
	}

}

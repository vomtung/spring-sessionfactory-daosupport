package com.vomtung.sessionfactoryexample.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vomtung.sessionfactoryexample.entity.Product;

@Repository("ProductDAO")
@Transactional
public class ProductDAO {

	 @Resource private SessionFactory sessionFactory;
	 
	 @Transactional
	 public void save(Product product){
		 sessionFactory.getCurrentSession().saveOrUpdate(product);
	 };
	 
	 @Transactional
	 public void delete(Product product){
		 sessionFactory.getCurrentSession().delete(product);
	 };
	 
	 @Transactional
	 public Product findById(Long key){
		 return (Product)sessionFactory.getCurrentSession().get(Product.class, key);
	 };
	 
}

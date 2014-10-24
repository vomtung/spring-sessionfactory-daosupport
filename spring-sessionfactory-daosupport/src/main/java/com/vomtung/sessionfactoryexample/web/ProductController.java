package com.vomtung.sessionfactoryexample.web;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vomtung.sessionfactoryexample.entity.Product;
import com.vomtung.sessionfactoryexample.service.ProductService;

@Controller
@RequestMapping(value="/product")
public class ProductController {

	@Resource
	ProductService productService;
	
	@Transactional
	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		return "product/list";
	}
	
	@Transactional
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addProductPage(ModelMap mm){
		mm.addAttribute("product", new Product());
		return "product/add";
	}
	
	@Transactional
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addNewProduct(@ModelAttribute("product") Product product){
		productService.addProduct(product);
		return "product/list";
	}
}

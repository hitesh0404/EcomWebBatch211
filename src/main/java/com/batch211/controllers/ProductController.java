package com.batch211.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.batch211.entities.Product;
import com.batch211.services.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService service;
	
//	public ProductController(ProductService service) {
//		this.service = service;
//	}
	
	@GetMapping("/all")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	//localhost:8080/products/detail?id=12
	@PostMapping("/")
	public Product postProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}	
	
	@GetMapping("/filter")
	public String get(@RequestParam(defaultValue = "false") String outOfStock) {
		return new String("products which are out of stock"+outOfStock);
	}	
}

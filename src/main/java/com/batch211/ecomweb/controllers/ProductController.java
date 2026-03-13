package com.batch211.ecomweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.batch211.ecomweb.entities.Product;
import com.batch211.ecomweb.services.ProductService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/all")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@PostMapping("/")
	public Product postProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	@PutMapping("/{id}")
	public Product putProduct(@PathVariable int id,@RequestBody Product product) {
		return service.updateProduct(id, product);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	
	@PatchMapping("/{id}")
	public Product patchProduct(@PathVariable int id,@RequestBody Product product)
	{
		return service.updateProduct(id, product);
	}
	
	
	
}
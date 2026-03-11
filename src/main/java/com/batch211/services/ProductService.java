package com.batch211.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.batch211.entities.Product;
@Service
public class ProductService {
	List<Product> products =new ArrayList<Product>(Arrays.asList(
			new Product(1,"Soap",20),
			new Product(2, "Biscuit",10)				
			));
  
	public List<Product> getAllProducts() {
		return products;
	}
	
	public Product addProduct(Product product) {
		products.add(product);
		return product;
	}
	
	public Product updateProduct(int id,Product product) {
		for (Product p : products) {
			if(p.getId()==id) {
				if(product.getName()!=null) {
					p.setName(product.getName());
				}
				if(product.getId()>=0) {
					p.setId(product.getId());
				}
				if(product.getPrice()>=0) {
					p.setPrice(product.getPrice());
				}
			}
		}
		return product;
	}
	public boolean deleteProduct(int id) {
		int pId=0;
		for (Product p : products) {
			if(p.getId()==id) 
				pId = p.getId();
		}
		if(pId!=0) {
			products.remove(pId);
			return true;
		}
		else {
			return false;
		}
	}
}

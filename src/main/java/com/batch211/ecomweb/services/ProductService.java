package com.batch211.ecomweb.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.batch211.ecomweb.entities.Product;
@Service
public class ProductService {
	List<Product> products =new ArrayList<Product>(Arrays.asList(
			new Product(1l,"Soap",20.0),
			new Product(2l, "Biscuit",10.2)				
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
				if(product.getId()!=null) {
					p.setId(product.getId());
				}
				if(product.getPrice()!=null) {
					p.setPrice(product.getPrice());
				}
			}
		}
		return product;
	}
	public boolean deleteProduct(int id) {
		Product searchP=null;
		for (Product p : products) {
			if(p.getId()==id) 
				searchP=p;
		}
		if(searchP!=null) {
			products.remove(searchP);
			return true;
		}
		else {
			return false;
		}
	}
}

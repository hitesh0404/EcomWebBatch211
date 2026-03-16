package com.batch211.ecomweb.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.batch211.ecomweb.entities.Product;
import com.batch211.ecomweb.repositories.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo repo;
	public List<Product> getAllProducts() {
		return repo.findAll();
	}
	
	public Product addProduct(Product product) {
		return repo.save(product);
	}
	
	public Product updateProduct(int id,Product product) {
		for (Product p : repo.findAll()) {
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
				repo.save(p);
			}
		}
		
		return product;
	}
	public boolean deleteProduct(int id) {
		Product searchP=null;
		for (Product p : repo.findAll()) {
			if(p.getId()==id) 
				searchP=p;
		}
		if(searchP!=null) {
			repo.delete(searchP);
			return true;
		}
		else {
			return false;
		}
	}
}

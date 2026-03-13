package com.batch211.ecomweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batch211.ecomweb.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
	
}

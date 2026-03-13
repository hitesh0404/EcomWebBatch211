package com.batch211.ecomweb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product implements Comparable<Product>{     
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "fname")
	private String name;
	
	@Column(name = "price")
	private Double price;
	
	public Product(Long id,String name,Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.id + " " +  this.name + " " + this.price+" ₹";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Product o) {
		return (int) (this.id - o.getId());
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}

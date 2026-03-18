package com.batch211.ecomweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.batch211.ecomweb.entities.Category;

@RepositoryRestResource(path="category")
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}

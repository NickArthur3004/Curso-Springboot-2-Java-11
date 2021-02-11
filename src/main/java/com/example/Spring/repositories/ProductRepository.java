package com.example.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.Entities.Category;
import com.example.Spring.Entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

	
}

package com.markpadilha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.markpadilha.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

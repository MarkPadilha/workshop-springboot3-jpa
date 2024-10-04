package com.markpadilha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.markpadilha.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

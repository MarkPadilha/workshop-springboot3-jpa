package com.markpadilha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.markpadilha.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

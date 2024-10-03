package com.markpadilha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.markpadilha.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

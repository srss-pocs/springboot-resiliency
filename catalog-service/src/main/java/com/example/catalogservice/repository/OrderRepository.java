package com.example.catalogservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	List<Order> findByCategory(String category);

}

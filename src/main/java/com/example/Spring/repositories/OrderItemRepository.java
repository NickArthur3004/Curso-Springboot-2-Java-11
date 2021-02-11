package com.example.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.Entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}

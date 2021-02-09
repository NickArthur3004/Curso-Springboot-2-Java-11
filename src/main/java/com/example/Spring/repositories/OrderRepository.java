package com.example.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.Entities.Order;
import com.example.Spring.Entities.User;


public interface OrderRepository extends JpaRepository<Order, Long>{

	
}

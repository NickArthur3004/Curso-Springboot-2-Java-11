package com.example.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.Entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

	
}

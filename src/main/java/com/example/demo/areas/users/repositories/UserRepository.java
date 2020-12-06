package com.example.demo.areas.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.areas.users.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);	
	User findById(int id);
}

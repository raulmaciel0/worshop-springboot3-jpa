package com.virtuatech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtuatech.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

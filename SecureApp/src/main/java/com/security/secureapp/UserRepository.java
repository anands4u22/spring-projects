package com.security.secureapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Author,Long> {

	
	Author findByUsername(String username);
}

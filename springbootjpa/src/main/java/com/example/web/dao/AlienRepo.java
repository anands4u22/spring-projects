package com.example.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.web.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{
	
	public List<Alien> findByTech(String name);
}
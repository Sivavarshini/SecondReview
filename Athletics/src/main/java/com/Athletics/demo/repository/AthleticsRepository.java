package com.Athletics.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Athletics.demo.model.sports;

public interface AthleticsRepository extends JpaRepository <sports,Integer>{
	//sports findByusername(String username);
}

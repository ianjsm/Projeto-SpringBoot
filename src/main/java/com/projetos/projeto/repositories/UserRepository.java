package com.projetos.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	
}
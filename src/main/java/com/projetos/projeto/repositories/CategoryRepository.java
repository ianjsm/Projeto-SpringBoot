package com.projetos.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
}
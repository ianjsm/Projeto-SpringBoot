package com.projetos.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetos.projeto.entities.Category;
import com.projetos.projeto.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	public CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Integer id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
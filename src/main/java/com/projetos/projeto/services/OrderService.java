package com.projetos.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetos.projeto.entities.Order;
import com.projetos.projeto.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	public OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Integer id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
package com.projetos.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetos.projeto.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}

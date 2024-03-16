package com.projetos.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.projeto.entities.OrderItem;
import com.projetos.projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
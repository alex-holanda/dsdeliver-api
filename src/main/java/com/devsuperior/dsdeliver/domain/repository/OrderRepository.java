package com.devsuperior.dsdeliver.domain.repository;

import com.devsuperior.dsdeliver.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Override
    @Query("from Order o join fetch o.products")
    List<Order> findAll();
}

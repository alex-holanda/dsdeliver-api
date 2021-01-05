package com.devsuperior.dsdeliver.domain.repository;

import com.devsuperior.dsdeliver.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

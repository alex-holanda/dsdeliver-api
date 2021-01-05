package com.devsuperior.dsdeliver.domain.service;

import com.devsuperior.dsdeliver.domain.model.Order;
import com.devsuperior.dsdeliver.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findOrdersWithProducts();
    }
}

package com.devsuperior.dsdeliver.domain.service;

import com.devsuperior.dsdeliver.domain.model.Order;
import com.devsuperior.dsdeliver.domain.model.OrderStatus;
import com.devsuperior.dsdeliver.domain.model.Product;
import com.devsuperior.dsdeliver.domain.repository.OrderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductService productService;

    public List<Order> findAll() {
        return orderRepository.findOrdersWithProducts();
    }

    @Transactional
    public Order insert(Order order) {
        validOrderProducts(order);

        order.setMoment(Instant.now());
        order.setStatus(OrderStatus.PENDING);

        return orderRepository.save(order);
    }

    private void validOrderProducts(Order order) {
        order.getProducts().forEach(p -> {
            Product product = productService.find(p.getId());

            BeanUtils.copyProperties(product, p);
        });
    }
}

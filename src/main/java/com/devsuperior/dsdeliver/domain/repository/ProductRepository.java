package com.devsuperior.dsdeliver.domain.repository;

import com.devsuperior.dsdeliver.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}

package com.devsuperior.dsdeliver.domain.service;

import com.devsuperior.dsdeliver.domain.model.Product;
import com.devsuperior.dsdeliver.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return productRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    @Transactional(readOnly = true)
    public Product find(Long productId) {
        return findOrFail(productId);
    }

    private Product findOrFail(Long productId) {
        return productRepository.findById(productId)
                    .orElseThrow(() -> new RuntimeException("Não foi encontrado o produto de id " + productId));
    }
}
package com.devsuperior.dsdeliver.api.controller;

import com.devsuperior.dsdeliver.api.assembler.ProductModelAssembler;
import com.devsuperior.dsdeliver.api.model.ProductModel;
import com.devsuperior.dsdeliver.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductModelAssembler productModelAssembler;

    @GetMapping
    public ResponseEntity<List<ProductModel>> findAll() {
        List<ProductModel> productsModel = productModelAssembler.toCollectionModel(productService.findAll());

        return ResponseEntity.ok(productsModel);
    }
}

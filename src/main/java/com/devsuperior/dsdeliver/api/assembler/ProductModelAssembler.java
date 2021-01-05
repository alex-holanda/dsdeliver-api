package com.devsuperior.dsdeliver.api.assembler;

import com.devsuperior.dsdeliver.api.model.ProductModel;
import com.devsuperior.dsdeliver.domain.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductModelAssembler {

    @Autowired
    private ModelMapper mapper;

    public ProductModel toModel(Product product) {
        return mapper.map(product, ProductModel.class);
    }

    public List<ProductModel> toCollectionModel(List<Product> products) {
        return products.stream().map(this::toModel).collect(Collectors.toList());
    }
}

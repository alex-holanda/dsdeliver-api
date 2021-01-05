package com.devsuperior.dsdeliver.api.assembler;

import com.devsuperior.dsdeliver.api.model.OrderModel;
import com.devsuperior.dsdeliver.domain.model.Order;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderModelAssembler {

    @Autowired
    private ModelMapper mapper;

    public OrderModel toModel(Order order) {
        return mapper.map(order, OrderModel.class);
    }

    public List<OrderModel> toCollectionModel(List<Order> orders) {
        return orders.stream().map(this::toModel).collect(Collectors.toList());
    }
}

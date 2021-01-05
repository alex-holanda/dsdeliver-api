package com.devsuperior.dsdeliver.api.disassembler;

import com.devsuperior.dsdeliver.api.model.input.OrderInput;
import com.devsuperior.dsdeliver.domain.model.Order;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderInputDisassembler {

    @Autowired
    private ModelMapper mapper;

    public Order toDomainObject(OrderInput orderInput) {
        return mapper.map(orderInput, Order.class);
    }

    public void copyToDomainObject(OrderInput orderInput, Order order) {
        mapper.map(orderInput, order);
    }
}

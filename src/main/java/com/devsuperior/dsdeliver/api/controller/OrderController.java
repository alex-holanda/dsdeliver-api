package com.devsuperior.dsdeliver.api.controller;

import com.devsuperior.dsdeliver.api.assembler.OrderModelAssembler;
import com.devsuperior.dsdeliver.api.disassembler.OrderInputDisassembler;
import com.devsuperior.dsdeliver.api.model.OrderModel;
import com.devsuperior.dsdeliver.api.model.input.OrderInput;
import com.devsuperior.dsdeliver.domain.model.Order;
import com.devsuperior.dsdeliver.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderModelAssembler orderModelAssembler;

    @Autowired
    private OrderInputDisassembler orderInputDisassembler;

    @GetMapping
    public ResponseEntity<List<OrderModel>> findAll() {
        List<OrderModel> ordersModel = orderModelAssembler.toCollectionModel(orderService.findAll());

        return ResponseEntity.ok(ordersModel);
    }

    @PostMapping
    public ResponseEntity<OrderModel> insert(@RequestBody OrderInput orderInput) {

        Order order = orderInputDisassembler.toDomainObject(orderInput);

        order = orderService.insert(order);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{orderId}")
                .buildAndExpand(order.getId())
                .toUri();

        return ResponseEntity.created(uri).body(orderModelAssembler.toModel(order));
    }
}

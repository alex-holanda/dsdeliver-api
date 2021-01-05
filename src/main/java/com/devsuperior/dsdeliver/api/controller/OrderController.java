package com.devsuperior.dsdeliver.api.controller;

import com.devsuperior.dsdeliver.api.assembler.OrderModelAssembler;
import com.devsuperior.dsdeliver.api.model.OrderModel;
import com.devsuperior.dsdeliver.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderModelAssembler orderModelAssembler;

    @GetMapping
    public ResponseEntity<List<OrderModel>> findAll() {
        List<OrderModel> ordersModel = orderModelAssembler.toCollectionModel(orderService.findAll());

        return ResponseEntity.ok(ordersModel);
    }
}

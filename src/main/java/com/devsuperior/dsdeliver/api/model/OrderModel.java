package com.devsuperior.dsdeliver.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class OrderModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String address;

    private Double latitude;

    private Double longitude;

    private Instant moment;

    private String status;

    private List<ProductModel> products = new ArrayList<>();

    private BigDecimal total;
}

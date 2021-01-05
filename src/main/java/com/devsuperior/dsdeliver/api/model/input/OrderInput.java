package com.devsuperior.dsdeliver.api.model.input;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class OrderInput implements Serializable {

    private static final long serialVersionUID = 1L;

    private String address;

    private Double latitude;

    private Double longitude;

    private List<ProductIdInput> products;
}

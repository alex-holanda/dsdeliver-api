package com.devsuperior.dsdeliver.api.model.input;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProductIdInput implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productId;
}

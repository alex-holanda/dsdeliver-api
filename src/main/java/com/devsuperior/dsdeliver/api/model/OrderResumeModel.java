package com.devsuperior.dsdeliver.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
public class OrderResumeModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String address;

    private Double latitude;

    private Double longitude;

    private Instant moment;

    private String status;
}

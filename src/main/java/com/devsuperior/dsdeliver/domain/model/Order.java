package com.devsuperior.dsdeliver.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private Double latitude;

    private Double longitude;

    private Instant moment;

    @Enumerated(EnumType.ORDINAL)
    private OrderStatus status;

    @ManyToMany
    @JoinTable(name = "tb_order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;

    private BigDecimal total;

    public void calcularTotal() {
        this.total = BigDecimal.ZERO;

        if (products.size() > 0) {
            this.total = products
                    .stream()
                    .map(p -> p.getPrice())
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
        }

        System.out.println(this.total);
    }
}

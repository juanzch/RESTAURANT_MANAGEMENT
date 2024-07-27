package com.riwi.restaurant_management.domain.entities;


import com.riwi.restaurant_management.utils.enums.TypeProduct;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity(name = "product")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;
    @Column(nullable = false)
    private TypeProduct type;

    @OneToMany(mappedBy = "product_id",cascade = CascadeType.ALL,orphanRemoval = false,fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<OrderProduct> orderProducts;


}

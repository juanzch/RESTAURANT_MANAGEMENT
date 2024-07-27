package com.riwi.restaurant_management.domain.entities;


import com.riwi.restaurant_management.utils.enums.PaymentType;
import com.riwi.restaurant_management.utils.enums.TypeProduct;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity(name = "ordered")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private PaymentType payment_type;
    @Column(nullable = false, scale = 2)
    private BigDecimal total_price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;


    @EqualsAndHashCode.Exclude // @121312312
    @OneToMany(
            fetch = FetchType.EAGER,
            mappedBy = "order",
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private List<OrderProduct> orderProducts;
}

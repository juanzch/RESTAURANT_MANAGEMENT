package com.riwi.Restaurant_Management_denifity.domain.entities;


import com.riwi.Restaurant_Management_denifity.utils.enums.PaymentType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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

    @Column(nullable = false)
    private LocalDateTime date;

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

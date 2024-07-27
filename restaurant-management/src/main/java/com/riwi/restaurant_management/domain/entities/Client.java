package com.riwi.restaurant_management.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "client")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String cc;
    @Column(nullable = false)
    private String full_name;

    @OneToMany(mappedBy = "client_id",cascade = CascadeType.ALL,orphanRemoval = false,fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Order> orders;
}

package com.riwi.Restaurant_Management_denifity.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "client")
@Getter
@Setter
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

    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL,orphanRemoval = false,fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    private List<Order> orders;
}

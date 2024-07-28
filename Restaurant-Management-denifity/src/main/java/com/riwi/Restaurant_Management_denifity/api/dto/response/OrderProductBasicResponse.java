package com.riwi.Restaurant_Management_denifity.api.dto.response;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OrderProductBasicResponse {
    
    private int quantity;
    private BigDecimal total_price;

}

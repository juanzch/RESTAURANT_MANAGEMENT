package com.riwi.Restaurant_Management_denifity.api.dto.response;

import java.math.BigDecimal;

import com.riwi.Restaurant_Management_denifity.utils.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    
    private Long id;
    private PaymentType payment_type;
    private BigDecimal total_price;
    private ClientBasicResponse client;
    private OrderProductBasicResponse orderProduct;

}

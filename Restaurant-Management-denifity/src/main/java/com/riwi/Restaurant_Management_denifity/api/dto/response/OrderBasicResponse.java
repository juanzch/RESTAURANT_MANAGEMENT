package com.riwi.Restaurant_Management_denifity.api.dto.response;
import java.math.BigDecimal;
import java.util.List;

import com.riwi.Restaurant_Management_denifity.utils.enums.PaymentType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OrderBasicResponse{

    private Long id;
    private PaymentType payment_type;
    private Boolean status;
    private List<OrderProductBasicResponse> orderProduct;

}

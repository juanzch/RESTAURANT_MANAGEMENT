package com.riwi.Restaurant_Management_denifity.api.dto.request;

import java.math.BigDecimal;

import com.riwi.Restaurant_Management_denifity.utils.enums.PaymentType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    @NotBlank(message = "Payment is required")
    private PaymentType payment_type;
    @NotNull(message = "total price is required")
    private BigDecimal total_price;
    @NotNull(message = "Id is required")
    private Long clientId;

}

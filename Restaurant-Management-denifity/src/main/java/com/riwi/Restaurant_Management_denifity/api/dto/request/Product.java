package com.riwi.Restaurant_Management_denifity.api.dto.request;

import java.math.BigDecimal;

import com.riwi.Restaurant_Management_denifity.utils.enums.TypeProduct;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    
    @NotNull(message = "Price is required")
    private BigDecimal price;
    @NotNull(message = "Type is required")
    private TypeProduct type;

}

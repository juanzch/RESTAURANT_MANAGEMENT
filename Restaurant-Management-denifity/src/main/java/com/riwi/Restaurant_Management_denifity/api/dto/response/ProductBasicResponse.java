package com.riwi.Restaurant_Management_denifity.api.dto.response;

import java.math.BigDecimal;

import com.riwi.Restaurant_Management_denifity.utils.enums.TypeProduct;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ProductBasicResponse {
    
    private Long id;
    private String name;
    private BigDecimal price;
    private TypeProduct type;

}

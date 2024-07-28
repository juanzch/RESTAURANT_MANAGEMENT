package com.riwi.Restaurant_Management_denifity.api.dto.response;


import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OrderProductResponse extends OrderProductBasicResponse {

    private ProductBasicResponse productBasicResponse;

}

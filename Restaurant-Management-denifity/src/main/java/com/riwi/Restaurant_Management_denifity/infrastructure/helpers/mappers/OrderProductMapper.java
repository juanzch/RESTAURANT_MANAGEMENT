package com.riwi.Restaurant_Management_denifity.infrastructure.helpers.mappers;

import com.riwi.Restaurant_Management_denifity.domain.entities.OrderProduct;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderProductMapper extends  GenericMapper<OrderProductRequest, OrderProductResponse, OrderProduct>{
}

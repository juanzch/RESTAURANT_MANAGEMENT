package com.riwi.Restaurant_Management_denifity.infrastructure.helpers.mappers;

import com.riwi.Restaurant_Management_denifity.domain.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper extends GenericMapper<OrderRequest, OrderResponse, Order>{
}

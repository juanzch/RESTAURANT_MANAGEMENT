package com.riwi.Restaurant_Management_denifity.infrastructure.helpers.mappers;

import com.riwi.Restaurant_Management_denifity.domain.entities.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends GenericMapper<ProductRequest,ProductResponse, Product>{
}

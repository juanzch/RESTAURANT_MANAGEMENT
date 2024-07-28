package com.riwi.Restaurant_Management_denifity.infrastructure.helpers.mappers;

import org.mapstruct.MapperConfig;

@MapperConfig
public interface GenericMapper<RqDTO,RsDTO,E> {
    E toEntity(RqDTO dto);
    RsDTO toDto(E entity);
}

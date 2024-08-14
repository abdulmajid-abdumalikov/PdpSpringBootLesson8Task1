package com.malikov.springbootlesson8task1.car;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID().toString())")
    Car toEntity(CarDTO carDTO);

    CarDTO toDTO(Car car);
}

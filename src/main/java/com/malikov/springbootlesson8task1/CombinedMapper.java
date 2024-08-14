package com.malikov.springbootlesson8task1;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CombinedMapper {
    CombinedMapper INSTANCE = Mappers.getMapper(CombinedMapper.class);

    @Mapping(expression = "java(dto1.getFirstName() + \" \" + dto1.getLastName())", target = "fullName")
    CombinedDTO toCombinedDTO(DTO1 dto1, DTO2 dto2);
}

package com.malikov.springbootlesson8task1.sourceDestination;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SourceDestinationMapper1 {
    SourceDestinationMapper1 INSTANCE = Mappers.getMapper(SourceDestinationMapper1.class);

    Destination sourceToDestination(Source source);
    Source destinationToSource(Destination destination);
}

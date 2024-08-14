package com.malikov.springbootlesson8task1.sourceDestination;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SourceDestinationMapper3 {
    SourceDestinationMapper3 INSTANCE = Mappers.getMapper(SourceDestinationMapper3.class);

    Destination sourceToDestination(Source source);
    Source destinationToSource(Destination destination);

    List<Destination> sourcesToDestinations(List<Source> sources);
    List<Source> destinationsToSources(List<Destination> destinations);
}

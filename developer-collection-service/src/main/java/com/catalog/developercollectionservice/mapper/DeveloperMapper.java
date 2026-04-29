package com.catalog.developercollectionservice.mapper;

import com.catalog.developercollectionservice.dto.DeveloperRequest;
import com.catalog.developercollectionservice.dto.DeveloperResponse;
import com.catalog.developercollectionservice.entity.Developer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DeveloperMapper {

    @Mapping(target = "id", ignore = true)
    Developer toEntity(DeveloperRequest request);

    DeveloperResponse toResponse(Developer entity);
}
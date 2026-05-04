package com.catalog.resource_catalog_service.mapper;

import com.catalog.resource_catalog_service.dto.ProjectRequest;
import com.catalog.resource_catalog_service.dto.ProjectResponse;
import com.catalog.resource_catalog_service.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProjectMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "categories", ignore = true)
    Project toEntity(ProjectRequest request);

    ProjectResponse toResponse(Project entity);
}
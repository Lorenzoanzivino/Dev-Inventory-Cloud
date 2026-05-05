package com.catalog.resource_catalog_service.mapper;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.entity.Resource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {CategoryMapper.class})
public interface ResourceMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "category", ignore = true)
    // La categoria verrà settata manualmente nel Service dopo la ricerca a DB
    @Mapping(target = "dataInserimento", ignore = true)
    Resource toEntity(ResourceRequest request);

    ResourceResponse toResponse(Resource entity);
}
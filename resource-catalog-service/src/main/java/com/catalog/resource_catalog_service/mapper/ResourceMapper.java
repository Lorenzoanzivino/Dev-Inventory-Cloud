package com.catalog.resource_catalog_service.mapper;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.entity.Resource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ResourceMapper {

    // Da Request DTO a Entity (per il salvataggio)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataInserimento", ignore = true)
    Resource toEntity(ResourceRequest request);

    // Da Entity a Response DTO (per la visualizzazione)
    ResourceResponse toResponse(Resource entity);
}
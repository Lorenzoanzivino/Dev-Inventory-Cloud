package com.catalog.resource_catalog_service.dto;

public record ProjectResponse(
        Long id,
        String nome,
        String descrizione
) {
}
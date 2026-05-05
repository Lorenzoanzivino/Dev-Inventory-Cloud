package com.catalog.resource_catalog_service.dto;

import java.time.LocalDateTime;

public record ResourceResponse(
        Long id,
        String nome,
        String descrizione,
        String url,
        CategoryResponse category, // Restituiamo i dettagli della categoria
        LocalDateTime dataInserimento
) {
}
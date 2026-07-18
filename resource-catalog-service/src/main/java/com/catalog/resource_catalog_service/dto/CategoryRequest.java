package com.catalog.resource_catalog_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CategoryRequest(
        @NotBlank(message = "Il nome della categoria è obbligatorio")
        String nome,
        @NotNull(message = "L'ID del progetto è obbligatorio")
        Long projectId // Ogni categoria deve nascere dentro un progetto
) {
}
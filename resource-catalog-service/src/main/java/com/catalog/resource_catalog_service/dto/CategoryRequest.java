package com.catalog.resource_catalog_service.dto;

import jakarta.validation.constraints.NotBlank;

public record CategoryRequest(
        @NotBlank(message = "Il nome della categoria è obbligatorio")
        String nome
) {}
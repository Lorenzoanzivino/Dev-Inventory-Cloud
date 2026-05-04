package com.catalog.resource_catalog_service.dto;

import jakarta.validation.constraints.NotBlank;

public record ProjectRequest(
        @NotBlank(message = "Il nome del progetto è obbligatorio")
        String nome,
        String descrizione
) {}
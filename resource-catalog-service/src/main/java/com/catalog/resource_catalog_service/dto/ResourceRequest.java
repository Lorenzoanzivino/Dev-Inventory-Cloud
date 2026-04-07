package com.catalog.resource_catalog_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ResourceRequest(
        @NotBlank(message = "Il nome è obbligatorio")
        @Size(max = 100)
        String nome,

        String descrizione,

        @NotBlank(message = "L'URL è obbligatorio")
        String url,

        String categoria
) {}
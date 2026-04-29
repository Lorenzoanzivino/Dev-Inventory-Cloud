package com.catalog.resource_catalog_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ResourceRequest(
        @NotBlank(message = "Il nome è obbligatorio")
        String nome,

        String descrizione,

        @NotBlank(message = "L'URL è obbligatorio")
        String url,

        @NotNull(message = "L'ID della categoria è obbligatorio")
        Long categoryId // Riceviamo l'ID della categoria esistente
) {}
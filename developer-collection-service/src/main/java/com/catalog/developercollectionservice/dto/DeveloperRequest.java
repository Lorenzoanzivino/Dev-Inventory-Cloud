package com.catalog.developercollectionservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DeveloperRequest(
        @NotBlank(message = "Il nome è obbligatorio")
        String nome,

        @Email(message = "Email non valida")
        @NotBlank(message = "L'email è obbligatoria")
        String email
) {}
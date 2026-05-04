package com.catalog.developercollectionservice.dto;

import jakarta.validation.constraints.NotNull;

public record ProjectAssignmentRequest(
        @NotNull(message = "L'ID dello sviluppatore è obbligatorio")
        Long developerId,
        @NotNull(message = "L'ID del progetto è obbligatorio")
        Long projectId
) {}
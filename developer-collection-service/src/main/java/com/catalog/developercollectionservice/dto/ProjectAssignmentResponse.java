package com.catalog.developercollectionservice.dto;

public record ProjectAssignmentResponse(
        Long id,
        Long developerId,
        Long projectId,
        String dataAssegnazione
) {
}
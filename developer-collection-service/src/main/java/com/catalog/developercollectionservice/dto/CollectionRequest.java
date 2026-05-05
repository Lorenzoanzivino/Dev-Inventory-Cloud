package com.catalog.developercollectionservice.dto;

import jakarta.validation.constraints.NotNull;

public record CollectionRequest(
        @NotNull Long developerId,
        @NotNull Long resourceId
) {
}
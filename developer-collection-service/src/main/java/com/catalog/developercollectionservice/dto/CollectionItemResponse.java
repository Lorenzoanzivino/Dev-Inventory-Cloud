package com.catalog.developercollectionservice.dto;

public record CollectionItemResponse(
        Long id,
        Long resourceId,
        String resourceNome,
        String resourceUrl
) {}
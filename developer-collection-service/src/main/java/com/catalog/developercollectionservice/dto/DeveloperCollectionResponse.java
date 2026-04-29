package com.catalog.developercollectionservice.dto;

import java.util.List;

public record DeveloperCollectionResponse(
        Long developerId,
        String developerNome,
        List<CollectionItemResponse> items
) {}
package com.catalog.developercollectionservice.client;

import com.catalog.developercollectionservice.dto.ResourceCatalogResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Usiamo il segnaposto per l'URL definito nel file yml
@FeignClient(name = "resource-catalog-service", url = "${services.resource-catalog.url}")
public interface ResourceClient {

    @GetMapping("/api/v1/resources/{id}")
    ResourceCatalogResponse getResourceById(@PathVariable("id") Long id);
}
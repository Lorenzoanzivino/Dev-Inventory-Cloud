package com.catalog.authservice.client;

import com.catalog.authservice.dto.DeveloperSyncRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Puntiamo direttamente all'URL configurato nel file properties/yaml
@FeignClient(name = "developer-collection-service", url = "${services.developer-collection.url}")
public interface DeveloperClient {

    @PostMapping("/api/v1/developers")
    Long syncDeveloper(@RequestBody DeveloperSyncRequest request);
}
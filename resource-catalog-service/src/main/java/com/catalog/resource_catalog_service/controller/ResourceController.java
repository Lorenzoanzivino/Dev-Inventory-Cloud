package com.catalog.resource_catalog_service.controller;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.service.ResourceCommandService;
import com.catalog.resource_catalog_service.service.ResourceQueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/resources")
@RequiredArgsConstructor
public class ResourceController {

    private final ResourceCommandService commandService;
    private final ResourceQueryService queryService;

    @PostMapping
    public ResponseEntity<Long> createResource(@Valid @RequestBody ResourceRequest request) {
        return new ResponseEntity<>(commandService.createResource(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ResourceResponse>> getAllResources() {
        return ResponseEntity.ok(queryService.getAllResources());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResourceResponse> getResourceById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getResourceById(id));
    }
}
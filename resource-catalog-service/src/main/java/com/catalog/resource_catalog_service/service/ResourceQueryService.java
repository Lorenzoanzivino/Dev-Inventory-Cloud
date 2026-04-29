package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.mapper.ResourceMapper;
import com.catalog.resource_catalog_service.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ResourceQueryService {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    public List<ResourceResponse> getAllResources() {
        return resourceRepository.findAll().stream()
                .map(resourceMapper::toResponse)
                .collect(Collectors.toList());
    }

    public ResourceResponse getResourceById(Long id) {
        return resourceRepository.findById(id)
                .map(resourceMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Resource not found with ID: " + id));
    }
}
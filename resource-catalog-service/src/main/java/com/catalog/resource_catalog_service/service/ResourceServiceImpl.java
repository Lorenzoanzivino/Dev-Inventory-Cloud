package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.entity.Resource;
import com.catalog.resource_catalog_service.mapper.ResourceMapper;
import com.catalog.resource_catalog_service.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    @Transactional
    public ResourceResponse createResource(ResourceRequest request) {
        Resource entity = resourceMapper.toEntity(request);
        Resource savedEntity = resourceRepository.save(entity);
        return resourceMapper.toResponse(savedEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ResourceResponse> getAllResources() {
        return resourceRepository.findAll().stream()
                .map(resourceMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public ResourceResponse getResourceById(Long id) {
        Resource entity = resourceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Risorsa non trovata con ID: " + id));
        return resourceMapper.toResponse(entity);
    }
}
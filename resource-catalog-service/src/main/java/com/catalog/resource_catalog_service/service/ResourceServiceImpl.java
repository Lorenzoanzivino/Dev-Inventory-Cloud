package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Resource;
import com.catalog.resource_catalog_service.mapper.ResourceMapper;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
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
    private final CategoryRepository categoryRepository; // Iniettato per gestire la relazione
    private final ResourceMapper resourceMapper;

    @Override
    @Transactional
    public ResourceResponse createResource(ResourceRequest request) {
        // 1. Cerchiamo la categoria a DB
        Category category = categoryRepository.findById(request.categoryId())
                .orElseThrow(() -> new RuntimeException("Categoria non trovata con ID: " + request.categoryId()));

        // 2. Mappiamo il DTO in Entity
        Resource entity = resourceMapper.toEntity(request);

        // 3. Colleghiamo la categoria trovata alla risorsa
        entity.setCategory(category);

        // 4. Salviamo
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
        return resourceRepository.findById(id)
                .map(resourceMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Risorsa non trovata"));
    }
}
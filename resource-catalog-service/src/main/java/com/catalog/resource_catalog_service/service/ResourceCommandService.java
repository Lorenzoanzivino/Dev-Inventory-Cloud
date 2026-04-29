package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Resource;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import com.catalog.resource_catalog_service.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ResourceCommandService {

    private final ResourceRepository resourceRepository;
    private final CategoryRepository categoryRepository;

    public Long createResource(ResourceRequest request) {
        Category category = categoryRepository.findById(request.categoryId())
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + request.categoryId()));

        Resource resource = new Resource();
        resource.setNome(request.nome());
        resource.setDescrizione(request.descrizione());
        resource.setUrl(request.url());
        resource.setCategory(category);

        return resourceRepository.save(resource).getId();
    }
}
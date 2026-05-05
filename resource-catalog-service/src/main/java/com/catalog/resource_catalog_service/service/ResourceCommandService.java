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
                .orElseThrow(() -> new RuntimeException("Categoria non trovata con ID: " + request.categoryId()));

        Resource resource = Resource.builder()
                .nome(request.nome())
                .descrizione(request.descrizione())
                .url(request.url()) // Può essere null, il DB lo accetta (nullable = true)
                .category(category)
                .build();

        return resourceRepository.save(resource).getId();
    }

    public void updateResource(Long id, ResourceRequest request) {
        Resource resource = resourceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Risorsa non trovata"));

        Category category = categoryRepository.findById(request.categoryId())
                .orElseThrow(() -> new RuntimeException("Categoria non trovata"));

        resource.setNome(request.nome());
        resource.setDescrizione(request.descrizione());
        resource.setUrl(request.url());
        resource.setCategory(category);

        resourceRepository.save(resource);
    }

    public void deleteResource(Long id) {
        if (!resourceRepository.existsById(id)) {
            throw new IllegalStateException("Risorsa non trovata");
        }
        resourceRepository.deleteById(id);
    }
}
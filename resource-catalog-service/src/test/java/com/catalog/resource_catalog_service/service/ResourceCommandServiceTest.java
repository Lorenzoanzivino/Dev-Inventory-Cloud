package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Resource;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import com.catalog.resource_catalog_service.repository.ResourceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ResourceCommandServiceTest {

    @Mock
    private ResourceRepository resourceRepository;

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private ResourceCommandService commandService;

    @Test
    void createResource_ShouldSaveAndReturnId() {
        ResourceRequest request = new ResourceRequest("Spring Boot Guide", "A comprehensive guide", "http://spring.io", 1L);
        Category category = new Category();
        category.setId(1L);

        Resource savedResource = new Resource();
        savedResource.setId(10L);

        when(categoryRepository.findById(1L)).thenReturn(Optional.of(category));
        when(resourceRepository.save(any(Resource.class))).thenReturn(savedResource);

        Long resultId = commandService.createResource(request);

        assertEquals(10L, resultId);
        verify(categoryRepository).findById(1L);
        verify(resourceRepository).save(any(Resource.class));
    }

    @Test
    void createResource_WhenCategoryNotFound_ShouldThrowException() {
        ResourceRequest request = new ResourceRequest("Test Resource", "Desc", "url", 99L);

        when(categoryRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> commandService.createResource(request));
    }
}
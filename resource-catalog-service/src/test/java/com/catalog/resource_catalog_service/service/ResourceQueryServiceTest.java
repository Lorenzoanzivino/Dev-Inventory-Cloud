package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryResponse;
import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.entity.Resource;
import com.catalog.resource_catalog_service.mapper.ResourceMapper;
import com.catalog.resource_catalog_service.repository.ResourceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ResourceQueryServiceTest {

    @Mock
    private ResourceRepository resourceRepository;

    @Mock
    private ResourceMapper resourceMapper;

    @InjectMocks
    private ResourceQueryService queryService;

    @Test
    void getAllResources_ShouldReturnMappedResponses() {
        Resource resource = new Resource();
        resource.setId(1L);
        ResourceResponse response = new ResourceResponse(1L, "Test", "Desc", "url", new CategoryResponse(1L, "Cat"), LocalDateTime.now());

        when(resourceRepository.findAll()).thenReturn(List.of(resource));
        when(resourceMapper.toResponse(resource)).thenReturn(response);

        List<ResourceResponse> result = queryService.getAllResources();

        assertEquals(1, result.size());
        assertEquals(1L, result.get(0).id());
        verify(resourceRepository).findAll();
    }

    @Test
    void getResourceById_WhenFound_ShouldReturnResponse() {
        Resource resource = new Resource();
        resource.setId(1L);
        ResourceResponse response = new ResourceResponse(1L, "Test", "Desc", "url", new CategoryResponse(1L, "Cat"), LocalDateTime.now());

        when(resourceRepository.findById(1L)).thenReturn(Optional.of(resource));
        when(resourceMapper.toResponse(resource)).thenReturn(response);

        ResourceResponse result = queryService.getResourceById(1L);

        assertEquals(1L, result.id());
        verify(resourceRepository).findById(1L);
    }

    @Test
    void getResourceById_WhenNotFound_ShouldThrowException() {
        when(resourceRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> queryService.getResourceById(99L));
    }
}
package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryResponse;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.mapper.CategoryMapper;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CategoryQueryServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private CategoryMapper categoryMapper;

    @InjectMocks
    private CategoryQueryService queryService;

    @Test
    void getAllCategories_ShouldReturnMappedResponses() {
        Category category = new Category();
        category.setId(1L);
        category.setNome("Cloud Infrastructure");

        CategoryResponse response = new CategoryResponse(1L, "Cloud Infrastructure");

        when(categoryRepository.findAll()).thenReturn(List.of(category));
        when(categoryMapper.toResponse(category)).thenReturn(response);

        List<CategoryResponse> result = queryService.getAllCategories();

        assertEquals(1, result.size());
        assertEquals(1L, result.get(0).id());
        assertEquals("Cloud Infrastructure", result.get(0).nome());

        verify(categoryRepository).findAll();
        verify(categoryMapper).toResponse(category);
    }
}
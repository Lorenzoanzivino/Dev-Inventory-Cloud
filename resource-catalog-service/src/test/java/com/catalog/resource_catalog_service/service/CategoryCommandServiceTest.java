package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CategoryCommandServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryCommandService commandService;

    @Test
    void createCategory_ShouldSaveAndReturnId() {
        CategoryRequest request = new CategoryRequest("Cloud Infrastructure");
        Category savedCategory = new Category();
        savedCategory.setId(1L);
        savedCategory.setNome("Cloud Infrastructure");

        when(categoryRepository.save(any(Category.class))).thenReturn(savedCategory);

        Long resultId = commandService.createCategory(request);

        assertEquals(1L, resultId);
        verify(categoryRepository).save(any(Category.class));
    }
}
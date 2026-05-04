package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Project;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import com.catalog.resource_catalog_service.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CategoryCommandServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private ProjectRepository projectRepository;

    @InjectMocks
    private CategoryCommandService commandService;

    @Test
    void createCategory_ShouldSaveAndReturnId() {
        // Mock del progetto padre
        Project project = new Project();
        project.setId(1L);

        // Aggiornato con 2 parametri: nome e projectId
        CategoryRequest request = new CategoryRequest("Cloud Infrastructure", 1L);

        Category savedCategory = new Category();
        savedCategory.setId(1L);
        savedCategory.setNome("Cloud Infrastructure");

        when(projectRepository.findById(1L)).thenReturn(Optional.of(project));
        when(categoryRepository.save(any(Category.class))).thenReturn(savedCategory);

        Long resultId = commandService.createCategory(request);

        assertEquals(1L, resultId);
        verify(projectRepository).findById(1L);
        verify(categoryRepository).save(any(Category.class));
    }
}
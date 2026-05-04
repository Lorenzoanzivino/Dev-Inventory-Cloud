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
    void createCategory_ShouldLinkToProject() {
        CategoryRequest request = new CategoryRequest("Backend", 1L);
        Project project = Project.builder().id(1L).build();
        Category saved = Category.builder().id(10L).nome("Backend").build();

        when(projectRepository.findById(1L)).thenReturn(Optional.of(project));
        when(categoryRepository.save(any(Category.class))).thenReturn(saved);

        Long resultId = commandService.createCategory(request);

        assertEquals(10L, resultId);
    }
}
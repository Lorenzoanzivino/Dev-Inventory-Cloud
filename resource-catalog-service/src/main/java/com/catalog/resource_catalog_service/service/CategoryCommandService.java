package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Project;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import com.catalog.resource_catalog_service.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryCommandService {

    private final CategoryRepository categoryRepository;
    private final ProjectRepository projectRepository; // Aggiunto per trovare il progetto

    public Long createCategory(CategoryRequest request) {
        // Cerchiamo il progetto padre
        Project project = projectRepository.findById(request.projectId())
                .orElseThrow(() -> new RuntimeException("Progetto non trovato con ID: " + request.projectId()));

        Category category = Category.builder()
                .nome(request.nome())
                .project(project) // Colleghiamo la categoria al progetto
                .build();

        return categoryRepository.save(category).getId();
    }

    public void updateCategory(Long id, CategoryRequest request) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria non trovata"));

        Project project = projectRepository.findById(request.projectId())
                .orElseThrow(() -> new RuntimeException("Progetto non trovato"));

        category.setNome(request.nome());
        category.setProject(project);

        categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        if (!categoryRepository.existsById(id)) {
            throw new RuntimeException("Categoria non trovata");
        }
        categoryRepository.deleteById(id);
    }
}
package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryCommandService {

    private final CategoryRepository categoryRepository;

    public Long createCategory(CategoryRequest request) {
        Category category = new Category();
        category.setNome(request.nome());
        return categoryRepository.save(category).getId();
    }

    public void updateCategory(Long id, CategoryRequest request) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));
        category.setNome(request.nome());
        categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));
        categoryRepository.delete(category);
    }
}
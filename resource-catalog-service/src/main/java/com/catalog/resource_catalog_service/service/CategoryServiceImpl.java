package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.dto.CategoryResponse;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.mapper.CategoryMapper;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    @Transactional
    public CategoryResponse createCategory(CategoryRequest request) {
        // Controllo duplicati semplice
        categoryRepository.findByNome(request.nome())
                .ifPresent(c -> { throw new RuntimeException("Categoria già esistente"); });

        Category entity = categoryMapper.toEntity(request);
        return categoryMapper.toResponse(categoryRepository.save(entity));
    }

    @Override
    @Transactional(readOnly = true)
    public List<CategoryResponse> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(categoryMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public CategoryResponse getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .map(categoryMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Categoria non trovata"));
    }
}
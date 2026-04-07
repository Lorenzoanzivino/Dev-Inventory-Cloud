package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.dto.CategoryResponse;
import java.util.List;

public interface CategoryService {
    CategoryResponse createCategory(CategoryRequest request);
    List<CategoryResponse> getAllCategories();
    CategoryResponse getCategoryById(Long id);
}
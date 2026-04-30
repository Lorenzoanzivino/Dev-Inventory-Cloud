package com.catalog.resource_catalog_service.controller;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.dto.CategoryResponse;
import com.catalog.resource_catalog_service.service.CategoryCommandService;
import com.catalog.resource_catalog_service.service.CategoryQueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryCommandService commandService;
    private final CategoryQueryService queryService;

    @PostMapping
    public ResponseEntity<Long> createCategory(@Valid @RequestBody CategoryRequest request) {
        return new ResponseEntity<>(commandService.createCategory(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> getAllCategories() {
        return ResponseEntity.ok(queryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getCategoryById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCategory(@PathVariable Long id, @Valid @RequestBody CategoryRequest request) {
        commandService.updateCategory(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        commandService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
// CategoryController.java
package com.catalog.resource_catalog_service.controller;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.dto.CategoryResponse;
import com.catalog.resource_catalog_service.service.CategoryCommandService;
import com.catalog.resource_catalog_service.service.CategoryQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
@Tag(name = "Category API", description = "Gestione delle categorie (sottocartelle) relative a un progetto")
@SecurityRequirement(name = "bearerAuth")
public class CategoryController {

    private final CategoryCommandService commandService;
    private final CategoryQueryService queryService;

    @PostMapping
    @Operation(summary = "Crea categoria", description = "Crea una nuova categoria assegnata a uno specifico projectId. Richiede ruolo ADMIN.")
    public ResponseEntity<Long> createCategory(@Valid @RequestBody CategoryRequest request) {
        return new ResponseEntity<>(commandService.createCategory(request), HttpStatus.CREATED);
    }

    @GetMapping
    @Operation(summary = "Lista globale categorie", description = "Recupera tutte le categorie a sistema (spesso utilizzata in congiunzione con filtri frontend).")
    public ResponseEntity<List<CategoryResponse>> getAllCategories() {
        return ResponseEntity.ok(queryService.getAllCategories());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Dettaglio categoria", description = "Recupera informazioni su una singola categoria.")
    public ResponseEntity<CategoryResponse> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getCategoryById(id));
    }

    @GetMapping("/project/{projectId}")
    @Operation(summary = "Categorie per progetto", description = "Recupera tutte e sole le categorie appartenenti al progetto specificato.")
    public ResponseEntity<List<CategoryResponse>> getByProject(@PathVariable Long projectId) {
        return ResponseEntity.ok(queryService.getCategoriesByProject(projectId));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Aggiorna categoria", description = "Modifica il nome di una categoria esistente. Richiede ruolo ADMIN.")
    public ResponseEntity<Void> updateCategory(@PathVariable Long id, @Valid @RequestBody CategoryRequest request) {
        commandService.updateCategory(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Elimina categoria", description = "Elimina una categoria e tutte le risorse in essa contenute. Richiede ruolo ADMIN.")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        commandService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
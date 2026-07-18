// ResourceController.java
package com.catalog.resource_catalog_service.controller;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.service.ResourceCommandService;
import com.catalog.resource_catalog_service.service.ResourceQueryService;
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
@RequestMapping("/api/v1/resources")
@RequiredArgsConstructor
@Tag(name = "Resource API", description = "Gestione dell'inventario delle risorse (tool, link, credenziali)")
@SecurityRequirement(name = "bearerAuth")
public class ResourceController {

    private final ResourceCommandService commandService;
    private final ResourceQueryService queryService;

    @PostMapping
    @Operation(summary = "Crea risorsa", description = "Aggiunge una nuova voce all'inventario, collegandola a una specifica categoria. Richiede ruolo ADMIN.")
    public ResponseEntity<Long> createResource(@Valid @RequestBody ResourceRequest request) {
        return new ResponseEntity<>(commandService.createResource(request), HttpStatus.CREATED);
    }

    @GetMapping
    @Operation(summary = "Lista globale risorse", description = "Recupera tutte le risorse (utilizzato primariamente con i permanentFilter dal frontend).")
    public ResponseEntity<List<ResourceResponse>> getAllResources() {
        return ResponseEntity.ok(queryService.getAllResources());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Dettaglio risorsa", description = "Restituisce i dati completi di una specifica risorsa.")
    public ResponseEntity<ResourceResponse> getResourceById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getResourceById(id));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Aggiorna risorsa", description = "Modifica attributi (nome, descrizione, url) di una risorsa esistente. Richiede ruolo ADMIN.")
    public ResponseEntity<Void> updateResource(@PathVariable Long id, @Valid @RequestBody ResourceRequest request) {
        commandService.updateResource(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Elimina risorsa", description = "Rimuove una singola risorsa dal catalogo. Richiede ruolo ADMIN.")
    public ResponseEntity<Void> deleteResource(@PathVariable Long id) {
        commandService.deleteResource(id);
        return ResponseEntity.noContent().build();
    }
}
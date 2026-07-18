// ProjectController.java
package com.catalog.resource_catalog_service.controller;

import com.catalog.resource_catalog_service.dto.ProjectRequest;
import com.catalog.resource_catalog_service.dto.ProjectResponse;
import com.catalog.resource_catalog_service.service.ProjectCommandService;
import com.catalog.resource_catalog_service.service.ProjectQueryService;
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
@RequestMapping("/api/v1/projects")
@RequiredArgsConstructor
@Tag(name = "Project API", description = "Gestione dei tenant (Progetti) del sistema")
@SecurityRequirement(name = "bearerAuth")
public class ProjectController {

    private final ProjectCommandService commandService;
    private final ProjectQueryService queryService;

    @PostMapping
    @Operation(summary = "Crea progetto", description = "Crea un nuovo progetto. L'operazione è riservata agli utenti con ruolo ADMIN.")
    public ResponseEntity<Long> createProject(@Valid @RequestBody ProjectRequest request) {
        return new ResponseEntity<>(commandService.createProject(request), HttpStatus.CREATED);
    }

    @GetMapping
    @Operation(summary = "Lista progetti", description = "Restituisce tutti i progetti di sistema. I DEVELOPER vedranno solo quelli a loro assegnati (tramite filtro sul Gateway).")
    public ResponseEntity<List<ProjectResponse>> getAllProjects() {
        return ResponseEntity.ok(queryService.getAllProjects());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Dettaglio progetto", description = "Recupera i dati di un singolo progetto.")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getProjectById(id));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Aggiorna progetto", description = "Modifica nome o descrizione di un progetto esistente. Richiede ruolo ADMIN.")
    public ResponseEntity<Void> updateProject(@PathVariable Long id, @Valid @RequestBody ProjectRequest request) {
        commandService.updateProject(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Elimina progetto", description = "Cancella definitivamente un progetto e, a cascata, tutte le categorie e risorse associate. Richiede ruolo ADMIN.")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        commandService.deleteProject(id);
        return ResponseEntity.noContent().build();
    }
}
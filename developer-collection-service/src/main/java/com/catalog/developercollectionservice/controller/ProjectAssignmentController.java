package com.catalog.developercollectionservice.controller;

import com.catalog.developercollectionservice.dto.ProjectAssignmentRequest;
import com.catalog.developercollectionservice.dto.ProjectAssignmentResponse;
import com.catalog.developercollectionservice.service.ProjectAssignmentService;
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
@RequestMapping("/api/v1/assignments")
@RequiredArgsConstructor
@Tag(name = "Project Assignment API", description = "Gestione delle assegnazioni dei progetti agli sviluppatori")
@SecurityRequirement(name = "bearerAuth")
public class ProjectAssignmentController {

    private final ProjectAssignmentService assignmentService;

    @PostMapping
    @Operation(summary = "Assegna progetto", description = "Collega uno sviluppatore a un progetto specifico. Richiede permessi di ADMIN.")
    public ResponseEntity<Long> assignProject(@Valid @RequestBody ProjectAssignmentRequest request) {
        return new ResponseEntity<>(assignmentService.assignProject(request), HttpStatus.CREATED);
    }

    @GetMapping("/developer/{developerId}")
    @Operation(summary = "Assegnazioni per sviluppatore", description = "Recupera l'elenco dei progetti a cui uno specifico sviluppatore è stato assegnato.")
    public ResponseEntity<List<ProjectAssignmentResponse>> getAssignmentsByDeveloper(@PathVariable Long developerId) {
        return ResponseEntity.ok(assignmentService.getAssignmentsByDeveloper(developerId));
    }

    @DeleteMapping("/developer/{developerId}/project/{projectId}")
    @Operation(summary = "Rimuovi assegnazione", description = "Scollega uno sviluppatore da un progetto. Richiede permessi di ADMIN.")
    public ResponseEntity<Void> unassignProject(@PathVariable Long developerId, @PathVariable Long projectId) {
        assignmentService.unassignProject(developerId, projectId);
        return ResponseEntity.noContent().build();
    }
}
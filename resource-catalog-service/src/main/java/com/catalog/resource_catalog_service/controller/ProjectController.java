package com.catalog.resource_catalog_service.controller;

import com.catalog.resource_catalog_service.dto.ProjectRequest;
import com.catalog.resource_catalog_service.dto.ProjectResponse;
import com.catalog.resource_catalog_service.service.ProjectCommandService;
import com.catalog.resource_catalog_service.service.ProjectQueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectCommandService commandService;
    private final ProjectQueryService queryService;

    @PostMapping
    public ResponseEntity<Long> createProject(@Valid @RequestBody ProjectRequest request) {
        return new ResponseEntity<>(commandService.createProject(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProjectResponse>> getAllProjects() {
        return ResponseEntity.ok(queryService.getAllProjects());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getProjectById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateProject(@PathVariable Long id, @Valid @RequestBody ProjectRequest request) {
        commandService.updateProject(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        commandService.deleteProject(id);
        return ResponseEntity.noContent().build();
    }
}
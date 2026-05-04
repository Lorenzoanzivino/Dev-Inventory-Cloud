package com.catalog.developercollectionservice.controller;

import com.catalog.developercollectionservice.dto.ProjectAssignmentRequest;
import com.catalog.developercollectionservice.dto.ProjectAssignmentResponse;
import com.catalog.developercollectionservice.service.ProjectAssignmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/assignments")
@RequiredArgsConstructor
public class ProjectAssignmentController {

    private final ProjectAssignmentService assignmentService;

    @PostMapping
    public ResponseEntity<Long> assignProject(@Valid @RequestBody ProjectAssignmentRequest request) {
        return new ResponseEntity<>(assignmentService.assignProject(request), HttpStatus.CREATED);
    }

    @GetMapping("/developer/{developerId}")
    public ResponseEntity<List<ProjectAssignmentResponse>> getAssignmentsByDeveloper(@PathVariable Long developerId) {
        return ResponseEntity.ok(assignmentService.getAssignmentsByDeveloper(developerId));
    }

    @DeleteMapping("/developer/{developerId}/project/{projectId}")
    public ResponseEntity<Void> unassignProject(@PathVariable Long developerId, @PathVariable Long projectId) {
        assignmentService.unassignProject(developerId, projectId);
        return ResponseEntity.noContent().build();
    }
}
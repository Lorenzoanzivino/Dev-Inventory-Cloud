package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.dto.ProjectAssignmentRequest;
import com.catalog.developercollectionservice.dto.ProjectAssignmentResponse;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.entity.ProjectAssignment;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import com.catalog.developercollectionservice.repository.ProjectAssignmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProjectAssignmentService {

    private final ProjectAssignmentRepository assignmentRepository;
    private final DeveloperRepository developerRepository;

    public Long assignProject(ProjectAssignmentRequest request) {
        Developer developer = developerRepository.findById(request.developerId())
                .orElseThrow(() -> new RuntimeException("Sviluppatore non trovato con ID: " + request.developerId()));

        if (assignmentRepository.findByDeveloperIdAndProjectId(request.developerId(), request.projectId()).isPresent()) {
            throw new IllegalStateException("Il progetto è già stato assegnato a questo sviluppatore");
        }

        ProjectAssignment assignment = ProjectAssignment.builder()
                .developer(developer)
                .projectId(request.projectId())
                .build();

        return assignmentRepository.save(assignment).getId();
    }

    @Transactional(readOnly = true)
    public List<ProjectAssignmentResponse> getAssignmentsByDeveloper(Long developerId) {
        return assignmentRepository.findByDeveloperId(developerId).stream()
                .map(assignment -> new ProjectAssignmentResponse(
                        assignment.getId(),
                        assignment.getDeveloper().getId(),
                        assignment.getProjectId(),
                        assignment.getDataAssegnazione().toString()
                ))
                .toList();
    }

    public void unassignProject(Long developerId, Long projectId) {
        ProjectAssignment assignment = assignmentRepository.findByDeveloperIdAndProjectId(developerId, projectId)
                .orElseThrow(() -> new RuntimeException("Assegnazione non trovata per lo sviluppatore e il progetto specificati"));
        assignmentRepository.delete(assignment);
    }
}
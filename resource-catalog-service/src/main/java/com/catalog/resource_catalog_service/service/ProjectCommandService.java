package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ProjectRequest;
import com.catalog.resource_catalog_service.entity.Project;
import com.catalog.resource_catalog_service.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ProjectCommandService {

    private final ProjectRepository projectRepository;

    public Long createProject(ProjectRequest request) {
        Project project = Project.builder()
                .nome(request.nome())
                .descrizione(request.descrizione())
                .build();
        return projectRepository.save(project).getId();
    }

    public void updateProject(Long id, ProjectRequest request) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Progetto non trovato"));
        project.setNome(request.nome());
        project.setDescrizione(request.descrizione());
        projectRepository.save(project);
    }

    public void deleteProject(Long id) {
        if (!projectRepository.existsById(id)) {
            throw new RuntimeException("Progetto non trovato");
        }
        projectRepository.deleteById(id);
    }
}
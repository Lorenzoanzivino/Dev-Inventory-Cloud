package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ProjectRequest;
import com.catalog.resource_catalog_service.entity.Project;
import com.catalog.resource_catalog_service.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProjectCommandServiceTest {

    @Mock
    private ProjectRepository projectRepository;

    @InjectMocks
    private ProjectCommandService commandService;

    @Test
    void createProject_ShouldSaveAndReturnId() {
        ProjectRequest request = new ProjectRequest("Progetto Alpha", "Desc");
        Project saved = Project.builder().id(1L).nome("Progetto Alpha").build();

        when(projectRepository.save(any(Project.class))).thenReturn(saved);

        Long id = commandService.createProject(request);

        assertEquals(1L, id);
        verify(projectRepository).save(any(Project.class));
    }

    @Test
    void deleteProject_WhenNotExists_ShouldThrowException() {
        when(projectRepository.existsById(99L)).thenReturn(false);

        assertThrows(RuntimeException.class, () -> commandService.deleteProject(99L));
        verify(projectRepository, never()).deleteById(any());
    }
}
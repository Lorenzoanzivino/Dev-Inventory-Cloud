package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ProjectResponse;
import com.catalog.resource_catalog_service.entity.Project;
import com.catalog.resource_catalog_service.mapper.ProjectMapper;
import com.catalog.resource_catalog_service.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProjectQueryServiceTest {

    @Mock
    private ProjectRepository projectRepository;

    @Mock
    private ProjectMapper projectMapper;

    @InjectMocks
    private ProjectQueryService queryService;

    @Test
    void getProjectById_WhenExists_ShouldReturnResponse() {
        Project project = Project.builder().id(1L).nome("Test").build();
        ProjectResponse response = new ProjectResponse(1L, "Test", "Desc");

        when(projectRepository.findById(1L)).thenReturn(Optional.of(project));
        when(projectMapper.toResponse(project)).thenReturn(response);

        ProjectResponse result = queryService.getProjectById(1L);

        assertEquals("Test", result.nome());
        assertEquals(1L, result.id());
    }
}
package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest(properties = {
        "spring.jpa.hibernate.ddl-auto=create-drop"
})
class ProjectRepositoryTest {

    @Autowired
    private ProjectRepository projectRepository;

    @Test
    void findByNome_ShouldReturnProject() {
        Project project = Project.builder()
                .nome("Sistema Inventario")
                .descrizione("Gestione risorse cloud")
                .build();
        projectRepository.save(project);

        Optional<Project> found = projectRepository.findByNome("Sistema Inventario");

        assertTrue(found.isPresent());
        assertEquals("Gestione risorse cloud", found.get().getDescrizione());
    }
}
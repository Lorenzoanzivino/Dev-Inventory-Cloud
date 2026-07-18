package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest(properties = {
        "spring.jpa.hibernate.ddl-auto=create-drop"
})
class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Test
    void findByNome_ShouldReturnCategory() {
        // Obbligatorio salvare il progetto padre per il vincolo nullable = false
        Project project = projectRepository.save(Project.builder().nome("Progetto Test").build());

        Category category = Category.builder()
                .nome("Backend")
                .project(project)
                .build();
        categoryRepository.save(category);

        Optional<Category> found = categoryRepository.findByNome("Backend");

        assertTrue(found.isPresent());
        assertEquals("Backend", found.get().getNome());
        assertEquals(project.getId(), found.get().getProject().getId());
    }
}
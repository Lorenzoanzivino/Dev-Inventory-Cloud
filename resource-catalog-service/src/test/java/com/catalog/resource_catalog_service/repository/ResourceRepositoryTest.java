package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Project;
import com.catalog.resource_catalog_service.entity.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest(properties = {
        "spring.jpa.hibernate.ddl-auto=create-drop"
})
class ResourceRepositoryTest {

    @Autowired
    private ResourceRepository resourceRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Test
    void saveResource_ShouldPersistWithHierarchy() {
        Project project = projectRepository.save(Project.builder().nome("Progetto").build());
        Category category = categoryRepository.save(Category.builder().nome("DevOps").project(project).build());

        Resource resource = Resource.builder()
                .nome("Docker Docs")
                .url("https://docs.docker.com")
                .category(category)
                .build();

        Resource saved = resourceRepository.save(resource);

        assertNotNull(saved.getId());
        assertEquals("DevOps", saved.getCategory().getNome());
        assertNotNull(saved.getDataInserimento());
    }
}
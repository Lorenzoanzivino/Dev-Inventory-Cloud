package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ResourceRepositoryTest {

    @Autowired
    private ResourceRepository resourceRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void saveResource_ShouldPersistWithCategory() {
        Category category = new Category();
        category.setNome("DevOps");
        category = categoryRepository.save(category);

        Resource resource = new Resource();
        resource.setNome("Docker Docs");
        resource.setUrl("https://docs.docker.com");
        resource.setCategory(category);

        Resource saved = resourceRepository.save(resource);

        assertNotNull(saved.getId());
        assertEquals("DevOps", saved.getCategory().getNome());
        assertNotNull(saved.getDataInserimento());
    }
}
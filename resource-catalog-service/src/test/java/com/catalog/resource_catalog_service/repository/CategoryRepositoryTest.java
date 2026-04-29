package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void findByNome_ShouldReturnCategory() {
        Category category = new Category();
        category.setNome("Backend");
        categoryRepository.save(category);

        Optional<Category> found = categoryRepository.findByNome("Backend");

        assertTrue(found.isPresent());
        assertEquals("Backend", found.get().getNome());
    }
}
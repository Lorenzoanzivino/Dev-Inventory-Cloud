package com.catalog.developercollectionservice.repository;

import com.catalog.developercollectionservice.entity.Developer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest(properties = {
        "RESOURCE_CATALOG_SERVICE_URL=http://localhost",
        "API_GATEWAY_URL=http://localhost",
        "spring.jpa.hibernate.ddl-auto=create-drop"
})
class DeveloperRepositoryTest {

    @Autowired
    private DeveloperRepository developerRepository;

    @Test
    void findByEmail_ShouldReturnDeveloper() {
        // Arrange
        Developer dev = new Developer();
        dev.setNome("Lorenzo");
        dev.setEmail("lorenzo@test.com");
        developerRepository.save(dev);

        // Act
        Optional<Developer> found = developerRepository.findByEmail("lorenzo@test.com");

        // Assert
        assertTrue(found.isPresent());
        assertEquals("Lorenzo", found.get().getNome());
        assertEquals("lorenzo@test.com", found.get().getEmail());
    }
}
package com.catalog.developercollectionservice.repository;

import com.catalog.developercollectionservice.entity.Developer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DeveloperRepositoryTest {

    @Autowired
    private DeveloperRepository developerRepository;

    @Test
    void findByEmail_ShouldReturnDeveloper() {
        Developer dev = Developer.builder()
                .nome("Lorenzo")
                .email("lorenzo@test.com")
                .build();
        developerRepository.save(dev);

        Optional<Developer> found = developerRepository.findByEmail("lorenzo@test.com");

        assertTrue(found.isPresent());
        assertEquals("Lorenzo", found.get().getNome());
    }
}
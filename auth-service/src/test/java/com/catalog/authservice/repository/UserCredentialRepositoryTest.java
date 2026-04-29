package com.catalog.authservice.repository;

import com.catalog.authservice.entity.UserCredential;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserCredentialRepositoryTest {

    @Autowired
    private UserCredentialRepository repository;

    @Test
    void findByEmail_ShouldReturnCredentials() {
        UserCredential user = UserCredential.builder()
                .email("admin@test.com")
                .password("secret")
                .build();
        repository.save(user);

        Optional<UserCredential> found = repository.findByEmail("admin@test.com");

        assertTrue(found.isPresent());
        assertEquals("secret", found.get().getPassword());
    }
}
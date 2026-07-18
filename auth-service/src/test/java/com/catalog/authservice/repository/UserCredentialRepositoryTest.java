package com.catalog.authservice.repository;

import com.catalog.authservice.entity.Role;
import com.catalog.authservice.entity.UserCredential;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest(properties = {
        "DEVELOPER_COLLECTION_SERVICE_URL=http://localhost",
        "spring.jpa.hibernate.ddl-auto=create-drop"
})
class UserCredentialRepositoryTest {

    @Autowired
    private UserCredentialRepository repository;

    @Test
    void findByEmail_ShouldReturnCredentials() {
        UserCredential user = new UserCredential();
        user.setEmail("admin@test.com");
        user.setPassword("secret");
        user.setNome("Admin");
        user.setRole(Role.ADMIN);

        repository.save(user);

        Optional<UserCredential> found = repository.findByEmail("admin@test.com");

        assertTrue(found.isPresent());
        assertEquals("secret", found.get().getPassword());
    }
}
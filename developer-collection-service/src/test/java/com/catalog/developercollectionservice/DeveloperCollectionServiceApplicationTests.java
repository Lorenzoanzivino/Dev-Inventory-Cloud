package com.catalog.developercollectionservice;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Disabilitato per evitare la dipendenza dal database PostgreSQL durante gli unit test")
class DeveloperCollectionServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}

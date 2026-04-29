package com.catalog.apigateway;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Disabilitato per evitare la dipendenza dal database PostgreSQL durante gli unit test")
class ApiGatewayApplicationTests {

    @Test
    void contextLoads() {
    }

}

package com.catalog.developercollectionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DeveloperCollectionServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeveloperCollectionServiceApplication.class, args);
    }
}
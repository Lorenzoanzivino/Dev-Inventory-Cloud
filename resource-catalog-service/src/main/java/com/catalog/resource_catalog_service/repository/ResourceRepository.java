package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
    // Qui potremo aggiungere query personalizzate in futuro, es: findByCategoria
}
package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Aggiungi questa riga
    Optional<Project> findByNome(String nome);
}
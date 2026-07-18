package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Utile per evitare duplicati durante la creazione
    Optional<Category> findByNome(String nome);

    List<Category> findByProjectId(Long projectId);
}
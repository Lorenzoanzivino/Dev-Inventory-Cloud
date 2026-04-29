package com.catalog.developercollectionservice.repository;

import com.catalog.developercollectionservice.entity.CollectionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectionItemRepository extends JpaRepository<CollectionItem, Long> {
    List<CollectionItem> findByDeveloperId(Long developerId);
    boolean existsByDeveloperIdAndResourceId(Long developerId, Long resourceId);
    void deleteByDeveloperIdAndResourceId(Long developerId, Long resourceId);
}
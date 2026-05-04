package com.catalog.developercollectionservice.repository;

import com.catalog.developercollectionservice.entity.ProjectAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectAssignmentRepository extends JpaRepository<ProjectAssignment, Long> {
    List<ProjectAssignment> findByDeveloperId(Long developerId);
    Optional<ProjectAssignment> findByDeveloperIdAndProjectId(Long developerId, Long projectId);
}
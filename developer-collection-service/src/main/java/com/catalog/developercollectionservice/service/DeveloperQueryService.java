package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.dto.DeveloperResponse;
import com.catalog.developercollectionservice.mapper.DeveloperMapper;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DeveloperQueryService {

    private final DeveloperRepository developerRepository;
    private final DeveloperMapper developerMapper;

    public List<DeveloperResponse> getAllDevelopers() {
        return developerRepository.findAll().stream()
                .map(developerMapper::toResponse)
                .toList();
    }

    public DeveloperResponse getDeveloperById(Long id) {
        return developerRepository.findById(id)
                .map(developerMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Developer not found with ID: " + id));
    }
}
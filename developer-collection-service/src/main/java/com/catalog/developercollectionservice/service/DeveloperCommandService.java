package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.dto.DeveloperRequest;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class DeveloperCommandService {

    private final DeveloperRepository developerRepository;

    public Long createDeveloper(DeveloperRequest request) {
        Developer developer = new Developer();
        developer.setNome(request.nome());
        developer.setEmail(request.email());
        return developerRepository.save(developer).getId();
    }

    public void updateDeveloper(Long id, DeveloperRequest request) {
        Developer developer = developerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Developer not found with ID: " + id));
        developer.setNome(request.nome());
        developer.setEmail(request.email());
        developerRepository.save(developer);
    }

    public void deleteDeveloper(Long id) {
        Developer developer = developerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Developer not found with ID: " + id));
        developerRepository.delete(developer);
    }
}
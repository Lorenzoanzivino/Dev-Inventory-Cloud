package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.client.ResourceClient;
import com.catalog.developercollectionservice.dto.CollectionRequest;
import com.catalog.developercollectionservice.entity.CollectionItem;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.repository.CollectionItemRepository;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CollectionCommandService {

    private final CollectionItemRepository collectionRepository;
    private final DeveloperRepository developerRepository;
    private final ResourceClient resourceClient;

    public void addToCollection(CollectionRequest request) {
        // 1. Verifica che lo sviluppatore esista
        Developer developer = developerRepository.findById(request.developerId())
                .orElseThrow(() -> new RuntimeException("Sviluppatore non trovato."));

        // 2. Verifica che non l'abbia già salvata
        if (collectionRepository.existsByDeveloperIdAndResourceId(request.developerId(), request.resourceId())) {
            throw new RuntimeException("Risorsa già presente nella collezione.");
        }

        // 3. Verifica (sincrona tramite Feign) che la risorsa esista nel catalogo
        resourceClient.getResourceById(request.resourceId());

        // 4. Salva il record
        CollectionItem item = CollectionItem.builder()
                .developer(developer)
                .resourceId(request.resourceId())
                .build();

        collectionRepository.save(item);
    }

    public void removeFromCollection(Long developerId, Long resourceId) {
        collectionRepository.deleteByDeveloperIdAndResourceId(developerId, resourceId);
    }
}
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
        Developer developer = developerRepository.findById(request.developerId())
                .orElseThrow(() -> new RuntimeException("Sviluppatore non trovato."));

        if (collectionRepository.existsByDeveloperIdAndResourceId(request.developerId(), request.resourceId())) {
            throw new RuntimeException("Risorsa già presente nella collezione.");
        }

        resourceClient.getResourceById(request.resourceId());

        CollectionItem item = CollectionItem.builder()
                .developer(developer)
                .resourceId(request.resourceId())
                .build();

        collectionRepository.save(item);
    }

    public void deleteById(Long id) {
        if (!collectionRepository.existsById(id)) {
            throw new RuntimeException("Item della collezione non trovato.");
        }
        collectionRepository.deleteById(id);
    }

    public void removeFromCollection(Long developerId, Long resourceId) {
        collectionRepository.deleteByDeveloperIdAndResourceId(developerId, resourceId);
    }
}
package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.client.ResourceClient;
import com.catalog.developercollectionservice.dto.CollectionItemResponse;
import com.catalog.developercollectionservice.dto.DeveloperCollectionResponse;
import com.catalog.developercollectionservice.dto.ResourceCatalogResponse;
import com.catalog.developercollectionservice.entity.CollectionItem;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.repository.CollectionItemRepository;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CollectionQueryService {

    private final CollectionItemRepository collectionRepository;
    private final DeveloperRepository developerRepository;
    private final ResourceClient resourceClient;

    public DeveloperCollectionResponse getDeveloperCollection(Long developerId) {
        Developer developer = developerRepository.findById(developerId)
                .orElseThrow(() -> new RuntimeException("Sviluppatore non trovato."));

        List<CollectionItem> items = collectionRepository.findByDeveloperId(developerId);

        List<CollectionItemResponse> itemResponses = items.stream().map(item -> {
            try {
                // Recupera i dati freschi dal microservizio catalogo
                ResourceCatalogResponse resourceData = resourceClient.getResourceById(item.getResourceId());
                return new CollectionItemResponse(
                        item.getId(),
                        item.getResourceId(),
                        resourceData.nome(),
                        resourceData.url()
                );
            } catch (Exception e) {
                // Se il catalogo non risponde, restituisci dati parziali (Resilienza)
                return new CollectionItemResponse(item.getId(), item.getResourceId(), "Risorsa non disponibile", "#");
            }
        }).collect(Collectors.toList());

        return new DeveloperCollectionResponse(developer.getId(), developer.getNome(), itemResponses);
    }
}
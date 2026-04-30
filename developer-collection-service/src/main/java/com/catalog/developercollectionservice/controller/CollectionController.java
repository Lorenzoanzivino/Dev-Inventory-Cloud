package com.catalog.developercollectionservice.controller;

import com.catalog.developercollectionservice.dto.CollectionItemResponse;
import com.catalog.developercollectionservice.dto.CollectionRequest;
import com.catalog.developercollectionservice.dto.DeveloperCollectionResponse;
import com.catalog.developercollectionservice.service.CollectionCommandService;
import com.catalog.developercollectionservice.service.CollectionQueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/collections")
@RequiredArgsConstructor
public class CollectionController {

    private final CollectionCommandService commandService;
    private final CollectionQueryService queryService;

    @GetMapping
    public ResponseEntity<List<CollectionItemResponse>> getAllCollections() {
        return ResponseEntity.ok(queryService.getAllCollections());
    }

    @GetMapping("/developer/{developerId}")
    public ResponseEntity<DeveloperCollectionResponse> getCollection(@PathVariable Long developerId) {
        return ResponseEntity.ok(queryService.getDeveloperCollection(developerId));
    }

    @PostMapping
    public ResponseEntity<String> addToCollection(@Valid @RequestBody CollectionRequest request) {
        commandService.addToCollection(request);
        return new ResponseEntity<>("Risorsa aggiunta alla collezione.", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        commandService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
package com.catalog.developercollectionservice.controller;

import com.catalog.developercollectionservice.dto.CollectionRequest;
import com.catalog.developercollectionservice.dto.DeveloperCollectionResponse;
import com.catalog.developercollectionservice.service.CollectionCommandService;
import com.catalog.developercollectionservice.service.CollectionQueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/collections")
@RequiredArgsConstructor
public class CollectionController {

    private final CollectionCommandService commandService;
    private final CollectionQueryService queryService;

    @GetMapping("/{developerId}")
    public ResponseEntity<DeveloperCollectionResponse> getCollection(@PathVariable Long developerId) {
        return ResponseEntity.ok(queryService.getDeveloperCollection(developerId));
    }

    @PostMapping
    public ResponseEntity<String> addToCollection(@Valid @RequestBody CollectionRequest request) {
        commandService.addToCollection(request);
        return new ResponseEntity<>("Risorsa aggiunta alla collezione.", HttpStatus.CREATED);
    }

    @DeleteMapping("/{developerId}/{resourceId}")
    public ResponseEntity<Void> removeFromCollection(@PathVariable Long developerId, @PathVariable Long resourceId) {
        commandService.removeFromCollection(developerId, resourceId);
        return ResponseEntity.noContent().build();
    }
}
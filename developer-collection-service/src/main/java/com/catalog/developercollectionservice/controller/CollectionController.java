package com.catalog.developercollectionservice.controller;

import com.catalog.developercollectionservice.dto.CollectionItemResponse;
import com.catalog.developercollectionservice.dto.CollectionRequest;
import com.catalog.developercollectionservice.dto.DeveloperCollectionResponse;
import com.catalog.developercollectionservice.service.CollectionCommandService;
import com.catalog.developercollectionservice.service.CollectionQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/collections")
@RequiredArgsConstructor
@Tag(name = "Collection API", description = "Gestione delle collezioni personali di risorse salvate dagli sviluppatori")
@SecurityRequirement(name = "bearerAuth")
public class CollectionController {

    private final CollectionCommandService commandService;
    private final CollectionQueryService queryService;

    @GetMapping
    @Operation(summary = "Lista globale collezioni", description = "Recupera tutti gli elementi salvati in tutte le collezioni del sistema.")
    public ResponseEntity<List<CollectionItemResponse>> getAllCollections() {
        return ResponseEntity.ok(queryService.getAllCollections());
    }

    @GetMapping("/developer/{developerId}")
    @Operation(summary = "Collezione per sviluppatore", description = "Recupera la collezione personale (risorse salvate) di un singolo sviluppatore.")
    public ResponseEntity<DeveloperCollectionResponse> getCollection(@PathVariable Long developerId) {
        return ResponseEntity.ok(queryService.getDeveloperCollection(developerId));
    }

    @PostMapping
    @Operation(summary = "Aggiungi a collezione", description = "Aggiunge il riferimento a una risorsa (dal catalogo) nella collezione personale di uno sviluppatore.")
    public ResponseEntity<String> addToCollection(@Valid @RequestBody CollectionRequest request) {
        commandService.addToCollection(request);
        return new ResponseEntity<>("Risorsa aggiunta alla collezione.", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Rimuovi da collezione", description = "Elimina un elemento specifico dalla collezione.")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        commandService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
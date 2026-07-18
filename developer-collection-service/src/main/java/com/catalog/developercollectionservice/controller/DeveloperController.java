package com.catalog.developercollectionservice.controller;

import com.catalog.developercollectionservice.dto.DeveloperRequest;
import com.catalog.developercollectionservice.dto.DeveloperResponse;
import com.catalog.developercollectionservice.service.DeveloperCommandService;
import com.catalog.developercollectionservice.service.DeveloperQueryService;
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
@RequestMapping("/api/v1/developers")
@RequiredArgsConstructor
@Tag(name = "Developer API", description = "Gestione anagrafica degli sviluppatori")
@SecurityRequirement(name = "bearerAuth")
public class DeveloperController {

    private final DeveloperCommandService commandService;
    private final DeveloperQueryService queryService;

    @PostMapping
    @Operation(summary = "Crea sviluppatore", description = "Crea o sincronizza un nuovo profilo sviluppatore nel sistema.")
    public ResponseEntity<Long> createDeveloper(@Valid @RequestBody DeveloperRequest request) {
        return new ResponseEntity<>(commandService.createDeveloper(request), HttpStatus.CREATED);
    }

    @GetMapping
    @Operation(summary = "Lista sviluppatori", description = "Recupera l'elenco completo di tutti gli sviluppatori registrati.")
    public ResponseEntity<List<DeveloperResponse>> getAllDevelopers() {
        return ResponseEntity.ok(queryService.getAllDevelopers());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Dettaglio sviluppatore", description = "Recupera le informazioni di uno specifico sviluppatore tramite il suo ID.")
    public ResponseEntity<DeveloperResponse> getDeveloperById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getDeveloperById(id));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Aggiorna sviluppatore", description = "Modifica i dati anagrafici di uno sviluppatore esistente.")
    public ResponseEntity<Void> updateDeveloper(@PathVariable Long id, @Valid @RequestBody DeveloperRequest request) {
        commandService.updateDeveloper(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Elimina sviluppatore", description = "Rimuove un profilo sviluppatore dal sistema.")
    public ResponseEntity<Void> deleteDeveloper(@PathVariable Long id) {
        commandService.deleteDeveloper(id);
        return ResponseEntity.noContent().build();
    }
}
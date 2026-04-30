package com.catalog.developercollectionservice.controller;

import com.catalog.developercollectionservice.dto.DeveloperRequest;
import com.catalog.developercollectionservice.dto.DeveloperResponse;
import com.catalog.developercollectionservice.service.DeveloperCommandService;
import com.catalog.developercollectionservice.service.DeveloperQueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/developers")
@RequiredArgsConstructor
public class DeveloperController {

    private final DeveloperCommandService commandService;
    private final DeveloperQueryService queryService;

    @PostMapping
    public ResponseEntity<Long> createDeveloper(@Valid @RequestBody DeveloperRequest request) {
        return new ResponseEntity<>(commandService.createDeveloper(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DeveloperResponse>> getAllDevelopers() {
        return ResponseEntity.ok(queryService.getAllDevelopers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeveloperResponse> getDeveloperById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getDeveloperById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDeveloper(@PathVariable Long id, @Valid @RequestBody DeveloperRequest request) {
        commandService.updateDeveloper(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDeveloper(@PathVariable Long id) {
        commandService.deleteDeveloper(id);
        return ResponseEntity.noContent().build();
    }
}
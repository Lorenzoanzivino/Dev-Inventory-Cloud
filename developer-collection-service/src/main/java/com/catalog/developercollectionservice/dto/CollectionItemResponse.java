package com.catalog.developercollectionservice.dto;

/**
 * DTO per la risposta di un singolo elemento della collezione.
 * I nomi dei campi devono corrispondere a quelli usati nel frontend (dataIndex).
 */
public record CollectionItemResponse(
        Long id,
        Long resourceId,
        String resourceName, // Nome della risorsa recuperato dal catalogo
        String developerName // Nome dello sviluppatore proprietario
) {}
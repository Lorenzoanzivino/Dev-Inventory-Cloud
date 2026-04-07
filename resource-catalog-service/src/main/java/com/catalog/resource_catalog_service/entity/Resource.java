package com.catalog.resource_catalog_service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Fondamentale per l'autoincrement in PostgreSQL
    private Long id; // Usiamo Long (classe wrapper) invece di int per gestire i valori null prima della persistenza

    @Column(nullable = false)
    private String nome;

    private String descrizione;

    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "data_inserimento", updatable = false)
    private LocalDateTime dataInserimento;

    @PrePersist
    protected void onCreate() {
        this.dataInserimento = LocalDateTime.now();
    }
}
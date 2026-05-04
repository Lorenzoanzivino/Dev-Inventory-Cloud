package com.catalog.developercollectionservice.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "project_assignments", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"developer_id", "project_id"})
})
public class ProjectAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developer_id", nullable = false)
    private Developer developer;

    @Column(name = "project_id", nullable = false)
    private Long projectId;

    @Column(name = "data_assegnazione", updatable = false)
    private LocalDateTime dataAssegnazione;

    @PrePersist
    protected void onCreate() {
        this.dataAssegnazione = LocalDateTime.now();
    }
}
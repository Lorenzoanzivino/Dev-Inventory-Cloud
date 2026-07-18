# Resource Catalog Service

Il servizio core per la gestione del dominio aziendale. Mantiene il catalogo degli strumenti, delle librerie e della documentazione.

## Ruolo e Responsabilità
- **Gestione Progetti:** Entità radice che abilita il multi-tenancy a livello applicativo.
- **Gestione Categorie:** Raggruppamenti logici (es. Frontend, Backend, DevOps) associati a un singolo progetto.
- **Gestione Risorse:** I tool effettivi (URL e descrizioni) contenuti nelle categorie.
- **Database Isolato:** Gestisce il proprio database PostgreSQL (`resource_catalog_db`).

## Configurazione Locale
Porta assegnata: **8083**

Per avviare il servizio in modalità isolata, configurare le seguenti variabili d'ambiente. Assicurarsi che un database PostgreSQL sia accessibile ai parametri indicati.

```env
SPRING_PROFILES_ACTIVE=default
RESOURCE_DATASOURCE_URL=jdbc:postgresql://localhost:5435/resource_catalog_db
RESOURCE_DATASOURCE_USERNAME=admin
RESOURCE_DATASOURCE_PASSWORD=secretpassword
SPRING_JPA_HIBERNATE_DDL_AUTO=update
SPRING_JPA_SHOW_SQL=true
API_GATEWAY_URL=http://localhost:8080
```

## Esecuzione
Avvio tramite Maven Wrapper dalla directory del microservizio:

```Bash
./mvnw spring-boot:run
```

[Dev Inventory Cloud](../README.md)

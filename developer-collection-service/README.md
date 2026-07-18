# Developer Collection Service

Il servizio responsabile della gestione dei profili degli sviluppatori, delle loro collezioni personali di risorse e delle assegnazioni ai progetti.

## Ruolo e Responsabilità
- **Gestione Sviluppatori:** Mantiene l'anagrafica base dei developer sincronizzata con l'Auth Service.
- **Gestione Assegnazioni:** Permette di associare gli sviluppatori a specifici Progetti aziendali.
- **Collezioni Personali:** Consente ai developer di salvare le risorse preferite nella propria dashboard.
- **Database Isolato:** Gestisce il proprio database PostgreSQL (`developer_collection_db`).

## Configurazione Locale
Porta assegnata: **8081**

Per avviare il servizio in modalità isolata, configurare le seguenti variabili d'ambiente. Assicurarsi che un database PostgreSQL sia accessibile ai parametri indicati.

```env
SPRING_PROFILES_ACTIVE=default
DEVELOPER_DATASOURCE_URL=jdbc:postgresql://localhost:5436/developer_collection_db
DEVELOPER_DATASOURCE_USERNAME=admin
DEVELOPER_DATASOURCE_PASSWORD=secretpassword
SPRING_JPA_HIBERNATE_DDL_AUTO=update
SPRING_JPA_SHOW_SQL=true
RESOURCE_CATALOG_SERVICE_URL=http://localhost:8083
API_GATEWAY_URL=http://localhost:8080
```

## Esecuzione e Test
Avvio tramite Maven Wrapper:

```Bash
./mvnw spring-boot:run
```

Nella directory test-requests sono presenti i file .http per testare gli endpoint in modo isolato o tramite integrazione dell'ecosistema. I dati sensibili e i token JWT devono essere configurati come variabili d'ambiente nell'IDE.

[Dev Inventory Cloud](../README.md)
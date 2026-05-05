# API Gateway

Il Gateway funge da punto d'accesso unico per l'intero ecosistema Dev-Inventory-Cloud. Gestisce il routing delle richieste verso i microservizi di destinazione e funge da barriera di sicurezza.

## Ruolo e Responsabilità
- **Routing Dinamico:** Indirizza le richieste HTTP in base ai percorsi configurati.
- **Filtro di Sicurezza (AuthenticationFilter):** Intercetta le richieste, valida il token JWT e inietta l'identità dell'utente (Email e Ruolo) negli header per i servizi a valle.
- **Gestione CORS:** Permette le comunicazioni sicure con il frontend.
- **Aggregazione Swagger UI:** Centralizza la documentazione OpenAPI di tutti i microservizi.

## Configurazione Locale
Porta assegnata: **8080**

Per avviare il servizio in modalità isolata (fuori da Docker), è necessario configurare le seguenti variabili d'ambiente:

```env
SPRING_PROFILES_ACTIVE=default
JWT_SECRET=super_secret_key_for_jwt_generation_must_be_long
AUTH_SERVICE_URL=http://localhost:8082
DEVELOPER_COLLECTION_SERVICE_URL=http://localhost:8081
RESOURCE_CATALOG_SERVICE_URL=http://localhost:8083
```

## Esecuzione
Avvio tramite Maven Wrapper dalla directory del microservizio:
```bash
./mvnw spring-boot:run
```

---

[Dev Inventory Cloud](../README.md)

---

**Ultimo aggiornamento:** Maggio 2026

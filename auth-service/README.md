# Auth Service

Il servizio responsabile dell'identità degli utenti, della sicurezza e del rilascio dei token all'interno dell'ecosistema.

## Ruolo e Responsabilità
- **Gestione Credenziali:** Registrazione utenti (Default: DEVELOPER) e Login.
- **Generazione JWT:** Creazione di token firmati tramite HMAC SHA-256 contenenti ID utente e Ruolo.
- **Sincronizzazione Dati:** Comunica con il `developer-collection-service` tramite OpenFeign per generare automaticamente il profilo Developer in seguito a una registrazione riuscita.
- **Database Isolato:** Gestisce il proprio database PostgreSQL (`auth_db`).

## Configurazione Locale
Porta assegnata: **8082**

Per avviare il servizio in modalità isolata, configurare le seguenti variabili d'ambiente. Assicurarsi che un database PostgreSQL sia accessibile ai parametri indicati.

```env
SPRING_PROFILES_ACTIVE=default
AUTH_DATASOURCE_URL=jdbc:postgresql://localhost:5437/auth_db
AUTH_DATASOURCE_USERNAME=admin
AUTH_DATASOURCE_PASSWORD=secretpassword
SPRING_JPA_HIBERNATE_DDL_AUTO=update
SPRING_JPA_SHOW_SQL=true
JWT_SECRET=super_secret_key_for_jwt_generation_must_be_long
JWT_EXPIRATION=3600000
API_GATEWAY_URL=http://localhost:8080
DEVELOPER_COLLECTION_SERVICE_URL=http://localhost:8081
```

## Esecuzione
Avvio tramite Maven Wrapper dalla directory del microservizio:

```Bash
./mvnw spring-boot:run
```

---

**Ultimo aggiornamento:** Maggio 2026
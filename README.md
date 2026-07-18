# ☁️ Dev-Inventory-Cloud

**Piattaforma Full-Stack e API a Microservizi per la gestione di risorse, tool e documentazione per team di sviluppo.**


## 🎯 Panoramica del Progetto

### Cos'è?
Dev-Inventory-Cloud è una piattaforma cloud-native basata su un'architettura a microservizi (Spring Boot). È progettata per garantire l'isolamento dei dati, sicurezza avanzata e alta manutenibilità attraverso il pattern Database-per-Service.

### Cosa fa?
Il sistema centralizza e indicizza le risorse software (librerie, tool, link a documentazioni) categorizzandole in base a specifici progetti. Gestisce l'autenticazione degli utenti, i profili degli sviluppatori, e orchestra le comunicazioni sicure tra i vari moduli del sistema tramite un API Gateway.

### A cosa serve?
Permette ai Tech Lead (ADMIN) di orchestrare gli strumenti di lavoro e assegnare i developer ai vari progetti. Aiuta gli sviluppatori ad avere una dashboard organizzata contenente solo le categorie e le risorse necessarie ai progetti a cui lavorano, accelerando l'onboarding.


## 📑 Sommario
- [Architettura del Sistema](#-architettura-del-sistema)
- [Tech Stack & Tools](#-tech-stack--tools)
- [Funzionalità Principali](#-funzionalità-principali)
- [Design Pattern e Scelte Tecniche](#-design-pattern-e-scelte-tecniche)
- [Workflow Git](#-workflow-git)
- [Setup & Esecuzione](#-setup--esecuzione)
- [Documentazione Microservizi](#-documentazione-microservizi)


## 🏗️ Architettura del Sistema
L'ecosistema è composto da un API Gateway e tre microservizi di backend indipendenti, ognuno con il proprio database PostgreSQL isolato.

1.  **API Gateway (Spring Cloud Gateway)** - Porta: `8080` (esposta come `80`)
    *   Punto d'accesso unico con routing dinamico.
    *   Implementa filtri di sicurezza per la validazione dei token JWT.
2.  **Auth Service** - Porta: `8082`
    *   Gestisce registrazione, login e validazione credenziali.
    *   Genera token JWT (HMAC SHA-256) per l'accesso sicuro.
    *   Database: **PostgreSQL (`auth_db`)**.
3.  **Developer Collection Service** - Porta: `8081`
    *   Gestisce i profili degli sviluppatori e le collezioni/assegnazioni ai progetti.
    *   Database: **PostgreSQL (`developer_collection_db`)**.
4.  **Resource Catalog Service** - Porta: `8083`
    *   Gestisce il dominio delle risorse, delle categorie e dei progetti.
    *   Database: **PostgreSQL (`resource_catalog_db`)**.


## 🛠️ Tech Stack & Tools

**Backend Core**
- **Java 17** & **Spring Boot 3.2.5**
- **Spring Cloud Gateway** (API Management)
- **Spring Security** (Authentication & JWT)
- **Spring Data JPA** & **Hibernate** (Code-First)
- **OpenFeign** (Comunicazione Inter-service sincrona)

**DevOps & Infrastruttura**
- **Docker** & **Docker Compose** (Containerizzazione)
- **PostgreSQL 17** (DBMS relazionale)
- **GitHub Actions** (CI/CD Pipeline)


## ✨ Funzionalità Principali

### 1. Multi-Tenancy (Isolamento per Progetto) con Persistenza
Il sistema supporta la gestione compartimentata dei dati. Risorse e categorie non sono globali ma afferiscono a specifici **Progetti**.
*   **Filtri Dinamici:** La UI filtra automaticamente liste e menu a tendina (es. creazione risorsa) in base al progetto attivo.
*   **State Persistence:** Il frontend memorizza il progetto selezionato nel `localStorage`, garantendo che l'utente non perda il contesto di lavoro ricaricando la pagina.

### 2. Sicurezza RBAC Avanzata e UI Reattiva
L'ecosistema supporta due ruoli principali:
*   **ADMIN**: Ha visibilità totale. Può creare/modificare/eliminare progetti, categorie, risorse e assegnare gli sviluppatori.
*   **DEVELOPER**: Ha visibilità limitata ai soli progetti assegnati.
*   **UI Hiding:** Il frontend intercetta il ruolo dal JWT e nasconde dinamicamente i pulsanti "Create", "Edit" e "Delete" per gli utenti non autorizzati, offrendo un'esperienza *read-only* sicura e pulita, validata a monte dai filtri del Gateway API.

### 3. Sincronizzazione Cross-Service
La creazione o l'aggiornamento di un utente scatena chiamate sicure (via Feign Client) per mantenere allineati i database del servizio di Autenticazione e quello del Developer Collection Service, garantendo l'integrità referenziale distribuita.


## 🧩 Design Pattern e Scelte Tecniche

- **Database-per-Service:** Ogni microservizio ha un proprio container PostgreSQL isolato, garantendo il disaccoppiamento totale dei dati.
- **Code-First (Hibernate):** Utilizzo della proprietà `ddl-auto=update` per generare lo schema del database direttamente dalle `@Entity` Java.
- **CQRS Logico:** Separazione tra Command Service (scrittura) e Query Service (lettura) all'interno dei microservizi.
- **Stateless Services:** Nessuna sessione in memoria. La sicurezza e l'identità sono interamente gestite tramite token JWT passati dall'API Gateway.
- **Data Transfer Objects (DTO):** Utilizzati ai confini dell'applicazione per disaccoppiare la logica interna dalle API esposte al client.


## 🔄 Workflow Git (MANDATORY SEQUENCE)
Viene seguito un protocollo rigoroso per lo sviluppo:
1. Creazione Feature Branch per ogni task (`feature/nome-task`).
2. Sviluppo e commit atomici.
3. Push sul remote branch.
4. Creazione Pull Request verso `develop`.
5. Verifica superamento pipeline (GitHub Actions).
6. Merge ed eliminazione del branch.
   **Vietati i commit diretti su `main` o `develop`.**


## 🚀 Setup & Esecuzione

Prerequisiti: **Docker** e **Docker Compose**.

### 1. File di Configurazione (`.env`)
Il progetto utilizza variabili d'ambiente per proteggere le credenziali. Prima di avviare l'ecosistema, crea un file `.env` nella directory root del progetto con il seguente contenuto:

```env
DB_USERNAME=admin
DB_PASSWORD=secretpassword
SPRING_JPA_HIBERNATE_DDL_AUTO=update
SPRING_JPA_SHOW_SQL=true
JWT_SECRET=super_secret_key_for_jwt_generation_must_be_long
JWT_EXPIRATION=3600000
API_GATEWAY_URL=http://api-gateway:8080
```

### 2. Avvio dell'Ecosistema
Esegui i seguenti comandi dalla root del progetto:

```bash
docker compose up -d --build
```

Questo comando scaricherà le immagini PostgreSQL, compilerà i microservizi e avvierà l'intera infrastruttura.


## 📖 Documentazione Microservizi
Per i dettagli su configurazioni locali, comandi di avvio isolato e test HTTP di ogni singolo modulo, consulta i README specifici:

[API Gateway](./api-gateway/)

[Auth Service](./auth-service/)

[Developer Collection Service](./developer-collection-service/)

[Resource Catalog Service](./resource-catalog-service/)
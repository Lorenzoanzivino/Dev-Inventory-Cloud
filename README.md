# ☁️ Dev-Inventory-Cloud

**Piattaforma Full-Stack e API a Microservizi per la gestione di risorse, tool e documentazione per team di sviluppo.**

---

## 🎯 Panoramica del Progetto

### Cos'è?
Dev-Inventory-Cloud è una piattaforma B2B cloud-native basata su un'architettura a microservizi (Spring Boot) e un'interfaccia frontend moderna (React + Refine.dev). È l'evoluzione scalabile di un precedente sistema monolitico, riprogettata per garantire isolamento dei dati, sicurezza avanzata e alta manutenibilità.

### Cosa fa?
Il sistema centralizza e indicizza le risorse software (librerie, tool, link a documentazioni, credenziali architetturali) categorizzandole in base a **Progetti** specifici. Gestisce l'autenticazione degli utenti, l'assegnazione degli sviluppatori ai vari progetti e orchestra le comunicazioni sicure tra i vari moduli del sistema tramite un API Gateway.

### A cosa serve?
Serve a risolvere il problema della dispersione delle informazioni nei team di sviluppo. Permette ai Tech Lead (ADMIN) di orchestrare gli strumenti di lavoro assegnandoli a specifici progetti, e agli Sviluppatori (DEVELOPER) di avere una dashboard pulita e filtrata contenente solo le categorie e le risorse necessarie ai progetti a cui stanno effettivamente lavorando, accelerando l'onboarding e riducendo il rumore di fondo.

---

## 📑 Sommario
- [Architettura del Sistema](#-architettura-del-sistema)
- [Tech Stack & Tools](#-tech-stack--tools)
- [Funzionalità Principali](#-funzionalità-principali)
- [Design Pattern e Scelte Tecniche](#-design-pattern-e-scelte-tecniche)
- [Workflow Git](#-workflow-git)
- [Setup & Esecuzione](#-setup--esecuzione)
- [Struttura API & Endpoints](#-struttura-api--endpoints)

---

## 🏗️ Architettura del Sistema
Il sistema è basato su un'architettura a microservizi distribuita per il backend, orchestrata tramite Docker, integrata con una Single Page Application (SPA) frontend.

1.  **Frontend SPA (React/Refine)** - Porta: `5173`
    *   Pannello di amministrazione B2B per la gestione di risorse e categorie.
    *   Interfaccia reattiva con Ant Design e Tailwind CSS.
    *   Gestione Multi-Tenant dinamica via API Gateway.
2.  **API Gateway (Spring Cloud Gateway)** - Porta: `80`
    *   Punto d'accesso unico per il frontend con routing dinamico.
    *   Implementa filtri di sicurezza globali per la validazione dei token JWT e la gestione dei CORS.
3.  **Auth Service** - Porta interna: `8082`
    *   Gestisce registrazione, login, generazione JWT (HMAC SHA-256) e gestione del profilo (es. update password/nome).
    *   Supporta l'integrazione Role-Based Access Control (RBAC).
    *   Database: **PostgreSQL (`auth-db`)**.
4.  **Resource Catalog Service** - Porta interna: `8080`
    *   Gestisce il dominio delle risorse, delle categorie e dei progetti (Multi-Tenancy).
    *   Database: **PostgreSQL (`catalog-db`)**.
5.  **Developer Collection Service** - Porta interna: `8081`
    *   Gestisce i profili degli sviluppatori e le assegnazioni ai progetti.
    *   Comunica asincronamente con Auth Service e Catalog Service tramite **OpenFeign**.
    *   Database: **PostgreSQL (`developer-db`)**.

---

## 🛠️ Tech Stack & Tools

**Frontend**
- **React** (Component-based UI)
- **Refine.dev** (Headless B2B framework)
- **Ant Design** (Component Library)
- **Vite** (Build Tool)

**Backend Core**
- **Java 17** & **Spring Boot 3.2.x**
- **Spring Cloud Gateway** (API Management & Security)
- **Spring Security** (Authentication & RBAC)
- **Spring Data JPA** & **Hibernate** (Persistenza)
- **MapStruct** & **Lombok** (Boilerplate reduction)
- **OpenFeign** (Comunicazione Inter-service sincrona)

**DevOps & Infrastruttura**
- **Docker** & **Docker Compose** (Containerizzazione)
- **PostgreSQL 17** (DBMS relazionale multiplo)
- **Maven** (Backend Build Tool)

---

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

---

## 🧩 Design Pattern e Scelte Tecniche

- **Stateless Architecture:** Tutti i microservizi sono progettati per essere stateless; il contesto di sicurezza è demandato interamente ai token JWT (passati dal Gateway).
- **Global Exception Handling:** Gestione centralizzata degli errori tramite `@RestControllerAdvice` con risposte standardizzate.
- **Data Transfer Objects (DTO):** Utilizzo esclusivo di Java Records e DTO per comunicazioni intra e inter-servizio, disaccoppiando le entità di dominio dall'esposizione REST.
- **Frontend Context API:** Utilizzo del Context di React per gestire dinamicamente lo stato globale del Multi-Tenancy iniettando il Project ID in ogni query e mutazione REST.

---

## 🔄 Workflow Git
Viene seguito un protocollo rigoroso per garantire la stabilità:
1. Sviluppo esclusivo in feature branch: `feature/nome-task`.
2. Commit atomici, strutturati e descrittivi.
3. Pull Request verso `develop` al termine della task.
4. Nessun commit diretto consentito su `develop` o `main`.
5. Promozione da `develop` a `main` solo a seguito di Integration Test E2E superati.

---

## 🚀 Setup & Esecuzione

Prerequisiti: **Docker** e **Docker Compose** installati nel sistema.

1.  **Clonare la repository:**
    ```bash
    git clone [https://github.com/Lorenzoanzivino/Dev-Inventory-Cloud.git](https://github.com/Lorenzoanzivino/Dev-Inventory-Cloud.git)
    cd Dev-Inventory-Cloud
    ```

2.  **Avviare l'ecosistema:**
    ```bash
    docker compose up -d --build
    ```

3.  **Promozione ad ADMIN (Primo Avvio):**
    Di default, ogni nuovo utente registrato ottiene il ruolo `DEVELOPER`. Per sbloccare la creazione dei progetti e gestire il sistema, è necessario promuovere il primo utente ad `ADMIN` direttamente nel database.
    *   Registra un utente tramite l'endpoint `/register` o dal Frontend.
    *   Accedi al database `auth-db` (es. tramite DBeaver su `localhost:5434`).
    *   Esegui la query:
        ```sql
        UPDATE user_credentials SET role = 'ADMIN' WHERE email = 'tua@email.com';
        ```
    *   Effettua nuovamente il login per ottenere il JWT aggiornato con i nuovi permessi.

4.  **Accesso:**
    - **Frontend App:** `http://localhost:5173`
    - **API Gateway (Backend):** `http://localhost`

---

## 📑 Struttura API & Endpoints

Tutte le API transitano attraverso l'API Gateway sulla porta `80` e sono protette da JWT (header `Authorization: Bearer <token>`).

### Auth Service (`/api/v1/auth`)
*   `POST /register` - Registrazione nuovo utente (Default: DEVELOPER)
*   `POST /login` - Autenticazione e rilascio JWT
*   `GET /me` - Recupero informazioni profilo personale e ruolo
*   `PUT /me` (o `/update`) - Aggiornamento dei dati utente (nome, password)

### Catalog Service (`/api/v1`)
*   `GET /projects` - Lista progetti (filtrati per Developer se non ADMIN)
*   `POST /projects` - Crea un progetto (Richiede ADMIN)
*   `GET /categories` - Recupera le categorie (filtrabili per `projectId`)
*   `GET /resources` - Recupera le risorse (filtrabili per `projectId` e interrelazionate alle categorie)

### Developer Service (`/api/v1`)
*   `GET /developers` - Lista sviluppatori registrati
*   `GET /assignments/developer/{id}` - Recupera i progetti assegnati a uno sviluppatore specifico
*   `POST /assignments` - Assegna uno sviluppatore a un progetto (Richiede ADMIN)

---

**Ultimo aggiornamento:** Maggio 2026
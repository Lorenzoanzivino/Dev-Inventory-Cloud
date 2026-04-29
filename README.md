# ☁️ Dev-Inventory-Cloud

**RESTful API a Microservizi per la gestione di risorse, tool e documentazione per sviluppatori.**

Questo progetto rappresenta l'evoluzione cloud-native del catalogo [Dev-Inventory](https://github.com/Lorenzoanzivino/Dev-Inventory-API), rifattorizzato da un'architettura monolitica a un ecosistema basato su microservizi stateless, con focus su scalabilità, qualità del codice e separazione dei domini.

---

## 📑 Sommario
- [Architettura del Sistema](#-architettura-del-sistema)
- [Tech Stack & Tools](#-tech-stack--tools)
- [Design Pattern e Scelte Tecniche](#-design-pattern-e-scelte-tecniche)
- [Strategia di Testing](#-strategia-di-testing)
- [Workflow Git](#-workflow-git)
- [Setup & Esecuzione](#-setup--esecuzione)
- [API Endpoints](#-api-endpoints)

---

## 🏗️ Architettura del Sistema
Il sistema è basato su un'architettura a microservizi distribuita, orchestrata tramite Docker.

1.  **API Gateway (Spring Cloud Gateway)** - Porta: `80`
   - Punto d'accesso unico per i client con routing dinamico.
   - Implementa filtri di sicurezza per la validazione dei token JWT.
2.  **Auth Service** - Porta interna: `8082`
   - Gestisce registrazione, login e generazione di JWT (HMAC SHA-256).
   - Database: **PostgreSQL**.
3.  **Resource Catalog Service** - Porta interna: `8080`
   - Gestisce il dominio delle risorse e delle categorie (1:N).
   - Implementa pattern CQRS per l'ottimizzazione delle performance.
   - Database: **PostgreSQL**.
4.  **Developer Collection Service** - Porta interna: `8081`
   - Gestisce i profili degli sviluppatori e le loro collezioni salvate.
   - Comunica con il Catalog Service tramite **OpenFeign**.
   - Database: **PostgreSQL**.

---

## 🛠️ Tech Stack & Tools

**Backend Core**
- **Java 17** & **Spring Boot 3.2.x**
- **Spring Cloud Gateway** (API Management)
- **Spring Security** (Authentication & JWT)
- **Spring Data JPA** & **Hibernate** (Persistenza)
- **MapStruct** (Mapping DTO-Entity)
- **Lombok** (Boilerplate reduction)
- **OpenFeign** (Comunicazione Inter-service)

**Testing Frameworks**
- **JUnit 5** & **Mockito** (Unit Testing)
- **H2 Database** (In-memory testing)
- **MockMvc** (Web Layer testing)

**DevOps & Infrastruttura**
- **Docker** & **Docker Compose** (Containerizzazione)
- **PostgreSQL 17** (DBMS)
- **Maven** (Build Tool)

---

## 🧩 Design Pattern e Scelte Tecniche

### CQRS (Command Query Responsibility Segregation)
- Separazione netta tra i modelli di scrittura (**CommandService**) e i modelli di lettura (**QueryService**).
- Maggiore manutenibilità e scalabilità orizzontale dei carichi di lavoro.

### Robustezza e Manutenibilità
- **Java Records:** Utilizzo di DTO immutabili per il trasferimento dati.
- **Global Exception Handling:** Gestione centralizzata tramite `@RestControllerAdvice` con risposte standardizzate in formato JSON.
- **Logging Strutturato:** Configurazione Logback per output in formato JSON, ottimizzato per sistemi di aggregazione log in cloud.

---

## 🧪 Strategia di Testing

Il sistema adotta una piramide del test rigorosa:

-   **Unit Tests:** Verifica della logica di business nei Service utilizzando Mockito per l'isolamento completo.
-   **Repository Tests:** Integration test dello strato di persistenza con database H2 in-memory per validare query JPA e vincoli di database.
-   **Web Layer Tests:** Verifica dei controller tramite MockMvc per validare endpoint, mapping JSON e `@Valid` constraints.

---

## 🔄 Workflow Git
Viene seguito un protocollo rigoroso per garantire la stabilità del ramo principale:
1. Creazione repository GitHub.
2. Clone locale e creazione branch `develop`.
3. Sviluppo in feature branch: `feature/nome-task`.
4. Commit atomici e Push.
5. Pull Request verso `develop`.
6. Merge e cancellazione branch temporaneo.
   *Note: I commit diretti su `main` e `develop` sono proibiti.*

---

## 🚀 Setup & Esecuzione

Prerequisiti: Docker e Docker Compose installati.

1.  **Clonare la repository:**
    ```bash
    git clone [https://github.com/Lorenzoanzivino/Dev-Inventory-Cloud.git](https://github.com/Lorenzoanzivino/Dev-Inventory-Cloud.git)
    cd Dev-Inventory-Cloud
    ```
2.  **Avviare l'ecosistema:**
    ```bash
    docker compose up --build
    ```
3.  **Accesso API:**
   - Gateway: `http://localhost`
   - Swagger UI: `http://localhost/swagger-ui/index.html` (Aggregato per tutti i servizi)

---

## 📑 API Endpoints

### Auth Service
| Metodo | Endpoint | Descrizione |
| :--- | :--- | :--- |
| POST | /api/v1/auth/register | Registrazione nuovo utente |
| POST | /api/v1/auth/login | Autenticazione e rilascio JWT |

### Catalog Service
| Metodo | Endpoint | Descrizione |
| :--- | :--- | :--- |
| GET | /api/v1/categories | Recupera tutte le categorie |
| POST | /api/v1/categories | Crea una nuova categoria |
| GET | /api/v1/resources | Recupera tutte le risorse |
| POST | /api/v1/resources | Crea una risorsa (richiede CategoryId) |

### Developer Service
| Metodo | Endpoint | Descrizione |
| :--- | :--- | :--- |
| GET | /api/v1/developers | Lista sviluppatori registrati |
| GET | /api/v1/developers/{id} | Dettaglio singolo sviluppatore |

---

**Ultimo aggiornamento:** Aprile 2026
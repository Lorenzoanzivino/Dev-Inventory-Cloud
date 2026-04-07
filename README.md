# ☁️ Dev-Inventory-Cloud

**RESTful API a Microservizi per la gestione di risorse, tool e documentazione per sviluppatori.**

Questo progetto rappresenta l'evoluzione cloud-native del catalogo [Dev-Inventory](https://github.com/Lorenzoanzivino/Dev-Inventory-API), rifattorizzato da un'architettura monolitica a un ecosistema basato su microservizi stateless, con focus su scalabilità, containerizzazione e separazione dei domini.

---

## 📑 Sommario
- [Architettura del Sistema](#-architettura-del-sistema)
- [Tech Stack & Tools](#-tech-stack--tools)
- [Design Pattern e Scelte Tecniche](#-design-pattern-e-scelte-tecniche)
- [Workflow Git](#-workflow-git)
- [Setup & Esecuzione](#-setup--esecuzione)

---

## 🏗️ Architettura del Sistema
Il sistema è suddiviso in microservizi indipendenti orchestrati tramite Docker.

1. **API Gateway (Spring Cloud Gateway)** - Unico punto d'accesso per i client.
   - Routing, bilanciamento del carico e potenziale rate-limiting.
2. **Resource Catalog Service**
   - Gestisce il dominio delle risorse (creazione, lettura, aggiornamento, eliminazione).
   - Database dedicato (PostgreSQL).
3. **Developer Collection Service (WIP)**
   - Gestisce i profili degli sviluppatori e i loro inventari personali di tool.
   - Database dedicato, isolato dal Catalog Service.

---

## 🛠️ Tech Stack & Tools

**Backend Core**
- Java
- Spring Boot
- Spring Cloud Gateway
- Spring Data JPA / Hibernate

**Database**
- PostgreSQL

**DevOps & Infrastruttura**
- Docker & Docker Compose
- Maven

---

## 🧩 Design Pattern e Scelte Tecniche

### Core Backend
- **Layered Architecture:** Separazione rigorosa tra Controller, Service e Repository all'interno di ogni microservizio per garantire coerenza architetturale.
- **Data Transfer Object (DTO):** Isolamento totale tra le entità persistenti sul database (JPA Entities) e le risposte esposte via API tramite validazione rigorosa. Nessuna esposizione diretta dello schema dati.
- **Dependency Injection:** Utilizzo intensivo dell'injection tramite costruttore per massimizzare la testabilità e ridurre l'accoppiamento.
- **Stateless Services:** I microservizi non mantengono lo stato del client, garantendo una scalabilità orizzontale pulita.

### Decisioni Architetturali (Trade-offs)
In un ecosistema a microservizi è fondamentale bilanciare la complessità. Per questo progetto sono state prese le seguenti decisioni mirate alla "deployment readiness":

- **Solo API Gateway:** Abbiamo implementato Spring Cloud Gateway come single entry-point per esporre un'interfaccia unificata ai client e gestire il routing in modo centralizzato.
- **Nessun Service Registry (es. Eureka):** Essendo il sistema nativamente progettato per essere containerizzato, la *service discovery* è demandata al DNS interno di Docker (e in futuro, di Kubernetes). Implementare un registry applicativo come Eureka avrebbe aggiunto overhead inutile, duplicando funzionalità già gestite in modo più efficiente a livello di infrastruttura di rete.
- **Nessun Config Server Centralizzato:** Per mantenere i servizi snelli e pronti al deployment, si è scelto di non introdurre un Config Server (es. Spring Cloud Config). La configurazione avviene interamente tramite variabili d'ambiente iniettate dai file `docker-compose.yml`, eliminando l'hardcoding e rispettando fedelmente i principi delle *12-Factor App*.

---

## 🔄 Workflow Git
Il progetto segue una rigorosa pipeline di branching:
`branch` → `develop` → `commit` → `push` → `PR` → `merge` → `delete branch`

---

## 🚀 Setup & Esecuzione

*(In fase di definizione - I comandi per l'orchestrazione tramite Docker Compose verranno aggiunti a breve)*
# BookstoreApp - System Zarządzania Księgarnią

Projekt realizowany w ramach przedmiotu **Inżynieria Oprogramowania**. Aplikacja służy do kompleksowego zarządzania zasobami księgarni, bazą autorów oraz katalogiem książek, oferując zarówno interfejs webowy (UI), jak i programistyczny (REST API).

## Funkcjonalności

### Zarządzanie Katalogiem
*   **Moduł Książek:** Przeglądanie dostępnych pozycji, szczegółowe informacje o wydaniach oraz przypisanie do autorów.
*   **Moduł Autorów:** Zarządzanie bazą twórców.
*   **Moduł Punktów Sprzedaży:** Zarządzanie fizycznymi lokalizacjami księgarń.

### Panel Użytkownika i Administracja
*   **Interfejs Webowy (UI):** Intuicyjne widoki zbudowane w silniku Thymeleaf (Książki, Autorzy, Księgarnie).
*   **Bezpieczeństwo:** Dostęp do wybranych zasobów zabezpieczony za pomocą **Spring Security**.
*   **Wielojęzyczność:** Wsparcie dla języków: polskiego, angielskiego oraz włoskiego.

### Integracja i API
*   **REST API:** Pełna wystawka punktów końcowych dla integracji zewnętrznych (zarządzanie książkami i księgarniami w formacie JSON).
*   **Walidacja:** Zaawansowana walidacja danych wejściowych po stronie serwera.

## Technologie i Architektura

Projekt został zaprojektowany zgodnie z zasadami czystej architektury i wzorcami projektowymi:
*   **Backend:** Java, Spring Boot 3, Spring Data JPA, Spring Security.
*   **Frontend:** Thymeleaf (Server-Side Rendering), CSS, HTML5.
*   **Baza danych:** MySQL (produkcyjnie) / H2 lub Memory (do testów/rozwoju).
*   **Architektura:** Podział na warstwy (Controller -> Service -> DAO/Repository).
*   **Wzorce:** Wykorzystanie wzorca **Strategy/Repository** – system wspiera różne mechanizmy składowania danych (InMemory, JPA, Spring Data).
*   **Infrastruktura:** Docker, Docker Compose.

## Struktura Projektu

Aplikacja demonstruje ewolucję podejścia do warstwy dostępu do danych:
*   `repository.mem` – implementacja w pamięci RAM (szybkie prototypowanie).
*   `repository.jpa` – klasyczna implementacja z użyciem EntityManager.
*   `repository.data` – nowoczesne podejście z użyciem Spring Data Repositories.

## Instrukcja uruchomienia

### Wymagania
*   Docker i Docker Compose (zalecane)
*   JDK 17+ i Maven (jeśli chcesz uruchamiać bez Dockera)

### Uruchomienie za pomocą Docker
Najszybszy sposób na postawienie całego środowiska (aplikacja + baza danych MySQL):

1.  Otwórz terminal w głównym folderze projektu.
2.  Uruchom komendę:
    ```bash
    docker-compose -f docker-bookstore/docker-compose.yml up --build
    ```
3.  Aplikacja będzie dostępna pod adresem: [http://localhost:8080](http://localhost:8080).

### Uruchomienie deweloperskie (Maven)
Jeśli chcesz uruchomić samą aplikację z poziomu IDE:
1.  Skonfiguruj połączenie z bazą danych w `src/main/resources/application.properties`.
2.  Uruchom klasę: `bookstore.BookstoreServiceMain`.

## Dokumentacja API

Aplikacja udostępnia punkty końcowe REST, m.in.:
*   `GET /api/books` – lista wszystkich książek.
*   `GET /api/bookstores` – lista księgarń.
*   `GET /hello` – prosty punkt testowy.

---

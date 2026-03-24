---
name: clean-structure-backend
description: Component organization and Ktor principles for the Backend (Engine).
---

# Clean Structure (Backend - Engine)

A robust backend structure ensuring the VUELTA F1NAL motor runs at peak performance.

## Guidelines
1. **Module Responsibility**:
   - `:engine`: Ktor-based JVM application handling data persistence, predictions, and providing the API.
2. **Package Organization (Engine)**:
   - `routes`: Ktor route definitions (Extension functions on `Route`).
   - `domain.models`: Pure business entities (No serialization or framework dependencies).
   - `data.dtos`: Network/Persistence data classes (Serializable).
   - `data.mappers`: Converters between DTOs and Domain Models.
   - `data.repositories`: Data access logic and business rules implementation.
3. **Naming**:
   - Routes: PascalCase ending in `Routes` (e.g., `ResultsRoutes`).
   - Mappers: PascalCase ending in `Mapper` (e.g., `DriverResultMapper`).
4. **Consistency**: Use a consistent layered approach: `Routes` -> `Repository` -> `Mappers/DTOs`.

## Engine vs Compose Comparison
| Layer | Engine (Backend) | Compose (Frontend) |
| :--- | :--- | :--- |
| **Entry Point** | `Application.kt` | `MainActivity.kt` |
| **Exposure** | `routes/*.kt` (API Endpoints) | `ui/screens/*.kt` (App Screens) |
| **State/Logic** | `data/repositories` / `mappers` | `ui/viewmodel` |
| **Data models** | `data/dtos` | `data/dtos` |
| **Transformations** | `data/mappers` | `data/mappers` |
| **Business logic** | `domain/models` | `domain/models` |

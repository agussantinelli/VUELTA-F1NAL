---
name: modular-architecture
description: Guidelines for maintaining a modular architecture in VUELTA F1NAL (FrontEnd & Backend)
---

# Modular Architecture Guidelines

VUELTA F1NAL follows a strict modular and layered architecture.

## Core Rules

1. **Layer Separation**:
   - **Data Layer**: API clients, DTOs, Mappers, and Repositories (Unified).
   - **Domain Layer**: Essential business logic and entities (No interfaces in Domain for simple cases).
   - **UI Layer**: Composables and ViewModels.

2. **Dependency Rule**:
   - Outer layers (UI) depend on inner layers (Domain). Inner layers NEVER depend on outer layers.

3. **Data Models**:
   - Use `DTO` for network/persistence.
   - Use `DomainModel` for business logic.
   - Map between them in the Repository layer.

4. **Granularity (One per Class)**:
   - Split Repositories and Services by feature or concern (e.g., `ResultsRepository`, `TopSpeedsRepository`).
   - Avoid "God" Repositories or Services that handle multiple unrelated business domains.

5. **KMP (Future Proofing)**:
   - Keep business logic in plain Kotlin files to allow easier migration to full Multiplatform if needed.

## Directory Structure
- `data/`: `dtos`, `mappers`, `repositories`, `remote`.
- `domain/`: `models` (Entities).
- `ui/`: `screens`, `viewmodel`, `theme`.
- `engine/`: Ktor backend module.

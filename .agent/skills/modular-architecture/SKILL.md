---
name: modular-architecture
description: Guidelines for maintaining a modular architecture in VUELTA F1NAL (FrontEnd & Backend)
---

# Modular Architecture Guidelines

VUELTA F1NAL follows a strict modular and layered architecture.

## Core Rules

1. **Layer Separation**:
   - **Data Layer**: API clients, Database, Repositories (Data mapping).
   - **Domain Layer**: Essential business logic and Use Cases (No platform dependencies).
   - **UI Layer**: Composables and ViewModels.

2. **Dependency Rule**:
   - Outer layers (UI) depend on inner layers (Domain). Inner layers NEVER depend on outer layers.

3. **Data Models**:
   - Use `DTO` for network/persistence.
   - Use `DomainModel` for business logic.
   - Map between them in the Repository layer.

4. **KMP (Future Proofing)**:
   - Keep business logic in plain Kotlin files to allow easier migration to full Multiplatform if needed.

## Directory Structure
- `data/`: Repositories, Database, API.
- `domain/`: Models, Interfaces, UseCases.
- `ui/`: Screens, Components, Theme.
- `engine/`: Ktor specific services (Backend).

# Naming Conventions Skill

This skill defines the directory and file naming standards for the VUELTA F1NAL ecosystem to ensure consistency across Frontend and Backend.

## Core Folders
Organize code into these specific directories based on their responsibility:

- **`dtos/`**: External data representations and API contracts (Data layer).
- **`mappers/`**: Data transformation logic (e.g., DTO to Domain model) and mapper implementations.
- **`repositories/`**: Infrastructure and Interface contracts (Plural). This is the single source for data orchestration.
- **`models/`**: Pure business entities and domain logic (Domain layer).

## Rules
1. **Pluralization**: Always use plural names for directories containing multiple components (e.g., `repositories`, `mappers`, `routes`).
2. **Single Responsibility**: Each folder should only contain files that strictly follow the convention above.
3. **Consistency**: Use the same naming across the `engine` (Backend) and `composeApp` (Frontend) modules.

## Example Structure (ComposeApp)
```
data/
  ├── dtos/          # DTOs
  ├── mappers/       # Mapper implementations (*Mapper)
  └── repositories/  # Repository interfaces
domain/
  └── models/        # Business entities
```

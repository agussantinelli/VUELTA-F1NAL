---
name: clean-structure
description: Component organization and modern Android/Compose principles for the FrontEnd.
---

# Clean Structure (Mobile)

A well-organized codebase ensures VUELTA F1NAL is maintains racing speed.

## Guidelines
1. **Module Separation**:
   - `:composeApp`: Android UI and platform-specific logic.
   - `:engine`: Ktor backend and prediction core.
2. **Package Organization (App)**:
   - `ui.components`: Reusable Composables.
   - `ui.screens`: Screen-level Composables.
   - `ui.theme`: Design system (Color, Type, Theme).
   - `data`: Repositories and local/remote data sources.
   - `domain`: Use Cases and Business Models.
3. **Naming**:
   - Composables: PascalCase (e.g., `RaceCard`).
   - ViewModels: PascalCase ending in `ViewModel`.
4. **Consistency**: Use a consistent MVI/MVVM pattern for state handling across all screens.

---
name: global-skills
description: Catalog of all specialized skills used across the VUELTA F1NAL project (Frontend & Backend).
---

# 📚 VUELTA F1NAL Global Skills Catalog

This skill serves as a central index for all architectural and development guidelines established in the VUELTA F1NAL project. Each skill defines rules and best practices that **MUST** be respected by the agent and developers.

## Mobile FrontEnd (`composeApp`)

- **[adaptive-ui-compose](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/adaptive-ui-compose/SKILL.md)**: Handling different screen sizes in Android using WindowSizeClass and adaptive layouts.
- **[clean-structure](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/clean-structure/SKILL.md)**: Component organization and modern Android/Compose principles for the FrontEnd.
- [clean-structure-backend](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/clean-structure-backend/SKILL.md): Component organization and Ktor principles for the Backend (Engine).
- **[code-quality](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/code-quality/SKILL.md)**: Guidelines for clean code, readability, and the "No Comments" policy.
- **[compose-state-management](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/compose-state-management/SKILL.md)**: Guidelines for MutableStateFlow, StateView, state hoisting, and MVI/MVVM in Compose.
- **[kotlin-flow-coroutines](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/kotlin-flow-coroutines/SKILL.md)**: Rules for async operations using Flow, Coroutines, and safe data collection.
- **[modular-architecture](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/modular-architecture/SKILL.md)**: Maintaining the modular structure (Data/Domain/UI).
- **[naming-conventions](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/naming-conventions/SKILL.md)**: Standardized directory and file naming across the project.
- **[mappers-logic](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/mappers-logic/SKILL.md)**: Pattern for data transformation and repository implementation logic.

## Backend Core (`engine`)

- **[ktor-engine-logic](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/ktor-engine-logic/SKILL.md)**: Backend-specific rules for the engine module (routing, serialization, predictions).

## Tools

- **[skill-generator](file:///c:/Users/Agus/IdeaProjects/VUELTA-F1NAL/.agent/skills/skill-generator/SKILL.md)**: A tool for creating new skills following the VUELTA F1NAL standard.

## 🛠️ Usage guidelines

1. **Check before coding**: Always consult the relevant skill(s) before implementing a new feature.
2. **Consistency over speed**: If a skill defines a pattern, follow it strictly.
3. **Skill updates**: When a new architectural pattern is established, update the relevant skill or create a new one using the `skill-generator`.

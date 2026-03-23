---
name: compose-state-management
description: Guidelines for MutableStateFlow, StateView, state hoisting, and MVI/MVVM in Compose.
---

# Compose State Management

Handling state correctly is crucial for performance and predictability in Jetpack Compose.

## Guidelines
1. **State Hoisting**: Move state to callers to make components stateless and testable.
2. **ViewModel**: Use `ViewModel` to hold production state via `MutableStateFlow` or `Compose State`.
3. **Unidirectional Data Flow (UDF)**:
   - UI sends **Events** to ViewModel.
   - ViewModel updates **State**.
   - UI reflects the new **State**.
4. **Remember & SideEffects**: Use `remember`, `LaunchedEffect`, and `SideEffect` correctly to manage lifecycle-aware state.
5. **Stability**: Ensure data classes used in UI are `@Immutable` or `@Stable`.

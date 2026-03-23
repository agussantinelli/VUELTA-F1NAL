---
name: kotlin-flow-coroutines
description: Rules for async operations using Flow, Coroutines, and safe data collection.
---

# Kotlin Flow & Coroutines

Efficient and safe asynchronous programming in VUELTA F1NAL.

## Guidelines
1. **Scopes**: Use `viewModelScope` for UI logic and `lifecycleScope` for Fragment/Activity logic.
2. **Dispatchers**:
   - `Dispatchers.Main` for UI updates.
   - `Dispatchers.IO` for Network/Disk operations.
   - `Dispatchers.Default` for CPU-intensive tasks (e.g., calculation logic).
3. **Flow Collection**: Always use `collectAsStateWithLifecycle()` in Composables to avoid resource leaks.
4. **Structured Concurrency**: Avoid `GlobalScope`. Ensure jobs are cancelled when the lifecycle ends.
5. **Error Handling**: Use `catch` operators in Flow or `runCatching` in suspend functions.

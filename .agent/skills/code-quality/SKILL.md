---
name: code-quality
description: Guidelines for clean code, readability, and the "No Comments" policy.
---

# Code Quality Skill

High-quality code is our technical fuel.

## Guidelines
1. **NO COMMENTS**: Code must be self-documenting. Use clear, descriptive names for functions and variables.
   - *Example*: `isRaceFinished` instead of `const fin = true; // flag for race status`.
2. **KDoc**: Only use for complex algorithms (e.g., in the prediction engine) or public APIs.
3. **Dead Code**: Immediate removal of commented-out code blocks or unused imports.
4. **Self-Documenting UI**: Use descriptive parameter names in Composables and clear Modifier chains.
5. **Consistency**: Follow the established patterns for Flow collection and Coroutine scope usage.

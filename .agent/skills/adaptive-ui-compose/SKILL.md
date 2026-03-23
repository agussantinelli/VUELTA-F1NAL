---
name: adaptive-ui-compose
description: Handling different screen sizes in Android using WindowSizeClass and adaptive layouts.
---

# Adaptive UI in Compose

Ensuring VUELTA F1NAL looks high-premium on all display types.

## Guidelines
1. **WindowSizeClass**: Use standard breakpoints to toggle between mobile (compact) and tablet (expanded) layouts.
2. **Flexible Layouts**: Favor `Row`, `Column`, and `Box` with `Weight` modifiers over fixed sizes.
3. **ConstraintLayout**: Use for complex UI trees to maintain a flat structure.
4. **Resources**: Use `dp` for dimensions and `sp` for typography.
5. **Touch Targets**: Minimum interactive area should be `48x48dp`.

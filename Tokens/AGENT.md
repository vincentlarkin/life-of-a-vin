# Tokens Agent Guide

Use this guide when modifying `Tokens/life-of-a-vin.json` or generating a new
platform kit from the shared token contract.

## Responsibility

The token file is the platform-neutral source of truth. It should describe the
theme in a way that can be mapped into CSS variables, Android Material roles,
terminal ANSI colors, Figma variables, iOS assets, or future theme systems.

Do not treat platform files as independent palettes. Platform files may adapt
tokens to local constraints, but the token file remains the reference.

## Token Principles

Stable token roles:

- `black`, `blackSoft`, `panel`, `panelStrong`: dark surfaces.
- `cream`, `creamMuted`: readable text and secondary text.
- `gold`, `goldBright`, `goldDeep`: structure and premium accents.
- `crimson`, `crimsonDeep`, `crimsonGlow`, `redSignal`: atmosphere, active
  states, danger, and kinetic emphasis.
- `line`, `lineStrong`: borders and dividers.
- `success`: small positive/system state.
- `linkArchive`: specialized warm link accent.

Avoid adding one-off tokens for a single component unless the value is likely to
be reused across platforms.

## Variant Rules

Variants belong under `variants`. A variant should include:

- stable key name
- implementation class or platform identifier when relevant
- short description
- only the tokens that differ from the base theme

The `don` variant currently maps to `.lov-theme--don` in the HTML/CSS kit. If a
new platform has its own variant mechanism, document that mapping in the
platform folder's `AGENT.md`.

## Editing Rules

When editing the JSON:

- Keep valid JSON with no comments.
- Preserve stable token names whenever possible.
- Use lowercase hex in new values unless the surrounding file requires another
  convention.
- Prefer semantic names over visual-only names.
- Update platform examples if a token name or meaning changes.
- Keep `usageRules` broadly applicable.

## Validation

After editing, validate with PowerShell:

```powershell
Get-Content -LiteralPath 'Tokens\life-of-a-vin.json' | ConvertFrom-Json | Out-Null
```

Then search for stale token references in platform files:

```powershell
rg -n "lov-|LifeOfAVin|DON Gold|crimson|gold" .
```

## Output Expectations

When generating another platform kit from tokens, include:

- a public README
- an agent guide
- at least one real example file
- comments only where they help adoption
- no private/local references

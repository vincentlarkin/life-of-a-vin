# Terminal Agent Guide

Use this guide when modifying terminal color schemes or adding a new terminal
target.

## Responsibility

This folder maps Life of a VIN into command-line environments. Readability wins
over maximum drama. The terminal should feel black/crimson/gold, but it must
remain comfortable for long work sessions.

Authoritative files:

- `windows-terminal-scheme.json`
- `wezterm.lua`
- `alacritty.toml`
- `preview.txt`
- `README.md`

## Color Mapping

Use the terminal palette this way:

- background: obsidian black
- foreground: champagne cream
- cursor: DON gold
- selection: deep crimson
- ANSI red: brake-light crimson
- bright red: signal red
- ANSI yellow: antique gold
- bright yellow: DON gold
- ANSI green: restrained success green
- blue/cyan: muted support colors

Do not let blue/cyan become visually dominant. This kit should not drift toward
a cyberpunk palette.

## Accessibility Rules

Terminal themes have to survive real text density.

Check:

- default foreground on background
- comments or dim text
- selected text
- red error output
- yellow warnings
- blue links or paths
- green success output

If a color is atmospheric but hard to read, choose readability.

## Adding a Terminal Target

When adding a new terminal:

1. Add one config file named after the terminal.
2. Use the same color values unless the terminal requires a different format.
3. Update `README.md`.
4. Add a short note to `preview.txt` only if usage differs.
5. Validate syntax if a parser is available.

## Validation

After editing:

```powershell
Get-Content -LiteralPath 'Terminal\windows-terminal-scheme.json' | ConvertFrom-Json | Out-Null
rg -n "machine path|local-only|project-specific" 'Terminal'
```

Manual visual review is still required for final confidence.

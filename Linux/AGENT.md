# Linux Agent Guide

Use this guide when modifying Linux desktop theme targets.

## Responsibility

This folder maps Life of a VIN into Linux desktop theming. Keep the contents
public, installable, and clean. Do not add machine-specific paths, backup
copies, local experiment folders, or abandoned variants.

Authoritative files:

- `README.md`
- `install-icewm.sh`
- `icewm/theme`
- `icewm/themes/LifeOfAVIN/default.theme`
- `icewm/themes/LifeOfAVIN/*.xpm`

## IceWM Rules

- Keep the installable theme directory named `LifeOfAVIN`.
- Keep the selector file as `Theme="LifeOfAVIN/default.theme"`.
- Use IceWM theme syntax: `Option= "Value"` or `Option= value`.
- Keep the theme simple and old-school. Prefer flat IceWM geometry, hard edges,
  small fonts, and small XPM assets over modern effects.
- Map colors back to `Tokens/life-of-a-vin.json`: black/near-black surfaces,
  crimson active states, antique gold bevels and borders, cream text.
- Blue and cyan should not become dominant unless a Linux target requires them.

## Validation

After editing:

```powershell
rg -n "Theme=|ThemeDescription|License|Look|Color" Linux\icewm
rg -n "machine path|local-only|abandoned|backup" Linux
sh -n Linux/install-icewm.sh
```

If IceWM is available on the target machine, install the theme into
`~/.icewm/themes/LifeOfAVIN`, set `~/.icewm/theme`, and restart with `icewm -r`.

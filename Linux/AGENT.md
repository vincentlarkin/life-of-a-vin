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
- `icewm/themes/LifeOfAVIN-Modern/default.theme`
- `icewm/themes/LifeOfAVIN-Classic/default.theme`
- `icewm/themes/LifeOfAVIN-Modern/*.xpm`
- `icewm/themes/LifeOfAVIN-Classic/*.xpm`

## IceWM Rules

- Keep installable theme directories named `LifeOfAVIN-Modern` and
  `LifeOfAVIN-Classic`.
- Keep the default selector file as `Theme="LifeOfAVIN-Modern/default.theme"`.
- Keep the installer defaulting to modern, with `classic` as the alternate
  argument.
- Use IceWM theme syntax: `Option= "Value"` or `Option= value`.
- Keep the theme simple and old-school. Prefer flat IceWM geometry, hard edges,
  small fonts, and small XPM assets over modern effects.
- Map colors back to `Tokens/life-of-a-vin.json`: black/near-black surfaces,
  crimson active states, antique gold bevels and borders, cream text.
- Keep `DesktopBackgroundColor` and `DesktopTransparencyColor` as solid reddish
  hues, not black.
- Blue and cyan should not become dominant unless a Linux target requires them.

## Validation

After editing:

```powershell
rg -n "Theme=|ThemeDescription|License|Look|Color" Linux\icewm
rg -n "machine path|local-only|abandoned|backup" Linux
sh -n Linux/install-icewm.sh
```

If IceWM is available on the target machine, test both `sh Linux/install-icewm.sh`
and `sh Linux/install-icewm.sh classic`.

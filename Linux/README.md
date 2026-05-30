# Linux Theme Kit

Use this kit for Linux desktop environments that can consume IceWM themes. The
included IceWM theme maps Life of a VIN into a very old-school window-manager
style: black surfaces, crimson pressure, antique gold bevels, cream text, and
simple square frame geometry.

## IceWM

Theme path:

```text
Linux/icewm/themes/LifeOfAVIN/default.theme
```

Install for one user:

```sh
sh Linux/install-icewm.sh
```

Manual install:

```sh
mkdir -p ~/.icewm/themes
rm -rf ~/.icewm/themes/LifeOfAVIN
cp -R Linux/icewm/themes/LifeOfAVIN ~/.icewm/themes/
printf 'Theme="LifeOfAVIN/default.theme"\n' > ~/.icewm/theme
icewm -r
```

The theme is based on IceWM's `CrystalBlue` theme structure. It keeps the same
dead-simple flat look, 5px frame borders, 25px titlebar, title buttons, and XPM
window-decoration assets, then recolors those assets into the Life of a VIN
palette from `Tokens/life-of-a-vin.json`.

## CrystalBlue Analysis

CrystalBlue is a compact classic IceWM theme. Its `default.theme` uses
`Look="flat"`, small bold sans-serif fonts, 16px menu icons, 5px frame borders,
and 24px corners. Most of the visual character comes from small XPM titlebar,
button, menu, and frame assets rather than large artwork. The original palette
is blue chrome with gray bevel highlights; this kit preserves the same asset
roles and geometry while changing only the color system.

## Source And License

`LifeOfAVIN` is a modified theme derived from the IceWM `CrystalBlue` theme by
BlueScorpio_7. CrystalBlue declares `License="GPL"` in its theme file, so this
derived IceWM theme is distributed as GPL-compatible theme material.

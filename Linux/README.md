# Linux Theme Kit

Use this kit for Linux desktop environments that can consume IceWM themes. The
included IceWM theme maps Life of a VIN into a very old-school window-manager
style: black surfaces, crimson pressure, antique gold bevels, cream text, and
simple square frame geometry.

## IceWM

Theme paths:

```text
Linux/icewm/themes/LifeOfAVIN-Modern/default.theme
Linux/icewm/themes/LifeOfAVIN-Classic/default.theme
```

Install both themes for one user:

```sh
sh Linux/install-icewm.sh
```

The default run installs both variants and selects `LifeOfAVIN-Modern`.

Install and select only the modern theme:

```sh
sh Linux/install-icewm.sh modern
```

Install the classic theme:

```sh
sh Linux/install-icewm.sh classic
```

Manual modern install:

```sh
mkdir -p ~/.icewm/themes
rm -rf ~/.icewm/themes/LifeOfAVIN-Modern
cp -R Linux/icewm/themes/LifeOfAVIN-Modern ~/.icewm/themes/
printf 'Theme="LifeOfAVIN-Modern/default.theme"\n' > ~/.icewm/theme
icewm -r
```

Both themes use a solid deep crimson desktop background color:
`rgb:3F/05/06`.

## Theme Analysis

`LifeOfAVIN-Modern` is based on IceWM's `CrystalBlue` theme structure. It keeps
the same dead-simple flat look, 5px frame borders, 25px titlebar, title buttons,
and XPM window-decoration assets, then recolors those assets into the Life of a
VIN palette from `Tokens/life-of-a-vin.json`.

CrystalBlue is a compact IceWM theme. Its `default.theme` uses
`Look="flat"`, small bold sans-serif fonts, 16px menu icons, 5px frame borders,
and 24px corners. Most of the visual character comes from small XPM titlebar,
button, menu, and frame assets rather than large artwork. The original palette
is blue chrome with gray bevel highlights; this kit preserves the same asset
roles and geometry while changing only the color system.

`LifeOfAVIN-Classic` is based on IceWM's default `icedesert` theme and mirrors
it closely: `Look=pixmap`, a 20px titlebar, 4px frame borders, 2px dialog
borders, `TitleButtonsSupported="xmis"`, and the same compact title/button
pixmap set. The original beige desert palette is reworked into black, crimson,
gold, and cream while preserving the boxy classic IceWM feel.

## Source And License

`LifeOfAVIN-Modern` is modified from IceWM `CrystalBlue` by BlueScorpio_7.
`LifeOfAVIN-Classic` is modified from IceWM `icedesert` by Nehal Mistry. These
derived IceWM themes are distributed as GPL-compatible theme material.

# Android Material Agent Guide

Use this guide when modifying the Android Material kit or applying Life of a VIN
to an Android app.

## Responsibility

This folder maps the theme into Material 3 roles for general Android apps. It
must remain useful to any adopter, not only one specific app.

Authoritative files:

- `life-of-a-vin-theme.kt`: Jetpack Compose Material 3 example
- `res-values/colors.xml`: XML color resources
- `res-values/themes.xml`: XML Material theme example
- `README.md`: public usage instructions

## Generic Adoption Model

For Compose apps:

1. Copy the theme file into the app's `ui/theme` package.
2. Change the package declaration to match the app.
3. Wrap the app with `LifeOfAVinTheme`.
4. Replace hard-coded feature colors only after the Material theme layer works.

For XML/View apps:

1. Merge the `res-values` files into `app/src/main/res/values`.
2. Rename the theme style if the app has its own naming convention.
3. Set the application or activity theme to the Life of a VIN style.

## Material Role Mapping

Use this mapping unless the target app has a strong accessibility reason to
adapt it:

- `background`: obsidian
- `surface`: velvet black
- `surfaceVariant`: carbon veil
- `primary`: DON gold
- `secondary`: antique gold
- `tertiary`: brake-light crimson
- `error`: signal red
- `outline`: antique gold
- `onBackground`, `onSurface`: champagne cream
- success states: small system green token

Avoid mapping crimson to every primary action. Gold should usually carry
selection and structure; crimson should mark heat, effort, danger, or active
pressure.

## Typography and Shape

The Compose example uses system serif and monospace families to stay portable.
If the target app already has brand fonts, keep the Life of a VIN hierarchy:

- display/headline: serif or elegant high-contrast font
- body: readable serif or quiet text face
- labels/actions: monospace or small-caps utility face

Shapes should stay square or lightly eased. Avoid large rounded Material cards
unless the target app already depends on that shape language.

## Public File Rules

Keep files generic:

- no local machine paths
- no project-specific app names unless the file is explicitly an example for
  that app
- no maintainer-only instructions
- no references to unrelated desktop theming experiments

## Validation

After editing:

```powershell
[xml](Get-Content -LiteralPath 'Android Material\res-values\colors.xml' -Raw) | Out-Null
[xml](Get-Content -LiteralPath 'Android Material\res-values\themes.xml' -Raw) | Out-Null
rg -n "machine path|local-only|project-specific" 'Android Material'
```

When applying to a real Android project, build the app after integration and
inspect at least one dense screen, one form/input screen, and one empty or
status screen.

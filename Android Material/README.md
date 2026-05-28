# Android Material Kit

Life of a VIN for Android apps using Material 3. Example target: a workout
tracker, notes app, status dashboard, or focused utility app.

Use this kit for training logs, dashboards, trackers, and focused utility apps
that need black surfaces, gold structure, red emphasis, and warm cream text.

## Files

| File | Purpose |
| --- | --- |
| `life-of-a-vin-theme.kt` | Jetpack Compose Material 3 theme example. |
| `res-values/colors.xml` | XML color resources for Views or hybrid apps. |
| `res-values/themes.xml` | XML Material theme example using the color resources. |

## Usage

For a Compose app, copy the values from `life-of-a-vin-theme.kt` into the app's
theme layer, then wrap the app:

```kotlin
LifeOfAVinTheme {
    App()
}
```

For an XML/View app, merge the `res-values` files into `app/src/main/res/values`
and set the app theme to `Theme.LifeOfAVin`.

## App Fit

Apps using MaterialTheme colors can usually adopt the kit through token
replacement:

- `ui/theme/Color.kt`: replace the Nova palette with the Life of a VIN colors.
- `ui/theme/Theme.kt`: map Material 3 roles to black, crimson, gold, and cream.
- `ui/theme/Shape.kt`: already uses hard corners, which fits the theme.
- Chart colors and hard-coded feature colors can be tuned after the main theme
  lands.

## Design Notes

- Use black and near-black for all app backgrounds.
- Use antique gold for dividers, icons, progress outlines, and selected tabs.
- Use crimson for destructive actions, intense effort markers, PRs, misses, and
  active workout states.
- Keep green only for completion/success states.
- Avoid ornate corner art; Android should use clean framed surfaces and clear
  contrast.

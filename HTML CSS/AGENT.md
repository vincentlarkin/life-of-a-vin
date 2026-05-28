# HTML/CSS Agent Guide

Use this guide when modifying the drop-in HTML/CSS kit.

## Responsibility

This folder provides a framework-free web implementation of Life of a VIN. It
should work in static HTML, server-rendered templates, no-code embeds, and
prototype pages without a build step.

Authoritative files:

- `life-of-a-vin.css`: theme variables and component styles
- `example.html`: complete usage demo
- `README.md`: public user instructions
- `assets/life-of-a-vin/background.webp`: bundled background texture

## Scope Rules

All theme selectors must stay scoped under:

- `.lov-theme`
- documented variant classes such as `.lov-theme--don`

Avoid unscoped element styles that would leak into a host website.

Use `:where()` for low-specificity base styling when possible. Keep the kit
easy to override.

## Public Example Rules

`example.html` should be generic and reusable.

Do:

- use placeholder brand names
- show real component patterns
- keep it openable directly in a browser
- show header, nav, hero, cards, lists, status, forms, and buttons
- keep text contrast high

Do not:

- include private contact details
- depend on a dev server
- import framework scripts
- include album art or artist imagery
- add ornate corner image assets

## CSS Design Rules

Maintain the theme proportions:

- black/near-black as the dominant surface
- crimson for atmosphere and active pressure
- gold for frames, dividers, and accents
- cream for text
- minimal radius
- serif display/body typography
- mono labels and action text

The background can be dramatic, but all foreground text must remain readable.
Never allow black text on dark backgrounds or low-contrast gold text on red.

## Variant Rules

The base class is `.lov-theme`.

The album-facing variant is `.lov-theme--don`. It should override variables
rather than duplicate component CSS. If a new variant is added, document it in:

- `HTML CSS/README.md`
- `Tokens/life-of-a-vin.json`
- `Style Guide/life-of-a-don-style-guide.md` if it changes theme meaning

## Validation

After editing:

```powershell
rg -n "email protected|machine path|artist|album cover" 'HTML CSS'
```

Open `example.html` in a browser when visual behavior changes. Check desktop
and narrow widths for overflow, unreadable text, or accidental layout shifts.

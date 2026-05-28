# HTML/CSS Drop-In Kit

This folder contains the first Life of a VIN platform kit. It is plain HTML/CSS,
scoped to `.lov-theme`, and designed for static sites, server templates,
component demos, and no-code embeds.

Example target: a personal site, gallery, archive, or dashboard.

## Quick Start

1. Copy `life-of-a-vin.css` and the `assets/` folder into your project.
2. Link the stylesheet:

```html
<link rel="stylesheet" href="life-of-a-vin.css">
```

3. Add `class="lov-theme"` to the `body` or to a wrapper element.
4. Optional: add `lov-theme--don` for the deeper red/black/gold album variant.
5. Use the component classes from `example.html`.

```html
<body class="lov-theme lov-theme--don">
  <main class="lov-shell">
    <section class="lov-card">
      <p class="lov-kicker">Featured</p>
      <h1>Life of a VIN</h1>
      <p>A luxury gothic interface with crimson shadow and antique gold detail.</p>
      <a class="lov-button" href="#">Explore</a>
    </section>
  </main>
</body>
```

## Files

| File | Purpose |
| --- | --- |
| `life-of-a-vin.css` | The drop-in theme stylesheet. |
| `example.html` | Demo showing header, nav, hero, cards, lists, status, form fields, and buttons. |
| `assets/life-of-a-vin/` | Background asset. |

## Theme Variants

| Class | Use |
| --- | --- |
| `lov-theme` | Base Life of a VIN luxury gothic theme. |
| `lov-theme lov-theme--don` | Darker, more cinematic Life of a DON reading with hotter crimson and brighter antique gold. |

## Asset Paths

The CSS assumes this structure:

```text
life-of-a-vin.css
assets/
  life-of-a-vin/
    background.webp
```

If the assets live somewhere else, override these custom properties after the
stylesheet:

```css
.lov-theme {
  --lov-bg-image: url("/new/path/background.webp");
}
```

## Component Map

| Class | Use |
| --- | --- |
| `lov-shell` | Max-width page container. |
| `lov-header` | Framed top bar with brand and actions. |
| `lov-brand`, `lov-crest`, `lov-wordmark` | Brand cluster. |
| `lov-nav` | Horizontal navigation with gothic dividers and active state. |
| `lov-hero` | Two-column feature area. |
| `lov-card` | Framed content card. |
| `lov-kicker` | Uppercase section label with line accents. |
| `lov-button`, `lov-button-secondary` | Primary and secondary calls to action. |
| `lov-list`, `lov-list-item` | Dense dashboard-style rows. |
| `lov-status`, `lov-status-dot` | Online/system status row. |
| `lov-field` | Styled inputs and selects. |

## Design Guardrails

- Keep the palette mostly black, cream, gold, and crimson.
- Use crimson sparingly for active states, alert links, and directional energy.
- Prefer thin lines, inset shadows, and hard framing over rounded cards.
- Pair serif content with mono labels/actions.
- Keep text contrast high; the background is dramatic, but the UI should still
  read cleanly.
- Follow `../Style Guide/life-of-a-don-style-guide.md` when extending the theme.

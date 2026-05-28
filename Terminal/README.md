# Terminal Kit

Life of a VIN for command-line tools. Example targets: Windows Terminal,
WezTerm, and Alacritty.

Use this kit for a red/black/gold developer environment without hurting
readability. The terminal version is calmer than the website: black base, cream
foreground, antique gold prompt accents, crimson errors, and red selection.

## Files

| File | Purpose |
| --- | --- |
| `windows-terminal-scheme.json` | Scheme object for Windows Terminal `settings.json`. |
| `wezterm.lua` | WezTerm color scheme snippet. |
| `alacritty.toml` | Alacritty color config. |
| `preview.txt` | Small palette/sample guide. |

## Windows Terminal

Open Settings, choose `Open JSON file`, then add the object from
`windows-terminal-scheme.json` into the `schemes` array. Set a profile's
`colorScheme` to `Life of a VIN`.

## Design Notes

- Background should stay almost black, never mid-gray.
- Default text should be cream, not stark white.
- ANSI red is crimson; bright red is the emergency/signal color.
- ANSI yellow/gold carries prompts, borders, and important metadata.
- Blue and cyan are intentionally subdued so the theme stays red/black/gold.

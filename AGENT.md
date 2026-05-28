# Life of a VIN Agent Guide

This is the canonical guide for AI agents working with the Life of a VIN theme
system. Treat the repository as a public theme distribution for general users,
not as a maintainer-local workspace.

## Agent Mission

Help users apply, extend, and port the Life of a VIN design language across
platforms. Preserve the public-facing nature of the repository while keeping the
theme coherent across every folder.

The repository should read like a polished product:

- Public README files explain what each kit is and how to use it.
- `AGENT.md` files explain how an AI agent should maintain or apply each kit.
- Local maintainer notes belong in gitignored files such as `.local/`,
  `LOCAL_NOTES.md`, or `*.local.md`.
- Do not place maintainer-only troubleshooting notes, local machine paths, or
  one-off history in tracked public files.

## Theme Identity

Life of a VIN is a luxury gothic interface system. Its stable identity is:

- black velvet and near-black surfaces
- crimson atmosphere and active pressure
- antique gold structure and highlights
- cream typography
- hard-edged frames
- ceremonial but usable UI
- restrained ornament and high text contrast

The theme is inspired by the mood of Life of a DON, but the repository must not
ship copied lyrics, album artwork, artist photos, official logos, or any other
third-party IP.

## Repository Contract

Every platform kit should contain:

- a concise public `README.md`
- at least one example implementation file
- an `AGENT.md` with instructions for agents
- mappings back to `Tokens/life-of-a-vin.json`
- behavior consistent with `Style Guide/life-of-a-don-style-guide.md`

When adding a new platform, prefer this structure:

```text
Platform Name/
  README.md
  AGENT.md
  example-or-theme-file.ext
```

Optional support files are fine when they are useful to actual adopters.

## Public Voice

Public-facing files should be clear, confident, and user-oriented.

Use:

- "Use this kit for..."
- "Copy this file into..."
- "The theme includes..."
- "Example target..."

Avoid:

- first-person changelog language
- abandoned experiment notes
- process disclaimers aimed at maintainers instead of adopters
- local debugging history
- one maintainer's machine paths
- instructions that only make sense for a specific private project

Mention a specific app or website only when the file is explicitly an example
for that app or website. Otherwise keep examples generic.

## Agent Voice

`AGENT.md` files may directly address an AI agent. They should be specific,
operational, and useful for future code generation.

Good agent guidance includes:

- what the folder is responsible for
- which files are authoritative
- what to update when extending the kit
- validation commands or file checks
- naming conventions
- platform-specific accessibility and contrast rules
- what not to add

Do not use `AGENT.md` files as maintainer journals.

## Design Rules

Apply these rules across all platforms:

- Black and near-black dominate the surface area.
- Crimson is used for active states, warnings, heat, motion, and atmosphere.
- Gold is used for borders, dividers, icons, selected state, and premium marks.
- Cream is used for readable text.
- Green is reserved for small success/system states.
- Blue and cyan should be muted unless the platform requires them.
- Rounded corners must stay minimal.
- Do not add ornate corner image assets until a reusable method exists.
- Avoid beige parchment, purple-blue cyber gradients, soft SaaS cards, and
  black-on-black text failures.

## Extension Workflow

When adding or changing a kit:

1. Read `Tokens/life-of-a-vin.json`.
2. Read `Style Guide/life-of-a-don-style-guide.md`.
3. Read the target folder's `AGENT.md`.
4. Implement the platform files.
5. Update the public README with concise usage.
6. Validate syntax for the platform.
7. Search for private/local references before finishing.

Useful scans:

```powershell
rg -n "LOCAL_NOTES|machine path|maintainer-only|abandoned experiment" .
rg -n "album artwork|copied lyrics|artist photos" .
```

## Quality Bar

Before finishing a change, check:

- The public README is useful to a general adopter.
- The example file does not contain private contact details or local paths.
- Agent guidance is practical enough for another AI agent to continue from it.
- Color values match the token set or are justified by platform constraints.
- Text contrast remains strong.
- New files are named clearly and consistently.
- Private notes are gitignored, not tracked.

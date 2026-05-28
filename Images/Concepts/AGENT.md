# Concept Images Agent Guide

Use this guide when adding or organizing concept references.

## Responsibility

This folder stores mood and layout references for the theme system. Concept
images are references, not automatically shippable assets for platform kits.

## Adding Images

When adding a concept:

1. Use a clear filename such as `concept-04-terminal-preview.png`.
2. Add one concise row to `README.md`.
3. Describe the design lesson, not personal history.
4. Keep the image in this folder unless a platform kit explicitly needs a
   processed asset.

## Asset Boundaries

Do not add:

- album covers
- artist photos
- official logos
- screenshots containing personal or sensitive data
- images with unclear rights
- local machine paths in documentation

## Usage Guidance

Agents may use concept images to guide color, density, layout rhythm, and mood.
Do not copy decorative details literally if the style guide forbids them. The
current system avoids ornate corner image assets until a reusable approach is
defined.

## Validation

After adding images:

```powershell
rg --files 'Images/Concepts'
Get-Content -LiteralPath 'Images\Concepts\README.md'
```

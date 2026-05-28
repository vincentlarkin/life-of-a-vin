# Style Guide Agent Guide

Use this guide when modifying `life-of-a-don-style-guide.md` or translating the
style guide into a new platform kit.

## Responsibility

The style guide defines the aesthetic decision-making layer. It explains what
the theme should feel like and how motifs map into interface behavior. It is
not a long-form essay, a lyric archive, or a brand manifesto.

Keep it concise enough to be reread before implementation.

## Source Boundaries

The style guide may discuss:

- album mood
- recurring lyrical themes in paraphrase
- visual motifs
- palette logic
- component behavior
- motion language
- anti-patterns

The style guide must not include:

- copied song lyrics
- album covers
- artist photos
- official logos
- long review excerpts
- private maintainer notes

If sources are cited, use links sparingly and only when they help future agents
understand the reference material.

## Compression Rule

Prefer compact tables and direct rules. If a section reads like prose that does
not change implementation, shorten it.

Useful section types:

- Core Mood
- Design Translation
- Track Motif Index
- Palette
- Rules
- Type
- Components
- Motion
- Implementation Hooks

Avoid adding sections that overlap the public README or token file.

## Design Interpretation Rules

Maintain these interpretations:

- The luxury is dark, velvet, metallic, and controlled.
- The red is heat, brake light, intoxication, danger, and motion.
- The gold is structure and status, not a full background color.
- The black is atmosphere and negative space.
- The cream is the readable voice.
- The theme should be dramatic but still usable.

## Validation

After editing, check:

```powershell
rg -n "lyrics|quote|copied|album cover|artist photo|logo" 'Style Guide'
```

References to "lyrics are not reproduced" are acceptable. Actual lyrics are not.

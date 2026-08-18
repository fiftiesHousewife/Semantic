# Skills

Skills are instructions an agent loads when a task matches them. They live in `.claude/skills/<name>/SKILL.md` for this project, or in `~/.claude/skills/` for every project on the machine. This file is the index; each skill states its own rules.

| Skill | Loads when | What it holds |
|---|---|---|
| [`adding-a-taxonomy`](adding-a-taxonomy/SKILL.md) | adding, promoting or re-extracting any vocabulary resource | the invariants every bundled taxonomy holds — pinned source, digest acceptance, byte reproducibility, the eight columns, the provenance header — and the eight files a new one touches, from extraction class to regenerated readings |
| [`written-english`](written-english/SKILL.md) | writing or editing any prose a reader outside the project sees, and reviewing prose for machine-writing habits | the house style: no metaphor in text or headings, no contrastive negation, no self-reference, no padding, no invented senses; active voice, an ambiguous term defined and linked at first use, a worked example beside anything specialist, links named for the thing rather than the path, no hard-wrapped markdown, and a review checklist |

## Installing

A skill is one file, so installing it is copying it. This project already carries its skills under `.claude/skills/`; to hold one on every project on the machine, copy it to the user directory.

```bash
cp -r .claude/skills/written-english ~/.claude/skills/
```

## Where the rules also live

[`CLAUDE.md`](../../CLAUDE.md) carries a condensed form of the prose rules, so a session that never loads the skill still holds to them. The skill is the long form, with the examples and the checklist.

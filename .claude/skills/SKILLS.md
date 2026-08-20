# Skills

Skills are instructions an agent loads when a task matches them. They live in `.claude/skills/<name>/SKILL.md` for this project, or in `~/.claude/skills/` for every project on the machine. This file is the index; each skill states its own rules.

| Skill | Loads when | What it holds |
|---|---|---|
| [`adding-a-taxonomy`](adding-a-taxonomy/SKILL.md) | adding, promoting or re-extracting any vocabulary resource | the invariants every bundled taxonomy holds — pinned source, digest acceptance, byte reproducibility, the eight columns, the provenance header — and the eight files a new one touches, from extraction class to regenerated readings |
| [`debugging-a-reading`](debugging-a-reading/SKILL.md) | a placement, topic or match looks wrong, a change moves nothing, or a figure needs explaining before it is trusted | where the answer already is in the three committed JSON files and what they do not hold, the probes that answer what a word voted for, the method — placement to label to word to resource — with a worked example, and the traps: a cached green, a silent no-op edit, byte-identical figures, a verdict inside the null's jitter, a statistic over a self-selected field, and a javadoc its own code contradicts |
| [`profiling-a-read`](profiling-a-read/SKILL.md) | a read is slow, a stage regressed, or a performance change needs its number | the probe — `readTimings` for the stage rows and the flight recording, `jfr` for the method — how to read a profile, the attribution experiment, and the verification sequence a performance change passes |
| [`written-english`](written-english/SKILL.md) | writing or editing any prose a reader outside the project sees, and reviewing prose for machine-writing habits | the house style: no metaphor in text or headings, no contrastive negation, no self-reference, no padding, no invented senses; active voice, an ambiguous term defined and linked at first use, a worked example beside anything specialist, links named for the thing rather than the path, no hard-wrapped markdown, and a review checklist |

## Installing

A skill is one file, so installing it is copying it. This project already carries its skills under `.claude/skills/`; to hold one on every project on the machine, copy it to the user directory.

```bash
cp -r .claude/skills/written-english ~/.claude/skills/
```

## Where the rules also live

[`CLAUDE.md`](../../CLAUDE.md) carries a condensed form of the prose rules, so a session that never loads the skill still holds to them. The skill is the long form, with the examples and the checklist.

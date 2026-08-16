# Skills

Skills are instructions an agent loads when a task matches them. They live in `.claude/skills/<name>/SKILL.md` for this project, or in `~/.claude/skills/` for every project on the machine. This file is the index; each skill states its own rules.

| Skill | Loads when | What it holds |
|---|---|---|
| [`written-english`](../install-written-english-skill.sh) | writing or editing any prose a reader outside the project sees, and reviewing prose for machine-writing habits | the house style: no metaphor in text or headings, no contrastive negation, no self-reference, no padding, no invented senses; active voice, an ambiguous term defined and linked at first use, a worked example beside anything specialist, links named for the thing rather than the path, no hard-wrapped markdown, and a review checklist |

## Installing

Each skill ships as a script that writes it into place, so no path has to be typed.

```bash
bash install-written-english-skill.sh          # this project
bash install-written-english-skill.sh --user   # every project on this machine
```

## Where the rules also live

[`CLAUDE.md`](../CLAUDE.md) carries a condensed form of the prose rules, so a session that never loads the skill still holds to them. The skill is the long form, with the examples and the checklist.

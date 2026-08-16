#!/usr/bin/env bash
# Installs the written-english skill, which holds this project's house style for reader-facing prose.
#
#   bash install-written-english-skill.sh          this project, .claude/skills/
#   bash install-written-english-skill.sh --user   every project, ~/.claude/skills/
#
# The skill content is inline below, so this script needs nothing else.
set -euo pipefail

root=".claude/skills/written-english"
if [ "${1:-}" = "--user" ]; then
  root="$HOME/.claude/skills/written-english"
fi

mkdir -p "$root"
cat > "$root/SKILL.md" <<'SKILL_EOF'
---
name: written-english
description: House style for every word a reader outside the project sees — READMEs, generated reports, documentation, headings, chart captions and commit messages. Use when writing or editing any prose deliverable, and when reviewing prose for AI writing habits. Bans metaphor, contrastive negation, self-reference and padding; requires plain terms, definitions with links, worked examples, and links named for the thing rather than the path.
---

# Written English

Reader-facing prose is judged as writing, not as documentation. These rules are the standard. They apply to READMEs, generated reports and pages, headings, table cells, chart captions, alt text and commit messages.

## The refusals

Check every draft against these before showing it. Each has cost a rewrite.

### 1. No metaphor

State the mechanism. A word doing figurative work is a word the reader has to decode.

| Refused | Why | Write |
|---|---|---|
| cleared a bar | there is no bar | exceeds all 999 chance resamples |
| the reading is willing to state | a reading is not willing | the topics whose figures exceed chance |
| a word sinks / rises | nothing moves | scores lower / ranks high |
| the vocabulary fires | it does not fire | it matches 12 concepts |
| the word abstains / votes | it does neither | contributes no evidence / adds weighted evidence |
| a word earns its place | nothing is earned | the reading reports it |
| stays silent outside its domain | it makes no sound | produces few or no matches outside it |
| how the two sides were made to meet | says nothing | matches per normalisation |

A heading is prose. `How the two sides were made to meet` is the same fault as the sentence version.

### 2. No contrastive negation

"X, not Y" and "it is not A but B" are the strongest single marker of machine-written text. Say what is true once.

- Refused: *It is a rule about the parse, not about length.*
- Write: *Length plays no part in the rule.*
- Refused: *Word boundaries are cited, not chosen.*
- Write: *The boundary rules come from UAX #29.*

A negation stating a real rule is fine — *a letter next to a digit is not a boundary* is the rule's own wording. The fault is the rhetorical pairing that exists to sound decisive.

### 3. No self-reference

The reader wants to know what the thing does, why, and how to use it. Delete:

- how the document was produced, and why its figures move
- what the project used to do, which run changed it, what was tried first
- notes about the document's own structure ("the section below sets out…")
- references to internal planning documents, backlogs, or work not yet done

### 4. No padding

- Delete a sentence that restates the previous one in another shape.
- Delete a clause that explains what the reader has just read.
- Delete a preamble to a table. The table is the content.
- Delete "it is worth noting", "in other words", "essentially", "simply".

### 5. No invented senses

A word used in a sense only this project uses has to be taught to every reader.

- Prefer the standard term of the relevant specialist field — statistics, linguistics, machine learning.
- Where the field has no term, use plain English that says the mechanism.
- Never coin a meaning for an ordinary word.

## The requirements

### Terse and structural

Bullets and tables before paragraphs. A paragraph carrying three figures is a table with three rows. Short sentences. No elaboration.

### Active voice

Name what does the thing. *The branch rule discards 56 terms*, never *56 terms were discarded*. A passive sentence hides the actor, and the actor is what a reader needs in order to check the claim.

### Define an ambiguous term where it first appears, and link it

*Sense*, *scope*, *span*, *mass*, *rung*, *divergence*, *lemma* all carry an everyday meaning beside the technical one. Give the technical one in a clause at first use and link whoever published it — WordNet for *sense* and *lemma*, W3C for *SKOS*, Unicode for a segmentation rule. Anything named — a statistic, a standard, a taxonomy, an archive — carries a link the first time it appears, and a **References** section at the foot collects them, in alphabetical order.

### A worked example beside anything specialist

Any statistic, rule or threshold gets one concrete case: the named input, the arithmetic, the result.

> `citationSource` splits into `citation` and `source`. On its own `cite` could be law, linguistics or publishing; both words of this name carry publishing and neither carries law, so publishing is the subject the name is scored for.

### Links named for the thing

The link text is the class, the term or the finding. Never the URL, never the file path.

- Refused: `[output/vocabulary.md](output/vocabulary.md)`
- Write: `[the words that carry the most signal](output/vocabulary.md)`

Link a class name to its source file. A file path in running text tells the reader nothing about why they would open it.

### Markup

- **Never hard-wrap markdown.** A wrap at a column count falls mid-clause and the raw file reads badly. One line per paragraph, per bullet and per table row, however long; the editor soft-wraps it.
- Never write an HTML entity into markdown. A renderer that escapes `&` prints `&nbsp;` as text inside the table. Write the character.
- Wide content scrolls in its own container; the page never scrolls horizontally.

## Structure for a README

1. **What it is** — one sentence, then a bulleted summary of what it does.
2. **How to use it** — commands in a table, with what each produces.
3. **What it produces** — named links to the real output.
4. **Definitions** — the ambiguous terms, defined once.
5. **How it works** — a worked example, with each class linked to its source.
6. **Limitations** — plainly, including what it does not support yet.
7. **References** — alphabetical, with links.

## Charts

- Caption what the chart shows. Never explain where the chart came from or how it was drawn.
- One bar per category, from a common baseline, sorted by length. A stacked bar cannot be compared segment to segment.
- Labels legible at the rendered size. A picture with hundreds of marks opens at full size on click.
- Every mark reachable: hover or click to reach the evidence behind the figure.

## Review checklist

Read the draft once for each line:

- [ ] Every metaphor removed, headings included
- [ ] No "X, not Y" pairing
- [ ] Nothing about the document itself, its history, or planned work
- [ ] Every sentence carries information the previous one did not
- [ ] Every ambiguous term defined at first use and linked
- [ ] Every specialist claim has a worked example
- [ ] Every link named for the thing it reaches
- [ ] Active voice throughout
- [ ] References alphabetical
SKILL_EOF

echo "Installed $root/SKILL.md"

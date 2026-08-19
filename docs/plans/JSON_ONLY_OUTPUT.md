# The export is the output

Every run writes markdown and HTML beside the JSON. Nothing consumes them, they carry most of this tree's rendering debt, and the one thing they were defended for — seeing whether a figure moved — is already done properly elsewhere. `ReadingChanges` states the reason in its own javadoc: *"It compares two exports and nothing else. The export is the reading; the reports are a rendering of it, so a comparison built on the reports would be comparing the rendering."*

So the renderers go, the export stays and is split by audience.

## What already exists, so that nothing is rebuilt

| | State |
|---|---|
| The run diff | **built** — `ReadingChanges`, comparing two exports, reporting a `Moved` figure and a `Crossing` apart because only the second is a stated test changing its answer |
| The export | **built and versioned** — `ReadingExport`, `ExportSchema`, `schemaVersion` on `reading.json` |
| `themes.json` | **not an export** — no `schemaVersion`, not validated, 88% `scopes` |

## What goes, and what must not

**Goes — the renderers.** `MarkdownRendering`, `LegibilityReport`, `ThemeReport`, `ThemeTables`, `ThemeProse`, `ThemeSections`, `ScopeCards`, `VocabularyReport`, `ChangeReport`, `ThemePage`, `TaxonomyPage`, `EvidencePage`, `TaxonomySunburst`, `TaxonomySunburstDocument`, their tests, the `j2html` catalog entry and its `testImplementation`, and the `!output/markdown/` and `!output/html/` lines of `.gitignore`.

**Stays — the readers, which share the word and nothing else.** `MarkdownSource`, `AsciiDocSource` and `DocumentationScope` *read* markdown as corpus input. Deleting them would remove 80% of Tika's prose from the reading. The name is the only thing they have in common with the list above, and a sweep on the word would take them.

**Decide, do not sweep:** `ReportFolder`, `PublishedFormat`, `TaxonomyBranch` — each is referenced by both sides and has to be read before it is cut.

## The split the export becomes

| File | Holds | Roughly |
|---|---|--:|
| `reading.json` — the answers, versioned, validated | `summary`, `nodes` with `carriedBy`, `signals`, `taxonomies`, `setAside`, `schemaVersion` | ~140 KB |
| `evidence.json` — the workings, free to grow | `scopes`, `filesRead`, `edges`, `elapsedMillis` | ~1.1 MB |

`scopes` is 968 KB of the 1.1 MB and `contributions` is almost all of it. **Count that before splitting**: if nothing needs per-scope contributions the evidence file collapses and the answer is one file, not two.

`elapsedMillis` leaves the answers because it is a fact about the machine, not the repository, and it makes two runs of one tree differ when the reading did not.

## Why this goes before the phrase arm's repairs

[The phrase arm's repairs](PHRASE_ARM_REPAIRS.md) are five changes that each move every figure the reading reports. Judging one means answering *did this move the figure it was meant to move, and nothing else* — and today that is answered by reading a markdown diff, which is a manual verification check and is refused outright by `CLAUDE.md`.

`ReadingChanges` already answers it properly, from two exports. What it does not yet have is an export worth comparing: `themes.json` carries no `schemaVersion`, is not validated, and buries the 29 KB of answers under 1.1 MB of per-scope detail. **So this work is not housekeeping deferred until after the interesting part. It is what makes the interesting part measurable**, and the repairs are sequenced behind it deliberately.

The test that this step succeeded is therefore the next step's first action: run a repair, run the diff, and have it name what moved without anything being read by eye.

## Order

1. **Count what `scopes[].contributions` costs and who reads it.** It decides whether this is a split or a deletion.
2. **Delete the renderers**, in one commit, with the catalog entry and the `.gitignore` exceptions.
3. **Fix what pointed at them** — the README's seven markdown links and its `output/html/index.html` link, and the CLAUDE.md sentence stating that measurements live in committed `output/`, which becomes the committed JSON.
4. **Split the export**, and give `evidence.json` a `schemaVersion` or state in the file that it promises none.

## What settles it

| Claim | The measurement |
|---|---|
| Nothing was lost | `ReadingChanges` over two exports reports what a markdown diff used to show, and the `pinned` findings still pass |
| The tree got smaller | 1.6 MB of committed artefacts and the whole rendering surface, against a catalog entry removed |
| A reading can still be audited | a topic's `carriedBy` answers *why is this here* without a report being rendered |

**Abandon the split if** step 1 shows the evidence keys are small. Two files nobody needs are worse than one file that is honest about what it holds.

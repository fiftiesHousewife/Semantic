# The reports

Everything under [`output/`](../../output) is a published artefact, and the reading is judged on them before
it is judged on anything else. They are currently written in three styles by five classes, and a reader has
to be taught each one.

**One statement of style, applied to every generated page and every generated markdown file.** The rules
below are the statement; the work is making each writer obey it and deleting what obeys nothing.

## The style every generated artefact holds to

| Rule | What it refuses |
|---|---|
| Terse and factual | A sentence that restates the previous sentence in another shape |
| Structure over prose | A paragraph carrying three figures is a table with three rows |
| No metaphor | *abstains*, *votes*, *speaks*, *earns* — state the arithmetic: a weight of zero, a share of the total |
| Define an ambiguous term at first use, and link who published the definition | *sense*, *scope*, *span*, *mass*, *rung*, *divergence* each carry an everyday meaning beside the technical one. `scope` is the worst of them: a reader knows it from the language before they know it from here, and here it means one source directory the build compiles as a unit. Where nobody else published a definition, use a commoner word or the specialist field's own term — never one invented here |
| Every named statistic carries its reference | Jensen–Shannon divergence, the permutation null, the chance-expected maximum. A **References** section at the foot of the README holds them, and each first use links into it |
| No narrative | What the reading used to do, which run changed it, what was tried first — none of it belongs in a report |
| A worked example beside anything specialist | A divergence, a permutation null, a branch rule: one named word, its two shares, and the arithmetic that produced its figure |
| A link's text is the thing it names | `TermSpans`, not `https://github.com/.../TermSpans.java#L41` |

## The README holds to the same rules, and needs restructuring to do it

Three sections, in this order, and nothing else:

1. **What this is** — a terse bulleted summary. What the library reads, what it produces, what it refuses.
2. **How to use it** — the tasks, the properties each takes, and where each writes.
3. **What it currently reads as** — a short table linking into `output/`, one line per report.

**The README duplicates the reports today** and so states figures twice, in two wordings, both of which move
on every commit. A figure has one home; the README links to it.

## One artefact per report, not two

`output/` carries `summary`, `self-reading`, `themes`, `subjects`, `terms` and `vocabulary` as both `.md` and
`.html`, and the HTML is a mechanical rendering of the markdown. Keep one.

- **Recommendation: keep the markdown.** It diffs in review, it is what a commit shows moving, and the
  renderer is the source of the entity defect above.
- **Keep as pages only what markdown cannot carry**: `index.html`, the chart page, the taxonomy page and the
  three SVGs, which hold interaction rather than text.
- **What settles it:** no report exists in two formats, and every link in the README and in `index.html`
  resolves.

## The charts

| | What is wrong | What replaces it |
|---|---|---|
| The README's bar | It explains where the bar comes from. A reader wants the figures, not the provenance of the picture | The chart, captioned with what it shows and nothing about how it was drawn |
| The theme bar is stacked | Stacked segments cannot be compared against each other, and the labels do not fit | One bar per theme, unstacked, sorted by intensity, with labels a reader can read at the rendered size |
| Neither chart is interrogable | A theme's figure is a claim, and the words that carried it are the evidence | Hover or click a theme to name the words that carried it, with the site of each — `EvidencePage` already holds the material |
| A sunburst is unreadable at the size a page gives it | Both sunbursts draw hundreds of wedges into a few hundred pixels | Click to open in a lightbox at full size. It is the same defect as the taxonomy sunburst regression below, and one fix serves both |

## The defects, each with what settles it

| | What is wrong | Where | What settles it |
|---|---|---|---|
| 1 | The breakdown of **unselected** themes by package is clutter — a list of what cleared no bar, per package, answering no question a reader has | `themes.chart.html` | The section is gone and no figure a reader needs left with it |
| 2 | **Justification and line wrapping are inconsistent** between pages, and a wide table overflows rather than wrapping | every generated page | One stylesheet states both; a page rendered at 900px and at 1600px shows no horizontal scroll and no ragged column |
| 3 | ~~**Non-breaking spaces render as literal text inside tables**~~ — **closed.** The renderer escapes `&` after the report writers have written `&nbsp;`, so the table showed `Consequence&nbsp;6&nbsp;rungs`. The four writers write the character now, and `CLAUDE.md` refuses the entity outright | the four report writers | Closed: no writer emits an entity |
| 4 | **The taxonomy sunburst can no longer be enlarged or clicked.** It is a regression: the picture is the only view of the whole field, and at page size a leaf wedge is a hairline | the taxonomy page and its script | A test drives the page's own handlers rather than trusting the markup; the wedge that was clickable is clickable, and a click opens the chart in a lightbox at full size |
| 5 | Reports **restate each other**. The same figure is written in `summary.md`, `index.html` and `themes.md` in three wordings | `output/` | Each figure has one home and the others link to it |

## What must not be lost

The reports are the argument, so condensing must not remove a bound, a denominator or a citation. A figure
printed without the maximum it is bounded by, or without what it was read against, is worse than no figure.
Cut the restatement, not the provenance.

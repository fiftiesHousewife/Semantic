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
| No word in a sense only this codebase uses | A reader knows *scope* from the language before they know it from here; where a term is this project's, define it in [`GLOSSARY.md`](../GLOSSARY.md) and link the first use |
| No narrative | What the reading used to do, which run changed it, what was tried first — none of it belongs in a report |
| A worked example beside anything specialist | A divergence, a permutation null, a branch rule: one named word, its two shares, and the arithmetic that produced its figure |
| A link's text is the thing it names | `TermSpans`, not `https://github.com/.../TermSpans.java#L41` |

## The defects, each with what settles it

| | What is wrong | Where | What settles it |
|---|---|---|---|
| 1 | The breakdown of **unselected** themes by package is clutter — a list of what cleared no bar, per package, answering no question a reader has | `themes.chart.html` | The section is gone and no figure a reader needs left with it |
| 2 | **Justification and line wrapping are inconsistent** between pages, and a wide table overflows rather than wrapping | every generated page | One stylesheet states both; a page rendered at 900px and at 1600px shows no horizontal scroll and no ragged column |
| 3 | **Non-breaking spaces render as literal text inside tables** — the escape is applied after the markdown is turned into markup | the markdown-to-page path | No page contains the literal text of an entity, asserted in the page tests |
| 4 | **The taxonomy sunburst can no longer be enlarged or clicked.** It is a regression: the picture is the only view of the whole field | the taxonomy page and its script | A test drives the page's own handlers rather than trusting the markup, and the wedge that was clickable is clickable |
| 5 | Reports **restate each other**. The same figure is written in `summary.md`, `index.html` and `themes.md` in three wordings | `output/` | Each figure has one home and the others link to it |

## What must not be lost

The reports are the argument, so condensing must not remove a bound, a denominator or a citation. A figure
printed without the maximum it is bounded by, or without what it was read against, is worse than no figure.
Cut the restatement, not the provenance.

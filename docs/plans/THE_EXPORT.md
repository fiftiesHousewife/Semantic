# The export

One JSON file, written by every run, holding everything a consumer would act on: the words and phrases that carry signal with their scores, the themes the reading reports, and the result of every taxonomy evaluation. A consumer reads that file and needs nothing else — no HTML, no markdown, no second run.

## What exists now, and why it is not this

`output/themes.json` is 1.1 MB of the theme graph: nodes, edges, scopes and a list of every file read. It exists to feed one viewer, it carries the drawing's own structure, and it holds neither the vocabulary ranking nor any taxonomy result. Three of the four things a consumer wants are only in markdown.

## What the file holds

One object per run, at a stated schema version, with three sections and a header.

| Section | One entry per | Fields |
|---|---|---|
| `header` | run | repository, commit, schema version, λ, the share of observed mass settled on no subject, counts of what was set aside |
| `signals` | word or published phrase that clears its derived bar | the surface, occurrences, the score, which reference set the bar it cleared, the declaration kind, and the file and line of the first sighting |
| `themes` | topic the reading reports | topic, its share, its distance from the repository in bits, the scope it distinguishes, and the words that produced its score |
| `taxonomy` | evaluation | the taxonomy, its version, matched concepts with the branch-corroboration outcome, per-level counts, and the subject placement with the chance placement beside it |

**Signals only, not rejects.** A word nothing could be cited for, a match the branch rule discarded and a topic no further away than chance are absent from `signals`, `themes` and `taxonomy`. **They are present as counts in `header`**, so nothing is hidden: a consumer can tell 40 signals out of 50 candidates from 40 out of 4,000 without reading either list. The lists themselves stay in the reports.

## It runs by default

Every run writes it. It is not behind the `diagnostic` tag, not behind a flag, and not something a caller has to know to ask for. A run that writes reports and no export has produced something only a person can read.

## Two sources, one file

| Source | What it reads | Why |
|---|---|---|
| The clone | the working tree, as today | what the repository is about |
| Pull requests | the declared names and prose a pull request adds, one scope per pull request | what is being added to it, which is the question a reviewer actually has |

**The filter starts at author id** — read the pull requests opened by a stated author — and the field is stated in the header so a consumer knows what the file covers. Other filters (open since a date, touching a path) follow the same shape.

**The two are combined in one file, and every signal states which source it came from.** A consumer asks "what does this author's work add to the picture" by grouping on that field. Pooling them without the field would answer neither question.

**The safeguard is the work, and [supplied text](SUPPLIED_TEXT.md) already states it**: text the reading is handed rather than finds must be its own scope, reported with the repository's reading available beside it and without it. A pull request describing a domain would otherwise be handed back its own description as a finding.

## What it costs

- A schema, versioned, with a test that fails when a field is removed or renamed. A consumer's code breaks silently otherwise.
- A serialiser on the published side. Jackson is a test-only dependency today, because a report format was a diagnostic's business; an export that ships is the library's.
- A GitHub read for the pull request arm: the API, a token, and the filter.
- Sites as permalinks, which the reading already renders where a remote is known.

## What settles it

Three questions answered from the file alone, with no other artefact open:

1. Which words and phrases carry this repository's signal, and how strongly?
2. What is it about, and how far from chance is each answer?
3. Which published concepts does it write, and where does it sit in a published subject scheme?

**And the pull request arm reproduces the repository reading** when the filter selects every file — the same signals with the same scores, which is what says the two paths share one pipeline.

**Abandon if** the file cannot be produced without the reports being produced too. The export is the primary artefact and the documents are a rendering of it; a design where the documents come first has the dependency backwards.

## Where it appears

**The README states the export before it states any report.** A consumer arriving at this repository wants a machine-readable answer, and the current README offers ten documents and no data. One section, near the top: what the file holds, how to get it, and one example object.

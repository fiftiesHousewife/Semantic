# Backlog

An index of the plans under [`docs/plans/`](docs/plans). Each one states what it would measure, what would
settle it, and what would end it; nothing is argued here.

Those documents are outside the corpus this library reads — [`.readingignore`](.readingignore) states so, and
`StatedExclusions` is what honours it. A specification written in the vocabulary of a domain would put
`ForeignExchange` and `InterestRate` into the tree and then find them.

New to the terms? [`docs/GLOSSARY.md`](docs/GLOSSARY.md) defines every linguistic and statistical word used
here, with a reference for each. Library choices and their licences are in
[`docs/DEPENDENCIES.md`](docs/DEPENDENCIES.md).

## The one thing everything else is waiting for

**The reading has never been run on a repository it was not written for.** Every figure this library reports
is an instrument reading itself. The machinery for the backtest is now in place — `-Dcs.panel.dir`, the
manifest, `panelRead`, and a reading that reports rather than fails when pointed at an awkward tree — and
what is missing is the panel: no member is named yet. Naming one costs a licence verified at a pinned
revision, a domain stated by somebody outside this project and recorded *before* the reading runs, and an
arm. Four plans below are blocked on it and say so.

## The queue

| | Plan | What is left | Blocked on |
|---|---|---|---|
| **NEXT** | [The backtest](docs/plans/THE_PANEL.md) | Naming the members. The machinery, the manifest and `panelRead` have landed; the table of every vocabulary against every repository needs members before it has anything to put in a cell | naming the members |
| **NEXT** | [Matching a term in context](docs/plans/TERM_MATCHING.md) | The match is fired almost entirely by one-word terms — `first` carries more than `sentence`. Promoting branch corroboration from a reported comparison into the reading, and scoring a match against the subtree it occupies rather than term by term | nothing. FIBO's dense hierarchy is now bundled, which is what this needed |
| HIGH | [The vote itself](docs/plans/THE_VOTE.md) | Two resources are called equal and are not on one scale; there is no abstention mass in the topical reading; votes are summed where this library says they are pooled | its own stage 0 |
| HIGH | [The run at computational linguistics](docs/plans/COMPUTATIONAL_LINGUISTICS.md) | Whether the reading places this repository in its own field on strong evidence with nothing hard-coded. Ten attempts at most, each recorded | — |
| HIGH | [What a repository depends on](docs/plans/DEPENDENCIES_AS_DOMAIN.md) | A coordinate denotes one artefact and needs no disambiguation; `ImportOrigins` already sorts them and nothing reads them as evidence | — |
| HIGH | [Read a repository against its industry's vocabulary](docs/plans/INDUSTRY_VOCABULARIES.md) | FIBO is bundled — 1,833 concepts, 89% of its labels more than one word. What is left is the arm that decides: running it on a repository it should say nothing about | the panel |
| HIGH | [The domain landscape of a large institution](docs/plans/DOMAIN_LANDSCAPE.md) | Which standards can be cited for a dozen business domains, and why a functional taxonomy is diverged against rather than matched | licences, one per source |
| HIGH | [How far a non-code entry can be trusted](docs/plans/PROSE_TRUSTWORTHINESS.md) | Prose is 71% of everything the reading has to go on and its weight is the one number that was picked rather than derived | — |
| HIGH | [A topic that leads a file should hold some of it](docs/plans/TOPIC_LEADERSHIP.md) | Most led files are led at a share under a fifth; the abstention that would fix it is computed and ignored | — |
| HIGH | [Verbal forms](docs/plans/BEHAVIOURS.md) | A type name read as a structure, a verb chosen with the parse's context, and a clause carried as far as its condition | — |
| MEDIUM | [The taxonomy states more than we read](docs/plans/OLIA_DEFINITIONS.md) | The 1,271 definitions and 949 provenance notes are extracted and shipped. What is left is *reading* them, so a concept is matchable by what it means, and OLiA's own annotation modules | — |
| MEDIUM | [The parse](docs/plans/THE_PARSE.md) | String literals and text blocks, module declarations, the polyglot stage, and how far a parser recovers from a head commit that does not compile | literals need the prose reading |
| MEDIUM | [Sense disambiguation](docs/plans/SENSE_DISAMBIGUATION.md) | The enclosing declaration and the file's pooled domain as context, and the resources that label only a word's specialist senses | — |
| MEDIUM | [The identifier splitter](docs/plans/THE_SPLITTER.md) | The letter/digit boundary, proposed for a citation to dispose of rather than applied, and byte offsets on every token. The one bundled catalogue that would fill the cited-token seam was measured and refused | a catalogue that is not ordinary English |
| MEDIUM | [The repository read, the store and the first slice](docs/plans/THE_PIPELINE.md) | The blob as the unit of observation, DuckDB as the system of record, and the first reading of something that is not this repository | — |
| LOW | [The Wiktionary topic hierarchy](docs/plans/WIKTIONARY_HIERARCHY.md) | Two label spaces that no bundled resource says are one, and 29 labels a root by omission cannot be told from a root by statement | a citation that maps between them |
| LOW | [Visualisation](docs/plans/VISUALISATION.md) | A concept map laid out by the hypernym tree, and a divergence bar with a real axis maximum | — |
| LOW | [The limits, and the open questions](docs/plans/LIMITS.md) | The dead-class half of the resource contract, and four questions each with the measurement that answers it | — |

## What has landed since this list was last true

Kept short on purpose — the reports under [`output/`](output) carry the figures, and the README carries the
argument. This is only what has left the queue.

- **A reading of another clone reports rather than fails.** Findings true of this tree alone moved out of the
  diagnostics into pinned classes; a reading of somebody else's repository writes to `output/<name>/` and can
  no longer overwrite the figures this repository publishes of itself.
- **The bundled-resource contract has both halves.** A file with no provenance header fails the build, and so
  now does one that nothing reads.
- **OLiA's conversion stopped losing data**, and FIBO was bundled beside it as the first vocabulary for a
  field this repository is outside of.
- **The backtest machinery**: `-Dcs.panel.dir`, the panel manifest, `panelRead`, and the awkward repositories
  the panel plan says it must contain — one that does not wholly parse, one that is mostly not code, one that
  imports nothing.

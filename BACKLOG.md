# Backlog

An index of the plans under [`docs/plans/`](docs/plans). Each one states what it would measure, what would
settle it, and what would end it; nothing is argued here.

Those documents are outside the corpus this library reads — [`.readingignore`](.readingignore) states so, and
`StatedExclusions` is what honours it. A specification written in the vocabulary of a domain would put
`ForeignExchange` and `InterestRate` into the tree and then find them.

New to the terms? [`docs/GLOSSARY.md`](docs/GLOSSARY.md) defines every linguistic and statistical word used
here, with a reference for each.

## The queue

| | Plan | What it would settle | Blocked on |
|---|---|---|---|
| **NEXT** | [The taxonomy states more than we read](docs/plans/OLIA_DEFINITIONS.md) | The 1,271 definitions and 949 provenance notes are extracted and shipped; what is left is reading them, so a concept is matchable by what it *means*, and OLiA's other modules | nothing |
| **NEXT** | [Matching a term in context](docs/plans/TERM_MATCHING.md) | Branch corroboration has landed and settles its three criteria. What is left is promoting it from a reported comparison to the reading, and the hypernym-depth arm | nothing |
| **NEXT** | [The backtest — thirty repositories](docs/plans/THE_PANEL.md) | Whether any figure here survives a repository the reading was not written for, and whether a relevant taxonomy can be offered for each domain at all. Four other plans are blocked on it. The machinery is in: `-Dcs.panel.dir`, the manifest, `panelRead`, and a reading that reports rather than fails when pointed elsewhere | naming the members |
| HIGH | [The vote itself](docs/plans/THE_VOTE.md) | Two resources are called equal and are not on one scale; there is no abstention mass in the topical reading; votes are summed where this library says they are pooled | its own stage 0 |
| HIGH | [The run at computational linguistics](docs/plans/COMPUTATIONAL_LINGUISTICS.md) | Whether the reading places this repository in its own field on strong evidence with nothing hard-coded. Ten attempts at most, each recorded | — |
| HIGH | [What a repository depends on](docs/plans/DEPENDENCIES_AS_DOMAIN.md) | A coordinate denotes one artefact and needs no disambiguation; `ImportOrigins` already sorts them and nothing reads them as evidence | — |
| HIGH | [Read a repository against its industry's own vocabulary](docs/plans/INDUSTRY_VOCABULARIES.md) | Whether a domain vocabulary fires in its domain and not outside it. FpML's licence is verified; the extraction is specified to the file | the out-of-domain panel |
| HIGH | [The domain landscape of a large institution](docs/plans/DOMAIN_LANDSCAPE.md) | Which standards can be cited for a dozen business domains, and why a functional taxonomy is diverged against rather than matched | licences, one per source |
| HIGH | [How far a non-code entry can be trusted](docs/plans/PROSE_TRUSTWORTHINESS.md) | Prose is 74% of everything the reading has to go on and its weight is the one number that was picked rather than derived | — |
| HIGH | [A topic that leads a file should hold some of it](docs/plans/TOPIC_LEADERSHIP.md) | 92 of 178 led files are led at a share under a fifth; the abstention that would fix it is computed and ignored | — |
| HIGH | [Verbal forms](docs/plans/BEHAVIOURS.md) | A type name read as a structure, a verb chosen with the parse's context, and a clause carried as far as its condition | — |
| MEDIUM | [The parse](docs/plans/THE_PARSE.md) | String literals and text blocks, module declarations, the polyglot stage, and how far a parser recovers from a head commit that does not compile | literals need the prose reading |
| MEDIUM | [Sense disambiguation](docs/plans/SENSE_DISAMBIGUATION.md) | The enclosing declaration and the file's pooled domain as context, and the resources that label only a word's specialist senses | — |
| MEDIUM | [The identifier splitter](docs/plans/THE_SPLITTER.md) | The letter/digit boundary, proposed for a citation to dispose of rather than applied, and byte offsets on every token | a cited catalogue |
| MEDIUM | [The repository read, the store and the first slice](docs/plans/THE_PIPELINE.md) | The blob as the unit of observation, DuckDB as the system of record, and the first reading of something that is not this repository | — |
| LOW | [The Wiktionary topic hierarchy](docs/plans/WIKTIONARY_HIERARCHY.md) | Two label spaces that no bundled resource says are one, and 29 labels a root by omission cannot be told from a root by statement | a citation that maps between them |
| LOW | [Visualisation](docs/plans/VISUALISATION.md) | A concept map laid out by the hypernym tree, and a divergence bar with a real axis maximum | — |
| LOW | [The limits, and the open questions](docs/plans/LIMITS.md) | What the self test cannot yet say, the reachability half of the resource contract, and four questions each with the measurement that answers it | — |

## What is already in the tree

The README's [What it reads, and what it refuses to](README.md#what-it-reads-and-what-it-refuses-to) and the
sections after it carry the landed reading and its current figures, regenerated by `./gradlew selfRead`.

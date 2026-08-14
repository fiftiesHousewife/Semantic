# Backlog

An index of the plans under [`docs/plans/`](docs/plans). Each one states what it would measure, what would
settle it, and what would end it; nothing is argued here.

Those documents are outside the corpus this library reads — [`.readingignore`](.readingignore) states so, and
`StatedExclusions` is what honours it. A specification written in the vocabulary of a domain would put
`ForeignExchange` and `InterestRate` into the tree and then find them.

New to the terms? [`docs/GLOSSARY.md`](docs/GLOSSARY.md) defines every linguistic and statistical word used
here, with a reference for each. Library choices and their licences are in
[`docs/DEPENDENCIES.md`](docs/DEPENDENCIES.md).

## What the codebase does, step by step

The library takes a local directory and produces a distribution over subject categories, plus a statement of
which parts of the repository depart from that distribution further than chance would. Nine steps run in
order. Each is named here with the classes that carry it, so a plan below can say which step it changes.

**1. The files are found and parsed.** `JavaSourceScopes` finds every `<module>/src/<set>/java` directory and
`DocumentationScope` finds the markdown, both filtered by whatever `.readingignore` states through
`StatedExclusions`. `ParsedRepository` parses each Java file with JavaParser and keeps only the names its
author *declared* — a type, method, field, parameter, local, record component, constant, pattern binding or
label. A name that is used here but declared elsewhere is somebody else's vocabulary, and the parse is the
only thing that tells the two apart. `ImportOrigins` sorts each import into platform, own and third-party by
asking `PlatformPackages`, which cites `ModuleFinder.ofSystem()`. Files that do not parse are counted and
named, never dropped in silence.

**2. Each name is split into words.** `Tokeniser` splits on case transitions, digit boundaries and
separators; `IdentifierWords` applies it to a declared name. Where a compound carries no boundary at all,
`WordSegmenter` enumerates candidate splits through `CompoundParses` and prices each piece with `PieceCost`
against the frequency list `WordRanks` reads, so the commonest reading wins. This is grammar and it is
permitted; a list of words to treat specially would not be.

**3. Each word is looked up.** `ContentWords` asks WordNet whether the word has an open-class entry, which
removes the words English uses to hold a sentence together without a stop list existing. `WordMorphology`
returns the dictionary form from the same query. `TopicCitations` then collects what two resources say the
word is about: WordNet Domains labels each *sense*, and Wiktionary's topic vocabulary labels the *headword*.
`StatedTopics` folds a label that another label of the same word already implies back into the label it came
from, using the hierarchy the topic resource itself publishes.

**4. Each vote is weighted.** `SenseCoverage` gives the share of a word's senses the resource labelled.
`WordSpecificity` gives `log(rank) / log(size)` against the frequency list, bounded in `[0, 1]` by the length
of that list. `PhraseTopics` scores a subject by the geometric mean over the words of the name that agree on
it, times the share of the name that agrees. Every weight is read off a published resource; none is chosen.

**5. The votes are pooled.** `TopicDistribution` accumulates one unit of evidence per phrase — one declared
name, or one sentence of prose at half the weight — into a distribution over subjects for each scope and for
the repository as a whole, over everything observed rather than over what was placed: what a phrase's words
could not settle on a subject stays in the denominator, so a share says how much of what was written it is
and not how much of what happened to resolve. `PooledLogOdds` and `AxisEvidenceAccumulator` do the arithmetic for a closed set
of values, `OpenSpaceAccumulator` for an open one. `LegibilityReading` reports λ, the share of word
occurrences any resource could be cited for, which is the denominator the rest rests on.

**6. Each scope is compared against the whole.** `JensenShannon` measures the distance between a scope's
distribution and the repository's, in bits, with a per-topic decomposition that says which topics carried the
distance. `PermutationNull` draws 999 resamples of a scope of the same size from the same repository, and
`ChanceExpectedBest` sets the bar at the `1/(n+1)` quantile because every scope is tested at once.
`Thresholds` holds the constants.

**7. The repository is placed in a published field.** `ArxivSubjects` supplies 152 subject descriptions,
`PooledDescriptions` pools each subject's own prose through the same pipeline, and `SubjectPlacement` reports
the nearest by divergence. `SubjectNull` builds a taxonomy of chance and the nearest real subject must beat
the nearest chance one. `OrdinaryEnglish` provides the same reading over the frequency list, as a baseline.

**8. Declared names are matched against a published term vocabulary.** `TermIndex` holds a taxonomy's
concepts, already formatted as identifiers; `TermSpans` takes the longest term at each position of a name,
left to right, with no two matches overlapping; `NormalisedTerms` reduces both sides to words, to dictionary
forms, or to synsets, and reports each level separately. `TaxonomyTree` and `StatedSiblings` supply the
publisher's own placement, and `CorroboratedTerms` accepts a single-word match only where the repository
writes another concept from the same branch. **Nothing from this step feeds step 5.** It has only ever been
run against this repository.

**9. The reports are written.** `ReadingSummary` keeps what cleared a bar and names what did not.
`ReadingWalkthrough` puts the nine steps above in order with the figures each produced, and `WalkthroughPage`
renders it to [`output/index.html`](output/index.html), which is the document to read first. `ThemeReport`,
`ThemePage`, `ThemeSunburst`, `TaxonomyPage` and `EvidencePage` write the detail beside it. Every report goes
to [`output/`](output) and is committed, so the current figures can be read without running anything.

## The one thing everything else is waiting for

**The reading has never been run on a repository it was not written for.** Every figure this library reports
is an instrument reading itself. The machinery for the backtest is in place — `-Dcs.panel.dir`, the manifest,
`panelRead`, and a reading that reports rather than fails when pointed at an awkward tree — and what is
missing is the panel: no member is named yet. Naming one costs a licence verified at a pinned revision, a
domain stated by somebody outside this project and recorded *before* the reading runs, and an arm. Four plans
below are blocked on it and say so.

## The queue

| | Plan | Step | What is left | Blocked on |
|---|---|--:|---|---|
| **NEXT** | [The backtest](docs/plans/THE_PANEL.md) | all | Naming the members. The machinery, the manifest and `panelRead` have landed; the table of every vocabulary against every repository needs members before it has anything to put in a cell | naming the members |
| **NEXT** | [Matching a term in context](docs/plans/TERM_MATCHING.md) | 8 | Branch corroboration is now the reading that is reported, and `Topic` is out of the headline. What is left is scoring a match against the subtree it occupies rather than term by term, and the depth arm: for every match, how deep its least common subsumer sits. That arm needs no panel | nothing |
| **NEXT** | [The vote itself](docs/plans/THE_VOTE.md) | 4–5 | Stages A, 0 and 1 have landed: a share's denominator now includes what nothing could place, and 77.9% of this tree's observed mass is settled on no subject against λ = 0.978. What is left: one unit per resource, votes pooled where this library says they are pooled rather than summed, and the constants last. The scale defect is half fixed — a headword claim is discounted by the dictionary's sense count, which is reading (b) where the plan recommended (c), and stage 2's first decision is which of the two moves | nothing |
| HIGH | [The run at computational linguistics](docs/plans/COMPUTATIONAL_LINGUISTICS.md) | 7 | Whether the reading places this repository in its own field on strong evidence with nothing hard-coded. Ten attempts at most, each recorded | — |
| HIGH | [What a repository depends on](docs/plans/DEPENDENCIES_AS_DOMAIN.md) | 1 | A coordinate denotes one artefact and needs no disambiguation; `ImportOrigins` already sorts them and nothing reads them as evidence | — |
| HIGH | [Read a repository against its industry's vocabulary](docs/plans/INDUSTRY_VOCABULARIES.md) | 8 | FIBO is bundled — 1,833 concepts, 89% of its labels more than one word. What is left is the arm that decides: running it on a repository it should say nothing about | the panel |
| HIGH | [The domain landscape of a large institution](docs/plans/DOMAIN_LANDSCAPE.md) | 7 | Which standards can be cited for a dozen business domains, and why a functional taxonomy is diverged against rather than matched | licences, one per source |
| HIGH | [How far a non-code entry can be trusted](docs/plans/PROSE_TRUSTWORTHINESS.md) | 5 | Prose is 72% of everything the reading has to go on and its weight is the one number that was picked rather than derived | — |
| HIGH | [A topic that leads a file should hold some of it](docs/plans/TOPIC_LEADERSHIP.md) | 5 | Most led files are led at a share under a fifth; the correction that would fix it is computed and ignored | — |
| HIGH | [Verbal forms](docs/plans/BEHAVIOURS.md) | 2–3 | A type name read as a structure, a verb chosen with the parse's context, and a clause carried as far as its condition | — |
| MEDIUM | [The taxonomy states more than we read](docs/plans/OLIA_DEFINITIONS.md) | 8 | The 1,271 definitions and 949 provenance notes are extracted and shipped. What is left is *reading* them, so a concept is matchable by what it means, and OLiA's own annotation modules | — |
| MEDIUM | [The parse](docs/plans/THE_PARSE.md) | 1 | String literals and text blocks, module declarations, the polyglot stage, and how far a parser recovers from a head commit that does not compile | literals need the prose reading |
| MEDIUM | [Sense disambiguation](docs/plans/SENSE_DISAMBIGUATION.md) | 3 | The enclosing declaration and the file's pooled domain as context, and the resources that label only a word's specialist senses | — |
| MEDIUM | [The identifier splitter](docs/plans/THE_SPLITTER.md) | 2 | The letter/digit boundary, proposed for a citation to dispose of rather than applied, and byte offsets on every token. The one bundled catalogue that would fill the cited-token gap was measured and refused | a catalogue that is not ordinary English |
| MEDIUM | [The repository read, the store and the first slice](docs/plans/THE_PIPELINE.md) | 1, 9 | The blob as the unit of observation, DuckDB as the system of record, and the first reading of something that is not this repository | — |
| LOW | [The Wiktionary topic hierarchy](docs/plans/WIKTIONARY_HIERARCHY.md) | 3 | Two label spaces that no bundled resource says are one, and 29 labels a root by omission cannot be told from a root by statement | a citation that maps between them |
| LOW | [Visualisation](docs/plans/VISUALISATION.md) | 9 | A concept map laid out by the hypernym tree, and a divergence bar with a real axis maximum | — |
| LOW | [The limits, and the open questions](docs/plans/LIMITS.md) | — | The dead-class half of the resource contract, and four questions each with the measurement that answers it | — |

## What has landed since this list was last true

Kept short on purpose — the reports under [`output/`](output) carry the figures, and the README carries the
argument. This is only what has left the queue.

- **A share's denominator now holds what nothing could place.** Every ι is a share of everything the reading
  observed, the dominant-topic reading and the distribution run on one partition, and the summary states the
  two denominators together: λ = 0.978 of word occurrences are citable, and 77.9% of the observed mass is
  settled on no subject. A comparison still runs over what each side placed, and the plan says what would
  settle whether it should.
- **One document that traces the analysis.** `output/index.html` is now the nine steps above in order, with
  each step's figures and a link to the report holding its whole tail, and the sunburst drawn inside it.
- **The branch corroboration votes.** Step 8 reports the corroborated reading rather than every match, and
  applying the rule to each rung's answer rather than to the source's own spellings closed the gap a
  normalised two-word term left open.
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

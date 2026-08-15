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

**2. Each name is split into words.** `Tokeniser` splits on case transitions and separators;
`IdentifierWords` applies it to a declared name and adds the acronym-run rule. A letter beside a digit is not
a boundary, which is [UAX #29](https://www.unicode.org/reports/tr29/)'s own rule WB9/WB10 and not a gap. Where a compound carries no boundary at all,
`WordSegmenter` enumerates candidate splits through `CompoundParses` and prices each piece with `PieceCost`
against the frequency list `WordRanks` reads, so the commonest reading wins. This is grammar and it is
permitted; a list of words to treat specially would not be. `CollocatedWords` then reads the words back in
the order they were written: a run of adjacent words a topical resource publishes as one entry —
`PublishedPhrases` holds the 69,713 the two bundled ones state — is one word from here on, and a run must
begin and end on a word that carries subject matter, because the same dictionaries publish `to the` and
`out of`.

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

## The run in progress: classifying a repository against a taxonomy

[The plan](docs/plans/CLASSIFYING_A_REPOSITORY.md) replaces the present route to a published subject — word,
then one of ~460 general vocabulary labels, then a divergence — with a direct answer: which concepts of a
published taxonomy this repository writes, and which category they place it in. Step 8 already matches a
taxonomy's multi-word concepts in the order they were written and produces a concept identifier; it has never
fed the answer. The reason it could not is gone.

Each chunk lands on its own and states the number that judges it. **Chunks 1–4 are sequential and chunk 4 is
the kill line**; 5, 6 and 7 are independent once it has passed. Chunk 1 has landed, so chunk 2 is next and it
opens with two licences to read.

| | Chunk | What it does | The number that judges it |
|---|---|---|---|
| ~~1~~ | ~~Weight every file equally in a comparison~~ | **Landed.** A comparison composes with `meanOfWhatEachPlaced`, so a file is one observation whatever share of it could be read; the intensity keeps `meanOf` and `ScopeThemes` carries both | **ρ = 0.9985** over 373 files and 463 topics — the order held. The shares moved further, and `cs.CL` passed `cs.SY` to stand first of 152 |
| 2 | Read two licences, then name the panel | **The target is PyPI Trove `Topic ::`**, Apache-2.0, 321 classifiers under 25 roots: ACM states CCS is free "for educational and research purposes", which is not redistribution in a published artefact. What is left is the manifest from Apache DOAP, citing a category token, source URL and retrieval date rather than copying a curated list | **13 categories retain ≥5 Java members** against a kill line of 5 — but only 10 are subject matter, since `library` (98 members), `java` and `javaee` are not |
| 3 | Read the panel and report what happens | `panelRead` over the named members. No classification yet | Does λ = 0.983 reproduce off this tree, and does the unplaced share stay near 75.5% |
| 4 | **The decisive test, on concept match alone** | Mean pairwise divergence within a stated category against between categories, p-value by shuffling the labels across members | The permutation p-value. **If it does not clear, stop** — the reading is measuring Java rather than subject matter |
| 5 | Concept match as a ranked assignment | The share of a category's subtree the repository writes, corroborated by branch, bounded at 1 by its own definition | First-place and first-three counts on the panel against two trivial baselines: majority category, and BM25 over the README |
| 6 | Fix the description arm | Null drawn at each category's own description length, and a subtree's descriptions pooled to its root. The truncation study first, which needs no panel | The truncation fraction at which the winning subject changes; before 1/4 means the present placement reads description length |
| 7 | The dependency arm | Coordinates as evidence in their own right — an artefact denotes one published thing, so nothing is disambiguated | The same counts as chunk 5 from coordinates alone, and **whether it is wrong in different places**, which is what makes combining worthwhile |
| 8 | Combine the arms and measure | Pooled log-linearly, each arm weighted by a figure it reports about itself rather than a constant fitted here | The combination against its best single arm, with the per-arm figures beside it and the smallest categories reported rather than hidden |

## The queue

| | Plan | Step | What is left | Blocked on |
|---|---|--:|---|---|
| **NEXT** | [Classifying a repository](docs/plans/CLASSIFYING_A_REPOSITORY.md) | 5, 7–8 | **The priority**, and the run above states it chunk by chunk. The present route answers in the wrong vocabulary: it yields `linguistics` and `computing` where the question was which published subject this repository belongs to, and it compares a 75,000-occurrence tree against descriptions with a median of 18 words | nothing until chunk 4 |
| **NEXT** | [The vote itself](docs/plans/THE_VOTE.md) | 4–5 | Stages A, 0 and 1 have landed: a share's denominator now includes what nothing could place, and 75.5% of this tree's observed mass is settled on no subject against λ = 0.983. What is left: one unit per resource, votes pooled where this library says they are pooled rather than summed, and the constants last. The scale defect is half fixed — a headword claim is discounted by the dictionary's sense count, which is reading (b) where the plan recommended (c), and stage 2's first decision is which of the two moves. A phrase read as a published run makes it sharper rather than easier: `part of speech` now casts one vote where three words used to, and what a run is worth against what a word is worth is a weight nobody has derived | nothing |
| **NEXT** | [The backtest](docs/plans/THE_PANEL.md) | all | Naming the members. The machinery, the manifest and `panelRead` have landed; the table of every vocabulary against every repository needs members before it has anything to put in a cell | naming the members |
| **NEXT** | [Matching a term in context](docs/plans/TERM_MATCHING.md) | 8 | **The depth arm, and it is now the thing chunk 4 waits on.** The first reading of another repository — OLiA against Tika — matched 106 concepts 8,799 times across 1,537 of 2,148 files, corroborated. Much of that is two vocabularies agreeing about text, because Tika is a poor negative control; what is not is `Result` 836, `Object` 476, `Exception` 283, `String` 585, whose shared property is that they sit shallow in the tree. Depth is read off the publisher's hierarchy rather than chosen. **56% of the target vocabulary's leaf labels are a single word**, so a matcher that cannot price a shallow hit will be handed a vocabulary made of them. Also left: scoring a match against the subtree it occupies rather than term by term | nothing |
| HIGH | [What a repository depends on](docs/plans/DEPENDENCIES_AS_DOMAIN.md) | 1 | A coordinate denotes one artefact and needs no disambiguation; `ImportOrigins` already sorts them and nothing reads them as evidence | — |
| HIGH | [Read a repository against its industry's vocabulary](docs/plans/INDUSTRY_VOCABULARIES.md) | 8 | FIBO is bundled — 1,833 concepts, 89% of its labels more than one word. What is left is the arm that decides: running it on a repository it should say nothing about | the panel |
| HIGH | [The domain landscape of a large institution](docs/plans/DOMAIN_LANDSCAPE.md) | 7 | Which standards can be cited for a dozen business domains, and why a functional taxonomy is diverged against rather than matched | licences, one per source |
| HIGH | [How far a non-code entry can be trusted](docs/plans/PROSE_TRUSTWORTHINESS.md) | 5 | Prose is 72% of everything the reading has to go on and its weight is the one number that was picked rather than derived | — |
| HIGH | [A topic that leads a file should hold some of it](docs/plans/TOPIC_LEADERSHIP.md) | 5 | Most led files are led at a share under a fifth; the correction that would fix it is computed and ignored | — |
| HIGH | [Verbal forms](docs/plans/BEHAVIOURS.md) | 2–3 | A type name read as a structure, a verb chosen with the parse's context, and a clause carried as far as its condition | — |
| MEDIUM | [The taxonomy states more than we read](docs/plans/OLIA_DEFINITIONS.md) | 8 | The 1,271 definitions and 949 provenance notes are extracted, shipped, and now shown — the taxonomy page names every concept the field publishes with what its publisher says it means. What is left is *reading* them, so a concept is matchable by what it means, and OLiA's own annotation modules | — |
| MEDIUM | [The parse](docs/plans/THE_PARSE.md) | 1 | String literals and text blocks, module declarations, the polyglot stage, and how far a parser recovers from a head commit that does not compile | literals need the prose reading |
| MEDIUM | [Sense disambiguation](docs/plans/SENSE_DISAMBIGUATION.md) | 3 | The enclosing declaration and the file's pooled domain as context, and the resources that label only a word's specialist senses | — |
| MEDIUM | [The identifier splitter](docs/plans/THE_SPLITTER.md) | 2 | Byte offsets on every token, and the adjective edge — a run whose first word is an adjective the reading refuses alone, `geometric mean` and `lexical semantics`, is refused with it. **The letter/digit boundary is closed**: UAX #29 states no break between a letter and a digit, so a catalogue is what would override the standard rather than what was needed to obey it | nothing |
| MEDIUM | [The repository read, the store and the first slice](docs/plans/THE_PIPELINE.md) | 1, 9 | The blob as the unit of observation, DuckDB as the system of record, and the first reading of something that is not this repository | — |
| LOW | [The Wiktionary topic hierarchy](docs/plans/WIKTIONARY_HIERARCHY.md) | 3 | Two label spaces that no bundled resource says are one, and 29 labels a root by omission cannot be told from a root by statement | a citation that maps between them |
| LOW | [Visualisation](docs/plans/VISUALISATION.md) | 9 | A concept map laid out by the hypernym tree, and a divergence bar with a real axis maximum | — |
| LOW | [The limits, and the open questions](docs/plans/LIMITS.md) | — | The dead-class half of the resource contract, and four questions each with the measurement that answers it | — |

## What has landed since this list was last true

Kept short on purpose — the reports under [`output/`](output) carry the figures, and the README carries the
argument. This is only what has left the queue.

- **A file is one observation in a comparison, which is what the contract had always claimed.** A scope's
  comparison distribution was its intensity renormalised, and that composition is
  `Σ(1 − u) · r ⁄ Σ(1 − u)` — every file weighted by the share of itself the resources could read, on a tree
  where three quarters of the observed mass settles on no subject. Nobody decided that. It weighted by
  legibility while refusing to weight by length, so a 400-line file and a 30-line file stayed one observation
  each and the more legible of two files outvoted the other, and a weighting has to justify both or neither.
  Each file is renormalised before the mean now. The order barely moved — Spearman ρ = 0.9985 over 373 files
  and 463 topics — but the shares moved further, `publishing` from 5.95% to 5.21% and `telecommunication`
  from 4.93% to 4.11%, and the field placement swapped: read off one tree both ways, `cs.CL` Computation and
  Language passed `cs.SY` Systems and Control to stand nearest of 152 published subjects, 0.3900 bits against
  0.3916 where it had been 0.4013 against 0.3965. That closes a defect the subject pin had recorded as open,
  by 0.0016 bits — a margin the pin declines to assert an order across, so it asserts the leading pair
  instead. The explanation that defect carried was wrong: it blamed the vaguest description arXiv publishes,
  `cs.ET`, which was twelfth at 0.5388 throughout. Both compositions are measured on one tree because the
  committed reports moved for a second reason as well — the corpus grew by the files this change added.

- **The field's own concepts are readable, not just the ones this codebase writes.** The taxonomy page named
  56 concepts and reported the other 1,255 as counts — `121 more here go unwritten` — so the vocabulary a
  reader wants to judge the reading against was only in the resource file. Every concept is named now, with
  OLiA's own definition on it, what went unwritten behind one closed fold per branch, and the 59 root
  branches this repository never enters drawn at the end. The sunburst cannot carry this and no styling will
  make it: a leaf wedge is a hairline.
- **The letter/digit boundary was never a gap, and now says so.** The splitter's javadoc apologised for not
  dividing a letter from a digit and this list recorded it as blocked on a catalogue nothing bundles. UAX #29
  states rules WB9 and WB10 — `AHLetter × Numeric` and `Numeric × AHLetter`, where the operator is defined in
  Unicode's own table as *do not allow break here* — so `utf8Decode` reading as utf8 and decode is cited
  grammar of the same kind as the acronym-run rule. A catalogue is what would override that default for a
  particular run, never what was needed to obey it. Two documents claimed `Tokeniser` splits on digit
  boundaries; its splitter is `(?<=[a-z])(?=[A-Z])|[_-]` and never has.
- **A name's words are read in the order they were written.** A run of adjacent words a topical resource
  publishes as one entry is one word from step 2 on, taken longest-first and left to right over the 69,713
  collocations the two bundled resources state. `part of speech` is written 41 times here and was three words
  pooling their subjects; it is one term with one subject now, and `grammar` clears the bar it had been under
  as a result. The rule that made it usable is that a run must begin and end on a word carrying subject
  matter: the first measurement's commonest run was `to the`, voting *mathematics* 78 times, and the same
  open-class coverage that refuses `to` and `the` on their own refuses them at the edge of a run.
- **The reading is deterministic.** Two `selfRead` runs over an unchanged tree placed this repository in
  different fields — Mathematics at 0.3660 bits in one and 0.5306 in the next — because a bundled taxonomy
  held its concepts in an immutable map, whose iteration order Java randomises once per JVM, and the
  archive-level reading joins the descriptions it pools. The publisher's stated order is kept now, and every
  figure a report states is reproducible.
  **Not byte-identical, which this list claimed until it was measured.** Two consecutive runs over an
  unchanged tree still differ in `output/themes.json` at roughly 2,100 lines: `elapsedMillis` and the commit
  the permalinks name are recorded rather than derived, and the rest is last-place floating-point drift —
  `0.04597877460727532` against `…33`, `142.6102680297462` against `142.61026802974624`. `Map.copyOf`,
  `Set.copyOf` and `Collectors.toUnmodifiable*` salt their iteration order once per JVM, which is the same
  mechanism as the defect above, and addition over doubles is not associative, so a sum taken in a different
  order lands on a different last bit. It changes no reported figure — the drift is around 1e-17 relative —
  and every other report is byte-identical. Summing in a stated order would close it.
- **A package's rungs are read as the words they are.** The tail was handed on with its dots replaced by
  spaces, which the identifier grammar cannot split, so every deep package sat in the unread tail —
  `codesemantics engine theme` eighty-one times. The words an author divides their work by are now read.
- **The reading places itself in its own field, and the run that got it there is closed.** The goal — this
  repository placed in computational linguistics on evidence, nothing hard-coded — is met and pinned in
  `PinnedSubjectFindings`: `cs.CL` stands second of 152 published subjects by divergence and third by shared
  mass, and the archive-level placement beats a taxonomy of chance. Four attempts got it there: not offering
  a dependency's name to a dictionary, one observation per resource rather than one unit per resource,
  reading an unlabelled word as uncovered, and pinning the goal in the suite so a regression fails a build.
  What remains is a defect the pin states rather than a plan: the nearest single subject is still not
  `cs.CL`, and a null drawn at each subject's own description length is what would settle it.
- **Both pictures the reading draws are on one page.** The term reading writes its sunburst as a file the
  way the theme reading already did, so the chart page carries both without either step waiting on the
  other, and both files are parsed by their tests rather than trusted.
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

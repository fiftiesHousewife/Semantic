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

**The reading has been run on one repository it was not written for, and one is not a panel.** Apache Tika,
pinned at `43cbdae6`, Apache-2.0, its domain the category token the Apache Software Foundation states in its
own DOAP record and written down before the reading ran. The machinery is in place — `-Dcs.panel.dir`, the
manifest, `panelRead`, and a reading that reports rather than fails when pointed at an awkward tree.

**One member has already earned its cost twice over, by finding two defects that cannot appear on this tree
at all.** 45.1% of Tika's comment word occurrences sit in a comment copied into more than one file, against
0.3% here, because this repository carries no licence header — so the reading's second-largest theme on Tika
is a legal instrument counted 2,140 times, and no amount of reading this tree would ever have shown it. And
21% of the term matcher's spans there are Java's naming conventions colliding with ordinary English nouns, a
collision this repository is too small and too domain-adjacent to produce.

What is still missing is a member with no text in its subject matter, so that silence can be the result:
Tika extracts text and OLiA annotates text, which makes it a poor negative control by construction. `maven`
or `ant`, which Apache states as `build-management`, is what would settle it. Naming one costs a licence
verified at a pinned revision, a domain stated by somebody outside this project and recorded *before* the
reading runs, and an expected result.

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
| **NEXT** | [What the author wrote](docs/plans/WHAT_THE_AUTHOR_WROTE.md) | 1–3 | **Four measured defects, and the largest cannot appear on this tree.** A comment copied into every file is counted once per copy: **45.1% of Tika's comment word occurrences** are in a comment whose text appears in more than one file, against **0.3%** here, and the Apache licence header in 2,140 of 2,149 files is the whole of Tika's `law` theme and most of `apache` carrying `geography`. The lemmatiser turns `was`, `does` and `has` into `wa` 268, `doe` 191 and `ha` 174, which vote at specificity 0.839, 0.968 and 0.928 because the accident is rarer than the word. A type restated in its own declaration's name — `getFooList` returning `List` — is 21% of every OLiA span on Tika. And the platform's own API vocabulary can be asked of `ModuleFinder.ofSystem()` rather than written down. Javadoc's tag names and inline-tag targets have landed | nothing |
| **NEXT** | [Text the caller supplies](docs/plans/SUPPLIED_TEXT.md) | 1, 5 | A string or a file the reading is handed rather than finds, then a JIRA or GitHub issue reference and the credentials to read it. The safeguard is the work: supplied text must be its own scope, reported with the repository's reading available beside it and without it, or a caller who supplies a description of the domain gets that answer back | nothing |
| **NEXT** | [Classifying a repository](docs/plans/CLASSIFYING_A_REPOSITORY.md) | 5, 7–8 | **The priority**, and the run above states it chunk by chunk. The present route answers in the wrong vocabulary: it yields `linguistics` and `computing` where the question was which published subject this repository belongs to, and it compares a 75,000-occurrence tree against descriptions with a median of 18 words | nothing until chunk 4 |
| **NEXT** | [The vote itself](docs/plans/THE_VOTE.md) | 4–5 | Stages A, 0 and 1 have landed: a share's denominator now includes what nothing could place, and 75.5% of this tree's observed mass is settled on no subject against λ = 0.983. What is left: one unit per resource, votes pooled where this library says they are pooled rather than summed, and the constants last. The scale defect is half fixed — a headword claim is discounted by the dictionary's sense count, which is reading (b) where the plan recommended (c), and stage 2's first decision is which of the two moves. A phrase read as a published run makes it sharper rather than easier: `part of speech` now casts one vote where three words used to, and what a run is worth against what a word is worth is a weight nobody has derived. **And the one weight that is already derived votes on nothing**: `PhraseSpecificity` is `log(rank)/log(size)` over the frequency list, bounded in `[0, 1]` by the list's own length, computed on every term sighting, and used only to sort a report — a specialist word should weigh more than an ordinary one wherever the reading counts, not only where it ranks | nothing |
| **NEXT** | [The backtest](docs/plans/THE_PANEL.md) | all | Naming the members. The machinery, the manifest and `panelRead` have landed; the table of every vocabulary against every repository needs members before it has anything to put in a cell | naming the members |
| **NEXT** | [Matching a term in context](docs/plans/TERM_MATCHING.md) | 8 | **Depth is measured and refuted, and what is left is where the branch rule is asked.** `Result` 836, `Object` 476, `Exception` 283 and `String` 585 were said to sit shallow; `Result` is six rungs down and `Verb`, `Noun`, `Token` and `Diacritic` are one, and what the branch rule refused is deeper than what it admitted on both trees read. Three signals were measured beside it and only one removes those four: the branch rule asked of the **file** the term was written in rather than of the whole repository, which drops `Set` 1,754, `List` 966, `Result` 836 and `Object` 476 from Tika and `Topic` 531 from here. It costs real matches — `Phrase` 68 becomes 1 — and leaves 8 of Tika's 24 branches against a stated line of 12, so it is not promoted on one out-of-domain member. Also left: scoring a match against the subtree it occupies rather than term by term, and **a linguistics vocabulary that is not OLiA** — its two deepest branches are discourse relations and named entities, both spelled in ordinary English, which is where most of the noise comes from. The Computer Science Ontology is the best-shaped candidate and states its licence on no page it publishes | a second out-of-domain member |
| **NEXT** | [Read a repository against its industry's vocabulary](docs/plans/INDUSTRY_VOCABULARIES.md) | 8 | **Not blocked, and it was never blocked on the panel.** FIBO is bundled — 1,833 concepts, 89% of its labels more than one word — with a `FiboTerms` class nothing in the tree reads: only its own unit test touches it. A linguistics library and a text extractor are both repositories a finance ontology should say nothing about, so the control needs no panel member and no licence. `TermIndex`, `TaxonomyTree` and `StatedSiblings` are source-agnostic by design, so what is missing is the index and a run. It settles three things at once: whether the matcher is measuring Java, whether the branch rule is an OLiA artefact, and whether the file-scope finding survives a second publisher's hierarchy | nothing |
| HIGH | [What a repository depends on](docs/plans/DEPENDENCIES_AS_DOMAIN.md) | 1 | A coordinate denotes one artefact and needs no disambiguation; `ImportOrigins` already sorts them and nothing reads them as evidence | — |
| HIGH | [The domain landscape of a large institution](docs/plans/DOMAIN_LANDSCAPE.md) | 7 | Which standards can be cited for a dozen business domains, and why a functional taxonomy is diverged against rather than matched | licences, one per source |
| HIGH | [How far a non-code entry can be trusted](docs/plans/PROSE_TRUSTWORTHINESS.md) | 5 | Prose is 72% of everything the reading has to go on and its weight is the one number that was picked rather than derived | — |
| HIGH | [A topic that leads a file should hold some of it](docs/plans/TOPIC_LEADERSHIP.md) | 5 | Most led files are led at a share under a fifth; the correction that would fix it is computed and ignored | — |
| HIGH | [Verbal forms](docs/plans/BEHAVIOURS.md) | 2–3 | A type name read as a structure, a verb chosen with the parse's context, and a clause carried as far as its condition | — |
| HIGH | [Sense disambiguation](docs/plans/SENSE_DISAMBIGUATION.md) | 3 | The enclosing declaration and the file's pooled domain as context, and the resources that label only a word's specialist senses. **The out-of-domain reading gives it a list of concrete failures to be judged against**: on Tika, `pipe` 1,312 carries `hydraulics` at 10.9% of a scope's divergence, `root` 470 with `log` 491, `stub` 82 and `tree` 114 carry `plants`, `detector` 1,230 carries `electrotechnology`, and `stream` 1,743 carries `geography`. Every one is a word whose sense in code is not the sense the dictionary ranks first, and they are the same shape of defect the term matcher hits from the other side | — |
| MEDIUM | [The taxonomy states more than we read](docs/plans/OLIA_DEFINITIONS.md) | 8 | The 1,271 definitions and 949 provenance notes are extracted, shipped, and now shown — the taxonomy page names every concept the field publishes with what its publisher says it means. What is left is *reading* them, so a concept is matchable by what it means, and OLiA's own annotation modules | — |
| MEDIUM | [The parse](docs/plans/THE_PARSE.md) | 1 | String literals and text blocks, module declarations, the polyglot stage, and how far a parser recovers from a head commit that does not compile | literals need the prose reading |
| **NEXT** | [The words this repository chose](docs/plans/THE_VOCABULARY.md) | 2, 9 | **The ranking works and its cutoff is picked, which is the one thing the doctrine refuses outright.** 250 rows was chosen, and a count is not comparable across repositories, so the panel cannot report a vocabulary until the cutoff means one thing everywhere. **A share of the divergence is not the answer and the measurement says why**: over the published names, 632 words carry a positive claim and 0.2705 bits between them, half the bits sit in 50 words and three quarters in 139, so cutting at three quarters would drop 111 rows — `arxiv`, `fibo`, `json`, `csf`, `hypernym`, `olia`, `skos`, `nist`, `antonymous`, `credence` and `segmenter` among them, every one written 3 to 6 times. A word's term of the divergence scales with how often it was written, so a mass cutoff drops the rarest words first and the rarest words here are the proper nouns of every resource the library reads. **The derived cutoff is a permutation null over the vocabulary**, the rule this library already applies wherever a winner is declared: `PermutationNull` and `ChanceExpectedBest` need only a new resampling unit, a word where a scope stands today. Four smaller items sit beside it, each measured: a run the dictionary carries whole is split (`collocated` into `col` 14 and `located` 7, `synset` into `syn` 12, and WordNet carries both, so the citation is one the reading already stands on); `classpath` is the first live cost `CitedTokens.NONE` has been shown to carry, at `class` 68 and `path` 73; the prose ranking is led by symbol readings, `a` 3,787 and `s` 589, which needs the population a word was written in rather than a new rule; and the ranking counts `part` 26 and `speech` 16 apart though `CollocatedWords` folds them for every other reading | nothing |
| **NEXT** | [The identifier splitter](docs/plans/THE_SPLITTER.md) | 2 | **The vocabulary ranking says what to widen and in what order, and every item is grammar.** UAX #29 rules WB6 and WB7 state that a letter, an apostrophe and a letter do not break, so the possessive is not two words — `s` is written 589 times in this tree's prose and stands fourth in it. **A run the dictionary carries whole is one word, whatever the frequency list says**: `collocated` and `synset` are broken into `col` 14 with `located` 7 and `syn` 12 with `set`, because `PieceCost` prices pieces against a 20,000-word frequency list and neither run is in it — WordNet carries `collocate` and would refuse the split, and it is the same citation the reading already stands on. A catch parameter is `e` 43 times, and a name a reader cannot read is a parse question rather than a splitter one. And `ab` 24 is a run the segmenter broke rather than refused, which is the one that costs a reading its citation. Also left: byte offsets on every token, and the adjective edge — a run whose first word is an adjective the reading refuses alone, `geometric mean` and `lexical semantics`, is refused with it. **The letter/digit boundary is closed**: UAX #29 states no break between a letter and a digit, so a catalogue is what would override the standard rather than what was needed to obey it | nothing |
| MEDIUM | [The repository read, the store and the first slice](docs/plans/THE_PIPELINE.md) | 1, 9 | The blob as the unit of observation, DuckDB as the system of record, and the first reading of something that is not this repository | — |
| LOW | [The Wiktionary topic hierarchy](docs/plans/WIKTIONARY_HIERARCHY.md) | 3 | Two label spaces that no bundled resource says are one, and 29 labels a root by omission cannot be told from a root by statement | a citation that maps between them |
| LOW | [Visualisation](docs/plans/VISUALISATION.md) | 9 | A concept map laid out by the hypernym tree, and a divergence bar with a real axis maximum | — |
| LOW | [The limits, and the open questions](docs/plans/LIMITS.md) | — | The dead-class half of the resource contract, and four questions each with the measurement that answers it. **It has produced its first live instance**: `PlatformPackages`' javadoc cites `JavaLanguageKeywords` as the precedent it follows, and no such class is in the tree | — |

## What has landed since this list was last true

- **A word English put inside a name is told from a word the author chose, and neither reference could do
  it.** `by` stood **fourth of 843** named words, written 173 times in `massByTopic` and `shareByWord`, and
  both references argued for it: ordinary English writes it at 0.5613% against 2.70% here, and the platform's
  own API at 0.0151%. A preposition is dense in this repository's names and thin in prose, and a reference
  drawn from prose reads that as specialist vocabulary. `FunctionWords` answers it from two bundled resources
  and no list: **a name names a thing, an action, or a property of one** — the noun, the verb and the
  adjective — and a word the dictionary places in none of the three that the frequency list carries is one
  the language supplied. It is a partition and not a gate: such a word keeps the place it earned and is
  printed with it under **What the language supplied**, which is why the ranking's numbering has gaps.
  38 of 843 named words are the language's, 191 of 3,404 across everything written, and the ones inside the
  first 250 places were `by` 173, `from` 70 and `beside` 4.

  **Asking for the adjective is what the change turned on, and the first run measured why.** A topical vote
  asks the dictionary for a noun or a verb, so a first attempt on that coverage handed `broader` 35 — SKOS's
  own relation, seventeenth of the ranking — along with `nearest`, `longest`, `canonical`, `foreign` and
  `distinctive` to the language. Asking all four open classes instead fails the other way: WordNet carries
  `by` as an adverb, `not` and `rather` too, so nothing at all was caught. Noun, verb or adjective is the
  only one of the three that keeps every property this repository named things for and still refuses the
  prepositions, and `adjectiveBase` was the missing third of the lexicon's own contract.

  **The report's own cutoff was measured while this landed, and it is picked.** `./gradlew vocabularyMass`
  prints how the divergence accumulates: the 250 rows hold **89.1%** of it against the 63.4% of *occurrences*
  the summary line quotes, and three quarters of the bits sit in the first 139 words. What the other 111 hold
  is the argument against ever cutting on mass — they are the words written three to six times, which is
  where every resource this library reads is named. [The plan](docs/plans/THE_VOCABULARY.md) states the
  permutation null that would derive the bound instead.

  Two things it does not answer, both measured rather than asserted. **The dictionary is WordNet 3.1 and
  ordinary English has moved**: `wiki` 6, `sql` 4, `login` 2, `api` 1 and `keyword` 1 are in the frequency
  list and in no open class, so the reading calls them the language's — 17 occurrences over 8 words, one of
  them (`wiki`, 168th) inside the first 250 places. And **the prose ranking is still led by symbol readings**:
  `a` 3,787 and `s` 589 stand second and fourth of everything written, because the dictionary carries the
  letters of the alphabet as nouns. `ContentWords` already states the rule that answers it — a one- or
  two-letter word nothing chose is a symbol reading — but it is a rule about *prose*, and applying it here
  needs the population a word was written in rather than the word. `s` is the possessive the splitter broke
  at, so UAX #29 rules WB6 and WB7 close it at the other end.

- **The words this repository chose are ranked, and three of the things crowding the top were not words it
  chose at all.** [`output/vocabulary.md`](output/vocabulary.md) ranks every word of every declared name by
  its term of the Jensen–Shannon divergence against two references that state their own contents: the bundled
  frequency list read as ordinary English, and the type names the running platform declares in the packages
  it exports, taken from `ModuleFinder.ofSystem()` and split by the same grammar this repository's names are.
  A word is ranked by the **weakest** claim any reference makes for it — pooling the two would need a weight
  nothing states, the weakest claim needs none — and nothing is excluded, since a word a reference writes
  more densely sorts last carrying a negative claim. The table beside the ranking is the argument: `of` is
  written 179 times and stands 822nd, `entry` 54 times and 310th, `file` 49 times and 635th, while `word`,
  `topic`, `sense`, `concept`, `occurrences`, `rung`, `lemma`, `divergence` and `legibility` stand
  where a reader would put them.

  **The platform reference does the job it was built for, and `./gradlew wordPlace -Pwords="get set list"`
  is how to check it on any word the report never reached.** `get` is never written as a name in this tree
  at all. `set` 19, `value` 26, `map` 3, `object` 3, `list` 1 and `string` 1 are all written more densely by
  the platform's own API than by this repository, so each carries that reference's claim as a negative and
  stands past 670th of 838 — where ordinary English alone would have argued *for* five of the six, since a
  frequency list of English finds `map` and `value` specialist. Neither reference could have done it alone.

  Three defects it found on its first run are closed. **A doc comment is written in HTML**, so `<p>`, `<em>`
  and `<b>` were arriving as the words p, em and b — 778 occurrences of markup read as prose, and a lone `p`
  is a word to a resource that labels every letter of the alphabet. **A package was read once per file**,
  which weighted a naming decision by how big the package grew and put this project's own coordinate into
  every file: `semantics` 275 times, one per Java file, against 30 packages. And **an import is read only in
  a source set the build publishes**, because `junit`, `assertj` and `j2html` are what the repository is
  checked with, not what it is about — the same position rule the reading already uses for a declaration
  against a use. λ moved from 0.984 to 0.992 as the toolchain and the markup left the corpus.

  What the ranking still shows in its own top hundred is the next work, and every remaining item is a
  splitter or a parse question rather than a vocabulary one: `s` 589 in the prose from the possessive that
  UAX #29 rules WB6 and WB7 say is not a break at all, `e` 43 from a catch parameter, `col` 14 and `syn` 12
  where the segmenter broke `collocated` and `synset` into pieces it could price, and `ab` 24 where it broke
  a word it could not read whole. `by` 173 has left the list — it was neither, and the entry above says what
  answered it. A test source set's names
  are ranked apart from a published one's, because a test names the behaviour it checks in whole English
  sentences: 11,711 name-word occurrences are in a source set nothing is published from against 6,367 in one
  that is, and `test`, `a`, `its` and `every` stand in that ranking's top twenty where the
  published one's holds none of them above two hundredth.

- **Javadoc's own syntax was being read as the author's prose, and is not any more.** `JavadocProse` reads a
  javadoc through the parser's own model of it. A block tag's name is Javadoc's rather than a word about a
  subject — Tika writes `@param` 2,768 times, `@return` 1,430 and `@throws` 746, and `return` is a word about
  finance to a topical resource. A `@param` tag's name is the parameter, already read where it was declared.
  And what an inline tag points at is a **use** of something declared elsewhere, so `{@link}` 1,729 and
  `{@code}` 2,195 leave with it — the one rule the whole reading turns on, arriving inside prose for the
  first time. No tag list is kept here; Javadoc's structure is what says which part is which.

- **Depth was the next thing to run and it points the other way.** `StatedDepth` counts the rungs a publisher
  states between a concept and the root of its branch, bounded by the deepest chain the source states, and
  `DepthReport` puts what the branch rule admitted beside what it refused. The reading being tested was that
  a term meaning something to a field sits deep in that field's hierarchy and an ordinary English word the
  field happens to have claimed sits near a root. What the branch refused is deeper than what it admitted on
  both trees — 3.22 rungs against 2.21 here, 3.43 against 2.86 on Tika — and the out-of-domain member matches
  deeper than the in-domain one, 2.70 rungs per span against 2.16, so a depth weight would have raised the
  reading it was meant to lower. Tika's deepest rung is 15.2% of the reading and holds `Result` 836, `URL`
  285, `Example` 115, `Book` 46, `Movie` 29, `Album` 21, `PhoneNumber` 7 and `EmailAddress` 2, with no term
  of the field among them. OLiA's long chains are its discourse relations and its named entities, both
  spelled in ordinary English, and the morphosyntax a program actually declares stands one rung down because
  OLiA states no named parent for it. `PinnedTermFindings` holds the refutation and the stated abandon
  criterion is met, so depth votes on nothing.

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

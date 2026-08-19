# Every signal through one pipeline, to a subject the caller chooses

Three kinds of signal are read from a repository and only one of them reaches a subject. This plan states where each stops, what is lost on the way, which matches fail and why, and the order the repairs are to be taken in. Every figure is a reading of a named commit.

The export figures below are `output/json/reading.json` at `e9c4cda`. The probe figures are quoted at the commits the plans that produced them state — `cb91e65` for the placement table, `27976cf` for the phrase arm's first probe, `157d348` for the reach census.

## Where each arm stops

| Arm | What produces it | Reaches a subject | What the export carries |
|---|---|---|---|
| Words | `ChosenWords`, scored against English and the platform | **yes** — the senses of the words become a `TopicDistribution`, and `PlacedField.ofArxiv` places that | 237 signals, each with `divergenceBits` and `occurrences` |
| Nominal phrases | `CorroboratedReading` against OLiA and CSO | **no** | 172 concepts, each with `specificity`, and no subject |
| Verbal phrases | `Behaviours`, then `ExportedBehaviours` | **no** | 319 clauses, each with `occurrences`, and nothing else |

**The export states a placement under each taxonomy and it is the words arm's answer copied in.** `ExportedReading.of` passes one `PlacedField` to every `ExportedTaxonomy`, so `taxonomies[0].placement` and `taxonomies[1].placement` are identical to the last digit, and a consumer reading `OLiA … Computation and Language` will take it for the concept arm's result. Nothing the concept arm matched contributed a bit to that figure.

**The behaviour reading is computed twice and consumed once.** `ThemeReading.of` calls `Behaviours.in` and `RepositoryThemes` carries the result; no caller in the tree reads the accessor. `ExportedReading` then builds its own list through `ExportedBehaviours`, which reads the parsed files a second time. The first reading is dead and the second is unscored.

**`PlacedField` states one factory, `ofArxiv`.** `OpenAlexTopics` is bundled at 4,822 rows and no class outside the probes and one lexicon test calls it.

## What works, so that none of it is rebuilt

| What | The figure that says so |
|---|---|
| The parse | 583 files, 0 the parser could not read, 40,856 lines |
| The citation floor | 98.2% of word occurrences carry a citable resource |
| The words arm against arXiv | archive 34.1% against a chance-expected best of 40.6%; category 38.9% against 44.0%; both clear |
| The scope null | 4 scopes of 10 clear a 999-resample permutation null, and 1 is reported as within chance rather than dropped |
| The rung ladder | `NormalisedTerms` reports words, lemmas and senses separately and never sums them; `matchesByNormalisation` ships all three |
| A subject scheme read with no second matcher | `PublishedKeywords` turns each of OpenAlex's 45,154 stated keywords into a concept beneath its topic, so `InjectedTaxonomy`, `InjectedTerms` and `CorroboratedReading` read it unchanged |
| The evidence behind a scope | `evidence.json` carries per-topic `shareOfDivergence`, the carrying words, the mass each holds and a permalinked quotation per witness |

## What is lost

| Where | On this tree | What it is |
|---|--:|---|
| Mass settling on no subject | **75.7%** | three-quarters of what the reading tallies reaches no topic |
| Word occurrences no resource covers | 1,793 | seen, and nothing can be cited for them |
| Words below every threshold | 792 | read, and cut |
| Matches discarded by the branch rule | 62 | and the branch rule and a two-word length rule selected identical spans on all four trees of the phrase probe, so one of the two does no work |
| Behaviours stating no object | 112 of 319 (35.1%) | bare verbs — `read`, `load`, `render` — carrying no subject matter |
| Behaviours scored | 0 of 319 | |
| Concepts placed | 0 of 172 | |
| Reference vocabularies the signals stand against | 2 | `the platform's own API` for 149 signals and `ordinary English` for 88; fifteen resources are bundled |

## Which matches fail, and what each one implies

`./gradlew topicMatch -Ptopic="Semantic Web"` traced one topic keyword by keyword and separated four failures the ranking reports as one bad answer.

| What the trace shows | What it implies |
|---|---|
| `RDF`, `OWL`, `SPARQL` and `Ontology` all match on the narrowest rung, and `Semantic Web and Ontologies` reaches 55th of 357 topics against the placement arm's 1,172nd of 4,499 | phrase matching recovers what flattening lost, and the plan's first claim holds |
| It is beaten 4.5× by `Names, Identity, and Discrimination Research` on one matched keyword, `Names` | mass counts occurrences and never asks what the match was worth. `PhraseSpecificity` is bounded in `[0,1]`, is computed on every sighting, and votes on nothing |
| `Knowledge Representation` is written as that exact run and no rung matched it | a matcher defect. The run is present on both sides and was not found, and nothing else here explains it |
| `Semantic Web`, `Linked Data` and `Schema Matching` are written word by word and never adjacent | the run is split across a type and its member, and nothing reads a run across a declaration |

Four further failures are measured and recorded:

- **Multi-word matching barely exists.** 4 spans on this repository, 9 on Santuario, 34 on Tika, against 45,154 published keywords. The binding constraint is how rarely a declared name spells a keyword its publisher stated, not how a match is weighted.
- **This project's own vocabulary distorts its placement.** `law` is the sixth-largest topic here, carried by `file`, `witness`, `summary`, `claim`, `verdict`, `cite` and `evidence` — words chosen to describe the machinery. `telecommunication` is 61.6% `file`. Both produce dictionary labels that subject descriptions also produce, and neither can distort a match on the words themselves.
- **OpenAlex does not clear its null off this tree.** On Apache Tika the best of 4,516 chance subjects reaches 37.0% against the best real subject's 42.3%. arXiv clears on both repositories. The scheme cannot become the default on the strength of the extraction.
- **Repairs 0, 3 and 4 are measured and all three failed their own abandon conditions.** Repair 3 — assembling a run across a declaration — yields 0 marked keywords here, 0 on Tika and 1 on Santuario. Prose as the repository-side text reaches 11, 12 and 8 and is the largest unrun effect.

## What the JSON does not record

`evidence.json` states eleven keys: `schemaVersion`, `repository`, `files`, `lines`, `topics`, `unplaced`, `elapsedMillis`, `linkage`, `edges`, `scopes` and `filesRead`. That is the themes arm and nothing else.

| Not recorded | Where it exists instead |
|---|---|
| Every term span, its run, the rung that found it, the concept it reached and its specificity | `phraseMatchedSubjects` printing to a console |
| How far each member got towards every published keyword | `keywordReach` printing to a console |
| Which keywords of one topic matched and which did not | `topicMatch` printing to a console |
| Which runs the dictionary could not read, and which words blocked them | `unreadRuns` printing to a console |
| What the 75.7% unplaced mass is, and what refused each part of it | nowhere |
| The subject ranking below the winner | nowhere |
| Any behaviour beyond its phrase and its count | nowhere |

Every finding in [the phrase arm's repairs](PHRASE_ARM_REPAIRS.md) and [placing a repository by the phrases it declares](PHRASE_MATCHED_SUBJECTS.md) reached this backlog because a person copied a console into a markdown table. The measurements are real and the artefact is prose, which is why a figure cannot be re-checked without re-running the probe that produced it.

## The work, in order

### 1. ~~Record the matching in `evidence.json`, and stop the export stating a placement it did not make~~ — landed at `64e1496`

**What changes.** `evidence.json` gains a `matches` section — one entry per term span, carrying the run, the rung, the taxonomy, the concept, the concept's specificity, the occurrences and the file and line — and an `unplaced` section carrying the 1,793 uncovered occurrences and the 792 cut words with the rule that refused each. `ExportedTaxonomy.placement` either carries the arm's own placement or names whose answer it is.

**What it measures.** Nothing. It moves measurements already computed out of a console and into the file, and it is the step every argument below is checked against.

**What settles it.** The four probes above can be answered from `evidence.json` without re-running them, and `reading.json` no longer states a figure under a taxonomy that the taxonomy did not produce.

**What would end it.** The file exceeding what a consumer will open. `scopes[].contributions` was 974,838 bytes before it was narrowed; a spans section on a tree the size of Tika is larger. If it does, the spans go to their own file at their own schema version rather than being cut. **It did not**: `evidence.json` went from 1,303,806 to 2,022,740 bytes.

#### What it found

`reading.json` is schema 6.0 and states no placement under a taxonomy. `evidence.json` is 3.0 and carries `matches` and `setAside`. Read at `64e1496`.

| | On this tree |
|---|--:|
| Term matches recorded | 266 — 196 OLiA, 70 CSO |
| Refused by the branch rule | 98 |
| By rung | 138 words, 80 lemmas, 48 senses |
| Matches of more than one word | 20 |
| Words no bundled resource covers | 482, over 1,815 occurrences |
| Words a reference's own bar refused | 786 |
| Words English supplies | 9 |

**The highest-mass match in the reading is not in the answer.** OLiA's `Topic`, written 288 times at specificity 0.79, is refused by the branch rule because no other concept of its branch is written — on a repository whose second-leading word is `topic`. It was previously visible only inside the count 62.

**Two counts did not reconcile, and both reasons are defects the count concealed.**

`setAside.matchesDiscardedByBranchRule` is 62 and the refusals list 63. `refusedByBranch()` subtracts one reading's size from the other's, so a term the corroborated re-read reaches at a *different rung* nets out of it: `result` is refused at the words rung and admitted at the senses rung. Both are true, both are now recorded, and `TermMatchesTest` pins it.

`setAside.wordsBelowEveryThreshold` is 795 and only 786 are below any threshold. `ExportedSignals` removes words English supplies as well as words below a bar, and the count subtracts the signals from the ranking, so **a figure named for one rule carries two**. The nine are listed separately and the arithmetic reconciles. **The export's field is misnamed and this plan did not rename it** — that is a schema change and the user's call.

**`theLanguages` admits words that are not English holding a sentence together.** The nine are `by`, `from`, `below`, `without`, `keyword`, `keywords`, `alex`, `wiki`. The first four are the rule working. `keyword` and `keywords` are subject matter on a repository that reads published keywords. `alex` and `wiki` are the splitter cutting `OpenAlex` and `Wiktionary`, which is [the splitter's own known gap](../../CLAUDE.md) arriving in a second place. Measuring what that rule costs belongs with the vocabulary reading, not here.

**`MatchedTaxonomies` now states each taxonomy's published concepts, and stating it showed the two disagree.** OLiA reads its own published concept list; CSO derives one from the terms its index carries, so a CSO concept no term reaches sits in no branch. Both are preserved exactly — making them agree moves CSO's reading, which is a measurement.

**The pinned findings are green, including the one the backlog records as failing.** `PinnedThemeFindings` expects `grammar` among the qualified topics and it is there at 3.43%. The cause of its earlier absence was never established, so the movement is unexplained rather than fixed.

### 2. Give the concept arm and the behaviour arm a distribution, and place all three against both schemes

**What changes.** `SubjectPlacement` already takes a `TopicDistribution` and a list of `SkosConcept`, so it is scheme-agnostic and arm-agnostic today. What is missing is a distribution from the other two arms and a second factory beside `PlacedField.ofArxiv`. `AxisEvidenceAccumulator` partitions over a closed enum and cannot hold this; `OpenSpaceAccumulator` is the sibling that can, and it exists.

**What it measures.** Three arms against two schemes, each with its own null, on this repository and on all three evaluation members.

**What settles it.** Each arm clears its own chance-expected best, or is reported as not clearing. The three arms are wrong in different places, by a statistic named before the run — [classifying a repository](CLASSIFYING_A_REPOSITORY.md) chunk 7 already specifies it.

**What would end it.** An arm that clears chance on this repository and on none of the three members is measuring this tree, and it is reported apart rather than combined.

### 3. Weight a match by `PhraseSpecificity`

**What changes.** `WrittenMass` already weighs occurrences by `PhraseSpecificity` inside the `term` package. Nothing downstream of it uses the figure, and every placement figure recorded so far was produced with no phrase weighting at all.

**What it measures.** Whether `SPARQL` outranks `Names` — the probability of superiority over the topics reached, and precision at ten, both reported by `SuperiorityFigures`, against summed occurrence mass.

**What settles it.** It raises the ordering on the held-out members and not only on this tree. Repair 0 failed exactly that condition and is the precedent.

**What would end it.** It behaves as repair 0 did: better here, worse on Santuario and Tika.

### 4. The unexplained matcher defect

`Knowledge Representation` is written as that run and matched by no rung. That is one span to trace, and step 1 makes it traceable from the file.

## What is not scheduled, and why

- **Reading a run across a declaration** — repair 3, built and abandoned on its own evidence. It stays abandoned.
- **Bundling an acronym catalogue for this arm** — measured against OpenAlex and worth nothing: of the 3,365 words WordNet cannot read among 45,154 keywords, not one is a media type or a computing abbreviation.
- **Making OpenAlex the default scheme** — it does not clear its null on Tika. It is placed beside arXiv in step 2 and replaces nothing until it clears.
- **Expanding a keyword into its synonyms** — both sides already normalise to one sense-run key, so it reaches the same pairs by a longer route.

## Two decisions this plan cannot take

**The gold set is still the binding constraint.** [Placing a repository by the phrases it declares](PHRASE_MATCHED_SUBJECTS.md) names it as blocking and it is unanswered: which OpenAlex topic should *this* repository reach. The rank predicate over Apache DOAP category tokens works for the three evaluation members, and this repository publishes no DOAP record, so its rows are printed for contrast and nothing here is judged. The doctrine is *do not mark your own homework*, and it is unmet on this tree.

**`./gradlew read` was recorded as red and is now green, with the cause still unestablished.** `PinnedThemeFindings.readsThisRepositoryAsTheFieldItWorksIn` expects `grammar` among the qualified topics; it left, and at `64e1496` it is back at 3.43%. What moved it either way is unmeasured, and the reading offers no way to ask. Deciding whether to close the backlog row or keep it as an unexplained movement is the user's call.

## Housekeeping found while taking stock

`.claude/.cc-writes` directories have been created inside `code-semantics-engine/src/main/resources`, `code-semantics-engine/src/test/resources`, `lexicon-extraction/src`, `docs/plans` and `OpenAlex`. They are ignored by git and they sit inside resource roots, so they are copied into `build/resources/main` and `build/resources/test`.

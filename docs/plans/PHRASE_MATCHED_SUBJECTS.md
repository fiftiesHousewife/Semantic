# Placing a repository by the phrases it declares

The placement compares two distributions over roughly 460 dictionary topic labels. Both sides are flattened into those labels before anything is compared, and the flattening is lossy enough to invert the answer. This plan is the second arm: match the runs of words a repository declares against the runs of words a subject scheme publishes, weigh each match by how much it narrows the subject, and report it beside the placement rather than inside it.

**Nothing here is built yet.** What follows is the state that opened it, the machinery that already exists, and the questions that must be answered before the design is written. Every figure is a stated finding at a named commit with the command that reproduces it.

## The measurement that opened it

`./gradlew functionalPlacement -Ptaxonomy=<path>` at `cb91e65`, both schemes against both repositories:

| Repository | Scheme | Subjects | Nearest subject | Divergence | Best chance subject | Clears chance |
|---|---|--:|---|--:|--:|---|
| This library | arXiv | 152 | Computation and Language | 39.8% | 44.9% | yes |
| This library | OpenAlex | 4,516 | Authorship Attribution and Profiling | 37.2% | 42.7% | yes |
| Apache Tika `43cbdae6` | arXiv | 152 | Computation and Language | 42.2% | 46.4% | yes |
| Apache Tika `43cbdae6` | OpenAlex | 4,516 | Personal Information Management and User Behavior | 42.3% | 37.0% | **no** |

**The worked example is the whole argument.** This repository declares `RdfXml`, `OwlClass`, `OwlClasses` and `SparqlEndpoint`. OpenAlex's `Semantic Web and Ontologies` describes itself as *"ontology development … Linked Data, RDF, OWL, schema matching, SPARQL, and knowledge representation"*. Four literal hits, and the placement ranks it **1,172nd of 4,499** — behind *Medical Research and Practices*. It loses because its dictionary-topic profile leads with `law` and `programming`, while this repository's reading is dominated by `linguistics`, so any linguistics-flavoured description wins whatever it is about. `./gradlew functionalPlacement -Ptaxonomy=lexicon/src/main/resources/openalex-topics.tsv -Pheld=4600` prints the full ranking.

For contrast, `Natural Language Processing Techniques` ranks 4th, `Advanced Software Engineering Methodologies` 58th, `Information Retrieval and Search Behavior` 310th and `Software Engineering Research` 923rd.

## Why a phrase arm and not a repaired placement

**The two largest known artefacts in this repository's reading cannot reach a phrase match.** Across all 4,516 OpenAlex topics — 45,154 keyword occurrences and roughly 226,000 description words — the words carrying `law` and `telecommunication` here appear **zero times as keywords** and are negligible in prose: `evidence` 13, `findings` 12, `rule` 8, `citation` 4, `file` 4, `entry` 4, `claims` 2, `record` 2, and `claim`, `witness`, `verdict`, `cite`, `finding`, `summary`, `settle`, `note` at zero.

Those artefacts are large. `law` is the sixth-largest topic on this tree, spread over 236 carrying words with no majority holder — `file` 11.1%, `witness` 8.6%, `summary` 7.9%, `claim` 6.8%, `verdict` 6.3%, `cite` 5.1%, `evidence` 4.7% — and five of those are words this project chose to describe its own machinery. `telecommunication` is 19 carrying words of which `file` is 61.6% and `entry` 26.8%. Both distort the placement, because the dictionary labels they produce are labels OpenAlex descriptions also hit. Neither can distort a match on the words themselves. `./gradlew topicCarriers -Ptopics="law telecommunication"` reproduces both.

## What already exists, so that nothing is rebuilt

| Class | What it does | Where |
|---|---|---|
| `TermSpans` | takes the longest term at each position of a name, left to right, no two matches overlapping | `engine/term` |
| `NormalisedTerms` | reduces both sides to words, to dictionary forms, or to synsets, and **reports each rung separately** | `engine/term` |
| `PhraseSpecificity` | `1 - Π(1 - sᵢ)` over a run. Bounded in [0,1], equal to `WordSpecificity` at one word, rising with every word added | `engine/term` |
| `WrittenMass` | weighs occurrences by `PhraseSpecificity` | `engine/term` |
| `CorroboratedTerms` | accepts a single-word match only where the repository writes another concept from the same branch | `engine/term` |
| `InjectedTaxonomy` | reads a taxonomy from a file exactly as a bundled one, so a candidate is measured by the reading that would bundle it | `engine/theme` |
| `SubjectNull` | keeps field size, samples a real description's length per draw, fills it from the pooled vocabulary of every description, and sets the bar at the chance-expected best | `engine/theme` |
| `OpenAlexTopics` | the bundled scheme: 4,798 rows, 4 domains, 26 fields, 252 subfields, 4,516 topics, each topic carrying its description and its ten keywords as the definition | `lexicon` |

**Two findings about that machinery decide the shape of this plan.**

`PhraseSpecificity` is referenced in `RecordedSpans`, `TermTally`, `TermReading` and `WrittenMass` — **all four in the `term` package, and none in `theme`**. Steps 3 to 7, which is everything the placement runs on, use only `WordSpecificity`, one word at a time, in `OfferedWords`. Every figure in the table above was produced with no phrase weighting at all.

`PhraseTopics`, which is the placement's own phrase handling, scores by the **geometric mean** of the agreeing words. That is a sound disambiguation device and it runs the opposite way to phrase specificity: a two-word name where one word is vague scores below the confident word alone.

## Synsets on phrases: measured, and worth about a twentieth

`SenseRuns` exists and `TermRung.SENSES` is wired. [Reaching the subject a repository is about](RELEVANT_SUBJECTS.md) already measured it on this tree: **121 spans over 20 concepts, 99.2% of them one word long**. It was built to let `nominal phrase` meet `noun phrase`, and that case almost never fires.

The reason is coverage, and it is now measured against OpenAlex rather than against a term taxonomy. Of OpenAlex's keywords:

| | distinct | occurrences |
|---|--:|--:|
| keywords | 27,206 | 45,154 |
| multi-word | 22,505 | 33,985 |
| published as a collocation by the two bundled topical resources | **1,025 (4.6%)** | **2,671 (7.9%)** |

The runs that land are general English — `sustainable development`, `quality of life`, `artificial intelligence`, `data mining`. The runs that matter do not: `word sense disambiguation`, `knowledge representation`, `dependency parsing`, `natural language processing`, `schema matching`, `data integration`, `named entity` and `text mining` are all absent, while `machine translation`, `information retrieval`, `part of speech` and `description logic` are present. The figure is a lower bound, because WordNet's own multi-word entries could not be read from inside the agent sandbox.

**This kills synsets as the mechanism and does not touch phrase matching.** A synset match on a run needs the dictionary to hold the run; for about 95% of these it does not, and `SenseRuns` then falls back to matching lone words by sense, which is where the noise is. But `CollocatedWords` requires a published collocation because in the theme pipeline nobody has vouched for the run — and in term matching **the source is the publisher of its own run**. OpenAlex stating `Word Sense Disambiguation` as a keyword is a citation that the run is a unit, so matching it against a declared name needs no dictionary at all.

So: keep the sense rung, **refuse it on lone words**, and report it apart. Refusing a one-word sense match is a length rule rather than a vocabulary list, which is grammar and permitted, and the precedent is in the tree — `SenseRuns` was found to be missing the length rule `LemmaRuns` applies, which is how `id` reached CSO's `ids` through WordNet's psychoanalytic noun, and adding it stopped 778 spans of Tika voting. Expect the rung to be worth 5 to 8%, and drop it if it earns less.

## The blocking question: what is the right answer

**Nothing below can be judged until this is answered, and it cannot be answered afterwards without goal-seeking.**

| Question | What would settle it |
|---|---|
| Which OpenAlex topic should this repository reach? | Written down before the run. Candidates the tree already surfaces: `Natural Language Processing Techniques`, `Semantic Web and Ontologies`, `linguistics and terminology studies`. State one, or state the set and the rule for a hit |
| Which should Apache Tika reach? | Its stated domain is the Apache DOAP category token `content`. **No publisher has mapped that token to an OpenAlex topic.** Either find a stated mapping, or record the expectation before running and say plainly that it is ours |
| Is one evaluation repository enough? | It is not. Either a second member is named and fetched first, or the plan states that the arm is being decided on Tika alone and accepts what that is worth |

The doctrine is *do not mark your own homework*, and it is currently unmet for OpenAlex on both repositories.

## The questions the design must answer

### Which text, on each side

| Question | The measurement |
|---|---|
| OpenAlex side: keywords, description, or both? | Run the arm three ways. Ten high-specificity noun phrases per topic and 50 words of prose will not behave alike. `definition` currently holds them joined, because they were joined for the placement arm |
| Repository side: declared names only, or prose as well? | Declared names are the doctrine-clean side — *read declarations, not uses* — but prose is 72% of what the reading has, and `document processing` appears in Tika's prose and never in its identifiers. **Expect this fork to move the result more than everything in the next two sections combined** |
| The shared frame — all 4,516 descriptions open *"This cluster of papers focuses on…"* | Does `PhraseSpecificity` already reduce it to nothing? If yes, no rule is needed. If no, stripping it is a hand rule and needs separate justification |

### What the score is, and what bounds it

| Question | Why it blocks |
|---|---|
| One share or two? | `WrittenSubtree` already learned that one share lets a single concept carry a branch. The natural pair, each bounding at 1 by its own definition: of the topic's terms, the specificity-weighted share this repository declares; of this repository's vocabulary, the specificity-weighted share the topic states |
| Occurrences or distinct concepts? | `WrittenMass` weighs occurrences by `PhraseSpecificity`; `TaxonomyTree` counts spans. Pick one and state why |
| Does the rung weight the match? | Already a stated next step in [Reaching the subject a repository is about](RELEVANT_SUBJECTS.md): the derived weight is the share of a source's terms a rung keeps as distinct normal forms, which `NormalisedTerms.normalForms` already counts |

### The null

| Question | The measurement |
|---|---|
| What is shuffled? | `SubjectNull` shuffles which words describe which subject. The analogue here is shuffling which keywords belong to which topic, keeping field size and per-topic keyword counts. Confirm that is the right invariant, or permute the repository's declared names instead |
| Does the chance-expected best still hold at this size? | `ChanceExpectedBest` sets the bar at the `1/(n+1)` quantile. It has never been used on a field of 4,516 |

### Where the arm sits

| Question | Why it blocks |
|---|---|
| Does it feed step 5, or stand beside it? | Step 8 currently feeds nothing — *"Nothing from this step feeds step 5"* — and changing that moves every reported figure |
| Are the two arms independent, and by what statistic? | [Classifying a repository](CLASSIFYING_A_REPOSITORY.md) chunk 7 already specifies *"whether it is wrong in different places"*. Name the statistic before the run, not after. **Chaining the arms destroys this measurement**, which is why the placement must weight the phrase arm rather than filter its candidates |
| Does OpenAlex stay bundled? | `openalex-topics.tsv` ships at 3.2 MB and no reading calls `OpenAlexTopics`. It passes `BundledResourceReachabilityTest` on the letter of that test and not on what the test exists to prevent. Either this arm adopts it or it moves out of `lexicon/src/main/resources` |

## The baselines it must beat

[The semantic analysis reference](../reference/SEMANTIC_ANALYSIS.md), Part VI, states the rule this arm is most likely to fail: *"If you ship a graph ranker without measuring it against FirstPhrases and TF-IDF on your own data, you have established nothing."* On Inspec, plain TF-IDF at 28.37 / 35.00 beats every graph method, and taking the first phrases in the document beats TopicRank at F@10.

| Baseline | Why it is the bar |
|---|---|
| TF-IDF over the description text | beats every graph keyphrase method on Inspec, and is cheap |
| BM25 over the description text | BEIR established that BM25 outperformed most dense retrievers, and that dense retrieval must be measured out-of-domain — which is the Tika case exactly. Already named as a chunk 5 baseline over the README |
| The placement arm itself | the four rows at the top of this document |

**Calibrate the expectation before running.** SciPrompt reports **22.28% zero-shot accuracy over 53 arXiv subcategories**. On EURLEX57K's 4,271 EuroVoc labels, BERT-BASE reports RP@5 of **0.835 on frequent labels and 0.028 on zero-shot labels**, recovered to 0.438 only by the architecture that reads the label's own descriptor. This arm attempts 4,516 topics with no training data at all, and reads the label's own descriptor, which is the one thing that recovered anything there. The honest bar is *better than TF-IDF and BM25 on our own data*, not *right*.

**Annif** is the architectural precedent already recorded: a harness over many weak indexers with an ensemble on top, evaluated against a gold set. That makes the gold set the binding constraint rather than an afterthought, which is why it is the blocking question above.

## What settles it

| Claim | The measurement |
|---|---|
| Phrase matching recovers what flattening lost | `Semantic Web and Ontologies` reaches the top ten on this repository, from 1,172nd, on `RdfXml` to RDF, `OwlClass` to OWL, `SparqlEndpoint` to SPARQL |
| It is not reading generic academic English | it clears its own null, and *Medical Research and Practices* falls |
| It works off this tree | Apache Tika reaches a document, format or text topic **and clears its null**, which the placement does not |
| It beats the cheap baselines | against TF-IDF and BM25 over the same descriptions, on both repositories |
| The two arms are worth combining | they are wrong in different places, by the statistic named before the run |

**Abandon if** row three fails while row one holds: an arm that only works on the repository it was written for is measuring this tree, and the work then belongs in what is admitted rather than in how it is matched.

**Abandon if** row four fails: if TF-IDF over the descriptions does as well, the phrase machinery has bought nothing and the honest answer is to ship the baseline.

## Order

1. **Answer the blocking question.** Write down the expected topic for both repositories, and decide whether a second evaluation member is named first.
2. **A `diagnostic` probe, printed and eyeballed before anything votes** — the phrase arm and the placement arm side by side for both repositories, following how route 1 is sequenced in [Matching only where the placed subject holds](SUBJECT_CONDITIONED_MATCHING.md).
3. **The two baselines**, TF-IDF and BM25 over the same descriptions, in the same probe.
4. **The null**, once the score is fixed.
5. **The independence statistic**, and only then any combination.

## References

Both of these belong in Part VI of [the semantic analysis reference](../reference/SEMANTIC_ANALYSIS.md) and are not yet there.

| Work | Why it bears on this |
|---|---|
| Justeson, J. S. and Katz, S. M. (1995), *Technical terminology: some linguistic properties and an algorithm for identification in text*, Natural Language Engineering 1(1), 9–27 | The part-of-speech pattern for multi-word technical terms. It matters more here than anywhere else in the literature because it is a **published grammar rather than a word list**, which is what this project permits and what a stop list is refused for. It is how candidate phrases come out of prose without curating anything, and C-value depends on it |
| Metzler, D. and Croft, W. B. (2005), *A Markov random field model for term dependencies*, SIGIR | The sequential dependence model: bag-of-words evidence combined with ordered and unordered phrase evidence under one stated weighting, which is the arm-combination question with a published answer rather than an invented one |

**C-value / NC-value cannot be adopted**, although it is the canonical answer to weighting a phrase by its length. The reference doc already records why: it uses a 229-word stop list built by hand from a one-tenth sample of the corpus it then scores, and reports only relative precision. Hand vocabulary drawn from the scored corpus is refused twice over here. `PhraseSpecificity` has the same length property and derives it from a published frequency list.

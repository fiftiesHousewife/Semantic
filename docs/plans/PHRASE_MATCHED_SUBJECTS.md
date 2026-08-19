# Placing a repository by the phrases it declares

The placement compares two distributions over roughly 460 dictionary topic labels. Both sides are flattened into those labels before anything is compared, and the flattening is lossy enough to invert the answer. This plan is the second arm: match the runs of words a repository declares against the runs of words a subject scheme publishes, weigh each match by how much it narrows the subject, and report it beside the placement rather than inside it.

**Step 2 is built and run; nothing votes on it.** What follows is the state that opened it, the machinery that already exists, the questions that must be answered before the design is written, and — at the end — what the first probe found. Every figure is a stated finding at a named commit with the command that reproduces it.

## The measurement that opened it

`./gradlew functionalPlacement -Ptaxonomy=<path>` at `cb91e65`, both schemes against the two repositories read at the time. `maven` and `santuario` were cloned afterwards and have no row here yet:

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
| Which should each evaluation member reach? | Their stated domains are the Apache DOAP category tokens `content`, `build-management` and `security`. **No publisher has mapped any of those tokens to an OpenAlex topic.** Either find a stated mapping, or record the expectation before running and say plainly that it is ours |
| Can the expectation be a predicate rather than a name? | **The option worth deciding between, because it needs no topic to be picked here.** State the expected result as a rank: do the OpenAlex topics whose own description states the member's DOAP token outrank the topics that do not? Apache publishes the token, OpenAlex publishes the description, and this project chooses no winner. It is still a choice — *which* predicate — so it is recorded before the run like any other |
| ~~Is one evaluation repository enough?~~ | **Answered.** Three members are cloned and pinned: `tika` (`content`), `maven` (`build-management`), `santuario` (`security`). `maven` is the member with no text in its subject matter, which is what a text-extraction toolkit had to be separated from |

The doctrine is *do not mark your own homework*, and it is currently unmet for OpenAlex on this repository and on all three evaluation members.

## The questions the design must answer

### Which text, on each side

| Question | The measurement |
|---|---|
| OpenAlex side: keywords, description, or both? | Run the arm three ways. Ten high-specificity noun phrases per topic and 50 words of prose will not behave alike. **The bundled file cannot currently answer this.** `OpenAlexTopic.subjectMatter()` joins the description and the keywords with a bare space — `…growth of continental crust. Zircon, Geochronology, Tectonics, …` — so `definition` holds one string and the keywords cannot be read back out except by a hand rule about where the last sentence ends. Splitting the fork needs the snapshot in `OpenAlex/` re-extracted with the keywords in their own column, which is a change to `OpenAlexTopicsExtraction` and the eight-column shape, not to this arm |
| Repository side: declared names only, or prose as well? | Declared names are the doctrine-clean side — *read declarations, not uses* — but prose is 72% of what the reading has, and `document processing` appears in Tika's prose and never in its identifiers. ~~Expect this fork to move the result more than everything in the next two sections combined~~ — **the reach census refutes this**: prose reaches 11, 12 and 8 of the marked topics' keywords on the three members, against 3, 30 and 73 for the non-adjacent run. See [the phrase arm's repairs](PHRASE_ARM_REPAIRS.md) |
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
| It beats the cheap baselines | against TF-IDF and BM25 over the same descriptions, on this repository and all three evaluation members |
| The two arms are worth combining | they are wrong in different places, by the statistic named before the run |

**Abandon if** row three fails while row one holds: an arm that only works on the repository it was written for is measuring this tree, and the work then belongs in what is admitted rather than in how it is matched.

**Abandon if** row four fails: if TF-IDF over the descriptions does as well, the phrase machinery has bought nothing and the honest answer is to ship the baseline.

## Order

1. **Answer the blocking question.** Write down the expected result for this repository and for each of the three evaluation members — either a named topic per member, or the rank predicate above. The second half of this step, naming further members, is done.
2. **A `diagnostic` probe, printed and eyeballed before anything votes** — the phrase arm and the placement arm side by side for all four trees, following how route 1 is sequenced in [Matching only where the placed subject holds](SUBJECT_CONDITIONED_MATCHING.md).
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

## What the first probe found

Read at `27976cf` plus the changes in this working tree, which are not yet committed. Reproduce with `./gradlew phraseMatchedSubjects -Ptoken=<DOAP category> -Dcs.clone.dir=<clone>`.

### The expected result, recorded before the run

The expectation is a rank rather than a named topic: **do the OpenAlex topics whose own account states the member's Apache DOAP category token outrank the topics that do not?** Apache publishes the token, OpenAlex publishes the account, and this project names no winner. `StatedDomainToken` holds the rule — a topic meets the expectation where it states every word of the token, matched on whole words so `contentious` does not count as `content`.

The statistic is the **probability of superiority**, the Mann–Whitney U statistic over the two groups, which an ROC curve reports as its area. It is bounded in `[0, 1]` because it is a probability and its chance value is exactly 0.5, both by definition rather than by choice. `ProbabilityOfSuperiority` computes it on midranks, so the several thousand topics tied at zero are counted as ties instead of taking whatever order the sort gave them.

This repository is **not judged**. It publishes no DOAP record, and it is the tree the reading was developed against; its row is printed for contrast only.

### What the arm reads

`PublishedKeywords` turns each of OpenAlex's 45,154 stated keywords into a concept beneath the topic that publishes it, so the existing term matcher reads a subject scheme with no second matcher written. A keyword several topics state yields one concept per topic. Nothing new matches: `InjectedTaxonomy`, `InjectedTerms` and `CorroboratedReading` are unchanged.

### The result

| Repository | Token | Topics stating it | Every match | Corroborated | Runs of 2+ words |
|---|---|--:|--:|--:|--:|
| Apache Santuario `6e978eea` | `security` | 151 | **0.596** | **0.515** | **0.515** |
| Apache Tika `43cbdae6` | `content` | 48 | 0.451 | 0.485 | 0.485 |
| Apache Maven `7ff92c68` | `build-management` | **0** | undefined | undefined | undefined |
| This library (not judged) | `content` | 48 | 0.471 | 0.497 | 0.497 |

**Santuario clears chance on every reading and its corroborated ranking is right.** Its top two are `Web Application Security Vulnerabilities` 31.22 and `Cryptographic Implementations and Security` 15.88, which is a correct placement for an XML security library and one the arm was not built against. This is the plan's row three — it works off this tree — and it is the first evidence the arm reads anything.

**Tika does not clear chance on any reading**, and its corroborated top is `Advanced Data Storage Technologies` 35.47, then `Handwritten Text Recognition Techniques` 9.00.

**Maven's expectation cannot be evaluated, and that is a finding about the scheme.** OpenAlex states `build` in **zero** of its 4,516 topic accounts, against `management` in 798. A taxonomy of research literature publishes no topic about software builds, so the arm has nothing to be right or wrong about. That is the plan's own *no taxonomy applies* outcome, reached for a member rather than assumed, and `ProbabilityOfSuperiority` refuses to report a number rather than returning a weak one.

### Three findings that decide what happens next

**The multi-word match, which the plan called the signal, barely exists.** Runs of more than one word: 4 spans on this repository, 9 on Santuario, 34 on Tika. Against 45,154 published keywords. The arm's binding constraint is not how a match is weighted but how rarely a declared name spells a keyword the publisher stated.

**The branch rule and the length rule select the same spans.** *Corroborated* and *runs of 2+ words* are identical in all four runs, to the last figure. One of the two is doing no work here, and which one is a measurement rather than a preference.

**Single-word matches carry nearly all the mass and are noise.** `Names, Identity, and Discrimination Research` tops the every-match ranking on three of the four trees, and this repository's ranking is led by entomology — `Coleoptera: Cerambycidae studies`, `Research on scale insects` — on `Taxonomy`, which the library writes constantly about `TaxonomyTree`. `PhraseSpecificity` does not demote these, because `taxonomy` is a rare word in English and a common one here. This is the defect [The vote](THE_VOTE.md) already names: specificity is measured against English rather than against this author's own rate.

### What is not done, so nothing here is a verdict

The null, the TF-IDF and BM25 baselines, and the independence statistic are all unrun. The plan's own bar is *better than TF-IDF and BM25 on our own data*, and until those two are measured over the same descriptions the arm has cleared nothing but chance, on one member of three.

### The sense rung, measured against OpenAlex rather than against a term taxonomy

**Synset runs were already running.** `TermReading.over` ladders every index — the words themselves, then the dictionary form of each word, then the sense the dictionary carries each word in — and `SenseRuns` offers the whole run to WordNet as one entry before falling back to the senses of its words in order. The figures above are the three rungs pooled. `MatchedTerms.at` splits them:

| Reading | Santuario spans | topics | chance | Tika spans | topics | chance |
|---|--:|--:|--:|--:|--:|--:|
| every match | 128 | 361 | **0.596** | 451 | 863 | 0.451 |
| the words themselves | 62 | 274 | **0.591** | 208 | 714 | 0.455 |
| — runs of 2+ words | 1 | 1 | 0.500 | 14 | 115 | 0.487 |
| the dictionary form of each word | 36 | 66 | 0.516 | 135 | 212 | 0.497 |
| — runs of 2+ words | 3 | 3 | 0.503 | 11 | 12 | 0.499 |
| the sense the dictionary carries each word in | 30 | 75 | 0.509 | 108 | 198 | 0.499 |
| — runs of 2+ words | 5 | 43 | 0.512 | 9 | 10 | 0.499 |

**The sense rung answers about a quarter of all spans** — 30 of 128 on Santuario, 108 of 451 on Tika — so it is not idle, and the earlier reading of it as almost never firing was taken on a term taxonomy rather than on a subject scheme's keywords.

**It is also where nearly all the multi-word matching happens.** On Santuario the words themselves reach 1 run of more than one word; the sense rung reaches 5, and those 5 reach 43 topics. That is the effect a synset run is supposed to have, and it is visible.

**It does not move the ranking.** The words themselves alone score 0.591 against the pooled 0.596 on Santuario, so the two broader rungs together are worth 0.005. On their own each sits within 0.02 of chance, and on Tika every rung sits between 0.45 and 0.50. Against the plan's own bar — worth 5 to 8%, and dropped if it earns less — the sense rung earns roughly a tenth of that on the one member that clears chance at all.

**The fan-out is why.** 5 spans reaching 43 topics is 8.6 topics per span, against the words rung's 1 span reaching 1 topic. A sense run generalises both sides onto one key, so a single declared name votes for every topic whose keyword shares that key, and the mass spreads over subjects the repository never wrote.

**Expanding a keyword into its synonyms would buy nothing further.** Both sides already normalise to one canonical sense-run key, which is what makes `nominal phrase` meet `noun phrase`; generating the variants instead would reach the same pairs by a longer route and add the precision loss of matching every variant separately.

**What actually caps the sense rung is its abstention rule, and that is the measurable next move.** `SenseRuns` yields nothing where *any* word of the run is unknown to WordNet, which is the correct refusal — half a run of senses would be a comparison this library invented. But declared names are full of `Xml`, `Uri`, `Sha` and `Dom`, so a run carrying one initialism abstains however readable the rest of it is. How many runs are lost that way, and to which words, is a count on the clones already held.

### Supplementing the dictionary with acronyms: measured, and it does not help this arm

`./gradlew unreadRuns`. Of OpenAlex's 45,154 published keyword runs, 35,036 are more than one word, and **`SenseRuns` already reads 87.3% of the multi-word runs**. The scheme side is not what caps the sense rung.

The 3,365 distinct words the dictionary cannot read at all are not acronyms:

| Kind | Words, with the runs each blocks |
|---|---|
| Function words | `and` 259, `of` 257, `to` 54 |
| Scientific prefixes | `bio` 236, `multi` 120, `meta` 65, `geo` 60, `hydro` 41, `chemo` 27, `socio` 21, `trans` 21, `eco` 16 |
| Modern science WordNet lacks | `nanoparticles` 71, `genomic` 64, `covid` 55, `mitochondrial` 33, `convolutional` 25, `nanocomposites` 25, `graphene` 18, `microbiota` 19, `neuroimaging` 17 |

**Not one is a media type or a computing abbreviation.** No `xml`, `http`, `api`, `uri`, `sha`, `json` or `pdf` appears anywhere in the blocking set, because OpenAlex is a taxonomy of research literature and its keywords are materials science and biomedicine. Bundling IANA's registry or a computing abbreviation list against this scheme would buy nothing measurable.

**So the cap is subject-matter overlap, not dictionary coverage.** Both sides can build sense keys; the keys do not coincide, because a Java library writes few runs meaning what a biomedical keyword means. That is a fact about pairing this scheme with this corpus, and no lexical resource repairs it.

**One repair is available and is grammar rather than vocabulary.** A run carrying a function word abstains entirely, which costs 570 runs on `and`, `of` and `to` alone — `quality of life`, `structure and function`. `ContentWords` already refuses function words by citing WordNet's own open-class coverage, so `SenseRuns` skipping them is the rule this library already applies elsewhere rather than a new list.

**The acronym catalogues remain the right answer to a different question.** `tsv` reaching `electronics` through the through-silicon via, and `CitedTokens.NONE` leaving `userid` unsplit, are both live defects a computing catalogue would fix. They belong to [What the author chose](WHAT_THE_AUTHOR_CHOSE.md), not to this arm. **What is still unmeasured is the repository side** — how often a declared run abstains because one of its words is an initialism — and that count is the honest next step before any catalogue is bundled for this reason.

## The worked example: why the expected subject does not win

`./gradlew topicMatch -Ptopic="Semantic Web"`. `FurthestWritten` classifies each published keyword by how far this repository got towards writing it, and `TopicMatchProbe` prints that beside whether any rung matched.

| Published keyword | How far this repository got |
|---|---|
| `Ontology` | **matched**, on the words themselves |
| `RDF` | **matched**, on the words themselves |
| `OWL` | **matched**, on the words themselves |
| `SPARQL` | **matched**, on the words themselves |
| `Knowledge Representation` | written as this run, and no rung matched it |
| `Semantic Web` | every word written, never adjacent |
| `Linked Data` | every word written, never adjacent |
| `Schema Matching` | every word written, never adjacent |
| `Data Integration` | written except `integration` |
| `Description Logics` | written except `logics` |

**The phrase arm reaches the subject the placement arm could not.** `Semantic Web and Ontologies` holds mass 55.94 and ranks **55th of 357 topics reached**, against the placement arm's **1,172nd of 4,499**. Four of its ten keywords match, each on the narrowest rung, and each is a term no other field uses. That is the plan's row one, and it holds.

**It still does not win, and what beats it is one ordinary word.** `Names, Identity, and Discrimination Research` ranks first at 257.20 — four and a half times the mass — on a **single** matched keyword, `Names`, reached through the sense rung. Its other nine keywords are `Discrimination`, `Labor Market`, `Ethnic`, `Hiring`, `Racial`, `Gender`, `Employment`, `Field Experiment` and `Audit Study`, of which this repository writes essentially nothing. A library that declares names for a living matches a subject about personal names, and outscores four specialist hits.

**So the defect is not reach and not the dictionary. It is that mass counts occurrences without asking what the match was worth.** `Names` is common in English and near-universal in code; `SPARQL` is neither. `PhraseSpecificity` is the weight that separates them, it is bounded in `[0, 1]` by the frequency list's own length, and it is computed on every sighting — and the ranking above is summed occurrence mass rather than specificity-weighted mass. This is the same defect [The vote](THE_VOTE.md) records, seen here at the point where it decides the answer.

**Three repairs are now separable, and each has its own evidence.**

| What the trace shows | The repair it implies |
|---|---|
| Four specialist keywords matched and lost to one common one | weight the match by `PhraseSpecificity`, which already exists and votes on nothing |
| `Knowledge Representation` written as that exact run and matched by no rung | a matcher defect — the run is present on both sides and was not found, which nothing else here explains |
| `Semantic Web`, `Linked Data`, `Schema Matching` all written word by word and never adjacent | a naming convention, not an absence: the words are split across a type and its member, so the run exists in the code and not inside one identifier |

The third is the largest and is the one this arm was built to catch. It is not fixed by any lexical resource: it needs the run to be read across a declaration rather than inside a single name, which is the provenance step [What a repository does](WHAT_IT_ACTUALLY_DOES.md) already specifies.

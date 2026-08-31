# One answer, backed off

A reader wants one statement of what a repository is about and one citation for it. The reading currently publishes three unrelated blocks — `summary.about` from the word arm, `summary.placedIn` from the two topic indexes, and `taxonomies` from the term arm — with nothing stating which of them answers, and with the term arm carrying no chance bar at all. This plan makes the export name one answer, taken from the most specific evidence that stands above chance, and report only what stands above chance beneath it.

The design was arrived at by refutation, not by argument: [`PHRASE_EVIDENCE.md`](PHRASE_EVIDENCE.md) records part 3a, which joined the two arms at the **unit** and was measured on the nine evaluation-set members on 2026-08-28. It fell from 33 of 36 level readings standing apart from chance to 22. Joining them at the **answer** is the alternative that the same measurement points to, and the difference is the whole of why this plan exists.

## What a reader gets

| Field | Holds | Bar it must clear |
|---|---|---|
| `answers` | every source that cleared the answering rung's bar, ranked: a vocabulary and the branch it places the repository under (`FIX`, `PreTrade`), else the subjects the topic indexes state (`Computer Science`), else one entry saying nothing qualified | the rung's own, below |
| `aboutStatedBy` | the publisher that stated it, and how many times its count beat its bar | — |
| `taxonomies` | only matches that clear the corpus bar, from vocabularies that clear the permutation bar | both, below |
| `placedIn` | unchanged, and still published whether or not it answered | `standsApartFromChance` |
| `setAside` | how many matches and how many vocabularies fell below, counted and not named | — |

A rung that does not answer is not a rung that was silenced. Every rung's figures stay in the export beneath the answer, which is what keeps the cascade a ranking rather than a gate. `setAside` already carries counts of this shape — `matchesDiscardedByBranchRule` is 67 on this reading — so nothing new is invented to hold them.

## Why the cascade, and not a wider first rung

Three measurements, two of them this project's own.

**A lexicon matcher's published profile is high precision and near-zero reach beyond its lexicon.** In [PARSEME edition 1.2](https://aclanthology.org/2020.mwe-1.14.pdf), Seen2Seen — the one purely lexicon-based matcher, which annotates only expressions its lexicon already states — posts the highest MWE-based precision of any system in either track, 76.2 macro-averaged, with **recall 0.6 on expressions outside its lexicon**, and per-language best F1 tracks the unseen ratio at Pearson −0.90. That is the profile of a first rung and the reason a second is needed: coverage of the lexicon, not cleverness in the matcher, is what moves identification, and no bundle of seven vocabularies will cover an arbitrary repository.

**The term arm separates fields at a strength the word arm never reaches, where it fires at all.** 3b's permutation bar puts FIX at 11.8 times its chance-expected count on quickfixj, the largest figure anywhere in the ten readings, against a word-arm margin of 0.0072 bits for the same repository's arXiv archive. Where the specific evidence exists it is far better evidence.

**And it is wrong often enough that it cannot answer unconditionally.** The same table has FIX clearing on five repositories that are not trading systems, FpML on tika at 5.0, and FIBO on maven. Those are between 1.1 and 5.0 against 11.8 for a vocabulary on its own field, but "exceeds chance" alone does not separate them.

## What the design keeps from the literature

Figures and quotations below were verified against a decoded primary or an accessible full text; where the primary could not be decoded in this environment the route is named and the claim is marked ⚠.

1. **The two bars this design needs are the field's own two questions, and they have standard names.** [Kageura and Umino 1996](https://www.jbe-platform.com/content/journals/10.1075/term.3.2.03kag) (*Terminology* 3(2):259–289) named **unithood**, "the degree of strength or stability of syntagmatic combinations and collocations", and **termhood**, "the degree to which a stable lexical unit is related to some domain-specific concepts". Both definitions are quoted verbatim in [Wong, Liu and Bennamoun 2008](https://ar5iv.labs.arxiv.org/html/0810.0139) and in [Tran et al. 2025](https://arxiv.org/html/2502.17278v1), each carrying the same bibliographic entry; ⚠ the 1996 paper itself is behind a publisher paywall and was not decoded here. This library already answers unithood by citation — `PublishedPhrases` merges a run only where a publisher states it — and has never asked the second question at all. **The corpus bar below is termhood, under its published name.**
2. **Termhood against a general corpus is the standard construction.** Tran et al. state it directly: "Termhood-based statistical measures function on a presumption that a term's relative frequency will be higher in domain-specific corpora than in the general language." That is exactly the comparison [`reference-corpus-shares.tsv`](../../reference-corpus/src/main/resources/reference-corpus-shares.tsv) already makes for single words, extended to runs. The bounded form matters: `PHRASE_EVIDENCE.md` refuses Weirdness ([Ahmad et al., TREC-8](https://trec.nist.gov/pubs/trec8/papers/surrey2.pdf)) because its ratio has no derived maximum, and the repair is the one the word arm already took — a share and a rank, not a ratio.
3. **Backoff is the arithmetic, and it is already cited in this project.** Katz backoff, through [Goodman](https://arxiv.org/abs/cs/0108005): the higher-order unit answers where it has a count, and the lower order receives exactly the discounted mass. `PHRASE_EVIDENCE.md` cites it for the unit; this plan applies the same shape to the answer. **The distinction is what 3a measured.** Backing off at the unit is subtractive — a merged run that votes nothing removes evidence the word arm was using, and the published subject descriptions lost `machine_learning`, `natural_language_processing` and `programming_languages` along with it. Backing off at the answer removes nothing.
4. **Answering at a coarser grain rather than forcing the finest is published practice, and its failure mode has a name.** Hierarchical classification distinguishes mandatory from **non-mandatory leaf-node prediction**, where "for at least one input, its most specific class is not required to be a leaf node in the taxonomy"; and "when the classification stops at an internal node while an oracle would keep propagating the current input downwards, then the **blocking** problem arises" ([Cesa and Armano 2016](https://ar5iv.labs.arxiv.org/html/1611.01080)). ⚠ The canonical survey is [Silla and Freitas 2011](https://kar.kent.ac.uk/30773/) (*Data Mining and Knowledge Discovery* 22(1–2):31–72), whose own PDF could not be decoded here. **Blocking is this design's named hazard** and §"Open questions" states the measurement for it.
5. **Backing a sparse specific class off to a denser general one is measured to help.** [McCallum, Rosenfeld, Mitchell and Ng 1998](https://publications.ri.cmu.edu/improving-text-classification-by-shrinkage-in-a-hierarchy-of-classes/) (ICML 1998, pp. 359–367) smooth "parameter estimates of a data-sparse child with its parent in order to obtain more robust parameter estimates", reporting "a reduction in error up to 29% over the traditional flat classifier". The mechanism is not adopted — this library estimates nothing from labelled examples — but the result establishes that the sparse-specific/dense-general trade is real and worth taking in that direction.
6. **Abstention is an optimal decision with a stated cost, not a shortfall.** [Chow 1970](https://arxiv.org/pdf/2101.12523) is the origin of the **reject option**: "The goal is to minimize the expected loss equal to the cost of misclassification, when the classifier predicts, and to the reject cost, when the classifier abstains from prediction", with the error rate and the reject rate both monotone in the reject cost. ⚠ Quoted through the JMLR treatment of reject-option classifiers; the 1970 IEEE paper was not decoded here. This corroborates the doctrine rather than changing it, and it supplies the vocabulary for the last rung: the reading rejects, and reports that it rejected.
7. **Multiword terms are the evidence worth ranking first.** Already verified in [`PHRASE_EVIDENCE_NOTES.md`](PHRASE_EVIDENCE_NOTES.md): specialist terminology "overwhelmingly consists of MWEs" and 41% of WordNet 1.7 entries are multiword ([Sag et al. 2002](https://verbs.colorado.edu/~mpalmer/Ling7800/SagMWE.pdf)); multiword lemmas average polysemy 1.07 against 1.53 for single words ([Finlayson and Kulkarni 2011](https://aclanthology.org/W11-0805.pdf)).

**Where the analogy stops, stated so it is not overclaimed.** Non-mandatory leaf-node prediction assumes one taxonomy, and this cascade has several: `FIX / PreTrade` and `Computer Science` sit in different published hierarchies, so the rungs are an ordered list of evidence kinds and not levels of one tree. Katz backoff is therefore the closer analogy and blocking is borrowed as the name of a hazard, not as a result that transfers.

## The rungs and their bars

Every bar is derived from a resource or from the size of the field it competes in. None is chosen.

| | Rung | Answers with | Qualifies when | Bounded by |
|--:|---|---|---|---|
| 1 | a vocabulary's multi-word terms | the publisher and the branch its matched concepts sit under | its discounted phrase count exceeds `ChanceExpectedBest` over the field of seven, against `TermOrderNull` | `[1/1000, 1]`, the permutation estimator's own range |
| 2 | a vocabulary's corroborated single-word terms | the same | the same bar, computed on the count `CorroboratedTerms` accepts | the same |
| 3 | a topic index's placement | the subject, at the coarsest level that qualifies | `standsApartFromChance`, which `SubjectNull` already computes | a divergence in bits, bounded at 1 |
| 4 | nothing | — | no rung qualified | — |

A **match** enters rung 1 or 2 only if its own run clears the termhood bar, which is a second and independent test: the run's specificity against a table of runs pooled from the 100 general Java repositories, computed as `WordSpecificity` already computes a word's, `log(rank) / log(size)`, bounded in `[0, 1]` by the table's own length. A run the general corpus writes often is common software vocabulary whatever taxonomy states it; a run it never writes is the publisher's own.

### The worked example

FpML clears 3b's permutation bar on both tika, where it is wrong, and strata, where it is right. Nothing published today separates them. The termhood bar does, and the arithmetic is the pooled table's, at 28,128 units.

| Run | FpML writes it as | Occurrences in 100 general Java repositories | Rank | `log(rank)/log(size)` | Specificity |
|---|---|--:|--:|--:|--:|
| `time_zone` | `TimeZone` | 446 | 604 | 0.625 | **0.375** |
| `mime_type` | `MimeType` | 165 | 1,263 | 0.697 | **0.303** |
| `resource_type` | `ResourceType` | 51 | 2,680 | 0.771 | **0.229** |
| `country_code` | `CountryCode` | 11 | 5,911 | 0.848 | **0.152** |
| `cap_floor` | `CapFloor` | none | — | — | **1.000** |
| `fixed_leg`, `swap_leg`, `floating_leg`, `accrual_period` | likewise | none | — | — | **1.000** |

Tika's FpML evidence is the top four; strata's is the bottom five, at 603, 344, 310, 174 and 311 occurrences. General Java writes tika's and does not write strata's, and the vocabulary that states both is the same one. **That is the whole of rung 1's second bar.**

## What this does not do

- **It adds no statistic.** The permutation bar, `ChanceExpectedBest`, `WordSpecificity` and `SubjectNull` all exist; what is new is a table and an order.
- **It bundles no phrase-frequency resource from outside.** The pooled Java table is this project's own measurement of the same 100 repositories the word reference is drawn from, and the pool has already been run.
- **It does not touch the word arm's denominator.** The phrase table is a separate resource read only by the term path. `never-filter-the-corpus-alone` is satisfied because both sides of the *term* comparison change together and the word ranking is untouched — which is precisely what 3a failed to do.
- **It does not let rung 1 remove rung 3's answer.** Both are published; one is named.

## The revision of 2026-08-29: all the good matches, not the best one

The cascade above ranked the rungs and then took the single best source inside the answering rung. **That was wrong, and jPOS is the case that shows it.** Five vocabularies clear the phrase bar on jPOS, a card-payment library; the reading named FIBO at 2.0 times its bar and answered `MerchantIdentifier`, whose superclass FIBO states in the OMG Commons Ontology Library, which the extraction does not carry — so the answer arrived with no branch. BIAN cleared the same bar at 1.5 and places its matched concept under `Cards`, which is what the library is, and nothing published it.

`summary.answer` is therefore `summary.answers`, at schema 17.0: an array holding one entry per source that cleared the bar of the first rung to qualify, ranked by how far it cleared it. **The backoff is between rungs and never inside one.** A reading answered by a subject scheme is still one whose vocabularies said nothing; what changes is that a rung which qualifies publishes everything that qualified it rather than its argmax.

Two consequences. `AnswerRungs.PLACED_SUBJECT` now names every scheme level standing apart from chance rather than the first, so a reading placed by three schemes says so at both levels of each. And the readings page draws one line per answer, with the repository, λ and stated-area cells spanning them.

## Open questions, each with the measurement that settles it

**1. Multiplicity across rungs.** `ChanceExpectedBest`'s javadoc names the defect of two nulls disagreeing about strictness, and a cascade is a third attempt at looking remarkable after seven vocabularies and 152 subjects have each had theirs. *Settled by:* running the cascade with the rung bars read at the field of candidate answers the cascade actually offers, against the same bars read per arm, and reporting how many of the 36 level readings change hands. If none does, the correction is immaterial and the simpler form stands.

**2. Blocking — how often the cascade stops short of an answer it should have given.** *Settled by:* the evaluation set's own manifest. Four members state `Finance` and five state `Computer Science`; count how often rung 1 abstains on a member whose stated area a bundled vocabulary covers. quickfixj, strata, fineract and jpos are the cases where a specific answer exists to be blocked.

**3. Whether the termhood bar should discount a match or refuse it.** Discounting keeps a weak match in the count at reduced weight; refusing removes it. *Settled by:* both, on the ten readings, reporting FpML's tika figure and its strata and jpos figures under each. Refusal is the stronger claim and needs the larger separation to justify it.

**4. `id`-final runs never form, so a whole class of ordinary compound never reaches the bar.** FpML states `MessageId`, `TaskId`, `MimeType`, `PassThrough` and `ResourceType`; only the last two of those five can become runs, because `CollocatedWords` requires both edges to carry subject matter and `ContentWords` refuses any word shorter than `Thresholds.shortestProseWord`. `message id` and `task id` are exactly the generic compounds this design exists to demote, and they are invisible to it. This is the backlog's own live row — *`ContentWords` refuses a word shorter than three letters* — and it is now load-bearing for the term arm rather than only for the word arm. *Settled by:* the measurement that row already states, taken on the evaluation members rather than here.

**5. Whether `about` should name one answer or the rung that produced it.** A caller wanting a subject and a caller wanting a vocabulary want different strings. *Settled by:* nothing measurable — it is a contract decision, and the export can carry both without ambiguity if `aboutStatedBy` names the publisher.


## The approach

Five steps. Each names the class that carries it, the contract it must satisfy, the test that pins it, the command that runs it, and the figure that keeps or refutes it. Steps 1 to 3 add a bar and withhold what fails it, so no reading's answer changes until step 4.

### Step 1 — the pooled run table, as its own bundled resource

**Landed 2026-08-28.** `corpusRunPool` pools the runs over the same hundred clones and writes one table per weighting; [`reference-corpus-run-shares.tsv`](../../reference-corpus/src/main/resources/reference-corpus-run-shares.tsv) is the mean of shares, bundled beside the word table and read by `PooledRunShares` and `RunRanks`. 1,447 runs over 24,033 occurrences. The twelve rows the worked example rests on reproduce exactly — `time_zone` 446, `mime_type` 165, `resource_type` 51, `country_code` 11, and none of `cap_floor`, `fixed_leg`, `swap_leg`, `floating_leg`, `accrual_period`. Both provenance tests pass and no figure in any reading moved, because nothing reads the table yet.

**The pooling reading was corrected once, during step 2, and the table re-pooled.** The first pool ran through `CollocatedWords`, which is the reading a vote is taken from and which refuses a run whose first or last word WordNet carries no entry for. Under it the table could not hold `task_id`, `pass_through` or `message_id`, and step 2 measured what that costs: those are precisely the runs FpML's tika match rests on, and a table silent about them lets every one of them through as the publisher's own vocabulary. The edge rule exists so a *vote* is not spent on a run no resource labels; a denominator votes on nothing. `StatedRuns` is the same walk without it, and it is also the walk that matches the other side — `TermSpans` puts a published term against a declared name over the words the splitter produced, with no edge rule anywhere in it. Re-pooled: 1,200 runs became 1,447, and `task_id` at 160, `pass_through` at 32 and `message_id` at 31 joined the table.

**Two corrections the measurement forces on the worked example above, neither of which changes its ordering.**

**The Specificity column is written the wrong way up.** It states 0.375 for `time_zone` where its own `log(rank)/log(size)` column states 0.625, and 1.000 for an absent run. `WordSpecificity.of` returns `log(rank)/log(size)` itself, so under the class step 2 names `time_zone` scores **0.625** and `cap_floor` **1.000**. Commoner is still lower and absent is still highest; the gap between them is smaller than the table drew it.

**The ranks were read off the word table, not off a run table, because no run table existed when this was written.** They are positions among 28,129 pooled units. The bundled run table holds 1,200 rows, and a run's rank in it is a rank among runs, which is what makes the scale bounded by that table's own length.

| Run | Occurrences | Rank of 1,447, mean of shares | `log(rank)/log(1447)` |
|---|--:|--:|--:|
| `time_zone` | 446 | 35 | 0.489 |
| `task_id` | 160 | 60 | 0.563 |
| `mime_type` | 165 | 94 | 0.624 |
| `resource_type` | 51 | 158 | 0.696 |
| `pass_through` | 32 | 365 | 0.811 |
| `country_code` | 11 | 875 | 0.931 |
| `cap_floor` and its four kin | none | — | 1.000 |

**What that costs step 2.** The rank-based bar has 0.489 to 1.000 to work in, and `country_code` at 0.931 sits nearer the absent runs than to `time_zone`. **Step 2 took neither candidate and derived a third from the table's own error column**, which is stated there. The mean-of-shares weighting is what is bundled because the frame drew repositories rather than bytes, which is the reason the word table states for its own weighting; `corpusRunPool` writes the pooled-occurrences table beside it, so reversing that costs one file copy.

**What it is.** A table of the runs the 100 drawn Java repositories declare, with the occurrences and share of each, keyed and weighted exactly as [`reference-corpus-shares.tsv`](../../reference-corpus/src/main/resources/reference-corpus-shares.tsv) is. It is a second table, not a replacement, and nothing in the word arm reads it.

**Where it comes from.** The pool has already been run. `CorpusPoolCommand` reads each clone through `LegibilityReading`, which applies `CollocatedWords`; running it with the bundled vocabularies' runs pooled into the index produced 28,128 units over 1,540,099 occurrences, of which 1,200 hold a run rather than a single word. The run rows of that pool are the table. The word rows are discarded here because the word arm already has its own table, drawn at the unit the word arm actually reads.

**Why a second table rather than the one table.** This is the whole distinction 3a's refutation turns on. Changing the shared index changes what the *word* arm counts, and that is what cost 11 of the 36 level readings. A separate resource read only by the term path changes both sides of the *term* comparison and neither side of the word comparison, which is what `never-filter-the-corpus-alone` asks for — the rule is that a denominator and its numerator move together, not that every table in the tree must use one unit.

| | |
|---|---|
| Module | `reference-corpus`, beside `PooledWordShares` |
| Resource | `reference-corpus-run-shares.tsv`, eight-column header per `adding-a-taxonomy`, stating the same draw, frame and seed the word table states |
| Reader | `PooledRunShares`, mirroring `PooledWordShares` — classpath resource, comment and column parsing, normalisation on the way in, and a failure rather than a silent empty table when nothing is stated |
| Rank | `RunRanks`, mirroring `WordRanks`, so `log(rank) / log(size)` reads off it unchanged |
| Provenance | `BundledVocabulary.DIRECTORIES` already covers the module, so `VocabularyProvenanceTest` picks the header up; `PooledRunShares` names the resource as a constant so `BundledResourceReachabilityTest` finds it read |

**Command.** `./gradlew :reference-corpus-extraction:corpusRunPool -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=reference-corpus-extraction/src/main/resources/reference-corpus-published.tsv -Dcs.corpus.out=build/corpus-tables`, then `reference-corpus-run-mean-of-shares.tsv` copied in as the resource. Two and a half minutes; the clones are local and nothing reaches the network.

**It is a second read of the corpus, not the run rows of the first.** `CorpusRuns` reads under `EveryPublishedRun` — the dictionaries' collocations and the seven term vocabularies' multi-word labels together — because two adjacent words are merged only where the index states the run. Under the index a reading runs on, `cap_floor` is never merged, never counted, and reads as absent whatever the corpus writes; the absence has to be earned. The word tables stay pooled under the reading's own index, which is what keeps their shares comparable with a reading's, and each repository's shares are taken again over its runs alone so the run table is a distribution over runs.

**Kept when** the table states `time_zone` at 446 occurrences, `mime_type` at 165, `resource_type` at 51 and `country_code` at 11, and states none of `cap_floor`, `fixed_leg`, `swap_leg`, `floating_leg` or `accrual_period`. Those are the twelve rows the worked example rests on and they are already measured; the step is complete when the bundled table reproduces them.

### Step 2 — termhood, as a filter on the index rather than a weight on the count

**The seam.** `TermOrderNull.over(written, judged)` takes the observed count from `MatchedPhrases.over(index).in(written)` and each null count from `MatchedPhrases.over(ScrambledTerms.of(index, draws)).in(written)`. Both go through a `TermIndex`. **So the termhood bar belongs on the index**, not on the count: a decorator that yields only the terms a general corpus of Java does not already write, wrapped around the published index before either side is counted.

**The class.** `SpecificTerms implements TermIndex`, the sibling of `ScrambledTerms`, in `skos-matching`. It holds a published index and a `WorkingJavaRuns` over the corpus's run table, and answers with only the terms that clear the bar. `conceptsOf`, `terms`, `broaderOf`, `reads`, `source` and `rung` all delegate; `longestTerm` is recomputed over the terms it kept, so the walk is never offered a run the index can no longer answer.

**The arithmetic, and why nothing new is needed.** `WordSpecificity.of` is already `rank == UNKNOWN_RANK ? 1.0 : min(1, log(rank) / log(size))`. A run the general corpus never states is unknown and therefore scores 1.0 — maximally specific — which is the contract the absent finance runs need, already written and already tested. `PhraseSpecificity` asks the run table for a run of several words and `WordSpecificity` for a single word, so rung 1 is judged against Java runs and rung 2 against Java words. Both are bounded in `[0, 1]` by their own table's length.

**The tree already states the principle.** `WordNarrowing`'s javadoc: "A declared name is working Java, so a corpus of working Java is what says `get` and `id` narrow nothing — English calls both rare and is wrong about code." That is the argument for this step, written for words, applying unchanged to runs.

**Where the bar sits is the one thing not yet derived.** `SpecificTerms` needs a cut, and a cut is a bound, so it must follow from something. Two candidates were stated here, and neither is what landed:

| Candidate | Derivation | Why not |
|---|---|---|
| the run scores above the mean specificity of the vocabulary's own terms | the vocabulary states it about itself, so no constant is chosen | a vocabulary of uniformly ordinary terms keeps half of them, and step 1 measured the rank scale as too compressed to cut in: `country_code` at 11 occurrences scores 0.931 against 1.000 for an absence |
| the run is absent from the table, or its rank is beyond the word table's own reported floor of 63 occurrences | — | 63 is `OccurrenceFloor`'s answer to *how few names a repository can declare and still say something*. It is a bound on a repository's size, not on a run's count, and borrowing it across would be choosing a constant with a citation stapled to it |

**What landed is the table's own error column.** Every row states a share and the standard error of that share, and the header states the rule already: *a verdict whose margin sits inside it has not been shown to stand above chance*. Asked of a count rather than a verdict, that is **the corpus has been shown to write this run where its share exceeds its own standard error**. Nothing is chosen; the bound is the table's own statement about its own sampling. On the bundled table 550 of the 1,447 runs clear it.

Two consequences follow and both are stated in `WorkingJavaRuns`:

- **A run no publisher states was never counted, so the table having no row for it says nothing.** `canBeAsked` asks the pooling's own reading whether it would have merged the run. Where it would not, the term has no citation about its termhood, does not clear a termhood bar, and is dropped from the observed count and the deal alike — abstention, not a vote of zero.
- **The same rule over the *word* table refuses `trade` at 23 occurrences**, which is the domain evidence a reading exists to find, so a one-word term is not judged here at all. `CorroboratedTerms` is what already tests a single word, by requiring the repository to write another concept from the same branch.

**`PhraseSpecificity` reading runs against runs is held back to step 3.** It is read by `RecordedSpans`, `TermTally`, `KeywordSpecificity`, `WrittenMass` and `TermReading`, so changing what it reads for multi-word runs moves every figure those five produce — the whole term path and the `taxonomies` block. That is a weight on a published figure, measured by `changes.json` on a member, and step 3 already opens the export. The bar above is measured by `phraseNull` alone and moves no published figure, so the two are landed apart rather than together.

**Exchangeability, stated because it is the one thing that could invalidate 3b's argument.** 3b's null holds the repository still and permutes the vocabulary, so the reference states as many terms of the same lengths from the same word list. Filtering the index before the deal keeps that exactly: `ScrambledTerms.of(SpecificTerms.of(index), draws)` deals the *filtered* vocabulary's own words across the *filtered* vocabulary's own term shapes. Filtering after the deal would not, because a scrambled run is almost never in the general-Java table and so almost never filtered, which would shrink the observed count while leaving the null alone. **Wrap before dealing, never after**, and pin it with a test that asserts the null's median moves by less than one count when the filter is applied to a vocabulary none of whose terms the corpus states.

**Command.** `./gradlew phraseNull -Dcs.clone.dir=$HOME/evaluation/<member>`, one member at a time, never two Gradle invocations at once. About a minute on this tree and twelve on fineract.

**Kept when** FpML's tika figure falls below its bar while its jpos and strata figures hold, and FIX's five clears on repositories that are not trading systems fall. **Refuted by** the finance members' leaders falling with the false positives, which would mean the filter removes domain terms rather than ordinary ones.

**Landed and measured on all ten readings, 2026-08-28.** `phraseNull` computes both halves at one seed on one read: the published index, then `SpecificTerms` over it. Each figure is the observed count of distinct phrases divided by the bar `ChanceExpectedBest` sets at a field of seven; **bold** marks the leader and a dagger marks clearing. A ratio is not comparable across the two halves, because the filter shrinks the bar as well as the count — `clears` is what to read.

| Repository | | OLiA | CSO | FIBO | FpML | FIX | CWE | BIAN |
|---|---|--:|--:|--:|--:|--:|--:|--:|
| quickfixj | published | 1.0 | 2.0† | 3.0† | 4.5† | **11.8†** | 1.0 | 0.0 |
| a FIX engine | specific | 1.0 | 0.8 | 2.0† | 1.5† | **10.4†** | 0.0 | 0.0 |
| strata | published | 1.0 | 1.7† | **3.0†** | **3.0†** | 1.0† | 0.8 | 1.0 |
| derivatives analytics | specific | 0.0 | 1.1† | **2.9†** | 2.8† | 1.0 | 0.0 | 1.0 |
| jpos | published | 1.0 | 2.1† | 1.5† | **3.0†** | 1.7† | 1.0 | 1.5† |
| payments | specific | 1.0 | 1.6† | **2.0†** | **2.0†** | 1.4† | 1.0 | 1.5† |
| fineract | published | 1.4† | 1.8† | **2.0†** | 1.8† | 1.0 | 0.7 | 0.2 |
| core banking | specific | 0.3 | 1.1† | **1.8†** | 1.3† | 0.7 | 0.3 | 0.2 |
| tika | published | 3.0† | 2.2† | 1.5† | **4.0†** | 1.1† | 2.3† | 0.0 |
| content parsing | specific | 1.0 | 1.4† | 1.3† | 1.5† | 0.9 | **2.0†** | 0.0 |
| besu | published | 1.5† | **1.8†** | 0.6 | 1.0 | 1.7† | 0.6 | 0.5 |
| an Ethereum client | specific | 0.3 | **1.6†** | 0.5 | 0.3 | 1.1† | 0.0 | 0.5 |
| santuario | published | 0.0 | **2.9†** | 1.0 | 1.7† | 1.4† | 1.0 | 1.0† |
| XML security | specific | 0.0 | **1.3†** | 0.5 | 0.7 | 1.0 | 0.0 | 0.0 |
| aeron | published | 1.0 | 1.4† | 0.5 | **2.2†** | 1.1† | 0.0 | 0.0 |
| messaging transport | specific | 1.0 | **1.1†** | 0.3 | 0.8 | 0.6 | 0.0 | 0.0 |
| maven | published | **2.0†** | 1.2† | 1.7† | 0.8 | 1.4† | 0.8 | 0.0 |
| a build tool | specific | 0.5 | 0.9 | 0.7 | 0.3 | 1.0 | 0.5 | 0.0 |
| CodeSemantics | published | **3.0†** | 1.0 | 0.0 | 2.0† | 0.0 | 0.3 | 0.0 |
| linguistic annotation | specific | **2.0†** | 0.8 | 0.0 | 1.0 | 0.0 | 0.0 | 0.0 |

**37 clears become 22, and every leader that should survive survives.** FIX still leads quickfixj by the largest margin anywhere; FIBO leads strata and fineract; FIBO and FpML tie on jpos; OLiA leads this repository. The false positives 3b named by name are gone: OLiA on fineract falls 1.4 to 0.3, which is `entity type` 328, `email address` 40 and `phone number` 16 refused; FpML on aeron and santuario falls below; FIBO on maven falls below. **maven clears nothing at all**, where four vocabularies cleared before, which is the right answer for a build tool no bundled vocabulary covers.

**Four of the five criteria are met and the fifth is met in part.** FIX's clears on repositories that are not trading systems fall on aeron, maven, santuario and tika, and hold on besu at 1.1. FpML on tika falls from 4.0 to 1.5 but still clears, on six distinct phrases written once or twice each — `product_type`, `party_name`, `fixed_rate`, `lc_type`, `party_role`, `street_address`. **That residue is `MatchedPhrases` counting distinct terms rather than occurrences**, which is deliberate and stated there, so it is a limit of this rung rather than a defect of this bar. jpos and strata hold, which is the half of the criterion the bar was written for.

**What the bar costs, stated.** CSO loses 2,513 of its 14,259 terms on every reading and falls below its bar on quickfixj and maven. That is not a fault: CSO is the vocabulary of computer science and the corpus is working Java, so the bar is asking what a repository is about *beyond being software*, and answering "nothing further" for a build tool is correct. It does mean rung 1 cannot answer *Computer Science* — rung 3 is what answers that, which is the cascade's own shape.

### Step 3 — the bar reaches the export, and only what clears it is published

`PhraseBar` already carries `vocabulary`, `observed`, `chanceExpectedBest`, `median`, `atLeastAsExtreme`, `resamples` and `field`, with `exceedsChance()` and `timesTheBar()`. It is computed nowhere in a reading — only in `PhraseNullProbe`. This step moves the computation into `TermReading` and writes it into the export.

| Export change | |
|---|---|
| `taxonomies[].bar` | the vocabulary's observed count, its chance-expected best, and how many times the bar it reached |
| `taxonomies[]` membership | a vocabulary appears only where `exceedsChance()`; its matches appear only where `SpecificTerms` kept the term |
| `setAside` | two counts, in the idiom `matchesDiscardedByBranchRule` already uses: vocabularies below their permutation bar, and matches below the termhood bar |

**Cost.** The null is 999 deals per vocabulary and is the reason this is not free: `phraseNull` takes twelve minutes on fineract. A reading that computes it for seven vocabularies pays that once per read. **Whether the reading can afford it is a measurement, not an assumption** — take it with `profiling-a-read` before the export is changed, and if it cannot, the fallback is to compute the bar for the vocabularies that matched anything at all, which is usually two or three rather than seven.

**Kept when** the ten readings publish a bar and no reading publishes a match below it. This changes `schemaVersion`, and a bumped version means no `changes.json` is written, so the before-and-after has to be taken by scoring the previous readings first.

**Landed 2026-08-28, at schema 13.0.** `taxonomies[].bar` carries `phrases`, `chanceExpectedBest`, `median`, `timesTheBar`, `field` and `resamples`; a vocabulary appears in `taxonomies` only where its count beats its bar; `setAside` gains `vocabulariesBelowTheirChanceBar` and `termsWorkingJavaAlsoWrites`. Every index the export matches on — OLiA's included, through `TreeReading.terms` — is wrapped in `SpecificTerms` first, while the publisher's whole concept list still supplies the branch rule, because what a publisher states about its own tree is not narrowed by what a corpus writes.

**The cost is measured and it is 37 seconds.** A self read was 1m 38s and is 2m 15s. The null is 999 deals per vocabulary and the export judges the vocabularies it publishes rather than all seven, so it pays two nulls where `phraseNull` pays seven. The plan's fallback — computing the bar only for the vocabularies that matched anything — was not needed.

**Corrected 2026-08-28, the same day: the export judged two vocabularies and could only ever have judged two.** `MatchedTaxonomies` holds OLiA and CSO; FIBO, FpML, FIX, CWE and BIAN are `ControlTaxonomies` and the export never matched them at all. So **quickfixj could not publish FIX and strata could not publish FIBO**, whatever their counts, and every reading's `taxonomies` block held CSO or OLiA or nothing. The enum was deciding in advance the question the bar exists to ask, and its own javadoc shows why the mistake was invisible: it calls the controls "term vocabularies of a field the read repositories are not in", which was true when the only read repository was this one. **Which vocabulary is a control is a fact about the repository being read, not about the vocabulary.**

`ExportedReading.everyBundledVocabularyBesidesOlia` states the field once and the export judges all seven. What that changes, on the eleven:

| Repository | Published before | Published now |
|---|---|---|
| quickfixj, a FIX engine | OLiA 1, on a bar of 0 | **FIX 10.4×**, FIBO 2.0×, FpML 1.5× |
| fix-trading-simulator, a FIX consumer | nothing | **FIX 9.0×**, and nothing else |
| strata, derivatives analytics | CSO 1.3× | **FIBO 2.8×**, **FpML 2.8×**, CSO 1.1×, BIAN 2.0× |
| fineract, core banking | CSO 1.3× | **FIBO 1.8×**, FpML 1.3×, CSO 1.1× |
| jpos, payments | OLiA, CSO | FIBO 2.0×, FpML 2.0×, FIX 1.4×, BIAN 1.5×, CSO 1.6× |
| maven, a build tool | nothing | nothing |
| this repository | OLiA 4.0× at a field of two | **OLiA 2.0×** at a field of seven, six below their bar |

strata's phrases are `present value` 1429, `start date` 930, `valuation date` 795; quickfixj's are `msg seq num` 160, `begin string` 76, `resend request` 45. None of that reached any reading before. The bars agree with `phraseNull`'s own field-of-seven column — FIBO 2.8 against its 2.9, FpML 2.8 against its 2.8 — which is the cross-check that the export and the probe now measure one thing.

**The zero-valued bars go with it.** quickfixj published OLiA on one phrase against a bar of zero because a field of two reads the deals at the 67th percentile; a field of seven reads them at the 88th, and OLiA falls below. The defect stated above is answered by fixing the field rather than by adding a median rule.

**What it costs, and it is the largest cost in the reading.** A self read goes 2m 21s to **4m 5s**, strata to **10m 38s**, and `evaluationReadAll` over eleven members to **37m 3s** from 16m 28s. Seven vocabularies at 999 deals each, per reading, and `TermOrderNull` is now the dominant term in a read. The placement is unmoved through all of it — 44 level readings, 39 apart, mean margin 0.0415, identical at every step — which is the criterion, because none of this touches the word arm.

**The superseded reasoning, kept because it was wrong in an instructive way.** `ChanceExpectedBest` reads the quantile at `1/(field + 1)`, so a field of two puts the bar at the 67th percentile of the deals where a field of seven puts it at the 88th. CSO clears on this repository at 1.25 times a field-of-two bar and failed at 0.8 against the probe's field of seven. Both are right about their own question: the export offers two candidate answers, and the probe deliberately puts seven in competition so the controls can be read. **This is open question 1 arriving early**, and step 4 is where it is settled, because the cascade's field is the number of candidate answers the cascade offers rather than the number one rung offers.

**And the argument that produced it, which does not survive.** `ControlTaxonomies`'s javadoc says a control that joined the reading it controls would be measuring itself, and that was read here as *a control may never be published*. It does not follow. The controls exist to show that OLiA's and CSO's matching on **this** repository means something, and they still do that in `phraseNull`; publishing FIBO on a derivatives library measures nothing about OLiA on a linguistics library. The bar is the independent test, and refusing to compute it is not caution but a missing measurement.

**The backtest is the criterion and it is met exactly.** Step 3 touches the term arm alone, so the placement must not move at all, and it does not: 44 level readings, 39 standing apart, mean margin 0.0415, mean divergence 0.3890, mean chance bar 0.4304, 149 subjects in the bands, leader in the stated area 5 of 11 at both OpenAlex levels — every figure identical to the reading at the previous commit. What the eleven now publish varies by member, where before every member published both vocabularies:

That table is the field-of-two reading and is superseded by the one above. Under it maven published nothing, which was right, and quickfixj published OLiA on one phrase against a bar of zero, which was not: a FIX engine whose only surviving vocabulary is linguistic annotation. Raising the field to seven answers it — the deals are read at the 88th percentile rather than the 67th, OLiA falls below, and FIX arrives at 10.4 times its bar.

**What it costs the backtest.** `evaluationReadAll` over eleven members goes from 8m 9s to 16m 28s. The null is the whole of that.

### Step 4 — the cascade fills the answer

**The rungs are an enum, not a chain of conditionals.** `AnswerRungs` in `reading-export`, one constant per rung, each answering `Optional<Answer>` for a reading, tried in order by `MostSpecificAnswer`. That is the same shape `MatchedTaxonomies` and `ControlTaxonomies` already use, and it keeps a new rung a new constant rather than a new branch.

| Rung | Reads | Answers when |
|---|---|---|
| `MATCHED_PHRASES` | `taxonomies[].bar` over multi-word terms | a vocabulary clears its permutation bar |
| `CORROBORATED_WORDS` | the same over the count `CorroboratedTerms` accepts | as above, on that count |
| `PLACED_SUBJECT` | `summary.placedIn` | `standsApartFromChance`, coarsest level first |
| `NONE` | — | always, and answers with an abstention |

**What an answer holds.** `Answer(String about, String statedBy, String rung, double timesTheBar)` — the branch or subject, the publisher, which rung produced it, and by how much it beat its own bar. `ExportedReading.ABOUT_STATED_BY` is a constant naming the two dictionaries today; it becomes the answer's own `statedBy`. `ReadingSummary` already carries a `Withheld(what, why)` record, which is where rung 4's abstention is written rather than inventing a shape for it.

**Multiplicity across rungs is question 1 above and it lands here.** `ChanceExpectedBest.nearestIn(field, drawn)` takes the field size; the cascade's field is the number of candidate answers it offered, not the number one rung offered. Compute both, report how many of the 36 level readings change hands, and take the simpler form where none does.

**Command.** `./gradlew evaluationReadAll -Dcs.evaluation.dir=$HOME/evaluation`, seven minutes for all nine, then `./gradlew evaluationScore`.

**Kept when** the 36 level readings do not fall below the 33 standing apart recorded on 2026-08-28, and rung 1 answers on quickfixj, strata, fineract and jpos and stays silent on maven, tika, santuario, besu and aeron. **Refuted by** blocking — rung 1 abstaining on a finance member whose stated area a bundled vocabulary covers — or by the placement falling, which would mean the cascade's bar is doing damage the arms were not doing alone.

**What the twelve committed readings show, at schema 18.0.** The placement half of the criterion holds: 35 of 36 level readings stand apart from chance. The silence half was written against the wrong cases, and reading the matched terms rather than the counts says why.

**CSO answers correctly on the four repositories the criterion expected silence from.** It is a computing vocabulary and they are computing repositories, so silence there would be the worse reading.

| Reading | What CSO matched | What the repository is |
|---|---|---|
| aeron | `uni cast` 112, `control channel` 96, `udp` 59, `rtt` 38 | a UDP transport library |
| santuario | `xml` 1,285, `rsa` 376, `encryption` 212, `key agreement` 18, `block cipher` 16 | XML signature and encryption |
| besu | `hash functions` 1,662, `public key` 165, `byte code` 24 | an Ethereum client |
| tika | `parsing algorithm` 556, `xml` 489, `html` 342, `source language` 25, `target language` 34 | a parser and detector toolkit |

**The defect the criterion was pointing at is elsewhere: a finance vocabulary answering on ordinary English it happens to use as a class label.** The publisher's own definition is what shows it.

| Reading | Match | The publisher's definition | What the word is in the repository |
|---|---|---|---|
| besu | FIX `account` 1,239 | "Account mnemonic as agreed between buy and sell sides, e.g. broker and institution" | an Ethereum account |
| besu | FIX `pool` 287 | "For Fixed Income, identifies MBS / ABS pool" | the transaction pool |
| besu | FIX `range` 418 → Scope | "Specifies the market scope of the market data" | a range of blocks |
| santuario | FIX `issuer` 43 | "Name of security issuer (e.g. International Business Machines, GNMA)" | an X.509 certificate issuer |
| santuario | FIX `subject` 40 | "The subject of an Email message" | an X.509 certificate subject |
| tika, jpos | FIBO `index` 481, 211 | "indirect shortcut derived from and pointing into, a greater volume of values" | an array index |
| quickfixj | FpML `message` 697 | "the basic structure of all FpML messages" | a FIX message |
| quickfixj | FIX `test` 926 → Testing | "Messages used to request for or communicate information related to testing, e.g. algorithmic trading" | a unit test |

`ExportedAnswer`'s own javadoc states the rule these break — a vocabulary's single-word terms are its weakest evidence, because `name`, `value` and `share` are class labels in a finance ontology and everyday words everywhere else. **The bar does not use it.** `MatchedPhrases` counts distinct terms, so `merchant identifier` written once and `index` written 211 times each count one.

**The bar is already restricted to multi-word terms.** `MatchedPhrases` counts "how many of a published source's terms of more than one word stand inside a repository's declared names", and `ScrambledTerms` deals over the same field. So the single-word matches above never faced the bar and never counted towards it; what they do is answer, because `AnswerRungs` picks the concept the repository wrote most and a common word wins that comparison.

**What the bar refuses to count is how often, and that is what separates the answers.** Its javadoc states the ground: one published phrase written eight hundred times is one phrase the repository knows, and counting distinct terms is what makes a deal of the source a comparable reference, because a deal states as many terms as the source does. Occurrences falling on multi-word terms:

| Answers that hold | | Answers that do not | |
|---|--:|---|--:|
| fineract, FIBO | 4,948 | jpos, FIBO | 7 |
| strata, FpML | 4,120 | quickfixj, FpML | 9 |
| strata, FIBO | 3,008 | santuario, FIX | 9 |
| fineract, CSO | 2,092 | tika, CWE | 8 |
| quickfixj, FIX | 717 | tika, FIBO | 21 |
| aeron, CSO | 435 | besu, FIX | 64 |

tika clears on FpML with nine terms written 25 times between them — `contact info` 10, `product type` 6, `packet header` 2. quickfixj clears on FIX with 53 written 717 times. The bar reads those as 9 against 53 and the deal it is compared to is drawn the same way, so neither the observed figure nor the null can see the difference.

### Step 6 — the unit the bar counts in

**Built 2026-08-30, as a probe and not as a reading.** `PhraseCount` is the contract, so the observed figure and every figure of the null stay one function of one kind of input — the property `MatchedPhrases` states as its reason for existing. `MatchedPhrases` implements it unchanged; `PhraseOccurrences` implements the other question that class names and declines, summing over the names a term stands in where the first collects them into a set. `CountedPhrases` is the enum carrying the two, `HOW_MANY` and `HOW_OFTEN`, and `TermOrderNull.seeded(seed)` still means the first, so no published figure moves. `./gradlew phraseUnit` draws both over one tree and `./gradlew phraseUnitAll` over every cloned member in one JVM.

The null stays sound in the second unit for the reason it was sound in the first. A deal of a source's own words is matched against the same declared names the source is, so a dealt run is written as often as the names it stands in, exactly as a published term is. What the distinct count bought — that a deal states as many terms as the source does — a repository held still supplies instead: neither side's occurrences can move, because the names are the same names.

**A raw occurrence count cannot be the figure the reading publishes.** [`THE_LITERATURE.md`](THE_LITERATURE.md) §5.2 refuses log-likelihood, PMI, t-score, %DIFF and Bayes factors on one line — a bound must follow from the statistic's definition — and keeps only the statistics that bound themselves: Dice at 1, logDice at 14 by derivation, NPMI in [−1, 1], Jensen-Shannon at one bit. `MatchedPhrases` has that maximum: a source of 130 terms cannot score 131. An occurrence count is bounded by how many names the repository declares, which is a fact about the repository and not about the statistic, and `qualifiedBy` reports the figure. Weighing each occurrence by `PhraseSpecificity` does not repair it, because a weight in [0, 1] times an unbounded count is unbounded.

**The bounded form is a share:** the occurrences standing on a source's terms over the repository's declared runs, which bounds itself at 1 by its own definition. It is comparable between a source and a deal of it for the same reason the count is — one repository, held still, is the denominator on both sides — so the verdicts are identical and only what is published changes. Tika writes 25 runs of 57,812 where quickfixj writes 712 of 11,030, which is the separation the distinct count cannot state.

**What the survey says about the direction, and it is not all one way.** §2.4 records that document-level resampling is the correct null, because Mildenberger shows the token-level sampling model behind the standard keyness tests is the specific reason they produce false positives — words clump in documents. Counting occurrences makes this a token statistic. It is not a token-level sampling model, because the deal is of the vocabulary and the clumping enters both sides, but the exposure is the one that section names. §4.3 compounds it: the bar is a high order statistic already flagged as assuming independence and resting on few of them.

**The frequency-based term recognisers cannot be cited in support.** C-value, NC-value, ATR4S and TermSuite weigh a candidate by its frequency of occurrence, and §5.2 refuses the family on the doctrine line — a 229-word stop list built by hand from a tenth of the scored corpus — with reported precision of 31–38% beside it. C-value also damps frequency by the logarithm of a term's length and subtracts the frequency of the terms nesting it. Neither damping is present here.

**Measured on all eleven members, one seed, 999 deals, in one JVM — 1,497 seconds.** Seventy-seven verdicts, of which the two units disagree about fourteen.

| | Vocabularies clearing |
|---|--:|
| counting how many terms | 26 |
| counting how often they stand | 22 |
| clearing both | 17 |

**Each unit admits false positives the other refuses, and the fourteen disagreements are all of them.**

Counting how many admits a vocabulary that writes a handful of generic terms once or twice each: tika clears FIBO on `responsible party` 5 and `set window` 4, FpML on `contact info` 10 and `packet header` 2, CWE on `process control` 4 and `infinite loop` 2; jpos clears FIBO on `merchant identifier`, `merchant category code` and `bank identifier`, each written once; santuario clears FIX on `card number` 4 and `language code` 2. Nine such clears fall when the count is by occurrence.

**Counting how often admits a vocabulary that writes one ordinary compound constantly, and aeron is the case that settles it.** FpML clears aeron at 17.5 times its bar on three terms and 857 occurrences, and `correlation_id` alone supplies 850 of them. FpML states it because a derivatives message carries a correlation id; aeron writes it because a transport does. OLiA clears aeron the same way. `MatchedPhrases` predicts this failure in the sentence that states its own rule — one published phrase written eight hundred times is one phrase the repository knows — and the case arrived at eight hundred and fifty.

**Requiring both bars refuses all fourteen.** It keeps every strong answer: FIX on quickfixj at 52 terms and 712 occurrences, FIBO and FpML on strata at 47 and 69 terms over 2,877 and 2,694 occurrences, BIAN on jpos, CSO on tika, santuario and aeron, FIX on fix-trading-simulator at 9 terms and 147 occurrences. It costs two clears that may be right: BIAN on fineract, a banking vocabulary on a banking platform, resting on one term written 818 times — the shape aeron refutes — and FIX on strata, which fails the term count at 42 against a bar of 44 and passes the occurrence count at 1.4.

**The two statistics measure different things and a vocabulary of a repository's field satisfies both.** How many says the evidence is spread across the publisher's vocabulary rather than resting on one collision; how often says it is written rather than incidental. Each keeps the maximum its own definition gives it, so a conjunction of the two is bounded as each is, and it is stricter than either — which §4.3 already records the single bar as being.

**What the measurement decided.** Neither unit replaces the other. Counting how often is refuted as a replacement by aeron; counting how many is refuted as sufficient by tika. **Requiring both is what the eleven members support**, and the reported figures stay bounded: the term count by the number of terms the source states, and the occurrence count as a share of the repository's declared runs.

**The seed variance, at three seeds over all eleven members — 4,622 seconds.** Seventy-four of the seventy-seven verdicts are the same at every seed. Three are not, and each moves in one unit while the other holds it steady.

| Reading | Source | How many | How often |
|---|---|---|---|
| strata | BIAN | yes no no | yes yes yes |
| quickfixj | FpML | yes yes yes | yes yes no |
| besu | FIX | yes no yes | yes yes yes |

**All three are marginal, and the conjunction inherits the instability rather than curing it.** Each clears its moving bar between 1.0 and 2.0 times: BIAN writes two of strata's terms against a bar of one, FpML eight of quickfixj's occurrences against seven, FIX ten of besu's terms against nine. Requiring both bars makes a verdict as firm as its weaker half, so all three move under the conjunction too — fourteen of the seventeen that clear both are seed-independent, and three are not.

**§4.3's own standard says what that means.** A non-zero variance at 999 draws establishes that 999 is too few. The bar for a field of seven is the 125th smallest of 999, and the count below that quantile is Binomial, so a bar separating 8 from 7 is estimated from a handful of order statistics. The section names the remedy: more draws. It also names the second reading of the same fact — that a verdict clearing its bar by less than about twice is one the draw decides, and reporting it as a clear states more than the measurement supports.

*Settled by:* the same eleven members at 10⁴ draws, reporting whether the three settle and whether any of the other seventy-four move. Until then `HOW_MANY` is what the reading publishes, and the conjunction is the candidate the evidence supports rather than the rule the reading applies.


### Step 5 — the entry point

**Landed 2026-08-30.** `ExportedReading.of(Path, String)` reads a directory and returns the export. It composes the two calls a consumer had to make itself and nothing else: `RepositoryReading.of(directory)`, then the vocabulary list `everyBundledVocabularyBesidesOlia()` states. The commit stays an argument because the library reads no `.git`, and a caller with none passes the empty string.

The overloads beneath it are unchanged, so a program already holding a reading, a term reading, a field placement or the chance bars over the published names passes them instead of paying for them twice. Writing the document is `new ExportFile().wrote(file, export)`, which was already published and checks the document against `reading-export.schema.json` before it reaches a file.

`ExportedReadingTest.exportsADirectoryWithoutTheCallerAssemblingAReading` is what says the call works from outside every diagnostic: it writes one class into a temporary directory and asserts the export comes back at the stated schema version, naming that directory and judged against every bundled vocabulary. It costs 122 s against the 73 s of the two tests beside it, which name no vocabulary: the difference is what matching all seven bundled ones over a one-class tree costs.

The README's `Calling it from Java` section states the call and the coordinate — `io.github.fiftieshousewife:reading-export:0.1.0-SNAPSHOT`, resolvable from `~/.m2` after `./gradlew publishToMavenLocal` and nowhere else until the Maven Central row lands. The same edit removed a paragraph claiming `ReportFolder` renders markdown and an HTML twin, which `PublishedFormat` has refused since the output became JSON only.

## The order of work

| | Step | Costs | Settled by |
|--:|---|---|---|
| 1 | ~~the pooled run table as a bundled resource~~ **landed 2026-08-28** | one pool and one build | the twelve rows reproduce; both provenance tests pass; no reading moves |
| 2 | ~~`SpecificTerms` on the index~~ **landed 2026-08-28** | one build, then `phraseNull` per member | 37 clears become 22; jpos and strata hold; FpML on tika falls 4.0 to 1.5 and still clears; four of FIX's five non-trading clears fall. `PhraseSpecificity` reading runs against runs moved to step 3 |
| 3 | ~~the bar in `reading.json`, matches below it withheld and counted~~ **landed 2026-08-28** | one build, one self read, a profile | schema 13.0; a self read costs 37 s more; OLiA publishes 130 concepts where it published 142 |
| 4 | ~~the cascade in `about` and `aboutStatedBy`~~ **landed 2026-08-29, revised the same day to `summary.answers`** | a schema bump and the full backtest | Schema 17.0, and 18.0 once CSO joined the schemes. **The placement half holds and the silence half does not**: 35 of the 36 committed level readings stand apart from chance, and the phrase rung answers on eleven of the twelve readings where the criterion expected four. The margins are in the table under step 4 |
| 5 | ~~the published entry point~~ **landed 2026-08-30** | one build and a README section | `ExportedReading.of(Path, String)` reads a directory and returns the export, with no diagnostic, system property or test framework between a caller and it. The README states the coordinate |

**Refuted by:** rung 1 answering on repositories outside every bundled vocabulary's field after the termhood bar is applied, or the 36 level readings falling at step 4. Either returns the export to three unrelated blocks, which is a worse reader experience and an honest one.

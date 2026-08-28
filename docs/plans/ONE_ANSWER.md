# One answer, backed off

A reader wants one statement of what a repository is about and one citation for it. The reading currently publishes three unrelated blocks — `summary.about` from the word arm, `summary.placedIn` from the two topic indexes, and `taxonomies` from the term arm — with nothing stating which of them answers, and with the term arm carrying no chance bar at all. This plan makes the export name one answer, taken from the most specific evidence that stands above chance, and report only what stands above chance beneath it.

The design was arrived at by refutation, not by argument: [`PHRASE_EVIDENCE.md`](PHRASE_EVIDENCE.md) records part 3a, which joined the two arms at the **unit** and was measured on the nine evaluation-set members on 2026-08-28. It fell from 33 of 36 level readings standing apart from chance to 22. Joining them at the **answer** is the alternative that the same measurement points to, and the difference is the whole of why this plan exists.

## What a reader gets

| Field | Holds | Bar it must clear |
|---|---|---|
| `about` | one answer: a vocabulary and the branch it places the repository under (`FIX`, `PreTrade`), else a subject a topic index states (`Computer Science`), else nothing | the rung's own, below |
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

### Step 5 — the entry point

One published class taking a directory and returning the export, and a README section showing the call and the coordinate. Every entry point sits in a test source set today, so no caller outside this repository can reach any of the above. It depends on none of steps 1 to 4 and can be built first if the surface matters more than the answer.

## The order of work

| | Step | Costs | Settled by |
|--:|---|---|---|
| 1 | ~~the pooled run table as a bundled resource~~ **landed 2026-08-28** | one pool and one build | the twelve rows reproduce; both provenance tests pass; no reading moves |
| 2 | ~~`SpecificTerms` on the index~~ **landed 2026-08-28** | one build, then `phraseNull` per member | 37 clears become 22; jpos and strata hold; FpML on tika falls 4.0 to 1.5 and still clears; four of FIX's five non-trading clears fall. `PhraseSpecificity` reading runs against runs moved to step 3 |
| 3 | the bar in `reading.json`, matches below it withheld and counted | one build, one self read, a profile | the ten readings publish a bar and none publishes a match below it |
| 4 | the cascade in `about` and `aboutStatedBy` | a schema bump and the full backtest | 36 level readings hold at 33 apart, and rung 1 answers on the four finance members and no others |
| 5 | the published entry point | one build and a README section | it is callable from outside the test source set |

**Refuted by:** rung 1 answering on repositories outside every bundled vocabulary's field after the termhood bar is applied, or the 36 level readings falling at step 4. Either returns the export to three unrelated blocks, which is a worse reader experience and an honest one.

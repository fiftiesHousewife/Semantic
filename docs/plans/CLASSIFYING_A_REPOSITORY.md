# Classifying a repository against a taxonomy

The reading currently answers "what subjects is this repository about" with a distribution over ~460 general vocabulary labels, and then infers a published subject from it by divergence. This plan replaces that with a direct answer: **which concepts of a published taxonomy does this repository write, and which category do they place it in.**

## Why the present route loses information

Every judgement passes through two lossy hops:

word → WordNet-Domains or Wiktionary label (~460 labels) → distribution → divergence → arXiv subject

The first hop drops most of what was written. WordNet Domains labels ≥1 sense for 51.5% of lemmas and this reading takes only the commonest sense, so 75.5% of observed mass settles on no subject, and what survives is whatever specialist sense a word happens to carry — `first` reads as baseball, `jupiter` as astronomy.

The second hop answers in the wrong vocabulary. The reading yields `linguistics`, `computing` and `grammar`; the question was which of 152 published subjects this repository belongs to. A divergence over a general vocabulary is asked to bridge two label spaces that no resource says are one.

The comparison is also asymmetric in size. The 152 arXiv descriptions have a **median of 18 words** — quartiles 12 and 35, minimum 3 — against a repository of roughly 75,000 word occurrences. Explicit Semantic Analysis, the closest published analogue, falls from 87.75% to **46.64%, below chance**, when one side is truncated to 1/16, because the two sides stop sharing support ([Song & Roth, NAACL 2015](https://aclanthology.org/N15-1138.pdf)). It does not degrade; it inverts.

## What the literature endorses instead

Three findings converge on one architecture, and are set out with their numbers in [`docs/reference/SEMANTIC_ANALYSIS.md`](../reference/SEMANTIC_ANALYSIS.md):

1. **Reading a category's own text is the only thing that survives with no training data.** On EURLEX57K, 4,271 EuroVoc labels, standard architectures reach RP@5 0.835 on frequent labels and **0.028 on zero-shot labels**; only the architecture reading the label's own descriptor recovers anything, at **0.438**.
2. **Lexical matching into the vocabulary is a first-class method.** Annif — the subject-indexing tool national libraries run in production — carries `mllm` and `stwfsa` backends that do exactly this, and BM25 remains hard to beat across BEIR's out-of-domain suite.
3. **Combine several weak indexers and measure the combination.** Annif's design point is a harness over many weak backends with a trained combiner, evaluated against a gold set — not one clever signal.

The corresponding move here: **promote step 8 to be the classifier.** `TermSpans` already matches a taxonomy's multi-word concepts in the order they were written, and `CorroboratedTerms` already requires a branch to hold more than the one concept. That machinery produces a **concept identifier**, which is an answer a reader can check, where the topical reading produces a domain label that needs a second inference before it is one. The backlog has recorded since it was written that nothing from step 8 feeds step 5; the reason it could not — the topical reading read a word at a time where a taxonomy publishes phrases — is gone.

## The three arms

| Arm | What it reads | State |
|---|---|---|
| **Concept match** | Which of the taxonomy's own concepts the repository declares, corroborated by branch | Built. `TermSpans`, `CorroboratedTerms`, `TaxonomyTree`. Not wired to an answer |
| **Description similarity** | The category's own prose, pooled through the same pipeline as the repository | Built. `SubjectAreas`, `SubjectPlacement`. Needs a length-matched null and subtree pooling |
| **Dependency coordinates** | What the repository declares it is built on | Not built. `ImportOrigins` already sorts imports into platform, own and third-party |

The third arm is the strongest untapped signal for this task specifically. A coordinate denotes one artefact somebody else published, so it needs no sense disambiguation at all: `org.apache.lucene` is better evidence that a repository does information retrieval than any English word inside it. [`DEPENDENCIES_AS_DOMAIN.md`](DEPENDENCIES_AS_DOMAIN.md) proposes it already and is blocked on nothing.

## The taxonomy to classify into

arXiv is the wrong target for repositories. It classifies research fields, its descriptions are 18 words, and no repository is *about* `math.AG`.

**What arXiv covers of commercial software, counted from the bundled file.** Finance is present as research: 12 of the 174 rows are `q-fin` and `econ`, including `q-fin.TR` Trading and Market Microstructure, `q-fin.RM` Risk Management, `q-fin.PR` Pricing of Securities and `q-fin.PM` Portfolio Management. So a trading system has somewhere to be placed, and the placement is a research field it resembles.

What has no category at all is most of what commercial software is written for: payments and settlement, accounting and ledgers, e-commerce and order management, health records, logistics, telecommunications operations, identity, customer relationship management, build and deployment tooling. arXiv is a preprint archive, so its categories are subjects people publish papers about. A payments repository read against it is placed by resemblance to whichever research field shares its words, and the reading has no way to state that the right answer was absent from the list.

**This is the argument for the Trove target below**, whose 321 classifiers under 25 roots include `Topic :: Office/Business :: Financial :: Point-Of-Sale`, `Topic :: Communications :: Telephony` and `Topic :: System :: Logging`. **What settles it:** the share of a panel whose stated category has a nearest arXiv subject at all, against the same share under Trove. **Nothing is bundled before [the extractors](THE_EXTRACTORS.md) are restructured.**

A vocabulary fit for this task needs four things, and **no single candidate has all four**:

| | Concepts a program would write | Prose per concept | Hierarchy | Bundleable |
|---|---|---|---|---|
| arXiv subjects (152) | no — research fields | 18 words median | yes | yes |
| **ACM CCS 2012** (~2,000) | yes — *query optimization*, *compilers* | no definitions | deep | **educational/research only** |
| **PyPI Trove `Topic ::`** (320) | yes — *Database :: Database Engines/Servers* | no | yes, via `::` | **Apache-2.0** |
| **GitHub topics** (1,255) | yes — *orm*, *compiler*, *kubernetes* | **short_description + Wikipedia link** | flat, only `related` | CC BY 4.0 |
| Apache DOAP (51 tokens) | no — `library`, `retired` | no | flat | unstated |
| OLiA, FIBO (bundled) | yes, for linguistics and finance | yes | deep | yes |

Two decisions follow.

**The target taxonomy and the validation labels must be different vocabularies.** Apache DOAP is ground truth — an institution stating a category in a document separate from the code — and it is a poor classification target, because `library` is not subject matter and every Java project would match it meaninglessly. Classifying into DOAP and scoring against DOAP would be circular.

**The target is PyPI Trove's `Topic ::` classifiers, unless ACM CCS turns out to permit indexing use.** Trove is Apache-2.0, hierarchical by construction, and is a published statement of what software is *for*; the hierarchy is what `CorroboratedTerms` requires. Its weakness is that it carries no definitions, which starves the description arm — and that is what GitHub's topic set supplies, each of its 1,255 topics carrying a `short_description` and a `wikipedia_url` under CC BY 4.0. ACM CCS is the discipline's own classification and better shaped than either, but its stated terms restrict it to educational and research use, which is incompatible with bundling it into a published artefact. **Reading that licence is the first task in chunk 2** and it settles which vocabulary the rest of this plan targets.

The bundled OLiA and FIBO stay where they are, as out-of-domain controls rather than classification targets: a reading that fires FIBO's vocabulary on a compiler is broken, and that is a test rather than an answer.

## What would end this

If concept match cannot separate repositories that share a stated category from those that do not — chunk 4 below — then the reading is measuring Java rather than subject matter, and no amount of arm-combining will repair it. That is the kill line, and it is deliberately placed before any of the building work.

## The expected ceiling, stated in advance

So that a modest number is not read as a failure: SciPrompt reports **22.28% zero-shot accuracy over 53 arXiv subcategories**; Annif tops out near **F1@5 0.45–0.50** on a real thesaurus; EURLEX zero-shot RP@5 is 0.438. Published repository-classification figures above these are almost always measured against a topic the repository's own owner set, having written the README the classifier reads.

---

## The work, in session-sized chunks

Each chunk lands on its own, leaves the build green, and states the number that judges it. Chunks 1–4 are sequential; 5, 6 and 7 are independent of one another once 4 has passed.

### Chunk 1 — Weight every file equally in a comparison

`TopicDistribution.meanOf` averages per-file share vectors and `unplaced` separately, and `amongWhatWasPlaced` then divides by (1 − ū). The composition weights each file by its own legible fraction:

Σ_f (1 − u_f) · p_f ⁄ Σ_f (1 − u_f)

At 75.5% unplaced, a file legible at 60% carries about 2.4 times the weight of one legible at 25%. The class javadoc states that each file is one observation; that is true of the intensity reading and false of every divergence computed from it — which is every figure in the scope comparison and the field placement.

**Change.** Renormalise each file's distribution before averaging, or state the weighting in the contract and report it. **Measurement.** Spearman ρ between the topic rankings before and after; ρ < 0.9 means the documented claim was false in practice as well as in principle. **Blocked on** nothing. **Prerequisite for** every chunk that reads a divergence.

**Landed.** Renormalised, because the weighting the arithmetic produced was nobody's decision: it weighted a file by its legible fraction while refusing to weight it by its length, so a 400-line file and a 30-line file stayed one observation each and the more legible of two files outvoted the other. A weighting has to justify both or neither. `meanOfWhatEachPlaced` composes a comparison and `meanOf` stays the intensity; the two cannot be derived from one another, so `ScopeThemes` carries both and every call site names which it means.

**Measured: ρ = 0.9985** over 373 files and 463 topics, so the documented claim was false in principle and very nearly true in practice — the order held, and the plan's bar of 0.9 is not approached. `FileWeightingDiagnostic` composes both ways off the same file readings and reports it; `RankCorrelation` is Spearman with mid-ranks for ties, bounded in [−1, 1] by its own definition.

**The shares moved further than the order did, and the field placement swapped.** `publishing` fell from 5.95% to 5.21%, `telecommunication` from 4.93% to 4.11%, `chemistry` from 3.30% to 2.72%. At leaf grain, **both compositions read off the same tree**, the two nearest of 152 exchange places:

| | by legible fraction | by file |
|--:|---|---|
| 1 | `cs.SY` 0.3965 | **`cs.CL` 0.3900** |
| 2 | `cs.CL` 0.4013 | `cs.SY` 0.3916 |

Measuring both ways on one tree is what attributes the swap to the composition: the committed reports also moved because the corpus grew by the three files this chunk added, and a before-and-after taken across two commits cannot tell the two causes apart.

That closes the defect `PinnedSubjectFindings` had recorded as open — but by 0.0016 bits, which is inside the margin that class already declines to assert an order across, so the pin asserts the leading pair and not their order. The explanation the defect carried was wrong: it blamed the vaguest description arXiv publishes, `cs.ET`, which was twelfth at 0.5388 throughout. Chunk 6's length-matched null is still what would make the order worth asserting.

### Chunk 2 — Read two licences, then name the panel

**First, settle the target vocabulary**, because every later chunk matches against it. Read ACM CCS's stated terms: if they permit use in indexing and redistribution of the concept list, CCS is the target; if they are educational-and-research only, the target is PyPI Trove's `Topic ::` classifiers under Apache-2.0, with GitHub's topic descriptions (CC BY 4.0) supplying the prose the description arm needs. Record the answer and the URL read in the resource's provenance header, which is where this repository already keeps such things.

**Settled: the target is PyPI Trove.** ACM states, at [acm.org/publications/class-2012](https://www.acm.org/publications/class-2012) read 2026-08-15, that "the full CCS classification tree is freely available for educational and research purposes in HTML format". Educational and research use is not redistribution in a published artefact, so CCS is out as a bundled target — it stays readable as prior art. Trove is verified Apache-2.0 at [pypa/trove-classifiers](https://github.com/pypa/trove-classifiers): **321 `Topic ::` classifiers, 25 roots, hierarchy by `::` to depth 4**, which is the hierarchy `CorroboratedTerms` requires. Its weakness stands as the plan predicted — no definitions — so GitHub's topic descriptions under CC BY 4.0 remain what the description arm needs.

Neither page is reachable from the build or from an agent's shell: `acm.org` answers a Cloudflare challenge to `curl` whatever user-agent it states. It was read in a browser, which is worth writing down so the next reader does not spend the attempt again.

**Then build the manifest** from Apache DOAP: for each of the 255 Java projects, one category token, the source URL and the retrieval date. **Cite rather than copy** — a category token per member is a fact, where a wholesale copy of a curated list is an adaptation of it, and two of the alternative label sets are share-alike (F-Droid's are AGPL-3.0, awesome-java's CC BY-SA 4.0). The manifest's `stated-by` column already has this shape.

**Practical constraint.** The forked Gradle JVM has no network route. The DOAP aggregate must be fetched in the user's own shell and passed in as a local path, with a checksum recorded in the manifest so a later run can tell it is reading the same file:

!curl -sS -o /tmp/asf-projects.json https://projects.apache.org/json/foundation/projects.json

**Measurement.** Members named, categories covered, and the count dropped by filtering `retired` and `no-tlp-doap`, which occupy 115 of the 375 category slots. **Ends if** fewer than five categories retain at least five Java members, in which case the panel is too thin to test anything and F-Droid becomes the first arm instead.

### Chunk 3 — Read the panel and report what happens

Run the existing reading over the named members via `evaluationRead` and report per member: λ, the share of mass settling on no subject, files that did not parse, and wall clock. No classification yet.

**Measurement.** Does λ = 0.983 reproduce off this tree, and does the unplaced share stay near 75.5%? **Ends if** the reading fails rather than reports on a substantial fraction of members — that is a defect to fix before any finding rests on it. **Blocked on** chunk 2, and on the members being cloned locally, which is again the user's own shell rather than the build.

### Chunk 4 — The decisive test, on concept match alone

For each member, the set of taxonomy concepts it declares, through the existing `TermSpans` and `CorroboratedTerms` path. Then: **mean pairwise divergence between members sharing a DOAP category against mean pairwise divergence between members of different categories, with the p-value obtained by shuffling the category labels across members** ([Ojala & Garriga, JMLR 11, 2010](https://jmlr.org/papers/v11/ojala10a.html)).

Report no accuracy against a foreign taxonomy and no F1@k: neither carries a bound that follows from its definition here, and a winner must qualify against a chance-expected maximum.

**Measurement.** The within-category mean, the between-category mean, and the permutation p-value. **This is the kill line.** If the statistic does not clear its null, stop: the reading is measuring Java rather than subject matter, and chunks 5–8 are building on sand. **Blocked on** chunks 2 and 3.

### Chunk 5 — Concept match as a ranked assignment

Turn the match into an answer: for each category, the share of that category's subtree the repository writes, corroborated by branch, ranked. The score must be bounded by its own definition — a share of a subtree bounds at 1 — and judged against a null drawn from the taxonomy itself rather than a chosen threshold.

**Measurement.** On the panel, how often the stated category appears first, and in the first three, against two trivial baselines measured beside it: the majority category, and BM25 over the repository's README against the category descriptions. **Ends if** it does not beat both. **Blocked on** chunk 4 passing.

### Chunk 6 — Fix the description arm

Two changes, both from the same finding. Draw the null **at each category's own description length** rather than a common one, and pool a category's subtree descriptions to its root the way a package's rungs are already pooled — which is Song & Roth's own aggregation and the direct precedent for it.

Before either, run the truncation study, which needs no panel and no new resource: truncate each arXiv description progressively — full, 1/2, 1/4, 1/16 — and record the point at which the winning subject changes. **Measurement.** If the ranking changes before 1/4, the present placement is measuring description length, and that is a finding to publish in the reports whether or not the fix lands. **Blocked on** nothing.

### Chunk 7 — The dependency arm

Read the coordinates `ImportOrigins` already sorts as third-party as evidence in their own right: the artefact denotes one published thing, so no dictionary is asked and no sense is disambiguated. A coordinate is matched against the taxonomy by the same span walk the concepts use.

**Measurement.** On the panel, the same first-place and first-three counts as chunk 5, from coordinates alone. The interesting number is not whether it beats the concept arm but whether it is **wrong in different places**, because that is what makes combining them worth anything. **Blocked on** chunk 4 passing.

### Chunk 8 — Combine the arms, and measure against the baselines

Combine the three arms. The combination must be derived rather than chosen: pool where this library pools — log-linear over the arms, which is the operator that does not double-count dependent evidence ([Genest & Zidek 1986](https://projecteuclid.org/journals/statistical-science/volume-1/issue-1/Combining-Probability-Distributions-A-Critique-and-an-Annotated-Bibliography/10.1214/ss/1177013825.full)) — and weight each arm by a figure it reports about itself rather than by a constant fitted here.

**Measurement.** First-place and first-three counts on the panel against the majority-class and BM25 baselines, with the per-arm figures beside the combination so that an arm carrying nothing is visible. Report the tail explicitly: the categories with fewest members are where this will fail, and a headline that hides them is the propensity-scored-precision lesson from extreme multi-label classification restated. **Ends if** the combination does not beat its best single arm — in which case ship the arm and delete the combiner. **Blocked on** chunks 5, 6 and 7.

# The literature on recovering semantic content from arbitrary text

A survey of computational linguistics as it bears on this library's problem, conducted 2026-08-15 over six
parallel reviews: lexical-semantic resources, word-sense disambiguation, subject and topic discovery,
multiword expressions and identifier splitting, the software-engineering literature on the semantic content
of code, and statistical methodology for corpus comparison.

This document records what the field has measured, which of those results are admissible under this
repository's evidence rules, and what each proposal would have to move to be adopted. It is a plan in the
sense the other documents here are: every proposal carries the measurement that settles it and the condition
that ends it.

## 1. Method and verification status

Six reviews ran independently against the pipeline as it stood at commit `ecafc13`, each briefed on the
evidence rules in `CLAUDE.md` and instructed to state plainly where a method violates them. Figures were
required to carry a primary source.

Three classes of figure appear below and are marked where they differ:

1. **Measured in this repository** during the survey. These are reproducible from the tree: the arXiv
   description lengths (§4.2), the collocation inventory counts (§5.1), the four arithmetic properties of the
   current code (§4.1, §4.3), and the UAX #29 rule text (§3).
2. **Verified by a reviewer against a decoded primary document** — a fetched PDF or an ACL Anthology page.
   Unmarked figures are of this kind.
3. **Unverified**, marked ⚠ inline. These are second-hand summaries where the primary was unreachable
   (paywall, TLS failure, or a host refusing automated fetches).

One methodological failure is recorded because it bears on how much weight this document can carry: during
the survey, **one automated fetch of the JAIR paper on Explicit Semantic Analysis returned a fabricated
results table** which was plausible in format and wrong in content. It was caught by decoding the PDF text
locally and comparing. Two reviewers additionally corrected their own headline figures unprompted; both
corrections are carried in §6.2 and §7.3. A reader should treat any figure here not marked as measured in
this repository as carrying the residual risk that survived that process.

## 2. Results that corroborate the current design

Four positions this library already holds are supported by published measurement. They are recorded because a
design defended only by its own reasoning is weaker than one the field has independently tested.

**2.1 Recording no vote is a published strategy, not a shortfall.** The reading currently settles 75.5% of
observed mass on no subject. The closest published analogue uses the same resource: Magnini et al.'s
domain-driven disambiguation at SENSEVAL-2 reports **precision .748 at recall .357** on English all-words, and
the authors attribute the low recall to the fact that "few words in a text carry relevant domain information"
([Magnini et al. 2001](https://aclanthology.org/S01-1027/)). In identifier splitting, the Conservative Split
technique attains **precision 1.00 at mean accuracy 0.71** on the Ludiso oracle by declining any split it
cannot justify. High precision with a large declared-unreadable fraction is the published shape of this class
of reading.

**2.2 Reading a category's own description is the only approach that survives without examples.** Step 7 pools
each arXiv subject's own prose through the same pipeline as the repository. On EURLEX57K, a taxonomy of 4,271
EuroVoc labels, BERT-BASE attains RP@5 **0.835 on frequent labels and 0.028 on zero-shot labels** — a
thirty-fold collapse — and only the architecture that reads the label's own descriptor recovers anything,
at **0.438** ([Chalkidis et al. 2019](https://ar5iv.labs.arxiv.org/html/1906.02192)). The honest operating
point for leaf-level placement is lower than that: SciPrompt reports **22.28% zero-shot accuracy over 53
arXiv subcategories** ([Sun et al. 2024](https://ar5iv.labs.arxiv.org/html/2410.01946)).

**2.3 Software-specific segmentation is necessary, and general-English tooling underperforms on identifiers.**
Newman et al. report an identifier part-of-speech ensemble at **75% identifier-level and 84–86% word-level
accuracy, +17 percentage points over the best single general-English tagger** (TSE 2021). POSSE tags
identifier parts of speech 11–20% more accurately than general taggers over 310 Java and C++ identifiers by
using signature structure as context ([Gupta et al.](https://www.eecis.udel.edu/~pollock/879tainsef13/samir-postagging.pdf)).
The field's answer to thin context in code has consistently been more structure, never more text, which is
the position `ParsedRepository` already takes by reading declarations rather than uses.

**2.4 Document-level resampling is the correct null.** `PermutationNull` resamples files, not tokens.
Mildenberger shows the token-level sampling model behind the standard keyness tests is the specific reason
they produce false positives — words clump in documents — and that resampling texts "is much closer to the
way corpora are actually assembled" ([Mildenberger 2023](https://arxiv.org/pdf/2308.13383)). Separately,
`PermutationNull.Chance.chanceRate` computes `(b+1)/(m+1)`, which is exactly the estimator of
[Phipson & Smyth (2010)](https://pubmed.ncbi.nlm.nih.gov/21044043/); the javadoc does not currently cite it.

## 3. Resolved during the survey: the letter/digit boundary

`THE_SPLITTER.md` recorded rule 4 as blocked on a catalogue of cited tokens. The blocker was misidentified.

[UAX #29](https://www.unicode.org/reports/tr29/) states rules **WB9 (`AHLetter × Numeric`)** and **WB10
(`Numeric × AHLetter`)**, where `×` is defined in the annex's own Table 1 as *do not allow break here*, under
the prose "do not break within sequences of digits, or digits adjacent to letters (`3a`, or `A3`)". The annex
states that it "may be cited as a normative reference by other specifications". This is a boundary rule
published by a standards body and is therefore grammar of the kind this library admits, in the same class as
the acronym-run rule and not in the class of a token list.

The code already behaved this way. What was missing was the citation, which landed in commit `8c65a40`
together with the correction of two documents that claimed `Tokeniser` splits on digit boundaries; its
splitter is `(?<=[a-z])(?=[A-Z])|[_\-]` and never has. A catalogue of cited tokens is what would be needed to
**override** the Unicode default for a particular run, not to obey it.

The contrast with the state of the art is instructive. Ronin, the current best-performing identifier splitter
(**84.42% on Ludiso**, 2,248 of 2,663; **92.09% on INTT**, 17,287 of 18,772), ships a hand-written
`constants.py` of special terms containing exactly `utf8`, `ipv4` and `J2SE`, which its own README describes
as "surely incomplete". ⚠ *Ronin's accuracy figures and the constants file were verified by a reviewer against
the repository and paper; the JOSS DOI was not independently confirmed here.*

## 4. Defects identified

### 4.1 Every divergence weights a file by its own legibility

`TopicDistribution.meanOf` averages the per-file share vectors uniformly and averages `unplaced` separately.
`amongWhatWasPlaced` then divides by (1 − ū). The composition of the two is

&nbsp;&nbsp;&nbsp;&nbsp;Σ_f (1 − u_f) · p_f ⁄ Σ_f (1 − u_f)

so each file's weight in the comparison is its own legible fraction, not 1/N. At the recorded 75.5% unplaced
mass and the observed file-to-file variation, a file legible at 60% carries approximately 2.4 times the weight
of one legible at 25%. The class javadoc states that each file is one observation; that holds for the
intensity reading and does not hold for any divergence computed from it, which includes every figure in the
scope comparison and the field placement.

**Measurement that settles it.** Recompute each scope's divergence renormalising per file before averaging,
and report Spearman ρ between the two topic rankings. A correlation below 0.9 makes the documented claim false
in practice as well as in principle.

### 4.2 The field placement may be reading description length

The 152 arXiv subject descriptions have a **median of 18 words** (mean 28, quartiles 12 and 35, minimum 3,
maximum 157), measured from `arxiv-taxonomy.tsv`. They are compared against a repository of approximately
75,000 word occurrences.

Explicit Semantic Analysis is the closest published analogue to this comparison. Song and Roth report that ESA
cosine similarity falls from **87.75% to 46.64% — below chance — when documents are truncated to 1/16 of their
length**, because the two sides cease to share support ([Song & Roth 2015](https://aclanthology.org/N15-1138.pdf)).
The degradation is not graceful; the ranking inverts. `PinnedSubjectFindings` already records the related
defect that the nearest single subject is not `cs.CL` and names a null drawn at each subject's own description
length as what would settle it. This result reclassifies that from an improvement to a correctness check.

A second sensitivity is documented in the same line of work: rewording the category descriptions alone moved
20-Newsgroups micro-F1 from **0.625 to 0.682** ([Song & Roth 2014](https://cdn.aaai.org/ojs/8938/8938-13-12466-1-2-20201228.pdf)).
arXiv's prose is fixed and cannot be tuned without marking one's own homework, so this is a limit to state
rather than a parameter to adjust.

**Measurement that settles it.** Truncate each description progressively — full, 1/2, 1/4, 1/16 — and record
the point at which the winning subject changes. If the ranking changes before 1/4, the placement is measuring
description length. This requires no panel and no new resource.

### 4.3 The chance-expected-best bar assumes independence, and rests on few order statistics

Two separate exposures in the same mechanism.

**Independence.** `ChanceExpectedBest` takes the 1/(n+1) quantile of a single scope's null distribution, which
is the expected maximum of n **independent** draws. The scopes of one repository share vocabulary, authorship
and a sampling pool, and are positively dependent. The maximum of positively dependent statistics is
stochastically smaller than the independent maximum, so the current bar is conservative and the reading loses
findings it should report. The standard correction is the max-T permutation procedure of Westfall and Young,
in which each permutation contributes the maximum statistic across all scopes, so dependence enters the null
by construction ([Ge, Dudoit & Speed](https://statistics.berkeley.edu/sites/default/files/tech-reports/633.pdf)).
It requires no additional draws: one shuffle already produces a pool every scope can be sampled from.

**Resolution.** `ChanceExpectedBest.quantile` is `drawn / (field + 1)`. For the 152-subject field at 999 draws
this is 6, so the bar is the seventh smallest of 999 values and is estimated from approximately six order
statistics. The count below that quantile is Binomial(999, 1/153), with mean 6.5 and standard deviation 2.55 —
roughly 39% relative noise at one standard deviation.

**Measurement that settles both.** For independence: count qualifying scopes under each procedure at a fixed
seed, on repositories this reading was not written for. For resolution: run the subject null at 999, 10⁴ and
10⁵ draws over ten seeds and report the seed-to-seed variance of the winning subject. A non-zero variance at
999 establishes that 999 is too few.

### 4.4 Two pooling operators for the same kind of evidence

`PhraseTopics` combines the agreeing words of a phrase by a geometric mean. `PooledLogOdds.pool` is
`weights.sum()`, which is the independence assumption. Log-linear pooling is the externally Bayesian operator
([Genest & Zidek 1986](https://projecteuclid.org/journals/statistical-science/volume-1/issue-1/Combining-Probability-Distributions-A-Critique-and-an-Annotated-Bibliography/10.1214/ss/1177013825.full));
linear pooling satisfies coherent marginalisation instead, and no operator satisfies both. The words of one
identifier are maximally dependent, having been chosen together by one author, so the geometric mean is the
defensible choice there. The axis reading uses the dependence-naive operator on evidence of the same kind
without stating why.

### 4.5 Simpson's index carries a richness-dependent floor

`PhraseTopics.Reading.coherence` is Σp², bounded above at 1 by definition and **bounded below at 1/S**, where
S is the number of subjects the phrase agreed on. A phrase agreeing on two subjects scores at least 0.5; one
agreeing on eight scores at least 0.125. The raw index therefore conflates richness with evenness; the
standard correction is to convert to effective numbers ([Jost 2006](https://pdodds.w3.uvm.edu/research/papers/others/2006/jost2006a.pdf)),
or to normalise as (λ − 1/S)/(1 − 1/S), which equals 1 when S = 1 and takes both endpoints from λ's own range
at the observed S.

**Measurement that settles it.** Report the correlation between raw λ and S across all phrases. A strong
negative correlation confirms the floor is doing the work.

## 5. Resources assessed

### 5.1 Admissible and cheap

| Resource | Size | Licence | Question it answers |
|---|---|---|---|
| **WordNet lexicographer files** | 45 categories over **117,791 / 117,791 synsets (100%)** | Princeton, free for any purpose | What kind of thing a sense is. Already on the classpath: `Synset.getLexFileName()`, used today for `noun.person` |
| **WordNet `;c` domain-topic pointers** | **6,471 synsets (5.49%)**, 6,690 pointers, 440 topics | as above | Princeton's own topic assertion, independent of FBK's |
| **eXtended WordNet Domains** | a probability per WordNet 3.0 synset over **170 domains** | CC BY 3.0 | The 48.5% of lemmas WordNet Domains never labels, graded rather than single-label |
| **WordNet multiword lemmas** | **64,225**, of which **31,248 are outside the shipping collocation index (+44.8%)** | as above | Additional runs for `CollocatedWords` to read as one word |
| **Roget's Thesaurus, 1911** | 6 classes, ~1,000 heads, ~15,000 words | public domain (US) | A second published subject hierarchy for step 7, under no conditions |
| **Open English WordNet 2025** | 120,564 synsets; 41.3% of written forms multiword | CC BY 4.0 | Current vocabulary; its WNDB build is drop-in for extJWNL |
| **Leipzig co-occurrences** | per corpus | CC BY 4.0 | Collocation scores computed by the publisher of the frequency list already bundled |
| **IANA registries** | ~250 rows each | CC0 1.0 | Whether a run of letters and digits is one published token |

The lexicographer files are a distinct axis — `noun.artifact` states an ontological kind and says nothing
about subject matter — so they must not join the topic distribution. They are the closed enum
`AxisEvidenceAccumulator` already partitions over.

The WordNet multiword count was measured in this repository during the survey. Its **value is unproven**: the
surplus over the shipping index is dominated by Linnaean binomials and personal names (`strix_occidentalis`,
`genus_curcuma`, `anthemis_cotula`), with a minority of ordinary compounds (`power_plant`, `guidance_device`).
These lemmas carry no topic label, so reading one as a single word removes its constituent words' votes and
supplies nothing in their place unless the run genuinely is a term.

### 5.2 Refused

| Resource or method | Doctrine line | Independent reason |
|---|---|---|
| **BabelDomains** | an embedding is not a citation — 1.31M of 2.68M tags come from NASARI vector similarity thresholded at a chosen 0.35 | Loses on its authors' own gold set: **P 81.7 / R 68.7 / F 74.6** against WordNet Domains 3.2's **P 93.6 / R 64.4 / F 76.3**. Also CC BY-NC 3.0 |
| **BabelNet** | — | Licence restricts use to research institutions |
| **ConceptNet** | a curated observation of a corpus is not citable | CC BY-SA 4.0 forbids inclusion in a data set with an incompatible licence |
| **USAS / Lancaster semantic lexicon** | a hand-built lexicon is a list of words | Non-English lexicons CC BY-NC-SA 4.0; the English lexicon is licensed through Wmatrix rather than redistributed |
| **FrameNet, VerbNet, PropBank, NomBank** | — | Irrelevant rather than inadmissible: a frame states argument structure, not subject matter. VerbNet 3.4 additionally ships **no licence file at all** |
| **Every supervised or neural WSD system** | an embedding is not a citation; trained on hand-annotated SemCor | ConSeC's margin comes from conditioning on the senses of surrounding words, which a 1–4 word identifier does not have |
| **Unsupervised topic models as evidence** | a reading must name what it found and cite who named it | Held-out likelihood moves *against* interpretability ([Chang et al. 2009](https://papers.nips.cc/paper_files/paper/2009/hash/f92586a25bb3145facd64ab20fd554ff-Abstract.html)) |
| **C-value / NC-value / ATR4S / TermSuite** | a 229-word stop list built by hand from a 1/10 sample of the scored corpus | Precision **31–38%** over the full candidate list; the authors report only "'relative' rather than 'absolute'" precision, and their recall figures exceed 100%. TermSuite's ACL 2016 demo reports no evaluation at all |
| **TextRank, YAKE, RAKE, KeyBERT as evidence** | output is a corpus n-gram with no publisher | Best of them scores **34.94** on Inspec against **28.61** for taking the first phrases |
| **Log-likelihood, PMI, t-score, %DIFF, Bayes factors** | a bound must follow from the statistic's definition | All unbounded. Only Dice (≤1), logDice (≤14 by derivation), NPMI ([−1,1]) and JSD (1 bit) qualify |
| **Aitchison / clr–ilr compositional distances** | a bound must be derived; every zero-replacement scheme introduces a chosen detection limit | Unbounded, and undefined at the zeros this reading is full of |
| **Simple Good–Turing, Kneser–Ney** | — | Inapplicable rather than disfavoured: both require a frequency-of-frequencies vector over integer counts, and this library's mass is continuous fractional weight |
| **Benjamini–Hochberg FDR** | requires a chosen q | Family-wise error via the maximum statistic needs no constant; the field size supplies it |
| **Ronin's frequency tables and special-terms list** | a curated observation of a corpus; a hand list | GPLv3 against this project's Apache-2.0 |
| **COCA, collocates.info, Sketch Engine** | — | Licences forbid redistribution of derived frequency or collocate data |

## 6. Word-sense disambiguation at this context length

### 6.1 The most-frequent-sense baseline is close to the ceiling for knowledge-based methods

All figures are F1 on the [Raganato et al. 2017](https://aclanthology.org/E17-1010/) evaluation framework,
7,253 instances over five test sets, as tabulated by [Agirre, López de Lacalle & Soroa 2018](https://aclanthology.org/W18-2505/):

| System | ALL |
|---|---|
| UKB, optimally configured (personalised PageRank, `ppr_w2w`, static dictionary weights, glosses) | **67.3** |
| Babelfy | 65.5 |
| **WordNet first sense (MFS)** | **65.2** |
| UKB as commonly run elsewhere | 57.5 |
| Extended Lesk (Banerjee & Pedersen 2003) | 48.7 |

The best knowledge-based system in the literature exceeds the most-frequent-sense baseline by **2.1 points**,
and required nine years of configuration work to do so. Extended Lesk is **16.5 points below** the baseline.
Simplified Lesk reaches 58% against original Lesk's 42% on Senseval-2 all-words and remains below MFS
([Vasilescu et al. 2004](https://aclanthology.org/2004.jeptalnrecital-long.20/)). Supervised systems reach
72.5–85.2 but require sense-annotated training data and a sentence of context
([NLP-progress](http://nlpprogress.com/english/word_sense_disambiguation.html)).

### 6.2 What the domain literature says about short context

Magnini et al.'s domain-driven disambiguation builds a domain vector over ±50 content words and reports
precision .748 / recall .357 on all-words, falling to .665 / .249 on the lexical sample, which the authors
attribute directly to shorter context. Koeling, McCarthy and Carroll show that the predominant sense moves
with domain, with same-domain estimation beating the SemCor first sense by 8 to 24 points depending on domain
⚠ *(lexical sample of 40 deliberately ambiguous words; absolute numbers are low)*.

No published work evaluates disambiguation at a context of 1–4 words with no surrounding sentence. The
mechanism argues against it: UKB's personalisation vector over so few words approaches uniform, at which point
personalised PageRank approaches the graph's intrinsic centrality, which correlates with WordNet's own sense
ordering — that is, it returns to the most-frequent-sense answer at greater cost.

### 6.3 Proposal

Replace the hard most-frequent-sense selection with a domain-vector argmax conditioned on the file's own
first-pass distribution, recording no vote where no sense wins. The context vector this requires already
exists: `ThemeReading.read` runs two passes and `PhraseTopics.under` holds the file's prior, but that prior
currently scales only the phrase-agreement term and does not participate in choosing the sense. The
computation is O(senses) dot products per word, in process, with no new resource.

**Measurement that settles it.** The share of words whose argmax sense differs from the `getUseCount`
selection. Below approximately 5% the change is cosmetic and should not ship. Above it, report the change in
unplaced mass and in the number of scopes exceeding the permutation null, on repositories this reading was not
written for.

## 7. The backtest panel

This remains the item every other reading waits on. The survey's most directly useful result is a set of
candidate sources with verified licences.

### 7.1 Candidates

| Source | Coverage | Who states the label | Label licence |
|---|---|---|---|
| **projects.apache.org (DOAP)** | 375 projects, **255 declaring Java**; 51 category tokens | Each PMC, in a DOAP document separate from the source | Unstated ⚠ — project code is Apache-2.0 |
| **LabelGit** | 495 Java repositories, 13 categories | Sas & Capiluppi 2021, published and dated | CC BY 4.0 (annotations file only) |
| **F-Droid** | 4,207 apps, 108 categories | F-Droid metadata maintainers | **AGPL-3.0** — copyleft attaches to the label file |
| **awesome-java** | 821 links under 75 headings | One curator, via pull requests | **CC BY-SA 4.0** |
| **github/explore** | 1,255 topic pages | Community; the featured list is editorial and not in the repository | CC BY 4.0 |

Verified absences: **Maven Central**'s POM model has no category, topic or keyword element; **Software
Heritage** carries no domain label of any kind; **50K-C, Sourcerer, MUSE and Boa** carry none. **Debtags** was
discontinued 2023-11-26. Debian's `Section:` is useless here because every Java package lands in `java`.

### 7.2 Construction

Apache DOAP is the strongest arm: an institution states the category, in a document separate from the code,
over a real body of Java. Two defects require handling. `retired` and `no-tlp-doap` are statuses occupying
115 of 375 category slots in the same field as domains, and the vocabulary is uncontrolled. Filtering to the
255 Java projects leaves seven categories with usable mass: `library` 55, `big-data` 29, `build-management` 13,
`database` 12, `xml` 10, `web-framework` 7, `network-server` 6.

F-Droid is the natural second arm because its population is genuinely disjoint — Android applications against
server-side Java libraries — which is what the rule against tuning and measuring on the same data requires.

Because two candidate label sets are share-alike (F-Droid AGPL-3.0, awesome-java CC BY-SA 4.0), `panel.tsv`
must **cite rather than copy**: one category token per member with the source URL and retrieval date. Thirty
tokens are facts rather than a substantial reproduction of an 821-entry list, and this is the shape the
manifest's `stated-by` column already has.

### 7.3 What a first backtest must report

Per-member λ, per-member unplaced mass, and per-member subject placement against that member's own null. The
decisive statistic is none of those:

> Mean pairwise Jensen-Shannon divergence between members sharing an ASF DOAP category, against mean pairwise
> divergence between members of different categories, with the p-value obtained by shuffling the category
> labels across members ([Ojala & Garriga 2010](https://jmlr.org/papers/v11/ojala10a.html)).

**Ending condition.** If that statistic does not clear its permutation null, the subject distribution is
reading Java rather than subject matter, and the topical reading should not be reported for repositories at
all.

Accuracy against a foreign taxonomy must not be reported, and neither should F1@k: neither carries a bound
that follows from its definition here, and a winner must qualify against a chance-expected maximum.

### 7.4 Why the panel cannot be borrowed from the existing literature

The software-engineering literature evaluates almost entirely against labels its own authors produced after
seeing the model output. Baldi et al. validate against a scattering metric they define; Panichella et al.
evaluate on traceability and feature-location proxies; Hindle et al. apply an external requirements taxonomy
after the topics exist, at ROC 0.6–0.8, and the follow-up asks practitioners to interpret topics after seeing
them, reporting that some could not be labelled at all. Repository-classification results — the strongest is
LR+TF-IDF at **F1@5 0.470 / Recall@5 0.890** over 152K repositories and 228 GitHub featured topics (Izadi et
al., EMSE 26:93, 2021) — are inapplicable here because the owner who set the topic also wrote the README the
classifier reads. LabelGit is the nearest to an ex-ante external label and reports **no classifier baseline**;
the only published figure against those labels is a weak-labelling follow-up at approximately **50% of files
and above 50% of packages** correctly annotated. ⚠ *LASCAD and HiGitClass unverified.*

## 8. Proposed work, in order

Each item states what it changes and what would settle it. Nothing here is scheduled; the ordering reflects
cost against the risk each addresses.

1. **Correct the file weighting in every divergence** (§4.1). No new resource. Settled by the Spearman
   correlation between rankings before and after.
2. **Truncation study of the arXiv descriptions** (§4.2). No new resource, no panel. Settled by the truncation
   fraction at which the winning subject changes.
3. **Name the panel** (§7). Blocked only on a decision, not on machinery. Settled by §7.3.
4. **Max-T permutation null** (§4.3). No additional draws. Settled by the count of qualifying scopes under
   each procedure, measured off-tree.
5. **Butler et al.'s 28,000-identifier tokenisation oracle** — 60 Java projects, 16.5 MSLOC — turns
   `Tokeniser`'s documented narrowness into a number without needing a panel.
6. **Domain-vector sense selection under the file prior** (§6.3).
7. **WordNet lexicographer files as a second axis** (§5.1). Settled by the share of the currently unplaced mass
   the 45-way partition receives; below 50%, the second accumulator is not worth building.
8. **eXtended WordNet Domains as a graded vote** (§5.1). Settled by whether the 48.5% unlabelled-lemma gap
   closes without the repository's divergence to its nearest arXiv subject rising.
9. **Permit an adjectival left edge on a published run**, or carry each entry's published part of speech, so
   that `geometric mean` and `lexical semantics` are readable while `out of` remains refused. Settled by
   recounting the 285 refused closed-class occurrences under each variant.
10. **Let a run the dictionary carries whole veto a segmenter split**, which would correct `markdown` read as
    `mark down` by reusing the existing `WordRanks.knows` rule against the 185,768 Wiktionary headwords
    already bundled. Settled on the Ludiso oracle rather than on this tree: a change that improves Ludiso
    accuracy and removes `mark_down` is real; one that only removes `mark_down` here is tuning on the tree.

## References

Agirre, E., López de Lacalle, O. & Soroa, A. (2018). *The risk of sub-optimal use of Open Source NLP Software:
UKB is inadvertently state-of-the-art in knowledge-graph based WSD.* [W18-2505](https://aclanthology.org/W18-2505/)

Chalkidis, I. et al. (2019). *Large-Scale Multi-Label Text Classification on EU Legislation.*
[1906.02192](https://ar5iv.labs.arxiv.org/html/1906.02192)

Chang, J. et al. (2009). *Reading Tea Leaves: How Humans Interpret Topic Models.*
[NIPS 2009](https://papers.nips.cc/paper_files/paper/2009/hash/f92586a25bb3145facd64ab20fd554ff-Abstract.html)

Dunning, T. (1993). *Accurate Methods for the Statistics of Surprise and Coincidence.*
[J93-1003](https://aclanthology.org/J93-1003/)

Frantzi, K., Ananiadou, S. & Mima, H. (2000). *Automatic recognition of multi-word terms: the C-value/NC-value
method.* [IJODL](https://personalpages.manchester.ac.uk/staff/sophia.ananiadou/IJODL2000.pdf)

Gale, W. & Sampson, G. (1995). *Good-Turing Frequency Estimation Without Tears.*
[grsampson.net](https://www.grsampson.net/AGtf1.html)

Ge, Y., Dudoit, S. & Speed, T. *Resampling-based Multiple Testing for Microarray Data Analysis.*
[Berkeley TR 633](https://statistics.berkeley.edu/sites/default/files/tech-reports/633.pdf)

Genest, C. & Zidek, J. (1986). *Combining Probability Distributions: A Critique and an Annotated
Bibliography.* [Statistical Science 1(1)](https://projecteuclid.org/journals/statistical-science/volume-1/issue-1/Combining-Probability-Distributions-A-Critique-and-an-Annotated-Bibliography/10.1214/ss/1177013825.full)

Hausser, J. & Strimmer, K. (2009). *Entropy Inference and the James-Stein Estimator.*
[JMLR 10](https://jmlr.org/papers/v10/hausser09a.html)

Jost, L. (2006). *Entropy and diversity.* [Oikos 113](https://pdodds.w3.uvm.edu/research/papers/others/2006/jost2006a.pdf)

Kilgarriff, A. (2005). *Language is never, ever, ever, random.*
[kilgarriff.co.uk](https://kilgarriff.co.uk/Publications/2005-K-lineer.pdf)

Koehn, P. & Knight, K. (2003). *Empirical Methods for Compound Splitting.*
[E03-1076](https://aclanthology.org/E03-1076/)

Magnini, B. et al. (2001). *Using Domain Information for Word Sense Disambiguation.*
[S01-1027](https://aclanthology.org/S01-1027/)

McCarthy, D. et al. (2004). *Finding Predominant Word Senses in Untagged Text.*
[P04-1036](https://aclanthology.org/P04-1036/)

Mildenberger, T. (2023). *A note on statistical tests for corpus frequency comparisons.*
[arXiv 2308.13383](https://arxiv.org/pdf/2308.13383)

Ojala, M. & Garriga, G. (2010). *Permutation Tests for Studying Classifier Performance.*
[JMLR 11](https://jmlr.org/papers/v11/ojala10a.html)

Phipson, B. & Smyth, G. (2010). *Permutation P-values Should Never Be Zero.*
[PubMed 21044043](https://pubmed.ncbi.nlm.nih.gov/21044043/)

Raganato, A., Camacho-Collados, J. & Navigli, R. (2017). *Word Sense Disambiguation: A Unified Evaluation
Framework and Empirical Comparison.* [E17-1010](https://aclanthology.org/E17-1010/)

Ramisch, C. et al. (2020). *Edition 1.2 of the PARSEME Shared Task on Semi-supervised Identification of Verbal
Multiword Expressions.* [2020.mwe-1.14](https://aclanthology.org/2020.mwe-1.14/)

Song, Y. & Roth, D. (2014). *On Dataless Hierarchical Text Classification.*
[AAAI 2014](https://cdn.aaai.org/ojs/8938/8938-13-12466-1-2-20201228.pdf)

Song, Y. & Roth, D. (2015). *Unsupervised Sparse Vector Densification for Short Text Similarity.*
[N15-1138](https://aclanthology.org/N15-1138.pdf)

Sun, Z. et al. (2024). *SciPrompt: Knowledge-augmented Prompting for Fine-grained Categorization of Scientific
Topics.* [2410.01946](https://ar5iv.labs.arxiv.org/html/2410.01946)

Unicode Consortium. *UAX #29: Unicode Text Segmentation.* [tr29](https://www.unicode.org/reports/tr29/)

Vasilescu, F., Langlais, P. & Lapalme, G. (2004). *Evaluating Variants of the Lesk Approach for Disambiguating
Words.* [2004.jeptalnrecital-long.20](https://aclanthology.org/2004.jeptalnrecital-long.20/)

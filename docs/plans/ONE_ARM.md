# One arm: every declared run, read the same way, placed against every scheme

Three readings reach a subject by three different mechanisms and a fourth reads verbs a fifth way. There is one unit — a run of words from a declared name — and there should be one reading of it.

**The plan runs in three parts, in this order.** First the eight measured defects, because a simplification laid over a defect carries it forward and an iteration judged on a broken figure tunes the breakage. Then the condensation into one arm. Then the loop that looks for better matches, judged on repositories this reading was not written for.

## What the 2026-08-20 session settled, before the defect list

**Topic-level matching is not viable, and three independent lines say so.** Placing a repository among 4,516 OpenAlex topics cannot be made to work, and the plan should stop trying.

| Line of evidence | Figure |
|---|---|
| The null cannot be computed | `999 / (4516 + 1) = 0`, so the bar is the single minimum of 999 draws; across four seeds it moves 0.5225, 0.5763, 0.5608, 0.5523 with the observation inside that spread. arXiv reads the 7th of 999 and is steady |
| The literature says methods collapse at this scale | EURLEX57K, 4,271 labels: BERT-BASE RP@5 **0.835 on frequent labels, 0.028 zero-shot**. Song & Roth's dataless classification: micro-F1 0.682 at **26** labels, 0.371 at **103** |
| The band does not consolidate below field | the modal subfield of a band reaches 4 of 15 at best; every member of Tika's and Maven's bands is under one **field** |

**So the reading places at field, and reports the topic band as context it cannot separate.** Seven to nine of ten in the right field out of 26 is respectable by the published standard; naming one topic out of 4,516 states a precision no instrument here has. This is [D8](#the-defects-and-what-fixes-each) and [D10](#the-defects-and-what-fixes-each) reaching the same conclusion from three directions.

**The other things the session settled**, each with its own entry below or in [the backlog](../../BACKLOG.md):

- The divergence path places and the lexical path does not — 0.4509 against 0.6583 on Tika, **below chance**, once both are scored over the whole scheme rather than over the topics each reading selected for itself.
- The expected result is an identifier in the publisher's hierarchy, never a word in its prose. `security` marked Food Security and Pesticide Exposure; `content` marked Peanut Plant Research.
- Verbs already reach the reading, so the nominalisation step is dropped rather than deferred — and the verbs are D5's evidence: `read` votes `publishing` 1.00, `validate` votes `law` 0.25.
- CSO needs no prose. A subject needs noun phrases and CSO publishes 14,636 at a median of two words, the same as an OpenAlex keyword.
- Two classes state they weigh a signal and compute zero — `PhraseTopics.under` and `WordSpecificity`. [The plan for the first](A_VOTE_NOT_A_GATE.md) runs before everything else in this document.
- The reading could not be argued with from the files it publishes. **That is now closed** — `evidence.json` carries the per-word statements, the removals with the rule that made each, and the unread runs.

## Where the work stands, and the order it now runs in

Measured on the nine evaluation-set members, each change on its own. Nothing below was tuned on this repository.

### What landed

| | State |
|---|---|
| The workings in `evidence.json` | **landed at evidence schema 4.0.** `rules`, `words`, `removed`, `unread`. The reading is unchanged by it — every figure `subjectWitnesses` prints for a held-out clone is identical before and after |
| [D13](A_VOTE_NOT_A_GATE.md), the second pass's gate | **landed.** `expectedIn` is `1 + prior.shareOf(topic)`, bounded in `[1, 2]` by what a share is. `THE_FILE_READ_NOTHING_OF_IT` is deleted with it: the factor can no longer be zero, and a rule reporting no removals when it cannot fire is a false statement in the evidence |
| The parallel backtest | **built.** `evaluationReadAll` reads every cloned member in one JVM, four at a time on a 12 GB heap, against `evaluationRead`'s 31 minutes. One JVM is most of the saving — a bundled scheme is read into distributions once instead of nine times. **31m 36s becomes 6m 33s.** Verified against the serial run on all nine members: every subject, stands-apart verdict, `carriedBy` list and band identical, and of 72 placement figures 50 are bit-for-bit identical with the largest difference 1.67e-16 — the last-place drift any two runs show, because addition over doubles is not associative. Byte-identity is not available and never was: `Map.copyOf` salts iteration order once per JVM, so nine JVMs and one JVM order ties differently |

### D13 is a contract fix and not an accuracy gain, and both verdicts are recorded

Over all 36 level readings, and against the subject area the manifest states for each member:

| | Before | After |
|---|--:|--:|
| stands apart from chance | 31 | **29** |
| mean margin, chance less divergence | 0.0362 | 0.0348 |
| mean divergence | 0.4007 | 0.3860 |
| mean chance bar | 0.4369 | 0.4208 |
| subjects in the bands | 113 | 96 |
| subfield leader in the stated area | 5/9 | 5/9 |
| topic leader in the stated area | 5/9 | 5/9 |
| subfield band reaches it | 6/9 | **5/9** |
| topic band reaches it | 3/9 | **5/9** |

Three readings stopped standing apart — besu, santuario and strata, all at arXiv category — and one started, santuario at OpenAlex topic, whose band went from 0 to 3 subjects, every one of them under Computer Science.

**The divergence and the chance bar fell together**, 0.4007 to 0.3860 against 0.4369 to 0.4208, which is the whole field moving rather than the observation. And **the criterion was written against the wrong mechanism**: the plan expected Santuario to gain `cryptography` "reaching the reading at all", and `cryptography` already reached it through `encryption`, 502 occurrences at a share of 1.00, which the gate never touched. The word `cryptography` itself occurs once, carries no subject, and is untouched by D13.

The stated accuracy criterion — no member's field concentration falls — is **not met**: fineract's subfield band went from 1 of 9 to 0 of 8. The change stays because the javadoc stated a vote and the code was a gate, and it is credited with no improvement.

### D11 is refuted before it was built, on the members

D11 says the dictionaries silence the vocabulary that would identify a repository, and that a label the vocabulary publishes is a word carrying that topic. The first half holds. The second reaches almost none of it.

| Over the nine members | Words no resource states a subject for | Reached by a one-word published label |
|---|--:|--:|
| distinct words | 19,059 | **59 — 0.3%** |
| occurrences | 603,894 | **8,987 — 1.5%** |

The vocabulary that is actually missing is not label-shaped: `market` 5,990 in a market-risk library, `date` 16,752, `identifier` 4,789, `control` 1,828, `event` 862, `result`, `set`. Not one is a subject label in any bundled vocabulary. `time` is, and it is most of the 8,987.

**The figure is in the wrong unit and that is the next thing to fix**, not a reason to discount it: the denominator counts sightings, and copied prose contributes `1/n` of a sighting. So 1.5% is a floor and the mass measure decides.

### The defects the low-level pass found

| | Defect | Measured |
|---|---|---|
| **N1** | Every Finance member places under Computer Science | 4 of 4 miss the stated area at both levels; three lead on an *Artificial Intelligence* subfield. Their finance vocabulary reads correctly — `trade` carries commerce 0.92, `currency` money 1.00, `charge` commerce 0.98, `loan` finance 0.33 and banking 0.33 — and is outweighed by Java and licence boilerplate |
| **N2** | `SenseCoverage.of` states `(0, 1]` and returns `0.0` | `concept`, 641 occurrences here, coverage 0.000. `max(sensesLabelled, headwordClaims)` is zero where WordNet knows the word, labels no sense of it, and no headword topic names it. Third instance of the javadoc-against-code class |
| **N3** | A word English put inside a name is weighed as one the author chose | `OfferedWords.narrowing` returns `1.0` for every word of a declared name and consults `WordSpecificity` only for prose. `from` carries mathematics at 1.00, 169 times. The vocabulary reading has `ChosenWords.theLanguages()` for exactly this and the topical reading has nothing |
| **N4** | OLiA's `part of` is matched as a published term | 19 occurrences, reported, beside CSO's `part of speech` on the same site |
| **N5** | A word the accessor-prefix or source-set rule removes is dropped silently | `PhraseTopics:169`. The same class of rule as D13, and still not in the workings. It is what let `get` be read as carrying `tennis` when `tennis` is in no reading at all |
| **N6** | `workings.words` states a sighting count and not a contribution | `TopicTally:101` records the sighting; `TopicTally:102` then computes what the occurrence is worth, and `CopiedComments` weights copied prose at `1/n`. So the commonest apparently-unread words on every member are Apache Licence 2.0 — `require`, `specific`, `condition`, `except`, `notice`, `fitness` — and 13 to 18% of occurrences look unread because one legal instrument is counted once per file |

### What the low-level pass measured, in mass rather than in sightings

With N6 landed, every figure below is what a word **carried**, not how often it was seen. The two disagree by two orders of magnitude: 4,068,610 occurrences across the nine members carry 169,335 of mass, so an average occurrence is worth 0.04.

**The biggest carriers are each repository's own subject matter, and no boilerplate is among them.**

| Member | Top carriers by mass |
|---|---|
| fineract | `client` 1848, `transaction` 1521, `loan` 1362, `charge` 1049, `amount` 1035 |
| strata | `trade` 1350, `compute` 1061, `builder` 1031, `name` 968 |
| besu | `transaction` 750, `header` 696, `gas` 464, `world_state` 433, `peer` 425 |
| tika | `metadata` 2312, `handler` 568, `parser` 432 |
| santuario | `algorithm` 324, `uri` 264, `xml` 241, `cert` 230, `c14n` 133 |
| maven | `dir` 1055, `verifier` 1009, `pom` 733, `artifact` 486, `dependency` 358 |

`property`, `get`, `test`, `value`, `date`, `require` and `specific` are in no member's top six. **The reading already weighs boilerplate down to nothing**, and every claim that it does not was taken from a sighting count.

**Two named defects die here.**

| | Verdict |
|---|---|
| **D11** | **Refused.** Words that carried nothing: 19,373 distinct over 587,919 occurrences. Reachable by a one-word published label: **72 distinct, 9,081 occurrences — 0.22% at the ceiling**, and the ceiling assumes each reached word would carry like an average one. None of `market`, `date`, `identifier`, `control` or `event` is a label anywhere. The dictionaries do silence the vocabulary that identifies a repository, and relabelling the labels does not reach it |
| **N2** | **Not live.** Zero words across nine members carried mass with a sense coverage of zero. `SenseCoverage.of` returns zero only for words nothing asks about, so the stated `(0, 1]` holds wherever the value is read. The javadoc states its domain wider than its use, which is a note and not a defect |

**N3 is live, small, and the leading witness of a placement topic.** English function words carry 0.80% of all mass, every occurrence written as a name so `narrowing` gives it 1.0. `from` carries 569 in fineract and 193 in besu, and **`from` is the largest single witness for `mathematics`** — a topic reaching every placement of both finance members.

### N1's mechanism, and the fix is a map already bundled

The finance members' finance vocabulary reaches the placement and reads correctly. It is **split across six labels while the software signal concentrates in one**.

| Member | Topics reaching any placement |
|---|---|
| fineract | `computing` 10.1%, `law` 6.9%, `economy` 5.3%, `linguistics` 4.6%, `mathematics` 4.3%, `finance` 3.1% |
| strata | `computing` 8.4%, `mathematics` 7.7%, `linguistics` 4.4%, `finance` 4.1% |

Read the witnesses and the split is plain. Fineract's `finance` rests on `loan` ×31,589, `transaction` ×12,695 and `interest_rate`; its `law` rests on `loan` ×31,589, `client` ×8,835 and `approve`; its `economy` on `repayment` ×5,330 and `disbursement`. **`loan` votes `finance` 0.33, `banking` 0.33 and `law` 0.33**, so two thirds of the strongest finance signal in the tree arrives under two other headings. Strata's `finance` rests on `time_to_expiry`, `volatility` and `strike_price`, which is exactly right, and is outweighed by a `computing` carried by `hash_code` and `metadata`.

**The publisher states the relation and the reading does not use it.** From the bundled topic hierarchy:

| Label | Generalises to |
|---|---|
| `finance`, `banking`, `commerce` | `business` |
| `money` | `business`, `finance` |
| `economy`, `law` | nothing stated |

So a repository writing `banking` and a subject description writing `finance` share `business` in the publisher's own map, and never meet, because the comparison runs over literal labels. `StatedTopics` walks that map to **fold implied labels away**, which is right for counting one word's observations and is the opposite of what a comparison between two distributions needs.

That is the half of [D13](A_VOTE_NOT_A_GATE.md) that was written and not built — *the bonus runs through the published hierarchy* — pointed at the comparison rather than at the prior. It is derived from a bundled resource, nothing is chosen, and it is the first candidate for N1.

### The order

1. ~~**N6**~~ — **landed.** `workings.words` states what each word carried and whether it was ever written as a name, beside how often it was seen.
2. ~~**The D11 pre-check in mass**~~ — **run, and D11 is refused at a ceiling of 0.22%.**
3. ~~**N2**~~ — **not live.**
4. **N5**, which costs no measurement: the accessor-prefix and source-set rules remove a word from its phrase and write nothing down. It is what let `get` be read as carrying `tennis`.
5. **N3**, measured on its own. Small at 0.80% of mass and it leads `mathematics` on the member where `mathematics` reaches every placement.
6. **N1 through the published generalisation map**, which is the one candidate with a bundled resource behind it. Not a new scheme and not a synthesised taxonomy: neither touches the repository's own distribution, which is where the dilution is.

## The defects, and what fixes each

Every one is measured, and the measurement is named beside it. The plan runs in this order — fix what is known broken, then condense, then iterate — because a simplification laid over a defect carries it forward, and an iteration judged on a broken figure tunes the breakage.

| | Defect | Measured | The fix, and why it is derived |
|---|---|---|---|
| **D1** | A one-word term is matched inside a longer compound and counted whole. `Source` is 189 occurrences and every one is `EvidenceSource`, `SourceAnchor`, `ReadingSource`, `AsciiDocSource` — never the name itself | the term matches in `evidence.json` | ~~**Coverage.** Weight a match by the share of the declared run it covers~~ — **built, measured and reverted.** Two derived denominators both lower the ranking on the evaluation members and neither demotes `Source` here; the [figures are below](#coverage-was-built-measured-and-reverted). The share is reported as `shareOfEachName` and weights nothing |
| **D2** | The branch rule corroborates noise with noise. `Source` is admitted because eight siblings under `TextStructuralUnit` were written — `Abstract`, `Author`, `Citation`, `Document`, `Heading`, `Headline`, `Sentence`, `Title` | the siblings, read off the same file | ~~**Corroboration by strength, not by count**~~ — **built twice, measured twice and reverted.** The siblings are not ordinary English by the vocabulary reading's own measure: this repository writes `document` and `citation` more densely than English and the platform do, so both clear the null and the branch stays occupied. The [figures are below](#corroboration-by-strength-was-built-twice-measured-twice-and-reverted) |
| **D3** | A publisher's paragraph is read for a term the repository never meant. OLiA's `Source` is a news-article attribution schema; this repository means origin-of-data | the concept reading's leading contributors | ~~Falls out of D1 and D2~~ — **it does not, and that is now measured.** Four rules were built across D1 and D2 and `Source` leads under all four, because the two sides agree on the string, the branch and the vocabulary and differ only in sense. **D3 is the defect**, and it needs [sense disambiguation](SENSE_DISAMBIGUATION.md) rather than a weight |
| **D4** | Half of what the concept rung reads is citation apparatus | 48% of OLiA's 1,216 definitions carry a URL, 47% a bracketed citation, 15% are under eight words; the commonest bracketed tokens are `http`, `org`, `www`, `purl`, `isocat`, and `Carlson` 79 times | Read the statement a publisher makes about subject matter, not the statement it makes about provenance. **Unsettled**: whether that separation can be derived from what SKOS distinguishes, or is a rule about one publisher's formatting and therefore refused |
| **D5** | `law` 3.8% and `publishing` 7.1% are this project's own machinery vocabulary — `file`, `witness`, `summary`, `claim`, `verdict`, `cite`, `evidence` — and they reach three of the top eight subjects | this plan's baseline, and the witnesses behind it | **Unsettled.** A reading cannot refuse a word for being the reader's own without a list. What can be measured is how much of the placement rests on them, which the placement's `carriedBy` states once step 3 exports it |
| **D6** | Mass counts occurrences without asking what the match was worth | `PhraseSpecificity` is computed on every sighting and votes on nothing | Weight the pooled mass by it. Already bounded in `[0,1]` by the frequency list's own length |
| **D7** | CSO reaches no rung above the dictionary, and its structure is unextracted | 0 of 14,636 rows state prose; `sameAs` 19,297, `relatedEquivalent` 10,181, `relatedLink` 8,803 unextracted | ~~**Prose is not available at any price**, so CSO's abstention is permanent~~ — **refuted.** That rested on a subject needing prose, which stopped being true when OpenAlex was read from its keywords. What a subject needs is noun phrases, and CSO publishes 14,636 of them at a **median of 2 words, the same as an OpenAlex keyword**, plus 5,475 stated synonyms and 5,601 topics with narrower topics beneath them. CSO becomes a scheme to place against, read the way OpenAlex now is |
| **D8** | The leader is inside a tie band the instrument cannot resolve | eight OpenAlex topics within 0.033 bits, the first two separated by 0.0001 | Report the band rather than the leader. A placement that names one subject out of a tie is stating a precision it does not have |
| **D9** | OpenAlex's own description template is read as subject matter | all 4,516 descriptions open *This cluster of papers*; the 14 words in more than half of them carry 36% of every description's word tokens, against arXiv's one (`and`, which WordNet refuses). Eight labels sit on **100%** of topics — music, chemistry, rock-paper-scissors, military, phonetics, astronomy, epidemiology, finance — which is the dictionary reading `cluster` and `paper`. Two topics stand 0.6147 bits apart read from the prose and 0.7986 from the keywords | Read the keyword statement, which OpenAlex publishes as its second account and the extraction already separates. **Measured and not settled**: keywords raise Tika 0.658 → 0.701 and lower Santuario 0.680 → 0.636, and D10 stops the null arbitrating |
| **D11** | The dictionaries silence the vocabulary that would identify a repository | `cryptography` votes nothing — 0 votes, coverage 0.000 — and 470 of the topic vocabulary's 719 labels are not headwords of themselves. `signature` votes `linguistics` 0.42, `law` 0.42, `cryptography` 0.04 | A label the vocabulary publishes is a word carrying that topic, read through the same splitter as everything else. Derived from the resource; measured on the members |
| **D13** | The second pass is a gate that states it is a vote | `PhraseTopics.under`'s javadoc says *a topic the file has never read at all is not in the prior and so cannot be conditioned on*; `expectedIn` returns `prior.shareOf(topic)`, which is `0.0`, and `if (score > 0.0)` drops it. **Now measured**: 511 readings over 201 topics on this tree, every one of them a topic pass 2 introduced | `1 + prior.shareOf(topic)`, bounded in `[1, 2]` by the share's own definition, the bonus walked through the generalisation map. [The plan is written](A_VOTE_NOT_A_GATE.md) and it runs before D11 and D12 |
| **D12** | No sense is ever selected, and both sides lose the same vocabulary | `sign` votes `telecommunication` 1.00 in the signal sense; `read` votes `publishing` 1.00; `validate` votes `law` 0.25 | Withhold a sense the file's own first pass does not support. The two-pass prior already exists in `PhraseTopics.under`. **The risk is self-reinforcement** — a first pass landing on `publishing` would entrench D5 — so a seed set and a confidence floor come with it, as Yarowsky's own method does |
| **D10** | At topic level the chance bar cannot be computed | `999 / (4516 + 1) = 0`, so the bar is the single minimum of 999 draws. Across four seeds it moves 0.5225, 0.5763, 0.5608, 0.5523 with Santuario's observation at 0.5362 inside the spread — *within chance* at one seed and *stands apart* at three. arXiv reads the 7th of 999 and is steady | Derive the resample count from the field, or report topic level as unresolved and place at subfield, where 999 draws read the 3rd. **Blocking**: the instrument's jitter is 0.054 bits and the effects being tested are 0.03 to 0.04 |

~~**D1 and D2 are the two that decide the rest**~~ — **both are now measured and both are refused.** Four rules were built between them, each a bound derived from a resource already in the tree, and every one either lowers the ranking on the evaluation members or trips the abandon criterion, while none removes `Source`. The reading is unchanged by all four. **What decides the rest is D3**, which the two of them were expected to close and do not.

## What the published literature says this is worth, and it is not encouraging

Read out of [the research note](../reference/SEMANTIC_ANALYSIS.md) after the fact, and it reframes what a good figure here would look like.

**The architecture is the recognised one.** *"Label-description similarity — embed `skos:prefLabel` + `skos:definition`, cosine against the document — is cheaper and often as good"* is the divergence path, minus embeddings.

**The scale is where published methods collapse.** On EURLEX57K with 4,271 EuroVoc labels, BERT-BASE reports RP@5 of **0.835 on frequent labels and 0.028 on zero-shot labels**, a thirty-fold collapse. Song & Roth's dataless classification reaches micro-F1 0.682 at **26 labels** and 0.371 at **103**. This reading places among **4,516** labels, zero-shot.

That is independent confirmation of [D10](#the-defects-and-what-fixes-each), reached from the literature rather than from our own null: **field level (26) is where these methods work and topic level (4,516) is where they do not.** Seven to nine of ten in the right field is respectable by that standard; naming the right topic out of 4,516 may not be achievable at all.

**The metric flatters us.** `PSP@k` — propensity-scored precision, Jain, Prabhu & Varma (KDD 2016) — reweights by inverse label propensity and is what exposes tail failure; AttentionXML on EUR-Lex reports P@1 87.12 against PSP@1 44.97. This plan quotes precision at ten with no propensity correction.

**Two baselines are unrun and are the floor.** TF-IDF and BM25 over the same descriptions. The note is blunt about it — plain TF-IDF beats every graph-based keyphrase method on Inspec, and *"if you have not run FirstPhrases and TF-IDF on your own data, you have established nothing."*

**Annif's design point** is a harness over many weak indexers with an ensemble on top, evaluated against a gold set — which is the opposite of the single-arm condensation this plan is doing, and worth knowing before the condensation is called finished.

## The reading is now arguable from the files it publishes

**Landed, at evidence schema 4.0.** `evidence.json` carries a `workings` section for the divergence path — the one that places — beside the `matches` that document the term path. The reading is unchanged by it: every figure the `subjectWitnesses` probe prints for a held-out clone is identical before and after.

| Key | What it holds | Rows on this tree |
|---|---|--:|
| `rules` | every rule that can remove a topic, with the topics and the readings it removed | 2 |
| `words` | each word offered, its occurrences, first site, sense coverage and specificity, and what the resources state about it read as a head word, in a sentence and as a verb, with the shares those came to | 2,299 |
| `removed` | one row per rule and topic, with a handful of the phrases | 201 |
| `unread` | every run nothing placed, kept as a run | 391 |

**Three of the defects below are now readable off the file rather than off a console.**

| Defect | What the file states |
|---|---|
| [D13](A_VOTE_NOT_A_GATE.md) | `THE_FILE_READ_NOTHING_OF_IT` removed **511 readings over 201 topics**; `EVERY_AGREEING_WORD_WEIGHED_ZERO` removed **none**. The gate is real and it is narrower than the plan supposed — see below |
| [D11](#the-defects-and-what-fixes-each) | `topic` at 983 occurrences, `concept` at 641 and `source` at 450 are this repository's three commonest words and **no resource states any subject for any of them**. They are the top of the `unread` list |
| [D5](#the-defects-and-what-fixes-each) | `read` carries `publishing` at a share of **0.92** and `file` carries `telecommunication` at **0.90**, stated per word with the sense coverage behind each |

### D13's gate is narrower than the plan supposed, and the file says why

The gate can only remove a topic the file's **first** pass never reached. Pass 1 runs with an empty prior, so every topic any phrase votes for lands in the file's distribution with some mass, however small — `TopicDistribution.of` thresholds nothing. A topic the gate removes must therefore be one **pass 2 introduced**, and pass 2 differs from pass 1 in exactly one way: a word the file declared is read as the noun it declared rather than by the corpus's own counts.

So the worked case in [the fix's own plan](A_VOTE_NOT_A_GATE.md) is wrong in its mechanism. `cryptography` at 0.04 of `signature` is not deleted by the gate — it is in the prior at 0.04 and quietened to near nothing. What the gate deletes is the 511 readings the declared-noun rule brought in.

**That does not refute the fix and it changes what settles it.** `1 + prior.shareOf(topic)` still turns a multiplication by zero into a multiplication by one, and it still turns quietening into promotion for everything else — which is the larger of the two effects and the one the measurement has to isolate. The 511 is the size of the part the plan named.

## What D9's fix is judged on, written before it ran

**Judged on the leader and the band**: the subject the reading names, and how many of the topics the expected result marks stand among the ten nearest. Those are what the reading publishes.

**The expected result is an identifier, not a word.** Marking a topic by whether its prose states the publisher's category token cannot tell one sense from another: `security` marked 151 topics including Food Security, Pesticide Exposure and Retirement and Disability; `content` marked Peanut Plant Research and Hibiscus Plant Research, where the word means concentration; `risk management` marked 122, every one clinical. **It also marked against the reading** — Tika's nearest topic under keywords is *Natural Language Processing Techniques*, a fair answer for a text-extraction toolkit, scored wrong for stating no `content`. `PlacedUnder` marks a topic by the area of the publisher's own hierarchy it descends from, and an identifier cannot carry a second sense.

**Not on the probability of superiority over the whole scheme.** That statistic orders all 4,437 topics and the reading shows nobody the body of that ordering; judging a reading on output it does not produce is how the lexical path came to be credited with 0.887 over a field it selected for itself. It is reported beside the criterion, never as it.

**Ends it** if the leader is no better on either member, or if a member the expected result marks nothing for stops being quiet.

## Keyword specificity was built, measured and reverted

The false positives sit at the generic end of OpenAlex's own keyword graph, and that much is measured: against a corpus mean keyword degree of 10.37, *Economic Zones and Regional Development* reaches Maven's top ten at 17.3 on `Sustainable Development`, which 113 topics state, and *Image Retrieval and Classification* reaches Tika's at 11.0 on `Machine Learning`, which 97 state. The answers that look right sit at 1.3 to 1.8.

So each keyword was made its own account and weighted by `log((N + 1) / stating) / log(N + 1)` over the scheme's own subjects — bounded in `(0, 1]` by the field size, nothing chosen. **It is worse on all three members.**

| Member | Leader unweighted | Leader weighted | Computer Science in the ten nearest |
|---|---|---|--:|
| Tika | Natural Language Processing Techniques | Speech and dialogue systems | 9 → **7** |
| Santuario | Advanced Software Engineering Methodologies | Mobile Agent-Based Network Management | 8 → 8 |
| Maven | Data Visualization and Analytics | Physical Unclonable Functions and Hardware Security | 7 → 7 |

Santuario's leader becomes the magnet the weighting was built to demote, and Maven — a build tool — leads on hardware security. All three verdicts move to *stands apart*, and that is the weak-test signature rather than a gain: topics stand 0.8406 bits apart instead of 0.7986, so the chance bar moves further off and everything clears a lower hurdle.

**The remedy does not follow from the diagnosis.** Down-weighting a topic's generic keywords does not remove noise; it makes each topic's distribution sparser, so distance is decided by a handful of rare labels and whichever topic's surviving keywords collide with the repository's rare labels wins. *Physical Unclonable Functions* has a mean keyword degree of 1.0 — maximally specific — which is why it rose. The weighting rewards idiosyncrasy rather than relevance.

Reverted. One defect it exposed is real and independent: `PooledDescriptions` joins subject descriptions with a space, so one subject's last word is glued to the next subject's first.

## The lexical path does not place, and is out of the placement

The plan's ladder puts a published term at rung 1 and a dictionary label at rung 2, on the principle that a citation outranks an assertion. **For placement that is measured and false.** Scored on the same field — every topic in the scheme, against the DOAP category token each publisher states:

| Path | Tika `content` | Santuario `security` |
|---|--:|--:|
| Divergence, both statements | 0.6583 | 0.6798 |
| Divergence, keywords only | 0.7007 | 0.6360 |
| Lexical, summed occurrence mass | **0.4509 — below chance** | 0.5960 |

The lexical path's published figures — 0.8322 and 0.8870 — are taken over *topics reached*, which is a field it selects for itself, and what it discards first is most of the answer: it reaches **4 of Tika's 48** marked topics and **38 of Santuario's 151**. Conditioning on reach hides a recall failure rather than isolating a ranking one, and a placement must choose among all 4,516.

**So the divergence path places and the lexical path does not.** It keeps two jobs it is the only source of: the taxonomy readings — which published concepts a repository writes, a different question — and quotable spans in the evidence.

**What that does to the defect list.** D1, D2, D3 and D6 are all defects of the term matcher. They stop being placement defects and stay as defects of the taxonomy reading, which is where `Source` was always the complaint. **What is left for the placement is D5, D9 and D10**, and D10 blocks the other two because the instrument cannot currently resolve the difference either of them makes.

## What exists today, and why it is four things

| Unit | Mechanism | Matched against | Weighted by |
|---|---|---|---|
| word | vocabulary ranking | English and platform frequency | divergence in bits, null-tested |
| nominal run | longest-match walk, three rungs | OLiA, CSO — published identifiers | `PhraseSpecificity`, branch-corroborated |
| verbal run | is the leading word a WordNet verb | nothing | nothing — a flat count |
| any of them | `ConceptTopics`, `BehaviourTopics` | dictionary topic labels | ad hoc per class |

`ThemeReading.nounsOf` strips a method's leading word so it is not read as a noun; `ExportedBehaviours` re-reads the files a second time; `MatchedTaxonomies` is consulted by two of the four and not the others. Every one of those is a special case standing in for a rule that was never written.

## The one arm

```
for each declared name:
    run = split(name)                          # grammar only, no vocabulary
    if the run is verbal:                      # leading word is a WordNet verb, name is a method
        run = nominalised(run)                 # see step 1; may abstain
    evidence(run), narrowest citation first:
        1. a bundled taxonomy publishes this run as a term
               -> the publisher's own prose about that concept
        2. the dictionaries label the run's words
               -> those labels
        3. nothing reads it
               -> abstain, and count the abstention
    weight = specificity(run) x occurrences
pool -> one distribution -> placed against every bundled scheme, at every level it states,
                            each level against its own null
```

Two things this fixes by construction rather than by rule. **A citation outranks an assertion**, because a published term is rung 1 and a dictionary label is rung 2, which is the ladder the term matcher already uses. And **the arms stop being arms**: what were three readings become three rungs of one, so nothing has to decide how to weight one against another.

## The repairs

### 1. Coverage and corroboration by strength — D1, D2. Both refused

Four rules were built, one at a time, each a bound derived from a resource already in the tree. Every one was measured on this repository and on the evaluation members, separately, so that a change reported as a repair could not be two changes cancelling. **All four are reverted**, and what they measured is below.

#### Coverage was built, measured and reverted

Two denominators were tried, each a share bounded at 1 by its own definition: the share of the name's **words** the term filled, and the share of what the name **narrows** that the term accounted for. Each ran against the Apache DOAP category token on the evaluation members, at the commits the manifest pins. The figure is the probability of superiority over the topics each member reaches.

| Weighting | Tika, `content` | Santuario, `security` | Santuario, of the top ten |
|---|--:|--:|--:|
| none — the reading as it stood | 0.8322 | 0.8870 | 3 |
| the share of the name's words | 0.8273 | 0.8673 | 0 |
| the share of what the name narrows | 0.8639 | 0.8731 | 0 |

Neither denominator raises both members, and both empty Santuario's top ten of the topics stating `security`. **The specific terms are the embedded ones, which is why.** Santuario writes `signature` inside `XMLSignatureInput` and writes `name` as a whole declared name, so weighting a term by how much of a name it filled promotes the generic term over the specific one. It moved *Names, Identity, and Discrimination Research* from 553 to 272 and left *Empathy and Medical Education* at 494, first.

**It also fails its own criterion on this tree.** `Source` stays first among OLiA's concepts under both denominators: `EvidenceSource` and `SourceAnchor` are two-word names in which `source` carries most of what the name narrows.

The weighting is reverted and the figure is kept. `TermSighting.coverage` is computed on every sighting and the export states it per concept as `shareOfEachName`, at schema 7.1. It weights nothing. **D1 stands as a measured defect with no derived fix**, and what is left for it was D2.

#### Corroboration by strength was built twice, measured twice and reverted

Both forms of D2 were built. The first counts as company only the concepts reached through a run the vocabulary reading admits. The second removes `CitedWord`'s stated 1% bar and asks the same null instead, which is what [the backlog](../../BACKLOG.md) had already objected to the constant for. `AdmittedWords` was the join: every word whose weakest claim stands above each reference's own chance bar.

| | The reading as it stood | Company by strength | The derived bar in `CitedWord` |
|---|--:|--:|--:|
| OLiA concepts reported | 133 | 64 | 34 |
| OLiA branches occupied | 37 | 18 | 19 |
| CSO concepts reported | 39 | 26 | 19 |
| Matches the branch rule discards | 62 | 131 | 161 |
| `Source`, the stated target | first | first | first |
| Tika, corroborated arm | 34 spans | 34 spans | 34 spans |
| Santuario, corroborated arm | 9 spans, 0.5976 | 9 spans, 0.5976 | 9 spans, 0.5976 |

**Neither moves a single figure on either evaluation member**, and both trip the abandon criterion `TermReadingDiagnostic` asserts — corroboration must leave at least half the branches occupied, and both leave fewer. Both are reverted.

#### What the two refutations say, and how the plan changes

`Source` survives every one of the four rules because **the rules are all right about it and none of them is asking the question the defect is.** OLiA places `Source` beside `Document`, `Citation`, `Heading` and `Title`; this repository writes `document` and `citation` far more densely than ordinary English and the platform do, so the vocabulary reading admits them and the branch is genuinely occupied by words this repository chose. `source` clears every bar for the same reason. Coverage cannot demote it either, because `EvidenceSource` is two words of which `source` carries most of what the name narrows.

**So D3 is not downstream of D1 and D2.** OLiA's `Source` is a news-article attribution schema and this repository means origin-of-data: the two sides agree on the string, on the branch and on the vocabulary, and disagree only on the sense. That is a sense mismatch, and neither a share of a name nor a chance bar over word frequencies can reach one. D1 and D2 are closed as measured and refuted; **D3 is the defect, and what it needs is [sense disambiguation](SENSE_DISAMBIGUATION.md), not a weight.**

### 2. Weight the pooled mass by specificity — D6

`PhraseSpecificity` is computed on every sighting and votes on nothing.

| | |
|---|---|
| Measures | the ranking before and after, on all three evaluation members |
| Settles it | it raises the ordering on the members and not only here. Repair 0 failed exactly that and is the precedent |
| Ends it | better here, worse there |

## The simplification, step by step

### 3. Nominalise verbal runs — **dropped, not deferred**

**Verbs already reach the reading, and the step's purpose was rung 1.** `ThemeReading.tallied` hands the whole occurrence to `TopicTally`, so every word of a method name is already a vote; `nounsOf` withholds the leading word from the *prior* alone. What this step was measured on — *"more runs reach rung 1 than before"* — cannot be measured once rung 1 is deleted, and nominalising changes no vote: `read` and `reading` are the same sense.

**What the verbs vote for is D5's evidence, and it was never about nouns.** `read` carries `publishing` at mass 1.00 from WordNet Domains, `validate` carries `law` at 0.25, and `sign` carries `telecommunication` at 1.00 — the signal sense, not the signature one. `publishing` and `law` are the two topics D5 names as this project's own machinery vocabulary, and they arrive through the verbs in method names.

`nounsOf` stays. Withholding a word that votes 100% `publishing` from the prior is protective, which is what its javadoc predicted.

### 3 (superseded). Nominalise verbal runs

`readDeclaration` becomes `reading declaration` and goes through the nominal pipeline. The verb's nominal forms are WordNet's own derivationally related nouns, filtered to those sharing the verb's stem. The set is cited; the filter is a stem relation, which is grammar and permitted where a word list is not.

**Measured on this tree before the plan was written**: of 322 distinct verbs, WordNet states a derivationally related noun for 315 (97%); filtering to stem-sharing forms leaves 216 (67%). The unfiltered set is wrong far more often than not — `write` yields `pen`, `load` yields `cargo`, `extract` yields `distillation`, `row` yields `oarsman`. The filtered set yields `reading`, `writing`, `loading`, `indexation`, `citation`, `statement`, `publisher`, `rendering`.

| | |
|---|---|
| Measures | the share of verbal runs that nominalise, and the share of those that then match a published term |
| Settles it | more runs reach rung 1 than before, and no run reaches a concept its verb does not mean |
| Ends it | the nominalised run matches nothing anywhere. Then verbs carry no term evidence and the honest reading is the dictionary rung alone |

The 33% that abstain include `parse`, `tokenize`, `download`, `outrank`. The verbs that say most about what a codebase does are the ones a dictionary is least able to place, which [the behaviour plan](BEHAVIOURS.md) already records. Abstention is the answer, not a gap.

### 4. One evidence ladder per run

Rung 1 is a published term and its publisher's prose. Rung 2 is the dictionaries' labels for the run's words. Rung 3 is abstention, counted.

`ConceptTopics` becomes rung 1, `OfferedWords` and the topic tally become rung 2, and the choice between them stops being a weighting nobody derived. **D1, D2 and D6 land before this step**, so rung 1 is weighted by coverage and specificity and corroborated by strength before anything is pooled onto it.

| | |
|---|---|
| Measures | how much of the repository's mass rung 1 carries, and how much falls to rung 2 |
| Settles it | the ladder's distribution places at least as well as the vocabulary reading alone, on the evaluation members |
| Ends it | rung 1 carries so little mass that the pooled reading is the vocabulary reading with noise added |

**Rung 1 is poisoned until D1 to D4 land, and this step must not hide it.** OLiA's prose is 48% URLs, 47% bracketed citations, 15% under eight words; its commonest bracketed tokens are `http`, `org`, `www`, `purl`, `isocat`, and `Carlson` 79 times. And a mis-matched term injects a whole paragraph: this repository's `Source` means origin-of-data, OLiA's `Source` is a news-article attribution schema, and at 189 occurrences it is the largest single contributor to the concept reading. Reading the provenance apparatus as subject matter, and reading a publisher's paragraph for a term the repository never meant, are separate defects and both are measured before this step is judged.

### 5. One distribution, placed against every scheme, with its witnesses

Every bundled scheme, at every level it states, each with its own null, all reported. No scheme is picked. A scheme that does not clear its null reports nothing, which is a result.

The export carries all of them. `summary.placedIn` becomes a list, and each placement carries the `carriedBy` topics `SubjectPlacement.Placement` already computes and the JSON currently drops — which is why *why is this subject first* cannot be answered from the file today.

| | |
|---|---|
| Measures | each scheme at each level, against its own chance-expected best |
| Settles it | a reader can answer *why this subject* from `reading.json` alone |
| Ends it | nothing; this is reporting what is already computed |

**Landed, at schema 8.0.** `summary.placedIn` is a list, one entry per bundled scheme, each level carrying the topics it rests on and every subject standing nearer than its own chance figure. **The band is the chance figure's own** — a subject nearer than chance is one the instrument cannot rule out — so D8 is closed without a margin being chosen. `ReadingChanges` names each figure by its scheme and reports how the band's size moved.

Read at `29a893d`, one line per subject the reading cannot separate from the leader:

| Scheme | Level | Subjects nearer than chance | Nearest | Divergence | Chance |
|---|---|--:|---|--:|--:|
| arXiv | archive | 1 | Computer Science | 0.3405 | 0.4069 |
| arXiv | category | 2 | Computation and Language, Systems and Control | 0.3876 | 0.4412 |
| OpenAlex | subfield | 4 | Language and Linguistics, Communication, Artificial Intelligence, Computer Networks and Communications | 0.2854 | 0.3333 |
| OpenAlex | topic | 4 | Linguistics and language evolution, Natural Language Processing Techniques, Medical Research and Practices, Authorship Attribution and Profiling | 0.3649 | 0.3806 |

**The band is small, so no cap is needed and none is applied.** Four of 4,516 OpenAlex topics stand nearer than chance, and `Natural Language Processing Techniques` — one of the three topics [recorded as the expected result](EVERY_SIGNAL_REACHES_A_SUBJECT.md) before any arm was built — is among them, 0.0002 bits behind the leader.

**D5 is now readable off the file.** *Medical Research and Practices* is in the band and its `carriedBy` states `linguistics, publishing, mathematics, law` — this project's own machinery vocabulary, named in the placement it produced.

Placing against the second scheme costs the second null: the self read goes from about one minute to 2m 15s. That is the price of not picking a scheme.

### 6. Delete what the above orphans

**The arm is deleted, at schema 9.0.** `BehaviourTopics`, `ExportedBehaviours`, `ExportedBehaviour`, the `behaviours` export section, `summary.leadingBehaviours` and `summary.counts.behaviours` are gone, with `RepositoryThemes.behaviours` and `ThemeReading`'s call into it. Five classes and 10 tests removed; the remaining 1,223 pass.

**Two named pieces are deliberately kept, and step 6 was wrong to list one of them.**

`ThemeReading.nounsOf` **stays**, because step 6 runs after step 1 and step 1 has not landed. `nounsOf` drops a method name's leading word so `readRepository` declares no noun `read`; its own javadoc states what removing it does — every sentence's `read` becomes the noun WordNet Domains labels `publishing` — and `law` and `publishing` are already [D5](#the-defects-and-what-fixes-each). Deleting it before the nominalisation exists is not a simplification but a regression the plan predicted in writing.

`Behaviours`, `Behaviour` and `PropertyAccessors` **stay** as the parse-side clause reading step 1 nominalises. They are read by `VerbPhraseProbe` and `WordAndPhraseProbe` and by nothing that votes, which is the state the plan intends for them.

`MatchedTaxonomies` states each taxonomy's shape; every bundled one is **nominal**, including BIAN and NIST, whose labels are noun phrases (`ATM Network Management`, `Adverse Event Analysis`) whatever their definitions say.

| | |
|---|---|
| Settles it | the reading is unchanged by the deletion, or changed in a way step 1 to 3 predicted |

### 7. Re-measure on the evaluation members

Apache Tika, Maven and Santuario, on the rank predicate over the Apache DOAP category tokens their publisher states.

## The baseline, recorded before any of it

### On the evaluation members, which is what the loop is judged on

Every member read against OpenAlex's own published keywords, scored against the Apache DOAP category token its publisher states. Two figures, because the pooled one over all 4,516 topics mostly reports how many marked topics were reached at all.

| Member | Token | Topics reached | Superiority over them | Of the top ten |
|---|---|--:|--:|--:|
| Tika | `content` | 863 | 0.8322 | 0 of 10 |
| Maven | `build-management` | 559 | no pair to compare | 0 of 10 |
| Santuario | `security` | 361 | 0.8870 | 3 of 10 |

**OpenAlex states `build` in none of its 4,516 topic accounts**, so Maven has no pair to compare and is a negative control scored by whether the reading stays quiet.

**The rung that cites nothing outranks the ladder that cites a dictionary.** Read on the words both sides wrote, Tika scores 0.8357 and Santuario 0.9322 with 6 of the top ten stating `security` — above the pooled reading on both members. The dictionary-form and sense rungs score at or below chance on Santuario, 0.4286 and 0.4743. Whatever the ladder buys, it is not ranking.

### On this repository

This repository at `21fcede`, vocabulary reading, both schemes. Nothing below has been iterated on.

| Scheme | Level | Nearest | Divergence | Chance | Clears |
|---|---|---|--:|--:|---|
| arXiv | archive | Computer Science | 0.3407 | 0.4069 | yes |
| arXiv | category | Computation and Language | 0.3879 | 0.4412 | yes |
| OpenAlex | subfield | Language and Linguistics | 0.2858 | 0.3336 | yes |
| OpenAlex | topic | Natural Language Processing Techniques | 0.3650 | 0.3801 | yes |

The expected result, [recorded before the arms were built](EVERY_SIGNAL_REACHES_A_SUBJECT.md): `linguistics and terminology studies` 9th of 4,498, `Natural Language Processing Techniques` 1st, `Semantic Web and Ontologies` 1,282nd. Two of three in the top ten.

**The leader is inside a tie band and the baseline says so.** Eight OpenAlex topics span 0.033 bits, the first two are separated by 0.0001, and *Medical Research and Practices* is third. Every one of the eight meets the repository on `linguistics` first. Three of the eight are reached through `law` and `publishing`, which are this project's own machinery vocabulary rather than its subject matter.

## The loop, and what stops it

An iteration that reads this repository's own placement and changes a rule to improve it is goal-seeking, and the doctrine refuses it. So the loop is stated before it runs.

| | |
|---|---|
| What one iteration is | one change, stated as a hypothesis about a named defect, with the figure it should move written down first |
| What it is judged on | the probability of superiority over **every topic in the scheme** on **Tika, Maven and Santuario**, against the **subject area of the scheme's own hierarchy** the manifest names for each. ~~Against the DOAP category token their publisher states~~ — that test cannot tell one sense of a word from another and marked against the reading; the figures are below. ~~Over the topics reached~~ — that field is chosen by the reading itself. This repository's own figures are printed for contrast and never decide |
| What may not be tuned | anything whose only evidence is this tree. A change that improves here and not on the members is reverted, as repair 0 was |
| Stops when | two consecutive iterations move no member's figure by more than the run-to-run jitter of the null, which is measured once and stated |
| Also stops when | the change list is exhausted. The loop looks for better matches among defects already named, and does not invent new rules to try |

**What the loop draws from** is the defect list at the top of this plan. Steps 1 to 7 repair D1, D2, D6 and report D8; what is left for the loop is **D3 to D5 and D7** — what remains of the mis-matched paragraphs once coverage and corroboration have landed, whether the provenance apparatus can be separated from subject matter without a rule about one publisher's formatting, how much of the placement rests on this project's own machinery vocabulary, and what CSO's unextracted structure buys.

**The loop invents nothing.** A defect it has not measured is not a candidate, and a rule proposed to fix a figure rather than a named defect is refused. That is what keeps *looking for better matches* from becoming *tuning until the number is nice*.

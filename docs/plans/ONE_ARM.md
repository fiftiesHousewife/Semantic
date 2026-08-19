# One arm: every declared run, read the same way, placed against every scheme

Three readings reach a subject by three different mechanisms and a fourth reads verbs a fifth way. There is one unit — a run of words from a declared name — and there should be one reading of it. This plan condenses them, states what each step measures, and sets the loop that looks for better matches without letting this repository mark its own homework.

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

## Steps

### 1. Nominalise verbal runs

`readDeclaration` becomes `reading declaration` and goes through the nominal pipeline. The verb's nominal forms are WordNet's own derivationally related nouns, filtered to those sharing the verb's stem. The set is cited; the filter is a stem relation, which is grammar and permitted where a word list is not.

**Measured on this tree before the plan was written**: of 322 distinct verbs, WordNet states a derivationally related noun for 315 (97%); filtering to stem-sharing forms leaves 216 (67%). The unfiltered set is wrong far more often than not — `write` yields `pen`, `load` yields `cargo`, `extract` yields `distillation`, `row` yields `oarsman`. The filtered set yields `reading`, `writing`, `loading`, `indexation`, `citation`, `statement`, `publisher`, `rendering`.

| | |
|---|---|
| Measures | the share of verbal runs that nominalise, and the share of those that then match a published term |
| Settles it | more runs reach rung 1 than before, and no run reaches a concept its verb does not mean |
| Ends it | the nominalised run matches nothing anywhere. Then verbs carry no term evidence and the honest reading is the dictionary rung alone |

The 33% that abstain include `parse`, `tokenize`, `download`, `outrank`. The verbs that say most about what a codebase does are the ones a dictionary is least able to place, which [the behaviour plan](BEHAVIOURS.md) already records. Abstention is the answer, not a gap.

### 2. One evidence ladder per run

Rung 1 is a published term and its publisher's prose. Rung 2 is the dictionaries' labels for the run's words. Rung 3 is abstention, counted.

`ConceptTopics` becomes rung 1, `OfferedWords` and the topic tally become rung 2, and the choice between them stops being a weighting nobody derived.

| | |
|---|---|
| Measures | how much of the repository's mass rung 1 carries, and how much falls to rung 2 |
| Settles it | the ladder's distribution places at least as well as the vocabulary reading alone, on the evaluation members |
| Ends it | rung 1 carries so little mass that the pooled reading is the vocabulary reading with noise added |

**Rung 1 is currently poisoned and this step must not hide it.** OLiA's prose is 48% URLs, 47% bracketed citations, 15% under eight words; its commonest bracketed tokens are `http`, `org`, `www`, `purl`, `isocat`, and `Carlson` 79 times. And a mis-matched term injects a whole paragraph: this repository's `Source` means origin-of-data, OLiA's `Source` is a news-article attribution schema, and at 189 occurrences it is the largest single contributor to the concept reading. Reading the provenance apparatus as subject matter, and reading a publisher's paragraph for a term the repository never meant, are separate defects and both are measured before this step is judged.

### 3. One distribution, placed against every scheme, with its witnesses

Every bundled scheme, at every level it states, each with its own null, all reported. No scheme is picked. A scheme that does not clear its null reports nothing, which is a result.

The export carries all of them. `summary.placedIn` becomes a list, and each placement carries the `carriedBy` topics `SubjectPlacement.Placement` already computes and the JSON currently drops — which is why *why is this subject first* cannot be answered from the file today.

| | |
|---|---|
| Measures | each scheme at each level, against its own chance-expected best |
| Settles it | a reader can answer *why this subject* from `reading.json` alone |
| Ends it | nothing; this is reporting what is already computed |

### 4. Delete what the above orphans

`BehaviourTopics`, `ExportedBehaviours`, `ExportedBehaviour`, the `behaviours` export section, `ThemeReading.nounsOf`, and `Behaviours` as an arm — it survives as the nominalisation rule of step 1. `MatchedTaxonomies` states each taxonomy's shape; every bundled one is **nominal**, including BIAN and NIST, whose labels are noun phrases (`ATM Network Management`, `Adverse Event Analysis`) whatever their definitions say. Schema 8.0.

| | |
|---|---|
| Settles it | the reading is unchanged by the deletion, or changed in a way step 1 to 3 predicted |

### 5. Re-measure on the evaluation members

Apache Tika, Maven and Santuario, on the rank predicate over the Apache DOAP category tokens their publisher states.

## The baseline, recorded before any of it

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
| What it is judged on | the probability of superiority over the topics reached on **Tika, Maven and Santuario**, against the DOAP token their publisher states. This repository's own figures are printed for contrast and never decide |
| What may not be tuned | anything whose only evidence is this tree. A change that improves here and not on the members is reverted, as repair 0 was |
| Stops when | two consecutive iterations move no member's figure by more than the run-to-run jitter of the null, which is measured once and stated |
| Also stops when | the change list is exhausted. The loop looks for better matches among defects already named, and does not invent new rules to try |

**The defects it draws from, all measured and none yet repaired:**

| Defect | Where it was measured |
|---|---|
| `law` and `publishing` are this project's machinery vocabulary and reach three of the top eight subjects | this plan's baseline |
| A term matched at one word can be a different concept entirely — `Source` | the term matches in `evidence.json` |
| OLiA's prose is half provenance apparatus | 48% URLs, 47% bracketed citations |
| CSO states no prose, so it cannot reach rung 1 at all | 0 of 14,636 rows |
| CSO's `sameAs`, `relatedEquivalent` and `relatedLink` are unextracted | 19,297, 10,181 and 8,803 statements |
| Mass counts occurrences without asking what the match was worth | `PhraseSpecificity` votes on nothing |
| The tie band is unresolvable at four decimal places | eight topics within 0.033 bits |

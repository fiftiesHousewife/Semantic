# Carrying a quantity a publisher states about a concept

`SkosConcept` is eight text columns and none of them holds a number. OpenAlex states two figures for every topic and the extraction drops both. This plan says where they should go instead, and it is on the critical path: the [OpenAlex placement](ONE_ARM.md) cannot be repaired without them.

## What is dropped, and what it is worth

OpenAlex's topic records state `works_count` and `cited_by_count`. Neither reaches the bundled TSV.

| | Topic | Works |
|---|---|--:|
| Largest | Military Technology and Strategies | 22,342,155 |
| Median | — | 58,008 |
| Smallest | Globalization and Economic Impact | 977 |

The largest topic holds 5.66% of all 394,999,051 works the snapshot counts and the smallest holds 0.00025%, a spread of 22,868 to 1. **The placement treats all 4,516 topics as equally broad**, which is a claim OpenAlex never made and which its own index contradicts.

`siblings` is dropped too and is not a loss: 243,006 edges, 0% of which cross a subfield boundary, so it restates the `broader` column.

## Why `note` is the wrong home

`note` is what a source states about a concept that is neither its meaning nor its place. A quantity qualifies by that wording, so it was the cheap answer. It is still wrong, and the eight bundled files say why.

| File | Rows | Rows with a note | What the notes hold |
|---|--:|--:|---|
| media-types | 2,344 | 2,344 | RFC and author references |
| fibo-terms | 1,833 | 1,058 | 1,384 statements of English, 236 URLs |
| olia-terms | 1,312 | 780 | 548 statements of English, 401 URLs |
| openalex-topics | 4,798 | 4,516 | 4,514 URLs |
| arxiv, bian, cso, nist | 16,263 | 0 | — |

**Across 25,550 rows not one note holds a number.** A figure written there would be the first, and every reader would have to parse a key out of free text against a convention that only a header comment states. That is the defect being fixed, not a smaller version of it.

## The options, costed

| | Where the figure goes | Cost | Why not |
|---|---|---|---|
| A | `note`, as `works_count=N` | 4 files | A typed value in an untyped field. **Refused** |
| B | A ninth column on `SkosConcept` | 54 construction sites across 47 files, 15 of them production; `SkosTsv`, `SkosRows`, 8 provenance headers; a ninth field appended to all 25,550 rows of all 8 bundled files | The shape grows once per publisher peculiarity, and the next request is the same argument again |
| C | **A sibling resource written by the same extraction** | 1 resource, 1 reader, 1 renderer | — |

**C is chosen.** SKOS states no property for how much of a corpus sits under a concept, so it is not a SKOS statement and forcing it into a SKOS-shaped row is the category error. It is an index statistic, and it gets a file of its own.

C is also the smaller change. B adds no class but rewrites 54 call sites and every bundled file; C adds a reader and a renderer, and B needs both anyway for its new component.

## What closes the objection to C

Two files can drift apart. That is the only real argument for B, and it is closed mechanically rather than by care.

- **One extraction run writes both.** `OpenAlexTopicsExtraction` already reads the snapshot once and pins it by `SET_DIGEST`; it writes the second file in the same pass.
- **Both headers name the same digest**, so a file regenerated against a different snapshot cannot sit beside one that was not.
- **A test asserts the two state the same concept set and the same digest.** Drift fails the build.

## The shape

`openalex-topic-sizes.tsv`: `concept, worksCount, citedByCount`, one row per topic, with the provenance header every bundled resource carries. Above topic level OpenAlex counts nothing, so those rows are absent rather than zero — the absence is a fact about the publication.

Precedent for a resource outside the SKOS shape with its own reader: `wiktionary-abbreviations.tsv` and `WiktionaryCitations`, five columns.

## A defect found while measuring this — **landed**

Two OpenAlex topics carried the text `NaN` where the Wikipedia link belongs — `T11662` Legal Cases and Commentary, and `T13370` Diverse Scientific and Economic Studies. The publisher serialises an absent link as the text `NaN`, and the extraction copied it through. **The refusal is RFC 3986's own grammar asked of the platform's parser**: a value carrying no scheme is not an absolute URL and so is not an article, and no value is named in the code, so a third spelling of absence needs no change. `OpenAlexTopic.articleIn` and `refusesAnArticleLinkTheUriGrammarCannotReadAsOne` pin it, and the regenerated file carries no `NaN`.

## Order

1. ~~The `NaN` refusal, with the test that pins it.~~ **Landed.**
2. ~~Extract the two counts to the sibling resource, with the drift test.~~ **Landed.** `openalex-topic-sizes.tsv` carries 4,516 rows of `concept, worksCount, citedByCount`, written by the same pass over the same snapshot under the same digest. `OpenAlexTopicSizes` reads it and `share` is taken over the sum of every count, so it is bounded at 1 by that sum. Two tests hold the files together: `countsTheSameTopicsTheTaxonomyBesideItDescribes` and `isPinnedToTheSameSnapshotAsTheTaxonomyBesideIt`.
3. ~~Read them.~~ **Landed, and it is settled** — see [what the two uses measured](#what-the-two-uses-measured).
4. Re-measure the OpenAlex placement on Tika, Maven and Santuario.

## What the two uses measured

Both were run against the Apache DOAP category token each publisher states, under both scorings, on all three evaluation members. The figure is the probability of superiority over the topics the member reaches.

| Scoring | Weighting | Tika, `content` | Santuario, `security` | Maven, `build-management` |
|---|---|--:|--:|---|
| summed occurrence mass | none | 0.83222 | 0.88704 | no pair |
| summed occurrence mass | share of the literature | 0.81519 | 0.84577 | no pair |
| summed occurrence mass | **how little the topic covers** | **0.84459** | **0.89034** | no pair |
| two shares | none | 0.80413 | 0.87176 | no pair |
| two shares | share of the literature | 0.78783 | 0.83803 | no pair |
| two shares | how little the topic covers | 0.80937 | 0.88146 | no pair |

**The prior is refused, as predicted.** Weighting by a topic's share of the literature lowers the ordering on both members under both scorings — 0.017 and 0.041 on the winning scoring. A topic is not more likely to describe a repository for holding more of the literature.

**The specificity weighting clears the stated bar.** On summed occurrence mass, which is the scoring that wins unweighted, it raises Tika by 0.0124 and Santuario by 0.0033. Both members rise; Maven has no pair and stays quiet under all six. The statistic carries no randomness, so the gains are exact rather than draws — but 0.0033 is thin, and two members with a pair is thin evidence for a weight. It has earned promotion out of the probe and a re-measurement, not a place in the vote on the strength of this alone.

Precision at ten is unmoved by either weighting: 0 of 10 on Tika and 3 of 10 on Santuario under summed mass, 5 of 10 under two shares whatever weights it.

### The form had to be corrected before it could be read

`log(rank) / log(size)` — the scale `WordSpecificity` states — gives the top-ranked entry a weight of **exactly zero**. Measured: Tika reached 862 topics under that form against 863 under every other, because the largest topic was silenced rather than weighed. The doctrine refuses that outright, so the weighting is `log(rank + 1) / log(size + 1)`, which leaves the bound derived from the file's own length and puts it in `(0, 1]`.

**The same defect is in `WordSpecificity` today** and is [in the backlog](../../BACKLOG.md): its javadoc states that the commonest word in English still votes at the smallest weight the list can express, and its arithmetic gives it zero.

Nothing votes on the counts yet. `OpenAlexTopicSizes` is read by the probe that measured it, and promoting the weighting into the voting path is a change with its own re-measurement.

## What step 3 must not assume

The figure has two candidate uses and they point opposite ways.

| Use | What it says | Objection |
|---|---|---|
| A prior on the placement | a topic holding more of the literature is more likely before evidence | It would pull every repository towards Military Technology and Strategies at 5.66% of all works. The question is which subject a repository reads *like*, not which subject it was drawn from |
| A specificity weight | a topic holding 0.00025% of the literature is narrow, so agreeing with it says more | The same shape as `PhraseSpecificity` and bounded in `(0, 1]` by its own definition |

The second is the better argument and neither is adopted without measurement.

| | |
|---|---|
| Measures | the probability of superiority over the topics reached, on Tika, Maven and Santuario, unweighted against each weighting |
| Settles it | one weighting raises the ordering on the evaluation members and not only here |
| Ends it | neither does, and the counts are reported without voting — as `shareOfEachName` already is |

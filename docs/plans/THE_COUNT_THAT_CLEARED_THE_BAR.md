# The count that cleared the bar

A reading publishes more matched phrases than its chance bar counted, and nothing says so. This states what the two counts are, why the obvious repair is refused by the library's own reasoning, and the small change that is left.

Found on strata at reading schema 22.0, 2026-08-31.

## The two counts

| Vocabulary | `bar.phrases` | Distinct multi-word terms published | Difference | Terms whose written form differs from the publisher's label |
|---|---|---|---|---|
| FpML | 69 | 87 | 18 | **18** |
| FIBO | 47 | 66 | 19 | **19** |

The difference is exactly the terms a dictionary reached: `payment date` standing for `PaymentDates`, `cash flow` for `Cashflows`, `accrual periods` for `AccrualPeriod`, `implied volatilities` for `ImpliedVolatility`.

## Why, in the code

The matcher walks a ladder of four rungs — the published spellings, then the same index keyed by WordNet lemmas, by Wiktionary expansions, and by WordNet senses.

| | Builds | Rungs |
|---|---|---|
| What the export publishes | `TermReading.reading(ladder(index))` → `new TermSpans(rungs.toArray(...))` | **four** |
| What the bar counts | `ReachedPhrases.over(index)` → `new TermSpans(index)` | **one** |

So `taxonomies[].bar` states an observed count and a null both drawn at the words rung, and `taxonomies[].concepts` lists matches found at all four. Both are correct figures. They are not the same figure, and the file does not say which is which.

## The repair that is refused, and it is refused by this library rather than by cost

Drawing the null over all four rungs would make the bar test the published count. Two things stand against it, and the second is decisive.

**It is unaffordable.** `NormalisedTerms.over` is eager: it walks every term of an index and normalises it when the rung is built. The null deals each vocabulary 999 times, and the seven vocabularies state 27,257 terms between them, so three further rungs per deal is 81,689,229 normalisations per reading — against a null that already dominates a read.

**It would measure the wrong thing.** `MatchedPhrases` states the reason and it was written before this was found: *a rung comparing what the dictionary says two runs mean is a claim about the dictionary, and a deal of a publisher's spellings is no reference for it.* `ScrambledTerms` deals a publisher's own words across its own terms. Lemmatising a dealt run tests whether WordNet relates words the publisher never wrote beside each other, which is a fact about WordNet and not about the repository. The cost is the smaller objection.

**Publishing only what the bar counted** is refused separately: it would discard 18 real matches, including `payment date` at 350 occurrences on strata, to remove a presentation defect.

## What is left, and it is small

**Carry the rung on each published concept row.** `TermSighting` already holds it, and its own javadoc states that the rung *belongs on the sighting rather than only on the reading*. `ExportedTaxonomies.row` drops it when it builds `ExportedTaxonomy.Concept`. Adding it lets a reader separate the 69 rows the bar tested from the 18 a dictionary reached, without moving any figure the reading computes.

`taxonomies[].matchesByNormalisation` already counts spans per rung, so the export states the totals and withholds the attribution per row.

The page then has what it needs to say which matches the bar tested — and `bar.phrases` should be read as *the count at the words rung*, which its own javadoc does not currently say.

## The order of work

| | Step | Costs | Settled by |
|--:|---|---|---|
| 1 | `rung` on `ExportedTaxonomy.Concept`, from the sighting that already carries it | a schema bump and a reading | every published row states the rung it was found at, and the rows at `words` number exactly `bar.phrases` |
| 2 | `bar.phrases` javadoc and schema description say the count is the words rung's | nothing | a reader cannot take 87 for the number that cleared a bar of 25 |
| 3 | The page separates them | a page rebuild | the evidence list shows which matches the bar tested |

Step 1's check is the one that matters: **if the published rows at the `words` rung do not number exactly `bar.phrases`, something other than the ladder explains the gap** and this document is wrong.

## What was measured on the way

- The gap is 18 of 87 for FpML and 19 of 66 for FIBO, and in both the count of dictionary-reached terms matches the gap exactly. That agreement was inferred from the exported rows before the code was read, and the code then confirmed the mechanism.
- FIX did not answer strata, so the gap is unmeasured for it.

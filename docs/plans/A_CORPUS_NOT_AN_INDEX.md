# A corpus, not an index: demote what ten other repositories write just as often

The reading ranks a repository's words by how far they depart from what it is read against, and takes the weakest claim any reference makes. That is the right mechanism and it is already built. One of the two references is wrong, and every gate now standing in the pipeline is there to patch around it.

## The defect

`PlatformVocabulary` cites `ModuleFinder.ofSystem()` and reads the JDK's **declared type names**. It is an index: each name appears about once. Real code writes the same words thousands of times, so a word common in working Java diverges enormously from a reference that names it once.

| Word | Member | Occurrences | Claim | Nearest reference |
|---|---|--:|--:|---|
| `id` | fineract | 14,240 | **0.0193 bits — the highest in the repository** | the platform's own API |
| `id` | aeron | 5,145 | 0.0317 | the platform's own API |
| `transaction` | fineract | 4,101 | 0.0067 | the platform's own API |

`id` is the most distinctive word in two of the nine members. The reference has the right vocabulary and a flat density profile, so it cannot demote anything on frequency.

**Every filter in the pipeline exists to patch this.** Steps 3, 4 and 5 remove `id`, `buf` and `the` by rule because the ranking promotes them. The doctrine's first line refuses that: *signals are votes, never gates.*

## The fix

One more `ReferenceVocabulary`, backed by **ten Java repositories drawn at random**, read the same way a member is read and pooled into one distribution over words.

Nothing else changes. `ChosenWords` already takes a list, already scores each word's Jensen–Shannon term against every reference, already keeps the **weakest** claim, and already carries a reference that writes a word more densely than this repository as a negative claim that sorts below everything that passed. The cascade the ranking needs is the one it has:

| Reference | Demotes |
|---|---|
| ordinary English | `the`, `a`, `of`, `by`, `name`, `value` — what English writes |
| **ten Java repositories** | `id`, `log`, `test`, `get`, `buf`, `license`, `apache` — what every Java repository writes |

A word survives both only where neither English nor working Java writes it as densely as this repository does, which is the definition of the repository's own vocabulary.

## The sampling frame, fixed before anything is read

**Truly random, from a stated population, pinned, and recorded before the first reading.** A reference chosen after seeing what it demotes is the same defect as choosing a member's expected subject after reading its tree.

| | |
|---|---|
| Population | public GitHub repositories whose primary language GitHub states as Java, above a size floor that follows from the reading needing a parse to run — stated in the manifest, not chosen for effect |
| Draw | random, from a seed recorded in the manifest, so the draw is reproducible and is not a choice |
| Size | ten |
| Pinned | one commit SHA per repository, as `evaluation-set.tsv` pins its members |
| Licence | verified at the revision, recorded. A repository is read, never redistributed |
| Disjoint | from this repository and from all nine evaluation-set members. **A reference drawn from the corpus a reading is measured on is marking its own homework** |
| Recorded | in `reference-corpus.tsv` beside `evaluation-set.tsv`, with the same header discipline: what it is, where it came from, what it costs to change |

**On the doctrine.** A bundled *vocabulary* that votes must be a curated statement of a published standard. This is neither curated nor a voter: it is a denominator, sampled rather than chosen, and it is the same class of thing as the bundled frequency list that already serves as the English reference. What must not happen is a repository being picked because of what it contains.

## The risk this plan has to bound

**Ten is a small sample and one contaminated draw kills a signal rather than noise.** A blockchain repository in the reference would demote `transaction`, `gas` and `block` for besu; a finance one would demote `trade` and `payment` for strata and fineract. That is the signal, not the noise, and no filter downstream can recover it.

Two things follow, and both are measurements rather than opinions:

- **Report each reference's claim separately**, which `ChosenWord.against` already carries. Where a word is demoted, the report must say *which* reference demoted it, so a contaminated draw is visible as one repository's doing rather than invisible in a pooled number.
- **State the draw's composition before the reading.** Ten repositories' stated subject areas, recorded from outside this project as the evaluation set records its members'. Where the draw lands two repositories in one area, that is a fact about the draw and is reported, never re-rolled — re-rolling until the sample looks right is choosing.

## What comes out when it lands

| Step | Today | After |
|---|---|---|
| 1 — every word | population | unchanged |
| 2 — words used to name something | population choice | **stays** — names and prose are two questions, not a filter |
| 3 — longer than a symbol | gate | **marker**: `x` and `id` rank where their claim puts them |
| 4 — not an abbreviation | gate | **marker**: `buf` and `ref` sink because ten repositories write them |
| 5 — words the author chose | gate | **marker**: `the` and `of` sink because English writes them |
| 6 — dictionary form | merge | unchanged |

And the picture changes with it: **size encodes the claim in bits at every step, one unit throughout**, rather than an occurrence count. A word twice the size departs twice as far from what it is read against, which is the question the reading actually asks.

## The order

1. Draw and pin the ten. Record the manifest. **Read nothing first.**
2. Clone at the pins, reusing the machinery `evaluationFetch` already has.
3. Read each into a `WrittenWords` and pool them into one `ReferenceVocabulary`.
4. Backtest with the new reference beside the API index, and with it replacing the API index — two runs, because whether the index still earns its place is a question and not an assumption.
5. Only then remove the gates, one at a time, each with its own run.

## The criteria, stated before the runs

**The reference is doing its job** when `id`, `log`, `test`, `get` and `buf` are no longer among any member's leading claims, and each member's own subject vocabulary — `loan`, `trade`, `gas`, `metadata`, `c14n`, `pom` — still is.

**A gate may be removed** when its words rank where the claim puts them without it, on all nine members.

**The plan is refuted** if the ten demote a member's subject vocabulary, or if the leading claims after pooling are the same words as before — which would mean ten repositories say no more about Java than the API index does.

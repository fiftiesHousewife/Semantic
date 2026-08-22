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

**Decided 2026-08-21 and recorded in [`reference-corpus.tsv`](../../reference-corpus-extraction/src/main/resources/reference-corpus.tsv)'s header before the first row was drawn.** The frame is:

```
language:Java fork:false mirror:false size:>=1000 created:<2026-08-21
```

| Qualifier | Why it is there |
|---|---|
| `language:Java` | the population, as GitHub states a primary language |
| `fork:false`, `mirror:false` | a fork is another repository's words copied, so counting it twice is a sampling defect. GitHub excludes forks by default; stating it changed the count by one |
| `size:>=1000` | one megabyte. **A stated bound, not a derived one** — the only number here somebody could argue with. Leave-one-out over the ten settles it and has not been run |
| `created:<2026-08-21` | a ceiling, so the frame is the same set on a later day |

Deliberately absent: stars, watchers, recent activity, archived state, and anything about content. Each selects for maturity or subject, and a reference chosen for what it contains is the defect this file exists to remove.

**The draw is two-stage, because GitHub's `total_count` is an estimate above a few hundred thousand and is not monotonic in a date bound** — the same frame counted 3,856,241 before 2026-01-22 and 3,850,658 before 2026-02-05. A seeded rank selects a time slice with probability proportional to its estimated size; a second draw from the same stream selects uniformly within the slice, where the count is small enough to be exact. Uniform over the frame to about 0.2%.

A first implementation resolved a rank by cumulative arithmetic alone, produced negative offsets from that non-monotonicity, and discarded them — a silent bias. **It was replaced before any row was drawn**, which is the only point at which replacing an instrument is not a choice about its output.

A reference chosen after seeing what it demotes is the same defect as choosing a member's expected subject after reading its tree. What the draw still owes, unchanged:

| | |
|---|---|
| Seed | 20260821, Python's `random.Random`, recorded in the manifest so the draw reproduces and is not a choice |
| Size | ten |
| Pinned | one commit SHA per repository, as `evaluation-set.tsv` pins its members |
| Licence | verified at the revision, recorded. A repository is read, never redistributed, so one stating no licence is recorded as stating none rather than replaced |
| Disjoint | from this repository and from all nine evaluation-set members. **A reference drawn from the corpus a reading is measured on is marking its own homework** |
| Recorded | in `reference-corpus.tsv` beside `evaluation-set.tsv`, with the same header discipline: what it is, where it came from, what it costs to change |

**On the doctrine.** A bundled *vocabulary* that votes must be a curated statement of a published standard. This is neither curated nor a voter: it is a denominator, sampled rather than chosen, and it is the same class of thing as the bundled frequency list that already serves as the English reference. What must not happen is a repository being picked because of what it contains.

## The second sample, stated before it is drawn

The first three rows of the uniform draw are `MVC-Template`, `StarWatchX` and `ahsan` — individual projects, none stating a licence. That is not a defect in the draw. Uniform over 4,154,178 Java repositories *is* mostly individual projects, and a draw that returned ten Apache-shaped libraries would mean the frame had been narrowed somewhere.

It does put a question to the reference that no argument settles. The nine evaluation members are maintained multi-author libraries and servers. Individual projects write `id`, `get`, `name` and `value`, so those will sink. They may not write `log`, `license`, `apache`, `builder`, `factory` or `optional` — which are what maintained projects share, and which the reference is equally meant to demote.

So a second sample, from a second frame, drawn to the same discipline and compared against the first:

```
language:Java fork:false mirror:false size:>=1000 stars:>=50 created:<2026-08-21
```

`stars:>=50` selects for attention, not for content, so it does not breach the rule this file exists to enforce. **It is not neutral either** — attention correlates with maturity, and maturity is closer to what the members are. That is exactly why it is a *second sample* rather than an edit to the first: two denominators, each with a stated frame, and the comparison is the evidence. `RepositoryManifest` takes either by name, so this costs one file.

**The star floor is not free, and what it costs is measurable.** Stars accumulate, so a repository needs time to reach fifty. The starred frame holds 28,261 repositories against the uniform frame's 4,154,178, and its yearly counts peak in 2016 and fall to 302 in 2026, where the uniform frame's rise to 2025:

| Frame | Size | Median repository created |
|---|--:|---|
| uniform | 4,154,178 | 2021 |
| `stars:>=50` | 28,261 | **2017** |

Four years older at the median. Java written in 2017 is Java before records, before `var` was common, with streams still arriving — so the starred sample trades a maturity gap for an age gap, and a denominator built from it would demote 2017's vocabulary rather than today's. **Neither frame is the neutral one.** That is the argument for reading both and reporting each reference's claim separately, which `ChosenWord.against` already carries.

**Both samples are drawn, and the result is not what either branch of that comparison assumed.** The starred sample is five-tenths Android, two-tenths teaching material, three-tenths libraries:

| | uniform ten | starred ten |
|---|---|---|
| Composition | coursework and hobby projects | Android apps, tutorials, three libraries |
| Stars | ten of ten at zero | 54 to 2,933 |
| Licence stated | none of ten | four of ten — two GPL-2.0, one GPL-3.0, one MIT |
| Median created | 2021 | 2017 |
| Clone cost | 129 MB | 223 MB |

**Neither resembles the evaluation-set members**, which are Apache-shaped libraries and servers. One denominator is coursework, the other is Android. That is a real result about GitHub rather than about the draw: server-side Java libraries are a thin slice of what GitHub's Java is, and no qualifier stated in advance here reached them.

So there is a third frame worth stating — repositories that publish an artefact, which is what a library does and what a course project does not. Maven Central's index is enumerable and is a published statement rather than a curated one. **It is not drawn here, because a frame is stated before it is drawn and this one was not stated before these twenty rows existed.** Whether it is worth the draw is a decision, not a default.

| | Answers |
|---|---|
| Both samples demote `id`, `log`, `test`, `get`, `buf` | the frame does not matter, and the uniform one stands because it assumes less |
| Only the starred sample demotes them | the denominator must resemble the code being read, and the frame is a stated bound to be argued in the open |
| Neither does | the defect is not the reference, and `A_CORPUS_NOT_AN_INDEX` is refuted on its own stated terms |

## The risk this plan has to bound

**Ten is a small sample and one contaminated draw kills a signal rather than noise.** A blockchain repository in the reference would demote `transaction`, `gas` and `block` for besu; a finance one would demote `trade` and `payment` for strata and fineract. That is the signal, not the noise, and no filter downstream can recover it.

Two things follow, and both are measurements rather than opinions:

- **Report each reference's claim separately**, which `ChosenWord.against` already carries. Where a word is demoted, the report must say *which* reference demoted it, so a contaminated draw is visible as one repository's doing rather than invisible in a pooled number.
- **State the draw's composition before the reading.** Ten repositories' stated subject areas, recorded from outside this project as the evaluation set records its members'. Where the draw lands two repositories in one area, that is a fact about the draw and is reported, never re-rolled — re-rolling until the sample looks right is choosing.

## What comes out when it lands

| Stage | Today | After |
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

# The reference corpus

A hundred Java repositories drawn at random from a stated GitHub query and pooled into one distribution over the names their authors declare. That distribution is the denominator every word in a reading is measured against.

- Draws from a query fixed before any repository is selected, at a recorded seed.
- Pins each repository to one commit and records the [SPDX](https://spdx.org/licenses/) licence at that commit.
- Clones them, reads the names their authors declared, and pools those into shares over words.
- Judges every pair of the sample, so one project drawn twice cannot be counted twice.

## Why a reading needs one

A count on its own says a repository writes `list` often. So does every repository written in Java. What a count cannot say is whether the author chose the word.

Ordinary English calls `get`, `id` and `buf` rare, and the Java platform's API index declares none of them. Measured against either, a repository writing those words looks like it chose them. A hundred working repositories write them densely, and that is the evidence which says otherwise.

Worked example. A repository declares `buffer` 300 times among 30,000 declared names, a share of 0.010. The corpus writes `buffer` at 0.002, so this repository writes it five times as densely and the reading reports the word. Had the corpus also written it at 0.010, the word would carry no evidence about this repository.

## How to use it

The whole sequence — draw, fetch, check for a repository counted twice, pool, bundle:

```
bash reference-corpus-extraction/draw-the-corpus.sh
```

It needs a shell that reaches GitHub. Export `GITHUB_TOKEN` first: the [GitHub search API](https://docs.github.com/en/rest/search/search) allows ten queries a minute unauthenticated and thirty with a token, and the draw spends its whole wall clock on paced queries.

The stages run on their own when only one is wanted.

| Command | Produces |
|---|---|
| `./gradlew :reference-corpus-extraction:corpusDraw -Dcs.draw.frame='<query>' -Dcs.draw.until=<ceiling> -Dcs.draw.seed=<seed> -Dcs.draw.count=<rows> -Dcs.draw.out=<record>.json` | a sample, with every rank and every rejection |
| `./gradlew :reference-corpus-extraction:corpusFetch -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=<draw>.tsv` | the working trees, each at its pinned commit |
| `./gradlew :reference-corpus-extraction:corpusDuplicates -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=<draw>.tsv` | which pairs are one project counted twice |
| `./gradlew :reference-corpus-extraction:corpusPool -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=<draw>.tsv -Dcs.corpus.out=<directory>` | one pooled table per weighting |
| `./gradlew :reference-corpus-extraction:corpusPlateau -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=<draw>.tsv` | how far the distribution still moves as the sample grows |
| `./gradlew :reference-corpus-extraction:corpusFloor -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=<draw>.tsv` | what each repository says that a resample of its size would not |

`corpusDraw` takes four further properties: `-Dcs.draw.publishes` requires a publication, `-Dcs.draw.exclude=owner/name,...` refuses named repositories, `-Dcs.draw.manifest=<file>.tsv` rewrites that manifest with its own header kept and the drawn rows beneath it, and `-Dcs.draw.total=<count>` refuses the draw unless the frame still holds that many.

`corpusFetch` skips a tree already at its pinned commit, so a second run transfers nothing. Write `$HOME` rather than `~`: no shell expands a tilde after `-D<name>=`, so the literal text resolves against the working directory, matches nothing, and exits zero having read nothing.

## What it produces

Three recorded samples, each drawn at seed 20260821 from its own frame.

| Sample | Frame | Rows |
|---|---|--:|
| [the sample of published libraries](src/main/resources/reference-corpus-published.tsv) | Java, licensed, pushed since 2025, and stating a publication | 100 |
| [the sample above fifty stars](src/main/resources/reference-corpus-starred.tsv) | Java, `stars:>=50` | 10 |
| [the uniform sample](src/main/resources/reference-corpus.tsv) | Java, no popularity or activity term | 10 |

The evaluation set the reading is scored on holds maintained libraries and servers. The published sample states licensing, recent activity and publication as query terms, so its repositories resemble them. The other two samples supply the comparison: the uniform frame yields coursework and personal projects, and a fifty-star floor yields Android applications and teaching material.

`corpusPool` writes one table per weighting, from a single read of the corpus.

| Weighting | Each word's share |
|---|---|
| pooled occurrences | its count over every repository, divided by the total. A repository of a million words sets a thousand times as much of the table as one of a thousand words |
| mean of shares | its share within each repository, averaged. Every repository weighs the same |

The mean of shares is what the library bundles, because the frame draws repositories rather than bytes.

## How the reading uses the result

The pooled table reaches a reading in four steps.

1. `corpusPool` writes `reference-corpus-mean-of-shares.tsv`.
2. That file is copied into the `reference-corpus` module as [`reference-corpus-shares.tsv`](../reference-corpus/src/main/resources/reference-corpus-shares.tsv).
3. [`PooledWordShares`](../reference-corpus/src/main/java/io/github/fiftieshousewife/codesemantics/reference/PooledWordShares.java) reads it and normalises the shares, which are written rounded.
4. [`CorpusVocabulary`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/CorpusVocabulary.java) presents it to the engine as a [`ReferenceVocabulary`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ReferenceVocabulary.java), beside ordinary English and the platform's API index.

**This module is separate from `reference-corpus` because the dependencies run the other way.** `code-semantics-engine` depends on `reference-corpus` for the bundled table, and this module depends on `code-semantics-engine` to read a repository the same way a reading does. Merging the two would make the engine depend on itself. `reference-corpus` is published to consumers; this module reaches the network and reads whole working trees, and neither belongs in a published artefact.

**Both sides of a comparison are read the same way.** [`PooledWords`](src/main/java/io/github/fiftieshousewife/codesemantics/corpus/PooledWords.java) walks each corpus tree through the same parse, the same identifier splitter and the same stage that keeps declared names and leaves out the sentences a repository wrote about them. A share here is comparable to a share there only because of that.

## Definitions

**Frame** — the GitHub query defining which repositories a sample can contain, with a ceiling on creation date. Each manifest states its own frame in its header.

**Rank** — a repository's position in its frame, ordered by creation time ascending. The fifth column of a drawn manifest.

**Seed** — the integer initialising the [Mersenne Twister](https://dl.acm.org/doi/10.1145/272991.272995) generator. 20260821 for all three samples.

**Publication test** — a repository qualifies when `pom.xml` at its pinned commit states a `<groupId>`, or `build.gradle` applies `maven-publish`.

**Divergence** — the [Jensen–Shannon divergence](https://ieeexplore.ieee.org/document/61115) between two distributions over words, in bits. It is symmetric and its maximum is exactly 1 bit, attained where the two share no word.

**One corpus counted twice** — two repositories whose divergence is smaller than two independent samples of their sizes would reach by chance. [`NearDuplicates`](src/main/java/io/github/fiftieshousewife/codesemantics/corpus/NearDuplicates.java) measures both figures for every pair; the member the manifest drew later is refused on a re-draw, so the earlier rank keeps what it drew.

## How it works

The [GitHub search API](https://docs.github.com/en/rest/search/search) reports `total_count` exactly and additively up to about a million results, and estimates above that. Every query the draw makes therefore bounds a range holding fewer than a million.

Worked example, the first row of the uniform sample.

1. Twenty yearly windows, counted exactly, sum to **4,154,178** repositories.
2. [`MersenneTwister`](src/main/java/io/github/fiftieshousewife/codesemantics/corpus/MersenneTwister.java) seeded at 20260821 yields **4,140,166** as its first value below that total.
3. That rank falls in the 2026 window, which holds 288,816 repositories. [`SampledFrame`](src/main/java/io/github/fiftieshousewife/codesemantics/corpus/SampledFrame.java) halves the window by creation time, counting each half exactly, until fewer than a thousand remain.
4. Offset 66 of that range, ordered by creation time ascending, is **eslamahmed123456g-cloud/MVC-Template**, created 2026-07-25 and pinned at `c47da0b2`.

[`RememberedCounts`](src/main/java/io/github/fiftieshousewife/codesemantics/corpus/RememberedCounts.java) asks for any one count once. Every rank in a year walks the same first ranges before diverging, and each of those costs a paced request. It also keeps a run internally consistent: a range counted twice can answer twice differently, and a halving whose bounds disagree resolves a rank to the wrong repository.

`MersenneTwister` reproduces the stream of [CPython's `random` module](https://docs.python.org/3/library/random.html): `init_by_array` seeding, and a bound drawn by taking the bits it requires and discarding values at or above it. Java's [`Random`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Random.html) implements a different algorithm and yields a different sample.

## The rules a sample holds to

- Every query term bounds language, size, fork status, licence or activity. None describes subject matter.
- The frame is recorded before selection begins.
- A sample grows by taking further values from the same seeded stream, which leaves recorded rows unchanged.
- A repository is refused only where it is this repository, an evaluation-set member, already drawn, named as an exclusion, or a rank GitHub declines to page. Each refusal is recorded with its rank.
- Licences are read at the pinned commit through the [GitHub licence API](https://docs.github.com/en/rest/licenses/licenses). Copyleft licences are recorded. Repositories are read; none is redistributed.

## Limitations

- The one-megabyte size floor is stated rather than derived.
- A hundred repositories give any one of them a hundredth of the pooled distribution. That figure is a budget rather than a derived bound, and the published manifest's header states the measurements behind it.
- `pushed` is a mutable property, so the frame's membership grows as dormant repositories are pushed to. A count is recorded beside each draw; reproducing a sample exactly comes from the manifest, which pins every repository at a commit.
- A draw records nothing until every row is taken. An interrupted run leaves the previous manifest intact and has to start again.

## References

- [CPython, `random` — Generate pseudo-random numbers](https://docs.python.org/3/library/random.html)
- [GitHub REST API, Licenses](https://docs.github.com/en/rest/licenses/licenses)
- [GitHub REST API, Search](https://docs.github.com/en/rest/search/search)
- [Java SE 21, `java.util.Random`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Random.html)
- [Lin, Divergence measures based on the Shannon entropy (1991)](https://ieeexplore.ieee.org/document/61115)
- [Matsumoto and Nishimura, Mersenne Twister (1998)](https://dl.acm.org/doi/10.1145/272991.272995)
- [SPDX License List](https://spdx.org/licenses/)

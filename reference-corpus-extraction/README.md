# The reference corpus

A hundred Java repositories drawn at random from a stated GitHub query. Each one's declared names are counted, those counts become shares of that repository's vocabulary, and the shares are averaged across all hundred into a single table of figures. That table says how densely working Java writes each word, which is what a reading compares a repository's own words against.

- Draws from a query fixed before any repository is selected, at a recorded seed.
- Pins each repository to one commit and records the [SPDX](https://spdx.org/licenses/) licence at that commit.
- Clones them, counts the names their authors declared, and averages those counts into one table of word frequencies.
- Compares every pair of drawn repositories, so the same project drawn twice cannot be counted twice.

## What it counts

A **declared name** is a name a repository's own authors invented: a class, method, field, parameter or local variable. It is the only part of a Java file the author chose.

```java
public final class TradeReportBuilder {

    private final BigDecimal notional;

    public String quoteFor(final LocalDate valuationDate) {
        return notional.toPlainString();
    }
}
```

Three kinds of word appear there, and only one of them says anything about this repository.

| | Words | Who chose them |
|---|---|---|
| **declared names** | `TradeReportBuilder`, `notional`, `quoteFor`, `valuationDate` | the author, to convey what the code is about |
| keywords | `public`, `final`, `class`, `private`, `return` | Java. Every Java file contains them |
| names declared elsewhere and used here | `BigDecimal`, `String`, `LocalDate` | the platform. The author quoted them |

The draw counts the first row and nothing else. The parse is what tells a declaration from a use, so the platform and the test frameworks drop out of every reading without any list of names to ignore.

Each declared name is then split into words by the same identifier grammar on both sides of any comparison: `TradeReportBuilder` gives `trade`, `report`, `builder`; `valuationDate` gives `valuation`, `date`; `notional` gives `notional`.

## Why the counts need a reference

A word frequency table for English lists how often each word appears across a large body of text: `the` at roughly one word in twenty, `notional` at around one in a hundred thousand. It is what separates a distinctive word from a common one. `notional` appearing three times in a document tells you what the document is about; `the` appearing three hundred times tells you nothing, because every document does that.

**Java source has its own frequencies, and they are not English's.** `list`, `get`, `value`, `id` and `impl` are to Java roughly what `the` and `of` are to English — every repository declares them constantly, so declaring them says nothing about any one repository. English frequency tables call several of those words rare, which is exactly backwards for code.

No published frequency table exists for Java identifiers. This is that table.

A reading needs to know which words a repository's authors chose. Counting alone cannot say, and neither can one reference. The library reads each declared word against three, and each answers a different objection.

| Reference | What it holds | What it settles |
|---|---|---|
| ordinary English | word frequencies in general English | `notional` and `sensitivity` are rare in English and rare in Java, so a repository writing them has said something |
| [the platform's own API](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/PlatformVocabulary.java) | the type names the Java platform declares — `List`, `Map`, `Stream`, `Buffer`, `Builder` | English calls `buffer` and `stream` rare, which makes them look chosen. The platform declares them, so a repository writing them has said only that it is a Java program |
| the reference corpus | the words a hundred working repositories declare | `get`, `id`, `buf` and `impl` are rare in English and are **not** platform type names, so neither reference above explains them. Working Java writes them constantly, and only a corpus of it can say so |

The third row is why this corpus exists. Without it, `get` and `id` outrank a repository's real subject vocabulary, because both of the other references agree they are rare.

Worked example. A repository declares `buffer` 300 times among 30,000 declared names, a share of 0.010. The corpus writes `buffer` at 0.002, so this repository writes it five times as densely and the reading reports the word. Had the corpus also written it at 0.010, the word would carry no evidence about this repository.

## How to use it

The whole sequence — draw, fetch, check for a repository counted twice, pool, bundle:

```
bash reference-corpus-extraction/draw-the-corpus.sh
```

It needs a shell that reaches GitHub. Export `GITHUB_TOKEN` first: the [GitHub search API](https://docs.github.com/en/rest/search/search) allows ten queries a minute unauthenticated and thirty with a token, and the draw spends its whole wall clock on paced queries.

The script runs four stages in order. Each is a Gradle task, available on its own when only one is wanted.

| | Stage | Task | Produces |
|--:|---|---|---|
| 1 | choose the repositories | `corpusDraw` | the manifest, and a record of every rank and every refusal |
| 2 | clone them | `corpusFetch` | one working tree per row, at its pinned commit |
| 3 | check for one project drawn twice | `corpusDuplicates` | every pair, with the verdict on each |
| 4 | count and average the words | `corpusPool` | the frequency table |

All four take `-Dcs.corpus.dir=$HOME/corpus` and `-Dcs.corpus.manifest=<draw>.tsv`, except `corpusDraw`, which states its own frame:

```
./gradlew :reference-corpus-extraction:corpusDraw -Dcs.draw.frame='<query>' -Dcs.draw.until=<ceiling> -Dcs.draw.seed=<seed> -Dcs.draw.count=<rows> -Dcs.draw.out=<record>.json
```

`corpusDraw` takes four optional properties: `-Dcs.draw.publishes` requires a publication, `-Dcs.draw.exclude=owner/name,...` refuses named repositories, `-Dcs.draw.manifest=<file>.tsv` rewrites that manifest with its own header kept and the drawn rows beneath it, and `-Dcs.draw.total=<count>` refuses the draw unless the frame still holds that many.

`corpusPool` needs `-Dcs.corpus.out=<directory>` for the tables it writes.

`corpusFetch` skips a tree already at its pinned commit, so a second run transfers nothing. Write `$HOME` rather than `~`: no shell expands a tilde after `-D<name>=`, so the literal text resolves against the working directory, matches nothing, and exits zero having read nothing.

Two further tasks ask questions about a sample rather than producing one. Neither reaches the network, and both take the same two properties as the stages above.

| Task | Answers |
|---|---|
| `corpusPlateau` | how far the table still moves as each repository joins, and how far two disjoint halves of the sample disagree with each other |
| `corpusFloor` | whether any drawn repository says less about working Java than a random resample of its own size would |

## What it produces

[The sample of published libraries](src/main/resources/reference-corpus-published.tsv) is the one the library pools and bundles: a hundred rows, drawn at seed 20260821 from a frame stating Java, a licence, a push since 2025 and a publication. The evaluation set the reading is scored on holds maintained libraries and servers, and those query terms are what make the sample resemble them.

Two smaller samples are recorded beside it and neither is pooled. [The uniform sample](src/main/resources/reference-corpus.tsv) states no popularity or activity term and yields coursework and personal projects. [The sample above fifty stars](src/main/resources/reference-corpus-starred.tsv) yields Android applications and teaching material. They are kept for two reasons: they are the record that the published frame was written before its results were seen rather than chosen after, and `MersenneTwisterTest` asserts against their recorded ranks that this project's generator reproduces CPython's stream.

### Pooling: turning a hundred repositories into one table

Each repository is counted on its own first. Its declared names are tallied, and each tally is divided by that repository's total, giving the **share** of that repository's vocabulary the word occupies. `buffer` declared 100 times among 10,000 names has a share of 0.010.

Pooling then combines those per-repository shares into one column of figures summing to one across every word. A column summing to one is a probability distribution, which is what lets it be compared with another repository's distribution.

Two repositories can be combined in two ways, and they answer different questions.

Worked example. Repository A declares 10,000 names, 100 of them `buffer`. Repository B declares 1,000 names, 5 of them `buffer`.

| Weighting | Arithmetic | `buffer` |
|---|---|--:|
| pooled occurrences | (100 + 5) ÷ (10,000 + 1,000) | 0.00955 |
| mean of shares | (100/10,000 + 5/1,000) ÷ 2 | 0.00750 |

Pooled occurrences gives every occurrence equal weight, so A sets ten times as much of the figure as B and the result sits near A's own rate of 0.010. The mean of shares gives every repository equal weight, so A and B count once each and the result sits between their two rates.

`corpusPool` writes both tables from a single read of the corpus. **The library bundles the mean of shares**, because the frame draws repositories at random and a repository is therefore the unit that should weigh one. Under pooled occurrences a single large repository can set a word's figure for the whole corpus.

### Comparing every pair: one project drawn twice

Two repositories that are copies of the same project write nearly the same words in nearly the same proportions. So do two unrelated Java repositories, up to a point, because they share the language's common vocabulary. Similarity alone therefore decides nothing, and the frame's `fork:false` term catches only GitHub's own forks, never an independent copy somebody uploaded separately.

`corpusDuplicates` measures two figures for every pair of the sample.

1. How far the two sit from each other, as a divergence in bits.
2. How far two random samples of exactly those two sizes, drawn from the distribution the pair would share if they were one project, sit from each other. That is what chance reaches.

A pair sitting closer than chance has not been shown to be two repositories.

Worked example, from a draw containing two independent copies of the same generated test corpus.

| Pair | Sit apart | Chance reaches | Verdict |
|---|--:|--:|---|
| the two copies | 0.000689 | 0.044737 | 65 times nearer than chance — one project |
| the nearest genuinely different pair | 0.368918 | 0.067204 | 5 times further than chance — two repositories |

Every pair is printed, so the pairs immediately above the cutoff can be read. Where a pair is one project, the member the manifest drew later is refused on a re-draw and the draw takes the next rank, so the earlier rank keeps what it drew and no recorded row is deleted.

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

**Seed** — the number that fixes which repositories a sample contains. The draw generates positions in the frame with a [Mersenne Twister](https://dl.acm.org/doi/10.1145/272991.272995) pseudo-random generator, which produces the same sequence every time from the same starting number, so the sample is unrelated to subject matter and anybody can check that these repositories are the ones the seed selects. 20260821 for all three samples.

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

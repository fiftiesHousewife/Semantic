# The reference corpus

Thirty Java repositories, drawn at random from a stated population, supplying the word frequencies this library's own vocabulary is measured against.

- Samples GitHub by a query fixed before any repository is selected, from a recorded seed.
- Pins each repository to one commit and records the SPDX licence read at that commit.
- Clones them, reads the names their authors declared, and pools those into one distribution over words.

## How to use it

| Command | Produces |
|---|---|
| `./gradlew :reference-corpus-extraction:corpusFetch -Dcs.corpus.dir=$HOME/corpus` | the thirty working trees, each at its pinned commit |
| `./gradlew :reference-corpus-extraction:corpusFetch -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=<a draw>.tsv` | the trees a different sample names |
| `./gradlew :reference-corpus-extraction:corpusDraw -Dcs.draw.frame='language:Java size:>=1000' -Dcs.draw.until=2026-08-20T23:59:59Z -Dcs.draw.seed=20260821 -Dcs.draw.count=10 -Dcs.draw.out=<record>.json` | a new sample, with every rank and every rejection |

`corpusFetch` skips a tree already at its pinned commit, so a second run transfers nothing. The thirty published repositories occupy 1,034 MB. Write `$HOME` rather than `~`: no shell expands a tilde after `-D<name>=`, so the literal text resolves against the working directory, matches nothing, and exits zero having read nothing.

`corpusDraw` queries the GitHub API and runs outside any ordinary build. Add `-Dcs.draw.publishes` to require a publication, and `-Dcs.draw.exclude=owner/name,...` to refuse named repositories.

## What it produces

| Sample | Query | Rows | Composition |
|---|---|--:|---|
| [the uniform sample](src/main/resources/reference-corpus.tsv) | `language:Java fork:false mirror:false size:>=1000` | 10 | coursework and personal projects, all with zero stars and no licence |
| [the sample above fifty stars](src/main/resources/reference-corpus-starred.tsv) | the same, plus `stars:>=50` | 10 | five Android projects, two teaching repositories, three libraries |
| [the sample of published libraries](src/main/resources/reference-corpus-published.tsv) | the same, plus a licence, `pushed:>=2025-01-01`, and a publication test | 30 | libraries, every one licensed |

The evaluation set holds maintained libraries and servers. The first two samples hold neither, because such projects are a small share of the Java on GitHub. The third sample states licensing, recent activity and publication as query terms.

## Definitions

**Frame** — the GitHub query defining which repositories the sample can contain, together with a ceiling on creation date. Recorded in each manifest before selection begins.

**Rank** — a repository's position in its frame, ordered by creation time ascending. The fifth column of a drawn manifest.

**Seed** — the integer initialising the [Mersenne Twister](https://dl.acm.org/doi/10.1145/272991.272995) generator. 20260821 for all three samples.

**Publication test** — a repository qualifies when `pom.xml` at its root states a `<groupId>`, or `build.gradle` applies `maven-publish`, at its pinned commit. Half the licensed, actively-pushed repositories drawn failed it.

## How it works

The [GitHub search API](https://docs.github.com/en/rest/search/search) reports `total_count` exactly, and additively, up to about a million results; above that it estimates. The estimate falls as the date bound rises: the uniform frame counted 3,833,338 repositories created before 2026-01-08 and 3,804,662 before 2026-01-22. Every query the draw makes therefore bounds a range holding fewer than a million.

Worked example, the first row of the uniform sample:

1. Twenty yearly windows, counted exactly, sum to **4,154,178** repositories. Single queries for the whole frame returned 4,077,965, 3,980,293, 4,058,528 and 3,907,106 within two hours.
2. [`MersenneTwister`](src/main/java/io/github/fiftieshousewife/codesemantics/corpus/MersenneTwister.java) seeded at 20260821 yields **4,140,166** as its first value below 4,154,178.
3. That rank falls in the 2026 window, which holds 288,816 repositories. Halving the window by creation time, each half counted exactly, reaches a window holding fewer than a thousand.
4. Offset 66 of that window, ordered by creation time ascending, is **eslamahmed123456g-cloud/MVC-Template**, created 2026-07-25 and pinned at `c47da0b2`.

`MersenneTwister` reproduces the stream of [CPython's `random` module](https://docs.python.org/3/library/random.html): `init_by_array` seeding, and a bound drawn by taking the bits it requires and discarding values at or above it. Java's [`Random`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Random.html) implements a different algorithm and yields a different sample. `MersenneTwisterTest` asserts that the port reproduces the ranks the uniform and starred manifests record.

## The rules a sample holds to

- Every query term bounds language, size, fork status, licence or activity. None describes subject matter.
- The frame is recorded before selection begins.
- A sample is extended by taking further values from the same seeded stream, which leaves recorded rows unchanged. Selection is never repeated.
- Rejections are limited to this repository, the nine evaluation-set members, a repository already drawn, and a rank GitHub declines to page. Each is recorded with its rank.
- Licences are read at the pinned commit through the [GitHub licence API](https://docs.github.com/en/rest/licenses/licenses), which returns Apache-2.0 for `apache/tika` and nothing for a repository carrying no licence file. Copyleft licences are recorded. Repositories are read; none is redistributed.

## Limitations

- The one-megabyte size floor is stated rather than derived. Leave-one-out across the thirty repositories would establish it and has not been run.
- Ten repositories give any one of them a tenth of the pooled word counts, so a single repository writing a subject vocabulary distorts it. Thirty reduces that to a thirtieth. Neither figure is derived.
- Unauthenticated, the search API allows ten queries a minute and enforces a lower secondary limit. A sample costs roughly ten queries per row.
- The pooled distribution the samples exist to produce is not built yet.

## References

- [CPython, `random` — Generate pseudo-random numbers](https://docs.python.org/3/library/random.html)
- [GitHub REST API, Licenses](https://docs.github.com/en/rest/licenses/licenses)
- [GitHub REST API, Search](https://docs.github.com/en/rest/search/search)
- [Matsumoto and Nishimura, Mersenne Twister (1998)](https://dl.acm.org/doi/10.1145/272991.272995)
- [SPDX License List](https://spdx.org/licenses/)

# The reference corpus

The reading ranks a repository's words by how far they depart from what it is read against, and keeps the weakest claim any reference makes. This module draws and fetches one of those references.

## What it is for

`PlatformVocabulary` reads the JDK's **declared type names**, where each name appears about once. Working Java writes the same words thousands of times, so a word common in real code departs enormously from a reference that names it once. `id` is the strongest claim in two of the nine evaluation-set members, judged against the platform's own API. Three stages of the word pipeline — `SYMBOL`, `SHORTHAND` and `LANGUAGE` — exist to remove `id`, `buf` and `the` by rule because the ranking promotes them, and the doctrine's first line refuses that: signals are votes, never gates.

A corpus of real Java writes those words constantly, so they sink on their own. That is what this module supplies.

## The three draws

Each is a seeded sample from a frame stated **before** any row was drawn, and each records every rank and every rejection.

| Manifest | Frame | Rows | What it turned out to be |
|---|---|--:|---|
| [`reference-corpus.tsv`](src/main/resources/reference-corpus.tsv) | `language:Java fork:false mirror:false size:>=1000` | 10 | coursework and hobby projects; zero stars and no licence between them |
| [`reference-corpus-starred.tsv`](src/main/resources/reference-corpus-starred.tsv) | the same, plus `stars:>=50` | 10 | five Android projects, two pieces of teaching material, three libraries |
| [`reference-corpus-published.tsv`](src/main/resources/reference-corpus-published.tsv) | the same, plus a licence, `pushed:>=2025-01-01`, and a publication predicate | 30 | libraries; every one licensed |

**Neither of the first two resembles the evaluation-set members**, which are Apache-shaped libraries and servers. That is a fact about GitHub rather than about the draw — server-side Java libraries are a thin slice of what GitHub's Java is — and it is why the third frame states what it wants directly instead of hoping a popularity proxy reaches it.

## Running it

```
./gradlew :reference-corpus-extraction:corpusFetch -Dcs.corpus.dir=$HOME/corpus
./gradlew :reference-corpus-extraction:corpusFetch -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=<a draw>.tsv
```

Nothing is fetched for a tree already at its pin, so a second run costs nothing. The published thirty is about 1,034 MB. Use `$HOME` rather than `~`: no shell expands a tilde after `-D<name>=`, and the literal resolves against the working directory, matches nothing and reads nothing while exiting zero.

A new draw, which reaches the network and is never part of an ordinary build:

```
./gradlew :reference-corpus-extraction:corpusDraw -Pframe='language:Java fork:false size:>=1000' -Pseed=20260821 -Pdraws=10 -Pout=<record>.json
```

## Why the draw is shaped the way it is

**GitHub's `total_count` is exact and additive below about a million and an estimate above it**, and the estimate is not monotonic in a date bound — the same frame counted 3,833,338 repositories created before 2026-01-08 and 3,804,662 before 2026-01-22, a fortnight later. So every query the draw makes is a bounded range holding fewer than a million:

1. Yearly windows, counted exactly, give an exact cumulative index. The uniform frame is 4,154,178 repositories. A single query for the same frame returned four different numbers within two hours, and none of them is right.
2. A seeded rank picks its year, then halves within it until the window holds under a thousand, which is GitHub's page cap.
3. The rank's offset indexes that page directly.

Two earlier implementations were abandoned, both before any row was drawn. One resolved ranks by arithmetic over unbounded `created:<t` queries and discarded the negative offsets that produced, which biases toward whatever GitHub under-counts. The other halved on estimate noise twenty thousand wide over windows truly holding a few dozen.

## Reproducing a draw

The seed reproduces the ranks, and the ranks reproduce the rows. [`MersenneTwister`](src/main/java/io/github/fiftieshousewife/codesemantics/corpus/MersenneTwister.java) is MT19937 seeded and consumed exactly as CPython's `random` module does — `init_by_array` seeding, and a bound drawn by taking the bits it needs and discarding anything too large rather than folding it back by a remainder. Java's own generator is a different algorithm, so a port using it would produce a different sample and falsify every rank already recorded. `MersenneTwisterTest` asserts the port reproduces the uniform and starred manifests from their seeds.

## What must not happen

- **No repository is picked for what it contains.** A frame bounds by language, size, fork, licence and activity, never by subject. A reference chosen for what it demotes is the defect this module exists to remove.
- **A draw is never re-rolled.** Where a draw concentrates in one subject area, that is a fact about it and is reported. A draw *extends* — rows eleven onward are the next values from the same stream, so every row already recorded stays as it was.
- **A frame is stated before it is drawn.** Adding a qualifier after seeing which rows a draw produced is choosing.
- **A drawn repository is read, never redistributed.** Licences are verified at the pinned commit, not at the branch head, and copyleft is recorded rather than refused.

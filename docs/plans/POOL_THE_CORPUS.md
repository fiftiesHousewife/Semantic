# Pool the corpus: turn thirty drawn repositories into the denominator

**This is the live plan.** It continues [`RANK_DO_NOT_GATE.md`](RANK_DO_NOT_GATE.md) from its fourth step and takes its criteria from [`A_CORPUS_NOT_AN_INDEX.md`](A_CORPUS_NOT_AN_INDEX.md). Written 2026-08-22 at `f4e6301`, working tree clean.

## Where this starts

The sampling is finished and pushed. Nothing is cloned and nothing is pooled.

| | |
|---|---|
| `repository-clones` | `PinnedRepository`, `RepositoryManifest`, `PinnedClone`. Depends on nothing |
| `reference-corpus-extraction` | three drawn manifests, `corpusFetch`, `corpusDraw`, the whole draw in Java. Depends on `repository-clones` |
| `reference-corpus` | **not created.** It arrives with the table it exists to bundle |
| Tests | 1,316 across six modules |

Three samples, each seeded 20260821, each reproducible — `MersenneTwisterTest` asserts the Java generator reproduces the recorded ranks.

| Sample | Rows | Composition | Bytes |
|---|--:|---|--:|
| uniform | 10 | coursework, zero stars, no licences | 129 MB |
| `stars:>=50` | 10 | five Android, two teaching, three libraries | 223 MB |
| **published** | 30 | libraries, every one licensed | **1,034 MB** |

**Pool the published thirty.** It is the only sample resembling the evaluation set, which is maintained libraries and servers. The other two stay as the record that the published frame was not chosen after seeing its results.

## The work, in order

**1. Let the extraction read Java.** `reference-corpus-extraction` needs `implementation(project(":code-semantics-engine"))` for `ParsedRepository` and `IdentifierWords`. The chain stays acyclic: `repository-clones` ← `code-semantics-engine` ← `reference-corpus-extraction`.

**2. Fetch the thirty.**

```
./gradlew :reference-corpus-extraction:corpusFetch -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=reference-corpus-extraction/src/main/resources/reference-corpus-published.tsv
```

About a gigabyte, and slow. Nothing is fetched for a tree already at its pin, so a second run transfers nothing. `$HOME`, never `~`.

**3. Pool them into one distribution.** Read each tree the way this library reads itself — declared names only, split by `IdentifierWords`, comment prose left out — and sum the word counts across all thirty. Write a provenance-headed TSV: `word`, `occurrences`, `share`, with the frame, the seed, the thirty repositories and their pinned commits in the header.

**4. Bundle it.** Create `reference-corpus`, published, holding that table and a reader. `CorpusVocabulary implements ReferenceVocabulary` in the engine wraps it, as `EnglishVocabulary` wraps `WordRanks`.

**5. Measure the gates before touching them.** This is the step the plan exists for, and it needs no gate removed and no backtest.

`ChosenWord` already carries `removedAt`, naming which stage would remove each word. With the corpus as a third reference, ask of the 189 words the three gates remove: does each still clear the chance bar `VocabularyNull` derives?

| Stage | Words it removes | Occurrences | Prediction |
|---|--:|--:|---|
| `SYMBOL` | 27 | 3,477 | `id`, `x`, `i` fall below chance |
| `SHORTHAND` | 48 | 909 | `buf`, `ref`, `pom` fall below chance |
| `LANGUAGE` | 114 | 3,056 | `the`, `a`, `of` fall below chance |

Every word that falls below the bar is a word its stage no longer needs to remove. The vocabulary page draws everything above chance and nothing else, so a stage whose words all sit below the bar changes no picture.

**6. Backtest twice.** The corpus beside the JDK index, and the corpus replacing it. Whether the index still earns a place is a question.

```
./gradlew evaluationReadAll -Dcs.evaluation.dir=$HOME/evaluation
```

**7. Remove the gates one at a time**, each with its own run. `SYMBOL`, `SHORTHAND` and `LANGUAGE` become markers: a word ranks where its claim puts it, annotated with what the dictionaries say about it.

## Stated before the runs

From [`A_CORPUS_NOT_AN_INDEX.md`](A_CORPUS_NOT_AN_INDEX.md), unchanged:

- **The reference works** when `id`, `log`, `test`, `get` and `buf` are no longer among any member's leading claims, and each member's own subject vocabulary still is.
- **A gate may go** when its words rank where their claim puts them without it, on all nine members.
- **The plan is refuted** if the thirty demote a member's subject vocabulary — `trade` for strata, `gas` for besu — or if the leading claims after pooling are the words that led before.

## Open, and each needs a measurement rather than an argument

**The tail.** Thirty repositories will produce somewhere between 100,000 and 400,000 distinct words, most seen once, and a bundled table of them runs to several megabytes. Truncating it changes readings: a word absent from a reference has a share of zero, which is the case where nothing demotes it, so cutting the tail promotes exactly the words cut. The bound must be derived. Leave-one-out across the thirty gives it: pool twenty-nine, read the thirtieth, and find the count below which a word's share moves more between draws than between corpora.

**Whether thirty is enough.** The same leave-one-out answers it. A seeded draw extends without being re-rolled — rows thirty-one onward are the next values from the same stream — so a larger sample costs a fetch and changes no recorded row.

**The size floor.** One megabyte is stated, not derived, and is the one number in the frame somebody could argue with.

## What a fresh session needs

- **Bandwidth is no longer a constraint, but fetching is slow.** The evaluation clones at `$HOME/evaluation` are still not to be re-fetched.
- **`$HOME`, never `~`** — no shell expands a tilde after `-D<name>=`, and the literal matches nothing while exiting zero.
- **Gradle needs the toolchain path in the agent sandbox**: `-Dorg.gradle.java.installations.paths=/Library/Java/JavaVirtualMachines/jdk-25.jdk/Contents/Home`.
- **A Gradle `Exec` or `JavaExec` task reaches the network here.** The no-route note applies to the forked test JVM.
- **`checkAll` hand-lists its modules.** A module missing from that list is a module the gate skips, silently.
- **A cached `BUILD SUCCESSFUL` reads exactly like a real one.** Check the test counts, not the exit code.
- **Only `output/json/` and `output/tika/` are tracked.** The other eight members' readings are untracked local files, and a baseline overwritten is a baseline gone.
- The vocabulary page: `./gradlew vocabularyPage`, then open `code-semantics-engine/build/reports/vocabulary/vocabulary.html`. It draws every word above chance — 324 at the last stage — sized by the claim in bits and coloured by distance from chance, both logarithmic.

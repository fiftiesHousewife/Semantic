# Pool the corpus: turn thirty drawn repositories into the denominator

**This is the live plan.** It continues [`RANK_DO_NOT_GATE.md`](RANK_DO_NOT_GATE.md) from its fourth step and takes its criteria from [`A_CORPUS_NOT_AN_INDEX.md`](A_CORPUS_NOT_AN_INDEX.md). Written 2026-08-22 at `f4e6301`, working tree clean.

## Where this starts

The thirty are cloned, pooled both ways, and measured on all nine evaluation-set members. **The corpus reads**, and what is left is a sample-size question rather than a question about the idea.

| | |
|---|---|
| `repository-clones` | `PinnedRepository`, `RepositoryManifest`, `PinnedClone`. Depends on nothing |
| `reference-corpus-extraction` | three drawn manifests, `corpusFetch`, `corpusDraw`, `corpusPool`, the whole draw in Java. Depends on `repository-clones` and `code-semantics-engine` |
| `code-semantics-engine` | `CorpusVocabulary` reads a pooled table as a `ReferenceVocabulary`; `CorpusReferenceProbe` ranks against it |
| `reference-corpus` | **not created.** It arrives with the table it exists to bundle, and which table to bundle is step 6's answer |
| Tests | 1,333 across six modules |

**The clones do not have to live in `$HOME`.** `corpusFetch` and `corpusPool` both run inside the agent sandbox writing to `$TMPDIR`, and GitHub is reachable from it — thirty shallow clones took 10m 52s for 1.3 GB, and pooling them 54s. `$HOME/corpus` is refused by the sandbox and needs Pippa's own shell; it is the durable home, and `$TMPDIR` is the one that survives only the session.

Three samples, each seeded 20260821, each reproducible — `MersenneTwisterTest` asserts the Java generator reproduces the recorded ranks.

| Sample | Rows | Composition | Bytes |
|---|--:|---|--:|
| uniform | 10 | coursework, zero stars, no licences | 129 MB |
| `stars:>=50` | 10 | five Android, two teaching, three libraries | 223 MB |
| **published** | 30 | libraries, every one licensed | **1,034 MB** |

**Pool the published thirty.** It is the only sample resembling the evaluation set, which is maintained libraries and servers. The other two stay as the record that the published frame was not chosen after seeing its results.

## The work, in order

**1. Let the extraction read Java. Done at `e696fbe`.** `reference-corpus-extraction` depends on `code-semantics-engine`, and the chain is acyclic: `repository-clones` ← `code-semantics-engine` ← `reference-corpus-extraction`.

**2. Fetch the thirty.**

```
./gradlew :reference-corpus-extraction:corpusFetch -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=reference-corpus-extraction/src/main/resources/reference-corpus-published.tsv
```

About a gigabyte, and slow. Nothing is fetched for a tree already at its pin, so a second run transfers nothing. `$HOME`, never `~`.

**3. Pool them into one distribution. Done at `e696fbe`; it needs step 2 to have a corpus to read.**

```
./gradlew :reference-corpus-extraction:corpusPool -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=reference-corpus-extraction/src/main/resources/reference-corpus-published.tsv -Dcs.corpus.out=<table>.tsv
```

`PooledWords` reads each tree by the path this library reads itself with and takes it at `WordStage.NAMES` — declared names, split by `IdentifierWords`, with the sentences the repository wrote about them left out. One tree at a time, each tally merged and discarded before the next is parsed. `PooledVocabularyTsv` writes `word`, `occurrences`, `share` under a header carrying `DrawnManifest` whole: the drawing file's own statement of the frame, the predicate and the seed, copied rather than restated, and one comment row per pinned repository. An empty pool fails rather than writing a table.

Run over this repository as a one-member corpus it takes six seconds: 2,025 words over 26,471 occurrences.

**4. Bundle it.** Create `reference-corpus`, published, holding that table and a reader. `CorpusVocabulary implements ReferenceVocabulary` in the engine wraps it, as `EnglishVocabulary` wraps `WordRanks`.

**5. Measure the gates before touching them. Done at `30a95ba`, on all nine evaluation-set members.**

`CorpusReferenceProbe` ranks every declared name with no stage having filtered it, so `the`, `a`, `get` and `buf` are in the field and the chance bar decides. Filtering first would answer a different question and answer it by hand.

```
./gradlew corpusReference -Pcorpus=<table> -Dcs.clone.dir=$HOME/evaluation/<member>
```

**The corpus reads.** It removes 17% of the above-chance field across the nine — 8,206 words to 6,847 — and never less than 11% on any member.

| Member | Eng+plat | +corpus | Removed | `buf` | `id` | `name` | `x` |
|---|--:|--:|--:|---|---|---|---|
| aeron | 691 | 613 | 11% | yes→no | yes→yes | yes→no | no |
| besu | 1,399 | 1,153 | 18% | yes→no | yes→no | no | no |
| fineract | 1,070 | 870 | 19% | no | yes→yes | yes→no | no |
| jpos | 672 | 565 | 16% | yes→yes | yes→no | no | no |
| maven | 707 | 547 | 23% | yes→no | yes→no | no | no |
| quickfixj | 416 | 359 | 14% | yes→yes | yes→no | yes→no | yes→no |
| santuario | 540 | 462 | 14% | yes→yes | yes→no | yes→no | yes→no |
| strata | 1,492 | 1,311 | 12% | yes→yes | yes→no | yes→no | yes→yes |
| tika | 1,219 | 967 | 21% | yes→yes | yes→no | yes→no | no |

Each member's subject vocabulary survives. strata still leads with `trade`, `rate`, `sensitivity`, `curve`, `notional` and `present_value`; the criterion in **Stated before the runs** is met.

**What each stage earned:**

| Stage | Verdict | Evidence |
|---|---|---|
| `SHORTHAND` | **stays** | `buf` stands above chance on five of nine with the corpus in. Its rule is a citation — the dictionaries expand the form for more things than it means as a word — not a hand list |
| `SYMBOL` | **stays** | `x` survives on strata, `id` on aeron and fineract |
| `LANGUAGE` | **redundant on the nine** | `a`, `the` and `of` are below chance on every member before any stage runs. It does work only on this repository, whose test names are English sentences — where `a` survives at 21st in every configuration |

**The failures are a sample-size problem, and that is a measurement rather than an excuse.** `buf` and `x` are the words whose corpus share is smallest, and the smallest shares are the noisiest. The thirty write `buf` at 6e-05, estimated from an effective 4.94 repositories, none of which does buffer-heavy work. Before this run the alternative explanation was live — that the reference *kind* was wrong, in which case no fetch would help — and a corpus that removed 17% consistently rules it out.

**6. Measure the plateau, then extend the draw.** Before fetching more, ask the thirty already on disk how far from converged they are: JSD between the reference pooled from the first *n* and from the first *n*−1, bounded at 1 bit by its own definition. Where it is still falling steeply at 30, the draw extends — and rows thirty-one onward are the next values from the same seeded stream, so no recorded row changes.

**7. Backtest twice.** The corpus beside the JDK index, and the corpus replacing it. Whether the index still earns a place is a question.

```
./gradlew evaluationReadAll -Dcs.evaluation.dir=$HOME/evaluation
```

**8. Remove the gates one at a time**, each with its own run. `SYMBOL`, `SHORTHAND` and `LANGUAGE` become markers: a word ranks where its claim puts it, annotated with what the dictionaries say about it.

## Stated before the runs

From [`A_CORPUS_NOT_AN_INDEX.md`](A_CORPUS_NOT_AN_INDEX.md), unchanged:

- **The reference works** when `id`, `log`, `test`, `get` and `buf` are no longer among any member's leading claims, and each member's own subject vocabulary still is.
- **A gate may go** when its words rank where their claim puts them without it, on all nine members.
- **The plan is refuted** if the thirty demote a member's subject vocabulary — `trade` for strata, `gas` for besu — or if the leading claims after pooling are the words that led before.

## Two changes to the reading landed on 2026-08-22 with no number

Both move every figure the reading publishes. Neither has been measured on the evaluation set, because the backtest is deferred. **Measure them with the corpus run rather than separately**, and attribute the movement carefully — three changes will have landed between the last backtest and the next.

| Change | Cites | Effect here |
|---|---|---|
| `LegibilityTally` no longer reads a word its source set's own layout supplies | Maven's standard directory layout, which `PhraseTopics` already cited for the same word | `PageCursorTest` in `src/test/java` stops contributing `test`. 230 classes in this tree end in `Test`, and `test` held 245 occurrences |
| `JavaSource` no longer records a single-letter type parameter as a declared name | Oracle's stated convention that a type parameter is a single uppercase letter | `AxisResolution<A extends Enum<A>>` stops contributing `a` |

**`output/json/` is stale.** The self read was regenerated at 11:31, before both changes. Run `./gradlew read` and land the figures in a commit touching no Java.

## The 872 occurrences of `a` are explained: this repository's test names are English sentences

Pooling this tree as a one-member corpus at `e696fbe` gives `a` 899 declared-name occurrences and `the` 1,134, the top two words of the whole table. **Both are the articles of the camelCase English sentences the test convention requires**, and the splitter is reading them exactly as its javadoc says it will.

| Word | Occurrences | What produces it |
|---|--:|---|
| `the` | 1,134 | Plain camelCase. `keepsTheHeaderItsFileStatesBesideTheRepositoriesItPins` is split at every capital, so each `The` is a word |
| `a` | 899 | The acronym-run rule in `IdentifierWords`, which cuts one capital before the last of a run. `refusesAShortPieceTooRareToCountAsAWord` divides into `refusesA` and `ShortPiece`, and `refusesA` then splits into refuses and a |

The counts agree. The tree holds 859 boundaries of the form `A` followed by a capital across 721 distinct identifiers, plus the 38 identifiers beginning with a lone `a` that the earlier measurement found — 897 against the 899 the reading records. The remaining two are the difference between counting distinct spellings with `grep` and counting declarations, so the proper confirmation is `./gradlew wordPlace -Pwords="a the"`, not this arithmetic.

**The earlier measurement tested the wrong position.** `aValue` puts the article first and there are 38 of those. The other 859 put it in the middle, which is the same rule at a different offset and was never counted. The explanation transfers to `the` in [`RANK_DO_NOT_GATE.md`](RANK_DO_NOT_GATE.md) unchanged, and needs no acronym rule to do it.

Nothing is wrong with the reading. `SYMBOL` is no longer blocked by an unexplained figure.

### It changes the prediction in step 5, so the change is written down before the run

This tree's house style puts an article in almost every test name, and no other convention in common use does. If the thirty name tests any other way, the corpus carries `a` and `the` at a small fraction of this rate, and against a reference that barely writes them the two commonest words in this repository's declared vocabulary become its two strongest claims. **The pooled table's own first rows settle it**, so read them before running step 5.

| Word | Step 5 predicted | Predicted now | Why |
|---|---|---|---|
| `the`, `a` | fall below chance | **stand far above chance, on this tree** | The reference will not carry what the house style puts in every test name |
| `of`, `by` | fall below chance | fall below chance | Ordinary English supplies them, and `EnglishVocabulary` already carries them densely |

That is a finding about this repository and not about the evaluation set, whose nine members name tests conventionally. So `LANGUAGE` may be removable on the nine and not on this tree, and the two runs have to be read apart rather than pooled. Measure it; do not argue it.

## Where the picture stands

`./gradlew vocabularyPage` writes `code-semantics-engine/build/reports/vocabulary/vocabulary.html`, under `build/`, so `clean` removes it.

- Every word standing outside chance is drawn — 324 of the final stage's 1,259, 779 of the first stage's 4,266. How many is not a number chosen anywhere.
- Size is the claim in bits and colour and weight are the multiple of the chance bar, both logarithmic. A linear scale on either put four words in five into one band.
- **Dividing the claim by the occurrences that earned it was tried and measures nothing.** Where a reference does not carry a word, its term collapses to half the share here, so the term per occurrence is the same constant for every such word. It tied all sixty drawn words to six decimal places. The javadoc on `StagedVocabulary` records this.

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

# Pool the corpus: turn thirty drawn repositories into the denominator

**This is the live plan.** It continues [`RANK_DO_NOT_GATE.md`](RANK_DO_NOT_GATE.md) from its fourth step and takes its criteria from [`A_CORPUS_NOT_AN_INDEX.md`](A_CORPUS_NOT_AN_INDEX.md). Written 2026-08-22 at `f4e6301`, working tree clean.

## Where this starts

The thirty are cloned, pooled both ways, measured on all nine evaluation-set members, and the reference's own error is measured. **The corpus reads**: it removes 17% of the above-chance field across the nine without touching any member's subject vocabulary.

**What is left is not whether it works but how precisely.** One verdict in eight moves between two references built from disjoint halves of the draw, all of it among words whose claim sits near zero. The leading claims do not move at all.

| | |
|---|---|
| `repository-clones` | `PinnedRepository`, `RepositoryManifest`, `PinnedClone`. Depends on nothing |
| `reference-corpus-extraction` | three drawn manifests, `corpusFetch`, `corpusDraw`, `corpusPool`, `corpusPlateau`, `corpusFloor`, `corpusDuplicates`, the whole draw in Java. Depends on `repository-clones` and `code-semantics-engine` |
| `code-semantics-engine` | `CorpusVocabulary` reads a pooled table as a `ReferenceVocabulary`; `CorpusReferenceProbe` ranks against it |
| `reference-corpus` | **not created.** It arrives with the table it exists to bundle, and that is the mean-of-shares table — see step 6 |
| Tests | 1,354 across six modules |

**Bundle the mean of shares.** Both weightings were written so the choice could be measured rather than argued, and three measurements point one way: it matches what the frame drew, since the sample is uniform over repositories and not over bytes; no repository holds it more than 0.008 bits where pooled occurrences lets `ridi-dspace-server` hold it 0.085; and its convergence can be measured at all, where the pooled-occurrence curve is driven by whichever repository is largest. The two agree on the verdicts — 406 words above chance against 401 on this tree — so nothing is lost by taking the better-behaved one.

**The clones do not have to live in `$HOME`.** `corpusFetch` and `corpusPool` both run inside the agent sandbox writing to `$TMPDIR`, and GitHub is reachable from it — thirty shallow clones took 10m 52s for 1.3 GB, and pooling them 54s. `$HOME/corpus` is refused by the sandbox and needs Pippa's own shell; it is the durable home, and `$TMPDIR` is the one that survives only the session.

Three samples, each seeded 20260821, each reproducible — `MersenneTwisterTest` asserts the Java generator reproduces the recorded ranks.

| Sample | Rows | Composition | Bytes |
|---|--:|---|--:|
| uniform | 10 | coursework, zero stars, no licences | 129 MB |
| `stars:>=50` | 10 | five Android, two teaching, three libraries | 223 MB |
| **published** | 30 | libraries, every one licensed | **1,034 MB** |

**Pool the published thirty.** It is the only sample resembling the evaluation set, which is maintained libraries and servers. The other two stay as the record that the published frame was not chosen after seeing its results.

## Two defects in the drawn thirty, found 2026-08-23

**1. The same machine-generated project was drawn twice.** `benchmarkjava` and `codemedics-sample` both hold `org/owasp/benchmark/testcode/BenchmarkTest00001.java` and its ~2,700 siblings: they are copies of the OWASP Benchmark, a generated vulnerability test corpus. Together they carry **94,868 of 444,695 pooled occurrences — 21.3% of the reference**, and they are what puts `bar` (9,053), `benchmark` (5,747), `do` (3,701) and `something` (3,605) among the pooled-occurrence leaders.

The frame states `fork:false` for exactly this reason — *"a fork is another repository's words copied; counting them twice is a sampling defect"* — and it did not catch it, because these are independent copies rather than GitHub forks. **The qualifier does not do what the frame intended.**

**The predicate is measured, and it names one pair.** `NearDuplicates` takes every pair of the draw, measures how far the two sit from each other, and measures how far two draws of exactly their sizes — taken from the distribution they would share were they one corpus — sit from each other. A pair nearer than chance has not been shown to be two repositories. It is the same shape as `OccurrenceFloor`, bounded by the multinomial rather than by a chosen margin, and it names no repository.

```
./gradlew :reference-corpus-extraction:corpusDuplicates -Dcs.corpus.dir=$HOME/corpus -Dcs.corpus.manifest=reference-corpus-extraction/src/main/resources/reference-corpus-published.tsv
```

**One of the 435 pairs falls below chance, and it is the OWASP pair.** The cutoff sits in a gap of a factor of 535, so no pair sits near enough to it for the verdict to be arguable.

| Pair | Occurrences | Between | Chance | One corpus |
|---|--:|--:|--:|---|
| `codemedics-sample` / `benchmarkjava` | 47,391 / 47,477 | 0.000689 | 0.044737 | yes |
| `grassbbs` / `mcsmi` — the next nearest | 5,403 / 18,239 | 0.368918 | 0.067204 | no |
| `codemedics-sample` / `tutorialmod-template-1.21.1` — the furthest | 47,391 / 58 | 0.987609 | 0.311334 | no |

`benchmarkjava` is what a re-draw refuses: of a pair that is one corpus, the member the manifest drew later, so the earlier rank keeps what it drew and the rejection consumes a rank rather than deleting a row. `codemedics-sample` is row 9 and `benchmarkjava` row 11.

**2. Nearly half the reference's rows are not words.** 6,932 of 14,763 rows contain a digit — **47% of the vocabulary, 4.5% of the occurrences**. `col1` (735), `arg0` (360), `item1` (345), then a long tail of `map57571`, `b34242`, `temp039`. The first two trace to the OWASP Benchmark copies above; `temp039` to `openpnp`.

The splitter does this deliberately. `IdentifierWords` cites UAX #29 rules WB9 and WB10 — *do not break within sequences of digits, or digits adjacent to letters* — so `utf8Decode` reads as utf8 and decode. **The citation may not cover the case.** UAX #29 segments natural-language text, where `3a` and `A3` are meaningful units; a declared identifier is not text, and the Java Language Specification's identifier grammar says nothing about word boundaries. CLAUDE.md already records the letter/digit boundary as the piece of the splitter that is "blocked on a catalogue", because splitting `utf8` into utf and 8 needs one to know which glued forms are real.

**Do not filter them out of the corpus.** A reference is a denominator, and a word absent from it has a share of zero, so cutting a token from the corpus makes a repository writing it look like it chose it. **426 of strata's 1,343 above-chance words carry a digit, and 172 of aeron's 625** — `aeron1`, `buffer1`, `channel2`, `0001`. Filtering the corpus promotes every one of them. It is the trap this plan already names about truncating the tail, in another shape.

The corpus and the repository under reading are split by the same grammar, and that symmetry is the only thing making a share here comparable to a share there. **So the splitter is the only place a change is legitimate**, and a change there moves both sides at once. The question then splits in two, and only one half is worth anything:

| | Rows | Occurrences | What it needs |
|---|--:|--:|---|
| digits only — `0`, `0001`, `01` | 81 (0.5%) | 0.15% | Nothing. "A token with no letter is not a word" is grammar, needs no catalogue, and is symmetric |
| letters and digits — `col1`, `utf8` | 6,851 (46.4%) | 4.38% | A catalogue, to tell `utf8`, `x509` and `sha256` from `col1` and `map57571` |

The clean half buys almost nothing. The valuable half is exactly what CLAUDE.md already records as the piece of the splitter blocked on a catalogue.

**The measurement to run first, before any catalogue work:** split at every letter/digit boundary on both sides and read the nine. It may *improve* the reading rather than only tidying it — `aeron1` and `aeron2` are separate words today, diluting `aeron`, which is a genuine subject term for that member.

## What to do next, in order

Everything below rests on a measurement already taken. The record of each is in **The work, as it was done** further down.

| | Step | Why now |
|--:|---|---|
| **1** | **Draw a hundred under the closed frame** | `bash reference-corpus-extraction/draw-the-corpus.sh`, from Pippa's shell — the session's proxy defeats Java's `HttpClient`. The old frame grew every day and no draw under it was reproducible, so this is a fresh sample and a full fetch. No repository is excluded by name: the near-duplicate measurement names one or it does not |
| **2** | **Make the bar carry its own error** | About one verdict in ten moves at thirty repositories, all of it in words whose claim sits near zero. A word inside the reference's own sampling error has not been shown to stand above chance, and that error is already derivable from the split-half measurement — a bound, not a chosen margin. Cheaper than the ~300 repositories that would buy the same by fetching |
| **3** | **Backtest twice** | Corpus beside the JDK index, and replacing it. Whether the index still earns a place is open, and steps 1 and 2 both change what the answer looks like |
| **4** | **Decide whether to extend past a hundred** | Three hundred buys about two further points of churn for three times the source. Worth it only if step 2 leaves churn that still bites, which is unlikely — a hundred is where the curve flattens |
| **5** | **Retire `LANGUAGE`; keep `SYMBOL` and `SHORTHAND`** | `a`, `the` and `of` are below chance on all nine members before any stage runs. `buf` survives on five of nine and `x` on strata, so those two still have work |

**Done, and not to be re-opened:** the corpus reads (17% of the above-chance field removed across the nine, subject vocabulary intact everywhere); the weighting is the mean of shares; there is no occurrence floor to derive; the tail needs no truncation rule at 14,763 words.

**Bundled at `reference-corpus`.** The module is published and holds `reference-corpus-shares.tsv`, read by `PooledWordShares`, wrapped by `CorpusVocabulary` in the engine as `EnglishVocabulary` wraps `WordRanks`. Its resources are in `BundledVocabulary.DIRECTORIES`, so the provenance test covers them. **The bundled table carries both defects above** and should be regenerated after step 1.

## The work, as it was done

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

**4. Bundle it. Done.** `reference-corpus` is published and holds `reference-corpus-shares.tsv` — the mean-of-shares table over the thirty — read by `PooledWordShares` and wrapped by `CorpusVocabulary` in the engine. Its resources are named in `BundledVocabulary.DIRECTORIES`, so `VocabularyProvenanceTest` covers them, and `PooledWordShares` names the resource as a constant so `BundledResourceReachabilityTest` finds it read.

**Two path bugs were found by running the documented commands rather than the ones being used.** Every corpus run so far passed absolute paths, so the relative form the plan and the task comments both document had never been exercised. A `JavaExec` task runs in its module directory, so `reference-corpus-extraction/src/...` resolved under `reference-corpus-extraction/` and failed. All five corpus tasks now set `workingDir = rootDir`, and `corpusReference` resolves `-Pcorpus` against the root, both matching what `vocabularyPage` and `functionalPlacement` already did.

**5. Measure the gates before touching them. Done at `30a95ba`, on all nine evaluation-set members.**

`CorpusReferenceProbe` ranks every declared name with no stage having filtered it, so `the`, `a`, `get` and `buf` are in the field and the chance bar decides. Filtering first would answer a different question and answer it by hand.

```
./gradlew corpusReference -Pcorpus=<table> -Dcs.clone.dir=$HOME/evaluation/<member>
```

**The corpus reads.** It removes 17% of the above-chance field across the nine — 8,206 words to 6,847 — and never less than 11% on any member.

| Member | Eng+plat | +corpus | Removed | `buf` | `id` | `name` | `x` |
|---|--:|--:|--:|---|---|---|---|
| aeron | 691 | 613 | 11% | yes→no *(within noise — see step 6)* | yes→yes | yes→no | no |
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

**6. Measure whether the draw has stopped moving. Done at `79c9814`. It has not, and it will not — but that turns out to matter far less than it sounds.**

Three measurements, all from the thirty on disk, all in bits and bounded at 1.

**The plateau curve is biased and should not be quoted on its own.** `CorpusPlateau` measures each prefix against the whole draw, and the whole draw is one sample, so the curve reaches zero at its last row whether or not it converged. Under pooled occurrences it is driven by size rather than by *n* — 0.652 bits when `ridi-dspace-server` joins second, still 0.010 when `tessera` joins twenty-ninth, larger than every step from the thirteenth to the twenty-eighth. Leaving `ridi-dspace-server` out moves the reference 0.085 bits, eleven times what any repository but `openpnp` moves it. **A curve like that cannot plateau**, because the next row drawn may be bigger than everything before it. Under the mean of shares it decays steadily and no repository holds more than 0.008 bits.

**`SamplingError` is the unbiased version**, and it splits the disagreement in two. Two disjoint subsets of the same size, the divergence between the references they produce, nothing compared to a target:

| a side | bits apart | one side only | shared |
|--:|--:|--:|--:|
| 1 | 0.780 | 0.642 | 0.138 |
| 5 | 0.538 | 0.301 | 0.238 |
| 10 | 0.416 | 0.195 | 0.222 |
| 15 | 0.360 | 0.147 | 0.213 |

The tail falls steadily. **The shared vocabulary does not** — it rises to 0.238 as the shared support grows, then falls only to 0.213 by fifteen a side. Four times the sample buys 0.016 bits. The whole error falls as size to the power −0.301, where a mean's standard error would give −0.5, so this is between-repository heterogeneity and not sampling noise. Halving it takes 150 a side.

**What decides the question is neither figure, because a reading never consults the tail.** A word absent from a reference has a share of zero there whichever corpus was drawn. So the measurement that matters is whether the *verdicts* move, and they were compared directly — two references from disjoint fifteens, run over two members:

| Member | odd | even | agree | enters | leaves | churn |
|---|--:|--:|--:|--:|--:|--:|
| aeron | 625 | 605 | 571 | 54 | 34 | 13.4% |
| strata | 1,343 | 1,334 | 1,260 | 83 | 74 | 11.1% |

**About one verdict in eight flips at fifteen a side**, which the counts hide — 625 against 605 reads like twenty and is eighty-eight. At the measured rate thirty gives roughly one in ten, and one in twenty needs about three hundred repositories.

**The churn is entirely in the marginal words, and the leading claims are stable.** The top twenty-five agree on both members and every member's subject vocabulary holds. `buf` on aeron is the worked example of what does move: −0.000002 bits against one half and +0.000036 against the other, so it ranks 1849th and stands below chance, or 484th and stands above, depending on which fifteen were drawn.

**So the step-5 table's cells are only load-bearing where the margin is wide.** `id` on strata went from 147th to 5575th and is not in doubt. **`buf` on aeron is within noise and should not be quoted** — it is recorded there as retired and it is a coin flip.

**7. Extend the draw. Blocked in the agent session, and the cause is worth knowing.** `corpusDraw` fails with `ConnectException` from `HttpClient` while `git` and `curl` reach GitHub fine. **It is not the sandbox refusing the JVM.** Every agent-session request goes through an authenticated HTTP proxy at `localhost:61627`, named by `http_proxy` and `https_proxy` in the environment. `curl` and `git` read those; Java's `HttpClient` does not, and `GitHubSearch` calls `HttpClient.newHttpClient()`, which has neither a proxy nor an authenticator. Unauthenticated `CONNECT` through that proxy returns nothing; with the environment's credentials it returns 200.

So it is fixable rather than blocked — a `ProxySelector` and a `java.net.Authenticator` taken from the environment would do it, which is ordinary behaviour for a proxied network and not a sandbox workaround. It has not been written, because network plumbing in the draw is a change worth reviewing rather than landing unattended. **Pippa's own shell has none of those variables and reaches GitHub directly**, so the draw runs there today with no change at all:

```
./gradlew :reference-corpus-extraction:corpusDraw -Dcs.draw.frame='<the frame published-draw.json states>' -Dcs.draw.until=2026-08-20T23:59:59Z -Dcs.draw.seed=20260821 -Dcs.draw.count=60 -Dcs.draw.publishes -Dcs.draw.out=<record>.json
```

**Check the exact frame count against the recorded 112,183 before using rows thirty-one onward.** The draw takes its total live, so a drifted population maps the same ranks to different repositories, and rows one to thirty would stop reproducing. A single unpaced query returns 92,610 with `incomplete_results`, which is an estimate and not comparable to the windowed exact count the manifest header describes — so the question is open, not answered.

**Whether it is worth extending is now a judgement rather than a guess.** Sixty repositories buy about a fifth off the churn. Three hundred would buy half. The alternative is to stop treating the bar as a threshold a word either crosses or does not, and report the margin — a word whose claim sits within the reference's own error has not been shown to stand above chance, and that is derivable from the same split-half measurement rather than from a number somebody picks.

**8. Measure which drawn repositories are one corpus counted twice. Done, and it names `benchmarkjava`.** `NearDuplicates` judges all 435 pairs; `DuplicateReport` prints every one of them, nearest first, rather than only the pair that fails, so the pairs just above the cutoff can be read. The nearest of them sits 535 times further apart than the OWASP pair, and 5.5 times further than its own chance.

**9. Let the draw pin a commit and write its own manifest. Done, and it was a third defect.** All three recorded manifests carry `name`, `sha` and `licenceAtPin`. `CorpusDraw` wrote none of them — it recorded `origin` and `licenceAtHead` and no commit at all, and `PublishedArtefact` tested publication against the default branch. The Java draw is a reimplementation of `docs/reference-corpus/draw.py`, which no longer exists, and it lost the pin. A draw run before this fix named the right repositories at the right ranks and gave nothing to pin them at.

`GitRemoteHead` asks `git ls-remote` for the commit a default branch points at: no objects transfer and no rate limit is spent, so a hundred pins cost seconds rather than an hour of paced API requests. `DrawnManifestTsv` writes the manifest from the record, keeping the header of the manifest being grown whole and deriving the clone directory from the repository's full name. Thirty rows were transcribed by hand; a hundred is where a row gets dropped.

**10. The frame was not a fixed population, and the guard caught it on the first real run.** `-Dcs.draw.total=112183` refused: the frame held **112,251** three days later. `pushed:>=2025-01-01` has no upper bound, so a repository last pushed in 2024 joins the frame the moment somebody pushes to it, and it grows every day. A rank resolves to a repository through counts taken live, so **no draw taken under that frame could be reproduced by anyone**, including this project — the build file's claim that somebody else could reproduce the manifests from the seed was false before today, and the guard made it visible rather than causing it.

**The frame now bounds `pushed` at the same ceiling `created` has** — `pushed:2025-01-01..2026-08-20` — which states what it always meant, still being worked on as of the ceiling, and stops it moving. It can still shrink where a repository is deleted or made private, which `-Dcs.draw.total` refuses.

**This is a frame change after a draw, so it is recorded as one.** It was not chosen after seeing which repositories turned up, and it moves the population in a direction nobody could aim at: which repositories were pushed after the ceiling is not something the draw can observe. The manifest header states this in its own words.

**The `benchmarkjava` exclusion comes out.** It was derived by measuring that sample; carrying it to a sample it was never measured on is the hand exclusion list the doctrine refuses. The fresh draw runs clean, and step 3 of the script judges the new hundred. Where it names a repository, the re-run names it back through `CS_DRAWN_TWICE` and the draw takes the next rank.

**11. Draw the hundred.** One line, from a shell that reaches GitHub:

```
bash reference-corpus-extraction/draw-the-corpus.sh
```

Draw, fetch, near-duplicate check, pool both weightings, bundle the mean of shares. `TOTAL` is empty until the first draw under the closed frame reports the count — there is nothing to reproduce yet, and a number invented here would assert a population nobody counted. The script prints what to set it to. **Step 3 is a gate**: it stops before pooling where a pair is one corpus, because pooling one counted twice is the defect the whole check exists to prevent.

**What the re-draw costs.** The thirty clones on disk are drawn from a different population and mostly will not recur, so this is a full fetch of roughly 3.4 GB. Every figure measured on the thirty goes with them. Of the four findings recorded as settled, only the weighting survives unchanged: the mean of shares is an argument about what the frame drew, not about how many. The corpus reading 17% off the above-chance field, the absence of an occurrence floor, and the tail needing no truncation all have to be re-taken.

**Why a hundred, and what is honest about it.** The header the manifest carried before any rank was drawn said that a curve still climbing at thirty means the draw extends. It is still climbing and will not stop — the split-half disagreement falls as size to the power −0.301, which is between-repository heterogeneity rather than sampling noise. A hundred is a **budget, not a derived bound**, and the manifest header now says so. Three readings of the measured trade point at it: one repository's weight falls to a hundredth, an order of magnitude below the tenth that made ten unusable; `buf`'s effective sample rises from 4.94 repositories to about sixteen, and the words that flip are exactly the ones estimated from almost none; and past a hundred the curve is flat, with three hundred buying about two further points of churn for three times the source. **Step 2 is what actually settles the churn**, and it costs no bandwidth.

One small thing left undone: `CorpusDraw` records the rejection as `named as an exclusion` and does not say what named it. The near-duplicate measurement is the citation; carrying the reason into the record is worth doing.

**12. Backtest twice.** The corpus beside the JDK index, and the corpus replacing it. Whether the index still earns a place is a question.

```
./gradlew evaluationReadAll -Dcs.evaluation.dir=$HOME/evaluation
```

**13. Remove the gates one at a time**, each with its own run. `SYMBOL`, `SHORTHAND` and `LANGUAGE` become markers: a word ranks where its claim puts it, annotated with what the dictionaries say about it.

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

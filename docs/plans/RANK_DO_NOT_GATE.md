# Rank, do not gate: the reference is the missing denominator

**Superseded from its fourth step by [`POOL_THE_CORPUS.md`](POOL_THE_CORPUS.md)**, which is where a session now starts. Steps 1 to 3 below are closed: the tree is committed, the backtest of it was deferred, and the corpus is drawn.

**This was the live plan.** It supersedes the word-filtering half of [`ONE_ARM.md`](ONE_ARM.md) and puts [`AGREED_SENSES.md`](AGREED_SENSES.md) on hold. Written 2026-08-21, at `ad15196` plus an uncommitted working tree.

## The one idea

The doctrine's first line is **signals are votes, never gates**. The word pipeline built in this session has three gates in it, and every one exists to patch a bad reference rather than because a word needed removing.

`PlatformVocabulary` reads the JDK's **declared type names** — an index, where each name appears about once. Real Java writes the same words thousands of times, so a word common in working code diverges enormously from a reference that names it once.

| Word | Member | Occurrences | Claim | Against |
|---|---|--:|--:|---|
| `id` | fineract | 14,240 | **0.0193 bits — the highest in the repository** | the platform's own API |
| `id` | aeron | 5,145 | **0.0317 — the highest** | the platform's own API |
| `transaction` | fineract | 4,101 | 0.0067 | the platform's own API |

So the ranking promotes exactly the words that should sink, and gates were added to remove them. That is the same class of mistake as reading `occurrences` where `carried` was meant: treating a symptom of a bad denominator as a property of the words.

**Fix the denominator and the gates become unnecessary.** [`A_CORPUS_NOT_AN_INDEX.md`](A_CORPUS_NOT_AN_INDEX.md) is the full plan for it.

## Where the code stands

Committed at `4930371` — the pipeline, `CitedExpansions`, `Dialect`, and both plans. `./gradlew cleanTest checkAll` was green at 748 tests with the `pinned` findings holding when the tree was verified, so **no figure this tree asserts has moved**. `output/tika/json/` is still dirty and the self read is stale: neither was regenerated, because the backtest was deferred.

### What landed

| | |
|---|---|
| `CitedExpansions` | a form the dictionaries cite for more different things than it means as a word is not read. `buf`, `ref`, `uri`, `pom`, `spec`, `vol` silenced; `json`, `xml`, `md5`, `obj` kept; `test` kept because it means more as a word than it is cited for |
| **Backtest on that change alone** | stands apart 29 → **31**, mean margin 0.0347 → **0.0426**, band reaches the stated area 5/9 → **6/9**. Aeron moved from *Artificial Intelligence* to **Computer Networks and Communications**, breaking the monoculture where all nine members led on one subfield |
| `WordPipeline` | six ordered **stages**, each stating what it keeps and what it removes, over one population. `over(tally)` for a report, `leavesAt(word)` for a streaming reading — one set of rules, two shapes |
| `Dialect` | the language's own naming conventions injected. `Dialect.java()` cites JavaBeans 1.01 §8.3; `Dialect.none()` claims nothing, which is the correct reading for a language nothing can be cited for |
| Every consumer moved | `OfferedWords`, `ChosenWords`, `PhraseTopics`, `Behaviours`, `CitedWord` all ask the pipeline; none holds a rule |
| The vocabulary page | one cloud per stage, Next/Previous, drawn from the pipeline. Java assembles it from typed tags; the CSS and JS are their own files under `src/test/resources/vocabulary/` |
| `j2html` | restored to the catalog for the page, on the test classpath only |

### The six stages as they stand

**A stage is not a step.** The pipeline has six *stages*, which is what `WordStage` declares and what the page draws. The numbered work below is *steps*, of which there are seven. The two were both called steps until 2026-08-22 and the collision is why "size the picture, one unit at every stage" read as a seventh stage.

| | Keeps | Removes | Is it a gate? |
|--:|---|---|---|
| 1 | Every word in the source | — | no |
| 2 | Words used to name something | comment text, such as the licence header | **no — a choice of population** |
| 3 | Words longer than a symbol | `x`, `i`, `id` | **yes** |
| 4 | Words that are not abbreviations | `buf`, `ref`, `pom` | **yes** |
| 5 | Words the author chose | `the`, `a`, `of`, `by` | **yes** |
| 6 | Words in their dictionary form | nothing — inflections merge | no |

On this repository: 4,247 words and 114,169 occurrences narrow to 1,254 and 18,134.

## The work, in order

**1. ~~Backtest what is already in the tree.~~ Deferred 2026-08-21 by decision** — the pipeline is wrong in principle while the gates stand, so its number is not worth the six and a half minutes. The change is still unmeasured: the pipeline refuses shorthand and function words at *offering* time rather than at citation time, and the `LANGUAGE` stage closes N3 (`OfferedWords.narrowing` returned `1.0` for every word of a declared name, which is how `from` became the largest single witness for `mathematics` on both finance members). Measure it when the reference lands, against the same run.

**2. ~~Commit.~~ Done, at `4930371`.**

**3. Draw the reference corpus. IN PROGRESS.** The frame is decided and recorded in [`reference-corpus.tsv`](../../reference-corpus-extraction/src/main/resources/reference-corpus.tsv)'s header before any row was drawn: `language:Java fork:false mirror:false size:>=1000 created:<2026-08-21`, seed 20260821, ten rows, exclusions limited to this repository and the nine members. The clone machinery now takes any manifest — `PinnedRepository`, `RepositoryManifest`, and a `corpusFetch` task reading `-Dcs.corpus.manifest` — so a second draw is measured by naming a second file.

**What the first backtest has to answer, stated now rather than after it.** A uniform draw from all of GitHub's Java is mostly small individual projects, and the first row drawn is an unlicensed MVC template. Those write `id`, `get`, `name` and `value`, so they will demote those. They may not write `log`, `license`, `apache`, `builder` or `optional`, which are what *mature* projects share and what all nine members are. **If `log` survives as a leading claim, the frame is wrong rather than the plan** — and the answer is a second draw from a stated different frame, compared against this one, not a filter.

**4 to 7 now live in [`POOL_THE_CORPUS.md`](POOL_THE_CORPUS.md)**, with the state they start from: three samples drawn and pushed, nothing cloned, nothing pooled. The published thirty is the one to pool, and the measurement that decides whether a gate may go is stated there before it is run.

**5. Backtest twice** — with the corpus beside the index, and with it replacing the index. Whether the index still earns its place is a question, not an assumption.

**6. Remove the gates, one at a time, each with its own run.** Steps 3, 4 and 5 become markers: a word ranks where its claim puts it, annotated with what the dictionaries say about it.

**7. ~~Size the picture by the claim in bits~~, one unit at every stage, rather than by an occurrence count. Done at `cd427ba`.** A word is sized by its term of the Jensen–Shannon divergence against what it is read against, taking the weakest claim any reference makes — the figure `ChosenWords` already ranks by. Measured once over the population entering the pipeline and carried unchanged through every stage a word survives, so a word cannot appear to grow because its neighbours left. What it shows is the reference defect rather than a repository vocabulary: the strongest claims on this tree are `a`, `word`, `reading`, `one` and `what`, and `a` is 5.03% of this repository against roughly 2% of ordinary English, so the arithmetic is right and the denominator is what is wrong.

## Open defects, none of them fixed

| | Defect | Evidence |
|---|---|---|
| **`the` is recorded as written-as-a-name** | 1,062 occurrences, first at `code-semantics-api/src/test/java/…`. Step 2 should have removed it and did not. Either the parse marks something as a declared name that is not, or a split run's parts inherit the run's form | unexplained — needs the [`debugging-a-reading`](../../.claude/skills/debugging-a-reading/SKILL.md) method, not a guess |
| **N5** | the accessor and source-set rules remove a word from its phrase and record nothing, so which positions supplied `get`'s occurrences cannot be read off the evidence | `workings.rules` lists one rule with zero removals |
| **`SenseCoverage` reports 1.00 for a word nothing states** | reads as full coverage and means there was nothing to cover | 2,642 words over 23,287 occurrences in Strata, every one with zero statements — `identifier`, `usd`, `ibor`, `gbp`, `pricer` |
| **`Thresholds:32` contradicts `OfferedWords.of`** | the javadoc says the length rule *"applies only to words nothing chose"*; the code tests it before `form.isChosenName()`, and `ContentWords.tooShortToMean`'s own javadoc says it should | `pv` 174, `fx` 35 and `id` are in the unread tail |

## What was measured and refused this session

- **Unsynsetted runs against the subject schemes.** On this repository, of 446 runs nothing read: OpenAlex keywords reach 2.24%, CSO topics 1.57%, and OpenAlex topic labels and arXiv categories reach **0%**. Both label-based schemes reach nothing because unread runs are single words. This is D11's refutation from a second direction, and it is the reason **not** to extract FpML or ISO 20022 on the strength of the unread tail. Indicative only — run on a member before calling it settled.
- **The truncation rule** — refuse a short form a longer word in the same tree begins with. Refused: it catches `trade`, `json`, `md5` and `parse` alongside `ref` and `sensi`.
- **The expansion count alone** — refuse a form cited for several expansions. Refused: it silences `test`, `trade`, `name` and `client`, which are ordinary words that happen also to be abbreviation forms. The comparison against the word's own meaning count is what fixed it.

## Session facts a fresh session will not know

- **The evaluation clones are at `$HOME/evaluation`**, nine members, about 820 MB. `./gradlew evaluationReadAll -Dcs.evaluation.dir=$HOME/evaluation` reads all nine in about 6½ minutes. Never `evaluationRead` — it forks per member and takes 31. Never re-fetch.
- **`$HOME`, not `~`** — no shell expands a tilde after `-D<name>=`, and the literal resolves against the working directory, matches no member and reads nothing while exiting zero.
- **Gradle needs the toolchain path in the agent sandbox**: `-Dorg.gradle.java.installations.paths=/Library/Java/JavaVirtualMachines/jdk-25.jdk/Contents/Home`.
- **Only `output/json/` and `output/tika/` are tracked.** `.gitignore` carries `output/*/`, so the other eight members' readings are untracked local files — `git checkout -- output` does not restore them and `git status` never shows them dirty. A baseline overwritten is a baseline gone.
- **GitHub's `total_count` is exact and additive below about a million and an estimate above it**, and the estimate is not monotonic in a date bound. Query bounded ranges under a million and nothing else. The frame here is exactly 4,154,178 repositories, summed over twenty exact yearly windows; single-query estimates for the same frame returned 4,077,965, 3,980,293, 4,058,528 and 3,907,106 within two hours.
- **The unauthenticated search API allows ten queries a minute and enforces a secondary limit well below that.** A draw costs about ten queries per row. Pace at nine seconds and expect sixty-second backoffs.
- **Maven Central is blocked for new dependencies**; seed `~/.m2` with `curl` from `repo1.maven.org`, which is allowlisted. That is how `j2html` was restored.
- The 4h 36m backtest run was a closed laptop, not a regression. The 6½-minute figure stands.
- The vocabulary page: `./gradlew vocabularyPage`, then open `code-semantics-engine/build/reports/vocabulary/vocabulary.html`.

---
name: running-the-backtest
description: Measure a change to the reading on the nine repositories it was not developed against. Use before a defect is called fixed, a repair called an improvement, or any figure is quoted as accuracy.
---

# Running the backtest

A change to the reading is judged on the evaluation set — the nine repositories the reading is measured on, held out from the one it was developed against. A figure taken on this repository is not evidence for it, because this repository is what it was tuned on.

## The evaluation set

| | |
|---|---|
| The clones | nine, at `$HOME/evaluation`, each at the commit the manifest pins. About 820 MB |
| The manifest | [`evaluation-set.tsv`](../../../code-semantics-engine/src/test/resources/evaluation-set.tsv) — name, origin, sha, licence, area, stated-by, and the expected result |
| The answer | the `area` column: the subject area the reading is expected to place the member under, named as the scheme states it. A field such as Computer Science, or a subfield such as Finance |
| Who states it | somebody outside this project — the repository's own GitHub description or topics. Recorded **before** the reading was run and never revised afterwards |

**Never re-fetch.** `evaluationFetch` reaches the network, is tagged `backtest` so no ordinary run touches it, and fetches only where a tree is not already at its pin. The clones are already there. A member runs to hundreds of megabytes.

The manifest's last column holds the expected result and is still headed `arm` on disk; the rename is backlogged.

## The run

One line, and `$HOME` rather than `~` — neither bash nor zsh expands a tilde after `-D<name>=`, and the literal `~/evaluation` resolves against the working directory, matches no member, and reads nothing.

```
./gradlew evaluationReadAll -Dcs.evaluation.dir=$HOME/evaluation -Dorg.gradle.java.installations.paths=/Library/Java/JavaVirtualMachines/jdk-25.jdk/Contents/Home
```

| | |
|---|---|
| What it does | reads every cloned member in one JVM, several at a time. The count is the JVM's heap divided by the 3 GB the build gives one member's fork, and the first log line states it |
| What it costs | about six and a half minutes for all nine |
| What it writes | `output/<member>/json/reading.json`, `evidence.json` and `changes.json` — the same three files the self read writes, one folder per member |

- **Never `evaluationRead`.** It forks one JVM per member and takes thirty-one minutes for the same answers. One JVM is most of the saving: a bundled subject scheme is read into distributions once and shared, instead of nine times.
- One Gradle invocation at a time, as everywhere else in this project.
- The toolchain path is needed in the agent sandbox only; a shell outside it reads the path from `~/.gradle/gradle.properties`.

## Before and after

**`changes.json` is the whole of the before and after.** The run compares against whatever reading is already in the member's folder, writes what moved, and overwrites it. The comparison happens once, at the moment of the run, and is not recoverable afterwards.

1. **Only two readings are tracked.** `.gitignore` carries `output/*/` with `!output/json/` and `!output/tika/` beside it, so this repository's own reading and Tika's are in git and **the other eight members' readings are local untracked files**. `git checkout -- output` does not restore them, and `git status` never shows them as dirty however far they move.
2. **A baseline overwritten is a baseline gone.** Where a true before and after is wanted for a member other than Tika, run the backtest at the previous commit first and then at the change — thirteen minutes, and there is no shortcut.
3. **Read `changes.json` straight after the run.** It names every figure that moved with its before and after, and the next run replaces it.
4. **A bumped `schemaVersion` means no `changes.json` is written at all**, because there is no previous reading of that shape to compare against. Its absence is not a finding.
5. **Landing.** Where a change stays, `output/json/` and `output/tika/` are the two that go in a follow-up commit touching no Java.

## What the run is scored on

Nine members at four levels — arXiv archive and category, OpenAlex subfield and topic — is 36 level readings. Every figure comes out of `summary.placedIn` in each member's `reading.json`.

| Figure | Where it comes from |
|---|---|
| stands apart from chance | `standsApartFromChance`, counted over all 36 |
| margin | `nearestByChanceBits` − `divergenceBits` |
| mean divergence, mean chance bar | `divergenceBits` and `nearestByChanceBits`. **Report both.** Where the divergence falls and the bar falls with it, every candidate subject moved and the reading did not improve |
| subjects in the band | the length of `nearerThanChance` — the subjects the instrument cannot separate from the leader |
| leader in the stated area | the leader rolled up through `broader` in [`openalex-topics.tsv`](../../../lexicon/src/main/resources/openalex-topics.tsv) until it reaches the level the manifest's `area` names |
| band reaches it | the same, for any subject in the band |

[`score.py`](score.py) prints all of them from the committed readings:

```
python3 .claude/skills/running-the-backtest/score.py
```

It reads reading-export schema 10.0 and the OpenAlex hierarchy, so a schema bump is a change to it.

## What decides whether a change stays

- **State the criterion before the run.** A criterion chosen after the figures is the same defect as choosing the expected result after reading the tree.
- **A change can stay on a contract argument and be credited with no accuracy gain.** The second pass's gate stayed because the javadoc stated a vote and the code was a gate; it moved *stands apart* from 31 to 29 and the plan records both verdicts side by side.
- **A topic-level verdict is not evidence.** At 4,516 subjects the chance bar is the single minimum of 999 draws and moves 0.054 bits between seeds, which is wider than the 0.03 to 0.04 the changes are worth. Place at field, and report the topic band as context.
- **A difference in the last place is not a change.** Byte identity between two runs is not available and never was: `Map.copyOf` salts iteration order once per JVM, so ties order differently. Of 72 placement figures compared between the parallel and the serial run, 50 were bit-for-bit identical and the largest difference was 1.67e-16.

## Traps

**A directory holding no clones reads nothing and exits zero.** Every member is logged *is not cloned … — not read*, and the run ends `0 of 0 members`. Read the first log line, which names how many members are in flight, and the last, which counts what was read. Nine is the number.

**A member whose read fails is named and the run ends non-zero.** A member that was never read and a member the reading correctly said nothing about produce the same empty row, and only one of them is a result.

**Never tune on a member.** The repositories a reading is developed against and the repositories it is measured on are drawn disjointly. Where a change was arrived at by reading a member's output, that change has no backtest left and the plan says so.

**Check a defect is live before measuring a fix for it.** Three were refuted in one session for the cost of a grep over `evidence.json`, none of them needing a build. See [`debugging-a-reading`](../debugging-a-reading/SKILL.md).

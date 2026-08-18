---
name: profiling-a-read
description: How to find and prove where a read spends its time — readTimings for the stage, readProfile and jfr for the method, the attribution experiment, and the verification sequence a performance change must pass. Use when a read is slow, a stage regressed, or a performance change needs its number.
---

# Profiling a read

Measurement is the argument. A performance change ships with the row before, the row after, and — where two changes landed together — the row with each alone, because the second change otherwise takes the credit for the first. A change that moves no number is not shipped on the strength of being reasonable.

## The two tasks

| Task | Prints | Cost |
|---|---|---|
| `./gradlew readTimings` | one row per stage of a read, in dependency order, rows summing to what the export diagnostic pays | one read |
| `./gradlew readProfile` | the same probe recorded by Java Flight Recorder into `code-semantics-engine/build/reports/read-profile.jfr` | one read |

Both accept `-Dcs.clone.dir=<path>` to point at another clone, and neither touches `output/`. Read a recording with `jfr view hot-methods <file>` — the `jfr` binary sits beside `java` — or `jfr print --events jdk.ExecutionSample <file>` where the hot method needs its caller named. JDK Mission Control opens the same file.

## Reading a profile

- **A JDK frame at the top is a caller's loop.** `ImmutableCollections$MapN$MapNIterator.next()` at 17% is not the JDK being slow; it is a project method iterating a whole map somewhere hot. `jfr print` gives the stack beneath it, and the project frame in that stack is the finding.
- **Samples span the whole probe.** A method at 20% of samples in an 86s probe whose suspect row is 59s is most of that row. Scale before concluding.
- **A flat profile is an answer.** When no method clears a few percent, the remaining cost is diffuse — allocation, dictionary reads, regex — and the next win is structural or nowhere. Say so rather than shaving.

## The attribution experiment

Where a probe row holds still after a change that should have moved it, the hypothesis was wrong — profile rather than reasoning further. Where two changes are in and the row moved, bypass one in the working tree, run `readTimings`, and restore it. Error Prone refuses an unused field, so a bypass removes the field with the call. The experiment is one probe run and it is the only way a commit message gets to claim its own number.

## What this sandbox permits

Attach-based profiling fails here: `jps` sees no forked JVM because its perfdata lands in the redirected tmp, and `pgrep` cannot list processes at all, so `jstack` and `jcmd` never get a pid. The JVM recording itself — `readProfile` — is the one profiler that works. Never run two Gradle invocations concurrently, and a probe running in the background counts as one.

## The sequence a performance change passes

1. The failing test first, on the mechanism itself — a counting stub asserting how often the expensive call is made, red before the change.
2. `./gradlew cleanTest checkAll --no-build-cache` — gate on the `BUILD SUCCESSFUL` line.
3. `./gradlew :code-semantics-engine:test -Dinclude.tags=pinned` — `checkAll` excludes the pins, and a moved pin passes the gate without them.
4. `./gradlew readTimings` — the number the change claims.
5. `./gradlew read`, then `git status` — a performance change moves no figure, so `output/` must show no diff. A diff is a defect in the change, not a regeneration to commit.
6. The evaluation clone for the headline figure. The manifest `evaluation-set.tsv` (a test resource) pins every member to a commit, and `PinnedClone` fetches a member at its pin — and refetches nothing already pinned — so never hand-write the `git fetch`. Point the probe at the tree with `-Dcs.clone.dir=<path>`.

Baselines and their history live in the plan and the backlog, never in javadoc.

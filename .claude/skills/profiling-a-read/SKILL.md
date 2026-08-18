---
name: profiling-a-read
description: Find where a read spends its time and verify a performance change. Use when a read is slow, a stage regressed, or a performance change needs its number.
---

# Profiling a read

A performance change ships with the row before, the row after, and — where two changes landed together — the row with each alone.

## The probe

`./gradlew readTimings` — one read; prints one row per stage, rows summing to the export diagnostic's total, and records the same run into `code-semantics-engine/build/reports/read-profile.jfr`.

- Accepts `-Dcs.clone.dir=<path>`; leaves `output/` untouched.
- Read the recording with `jfr view hot-methods <file>`; where a hot method needs its caller named, `jfr print --events jdk.ExecutionSample <file>`. The `jfr` binary sits beside `java`.
- The probe's recording is the only profiler that works in this sandbox. One Gradle invocation at a time; a background probe counts as one.

## Reading a profile

- A JDK frame at the top of `hot-methods`: run `jfr print` and read the stack beneath it — the topmost project frame is the finding.
- Scale samples to the probe: a method at 20% of an 86s probe is ~17s; compare that with the suspect row before concluding.
- No method above a few percent: the cost is diffuse; report that and stop.

## Attribution

- A row that holds still after the change: the hypothesis was wrong; profile again.
- Two changes in and the row moved: bypass one in the working tree, run `readTimings`, restore it. Remove a bypassed field together with its call — Error Prone refuses an unused field.

## The sequence a performance change passes

1. The failing test on the mechanism — a counting stub asserting how often the expensive call is made — red before the change.
2. `./gradlew cleanTest checkAll --no-build-cache`; gate on the `BUILD SUCCESSFUL` line.
3. `./gradlew :code-semantics-engine:test -Dinclude.tags=pinned`.
4. `./gradlew readTimings` — the number the change claims.
5. `./gradlew read`, then `git status` — `output/` must show no diff.
6. The evaluation clone for the headline figure: `PinnedClone` fetches each member at its `evaluation-set.tsv` pin; point the probe at it with `-Dcs.clone.dir=<path>`.

Baselines and their history live in the plan and the backlog, never in javadoc.

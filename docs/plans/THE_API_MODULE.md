# The api module

`code-semantics-api` does not hold this library's API. The surface a consumer calls is `ExportedReading` and the surface it reads is `reading.json`, both in `reading-export`. What the module holds is three unrelated things — the identifier-reading grammar, the evidence arithmetic, and stage contracts ported from the Business Intelligence project — and two of its five packages are consumed by nothing. This plan deletes what is dead and folds what is alive into `code-semantics-engine`, ending the module.

## What the module holds, measured on 2026-09-06

Consumer counts are files outside `code-semantics-api` importing the class, over every other module's `src`, at commit `251fdf1`.

| Package | Classes | Consumed | Dead |
|---|---|---|---|
| `name` | `Tokeniser`, `WordSegmenter`, `WordRanks`, `WholeWords`, `CitedTokens`, `PieceCost`, `CompoundParses`, `WordMorphology` | `WordRanks` 10, `WordSegmenter` 8, `Tokeniser` 2, `WholeWords` 2, `CitedTokens` 1; `PieceCost` and `CompoundParses` are `WordSegmenter`'s own | `WordMorphology` — 0 external consumers, and its prefix list has no citation (backlog row 5) |
| `model` | `EvidenceSource`, `EvidenceSourceType`, `PooledLogOdds`, `AxisVote`, `AxisResolution` | `EvidenceSource` 29, the rest 1–2 each | none |
| `repository` | `SourceAnchor`, `BlobOrigin`, `BlobOriginVote`, `RepositoryFacts`, `PullRequestFacts` | `SourceAnchor` 4, `BlobOrigin` 3, `BlobOriginVote` 2, `RepositoryFacts` 1 | `PullRequestFacts` — referenced only by `RepositoryFacts` |
| `symbol` | `SymbolPipelineStage`, `SymbolContext`, `SymbolKind` | 0 | the whole package |
| `concept` | `ConceptEvidence`, `ConceptVote`, `Citation`, `ConceptId` | 0 | the whole package |

Two structural facts decide the shape of the fix. Only `code-semantics-engine` declares a dependency on the module, and declares it `api(project(":code-semantics-api"))`, so every other module sees it transitively — no consumer uses the module without the engine. And both modules apply `cs.maven-publish` while row 34 (Maven Central) is unstarted, so no published coordinates exist to break.

## Step 1 — delete the dead contracts

Delete `symbol/`, `concept/` and `PullRequestFacts`, with their tests. They are the contracts of the concept and behaviour paths the plans abandoned — [`ONE_ANSWER.md`](ONE_ANSWER.md) settled the reading on the vocabulary alone — and they are what backlog row 46 names: a class nobody calls that still reads as a promise.

`WordMorphology` is deleted here too if step 1's own grep confirms nothing reaches it but its test; if anything does, it stays for row 5 to settle by measurement.

**Settled by**: a grep over every module's `src` finding no reference, and `cleanTest checkAll` green. No reading figure is an argument either way — nothing calls these classes — but the deletion changes this repository's own corpus, so the self reading is regenerated (step 3).

## Step 2 — fold the survivors into the engine

Move `name`, `model` and the surviving `repository` classes into `code-semantics-engine`, keeping their packages' names under the engine's namespace or adopting the engine's, whichever the imports make quieter. Remove `:code-semantics-api` from `settings.gradle.kts`, the `api(...)` dependency from the engine, and the module's row from `cs.aggregate-tasks`.

The alternative — keeping a module honestly renamed for what it is, the grammar and the evidence arithmetic — buys a dependency-free artifact for a consumer wanting the tokeniser without JavaParser and WordNet. The measurement above says no such consumer exists, so the fold wins until one does; a module can be split back out the day it is asked for.

**Settled by**: `cleanTest checkAll` green over the remaining nine test tasks and the `pinned` findings green.

## Step 3 — regenerate the reading

Moving and deleting Java files changes the corpus this library reads itself with, so every figure of the self reading moves. Run `./gradlew read` and land the figures in a follow-up commit touching no Java. The eleven evaluation members read external trees and their readings do not move; do not re-run the sweep for this.

## What ends the plan

`settings.gradle.kts` no longer includes `:code-semantics-api`, `checkAll` and the pins are green, and the regenerated self reading is committed.

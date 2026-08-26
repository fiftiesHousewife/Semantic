# reading-export

Writes the published reading. `./gradlew read` runs every diagnostic over one shared reading of a tree and writes three files under `output/json/`:

| File | What it holds | Validated by |
|---|---|---|
| `reading.json` | the answers: summary, signals, themes, taxonomies, and what was set aside | `reading-export.schema.json`, bundled in this module |
| `evidence.json` | the workings behind them: the vocabulary ranking word by word with each verdict and the rule behind it, per-word topical statements, removals with the rule that made each, unread runs | nothing — it is the argument, not the contract |
| `changes.json` | what moved since the previous reading of the same schema version | written only where there is one to compare against |

A reading writes JSON and nothing else. `PublishedFormat` (in the engine) refuses any file name that is not `.json`.

## The tasks

- `read` — reads one repository, the tree it runs in by default, or `-Dcs.clone.dir=<path>`. Runs the `diagnostic`-tagged readings, and the `pinned` findings only when reading the host tree, whose figures they pin.
- `readingExport` — the same export with no test framework involved, for a caller that wants the file alone.
- `evaluationRead` / `evaluationReadAll` / `evaluationFetch` — the backtest over the evaluation-set members `src/test/resources/evaluation-set.tsv` pins, one report folder per member under `output/<name>/`.
- The probes — `wordVotes`, `topicMatch`, `keywordReach`, `subjectWitnesses` and the rest — each prints one question's answer for a human; none of them writes under `output/`. `./gradlew tasks --group verification` lists them.

## Why the diagnostics live in this module's test tree

One `read` shares one reading of the tree across every diagnostic in one JVM (`TreeReading` holds the memo), so the export, the evidence and every pinned figure are of the same parse. That requires every reading-composing diagnostic to sit in one test tree, and this is it. The engine and `skos-matching` keep their ordinary unit tests; what composes a whole reading lives here.

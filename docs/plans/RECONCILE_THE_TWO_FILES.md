# Reconcile the two files

`reading.json` serves a consumer who takes the answers and draws them; `evidence.json` serves a reader who asks why the answers are what they are. The first reader needs a compact, validated document whose every field parses without splitting prose. The second needs the workings to reconcile with the counts, and a stated contract for the file that holds them. Reviewed against the committed reading at `311e14f`, each file falls short of its reader in specific, testable ways. [What consumes the export](CONSUMING_THE_EXPORT.md) lists the consumers; this plan repairs what any of them would meet.

## Findings

### For the consumer of `reading.json`

| | Finding | Evidence at `311e14f` |
|--:|---|---|
| C1 | `summary.answers[].result` joins the concept label and the publisher's definition into one string with an em dash. A consumer showing the label alone must split display text on `" — "`, and a definition containing that sequence splits wrongly | `"machine learning — Machine learning (ML) is a field of study…"`; the join is [`AnswerFromATaxonomy`](../../reading-export/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/AnswerFromATaxonomy.java) line 76 |
| C2 | The schema states that the `themes[].divergenceBits` terms across all topics sum to the scope's `divergenceBits`. The file lists three topics per scope, so the listed rows sum to less and a consumer computing shares from them is misled | `code-semantics-engine/src/main/java` states 0.0424 bits; its three theme rows sum to 0.0040 |
| C3 | The schema leaves unstated that `setAside.wordsWithinTheReferencesError` is a subset of `setAside.wordsBelowEveryThreshold`. A reader taking the counts as disjoint double-counts 21 words | 1002 + 10 + 291 = 1303 ranked words, with the 21 inside the 1002 |
| C4 | `setAside.matchesDiscardedByBranchRule` counts one vocabulary's reading — the linguistic-terms reading `ExportedReading` passes to `SetAside.counted` — while the schema description reads as if it covered every matched vocabulary | the export states 81; `evidence.json` holds 82 refused OLiA entries and 45 refused CSO entries |

### For the reader of `evidence.json`

| | Finding | Evidence at `311e14f` |
|--:|---|---|
| D1 | The file's shape is documented only in test-source javadoc ([`ReadingEvidence`](../../reading-export/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ReadingEvidence.java), `EvidenceWorkings`, `EvidenceSetAside`), which no reader of the file receives, and nothing validates a written document. [`ExportSchema`](../../reading-export/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportSchema.java)'s own javadoc states the standard: a contract a writer can break without noticing is a comment | `schemaVersion` 6.0, checked by nothing |
| D2 | The commit appears only inside the prose `linkage` string, and the seed appears nowhere in either file. A reader cannot state the run that produced the file, and `RepositoryReading.of(root, seed)` accepts a caller's seed | `"linkage": "permalinks into github.com/… at 311e14f"` |
| D3 | `EvidenceCommand.timesChance` writes `0.0` where no reference's bar is positive. The doctrine requires a signal that cannot speak to carry no value rather than a zero-valued one | `.orElse(0.0)` at [`EvidenceCommand`](../../reading-export/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/EvidenceCommand.java) |
| D4 | `vocabulary[].leftAt` discriminates four outcomes with magic strings, one of them empty. The empty string means the word stands as a signal, which a reader learns only from source | `leftAt: ""` on 291 rows |
| D5 | The `matches` rows count one entry per term and normalisation while `refusedByBranch()` subtracts distinct terms, so the export's discard count is underivable from the workings rows. `ReadingEvidence.matching`'s javadoc also narrates a two-list split that `TreeReading.terms` has since unified — every vocabulary is matched over the [`SpecificTerms`](../../skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SpecificTerms.java)-narrowed index | 81 in the export against 82 refused OLiA rows, with a term refused at one normalisation and reported at another netting out of the count |
| D6 | No test asserts any identity between the two files a run writes together: the signal funnel, the set-aside counts against their rows, the published taxonomies' `REPORTED` rows against `concepts` | CSO holds 40 `REPORTED` rows and 42 `concepts` rows, reconciled only by reading `TermMatches` |

The signal funnel the two files share, at `311e14f`: 1303 ranked words = 291 signals + 981 below a reference's bar + 21 within the reference's error + 10 the language supplies. `evidence.json` states it row by row under `vocabulary[].leftAt`; `reading.json` states the counts; nothing checks the two agree.

## Steps

Each step lands with its failing test first. One `evidence.json` version rise to 7.0 covers steps 1–5; one `reading.json` schema rise to 27.0 covers step 7.

| | Step | What it changes | Settled by |
|--:|---|---|---|
| 1 | The workings state their run | `evidence.json` gains top-level `commit` and `seed`; `linkage` keeps the permalink prose | a test that the written file states the commit and seed the reading ran at (D2) |
| 2 | A value that cannot be computed is absent | `timesChance` is omitted where no reference's bar is positive; `leftAt` becomes an enum whose four values are all named, `SIGNAL` among them | a test that a word with no positive bar carries no `timesChance` field, asserted on the written JSON rather than inferred from the arithmetic (D3, D4) |
| 3 | Each refused word names its rule | `wordsBelowEveryThreshold` rows carry which rule refused the word, so the 21 error rows are separable without joining against `vocabulary` | a test that the rows partition by rule into the export's two counts (C3, D6) |
| 4 | The discard count covers the judged field and reconciles | `SetAside.counted` sums `refusedByBranch()` over every judged vocabulary; the schema description names the count's unit as distinct terms per vocabulary; `ReadingEvidence.matching`'s stale javadoc goes | the identity test of step 6, deriving the export's count from the workings rows (C4, D5) |
| 5 | The workings gain a contract | `evidence-export.schema.json` beside the writer, validated before every write as `ExportFile` validates the answers; the descriptions move from the test-source javadoc into the schema; bounds derived — shares in [0, 1], divergences at 1 bit | the write refusing a document the schema refuses, and the self read staying green (D1) |
| 6 | The identities are asserted | one diagnostic-tagged test reads both files a run wrote and asserts the funnel, the set-aside counts against their rows, and `REPORTED` rows against `concepts` rows | the test running inside `./gradlew read` on this repository (D6) |
| 7 | The answer names its parts | `answers[].result` splits into the label and the publisher's prose as two fields; schema 27.0 | the schema test, and the readings page rendering the same text from the two fields (C1) |
| 8 | The schema says what the file holds | the `themes[].divergenceBits` description states that only the leading topics are listed and that their terms sum to less than the scope's figure; the `wordsWithinTheReferencesError` description states the subset relation | re-reading both descriptions against the committed file's figures (C2, C3) |

Steps 8's description repairs change no field and no version. Step 7 stops `changes.json` comparing across the rise and stales the eleven member readings; the member regeneration (`evaluationReadAll`, then `evaluationPages`) is a long run and follows separately.

## Out of scope

- Moving the evidence writer out of the test source set, which is what would ship the workings to a library consumer — backlog row 30 holds it.
- The phrase-level agreement record — backlog row 6 holds it.
- Any change to which evidence answers or how a bar is drawn; every figure in both files stays where a step above does not name it.

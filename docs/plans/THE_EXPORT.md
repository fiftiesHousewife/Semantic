# The export

One JSON file, written by every run, holding everything a consumer would act on: the words and phrases that carry signal with their scores, the themes the reading reports, and the result of every taxonomy evaluation. A consumer reads that file and needs nothing else — no HTML, no markdown, no second run.

## What landed

`output/reading.json`, written by `./gradlew readingExport` on its own and by `./gradlew read` beside the reports. `ReadingExport` is the document, `ExportedReading` composes it from one tree reading, and `ExportFile` writes and reads it back.

| Section | One entry per | Holds |
|---|---|---|
| `summary` | run | the result: what the repository is about, where it was placed, the leading words and concepts, the two denominators, and the length of each list below |
| `signals` | word or published phrase | the word, occurrences, how many were names, the score in bits, the reference scoring it lowest, and the file and line of the first sighting |
| `themes` | topic, in the scope it distinguishes | topic, scope, its share of the repository, its term of that scope's divergence, and the words that produced it |
| `taxonomies` | vocabulary matched against | every matched concept with the concept its publisher places it under, matches per normalisation level, and the subject placement with the chance placement beside it |
| `setAside` | run | five counts of what the three lists omit |
| `pullRequests` | pull request read beside the tree | number, author, head and base commits, changed-file count, and the pull request's own thresholds and signals |

**The summary answers the question on its own**, and the three lists are the evidence for it. A consumer that wants the result reads ten fields; a consumer that wants to check it reads the lists.

**The three questions it was to settle are answerable from the file alone**, with no other artefact open: which words carry the signal and how strongly, what the repository is about and how far from chance each answer is, and which published concepts it writes and where that places it.

**Signals and not refusals**, as specified: what was set aside is five counts in `setAside` and no list.

**It does not render a report to produce the file.** `ExportCommand` reads the tree, composes and writes, and touches no renderer — the abandon criterion is met from the other side.

**The schema is published and enforced.** `reading-export.schema.json` ships in the jar with a description on every field, and `ExportFile` validates each document against it before writing: a run produces a document matching the contract or produces none. `ReadingExportSchemaTest` checks that a renamed field, an out-of-range share and an unstated schema version are each refused.

**Jackson moved to the published side**, from `testImplementation` to `implementation`. A report format was a diagnostic's business; an export that ships is the library's.

**The pull request path landed at schema 28.0, on 2026-09-12.** The second source: `ReadingSource` names `PULL_REQUEST` beside `CLONE`, and the document gains `pullRequests` — one entry per pull request read beside the working tree, with the number, the author the selection was filtered on, the head and base commits, the changed-file count, and the pull request's own signals against its own chance thresholds. A pull request reaches the reading as a directory `fetch-pull-requests.sh` writes from your own shell: the changed files at the head commit, relative paths preserved, the tree's own `.readingignore` beside them, every fetch pinned by sha in a `pull-requests.tsv` manifest the way the evaluation-set manifest pins each member. The selection starts at an author (`PR_AUTHOR`) or names the pull requests outright (`PR_NUMBERS`); a token is needed only for the API's rate limit and reaches no manifest and no log.

**One task reads both.** `./gradlew read` — and `readingExport` — with `-Dcs.pullrequests.dir=<directory>` writes one file covering the working tree and the fetched pull requests; without the property, the same document with the list empty. The safeguard [supplied text](SUPPLIED_TEXT.md) states — a pull request is its own scope, reported with the repository's reading beside it and without it — holds structurally: the top-level blocks are the working tree's alone — the schema says so and `ReadingExportSchemaTest` pins it — so one document reads the repository with the pull requests and without them. A pull request is scored against its own permutation null, never the tree's, because the chance-expected maximum of a few files is not the chance-expected maximum of the tree: on the demonstration below the 14-file pull request's bar is 0.0028 bits where the 35-file one's is 0.0009.

**The check it had to pass, it passes.** `./gradlew copiedReading` reads one repository twice — the tree, and a copy stating every file the scopes name — and on this repository every block of the two exports is the same, signal for signal and score for score; composed as a pull request, the copy carries the tree's own signals at the tree's own thresholds, differing only in the source each states. The demonstration on real data is three of tballison's apache/tika pull requests at pinned heads: 3153 (35 changed files) carries 61 signals, 3154 (11 files) 39, and 3156 (14 files) 30, led by `component`, `load` and `config` — the configuration-loader vocabulary those changes actually add, where tika's own leading signals stay `tika`, `parser`, `metadata`.

## What is left

| | What | Why it is not done |
|---|---|---|
| 0 | **The 29.0 bundle, queued** | Four changes that move together because each touches the document's values: **runs spelled with spaces** — the signal pipeline carries published runs end to end but writes the resources' underscore joiner, so `interest_rate` reads as an identifier; the schema now states the underscore and the space is the stated intent. **Each taxonomy's stated provenance** — `# Name:`, `# Subject:`, and the revision — into `taxonomies[]`, which settles item 1 below and lets a consumer of the file alone say what FIX is about, where today the pages join the classpath's headers. **`summary.leadingPhrases`** — the multi-word signals by margin, mirroring `leadingWords`, because a phrase is the evidence a reader trusts first and the summary currently surfaces none. **The sense-domain masses** — the figures behind the domain picture, today computed by the page and exported nowhere, so `telecommunication` can stand in quickfixj's picture and be absent from its summary; whether the mass list beats the `about` topics is measurable against the manifest areas on the eleven members before the weaker list is dropped |
| 1 | **The taxonomy's version** | `TermIndex.source()` states `OLiA` and nothing states which OLiA. The revision is in the bundled TSV's own provenance header — `d3bd4f1a` — and no published class reads that header; `BundledVocabulary` is test-side in `lexicon`. A consumer cannot currently tell two runs against two revisions apart |
| 2 | **A signal's declaration kind** | The plan asked for it and the reading does not carry it. `WrittenWords` tracks whether an occurrence was a name or prose, so the export states `occurrences` and `inNames`; which *kind* of declaration — a type, a method, a parameter — is on `NameForm` per occurrence and is not accumulated per word. Carrying it means tallying by form in `LegibilityTally` |
| 3 | **Permalinks** | A site is a file and a line. `SourceLinks` renders a permalink where a remote is known and lives with the diagnostics; the export holds the components a caller needs to build one and builds none |
| 4 | **The composition sits in the test source set** | `ExportedReading` and `ExportCommand` are beside `TreeReading`, `CloneUnderReading` and `ReportFolder`, which are all test-side in this tree. The document, the builders and the writer are in `main` and ship. Moving the tree walk into `main` is its own change and would take `ReportFolder` and `MarkdownRendering` with it |

## Where it appears

The README states the export before it states any report: what the file holds, one worked signal with the arithmetic behind `bits`, and how to get it.

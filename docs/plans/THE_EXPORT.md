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

**The summary answers the question on its own**, and the three lists are the evidence for it. A consumer that wants the result reads ten fields; a consumer that wants to check it reads the lists.

**The three questions it was to settle are answerable from the file alone**, with no other artefact open: which words carry the signal and how strongly, what the repository is about and how far from chance each answer is, and which published concepts it writes and where that places it.

**Signals and not refusals**, as specified: what was set aside is five counts in `header.setAside` and no list.

**It does not render a report to produce the file.** `ExportCommand` reads the tree, composes and writes, and touches no renderer — the abandon criterion is met from the other side.

**The schema is published and enforced.** `reading-export.schema.json` ships in the jar with a description on every field, and `ExportFile` validates each document against it before writing: a run produces a document matching the contract or produces none. `ReadingExportSchemaTest` checks that a renamed field, an out-of-range share and an unstated schema version are each refused.

**Jackson moved to the published side**, from `testImplementation` to `implementation`. A report format was a diagnostic's business; an export that ships is the library's.

## What is left

| | What | Why it is not done |
|---|---|---|
| 1 | **The pull request arm** | The second source. `ReadingSource` names `CLONE` alone, and `PULL_REQUEST` arrives as a constant beside it at the schema version that adds it. It needs a GitHub read — the API, a token, and the filter, starting at author id — and the safeguard [supplied text](SUPPLIED_TEXT.md) states: a pull request is its own scope, reported with the repository's reading beside it and without it. **The check it has to pass**: with the filter selecting every file, the arm reproduces the repository reading, same signals and same scores, which is what says the two paths share one pipeline |
| 2 | **The taxonomy's version** | `TermIndex.source()` states `OLiA` and nothing states which OLiA. The revision is in the bundled TSV's own provenance header — `d3bd4f1a` — and no published class reads that header; `BundledVocabulary` is test-side in `lexicon`. A consumer cannot currently tell two runs against two revisions apart |
| 3 | **A signal's declaration kind** | The plan asked for it and the reading does not carry it. `WrittenWords` tracks whether an occurrence was a name or prose, so the export states `occurrences` and `inNames`; which *kind* of declaration — a type, a method, a parameter — is on `NameForm` per occurrence and is not accumulated per word. Carrying it means tallying by form in `LegibilityTally` |
| 4 | **Permalinks** | A site is a file and a line. `SourceLinks` renders a permalink where a remote is known and lives with the diagnostics; the export holds the components a caller needs to build one and builds none |
| 5 | **The composition sits in the test source set** | `ExportedReading` and `ExportCommand` are beside `TreeReading`, `CloneUnderReading` and `ReportFolder`, which are all test-side in this tree. The document, the builders and the writer are in `main` and ship. Moving the tree walk into `main` is its own change and would take `ReportFolder` and `MarkdownRendering` with it |

## Where it appears

The README states the export before it states any report: what the file holds, one worked signal with the arithmetic behind `bits`, and how to get it.

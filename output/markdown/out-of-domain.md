# A vocabulary of another field — CodeSemantics

A domain vocabulary is worth something only where it fires on a repository in its domain and
stays quiet on one outside it. Both vocabularies below are matched against the same declared
names, by the same splitter and the same corroboration rule.

**The figure is matched spans per thousand declared names.** A count on its own would say more
about how many terms a publisher wrote than about this repository.

| Vocabulary | Terms published | Spans | Per thousand names | Distinct terms | Files matched | Longer than one word |
|---|--:|--:|--:|--:|--:|--:|
| OLiA | 1312 | 1244 | 125.14 | 117 | 354 | 7 |
| FIBO | 1833 | 232 | 23.34 | 22 | 113 | 0 |

## Every term the out-of-domain vocabulary matched

Named in full, because a rate says how loud a vocabulary was and only the terms say what it
was hearing. Each row is a word FIBO publishes as a term of finance and this repository
declares in some other sense.

| Term | Occurrences | Concept FIBO publishes under it | First site |
|---|--:|---|---|
| `occurrences` | 76 | Occurrence | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21 |
| `occurrence` | 36 | Occurrence | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47 |
| `claim` | 18 | Claim | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ChosenWord.java:23 |
| `mean` | 16 | Mean | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62 |
| `method` | 14 | Method | code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:7 |
| `catalog` | 10 | Catalog | lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/NistCsfExtraction.java:42 |
| `means` | 10 | Mean | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWordsTest.java:95 |
| `median` | 7 | Median | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84 |
| `methods` | 7 | Method | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:20 |
| `meaning` | 6 | Mean | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRunsTest.java:24 |
| `claims` | 5 | Claim | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:63 |
| `scheme` | 4 | Strategy | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18 |
| `request` | 4 | Request | code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16 |
| `claimed` | 4 | Claim | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:21 |
| `requests` | 3 | Request | code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:15 |
| `claiming` | 3 | Claim | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReadingTest.java:145 |
| `publication` | 3 | Publication | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:71 |
| `meant` | 2 | Mean | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:204 |
| `computation` | 1 | Calculation | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PinnedSubjectFindings.java:32 |
| `approaches` | 1 | Approach | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97 |
| `difference` | 1 | Difference | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:72 |
| `action` | 1 | Action | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:29 |

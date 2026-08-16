# A vocabulary of another field — CodeSemantics

A domain vocabulary is worth something only where it fires on a repository in its domain and
stays quiet on one outside it. Both vocabularies below are matched against the same declared
names, by the same splitter and the same corroboration rule.

**The figure is matched spans per thousand declared names.** A count on its own would say more
about how many terms a publisher wrote than about this repository.

| Vocabulary | Terms published | Spans | Per thousand names | Distinct terms | Files matched | Longer than one word |
|---|--:|--:|--:|--:|--:|--:|
| OLiA | 1312 | 1358 | 142.81 | 116 | 344 | 5 |
| FIBO | 1833 | 254 | 26.71 | 23 | 108 | 0 |

## Every term the out-of-domain vocabulary matched

Named in full, because a rate says how loud a vocabulary was and only the terms say what it
was hearing. Each row is a word FIBO publishes as a term of finance and this repository
declares in some other sense.

| Term | Occurrences | Concept FIBO publishes under it | First site |
|---|--:|---|---|
| `occurrences` | 86 | Occurrence | code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18 |
| `occurrence` | 36 | Occurrence | code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47 |
| `claim` | 17 | Claim | code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ChosenWord.java:23 |
| `mean` | 15 | Mean | code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62 |
| `catalog` | 11 | Catalog | lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45 |
| `method` | 14 | Method | code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:7 |
| `median` | 10 | Median | code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84 |
| `means` | 10 | Mean | code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWordsTest.java:95 |
| `methods` | 7 | Method | code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:20 |
| `scheme` | 6 | Strategy | code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18 |
| `meaning` | 6 | Mean | code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:24 |
| `right` | 7 | Right | code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:25 |
| `claims` | 5 | Claim | code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:65 |
| `requests` | 4 | Request | code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:15 |
| `request` | 4 | Request | code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17 |
| `claimed` | 4 | Claim | code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:21 |
| `claiming` | 3 | Claim | code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingTest.java:145 |
| `publication` | 3 | Publication | code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:71 |
| `meant` | 2 | Mean | code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199 |
| `computation` | 1 | Calculation | code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:43 |
| `approaches` | 1 | Approach | code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97 |
| `difference` | 1 | Difference | code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:72 |
| `action` | 1 | Action | code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWordsTest.java:29 |

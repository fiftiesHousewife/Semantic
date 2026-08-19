# A vocabulary of another field — CodeSemantics

A domain vocabulary is worth something only where it fires on a repository in its domain and
stays quiet on one outside it. Both vocabularies below are matched against the same declared
names, by the same splitter and the same corroboration rule.

**The figure is matched spans per thousand declared names.** A count on its own would say more
about how many terms a publisher wrote than about this repository.

| Vocabulary | Terms published | Spans | Per thousand names | Distinct terms | Files matched | Longer than one word |
|---|--:|--:|--:|--:|--:|--:|
| OLiA | 1312 | 1288 | 146.81 | 122 | 360 | 9 |
| FIBO | 1833 | 249 | 28.38 | 24 | 122 | 0 |

## Every term the out-of-domain vocabulary matched

Named in full, because a rate says how loud a vocabulary was and only the terms say what it
was hearing. Each row is a word FIBO publishes as a term of finance and this repository
declares in some other sense.

| Term | Occurrences | Concept FIBO publishes under it | First site |
|---|--:|---|---|
| `occurrences` | 76 | Occurrence | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21 |
| `occurrence` | 42 | Occurrence | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56 |
| `claim` | 18 | Claim | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ChosenWord.java:23 |
| `method` | 16 | Method | code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:7 |
| `mean` | 16 | Mean | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62 |
| `catalog` | 10 | Catalog | lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/NistCsfExtraction.java:42 |
| `means` | 10 | Mean | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWordsTest.java:95 |
| `median` | 7 | Median | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84 |
| `methods` | 8 | Method | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:20 |
| `claims` | 7 | Claim | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:27 |
| `meaning` | 6 | Mean | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRunsTest.java:24 |
| `agreement` | 5 | Agreement | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:98 |
| `scheme` | 4 | Strategy | code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18 |
| `request` | 4 | Request | code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16 |
| `claimed` | 4 | Claim | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:21 |
| `requests` | 3 | Request | code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:15 |
| `claiming` | 3 | Claim | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReadingTest.java:145 |
| `publication` | 3 | Publication | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:71 |
| `meant` | 2 | Mean | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:259 |
| `computation` | 1 | Calculation | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PinnedSubjectFindings.java:32 |
| `approaches` | 1 | Approach | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97 |
| `contract` | 1 | Contract | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/ProvidedServicesTest.java:38 |
| `difference` | 1 | Difference | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:72 |
| `action` | 1 | Action | code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:29 |

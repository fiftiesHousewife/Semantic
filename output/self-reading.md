# Self-reading — CodeSemantics

A reading of this repository's own Java sources by the library that reads repositories, over a
parse of the working tree. What it reads is what this repository **declared** — its types,
methods, fields, parameters and locals — the **prose** it wrote in javadoc and comments, and the
**dependencies** it named that are neither the platform's nor its own.

Everything else a Java file contains is somebody else's vocabulary quoted: `String`, `List` and
`assertThat` are uses of declarations the platform and the test framework made, and a use is not
a word this codebase chose. Only a parse can tell the two apart, which is why this reading needs
one. λ is the share of those word occurrences at least one bundled resource can be cited for.

| Scope | Files | Declarations | Words in names | Words in prose | Read | λ |
|---|--:|--:|--:|--:|--:|--:|
| `code-semantics-api/src/main/java` | 25 | 352 | 557 | 3,711 (86.9%) | 4,176 | **0.978** |
| `code-semantics-api/src/test/java` | 13 | 165 | 951 | 97 (9.3%) | 1,028 | **0.981** |
| `code-semantics-engine/src/main/java` | 128 | 2,883 | 4,074 | 30,326 (88.2%) | 33,894 | **0.985** |
| `code-semantics-engine/src/test/java` | 130 | 2,689 | 8,218 | 8,486 (50.8%) | 16,552 | **0.991** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,158 | 5,509 (82.6%) | 6,500 | **0.975** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,936 | 0 (0.0%) | 1,915 | **0.989** |
| `lexicon/src/main/java` | 21 | 681 | 1,135 | 4,794 (80.9%) | 5,768 | **0.973** |
| `lexicon/src/test/java` | 19 | 239 | 1,273 | 489 (27.8%) | 1,740 | **0.988** |
| `documentation` | 3 | 0 | 0 | 4,609 (100.0%) | 4,464 | **0.969** |
| **repository** | 419 | 8,313 | 19,302 | 58,021 (75.0%) | 76,037 | **0.983** |

The repository's own words are 77,323 occurrences of 3,619 distinct surfaces, 1,152 of them (31.8%) written exactly once. 189 glued runs no boundary divided were read by the segmenter; 1,286 occurrences across 377 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 73,473 | 95.0% | 3,514 |
| `lexicon:wordnet-sense` | 52,658 | 68.1% | 945 |
| `lexicon:wiktionary-topic` | 43,538 | 56.3% | 181 |
| `lexicon:wikidata-initialism` | 34,982 | 45.2% | 58 |
| `lexicon:wikidata-name` | 31,130 | 40.3% | 16 |
| `lexicon:wordnet-domain` | 30,830 | 39.9% | 78 |
| `lexicon:wiktionary-abbreviation` | 27,036 | 35.0% | 6 |
| `catalogue:query-language-function` | 1,165 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 55 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 44 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| `word's` | 39 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `wiktionary` | 33 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `extjwnl` | 29 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `javadoc` | 29 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `net's` | 22 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| `resamples` | 19 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| `scope's` | 18 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| `unreadable` | 17 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| `file's` | 16 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| `platform's` | 15 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |

Read 419 files in 1.3 s — 3.2 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 64. Set aside as the platform's own vocabulary: 1225. Set aside as this repository's own coordinates: 367. Set aside as the toolchain a source set nothing is published from is checked with: 674. Files the parser refused: 0.
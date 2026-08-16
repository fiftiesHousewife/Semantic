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
| `code-semantics-engine/src/main/java` | 131 | 2,987 | 4,252 | 31,090 (88.0%) | 34,824 | **0.985** |
| `code-semantics-engine/src/test/java` | 135 | 2,774 | 8,464 | 8,794 (51.0%) | 17,099 | **0.991** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,158 | 5,509 (82.6%) | 6,500 | **0.975** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,936 | 0 (0.0%) | 1,915 | **0.989** |
| `lexicon/src/main/java` | 21 | 681 | 1,135 | 4,794 (80.9%) | 5,768 | **0.973** |
| `lexicon/src/test/java` | 19 | 239 | 1,273 | 489 (27.8%) | 1,740 | **0.988** |
| `documentation` | 3 | 0 | 0 | 4,050 (100.0%) | 3,918 | **0.967** |
| **repository** | 427 | 8,502 | 19,726 | 58,534 (74.8%) | 76,968 | **0.983** |

The repository's own words are 78,260 occurrences of 3,643 distinct surfaces, 1,164 of them (32.0%) written exactly once. 200 glued runs no boundary divided were read by the segmenter; 1,292 occurrences across 379 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 74,346 | 95.0% | 3,529 |
| `lexicon:wordnet-sense` | 53,329 | 68.1% | 956 |
| `lexicon:wiktionary-topic` | 44,122 | 56.4% | 179 |
| `lexicon:wikidata-initialism` | 35,493 | 45.4% | 64 |
| `lexicon:wikidata-name` | 31,515 | 40.3% | 15 |
| `lexicon:wordnet-domain` | 31,264 | 39.9% | 79 |
| `lexicon:wiktionary-abbreviation` | 27,335 | 34.9% | 7 |
| `catalogue:query-language-function` | 1,177 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 51 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 43 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| `word's` | 38 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `wiktionary` | 34 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `extjwnl` | 29 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `net's` | 21 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| `resamples` | 19 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| `file's` | 18 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| `scope's` | 17 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| `topic's` | 17 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:41` |
| `unreadable` | 17 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |

Read 427 files in 1.3 s — 3.2 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 69. Set aside as the platform's own vocabulary: 1258. Set aside as this repository's own coordinates: 371. Set aside as the toolchain a source set nothing is published from is checked with: 696. Files the parser refused: 0.
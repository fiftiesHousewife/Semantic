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
| `code-semantics-api/src/main/java` | 24 | 361 | 565 | 3,594 (86.4%) | 4,059 | **0.976** |
| `code-semantics-api/src/test/java` | 13 | 215 | 1,215 | 52 (4.1%) | 1,194 | **0.942** |
| `code-semantics-engine/src/main/java` | 103 | 2,354 | 3,293 | 24,580 (88.2%) | 27,593 | **0.990** |
| `code-semantics-engine/src/test/java` | 97 | 2,430 | 8,048 | 6,512 (44.7%) | 14,050 | **0.965** |
| `lexicon-extraction/src/main/java` | 45 | 943 | 1,210 | 6,022 (83.3%) | 7,088 | **0.980** |
| `lexicon-extraction/src/test/java` | 35 | 556 | 2,760 | 0 (0.0%) | 2,589 | **0.938** |
| `lexicon/src/main/java` | 21 | 681 | 1,134 | 4,649 (80.4%) | 5,675 | **0.981** |
| `lexicon/src/test/java` | 19 | 310 | 1,611 | 437 (21.3%) | 1,950 | **0.952** |
| `documentation` | 3 | 0 | 0 | 3,625 (100.0%) | 3,549 | **0.979** |
| **repository** | 360 | 7,850 | 19,836 | 49,471 (71.4%) | 67,747 | **0.977** |

The repository's own words are 69,307 occurrences of 3,422 distinct surfaces, 1,084 of them (31.7%) written exactly once. 265 glued runs no boundary divided were read by the segmenter; 1,560 occurrences across 231 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 64,925 | 93.7% | 2,787 |
| `lexicon:wordnet-sense` | 47,477 | 68.5% | 771 |
| `lexicon:wiktionary-topic` | 39,393 | 56.8% | 140 |
| `lexicon:wikidata-initialism` | 31,285 | 45.1% | 81 |
| `lexicon:wordnet-domain` | 29,162 | 42.1% | 70 |
| `lexicon:wikidata-name` | 28,246 | 40.8% | 14 |
| `lexicon:wiktionary-abbreviation` | 25,444 | 36.7% | 2 |
| `catalogue:query-language-function` | 930 | 1.3% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `junit` | 288 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:8` |
| `assertj` | 171 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:10` |
| `j2html` | 104 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:3` |
| `bi lexicon extraction` | 80 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| `codesemantics engine theme` | 80 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/BroaderTopics.java:1` |
| `codesemantics engine term` | 42 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:1` |
| `extjwnl` | 42 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| `codesemantics engine reading` | 41 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:1` |
| `bi lexicon` | 40 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/ArxivSubjects.java:1` |
| `commonest` | 37 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 23 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:128` |
| `codesemantics engine parse` | 16 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigin.java:1` |

Read 360 files in 0.2 s — 0.7 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 628. Set aside as the platform's own vocabulary: 1071. Set aside as this repository's own coordinates: 315. Files the parser refused: 0.
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
| `code-semantics-engine/src/main/java` | 101 | 2,285 | 3,216 | 24,214 (88.3%) | 27,153 | **0.990** |
| `code-semantics-engine/src/test/java` | 93 | 2,334 | 7,725 | 6,007 (43.7%) | 13,239 | **0.964** |
| `lexicon-extraction/src/main/java` | 45 | 943 | 1,210 | 6,022 (83.3%) | 7,088 | **0.980** |
| `lexicon-extraction/src/test/java` | 35 | 556 | 2,760 | 0 (0.0%) | 2,589 | **0.938** |
| `lexicon/src/main/java` | 21 | 681 | 1,134 | 4,649 (80.4%) | 5,675 | **0.981** |
| `lexicon/src/test/java` | 19 | 310 | 1,611 | 437 (21.3%) | 1,950 | **0.952** |
| `documentation` | 2 | 0 | 0 | 3,158 (100.0%) | 3,095 | **0.980** |
| **repository** | 353 | 7,685 | 19,436 | 48,133 (71.2%) | 66,042 | **0.977** |

The repository's own words are 67,569 occurrences of 3,393 distinct surfaces, 1,066 of them (31.4%) written exactly once. 254 glued runs no boundary divided were read by the segmenter; 1,527 occurrences across 223 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 63,321 | 93.7% | 2,732 |
| `lexicon:wordnet-sense` | 46,366 | 68.6% | 748 |
| `lexicon:wiktionary-topic` | 38,413 | 56.9% | 132 |
| `lexicon:wikidata-initialism` | 30,429 | 45.0% | 79 |
| `lexicon:wordnet-domain` | 28,500 | 42.2% | 58 |
| `lexicon:wikidata-name` | 27,532 | 40.7% | 14 |
| `lexicon:wiktionary-abbreviation` | 24,774 | 36.7% | 2 |
| `catalogue:query-language-function` | 916 | 1.4% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `junit` | 284 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:8` |
| `assertj` | 169 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:10` |
| `j2html` | 100 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/IndexPage.java:3` |
| `bi lexicon extraction` | 80 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| `codesemantics engine theme` | 78 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/BroaderTopics.java:1` |
| `codesemantics engine reading` | 41 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:1` |
| `extjwnl` | 41 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| `bi lexicon` | 40 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/ArxivSubjects.java:1` |
| `codesemantics engine term` | 40 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:1` |
| `commonest` | 37 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| `wiktionary` | 35 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 23 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:105` |
| `codesemantics engine parse` | 16 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigin.java:1` |

Read 353 files in 0.2 s — 0.6 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 618. Set aside as the platform's own vocabulary: 1060. Set aside as this repository's own coordinates: 315. Files the parser refused: 0.
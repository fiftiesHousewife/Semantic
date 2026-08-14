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
| `code-semantics-engine/src/test/java` | 89 | 2,243 | 7,457 | 5,466 (42.3%) | 12,451 | **0.963** |
| `lexicon-extraction/src/main/java` | 40 | 797 | 1,042 | 4,595 (81.5%) | 5,506 | **0.977** |
| `lexicon-extraction/src/test/java` | 30 | 479 | 2,362 | 0 (0.0%) | 2,211 | **0.936** |
| `lexicon/src/main/java` | 20 | 667 | 1,112 | 4,433 (79.9%) | 5,439 | **0.981** |
| `lexicon/src/test/java` | 18 | 295 | 1,528 | 437 (22.2%) | 1,871 | **0.952** |
| `documentation` | 2 | 0 | 0 | 3,158 (100.0%) | 3,095 | **0.980** |
| **repository** | 337 | 7,342 | 18,497 | 45,949 (71.3%) | 62,979 | **0.977** |

The repository's own words are 64,446 occurrences of 3,319 distinct surfaces, 1,039 of them (31.3%) written exactly once. 249 glued runs no boundary divided were read by the segmenter; 1,467 occurrences across 214 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 60,474 | 93.8% | 2,593 |
| `lexicon:wordnet-sense` | 44,334 | 68.8% | 697 |
| `lexicon:wiktionary-topic` | 36,652 | 56.9% | 129 |
| `lexicon:wikidata-initialism` | 28,910 | 44.9% | 30 |
| `lexicon:wordnet-domain` | 27,301 | 42.4% | 54 |
| `lexicon:wikidata-name` | 26,324 | 40.8% | 13 |
| `lexicon:wiktionary-abbreviation` | 23,608 | 36.6% | 2 |
| `catalogue:query-language-function` | 904 | 1.4% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `junit` | 266 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:8` |
| `assertj` | 158 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:10` |
| `j2html` | 98 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/IndexPage.java:3` |
| `codesemantics engine theme` | 78 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/BroaderTopics.java:1` |
| `bi lexicon extraction` | 70 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| `extjwnl` | 41 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| `codesemantics engine term` | 40 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:1` |
| `bi lexicon` | 38 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/ArxivSubjects.java:1` |
| `codesemantics engine reading` | 37 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:1` |
| `commonest` | 37 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| `wiktionary` | 35 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 27 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 23 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:105` |
| `codesemantics engine parse` | 16 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigin.java:1` |

Read 337 files in 0.3 s — 0.9 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 587. Set aside as the platform's own vocabulary: 997. Set aside as this repository's own coordinates: 307. No file failed to parse.
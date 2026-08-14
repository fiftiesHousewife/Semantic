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
| `code-semantics-engine/src/test/java` | 91 | 2,292 | 7,577 | 5,698 (42.9%) | 12,796 | **0.964** |
| `lexicon-extraction/src/main/java` | 40 | 797 | 1,042 | 4,595 (81.5%) | 5,506 | **0.977** |
| `lexicon-extraction/src/test/java` | 30 | 479 | 2,362 | 0 (0.0%) | 2,211 | **0.936** |
| `lexicon/src/main/java` | 20 | 667 | 1,112 | 4,433 (79.9%) | 5,439 | **0.981** |
| `lexicon/src/test/java` | 18 | 295 | 1,528 | 437 (22.2%) | 1,871 | **0.952** |
| `documentation` | 2 | 0 | 0 | 3,158 (100.0%) | 3,095 | **0.980** |
| **repository** | 339 | 7,391 | 18,617 | 46,181 (71.3%) | 63,324 | **0.977** |

The repository's own words are 64,798 occurrences of 3,327 distinct surfaces, 1,040 of them (31.3%) written exactly once. 250 glued runs no boundary divided were read by the segmenter; 1,474 occurrences across 214 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 60,810 | 93.8% | 2,617 |
| `lexicon:wordnet-sense` | 44,568 | 68.8% | 699 |
| `lexicon:wiktionary-topic` | 36,855 | 56.9% | 129 |
| `lexicon:wikidata-initialism` | 29,069 | 44.9% | 30 |
| `lexicon:wordnet-domain` | 27,445 | 42.4% | 54 |
| `lexicon:wikidata-name` | 26,467 | 40.8% | 13 |
| `lexicon:wiktionary-abbreviation` | 23,736 | 36.6% | 2 |
| `catalogue:query-language-function` | 904 | 1.4% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `junit` | 268 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:8` |
| `assertj` | 160 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:10` |
| `j2html` | 98 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/IndexPage.java:3` |
| `codesemantics engine theme` | 78 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/BroaderTopics.java:1` |
| `bi lexicon extraction` | 70 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| `extjwnl` | 41 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| `codesemantics engine term` | 40 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:1` |
| `codesemantics engine reading` | 39 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:1` |
| `bi lexicon` | 38 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/ArxivSubjects.java:1` |
| `commonest` | 37 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| `wiktionary` | 35 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 27 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 23 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:105` |
| `codesemantics engine parse` | 16 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigin.java:1` |

Read 339 files in 0.4 s — 1.1 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 591. Set aside as the platform's own vocabulary: 1007. Set aside as this repository's own coordinates: 307. No file failed to parse.
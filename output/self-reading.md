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
| `code-semantics-engine/src/test/java` | 80 | 2,055 | 6,945 | 3,707 (34.8%) | 10,228 | **0.960** |
| `lexicon-extraction/src/main/java` | 39 | 770 | 1,006 | 4,009 (79.9%) | 4,895 | **0.976** |
| `lexicon-extraction/src/test/java` | 29 | 454 | 2,165 | 0 (0.0%) | 2,020 | **0.933** |
| `lexicon/src/main/java` | 20 | 663 | 1,108 | 4,201 (79.1%) | 5,205 | **0.980** |
| `lexicon/src/test/java` | 18 | 284 | 1,489 | 437 (22.7%) | 1,832 | **0.951** |
| `documentation` | 2 | 0 | 0 | 3,158 (100.0%) | 3,095 | **0.980** |
| **repository** | 326 | 7,087 | 17,709 | 43,372 (71.0%) | 59,681 | **0.977** |

The repository's own words are 61,081 occurrences of 3,255 distinct surfaces, 1,038 of them (31.9%) written exactly once. 245 glued runs no boundary divided were read by the segmenter; 1,400 occurrences across 207 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 57,283 | 93.8% | 2,458 |
| `lexicon:wordnet-sense` | 42,091 | 68.9% | 670 |
| `lexicon:wiktionary-topic` | 34,823 | 57.0% | 122 |
| `lexicon:wikidata-initialism` | 27,337 | 44.8% | 27 |
| `lexicon:wordnet-domain` | 25,984 | 42.5% | 53 |
| `lexicon:wikidata-name` | 24,953 | 40.9% | 13 |
| `lexicon:wiktionary-abbreviation` | 22,367 | 36.6% | 2 |
| `catalogue:query-language-function` | 868 | 1.4% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `junit` | 246 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:8` |
| `assertj` | 147 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:10` |
| `j2html` | 98 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/IndexPage.java:3` |
| `codesemantics engine theme` | 76 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/BroaderTopics.java:1` |
| `bi lexicon extraction` | 68 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| `extjwnl` | 41 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| `codesemantics engine term` | 39 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:1` |
| `bi lexicon` | 38 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/ArxivSubjects.java:1` |
| `commonest` | 35 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| `wiktionary` | 35 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `codesemantics engine reading` | 32 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:1` |
| `permalink` | 27 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 21 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:177` |
| `codesemantics engine parse` | 16 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigin.java:1` |

Read 326 files in 0.3 s — 1.0 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 556. Set aside as the platform's own vocabulary: 955. Set aside as this repository's own coordinates: 271. No file failed to parse.
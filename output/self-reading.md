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
| `code-semantics-api/src/main/java` | 24 | 361 | 613 | 3,594 (85.4%) | 4,131 | **0.982** |
| `code-semantics-api/src/test/java` | 13 | 215 | 1,241 | 52 (4.0%) | 1,233 | **0.954** |
| `code-semantics-engine/src/main/java` | 106 | 2,452 | 3,753 | 26,910 (87.8%) | 30,477 | **0.994** |
| `code-semantics-engine/src/test/java` | 104 | 2,650 | 9,137 | 7,504 (45.1%) | 16,196 | **0.973** |
| `lexicon-extraction/src/main/java` | 45 | 943 | 1,300 | 6,022 (82.2%) | 7,223 | **0.986** |
| `lexicon-extraction/src/test/java` | 35 | 556 | 2,830 | 0 (0.0%) | 2,694 | **0.952** |
| `lexicon/src/main/java` | 21 | 689 | 1,173 | 4,956 (80.9%) | 6,040 | **0.985** |
| `lexicon/src/test/java` | 19 | 314 | 1,652 | 505 (23.4%) | 2,076 | **0.962** |
| `documentation` | 3 | 0 | 0 | 3,833 (100.0%) | 3,757 | **0.980** |
| **repository** | 370 | 8,180 | 21,699 | 53,376 (71.1%) | 73,827 | **0.983** |

The repository's own words are 75,075 occurrences of 3,448 distinct surfaces, 1,078 of them (31.3%) written exactly once. 538 glued runs no boundary divided were read by the segmenter; 1,248 occurrences across 220 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 70,815 | 94.3% | 3,035 |
| `lexicon:wordnet-sense` | 51,955 | 69.2% | 811 |
| `lexicon:wiktionary-topic` | 43,315 | 57.7% | 174 |
| `lexicon:wikidata-initialism` | 34,046 | 45.3% | 81 |
| `lexicon:wordnet-domain` | 32,229 | 42.9% | 79 |
| `lexicon:wikidata-name` | 30,664 | 40.8% | 14 |
| `lexicon:wiktionary-abbreviation` | 27,390 | 36.5% | 2 |
| `catalogue:query-language-function` | 969 | 1.3% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `junit` | 299 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:8` |
| `assertj` | 177 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:10` |
| `j2html` | 109 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:3` |
| `extjwnl` | 42 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| `commonest` | 39 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:8` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 26 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:130` |
| `unreadable` | 17 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:36` |
| `resamples` | 14 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| `wikidata` | 14 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| `olia` | 13 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpan.java:7` |
| `wiktextract` | 12 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| `javadoc` | 10 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |

Read 370 files in 0.2 s — 0.6 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 650. Set aside as the platform's own vocabulary: 1104. Set aside as this repository's own coordinates: 329. Files the parser refused: 0.
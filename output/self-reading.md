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
| `code-semantics-engine/src/main/java` | 104 | 2,394 | 3,666 | 25,762 (87.5%) | 29,247 | **0.994** |
| `code-semantics-engine/src/test/java` | 99 | 2,503 | 8,638 | 6,964 (44.6%) | 15,183 | **0.973** |
| `lexicon-extraction/src/main/java` | 45 | 943 | 1,300 | 6,022 (82.2%) | 7,223 | **0.986** |
| `lexicon-extraction/src/test/java` | 35 | 556 | 2,830 | 0 (0.0%) | 2,694 | **0.952** |
| `lexicon/src/main/java` | 21 | 681 | 1,155 | 4,727 (80.4%) | 5,793 | **0.985** |
| `lexicon/src/test/java` | 19 | 313 | 1,642 | 505 (23.5%) | 2,066 | **0.962** |
| `documentation` | 3 | 0 | 0 | 3,725 (100.0%) | 3,649 | **0.980** |
| **repository** | 363 | 7,966 | 21,085 | 51,351 (70.9%) | 71,219 | **0.983** |

The repository's own words are 72,436 occurrences of 3,431 distinct surfaces, 1,079 of them (31.4%) written exactly once. 509 glued runs no boundary divided were read by the segmenter; 1,217 occurrences across 218 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 68,284 | 94.3% | 2,917 |
| `lexicon:wordnet-sense` | 50,136 | 69.2% | 792 |
| `lexicon:wiktionary-topic` | 41,891 | 57.8% | 172 |
| `lexicon:wikidata-initialism` | 32,776 | 45.2% | 81 |
| `lexicon:wordnet-domain` | 31,104 | 42.9% | 79 |
| `lexicon:wikidata-name` | 29,589 | 40.8% | 14 |
| `lexicon:wiktionary-abbreviation` | 26,469 | 36.5% | 2 |
| `catalogue:query-language-function` | 947 | 1.3% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `junit` | 290 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:8` |
| `assertj` | 173 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:10` |
| `j2html` | 104 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:3` |
| `extjwnl` | 42 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| `commonest` | 37 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 23 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:130` |
| `unreadable` | 17 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:36` |
| `resamples` | 14 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| `wikidata` | 14 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| `olia` | 13 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpan.java:7` |
| `wiktextract` | 12 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| `javadoc` | 10 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |

Read 363 files in 0.2 s — 0.5 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 632. Set aside as the platform's own vocabulary: 1082. Set aside as this repository's own coordinates: 317. Files the parser refused: 0.
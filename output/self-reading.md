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
| `code-semantics-api/src/test/java` | 13 | 215 | 1,241 | 109 (8.1%) | 1,285 | **0.952** |
| `code-semantics-engine/src/main/java` | 107 | 2,502 | 3,821 | 27,692 (87.9%) | 31,314 | **0.994** |
| `code-semantics-engine/src/test/java` | 108 | 2,725 | 9,441 | 7,944 (45.7%) | 16,924 | **0.973** |
| `lexicon-extraction/src/main/java` | 45 | 943 | 1,300 | 6,022 (82.2%) | 7,223 | **0.986** |
| `lexicon-extraction/src/test/java` | 35 | 556 | 2,830 | 0 (0.0%) | 2,694 | **0.952** |
| `lexicon/src/main/java` | 21 | 689 | 1,173 | 4,956 (80.9%) | 6,040 | **0.985** |
| `lexicon/src/test/java` | 19 | 314 | 1,652 | 505 (23.4%) | 2,076 | **0.962** |
| `documentation` | 3 | 0 | 0 | 3,874 (100.0%) | 3,795 | **0.980** |
| **repository** | 375 | 8,305 | 22,071 | 54,696 (71.2%) | 75,482 | **0.983** |

The repository's own words are 76,767 occurrences of 3,502 distinct surfaces, 1,090 of them (31.1%) written exactly once. 545 glued runs no boundary divided were read by the segmenter; 1,285 occurrences across 229 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 72,406 | 94.3% | 3,127 |
| `lexicon:wordnet-sense` | 53,047 | 69.1% | 823 |
| `lexicon:wiktionary-topic` | 44,298 | 57.7% | 181 |
| `lexicon:wikidata-initialism` | 34,827 | 45.4% | 81 |
| `lexicon:wordnet-domain` | 32,891 | 42.8% | 86 |
| `lexicon:wikidata-name` | 31,348 | 40.8% | 16 |
| `lexicon:wiktionary-abbreviation` | 28,045 | 36.5% | 1 |
| `catalogue:query-language-function` | 1,016 | 1.3% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `junit` | 306 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:8` |
| `assertj` | 181 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:10` |
| `j2html` | 109 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:3` |
| `extjwnl` | 42 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| `commonest` | 39 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:8` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 26 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:131` |
| `unreadable` | 17 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:36` |
| `resamples` | 14 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| `wikidata` | 14 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| `olia` | 13 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpan.java:7` |
| `wiktextract` | 12 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| `javadoc` | 10 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |

Read 375 files in 0.2 s — 0.6 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 661. Set aside as the platform's own vocabulary: 1108. Set aside as this repository's own coordinates: 311. Files the parser refused: 0.
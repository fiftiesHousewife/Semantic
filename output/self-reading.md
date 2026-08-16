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
| `code-semantics-api/src/main/java` | 24 | 342 | 556 | 3,357 (85.8%) | 3,865 | **0.988** |
| `code-semantics-api/src/test/java` | 13 | 157 | 901 | 99 (9.9%) | 982 | **0.982** |
| `code-semantics-engine/src/main/java` | 124 | 2,760 | 3,945 | 29,338 (88.1%) | 33,088 | **0.994** |
| `code-semantics-engine/src/test/java` | 122 | 2,500 | 7,811 | 7,803 (50.0%) | 15,548 | **0.996** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,168 | 5,591 (82.7%) | 6,671 | **0.987** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,950 | 0 (0.0%) | 1,930 | **0.990** |
| `lexicon/src/main/java` | 21 | 673 | 1,139 | 4,779 (80.8%) | 5,831 | **0.985** |
| `lexicon/src/test/java` | 19 | 236 | 1,260 | 492 (28.1%) | 1,733 | **0.989** |
| `documentation` | 3 | 0 | 0 | 3,990 (100.0%) | 3,911 | **0.980** |
| **repository** | 406 | 7,972 | 18,730 | 55,449 (74.8%) | 73,559 | **0.992** |

The repository's own words are 74,179 occurrences of 3,406 distinct surfaces, 1,072 of them (31.5%) written exactly once. 322 glued runs no boundary divided were read by the segmenter; 620 occurrences across 194 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 71,135 | 95.9% | 3,342 |
| `lexicon:wordnet-sense` | 51,300 | 69.2% | 872 |
| `lexicon:wiktionary-topic` | 41,941 | 56.5% | 180 |
| `lexicon:wikidata-initialism` | 33,457 | 45.1% | 64 |
| `lexicon:wikidata-name` | 30,455 | 41.1% | 18 |
| `lexicon:wordnet-domain` | 30,377 | 41.0% | 73 |
| `lexicon:wiktionary-abbreviation` | 26,526 | 35.8% | 1 |
| `catalogue:query-language-function` | 1,076 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `commonest` | 42 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:8` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `javadoc` | 31 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `extjwnl` | 30 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 21 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| `unreadable` | 16 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:36` |
| `resamples` | 14 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| `wikidata` | 14 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| `wiktextract` | 12 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| `fasterxml` | 8 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:3` |
| `olia` | 8 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| `oscal` | 8 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| `furthest` | 7 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |

Read 406 files in 0.2 s — 0.5 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 62. Set aside as the platform's own vocabulary: 1180. Set aside as this repository's own coordinates: 349. Set aside as the toolchain a source set nothing is published from is checked with: 648. Files the parser refused: 0.
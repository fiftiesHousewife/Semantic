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
| `code-semantics-engine/src/main/java` | 178 | 4,081 | 5,811 | 40,222 (87.4%) | 45,356 | **0.985** |
| `code-semantics-engine/src/test/java` | 162 | 3,187 | 10,184 | 9,226 (47.5%) | 19,239 | **0.991** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,158 | 5,509 (82.6%) | 6,500 | **0.975** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,936 | 0 (0.0%) | 1,915 | **0.989** |
| `lexicon/src/main/java` | 22 | 694 | 1,151 | 5,062 (81.5%) | 6,052 | **0.974** |
| `lexicon/src/test/java` | 21 | 258 | 1,363 | 489 (26.4%) | 1,830 | **0.988** |
| `documentation` | 3 | 0 | 0 | 9,288 (100.0%) | 8,972 | **0.966** |
| **repository** | 504 | 10,041 | 23,111 | 73,604 (76.1%) | 95,068 | **0.983** |

The repository's own words are 96,715 occurrences of 3,986 distinct surfaces, 1,261 of them (31.6%) written exactly once. 218 glued runs no boundary divided were read by the segmenter; 1,647 occurrences across 470 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 91,848 | 95.0% | 4,496 |
| `lexicon:wordnet-sense` | 65,675 | 67.9% | 1,127 |
| `lexicon:wiktionary-topic` | 54,097 | 55.9% | 231 |
| `lexicon:wikidata-initialism` | 43,438 | 44.9% | 71 |
| `lexicon:wikidata-name` | 38,644 | 40.0% | 42 |
| `lexicon:wordnet-domain` | 38,247 | 39.5% | 120 |
| `lexicon:wiktionary-abbreviation` | 33,491 | 34.6% | 10 |
| `catalogue:query-language-function` | 1,437 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 79 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 44 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenMass.java:5` |
| `word's` | 44 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| `wiktionary` | 38 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `segmenter` | 35 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 29 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `publisher's` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `resamples` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| `topic's` | 25 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `scope's` | 23 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `xiv's` | 22 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| `arxiv` | 21 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| `net's` | 21 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |

Read 504 files in 1.7 s — 3.4 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 79. Set aside as the platform's own vocabulary: 1458. Set aside as this repository's own coordinates: 501. Set aside as the toolchain a source set nothing is published from is checked with: 811. Files the parser refused: 0.
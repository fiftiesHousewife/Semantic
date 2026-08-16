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
| `code-semantics-engine/src/main/java` | 166 | 3,729 | 5,360 | 36,796 (87.3%) | 41,545 | **0.986** |
| `code-semantics-engine/src/test/java` | 159 | 3,156 | 9,837 | 9,362 (48.8%) | 19,033 | **0.991** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,158 | 5,509 (82.6%) | 6,500 | **0.975** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,936 | 0 (0.0%) | 1,915 | **0.989** |
| `lexicon/src/main/java` | 22 | 692 | 1,148 | 4,967 (81.2%) | 5,954 | **0.974** |
| `lexicon/src/test/java` | 20 | 251 | 1,326 | 489 (26.9%) | 1,793 | **0.988** |
| `documentation` | 3 | 0 | 0 | 8,098 (100.0%) | 7,819 | **0.966** |
| **repository** | 488 | 9,649 | 22,273 | 69,029 (75.6%) | 89,763 | **0.983** |

The repository's own words are 91,302 occurrences of 3,887 distinct surfaces, 1,235 of them (31.8%) written exactly once. 211 glued runs no boundary divided were read by the segmenter; 1,539 occurrences across 440 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 86,751 | 95.0% | 4,204 |
| `lexicon:wordnet-sense` | 62,142 | 68.1% | 1,071 |
| `lexicon:wiktionary-topic` | 51,281 | 56.2% | 195 |
| `lexicon:wikidata-initialism` | 41,137 | 45.1% | 68 |
| `lexicon:wikidata-name` | 36,482 | 40.0% | 29 |
| `lexicon:wordnet-domain` | 36,262 | 39.7% | 116 |
| `lexicon:wiktionary-abbreviation` | 31,703 | 34.7% | 10 |
| `catalogue:query-language-function` | 1,393 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 68 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| `word's` | 44 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| `commonest` | 43 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| `wiktionary` | 37 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `segmenter` | 35 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 29 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `resamples` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| `topic's` | 25 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `publisher's` | 22 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `scope's` | 22 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `arxiv` | 21 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| `net's` | 20 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| `xiv's` | 20 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |

Read 488 files in 1.6 s — 3.3 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 78. Set aside as the platform's own vocabulary: 1418. Set aside as this repository's own coordinates: 476. Set aside as the toolchain a source set nothing is published from is checked with: 785. Files the parser refused: 0.
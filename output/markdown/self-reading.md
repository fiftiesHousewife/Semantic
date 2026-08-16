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
| `code-semantics-engine/src/main/java` | 162 | 3,651 | 5,256 | 36,133 (87.3%) | 40,789 | **0.986** |
| `code-semantics-engine/src/test/java` | 154 | 3,095 | 9,633 | 9,151 (48.7%) | 18,623 | **0.991** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,158 | 5,509 (82.6%) | 6,500 | **0.975** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,936 | 0 (0.0%) | 1,915 | **0.989** |
| `lexicon/src/main/java` | 22 | 685 | 1,141 | 4,895 (81.1%) | 5,875 | **0.973** |
| `lexicon/src/test/java` | 19 | 239 | 1,273 | 489 (27.8%) | 1,740 | **0.988** |
| `documentation` | 3 | 0 | 0 | 6,974 (100.0%) | 6,726 | **0.964** |
| **repository** | 478 | 9,491 | 21,905 | 66,959 (75.3%) | 87,372 | **0.983** |

The repository's own words are 88,864 occurrences of 3,834 distinct surfaces, 1,223 of them (31.9%) written exactly once. 209 glued runs no boundary divided were read by the segmenter; 1,492 occurrences across 432 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 84,460 | 95.0% | 4,081 |
| `lexicon:wordnet-sense` | 60,505 | 68.1% | 1,037 |
| `lexicon:wiktionary-topic` | 49,990 | 56.3% | 192 |
| `lexicon:wikidata-initialism` | 40,088 | 45.1% | 66 |
| `lexicon:wikidata-name` | 35,551 | 40.0% | 29 |
| `lexicon:wordnet-domain` | 35,333 | 39.8% | 106 |
| `lexicon:wiktionary-abbreviation` | 30,855 | 34.7% | 10 |
| `catalogue:query-language-function` | 1,386 | 1.6% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 65 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| `word's` | 44 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| `commonest` | 43 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| `wiktionary` | 37 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `segmenter` | 35 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 29 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `topic's` | 25 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `resamples` | 24 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| `arxiv` | 21 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| `scope's` | 21 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `net's` | 20 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| `publisher's` | 19 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `file's` | 18 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |

Read 478 files in 1.4 s — 3.0 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 78. Set aside as the platform's own vocabulary: 1372. Set aside as this repository's own coordinates: 460. Set aside as the toolchain a source set nothing is published from is checked with: 765. Files the parser refused: 0.
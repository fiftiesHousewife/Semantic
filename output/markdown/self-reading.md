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
| `code-semantics-engine/src/main/java` | 175 | 3,991 | 5,701 | 39,581 (87.4%) | 44,623 | **0.985** |
| `code-semantics-engine/src/test/java` | 158 | 3,098 | 9,957 | 8,943 (47.3%) | 18,739 | **0.991** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,158 | 5,509 (82.6%) | 6,500 | **0.975** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,936 | 0 (0.0%) | 1,915 | **0.989** |
| `lexicon/src/main/java` | 22 | 694 | 1,151 | 5,062 (81.5%) | 6,052 | **0.974** |
| `lexicon/src/test/java` | 21 | 258 | 1,363 | 489 (26.4%) | 1,830 | **0.988** |
| `documentation` | 3 | 0 | 0 | 9,130 (100.0%) | 8,818 | **0.966** |
| **repository** | 497 | 9,862 | 22,774 | 72,522 (76.1%) | 93,681 | **0.983** |

The repository's own words are 95,296 occurrences of 3,968 distinct surfaces, 1,260 of them (31.8%) written exactly once. 216 glued runs no boundary divided were read by the segmenter; 1,615 occurrences across 466 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 90,509 | 95.0% | 4,428 |
| `lexicon:wordnet-sense` | 64,744 | 67.9% | 1,109 |
| `lexicon:wiktionary-topic` | 53,376 | 56.0% | 226 |
| `lexicon:wikidata-initialism` | 42,844 | 45.0% | 71 |
| `lexicon:wikidata-name` | 38,122 | 40.0% | 35 |
| `lexicon:wordnet-domain` | 37,759 | 39.6% | 120 |
| `lexicon:wiktionary-abbreviation` | 33,063 | 34.7% | 10 |
| `catalogue:query-language-function` | 1,429 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 73 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| `word's` | 44 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| `commonest` | 43 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| `wiktionary` | 38 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `segmenter` | 35 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 29 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `resamples` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| `topic's` | 25 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `publisher's` | 23 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `scope's` | 23 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `xiv's` | 22 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| `arxiv` | 21 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| `net's` | 20 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |

Read 497 files in 1.7 s — 3.3 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 79. Set aside as the platform's own vocabulary: 1435. Set aside as this repository's own coordinates: 491. Set aside as the toolchain a source set nothing is published from is checked with: 802. Files the parser refused: 0.
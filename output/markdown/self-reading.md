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
| `code-semantics-engine/src/main/java` | 149 | 3,308 | 4,797 | 33,345 (87.4%) | 37,580 | **0.985** |
| `code-semantics-engine/src/test/java` | 143 | 2,874 | 8,826 | 8,672 (49.6%) | 17,343 | **0.991** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,158 | 5,509 (82.6%) | 6,500 | **0.975** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,936 | 0 (0.0%) | 1,915 | **0.989** |
| `lexicon/src/main/java` | 21 | 681 | 1,135 | 4,794 (80.9%) | 5,768 | **0.973** |
| `lexicon/src/test/java` | 19 | 239 | 1,273 | 489 (27.8%) | 1,740 | **0.988** |
| `documentation` | 3 | 0 | 0 | 5,875 (100.0%) | 5,664 | **0.964** |
| **repository** | 453 | 8,923 | 20,633 | 62,492 (75.2%) | 81,714 | **0.983** |

The repository's own words are 83,125 occurrences of 3,764 distinct surfaces, 1,213 of them (32.2%) written exactly once. 203 glued runs no boundary divided were read by the segmenter; 1,411 occurrences across 419 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 78,915 | 94.9% | 3,758 |
| `lexicon:wordnet-sense` | 56,585 | 68.1% | 1,009 |
| `lexicon:wiktionary-topic` | 46,714 | 56.2% | 189 |
| `lexicon:wikidata-initialism` | 37,524 | 45.1% | 64 |
| `lexicon:wikidata-name` | 33,330 | 40.1% | 24 |
| `lexicon:wordnet-domain` | 33,002 | 39.7% | 104 |
| `lexicon:wiktionary-abbreviation` | 28,766 | 34.6% | 10 |
| `catalogue:query-language-function` | 1,272 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 60 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 43 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| `word's` | 40 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| `wiktionary` | 37 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 29 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `topic's` | 24 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `resamples` | 23 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| `scope's` | 22 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `arxiv` | 21 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| `net's` | 19 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| `file's` | 18 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| `publisher's` | 17 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |

Read 453 files in 1.5 s — 3.3 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 77. Set aside as the platform's own vocabulary: 1317. Set aside as this repository's own coordinates: 430. Set aside as the toolchain a source set nothing is published from is checked with: 722. Files the parser refused: 0.
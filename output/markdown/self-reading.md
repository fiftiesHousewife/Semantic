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
| `code-semantics-engine/src/main/java` | 148 | 3,281 | 4,762 | 33,053 (87.4%) | 37,258 | **0.985** |
| `code-semantics-engine/src/test/java` | 143 | 2,868 | 8,811 | 8,565 (49.3%) | 17,222 | **0.991** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,158 | 5,509 (82.6%) | 6,500 | **0.975** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,936 | 0 (0.0%) | 1,915 | **0.989** |
| `lexicon/src/main/java` | 21 | 681 | 1,135 | 4,794 (80.9%) | 5,768 | **0.973** |
| `lexicon/src/test/java` | 19 | 239 | 1,273 | 489 (27.8%) | 1,740 | **0.988** |
| `documentation` | 3 | 0 | 0 | 5,519 (100.0%) | 5,320 | **0.964** |
| **repository** | 452 | 8,890 | 20,583 | 61,737 (75.0%) | 80,927 | **0.983** |

The repository's own words are 82,320 occurrences of 3,750 distinct surfaces, 1,215 of them (32.4%) written exactly once. 203 glued runs no boundary divided were read by the segmenter; 1,393 occurrences across 413 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 78,165 | 95.0% | 3,730 |
| `lexicon:wordnet-sense` | 56,072 | 68.1% | 1,002 |
| `lexicon:wiktionary-topic` | 46,276 | 56.2% | 186 |
| `lexicon:wikidata-initialism` | 37,190 | 45.2% | 64 |
| `lexicon:wikidata-name` | 33,014 | 40.1% | 23 |
| `lexicon:wordnet-domain` | 32,710 | 39.7% | 91 |
| `lexicon:wiktionary-abbreviation` | 28,508 | 34.6% | 10 |
| `catalogue:query-language-function` | 1,262 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 57 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 43 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| `word's` | 40 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| `wiktionary` | 37 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 29 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `resamples` | 23 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| `topic's` | 23 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `scope's` | 22 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `arxiv` | 21 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:37` |
| `net's` | 19 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| `file's` | 18 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| `publisher's` | 17 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |

Read 452 files in 1.4 s — 3.2 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 77. Set aside as the platform's own vocabulary: 1316. Set aside as this repository's own coordinates: 436. Set aside as the toolchain a source set nothing is published from is checked with: 722. Files the parser refused: 0.
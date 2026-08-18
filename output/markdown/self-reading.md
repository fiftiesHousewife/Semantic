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
| `code-semantics-api/src/main/java` | 25 | 301 | 486 | 3,590 (88.1%) | 3,982 | **0.977** |
| `code-semantics-api/src/test/java` | 13 | 165 | 951 | 97 (9.3%) | 1,028 | **0.981** |
| `code-semantics-engine/src/main/java` | 181 | 3,888 | 5,523 | 38,902 (87.6%) | 43,784 | **0.986** |
| `code-semantics-engine/src/test/java` | 171 | 3,254 | 10,568 | 8,032 (43.2%) | 18,450 | **0.992** |
| `lexicon-extraction/src/main/java` | 55 | 1,016 | 1,328 | 6,042 (82.0%) | 7,195 | **0.976** |
| `lexicon-extraction/src/test/java` | 44 | 494 | 2,323 | 0 (0.0%) | 2,300 | **0.990** |
| `lexicon/src/main/java` | 26 | 653 | 1,102 | 5,100 (82.2%) | 6,043 | **0.974** |
| `lexicon/src/test/java` | 26 | 299 | 1,596 | 419 (20.8%) | 1,992 | **0.989** |
| `documentation` | 3 | 0 | 0 | 9,682 (100.0%) | 9,342 | **0.965** |
| **repository** | 544 | 10,070 | 23,877 | 71,864 (75.1%) | 94,116 | **0.983** |

The repository's own words are 95,741 occurrences of 3,942 distinct surfaces, 1,233 of them (31.3%) written exactly once. 231 glued runs no boundary divided were read by the segmenter; 1,625 occurrences across 461 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 90,841 | 94.9% | 4,396 |
| `lexicon:wordnet-sense` | 65,305 | 68.2% | 1,158 |
| `lexicon:wiktionary-topic` | 53,486 | 55.9% | 212 |
| `lexicon:wikidata-initialism` | 42,870 | 44.8% | 75 |
| `lexicon:wikidata-name` | 38,268 | 40.0% | 42 |
| `lexicon:wordnet-domain` | 38,080 | 39.8% | 117 |
| `lexicon:wiktionary-abbreviation` | 33,012 | 34.5% | 9 |
| `catalogue:query-language-function` | 1,434 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 70 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| `word's` | 45 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| `commonest` | 44 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:68` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 35 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 26 | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| `topic's` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `publisher's` | 24 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `arxiv` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| `resamples` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| `net's` | 21 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| `scope's` | 21 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `taxonomy's` | 21 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |

Read 544 files in 1.6 s — 3.0 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 82. Set aside as the platform's own vocabulary: 1504. Set aside as this repository's own coordinates: 498. Set aside as the toolchain a source set nothing is published from is checked with: 885. Files the parser refused: 0.
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
| `code-semantics-engine/src/main/java` | 179 | 3,856 | 5,477 | 38,732 (87.6%) | 43,573 | **0.986** |
| `code-semantics-engine/src/test/java` | 170 | 3,226 | 10,517 | 8,084 (43.5%) | 18,445 | **0.992** |
| `lexicon-extraction/src/main/java` | 48 | 864 | 1,128 | 5,313 (82.5%) | 6,281 | **0.975** |
| `lexicon-extraction/src/test/java` | 39 | 439 | 2,086 | 0 (0.0%) | 2,064 | **0.989** |
| `lexicon/src/main/java` | 24 | 632 | 1,068 | 4,902 (82.1%) | 5,814 | **0.974** |
| `lexicon/src/test/java` | 26 | 299 | 1,596 | 419 (20.8%) | 1,992 | **0.989** |
| `documentation` | 3 | 0 | 0 | 9,431 (100.0%) | 9,108 | **0.966** |
| **repository** | 527 | 9,782 | 23,309 | 70,568 (75.2%) | 92,287 | **0.983** |

The repository's own words are 93,877 occurrences of 3,908 distinct surfaces, 1,230 of them (31.5%) written exactly once. 225 glued runs no boundary divided were read by the segmenter; 1,590 occurrences across 446 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 89,102 | 94.9% | 4,336 |
| `lexicon:wordnet-sense` | 63,994 | 68.2% | 1,138 |
| `lexicon:wiktionary-topic` | 52,432 | 55.9% | 211 |
| `lexicon:wikidata-initialism` | 42,046 | 44.8% | 71 |
| `lexicon:wikidata-name` | 37,545 | 40.0% | 39 |
| `lexicon:wordnet-domain` | 37,342 | 39.8% | 118 |
| `lexicon:wiktionary-abbreviation` | 32,402 | 34.5% | 9 |
| `catalogue:query-language-function` | 1,404 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 70 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| `word's` | 45 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| `commonest` | 44 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:68` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 34 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 26 | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| `topic's` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `publisher's` | 24 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `arxiv` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| `resamples` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| `net's` | 21 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| `scope's` | 21 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `xiv's` | 21 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |

Read 527 files in 1.6 s — 3.0 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 78. Set aside as the platform's own vocabulary: 1450. Set aside as this repository's own coordinates: 487. Set aside as the toolchain a source set nothing is published from is checked with: 872. Files the parser refused: 0.
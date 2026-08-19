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
| `code-semantics-api/src/main/java` | 25 | 300 | 482 | 3,616 (88.2%) | 4,003 | **0.977** |
| `code-semantics-api/src/test/java` | 13 | 166 | 961 | 97 (9.2%) | 1,038 | **0.981** |
| `code-semantics-engine/src/main/java` | 191 | 4,152 | 5,925 | 40,362 (87.2%) | 45,585 | **0.985** |
| `code-semantics-engine/src/test/java` | 181 | 3,479 | 11,268 | 8,356 (42.6%) | 19,456 | **0.991** |
| `lexicon-extraction/src/main/java` | 66 | 1,245 | 1,640 | 7,055 (81.1%) | 8,497 | **0.977** |
| `lexicon-extraction/src/test/java` | 53 | 606 | 2,836 | 18 (0.6%) | 2,830 | **0.992** |
| `lexicon/src/main/java` | 28 | 677 | 1,138 | 5,342 (82.4%) | 6,314 | **0.974** |
| `lexicon/src/test/java` | 28 | 317 | 1,721 | 453 (20.8%) | 2,150 | **0.989** |
| `documentation` | 3 | 0 | 0 | 10,206 (100.0%) | 9,837 | **0.964** |
| `code-semantics-engine/src/test/resources` | 10 | 10 | 27 | 0 (0.0%) | 27 | **1.000** |
| **repository** | 598 | 10,952 | 25,998 | 75,505 (74.4%) | 99,737 | **0.983** |

The repository's own words are 101,503 occurrences of 4,067 distinct surfaces, 1,271 of them (31.3%) written exactly once. 235 glued runs no boundary divided were read by the segmenter; 1,766 occurrences across 487 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 96,230 | 94.8% | 4,602 |
| `lexicon:wordnet-sense` | 69,312 | 68.3% | 1,228 |
| `lexicon:wiktionary-topic` | 56,742 | 55.9% | 232 |
| `lexicon:wikidata-initialism` | 45,407 | 44.7% | 83 |
| `lexicon:wikidata-name` | 40,566 | 40.0% | 45 |
| `lexicon:wordnet-domain` | 40,376 | 39.8% | 119 |
| `lexicon:wiktionary-abbreviation` | 35,064 | 34.5% | 13 |
| `catalogue:query-language-function` | 1,515 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 72 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 45 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| `word's` | 45 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| `permalink` | 36 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| `publisher's` | 33 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `topic's` | 27 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `extjwnl` | 26 | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| `file's` | 23 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| `xiv's` | 23 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| `arxiv` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| `resamples` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| `scope's` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |

Read 598 files in 1.7 s — 2.9 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 87. Set aside as the platform's own vocabulary: 1675. Set aside as this repository's own coordinates: 531. Set aside as the toolchain a source set nothing is published from is checked with: 956. Files the parser refused: 0.

Service interfaces this tree registers providers for under the `ServiceLoader` contract: none.

Registered media types written as string literals: 6 distinct identifiers of the IANA registry, across 11 occurrences. Most written: `application/pdf` 6, `application/vnd.ms-excel` 1, `application/x-www-form-urlencoded` 1, `image/svg+xml` 1, `text/directory` 1.
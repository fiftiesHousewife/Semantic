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
| `code-semantics-engine/src/main/java` | 195 | 4,246 | 6,054 | 41,338 (87.2%) | 46,674 | **0.985** |
| `code-semantics-engine/src/test/java` | 188 | 3,651 | 11,734 | 8,862 (43.0%) | 20,413 | **0.991** |
| `lexicon-extraction/src/main/java` | 66 | 1,245 | 1,640 | 7,146 (81.3%) | 8,588 | **0.977** |
| `lexicon-extraction/src/test/java` | 53 | 607 | 2,848 | 18 (0.6%) | 2,842 | **0.992** |
| `lexicon/src/main/java` | 28 | 680 | 1,141 | 5,455 (82.7%) | 6,429 | **0.975** |
| `lexicon/src/test/java` | 29 | 324 | 1,760 | 453 (20.5%) | 2,189 | **0.989** |
| `documentation` | 3 | 0 | 0 | 10,387 (100.0%) | 10,012 | **0.964** |
| `code-semantics-engine/src/test/resources` | 10 | 10 | 27 | 0 (0.0%) | 27 | **1.000** |
| **repository** | 610 | 11,229 | 26,647 | 77,372 (74.4%) | 102,215 | **0.983** |

The repository's own words are 104,019 occurrences of 4,101 distinct surfaces, 1,274 of them (31.1%) written exactly once. 238 glued runs no boundary divided were read by the segmenter; 1,804 occurrences across 491 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 98,649 | 94.8% | 4,748 |
| `lexicon:wordnet-sense` | 70,978 | 68.2% | 1,260 |
| `lexicon:wiktionary-topic` | 58,073 | 55.8% | 235 |
| `lexicon:wikidata-initialism` | 46,486 | 44.7% | 86 |
| `lexicon:wikidata-name` | 41,525 | 39.9% | 47 |
| `lexicon:wordnet-domain` | 41,270 | 39.7% | 121 |
| `lexicon:wiktionary-abbreviation` | 35,849 | 34.5% | 13 |
| `catalogue:query-language-function` | 1,544 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 75 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 45 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| `word's` | 45 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| `permalink` | 36 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| `publisher's` | 35 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| `topic's` | 30 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `extjwnl` | 26 | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| `file's` | 23 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| `xiv's` | 23 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| `arxiv` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| `resamples` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| `scope's` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |

Read 610 files in 1.7 s — 2.9 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 87. Set aside as the platform's own vocabulary: 1709. Set aside as this repository's own coordinates: 567. Set aside as the toolchain a source set nothing is published from is checked with: 974. Files the parser refused: 0.

Service interfaces this tree registers providers for under the `ServiceLoader` contract: none.

Registered media types written as string literals: 6 distinct identifiers of the IANA registry, across 11 occurrences. Most written: `application/pdf` 6, `application/vnd.ms-excel` 1, `application/x-www-form-urlencoded` 1, `image/svg+xml` 1, `text/directory` 1.
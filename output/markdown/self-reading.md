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
| `code-semantics-engine/src/test/java` | 181 | 3,478 | 11,267 | 8,356 (42.6%) | 19,455 | **0.991** |
| `lexicon-extraction/src/main/java` | 58 | 1,066 | 1,387 | 6,303 (82.0%) | 7,512 | **0.977** |
| `lexicon-extraction/src/test/java` | 46 | 507 | 2,382 | 0 (0.0%) | 2,359 | **0.990** |
| `lexicon/src/main/java` | 27 | 662 | 1,114 | 5,166 (82.3%) | 6,119 | **0.974** |
| `lexicon/src/test/java` | 27 | 303 | 1,619 | 419 (20.6%) | 2,015 | **0.989** |
| `documentation` | 3 | 0 | 0 | 9,899 (100.0%) | 9,550 | **0.965** |
| `code-semantics-engine/src/test/resources` | 10 | 10 | 27 | 0 (0.0%) | 27 | **1.000** |
| **repository** | 581 | 10,644 | 25,164 | 74,218 (74.7%) | 97,663 | **0.983** |

The repository's own words are 99,382 occurrences of 4,029 distinct surfaces, 1,262 of them (31.3%) written exactly once. 229 glued runs no boundary divided were read by the segmenter; 1,719 occurrences across 478 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 94,215 | 94.8% | 4,511 |
| `lexicon:wordnet-sense` | 67,915 | 68.3% | 1,211 |
| `lexicon:wiktionary-topic` | 55,557 | 55.9% | 223 |
| `lexicon:wikidata-initialism` | 44,453 | 44.7% | 82 |
| `lexicon:wikidata-name` | 39,665 | 39.9% | 45 |
| `lexicon:wordnet-domain` | 39,610 | 39.9% | 118 |
| `lexicon:wiktionary-abbreviation` | 34,296 | 34.5% | 12 |
| `catalogue:query-language-function` | 1,474 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 72 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 45 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| `word's` | 45 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 35 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| `publisher's` | 28 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `extjwnl` | 26 | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| `topic's` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `file's` | 23 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| `arxiv` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| `resamples` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| `scope's` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `net's` | 21 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |

Read 581 files in 1.6 s — 2.8 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 83. Set aside as the platform's own vocabulary: 1612. Set aside as this repository's own coordinates: 526. Set aside as the toolchain a source set nothing is published from is checked with: 923. Files the parser refused: 0.

Service interfaces this tree registers providers for under the `ServiceLoader` contract: none.

Registered media types written as string literals: 6 distinct identifiers of the IANA registry, across 11 occurrences. Most written: `application/pdf` 6, `application/vnd.ms-excel` 1, `application/x-www-form-urlencoded` 1, `image/svg+xml` 1, `text/directory` 1.
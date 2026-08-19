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
| `code-semantics-engine/src/main/java` | 186 | 4,031 | 5,753 | 39,812 (87.4%) | 44,880 | **0.985** |
| `code-semantics-engine/src/test/java` | 176 | 3,418 | 11,035 | 8,330 (43.0%) | 19,199 | **0.991** |
| `lexicon-extraction/src/main/java` | 55 | 1,016 | 1,328 | 6,042 (82.0%) | 7,195 | **0.976** |
| `lexicon-extraction/src/test/java` | 44 | 494 | 2,323 | 0 (0.0%) | 2,300 | **0.990** |
| `lexicon/src/main/java` | 26 | 653 | 1,102 | 5,100 (82.2%) | 6,043 | **0.974** |
| `lexicon/src/test/java` | 26 | 299 | 1,596 | 419 (20.8%) | 1,992 | **0.989** |
| `documentation` | 3 | 0 | 0 | 9,778 (100.0%) | 9,432 | **0.965** |
| **repository** | 554 | 10,377 | 24,580 | 73,194 (74.9%) | 96,082 | **0.983** |

The repository's own words are 97,774 occurrences of 4,002 distinct surfaces, 1,254 of them (31.3%) written exactly once. 228 glued runs no boundary divided were read by the segmenter; 1,692 occurrences across 473 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 92,735 | 94.8% | 4,458 |
| `lexicon:wordnet-sense` | 66,755 | 68.3% | 1,186 |
| `lexicon:wiktionary-topic` | 54,621 | 55.9% | 221 |
| `lexicon:wikidata-initialism` | 43,712 | 44.7% | 77 |
| `lexicon:wikidata-name` | 39,047 | 39.9% | 44 |
| `lexicon:wordnet-domain` | 38,906 | 39.8% | 117 |
| `lexicon:wiktionary-abbreviation` | 33,693 | 34.5% | 10 |
| `catalogue:query-language-function` | 1,462 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 71 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 45 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| `word's` | 45 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| `permalink` | 35 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 26 | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| `topic's` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `publisher's` | 24 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `arxiv` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| `file's` | 22 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| `resamples` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| `scope's` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `net's` | 21 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |

Read 554 files in 1.7 s — 3.0 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 83. Set aside as the platform's own vocabulary: 1541. Set aside as this repository's own coordinates: 519. Set aside as the toolchain a source set nothing is published from is checked with: 896. Files the parser refused: 0.

Service interfaces this tree registers providers for under the `ServiceLoader` contract: none.
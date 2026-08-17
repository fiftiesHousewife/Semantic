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
| `code-semantics-engine/src/main/java` | 178 | 4,090 | 5,821 | 40,466 (87.4%) | 45,608 | **0.985** |
| `code-semantics-engine/src/test/java` | 163 | 3,217 | 10,261 | 9,316 (47.6%) | 19,406 | **0.991** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,158 | 5,509 (82.6%) | 6,500 | **0.975** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,936 | 0 (0.0%) | 1,915 | **0.989** |
| `lexicon/src/main/java` | 22 | 694 | 1,151 | 5,062 (81.5%) | 6,052 | **0.974** |
| `lexicon/src/test/java` | 21 | 258 | 1,363 | 489 (26.4%) | 1,830 | **0.988** |
| `documentation` | 3 | 0 | 0 | 9,562 (100.0%) | 9,241 | **0.966** |
| **repository** | 505 | 10,080 | 23,198 | 74,212 (76.2%) | 95,756 | **0.983** |

The repository's own words are 97,410 occurrences of 3,995 distinct surfaces, 1,263 of them (31.6%) written exactly once. 218 glued runs no boundary divided were read by the segmenter; 1,654 occurrences across 472 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 92,506 | 95.0% | 4,529 |
| `lexicon:wordnet-sense` | 66,164 | 67.9% | 1,138 |
| `lexicon:wiktionary-topic` | 54,484 | 55.9% | 231 |
| `lexicon:wikidata-initialism` | 43,761 | 44.9% | 71 |
| `lexicon:wikidata-name` | 38,916 | 40.0% | 42 |
| `lexicon:wordnet-domain` | 38,540 | 39.6% | 120 |
| `lexicon:wiktionary-abbreviation` | 33,764 | 34.7% | 10 |
| `catalogue:query-language-function` | 1,445 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 79 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 44 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenMass.java:5` |
| `word's` | 44 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| `wiktionary` | 38 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| `segmenter` | 35 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 29 | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 28 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| `publisher's` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `resamples` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| `topic's` | 25 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `scope's` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `xiv's` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| `arxiv` | 21 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| `net's` | 21 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |

Read 505 files in 1.5 s — 3.0 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 79. Set aside as the platform's own vocabulary: 1459. Set aside as this repository's own coordinates: 504. Set aside as the toolchain a source set nothing is published from is checked with: 814. Files the parser refused: 0.
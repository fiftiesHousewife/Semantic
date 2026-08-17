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
| `code-semantics-engine/src/main/java` | 178 | 3,771 | 5,358 | 38,120 (87.7%) | 42,861 | **0.986** |
| `code-semantics-engine/src/test/java` | 165 | 3,151 | 10,255 | 7,830 (43.3%) | 17,937 | **0.992** |
| `lexicon-extraction/src/main/java` | 45 | 879 | 1,144 | 5,206 (82.0%) | 6,189 | **0.975** |
| `lexicon-extraction/src/test/java` | 36 | 415 | 1,983 | 0 (0.0%) | 1,962 | **0.989** |
| `lexicon/src/main/java` | 22 | 674 | 1,123 | 4,768 (80.9%) | 5,735 | **0.974** |
| `lexicon/src/test/java` | 21 | 259 | 1,372 | 419 (23.4%) | 1,768 | **0.987** |
| `documentation` | 3 | 0 | 0 | 9,562 (100.0%) | 9,241 | **0.966** |
| **repository** | 508 | 9,615 | 22,672 | 69,592 (75.4%) | 90,703 | **0.983** |

The repository's own words are 92,264 occurrences of 3,883 distinct surfaces, 1,225 of them (31.5%) written exactly once. 216 glued runs no boundary divided were read by the segmenter; 1,561 occurrences across 438 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 87,586 | 94.9% | 4,274 |
| `lexicon:wordnet-sense` | 62,884 | 68.2% | 1,102 |
| `lexicon:wiktionary-topic` | 51,527 | 55.8% | 210 |
| `lexicon:wikidata-initialism` | 41,282 | 44.7% | 71 |
| `lexicon:wikidata-name` | 36,871 | 40.0% | 38 |
| `lexicon:wordnet-domain` | 36,712 | 39.8% | 119 |
| `lexicon:wiktionary-abbreviation` | 31,935 | 34.6% | 9 |
| `catalogue:query-language-function` | 1,374 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 70 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 44 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:68` |
| `word's` | 43 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| `extjwnl` | 29 | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 27 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| `javadoc` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| `topic's` | 26 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `publisher's` | 24 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| `resamples` | 22 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| `arxiv` | 21 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| `net's` | 21 | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| `scope's` | 21 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| `xiv's` | 20 | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |

Read 508 files in 1.5 s — 2.9 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 81. Set aside as the platform's own vocabulary: 1473. Set aside as this repository's own coordinates: 503. Set aside as the toolchain a source set nothing is published from is checked with: 824. Files the parser refused: 0.
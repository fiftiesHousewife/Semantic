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
| `code-semantics-engine/src/main/java` | 125 | 2,781 | 3,952 | 29,355 (88.1%) | 32,828 | **0.986** |
| `code-semantics-engine/src/test/java` | 125 | 2,580 | 7,914 | 8,051 (50.4%) | 15,821 | **0.991** |
| `lexicon-extraction/src/main/java` | 45 | 899 | 1,158 | 5,509 (82.6%) | 6,500 | **0.975** |
| `lexicon-extraction/src/test/java` | 35 | 405 | 1,936 | 0 (0.0%) | 1,915 | **0.989** |
| `lexicon/src/main/java` | 21 | 673 | 1,119 | 4,707 (80.8%) | 5,668 | **0.973** |
| `lexicon/src/test/java` | 19 | 236 | 1,241 | 489 (28.3%) | 1,708 | **0.987** |
| `documentation` | 3 | 0 | 0 | 3,951 (100.0%) | 3,837 | **0.971** |
| **repository** | 411 | 8,091 | 18,828 | 55,870 (74.8%) | 73,481 | **0.984** |

The repository's own words are 74,698 occurrences of 3,571 distinct surfaces, 1,146 of them (32.1%) written exactly once. 185 glued runs no boundary divided were read by the segmenter; 1,217 occurrences across 361 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 70,968 | 95.0% | 3,402 |
| `lexicon:wordnet-sense` | 50,934 | 68.2% | 930 |
| `lexicon:wiktionary-topic` | 42,035 | 56.3% | 177 |
| `lexicon:wikidata-initialism` | 33,679 | 45.1% | 58 |
| `lexicon:wikidata-name` | 30,012 | 40.2% | 14 |
| `lexicon:wordnet-domain` | 29,782 | 39.9% | 78 |
| `lexicon:wiktionary-abbreviation` | 26,091 | 34.9% | 5 |
| `catalogue:query-language-function` | 1,087 | 1.5% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `repository's` | 50 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| `commonest` | 42 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:8` |
| `word's` | 38 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| `segmenter` | 34 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `wiktionary` | 33 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `extjwnl` | 28 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `javadoc` | 27 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `net's` | 21 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| `scope's` | 18 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:15` |
| `file's` | 16 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| `unreadable` | 16 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| `topic's` | 15 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:41` |
| `xiv's` | 15 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |

Read 411 files in 0.2 s — 0.5 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 63. Set aside as the platform's own vocabulary: 1195. Set aside as this repository's own coordinates: 356. Set aside as the toolchain a source set nothing is published from is checked with: 660. Files the parser refused: 0.
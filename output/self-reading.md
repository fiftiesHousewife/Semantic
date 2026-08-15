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
| `code-semantics-api/src/main/java` | 24 | 361 | 613 | 3,379 (84.6%) | 3,944 | **0.988** |
| `code-semantics-api/src/test/java` | 13 | 215 | 1,241 | 102 (7.6%) | 1,280 | **0.953** |
| `code-semantics-engine/src/main/java` | 111 | 2,609 | 4,010 | 27,428 (87.2%) | 31,252 | **0.994** |
| `code-semantics-engine/src/test/java` | 112 | 2,818 | 9,921 | 7,745 (43.8%) | 17,192 | **0.973** |
| `lexicon-extraction/src/main/java` | 45 | 943 | 1,300 | 5,704 (81.4%) | 6,916 | **0.987** |
| `lexicon-extraction/src/test/java` | 35 | 556 | 2,830 | 0 (0.0%) | 2,694 | **0.952** |
| `lexicon/src/main/java` | 21 | 689 | 1,173 | 4,749 (80.2%) | 5,835 | **0.985** |
| `lexicon/src/test/java` | 19 | 314 | 1,652 | 501 (23.3%) | 2,072 | **0.962** |
| `documentation` | 3 | 0 | 0 | 3,874 (100.0%) | 3,795 | **0.980** |
| **repository** | 383 | 8,505 | 22,740 | 53,482 (70.2%) | 74,980 | **0.984** |

The repository's own words are 76,222 occurrences of 3,396 distinct surfaces, 1,063 of them (31.3%) written exactly once. 568 glued runs no boundary divided were read by the segmenter; 1,242 occurrences across 199 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 72,070 | 94.6% | 3,181 |
| `lexicon:wordnet-sense` | 52,384 | 68.7% | 830 |
| `lexicon:wiktionary-topic` | 43,569 | 57.2% | 175 |
| `lexicon:wikidata-initialism` | 34,325 | 45.0% | 62 |
| `lexicon:wordnet-domain` | 32,024 | 42.0% | 73 |
| `lexicon:wikidata-name` | 30,945 | 40.6% | 17 |
| `lexicon:wiktionary-abbreviation` | 27,997 | 36.7% | 1 |
| `catalogue:query-language-function` | 1,009 | 1.3% | 1 |

| Word | Occurrences | First seen |
|---|--:|---|
| `junit` | 313 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:8` |
| `assertj` | 187 | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:10` |
| `j2html` | 109 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:3` |
| `commonest` | 39 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:8` |
| `extjwnl` | 39 | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| `wiktionary` | 36 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| `javadoc` | 31 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| `permalink` | 28 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| `segmenter` | 21 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| `arxiv` | 20 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| `unreadable` | 16 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:36` |
| `resamples` | 14 | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| `wikidata` | 14 | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| `wiktextract` | 12 | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| `fasterxml` | 9 | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReadingDiagnostic.java:7` |

Read 383 files in 0.2 s — 0.5 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 682. Set aside as the platform's own vocabulary: 1127. Set aside as this repository's own coordinates: 317. Files the parser refused: 0.
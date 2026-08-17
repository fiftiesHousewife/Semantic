# Terms — CodeSemantics

Does this repository write the vocabulary of a published field? The Ontologies of Linguistic
Annotation state 1,197 terms whose names are already identifiers, so the match is identifier to
identifier with no English in between: OLiA's `AdjectivePhrase` and this repository's
`adjectivePhrase` read as the same two words, and a hit is the ontology saying this is a term of
its field rather than anyone here deciding so.

Only **declared names** are read. A term in a sentence is an author writing about a field; a term
in a name is a program working in one.

**What is reported below is the corroborated reading.** A term written in one word counts only
where this repository writes another concept in the branch the publisher placed that concept
under; a term written in more than one word counts unconditionally. The reading that admits every
match is kept at the end, beside the list of what the branch refused, because a rule that removes
matches can only be judged as a comparison.

**OLiA** publishes **1,311 concepts** in a hierarchy 9 rungs deep. This repository writes **66 of them, 1,188 times**, across 332 of 512 files — reaching **12 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `LinguisticConcept` | 15 | 136 | 482 | `Source` 175 `Set` 78 `Means` 34 `Document` 33 `Evidence` 31 `Given` 29 `Heading` 20 `Citation` 19 |
| `MorphosyntacticCategory` | 13 | 288 | 163 | `Verb` 41 `Noun` 39 `Abbreviation` 21 `Symbol` 17 `Residual` 11 `Initialism` 10 `Foreign` 8 `Adjective` 6 |
| `MorphologicalCategory` | 5 | 16 | 159 | `Root` 122 `Suffix` 16 `Prefix` 15 `Stem` 5 `Affix` 1 |
| `OrthographicEntity` | 4 | 37 | 143 | `Token` 87 `Text` 40 `Script` 14 `String` 2 |
| `Constituent` | 4 | 37 | 79 | `Phrase` 61 `Fragment` 9 `Clause` 7 `Chunk` 2 |
| `SemanticFeature` | 5 | 125 | 73 | `Function` 50 `Time` 9 `Amount` 8 `Plan` 4 `Object` 2 |
| `Relation` | 8 | 203 | 57 | `Definition` 18 `Comparison` 9 `Consequence` 9 `Evaluation` 8 `Expansion` 8 `Attribution` 3 `Exception` 1 `Extra` 1 |
| `CoordTypeFeature` | 2 | 5 | 11 | `Initial` 8 `Simple` 3 |
| `NumberFeature` | 3 | 11 | 7 | `Plural` 4 `Singular` 2 `Trial` 1 |
| `DegreeFeature` | 3 | 5 | 5 | `Positive` 3 `Comparative` 1 `Superlative` 1 |
| `InflectionTypeFeature` | 2 | 9 | 5 | `Inflected` 3 `BaseForm` 2 |
| `PersonFeature` | 2 | 10 | 4 | `Third` 3 `Second` 1 |

## Matches per normalisation

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 895 | 53 | 97.7% |
| the dictionary form of each word | 173 | 36 | 99.4% |
| the sense the dictionary carries each word in | 120 | 20 | 99.2% |

## Refused as the type written beside the name

**82 spans** repeated the declared type and nothing else. The words stay in the name — removing one would close a gap between two words the author never wrote next to each other — and only the match is refused.

| Term | Spans refused |
|---|--:|
| `source` | 18 |
| `citations` | 14 |
| `comparison` | 9 |
| `origin` | 6 |
| `phrases` | 5 |
| `initialisms` | 4 |
| `sets` | 4 |
| `foreign` | 3 |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 2,029 | 174 | 98.9% | 22 of 70 | `topic` 199 |
| only where the branch holds more than this one concept | 1,188 | 109 | 98.1% | 12 of 70 | `source` 152 |

### What the branch refused

**65 terms**, most-written first, each of them the one concept this repository writes in the region of the field its publisher placed it in.

| Term | Times | Stood alone under |
|---|--:|---|
| `topic` | 199 | `PragmaticUnit` |
| `topics` | 88 | `PragmaticUnit` |
| `subject` | 75 | `PragmaticUnit` |
| `first` | 65 | `PersonFeature` |
| `subjects` | 31 | `PragmaticUnit` |
| `second` | 27 | `PersonFeature` |
| `set` | 26 | `PartWhole` |
| `other` | 25 | `SameType` |
| `identifier` | 23 | `DiscourseEntity` |
| `place` | 23 | `PartWhole` |
| `cited` | 20 | `Referentiality` |
| `theme` | 19 | `PragmaticUnit` |
| `letter` | 14 | `Character` |
| `citation` | 13 | `TextStructuralUnit` |
| `space` | 13 | `GraphicalSeparator` |
| `summary` | 13 | `Generalization` |
| `list` | 12 | `Conjunction` |
| `themes` | 12 | `PragmaticUnit` |
| `support` | 11 | `HypotacticDiscourseRelation` |
| `collocations` | 9 | `SemanticUnit` |

## Whether the depth the publisher states separates the match

Depth is read off the source's own edges and is a citation rather than a heuristic: the publisher stated every one of them, and a rung count is what they add up to. It is bounded by the deepest chain the source states — 9 rungs here — so a shallow taxonomy and a deep one are read on one scale without a level count being chosen.

| Rungs below the root | Concepts written | Times | Share of spans |
|--:|--:|--:|--:|
| 0 | 0 | 0 | 0.0% |
| 1 | 25 | 353 | 29.7% |
| 2 | 19 | 490 | 41.2% |
| 3 | 8 | 124 | 10.4% |
| 4 | 9 | 154 | 13.0% |
| 5 | 2 | 32 | 2.7% |
| 6 | 3 | 35 | 2.9% |

| Admitted | Concepts | Times | Mean rungs per concept | Mean rungs per span |
|---|--:|--:|--:|--:|
| what the branch admitted | 66 | 1,188 | 2.29 | 2.27 |
| what the branch refused | 38 | 749 | 3.05 | 2.22 |

The deepest of what was written: `Consequence` 6 rungs, 9 `Definition` 6 rungs, 18 `Evaluation` 6 rungs, 8 `Evidence` 5 rungs, 31 `Exception` 5 rungs, 1 `Active` 4 rungs, 1 `Attribution` 4 rungs, 3 `Comparison` 4 rungs, 9.

The shallowest: `Verb` 1 rung, 41 `Trial` 1 rung, 1 `Token` 1 rung, 87 `Third` 1 rung, 3 `Text` 1 rung, 40 `Superlative` 1 rung, 1 `String` 1 rung, 2 `Singular` 1 rung, 2.

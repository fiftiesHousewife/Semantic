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

**OLiA** publishes **1,311 concepts** in a hierarchy nine levels deep. This repository writes **67 of them, 1,365 times**, across 337 of 450 files — reaching **12 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `LinguisticConcept` | 15 | 136 | 572 | `Source` 189 `Set` 119 `Citation` 48 `Document` 33 `Means` 33 `Evidence` 32 `Given` 25 `PartOf` 21 |
| `MorphosyntacticCategory` | 13 | 288 | 170 | `Verb` 42 `Noun` 39 `Abbreviation` 23 `Symbol` 17 `Foreign` 12 `Initialism` 11 `Residual` 11 `Adjective` 6 |
| `MorphologicalCategory` | 5 | 16 | 143 | `Root` 106 `Suffix` 16 `Prefix` 15 `Stem` 5 `Affix` 1 |
| `OrthographicEntity` | 4 | 37 | 142 | `Token` 87 `Text` 36 `Script` 16 `String` 3 |
| `PersonFeature` | 3 | 10 | 92 | `First` 66 `Second` 25 `Third` 1 |
| `Constituent` | 4 | 37 | 87 | `Phrase` 69 `Fragment` 9 `Clause` 7 `Chunk` 2 |
| `Relation` | 8 | 203 | 67 | `Definition` 18 `Comparison` 16 `Consequence` 10 `Expansion` 10 `Evaluation` 8 `Attribution` 3 `Exception` 1 `Extra` 1 |
| `SemanticFeature` | 5 | 125 | 61 | `Function` 36 `Time` 10 `Amount` 7 `Object` 4 `Plan` 4 |
| `CoordTypeFeature` | 2 | 5 | 14 | `Initial` 11 `Simple` 3 |
| `NumberFeature` | 3 | 11 | 7 | `Plural` 4 `Singular` 2 `Trial` 1 |
| `DegreeFeature` | 3 | 5 | 5 | `Positive` 3 `Comparative` 1 `Superlative` 1 |
| `InflectionTypeFeature` | 2 | 9 | 5 | `Inflected` 3 `BaseForm` 2 |

## Matches per normalisation

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 1,024 | 59 | 97.8% |
| the dictionary form of each word | 204 | 35 | 99.5% |
| the sense the dictionary carries each word in | 137 | 21 | 99.3% |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 2,117 | 171 | 98.8% | 22 of 70 | `topic` 197 |
| only where the branch holds more than this one concept | 1,365 | 115 | 98.2% | 12 of 70 | `source` 154 |

### What the branch refused

**56 terms**, most-written first, each of them the one concept this repository writes in the region of the field its publisher placed it in.

| Term | Times | Stood alone under |
|---|--:|---|
| `topic` | 197 | `PragmaticUnit` |
| `topics` | 108 | `PragmaticUnit` |
| `subject` | 70 | `PragmaticUnit` |
| `themes` | 53 | `PragmaticUnit` |
| `summary` | 36 | `Generalization` |
| `cited` | 29 | `Referentiality` |
| `subjects` | 29 | `PragmaticUnit` |
| `other` | 23 | `SameType` |
| `identifier` | 22 | `DiscourseEntity` |
| `theme` | 19 | `PragmaticUnit` |
| `letter` | 13 | `Character` |
| `list` | 11 | `Conjunction` |
| `space` | 11 | `GraphicalSeparator` |
| `control` | 10 | `MovementFeature` |
| `head` | 10 | `SyntacticRole` |
| `collocations` | 9 | `SemanticUnit` |
| `cite` | 7 | `Referentiality` |
| `cites` | 7 | `Referentiality` |
| `person` | 7 | `AnimateEntity` |
| `fraction` | 6 | `Numeral` |

## Whether the depth the publisher states separates the match

Depth is read off the source's own edges and is a citation rather than a heuristic: the publisher stated every one of them, and a rung count is what they add up to. It is bounded by the deepest chain the source states — 9 rungs here — so a shallow taxonomy and a deep one are read on one scale without a level count being chosen.

| Rungs below the root | Concepts written | Times | Share of spans |
|--:|--:|--:|--:|
| 0 | 0 | 0 | 0.0% |
| 1 | 26 | 452 | 33.1% |
| 2 | 18 | 516 | 37.8% |
| 3 | 9 | 111 | 8.1% |
| 4 | 9 | 217 | 15.9% |
| 5 | 2 | 33 | 2.4% |
| 6 | 3 | 36 | 2.6% |

| Admitted | Concepts | Times | Mean rungs per concept | Mean rungs per span |
|---|--:|--:|--:|--:|
| what the branch admitted | 67 | 1,365 | 2.28 | 2.25 |
| what the branch refused | 35 | 762 | 3.00 | 2.43 |

The deepest of what was written: `Consequence` 6 rungs, 10 `Definition` 6 rungs, 18 `Evaluation` 6 rungs, 8 `Evidence` 5 rungs, 32 `Exception` 5 rungs, 1 `Active` 4 rungs, 2 `Attribution` 4 rungs, 3 `Comparison` 4 rungs, 16.

The shallowest: `Verb` 1 rung, 42 `Trial` 1 rung, 1 `Token` 1 rung, 87 `Third` 1 rung, 1 `Text` 1 rung, 36 `Superlative` 1 rung, 1 `String` 1 rung, 3 `Singular` 1 rung, 2.

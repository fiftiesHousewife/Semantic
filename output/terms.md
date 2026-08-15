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

**OLiA** publishes **1,311 concepts** in a hierarchy nine levels deep. This repository writes **56 of them, 1,182 times**, across 290 of 380 files — reaching **11 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `LinguisticConcept` | 15 | 136 | 495 | `Source`&nbsp;169 `Set`&nbsp;82 `Citation`&nbsp;46 `Evidence`&nbsp;32 `Means`&nbsp;31 `Document`&nbsp;26 `Given`&nbsp;22 `PartOf`&nbsp;21 |
| `MorphosyntacticCategory` | 10 | 288 | 147 | `Verb`&nbsp;33 `Noun`&nbsp;31 `Abbreviation`&nbsp;23 `Symbol`&nbsp;19 `Foreign`&nbsp;12 `Initialism`&nbsp;11 `Residual`&nbsp;11 `Acronym`&nbsp;4 |
| `OrthographicEntity` | 4 | 37 | 134 | `Token`&nbsp;83 `Text`&nbsp;32 `Script`&nbsp;17 `String`&nbsp;2 |
| `MorphologicalCategory` | 5 | 16 | 129 | `Root`&nbsp;97 `Prefix`&nbsp;15 `Suffix`&nbsp;11 `Stem`&nbsp;5 `Affix`&nbsp;1 |
| `Constituent` | 4 | 37 | 85 | `Phrase`&nbsp;67 `Fragment`&nbsp;9 `Clause`&nbsp;7 `Chunk`&nbsp;2 |
| `PersonFeature` | 2 | 10 | 75 | `First`&nbsp;53 `Second`&nbsp;22 |
| `SemanticFeature` | 5 | 125 | 52 | `Function`&nbsp;34 `Amount`&nbsp;7 `Object`&nbsp;4 `Time`&nbsp;4 `Plan`&nbsp;3 |
| `Relation` | 5 | 203 | 40 | `Comparison`&nbsp;16 `Consequence`&nbsp;10 `Expansion`&nbsp;10 `Attribution`&nbsp;3 `Extra`&nbsp;1 |
| `SemanticUnit` | 1 | 12 | 14 | `Collocation`&nbsp;14 |
| `NumberFeature` | 3 | 11 | 7 | `Plural`&nbsp;4 `Singular`&nbsp;2 `Trial`&nbsp;1 |
| `InflectionTypeFeature` | 2 | 9 | 4 | `BaseForm`&nbsp;2 `Inflected`&nbsp;2 |

## How the two sides were made to meet

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 891 | 52 | 96.9% |
| the dictionary form of each word | 180 | 32 | 94.4% |
| the sense the dictionary carries each word in | 111 | 19 | 100.0% |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 1,978 | 153 | 98.1% | 20 of 70 | `topic`&nbsp;187 |
| only where the branch holds more than this one concept | 1,182 | 103 | 96.8% | 11 of 70 | `source`&nbsp;134 |

### What the branch refused

**50 terms**, most-written first, each of them the one concept this repository writes in the region of the field its publisher placed it in.

| Term | Times | Stood alone under |
|---|--:|---|
| `topic` | 187 | `PragmaticUnit` |
| `theme` | 108 | `PragmaticUnit` |
| `topics` | 104 | `PragmaticUnit` |
| `subject` | 65 | `PragmaticUnit` |
| `themes` | 40 | `PragmaticUnit` |
| `summary` | 31 | `Generalization` |
| `cited` | 29 | `Referentiality` |
| `subjects` | 27 | `PragmaticUnit` |
| `head` | 25 | `SyntacticRole` |
| `identifier` | 21 | `DiscourseEntity` |
| `other` | 20 | `SameType` |
| `definition` | 16 | `Assessment` |
| `space` | 11 | `GraphicalSeparator` |
| `control` | 10 | `MovementFeature` |
| `letter` | 10 | `Character` |
| `list` | 8 | `Conjunction` |
| `cites` | 7 | `Referentiality` |
| `person` | 7 | `AnimateEntity` |
| `cite` | 6 | `Referentiality` |
| `citing` | 5 | `Referentiality` |

## Whether the depth the publisher states separates the match

Depth is read off the source's own edges and is a citation rather than a heuristic: the publisher stated every one of them, and a rung count is what they add up to. It is bounded by the deepest chain the source states — 9 rungs here — so a shallow taxonomy and a deep one are read on one scale without a level count being chosen.

| Rungs below the root | Concepts written | Times | Share of spans |
|--:|--:|--:|--:|
| 0 | 0 | 0 | 0.0% |
| 1 | 20 | 396 | 33.5% |
| 2 | 18 | 469 | 39.7% |
| 3 | 7 | 98 | 8.3% |
| 4 | 9 | 177 | 15.0% |
| 5 | 1 | 32 | 2.7% |
| 6 | 1 | 10 | 0.8% |

| Admitted | Concepts | Times | Mean rungs per concept | Mean rungs per span |
|---|--:|--:|--:|--:|
| what the branch admitted | 56 | 1,182 | 2.21 | 2.16 |
| what the branch refused | 32 | 806 | 3.22 | 2.44 |

The deepest of what was written: `Consequence`&nbsp;6&nbsp;rungs,&nbsp;10 `Evidence`&nbsp;5&nbsp;rungs,&nbsp;32 `Active`&nbsp;4&nbsp;rungs,&nbsp;2 `Attribution`&nbsp;4&nbsp;rungs,&nbsp;3 `Comparison`&nbsp;4&nbsp;rungs,&nbsp;16 `Expansion`&nbsp;4&nbsp;rungs,&nbsp;10 `Extra`&nbsp;4&nbsp;rungs,&nbsp;1 `Means`&nbsp;4&nbsp;rungs,&nbsp;31.

The shallowest: `Verb`&nbsp;1&nbsp;rung,&nbsp;33 `Trial`&nbsp;1&nbsp;rung,&nbsp;1 `Token`&nbsp;1&nbsp;rung,&nbsp;83 `Text`&nbsp;1&nbsp;rung,&nbsp;32 `String`&nbsp;1&nbsp;rung,&nbsp;2 `Singular`&nbsp;1&nbsp;rung,&nbsp;2 `Second`&nbsp;1&nbsp;rung,&nbsp;22 `Script`&nbsp;1&nbsp;rung,&nbsp;17.

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

**OLiA** publishes **1,311 concepts** in a hierarchy nine levels deep. This repository writes **65 of them, 1,266 times**, across 311 of 416 files — reaching **12 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `LinguisticConcept` | 15 | 136 | 529 | `Source`&nbsp;180 `Set`&nbsp;95 `Citation`&nbsp;46 `Evidence`&nbsp;32 `Means`&nbsp;32 `Document`&nbsp;30 `Given`&nbsp;24 `PartOf`&nbsp;21 |
| `MorphosyntacticCategory` | 13 | 288 | 168 | `Verb`&nbsp;41 `Noun`&nbsp;38 `Abbreviation`&nbsp;23 `Symbol`&nbsp;17 `Foreign`&nbsp;12 `Initialism`&nbsp;11 `Residual`&nbsp;11 `Adjective`&nbsp;6 |
| `OrthographicEntity` | 4 | 37 | 139 | `Token`&nbsp;87 `Text`&nbsp;33 `Script`&nbsp;17 `String`&nbsp;2 |
| `MorphologicalCategory` | 5 | 16 | 137 | `Root`&nbsp;102 `Prefix`&nbsp;15 `Suffix`&nbsp;14 `Stem`&nbsp;5 `Affix`&nbsp;1 |
| `Constituent` | 4 | 37 | 87 | `Phrase`&nbsp;69 `Fragment`&nbsp;9 `Clause`&nbsp;7 `Chunk`&nbsp;2 |
| `PersonFeature` | 3 | 10 | 85 | `First`&nbsp;59 `Second`&nbsp;25 `Third`&nbsp;1 |
| `SemanticFeature` | 5 | 125 | 60 | `Function`&nbsp;36 `Time`&nbsp;9 `Amount`&nbsp;7 `Object`&nbsp;4 `Plan`&nbsp;4 |
| `Relation` | 6 | 203 | 41 | `Comparison`&nbsp;16 `Consequence`&nbsp;10 `Expansion`&nbsp;10 `Attribution`&nbsp;3 `Exception`&nbsp;1 `Extra`&nbsp;1 |
| `NumberFeature` | 3 | 11 | 7 | `Plural`&nbsp;4 `Singular`&nbsp;2 `Trial`&nbsp;1 |
| `DegreeFeature` | 3 | 5 | 5 | `Positive`&nbsp;3 `Comparative`&nbsp;1 `Superlative`&nbsp;1 |
| `InflectionTypeFeature` | 2 | 9 | 5 | `Inflected`&nbsp;3 `BaseForm`&nbsp;2 |
| `CoordTypeFeature` | 2 | 5 | 3 | `Initial`&nbsp;2 `Simple`&nbsp;1 |

## How the two sides were made to meet

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 952 | 57 | 97.6% |
| the dictionary form of each word | 190 | 33 | 99.5% |
| the sense the dictionary carries each word in | 124 | 21 | 99.2% |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 1,986 | 167 | 98.7% | 22 of 70 | `topic`&nbsp;187 |
| only where the branch holds more than this one concept | 1,266 | 111 | 98.0% | 12 of 70 | `source`&nbsp;145 |

### What the branch refused

**56 terms**, most-written first, each of them the one concept this repository writes in the region of the field its publisher placed it in.

| Term | Times | Stood alone under |
|---|--:|---|
| `topic` | 187 | `PragmaticUnit` |
| `topics` | 105 | `PragmaticUnit` |
| `subject` | 65 | `PragmaticUnit` |
| `themes` | 40 | `PragmaticUnit` |
| `cited` | 29 | `Referentiality` |
| `subjects` | 27 | `PragmaticUnit` |
| `other` | 23 | `SameType` |
| `summary` | 23 | `Generalization` |
| `identifier` | 22 | `DiscourseEntity` |
| `theme` | 21 | `PragmaticUnit` |
| `definition` | 16 | `Assessment` |
| `space` | 13 | `GraphicalSeparator` |
| `letter` | 11 | `Character` |
| `list` | 11 | `Conjunction` |
| `control` | 10 | `MovementFeature` |
| `collocations` | 9 | `SemanticUnit` |
| `head` | 9 | `SyntacticRole` |
| `cite` | 7 | `Referentiality` |
| `cites` | 7 | `Referentiality` |
| `person` | 7 | `AnimateEntity` |

## Whether the depth the publisher states separates the match

Depth is read off the source's own edges and is a citation rather than a heuristic: the publisher stated every one of them, and a rung count is what they add up to. It is bounded by the deepest chain the source states — 9 rungs here — so a shallow taxonomy and a deep one are read on one scale without a level count being chosen.

| Rungs below the root | Concepts written | Times | Share of spans |
|--:|--:|--:|--:|
| 0 | 0 | 0 | 0.0% |
| 1 | 26 | 429 | 33.9% |
| 2 | 18 | 495 | 39.1% |
| 3 | 9 | 107 | 8.5% |
| 4 | 9 | 192 | 15.2% |
| 5 | 2 | 33 | 2.6% |
| 6 | 1 | 10 | 0.8% |

| Admitted | Concepts | Times | Mean rungs per concept | Mean rungs per span |
|---|--:|--:|--:|--:|
| what the branch admitted | 65 | 1,266 | 2.17 | 2.16 |
| what the branch refused | 34 | 730 | 3.06 | 2.45 |

The deepest of what was written: `Consequence`&nbsp;6&nbsp;rungs,&nbsp;10 `Evidence`&nbsp;5&nbsp;rungs,&nbsp;32 `Exception`&nbsp;5&nbsp;rungs,&nbsp;1 `Active`&nbsp;4&nbsp;rungs,&nbsp;2 `Attribution`&nbsp;4&nbsp;rungs,&nbsp;3 `Comparison`&nbsp;4&nbsp;rungs,&nbsp;16 `Expansion`&nbsp;4&nbsp;rungs,&nbsp;10 `Extra`&nbsp;4&nbsp;rungs,&nbsp;1.

The shallowest: `Verb`&nbsp;1&nbsp;rung,&nbsp;41 `Trial`&nbsp;1&nbsp;rung,&nbsp;1 `Token`&nbsp;1&nbsp;rung,&nbsp;87 `Third`&nbsp;1&nbsp;rung,&nbsp;1 `Text`&nbsp;1&nbsp;rung,&nbsp;33 `Superlative`&nbsp;1&nbsp;rung,&nbsp;1 `String`&nbsp;1&nbsp;rung,&nbsp;2 `Singular`&nbsp;1&nbsp;rung,&nbsp;2.

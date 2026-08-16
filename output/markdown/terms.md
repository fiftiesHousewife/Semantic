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

**OLiA** publishes **1,311 concepts** in a hierarchy nine levels deep. This repository writes **68 of them, 1,323 times**, across 336 of 475 files — reaching **12 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `LinguisticConcept` | 16 | 136 | 538 | `Source` 164 `Set` 117 `Citation` 34 `Means` 33 `Document` 32 `Evidence` 31 `Given` 26 `PartOf` 21 |
| `MorphosyntacticCategory` | 13 | 288 | 162 | `Verb` 42 `Noun` 39 `Abbreviation` 21 `Symbol` 17 `Residual` 11 `Initialism` 9 `Foreign` 8 `Adjective` 6 |
| `MorphologicalCategory` | 5 | 16 | 150 | `Root` 113 `Suffix` 16 `Prefix` 15 `Stem` 5 `Affix` 1 |
| `OrthographicEntity` | 4 | 37 | 142 | `Token` 87 `Text` 39 `Script` 14 `String` 2 |
| `PersonFeature` | 3 | 10 | 97 | `First` 67 `Second` 27 `Third` 3 |
| `Constituent` | 4 | 37 | 84 | `Phrase` 66 `Fragment` 9 `Clause` 7 `Chunk` 2 |
| `Relation` | 8 | 203 | 62 | `Definition` 20 `Comparison` 10 `Expansion` 10 `Consequence` 9 `Evaluation` 8 `Attribution` 3 `Exception` 1 `Extra` 1 |
| `SemanticFeature` | 5 | 125 | 60 | `Function` 34 `Time` 11 `Amount` 8 `Plan` 4 `Object` 3 |
| `CoordTypeFeature` | 2 | 5 | 11 | `Initial` 8 `Simple` 3 |
| `NumberFeature` | 3 | 11 | 7 | `Plural` 4 `Singular` 2 `Trial` 1 |
| `DegreeFeature` | 3 | 5 | 5 | `Positive` 3 `Comparative` 1 `Superlative` 1 |
| `InflectionTypeFeature` | 2 | 9 | 5 | `Inflected` 3 `BaseForm` 2 |

## Matches per normalisation

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 1,012 | 60 | 97.7% |
| the dictionary form of each word | 176 | 35 | 99.4% |
| the sense the dictionary carries each word in | 135 | 21 | 99.3% |

## Refused as the type written beside the name

**91 spans** repeated the declared type and nothing else. The words stay in the name — removing one would close a gap between two words the author never wrote next to each other — and only the match is refused.

| Term | Spans refused |
|---|--:|
| `source` | 25 |
| `citations` | 14 |
| `comparison` | 7 |
| `origin` | 6 |
| `phrases` | 5 |
| `set` | 5 |
| `foreign` | 4 |
| `sets` | 4 |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 2,016 | 173 | 98.8% | 22 of 70 | `topic` 211 |
| only where the branch holds more than this one concept | 1,323 | 116 | 98.1% | 12 of 70 | `source` 138 |

### What the branch refused

**57 terms**, most-written first, each of them the one concept this repository writes in the region of the field its publisher placed it in.

| Term | Times | Stood alone under |
|---|--:|---|
| `topic` | 211 | `PragmaticUnit` |
| `topics` | 93 | `PragmaticUnit` |
| `subject` | 78 | `PragmaticUnit` |
| `subjects` | 33 | `PragmaticUnit` |
| `other` | 24 | `SameType` |
| `identifier` | 22 | `DiscourseEntity` |
| `theme` | 19 | `PragmaticUnit` |
| `cited` | 17 | `Referentiality` |
| `themes` | 15 | `PragmaticUnit` |
| `letter` | 13 | `Character` |
| `summary` | 13 | `Generalization` |
| `space` | 12 | `GraphicalSeparator` |
| `list` | 11 | `Conjunction` |
| `head` | 10 | `SyntacticRole` |
| `collocations` | 9 | `SemanticUnit` |
| `fraction` | 9 | `Numeral` |
| `cite` | 7 | `Referentiality` |
| `cites` | 7 | `Referentiality` |
| `person` | 7 | `AnimateEntity` |
| `control` | 6 | `MovementFeature` |

## Whether the depth the publisher states separates the match

Depth is read off the source's own edges and is a citation rather than a heuristic: the publisher stated every one of them, and a rung count is what they add up to. It is bounded by the deepest chain the source states — 9 rungs here — so a shallow taxonomy and a deep one are read on one scale without a level count being chosen.

| Rungs below the root | Concepts written | Times | Share of spans |
|--:|--:|--:|--:|
| 0 | 0 | 0 | 0.0% |
| 1 | 26 | 451 | 34.1% |
| 2 | 19 | 487 | 36.8% |
| 3 | 9 | 107 | 8.1% |
| 4 | 9 | 209 | 15.8% |
| 5 | 2 | 32 | 2.4% |
| 6 | 3 | 37 | 2.8% |

| Admitted | Concepts | Times | Mean rungs per concept | Mean rungs per span |
|---|--:|--:|--:|--:|
| what the branch admitted | 68 | 1,323 | 2.28 | 2.24 |
| what the branch refused | 36 | 702 | 3.11 | 2.33 |

The deepest of what was written: `Consequence` 6 rungs, 9 `Definition` 6 rungs, 20 `Evaluation` 6 rungs, 8 `Evidence` 5 rungs, 31 `Exception` 5 rungs, 1 `Active` 4 rungs, 2 `Attribution` 4 rungs, 3 `Comparison` 4 rungs, 10.

The shallowest: `Verb` 1 rung, 42 `Trial` 1 rung, 1 `Token` 1 rung, 87 `Third` 1 rung, 3 `Text` 1 rung, 39 `Superlative` 1 rung, 1 `String` 1 rung, 2 `Singular` 1 rung, 2.

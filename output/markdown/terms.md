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

**OLiA** publishes **1,311 concepts** in a hierarchy 9 rungs deep. This repository writes **73 of them, 1,258 times**, across 356 of 550 files — reaching **14 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `LinguisticConcept` | 16 | 136 | 499 | `Source` 185 `Set` 79 `Document` 34 `Means` 34 `Evidence` 32 `Given` 30 `Heading` 22 `Sentence` 20 |
| `MorphologicalCategory` | 5 | 16 | 166 | `Root` 125 `Prefix` 18 `Suffix` 17 `Stem` 5 `Affix` 1 |
| `MorphosyntacticCategory` | 14 | 288 | 162 | `Verb` 41 `Noun` 37 `Abbreviation` 21 `Symbol` 17 `Initialism` 11 `Residual` 11 `Foreign` 8 `Acronym` 5 |
| `OrthographicEntity` | 4 | 37 | 150 | `Token` 91 `Text` 43 `Script` 14 `String` 2 |
| `Constituent` | 5 | 37 | 90 | `Phrase` 66 `Clause` 12 `Fragment` 9 `Chunk` 2 `VerbPhrase` 1 |
| `SemanticFeature` | 5 | 125 | 81 | `Function` 51 `Time` 12 `Amount` 8 `Object` 6 `Plan` 4 |
| `Relation` | 9 | 203 | 62 | `Definition` 21 `Comparison` 9 `Consequence` 9 `Expansion` 9 `Evaluation` 8 `Attribution` 3 `Alternative` 1 `Exception` 1 |
| `SyntacticRole` | 2 | 33 | 13 | `Head` 10 `Predicate` 3 |
| `CoordTypeFeature` | 2 | 5 | 11 | `Initial` 8 `Simple` 3 |
| `NumberFeature` | 3 | 11 | 7 | `Plural` 4 `Singular` 2 `Trial` 1 |
| `InflectionTypeFeature` | 2 | 9 | 6 | `Inflected` 4 `BaseForm` 2 |
| `DegreeFeature` | 3 | 5 | 5 | `Positive` 3 `Comparative` 1 `Superlative` 1 |

## Matches per normalisation

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 952 | 60 | 97.6% |
| the dictionary form of each word | 184 | 40 | 99.5% |
| the sense the dictionary carries each word in | 122 | 20 | 99.2% |

## Refused as the type written beside the name

**9 spans** repeated the declared type and nothing else. The words stay in the name — removing one would close a gap between two words the author never wrote next to each other — and only the match is refused.

| Term | Spans refused |
|---|--:|
| `source` | 5 |
| `script` | 2 |
| `foreign` | 1 |
| `origin` | 1 |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 2,167 | 188 | 98.8% | 22 of 70 | `topic` 218 |
| only where the branch holds more than this one concept | 1,258 | 120 | 98.0% | 14 of 70 | `source` 162 |

### What the branch refused

**68 terms**, most-written first, each of them the one concept this repository writes in the region of the field its publisher placed it in.

| Term | Times | Stood alone under |
|---|--:|---|
| `topic` | 218 | `PragmaticUnit` |
| `topics` | 96 | `PragmaticUnit` |
| `subject` | 79 | `PragmaticUnit` |
| `first` | 67 | `PersonFeature` |
| `subjects` | 31 | `PragmaticUnit` |
| `set` | 30 | `PartWhole` |
| `second` | 29 | `PersonFeature` |
| `other` | 27 | `SameType` |
| `identifier` | 23 | `DiscourseEntity` |
| `place` | 23 | `PartWhole` |
| `cited` | 20 | `Referentiality` |
| `theme` | 19 | `PragmaticUnit` |
| `letter` | 16 | `Character` |
| `citation` | 14 | `TextStructuralUnit` |
| `list` | 14 | `Conjunction` |
| `space` | 13 | `GraphicalSeparator` |
| `summary` | 13 | `Generalization` |
| `themes` | 12 | `PragmaticUnit` |
| `support` | 11 | `HypotacticDiscourseRelation` |
| `cite` | 9 | `Referentiality` |

## Whether the depth the publisher states separates the match

Depth is read off the source's own edges and is a citation rather than a heuristic: the publisher stated every one of them, and a rung count is what they add up to. It is bounded by the deepest chain the source states — 9 rungs here — so a shallow taxonomy and a deep one are read on one scale without a level count being chosen.

| Rungs below the root | Concepts written | Times | Share of spans |
|--:|--:|--:|--:|
| 0 | 0 | 0 | 0.0% |
| 1 | 27 | 381 | 30.3% |
| 2 | 23 | 514 | 40.9% |
| 3 | 8 | 136 | 10.8% |
| 4 | 9 | 155 | 12.3% |
| 5 | 3 | 34 | 2.7% |
| 6 | 3 | 38 | 3.0% |

| Admitted | Concepts | Times | Mean rungs per concept | Mean rungs per span |
|---|--:|--:|--:|--:|
| what the branch admitted | 73 | 1,258 | 2.27 | 2.25 |
| what the branch refused | 40 | 810 | 3.10 | 2.31 |

The deepest of what was written: `Consequence` 6 rungs, 9 `Definition` 6 rungs, 21 `Evaluation` 6 rungs, 8 `Alternative` 5 rungs, 1 `Evidence` 5 rungs, 32 `Exception` 5 rungs, 1 `Active` 4 rungs, 1 `Attribution` 4 rungs, 3.

The shallowest: `Verb` 1 rung, 41 `Trial` 1 rung, 1 `Token` 1 rung, 91 `Third` 1 rung, 3 `Text` 1 rung, 43 `Superlative` 1 rung, 1 `String` 1 rung, 2 `Singular` 1 rung, 2.

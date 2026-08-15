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

**OLiA** publishes **1,311 concepts** in a hierarchy nine levels deep. This repository writes **56 of them, 1,150 times**, across 282 of 372 files — reaching **11 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `LinguisticConcept` | 15 | 136 | 478 | `Source`&nbsp;165 `Set`&nbsp;79 `Citation`&nbsp;46 `Evidence`&nbsp;32 `Means`&nbsp;27 `Document`&nbsp;26 `Given`&nbsp;22 `PartOf`&nbsp;21 |
| `MorphosyntacticCategory` | 10 | 288 | 147 | `Verb`&nbsp;33 `Noun`&nbsp;31 `Abbreviation`&nbsp;23 `Symbol`&nbsp;19 `Foreign`&nbsp;12 `Initialism`&nbsp;11 `Residual`&nbsp;11 `Acronym`&nbsp;4 |
| `OrthographicEntity` | 4 | 37 | 132 | `Token`&nbsp;83 `Text`&nbsp;30 `Script`&nbsp;17 `String`&nbsp;2 |
| `MorphologicalCategory` | 5 | 16 | 120 | `Root`&nbsp;88 `Prefix`&nbsp;15 `Suffix`&nbsp;11 `Stem`&nbsp;5 `Affix`&nbsp;1 |
| `Constituent` | 4 | 37 | 85 | `Phrase`&nbsp;67 `Fragment`&nbsp;9 `Clause`&nbsp;7 `Chunk`&nbsp;2 |
| `PersonFeature` | 2 | 10 | 75 | `First`&nbsp;53 `Second`&nbsp;22 |
| `SemanticFeature` | 5 | 125 | 50 | `Function`&nbsp;34 `Amount`&nbsp;7 `Object`&nbsp;4 `Plan`&nbsp;3 `Time`&nbsp;2 |
| `Relation` | 5 | 203 | 39 | `Comparison`&nbsp;15 `Consequence`&nbsp;10 `Expansion`&nbsp;10 `Attribution`&nbsp;3 `Extra`&nbsp;1 |
| `SemanticUnit` | 1 | 12 | 14 | `Collocation`&nbsp;14 |
| `NumberFeature` | 3 | 11 | 6 | `Plural`&nbsp;4 `Singular`&nbsp;1 `Trial`&nbsp;1 |
| `InflectionTypeFeature` | 2 | 9 | 4 | `BaseForm`&nbsp;2 `Inflected`&nbsp;2 |

## How the two sides were made to meet

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 870 | 51 | 96.8% |
| the dictionary form of each word | 172 | 31 | 94.2% |
| the sense the dictionary carries each word in | 108 | 19 | 100.0% |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 1,944 | 151 | 98.0% | 20 of 70 | `topic`&nbsp;187 |
| only where the branch holds more than this one concept | 1,150 | 101 | 96.7% | 11 of 70 | `source`&nbsp;130 |

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
| `control` | 10 | `MovementFeature` |
| `letter` | 10 | `Character` |
| `space` | 10 | `GraphicalSeparator` |
| `list` | 8 | `Conjunction` |
| `cites` | 7 | `Referentiality` |
| `person` | 7 | `AnimateEntity` |
| `cite` | 6 | `Referentiality` |
| `citing` | 5 | `Referentiality` |

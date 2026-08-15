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

**OLiA** publishes **1,311 concepts** in a hierarchy nine levels deep. This repository writes **56 of them, 1,122 times**, across 278 of 367 files — reaching **11 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `LinguisticConcept` | 15 | 136 | 463 | `Source`&nbsp;165 `Set`&nbsp;70 `Citation`&nbsp;47 `Evidence`&nbsp;32 `Document`&nbsp;26 `Given`&nbsp;21 `Means`&nbsp;21 `PartOf`&nbsp;21 |
| `MorphosyntacticCategory` | 10 | 288 | 147 | `Verb`&nbsp;33 `Noun`&nbsp;31 `Abbreviation`&nbsp;23 `Symbol`&nbsp;19 `Foreign`&nbsp;12 `Initialism`&nbsp;11 `Residual`&nbsp;11 `Acronym`&nbsp;4 |
| `OrthographicEntity` | 4 | 37 | 132 | `Token`&nbsp;83 `Text`&nbsp;30 `Script`&nbsp;17 `String`&nbsp;2 |
| `MorphologicalCategory` | 5 | 16 | 119 | `Root`&nbsp;87 `Prefix`&nbsp;15 `Suffix`&nbsp;11 `Stem`&nbsp;5 `Affix`&nbsp;1 |
| `Constituent` | 4 | 37 | 85 | `Phrase`&nbsp;67 `Fragment`&nbsp;9 `Clause`&nbsp;7 `Chunk`&nbsp;2 |
| `PersonFeature` | 2 | 10 | 66 | `First`&nbsp;48 `Second`&nbsp;18 |
| `SemanticFeature` | 5 | 125 | 50 | `Function`&nbsp;34 `Amount`&nbsp;7 `Object`&nbsp;4 `Plan`&nbsp;3 `Time`&nbsp;2 |
| `Relation` | 5 | 203 | 36 | `Comparison`&nbsp;11 `Consequence`&nbsp;11 `Expansion`&nbsp;10 `Attribution`&nbsp;3 `Extra`&nbsp;1 |
| `SemanticUnit` | 1 | 12 | 14 | `Collocation`&nbsp;14 |
| `NumberFeature` | 3 | 11 | 6 | `Plural`&nbsp;4 `Singular`&nbsp;1 `Trial`&nbsp;1 |
| `InflectionTypeFeature` | 2 | 9 | 4 | `BaseForm`&nbsp;2 `Inflected`&nbsp;2 |

## How the two sides were made to meet

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 857 | 51 | 96.7% |
| the dictionary form of each word | 166 | 31 | 94.0% |
| the sense the dictionary carries each word in | 99 | 19 | 100.0% |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 1,888 | 150 | 98.0% | 20 of 70 | `topic`&nbsp;183 |
| only where the branch holds more than this one concept | 1,122 | 101 | 96.6% | 11 of 70 | `source`&nbsp;130 |

### What the branch refused

**49 terms**, most-written first, each of them the one concept this repository writes in the region of the field its publisher placed it in.

| Term | Times | Stood alone under |
|---|--:|---|
| `topic` | 183 | `PragmaticUnit` |
| `theme` | 104 | `PragmaticUnit` |
| `topics` | 98 | `PragmaticUnit` |
| `subject` | 65 | `PragmaticUnit` |
| `themes` | 37 | `PragmaticUnit` |
| `summary` | 31 | `Generalization` |
| `cited` | 28 | `Referentiality` |
| `head` | 25 | `SyntacticRole` |
| `subjects` | 24 | `PragmaticUnit` |
| `identifier` | 21 | `DiscourseEntity` |
| `other` | 18 | `SameType` |
| `definition` | 15 | `Assessment` |
| `control` | 10 | `MovementFeature` |
| `letter` | 10 | `Character` |
| `space` | 10 | `GraphicalSeparator` |
| `list` | 8 | `Conjunction` |
| `cites` | 7 | `Referentiality` |
| `person` | 7 | `AnimateEntity` |
| `cite` | 6 | `Referentiality` |
| `citing` | 5 | `Referentiality` |

# Terms — CodeSemantics

Does this repository write the vocabulary of a published field? The Ontologies of Linguistic
Annotation state 1,197 terms whose names are already identifiers, so the match is identifier to
identifier with no English in between: OLiA's `AdjectivePhrase` and this repository's
`adjectivePhrase` read as the same two words, and a hit is the ontology saying this is a term of
its field rather than anyone here deciding so.

Only **declared names** are read. A term in a sentence is an author writing about a field; a term
in a name is a program working in one.

**OLiA** publishes **1,311 concepts** in a hierarchy nine levels deep. This repository writes **86 of them, 1,704 times**, across 315 of 357 files — reaching **20 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `LinguisticConcept` | 19 | 136 | 894 | `Topic`&nbsp;414 `Source`&nbsp;165 `Set`&nbsp;52 `Citation`&nbsp;46 `Evidence`&nbsp;32 `Identifier`&nbsp;26 `Document`&nbsp;22 `PartOf`&nbsp;22 |
| `MorphosyntacticCategory` | 14 | 288 | 165 | `Verb`&nbsp;33 `Noun`&nbsp;31 `Abbreviation`&nbsp;23 `Symbol`&nbsp;15 `List`&nbsp;14 `Foreign`&nbsp;12 `Initialism`&nbsp;11 `Residual`&nbsp;11 |
| `OrthographicEntity` | 6 | 37 | 156 | `Token`&nbsp;82 `Text`&nbsp;30 `Script`&nbsp;18 `Letter`&nbsp;13 `Space`&nbsp;11 `String`&nbsp;2 |
| `MorphologicalCategory` | 5 | 16 | 111 | `Root`&nbsp;79 `Prefix`&nbsp;15 `Suffix`&nbsp;11 `Stem`&nbsp;5 `Affix`&nbsp;1 |
| `SemanticFeature` | 10 | 125 | 107 | `Referring`&nbsp;45 `Function`&nbsp;34 `Person`&nbsp;8 `Amount`&nbsp;7 `Object`&nbsp;4 `Plan`&nbsp;3 `Time`&nbsp;2 `URL`&nbsp;2 |
| `Relation` | 10 | 203 | 70 | `Summary`&nbsp;21 `Result`&nbsp;11 `Comparison`&nbsp;10 `Definition`&nbsp;10 `Expansion`&nbsp;10 `Attribution`&nbsp;3 `Contrast`&nbsp;2 `Condition`&nbsp;1 |
| `Constituent` | 4 | 37 | 67 | `Phrase`&nbsp;49 `Fragment`&nbsp;9 `Clause`&nbsp;7 `Chunk`&nbsp;2 |
| `PersonFeature` | 2 | 10 | 66 | `First`&nbsp;48 `Second`&nbsp;18 |
| `SyntacticRole` | 2 | 33 | 27 | `Head`&nbsp;26 `Qualifier`&nbsp;1 |
| `MovementFeature` | 1 | 7 | 13 | `Control`&nbsp;13 |
| `NumberFeature` | 3 | 11 | 6 | `Plural`&nbsp;4 `Singular`&nbsp;1 `Trial`&nbsp;1 |
| `SemanticUnit` | 1 | 12 | 6 | `Collocation`&nbsp;6 |

## How the two sides were made to meet

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 1,173 | 75 | 97.6% |
| the dictionary form of each word | 277 | 47 | 98.9% |
| the sense the dictionary carries each word in | 254 | 28 | 100.0% |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 1,704 | 150 | 98.2% | 20 of 70 | `topic`&nbsp;180 |
| only where the branch holds more than this one concept | 1,057 | 102 | 97.1% | 11 of 70 | `source`&nbsp;130 |

### What the branch refused

**48 terms**, most-written first, each of them the one concept this repository writes in the region of the field its publisher placed it in.

| Term | Times | Stood alone under |
|---|--:|---|
| `topic` | 180 | `PragmaticUnit` |
| `topics` | 98 | `PragmaticUnit` |
| `subject` | 60 | `PragmaticUnit` |
| `themes` | 36 | `PragmaticUnit` |
| `cited` | 27 | `Referentiality` |
| `head` | 25 | `SyntacticRole` |
| `subjects` | 23 | `PragmaticUnit` |
| `identifier` | 21 | `DiscourseEntity` |
| `summary` | 21 | `Generalization` |
| `other` | 17 | `SameType` |
| `theme` | 17 | `PragmaticUnit` |
| `control` | 10 | `MovementFeature` |
| `definition` | 9 | `Assessment` |
| `letter` | 9 | `Character` |
| `space` | 9 | `GraphicalSeparator` |
| `list` | 8 | `Conjunction` |
| `cites` | 7 | `Referentiality` |
| `person` | 7 | `AnimateEntity` |
| `cite` | 6 | `Referentiality` |
| `citing` | 5 | `Referentiality` |

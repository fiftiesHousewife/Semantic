# Terms — tika

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

**OLiA** publishes **1,311 concepts** in a hierarchy nine levels deep. This repository writes **108 of them, 8,614 times**, across 1,520 of 2,148 files — reaching **13 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `OrthographicEntity` | 9 | 37 | 2,362 | `Text` 921 `String` 579 `Script` 358 `Token` 294 `Character` 128 `Letter` 44 `Country` 20 `Diacritic` 12 |
| `LinguisticConcept` | 26 | 136 | 1,856 | `Document` 372 `Support` 366 `Author` 338 `Source` 196 `New` 115 `Title` 104 `Topic` 65 `Sentence` 63 |
| `Relation` | 8 | 203 | 1,228 | `Result` 836 `Exception` 267 `Example` 69 `Alternative` 29 `Expansion` 14 `Comparison` 8 `Instantiation` 4 `Background` 1 |
| `SemanticFeature` | 19 | 125 | 1,197 | `Object` 476 `URL` 285 `Time` 165 `Amount` 70 `Address` 48 `Movie` 29 `Organization` 24 `Album` 21 |
| `MorphosyntacticCategory` | 24 | 288 | 772 | `Image` 329 `Date` 206 `Unique` 48 `Slash` 38 `Quote` 31 `Symbol` 26 `Acronym` 13 `Colon` 11 |
| `MorphologicalCategory` | 2 | 16 | 450 | `Prefix` 363 `Suffix` 87 |
| `Constituent` | 4 | 37 | 304 | `Chunk` 261 `Clause` 23 `Fragment` 19 `Phrase` 1 |
| `PersonFeature` | 3 | 10 | 184 | `Second` 91 `First` 90 `Third` 3 |
| `CoordTypeFeature` | 2 | 5 | 99 | `Simple` 83 `Initial` 16 |
| `TenseFeature` | 4 | 35 | 91 | `Future` 57 `Present` 26 `Perfect` 6 `Past` 2 |
| `SyntacticRole` | 3 | 33 | 36 | `Head` 34 `Modifier` 1 `Qualifier` 1 |
| `NullElement` | 2 | 7 | 30 | `Trace` 26 `Gapping` 4 |

## Matches per normalisation

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 6,687 | 97 | 99.8% |
| the dictionary form of each word | 1,479 | 62 | 97.8% |
| the sense the dictionary carries each word in | 445 | 49 | 98.4% |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 12,542 | 289 | 99.6% | 24 of 70 | `set` 1,628 |
| only where the branch holds more than this one concept | 8,611 | 208 | 99.4% | 13 of 70 | `text` 909 |

### What the branch refused

**81 terms**, most-written first, each of them the one concept this repository writes in the region of the field its publisher placed it in.

| Term | Times | Stood alone under |
|---|--:|---|
| `set` | 1,628 | `PartWhole` |
| `list` | 954 | `Conjunction` |
| `root` | 263 | `Morpheme` |
| `space` | 260 | `GraphicalSeparator` |
| `control` | 82 | `MovementFeature` |
| `auto` | 79 | `Vehicle` |
| `frame` | 53 | `LexicalUnit` |
| `point` | 38 | `SentenceFinalPunctuation` |
| `spaces` | 36 | `GraphicalSeparator` |
| `summary` | 34 | `Generalization` |
| `put` | 32 | `PartWhole` |
| `place` | 31 | `PartWhole` |
| `relation` | 31 | `Relation` |
| `settings` | 30 | `PartWhole` |
| `cause` | 26 | `Contigency` |
| `identifier` | 25 | `DiscourseEntity` |
| `sequence` | 25 | `SubjectMatterRelation` |
| `extra` | 23 | `TextualOrganizationalRelation` |
| `roots` | 22 | `Morpheme` |
| `person` | 13 | `AnimateEntity` |

## Whether the depth the publisher states separates the match

Depth is read off the source's own edges and is a citation rather than a heuristic: the publisher stated every one of them, and a rung count is what they add up to. It is bounded by the deepest chain the source states — 9 rungs here — so a shallow taxonomy and a deep one are read on one scale without a level count being chosen.

| Rungs below the root | Concepts written | Times | Share of spans |
|--:|--:|--:|--:|
| 0 | 0 | 0 | 0.0% |
| 1 | 26 | 3,023 | 35.1% |
| 2 | 30 | 1,888 | 21.9% |
| 3 | 17 | 1,504 | 17.5% |
| 4 | 15 | 535 | 6.2% |
| 5 | 12 | 407 | 4.7% |
| 6 | 8 | 1,257 | 14.6% |

| Admitted | Concepts | Times | Mean rungs per concept | Mean rungs per span |
|---|--:|--:|--:|--:|
| what the branch admitted | 108 | 8,614 | 2.82 | 2.67 |
| what the branch refused | 39 | 3,940 | 3.49 | 3.22 |

The deepest of what was written: `Album` 6 rungs, 21 `Book` 6 rungs, 8 `EmailAddress` 6 rungs, 2 `Example` 6 rungs, 69 `Movie` 6 rungs, 29 `PhoneNumber` 6 rungs, 7 `Result` 6 rungs, 836 `URL` 6 rungs, 285.

The shallowest: `Weak` 1 rung, 1 `Unique` 1 rung, 48 `Trace` 1 rung, 26 `Token` 1 rung, 294 `Third` 1 rung, 3 `Text` 1 rung, 921 `Strong` 1 rung, 4 `String` 1 rung, 579.

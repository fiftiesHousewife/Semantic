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

**OLiA** publishes **1,311 concepts** in a hierarchy 9 rungs deep. This repository writes **98 of them, 5,934 times**, across 1,306 of 2,369 files — reaching **12 of the taxonomy's 70 root branches**.

A branch is evidenced by everything beneath it and ranked by how many distinct concepts under it were written, because one ordinary word a taxonomy happens to claim is one concept however often a codebase writes it.

## The branches this repository occupies

| Branch | Concepts written | Of published | Times | What it wrote there |
|---|--:|--:|--:|---|
| `OrthographicEntity` | 8 | 37 | 1,760 | `Text` 865 `Script` 344 `Token` 261 `String` 157 `Character` 61 `Letter` 44 `Country` 16 `Diacritic` 12 |
| `LinguisticConcept` | 23 | 136 | 1,142 | `Support` 246 `Document` 172 `Source` 171 `Author` 148 `Title` 104 `Topic` 64 `Sentence` 63 `Abstract` 50 |
| `Relation` | 8 | 203 | 777 | `Result` 456 `Exception` 201 `Example` 64 `Alternative` 29 `Expansion` 14 `Comparison` 8 `Instantiation` 4 `Background` 1 |
| `SemanticFeature` | 17 | 125 | 720 | `Object` 240 `URL` 218 `Amount` 68 `Address` 35 `Movie` 28 `Organization` 24 `Album` 21 `Artist` 21 |
| `MorphosyntacticCategory` | 24 | 288 | 634 | `Image` 263 `Date` 146 `Unique` 47 `Slash` 38 `Quote` 29 `Symbol` 22 `Acronym` 13 `Colon` 11 |
| `MorphologicalCategory` | 2 | 16 | 393 | `Prefix` 322 `Suffix` 71 |
| `Constituent` | 3 | 37 | 242 | `Chunk` 211 `Fragment` 19 `Clause` 12 |
| `CoordTypeFeature` | 2 | 5 | 89 | `Simple` 73 `Initial` 16 |
| `PersonFeature` | 2 | 10 | 60 | `Second` 57 `Third` 3 |
| `TenseFeature` | 4 | 35 | 55 | `Present` 25 `Future` 22 `Perfect` 6 `Past` 2 |
| `SyntacticRole` | 3 | 33 | 32 | `Head` 30 `Modifier` 1 `Qualifier` 1 |
| `NullElement` | 2 | 7 | 30 | `Trace` 26 `Gapping` 4 |

## Matches per normalisation

| Both sides became | Written | Distinct terms | One word long |
|---|--:|--:|--:|
| the words themselves | 4,487 | 86 | 99.7% |
| the dictionary form of each word | 1,242 | 62 | 97.6% |
| the sense the dictionary carries each word in | 205 | 21 | 96.6% |

## Refused as the type written beside the name

**552 spans** repeated the declared type and nothing else. The words stay in the name — removing one would close a gap between two words the author never wrote next to each other — and only the match is refused.

| Term | Spans refused |
|---|--:|
| `string` | 274 |
| `object` | 56 |
| `result` | 33 |
| `date` | 32 |
| `url` | 31 |
| `chunk` | 22 |
| `document` | 19 |
| `image` | 15 |


## Whether the branch corroborates the match

A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word the taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else under that feature.

Taken to the root the rule would refuse nothing and taken at the concept itself it would refuse everything — no program declares a `morphosyntacticCategory`. So the test is the one the data can answer: what supports `Verb` is that this repository also writes `Noun`, `Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more than one word is admitted unconditionally**, which is the whole reason term length was worth measuring.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 9,090 | 251 | 99.4% | 24 of 70 | `set` 1,326 |
| only where the branch holds more than this one concept | 5,934 | 169 | 99.1% | 12 of 70 | `text` 857 |

### What the branch refused

**82 terms**, most-written first, each of them the one concept this repository writes in the region of the field its publisher placed it in.

| Term | Times | Stood alone under |
|---|--:|---|
| `set` | 1,326 | `PartWhole` |
| `root` | 242 | `Morpheme` |
| `space` | 233 | `GraphicalSeparator` |
| `list` | 230 | `Conjunction` |
| `time` | 121 | `EntityType` |
| `new` | 102 | `InformationStatus` |
| `first` | 84 | `PersonFeature` |
| `control` | 69 | `MovementFeature` |
| `auto` | 59 | `Vehicle` |
| `frame` | 50 | `LexicalUnit` |
| `other` | 49 | `SameType` |
| `point` | 35 | `SentenceFinalPunctuation` |
| `second` | 34 | `PersonFeature` |
| `spaces` | 32 | `GraphicalSeparator` |
| `place` | 31 | `PartWhole` |
| `put` | 28 | `PartWhole` |
| `relation` | 28 | `Relation` |
| `cause` | 25 | `Contigency` |
| `settings` | 25 | `PartWhole` |
| `identifier` | 24 | `DiscourseEntity` |

## Whether the depth the publisher states separates the match

Depth is read off the source's own edges and is a citation rather than a heuristic: the publisher stated every one of them, and a rung count is what they add up to. It is bounded by the deepest chain the source states — 9 rungs here — so a shallow taxonomy and a deep one are read on one scale without a level count being chosen.

| Rungs below the root | Concepts written | Times | Share of spans |
|--:|--:|--:|--:|
| 0 | 0 | 0 | 0.0% |
| 1 | 22 | 2,222 | 37.4% |
| 2 | 29 | 1,211 | 20.4% |
| 3 | 16 | 1,022 | 17.2% |
| 4 | 13 | 360 | 6.1% |
| 5 | 10 | 315 | 5.3% |
| 6 | 8 | 804 | 13.5% |

| Admitted | Concepts | Times | Mean rungs per concept | Mean rungs per span |
|---|--:|--:|--:|--:|
| what the branch admitted | 98 | 5,934 | 2.84 | 2.62 |
| what the branch refused | 45 | 2,997 | 3.33 | 3.34 |

The deepest of what was written: `Album` 6 rungs, 21 `Book` 6 rungs, 8 `EmailAddress` 6 rungs, 2 `Example` 6 rungs, 64 `Movie` 6 rungs, 28 `PhoneNumber` 6 rungs, 7 `Result` 6 rungs, 456 `URL` 6 rungs, 218.

The shallowest: `Unique` 1 rung, 47 `Trace` 1 rung, 26 `Token` 1 rung, 261 `Third` 1 rung, 3 `Text` 1 rung, 865 `String` 1 rung, 157 `Simple` 1 rung, 73 `Second` 1 rung, 57.

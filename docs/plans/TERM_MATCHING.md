# Matching a term in context, and comparing meanings rather than strings

## The branch corroboration has landed, and it settles the three criteria stated below

`StatedSiblings` counts the concepts a repository writes **beside** one — the publisher's own children of the publisher's own parent — and `CorroboratedTerms` decorates any `TermIndex` so a one-word term whose branch holds no other written concept abstains. A term written in more than one word is admitted unconditionally. `CorroborationReport` prints the two readings side by side and names every refusal with the branch it stood alone in, so a reader disagrees concept by concept rather than with a rate.

| Admitted | Spans | Distinct terms | One word long | Branches occupied | Largest single term |
|---|--:|--:|--:|--:|---|
| every match | 1,587 | 147 | 98.0% | 20 of 70 | `topic` 177 |
| only where the branch holds more than this one concept | 986 | 101 | 96.9% | 11 of 70 | `source` 119 |

It refuses 46 terms and the first six are `topic`, `topics`, `subject`, `themes`, `subjects` and `theme` — the whole `PragmaticUnit` cluster, which is the defect this item was written about — and then `cite`, `cited`, `cites`, `citing` under `Referentiality`, which is the `law` artefact of the theme reading arriving in the one reading built to need no English in between.

**Two things to say honestly.** The one-word share falls by only 1.1 points, because most of what is refused is one word too; the rule removes the *wrong* single words rather than single words as a class. And 11 of 20 branches clears the stated abandon line of 10 by one, which is close enough that a second taxonomy could refute it — FIBO's hierarchy is dense and complete, so a rule keyed on a publisher's own placement will behave differently there.

**Counting the whole subtree beneath the parent was tried first and it fails.** `Topic` sits under `PragmaticUnit` and this repository writes `Identifier` two levels below it, so the subtree reading admits `Topic` on that strength and leaves it the largest single match at 177 — the defect unchanged. That is the trap named further down this document confirmed at one step: climb far enough and everything meets.

### It has been promoted, and it is now the reading that is reported

The headline placement, the branch table, the taxonomy tree and the evidence page are built from the corroborated reading. The reading that admits every match is kept beside it, in the comparison above and in the list of refusals below it, because a rule that removes matches can only be judged as a comparison.

| Reported | Concepts written | Times | Branches occupied | Largest single term |
|---|--:|--:|--:|---|
| before, every match | 86 | 1,704 | 20 of 70 | `Topic` 414 |
| now, corroborated | 56 | 1,059 | 11 of 70 | `Source` 165 |

`Topic` is out of the headline entirely, which is what this item was written to achieve. Three counts *rose* — `Root` 79 to 81, `Set` 52 to 53 — because the span walk takes the longest term at each position and moves on by its length, so refusing a term frees the words under it for a shorter one that was never reachable.

**Promoting it found a defect in where the rule was applied.** `CorroboratedTerms` asks the length of the run it is given, and `NormalisedTerms` builds its index by asking the source about the source's own spellings — so wrapping the published index and *then* normalising put the rule on the publisher's term length. OLiA states `FamilyName`, which is two words and is admitted unconditionally, and this repository's one-word `surname` then reached it through a shared WordNet sense with no branch corroborating anything. The rule exists to judge what the repository wrote, so `TermReading.corroboratedBy` now corroborates each rung's answer rather than the ladder's input. `TermReadingTest` pins both compositions, the used one and the refused one, so the order cannot be flipped back by accident.

**What is still not done:** a match is scored term by term rather than against the subtree it occupies. The depth reading has been run and is refuted; the section below carries what it measured and what the failure points at instead.

### The first reading of a repository this was not written for, and what it showed

OLiA read against Apache Tika, pinned at `43cbdae6`: **106 of 1,311 concepts, 8,799 times, across 1,537 of 2,148 files**, reaching 12 of 70 root branches. That is the corroborated reading — the branch rule ran and did not hold it back.

**It is not the out-of-domain result it first looks like, and the member is why.** Tika extracts text, and OLiA annotates text, so `Text` 939, `Token` 307, `Character` 128, `Script` 381, `Diacritic` 12 and `Acronym` 13 are the two vocabularies agreeing about something real. No linguistics taxonomy separates *about linguistics* from *about text processing*, because they share the words. A member with no text in its subject matter at all — `maven` or `ant`, which Apache states as `build-management` — is what would make this a negative control, and it has not been read.

What is unambiguous is the rest: **`Result` 836, `Object` 476, `Exception` 283, `String` 585**. Most of that is now gone, and the parse removed it rather than a rule about words: `Set<String> mimeSet` writes `set` because Java asks for the type on the line, so a run of a name that repeats the type declared beside it is that type spelled again. `NameOccurrence` carries the type's words and `TermReading` refuses a span made only of them, counting each refusal by term. On Tika that is **1,850 spans** — `string` 407, `result` 355, `object` 234, `writer` 175, `document` 125, `exception` 64, `date` 57, `image` 54 — taking the reading from 8,614 spans to 6,764 over the same 108 concepts and the same 13 root branches, and `String` 579 to 163, `Result` 836 to 466, `Object` 476 to 240. Here it is 89 spans, led by `source` 25 and `citations` 14, with the branch count unmoved at 12. The word stays in the name, because dropping one closes a gap between two words the author never wrote next to each other; only the match is refused. Ordinary programming words a linguistic ontology happens to publish, matched at a rate no rule here currently touches. This document said their shared property was depth — that they sit near the roots, where a term meaning something to a field sits deep — and named the depth reading as the measurement that would separate them.

The target vocabulary makes this urgent rather than optional. **56% of PyPI Trove's 321 `Topic ::` leaf labels are a single word** — `Application`, `Analysis`, `Audio`, `Backup`, `Archiving` — against 11% of FIBO's. A matcher that cannot price a shallow single-word hit will be handed a vocabulary made mostly of them.

### The depth reading has been run, and it is refuted

`StatedDepth` counts the rungs the publisher states between a concept and the root of its branch, bounded by the deepest chain the source states — nine here — and `DepthReport` puts what the branch rule admitted beside what it refused, because the branch rule is the separation already in the tree. If depth carried the same signal, the refused matches would stand nearer a root than the admitted ones.

Both readings are of a named commit: this repository at the commit that landed the measurement, Tika at `43cbdae6`. The reading covers this repository's own documentation, so writing these figures down moves them.

| Read against | Concepts | Times | Mean rungs per concept | Mean rungs per span |
|---|--:|--:|--:|--:|
| this repository, what the branch admitted | 56 | 1,174 | 2.21 | 2.17 |
| this repository, what the branch refused | 32 | 804 | **3.22** | **2.44** |
| Tika `43cbdae6`, what the branch admitted | 106 | 8,799 | 2.86 | 2.70 |
| Tika `43cbdae6`, what the branch refused | 40 | 3,984 | **3.43** | **3.20** |

**It separates them the other way round, on both trees.** The out-of-domain member also matches deeper than the in-domain one — 2.70 rungs per span against 2.16 — so a weight that favoured depth would raise the reading this library needs to lower.

The four matches this section was written about are the clearest form of it. `Result` is six rungs down, `Exception` five and `Object` three, against `Verb`, `Noun`, `Token`, `Clause`, `Phrase`, `Diacritic`, `Script` and `Text`, every one of them one rung down. Tika's deepest rung holds 1,341 spans — 15.2% of the reading — and it is `Result` 836, `URL` 285, `Example` 115, `Book` 46, `Movie` 29, `Album` 21, `PhoneNumber` 7 and `EmailAddress` 2, without a term of the field among them.

The reason is in the taxonomy rather than in the arithmetic. OLiA's long chains are its discourse relations (`Result` < `Cause` < `Contigency` < `CoherenceRelation` < `DiscourseRelation` < `PragmaticRelation` < `Relation`) and its named entities (`Book`, `Movie`, `Album`, `PhoneNumber` under `EntityType`), and both are built out of ordinary English. The morphosyntax a program working in the field actually declares stands one rung down, because OLiA states no named parent for it — the fact `StatedAncestry` already documents and which this reading treated as a gap to price rather than as the shape of the source.

`PinnedTermFindings` holds the refutation, so a change that makes depth productive has to rewrite a stated expectation, and `DepthReport` writes the table into `terms.md` for whatever tree the reading is pointed at.

**Abandon criterion met.** *Abandon if: depth does not separate the matches the branch reading already separates.* It does not, and the second citation disagreeing with the first is the outcome that section predicted would mean neither is measuring what it claims — except that here only one of them is wrong, and the branch reading is the one still standing.

### What the failure points at: the branch rule is right and its scope is not

Three further signals were measured on the same two trees before any was built, over every span the ladder finds rather than the corroborated reading, so each is judged on what it would have to remove.

| Signal | What it did |
|---|---|
| depth in the publisher's hierarchy | inverted, above |
| the frequency weight already on every sighting | 0.729 mean per span on Tika against 0.724 here — it does not tell the two trees apart at all, and `URL` at 0.947 outweighs `Character` at 0.669 |
| how specific the company a match keeps in its own file is | `Result` scores 0.787 and `Token` 0.734 — no separation |
| **the branch rule the reading already uses, asked of the file rather than of the repository** | it removes what the other three cannot |

The last one is the finding. **Repository-scope corroboration gets cheaper as a repository gets bigger**: Tika has 2,148 files and clears the rule on 97 concepts, this repository has 378 and clears it on 52, and any large Java tree writes something under `Relation` and something under `SemanticFeature` somewhere. Asked of the file the term was written in, the same rule reads what the rest of that file is about.

| Corroborated at | Tika spans | Concepts | Branches | What leads |
|---|--:|--:|--:|---|
| the repository, as today | 7,712 | 97 | 12 of 24 | `Text` 939 `String` 585 `Object` 476 `Script` 381 `Document` 372 |
| the file | 2,135 | 56 | 8 of 24 | `Text` 484 `Script` 351 `String` 201 `Author` 175 `Token` 174 |
| the file, and where a file holds no other match at all the file has nothing to read and the repository answers | 2,664 | 68 | 10 of 24 | `Text` 531 `Script` 356 `String` 245 `Token` 203 `Author` 197 |

| Corroborated at | This repository's spans | Concepts | Branches | What leads |
|---|--:|--:|--:|---|
| the repository, as today | 1,118 | 52 | 11 of 20 | `Source` 169 `Root` 97 `Token` 83 `Set` 81 `Phrase` 68 |
| the file | 272 | 32 | 9 of 20 | `First` 25 `Source` 24 `Token` 24 `Second` 22 `Noun` 21 |
| the file, and the repository where the file holds no other match | 354 | 37 | 11 of 20 | `Source` 64 `First` 28 `Token` 24 `Second` 22 `Noun` 21 |

At file scope `Set` 1,754, `List` 966, `Result` 836, `Object` 476, `Support` 366, `URL` 285 and `Exception` 265 leave Tika's reading, and `Topic` 531 and `Root` 97 leave this one — the whole of what the two readings were being criticised for. What is left of Tika is `Text`, `Script`, `Token`, `Character`, `Prefix`, `Suffix`, `Sentence`, `Diacritic`, `Heading` and `Footnote`, which is what a text-extraction library and a linguistic ontology genuinely share.

**Two costs, and neither is small.** It removes real matches: `Phrase` is written 68 times here and one of them survives, because this repository writes `phrase` in files that do not also write `clause` or `fragment` — company it does keep, under `SemanticUnit` rather than under `Constituent`. And it fails the abandon criterion this document already states. *Abandon if: requiring corroboration leaves fewer than half the branches occupied* — encoded in `TermReadingDiagnostic` against the uncorroborated count, so the line is 10 here and 12 on Tika. File scope leaves 9 and 8; falling back to the repository where a file holds no other match leaves 11 and 10, which clears the line here and misses it by two on Tika.

So the rule is not promoted on this measurement. What would settle it is a second out-of-domain member, and the observation that nine of Tika's 24 branches are held by five spans or fewer — a criterion counting those equally with `OrthographicEntity`'s 2,727 is measuring how long the tail is, which is the next thing this document should say a number about.

### A second vocabulary is what makes a match falsifiable

One taxonomy firing has nothing to be compared against, which is the argument this library already makes about a single scope's topic ranking: the weak reading is the count, the strong one is the divergence. With only OLiA bundled for this material, "OLiA fired on Tika" cannot be told from "Tika is about text". With an adjacent vocabulary for programming and text processing beside it, the question becomes which of the two fits better — a comparison, against a null.

The Computer Science Ontology is the best-shaped candidate found: 15,000 topics, 166,000 relationships, and roots including both Computer Science and Linguistics, so the comparison runs inside one publisher's hierarchy. It is deep, which the depth arm needs and which Trove at four levels is not. **Two things must be settled before it is bundled**, and neither is answered on its own pages: its licence is stated on neither the home nor the downloads page, and it is generated automatically by Klink-2 over 16 million publications — which is a curated observation of a corpus, the one thing the doctrine refuses. WordNet is corpus-informed and lexicographically curated; this is algorithmically derived, and whether that crosses the line is a decision to take deliberately rather than by bundling it.

### Two claims in the published term report do not hold

A line-by-line check of `output/terms.md` against the tree it describes leaves the arithmetic, the bounds and the citations standing. Two claims fall.

**1. A test method name is an English sentence, and the term matcher reads it as a name.** The vocabulary ranking already separates the source sets the build publishes from the ones it does not, precisely because "a test names the behaviour it checks in whole English sentences". `TermReading.of` does not: it reads every file's declared names into one tally. What comes through it is measurable —

| Term | Spans | What it actually matched |
|---|--:|---|
| `Means` | 33 | the verb inside `refusesToAskADictionaryWhatADependencysNameMeans` and its neighbours |
| `Given` | 24 | `givenTokens`, and test sentences beginning *given* |

**2. The headline count reads as a claim about linguistic vocabulary, and 42% of it is ordinary English.** The largest branch is `LinguisticConcept` at 540 of 1,293 spans, led by `Source` 183 (`SourceReader`, `ParsedSource`, `sourceSets`), `Set` 101, `Citation` 46, `Means` 33, `Evidence` 32, `Document` 30 and `Given` 24. The genuine matches are in the morphosyntax branches — `Verb` 41, `Noun` 38, `Phrase` 69, `Prefix` 15, `Suffix` 14, `Stem` 5, `Abbreviation` 23, `Initialism` 11 — and the report gives a reader no way to tell the two apart. It is the same defect the branch rule already measures from one side and the file-scope finding from another.

**What settles both:** the report states published names and test names apart, as the vocabulary ranking does, and names the collision rate rather than leaving it to be inferred from the branch table.

**One inconsistency to fix with them:** the opening says OLiA states **1,197** terms and the paragraph below says it publishes **1,311** concepts. Both are true of different populations and neither says which.

---

## Matching a single word is misleading — match in context

This is the largest thing wrong with the term reading and it survives every fix so far. `topic` matches OLiA's `Topic`, and OLiA's `Topic` is information structure — what a sentence is about. This repository's `topic` is a subject label in a distribution. **The two are not the same concept and the reading cannot currently tell.** It is the same defect the theme reading had before senses were read, arriving in the one place that was supposed to need no English in between.

The measured shape of it: of 1,563 matches, 97% are one word long, and the single largest is `topic` at 388. A reading whose headline number is one ambiguous word repeated is not reading a taxonomy, it is counting a word that a taxonomy happens to have claimed.

**What context is available, and none of it needs a new resource:**

| Context | What it would say |
|---|---|
| The **phrase** the word sits in | `topicDistribution` is `topic` beside `distribution`, and OLiA states no `Distribution`. A match whose siblings the taxonomy knows nothing about is a match the phrase does not corroborate |
| The **file's other matches** | A file matching `Topic`, `Source`, `Citation` and `Heading` — all under `LinguisticConcept` — is coherent. A lone `Topic` in a file whose other matches are `Token` and `Prefix` is not |
| The **branch** | The hierarchy recovered above is exactly what makes the second checkable. Two concepts are near if their least common subsumer is deep, and that is a derived statistic with a derived bound — Wu–Palmer is bounded in `[0, 1]` by construction |

**The rule, stated plainly: matching `preferred` means nothing unless the nodes above it were matched too.** A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one leaf of a subject it otherwise never touches has written an English word that a taxonomy happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once, and writes nothing else under that feature. That match is a coincidence and the hierarchy is what can say so.

**One refinement the data forces, and it is not a softening.** Taken literally the rule refuses almost everything, because the nodes above are technical names nobody writes: `Verb` sits under `MorphosyntacticCategory`, and no program declares a `morphosyntacticCategory`. What actually supports `Verb` is that this repository also writes `Noun`, `Clause`, `Phrase` and `Abbreviation` — its **siblings under that parent**. So the test is whether the branch is occupied by more than this one concept, which is the same claim in the form the data can answer, and `TaxonomyTree.conceptsWritten()` already computes it.

Multi-word matches are admitted unconditionally — `common noun` and `base form` need no corroboration, which is the whole reason term length was worth measuring in the first place.

**What settles it:** the share of matches that are one word long must fall, the branches occupied must not collapse to one, and `topic` must stop being the largest single match — or the corroboration must be shown to remove real matches, in which case the honest finding is that this taxonomy cannot be matched at word grain at all and the reading belongs at the branch level only.

**Abandon if:** requiring corroboration leaves fewer than half the branches occupied. A reading that can only see the one branch a repository writes most in has stopped being a placement.

### The taxonomy states more than we read — definitions, provenance, and its other modules

## The match is a string comparison, and it should be a comparison of meanings

`TermSpans` compares one run of words with another run of words. `commonNoun` meets `CommonNoun` and `nounCommon`, `nounPhrase` and `substantivePhrase` meet nothing, and every near miss is silent — the reading cannot even say it nearly matched. That is a **lexical** match wearing the clothes of a conceptual one.

Three things are being conflated and the design has to keep them apart:

| | What it states | Citable from |
|---|---|---|
| **Synonymy** | two names for one concept | the taxonomy's own `altLabel` / `synonym` / `relatedEquivalent` — a publisher's statement |
| **Subsumption** | one concept is a kind of another | WordNet's hypernym links, and the taxonomy's own `broader` |
| **Similarity** | two concepts sit near each other in a tree | *derived* from subsumption, never published |

**The machinery for the second is already in the tree and nothing uses it.** `Lexicon.sharedHypernyms` returns the categories two nouns are both a kind of and certifies them as coordinate sisters; `sharedHypernymChain` returns the lemma sets of every ancestor above that pair, nearest first, and is empty where they share none. Ported, tested, and not called by the matcher. The plan already asks for this in so many words — *the sibling reading agrees on labels where the plan intersects hypernym chains, so two words meaning neighbouring things agree on nothing* — so this is unbuilt design rather than new design.

### The ladder, and it is a ladder rather than a choice

Normalise **both sides to the same thing** and compare there, taking the narrowest rung that answers and falling to the next only where it does not. Each rung is a published statement, and which rung answered is recorded on every span — a match at rung 1 and a match at rung 3 are not the same evidence and must never be reported as one number.

| Rung | Both sides become | Matches that rung buys | Cited from |
|--:|---|---|---|
| 1 | the run of words itself | `commonNoun` ≡ `CommonNoun` | nothing — it is a string comparison |
| 2 | **the synset** | a word ≡ a different word WordNet puts in one sense | WordNet's own sense entries |
| 3 | **the semantic domain** | a word ≡ a different word sharing a labelled subject | WordNet Domains, already bundled |

### The ladder is built, and the rung it was built for is refused

`TermNormalisation` is the shape — a run of words in, a normal form out, and an abstention where any part of the run cannot be read. `NormalisedTerms` decorates any `TermIndex` with one, keying the source's own terms through the same statement a repository's runs go through, so neither side is privileged and a third source costs nothing. `TermSpans` takes the rungs in order and `TermSpan`, `TermSighting` and `TermReport` carry which one answered; the report states a rate per rung and offers none across them.

**A rung was added between the two.** The dictionary form is its own normalisation, because without it the sense rung takes the credit for morphology: a taxonomy publishes singulars and a program declares whatever its sentence needed, so `phrases` meeting `Phrase` is one word inflected and not a claim about meaning. On this tree that is 247 of the 450 spans the two broader rungs find between them.

| Both sides become | Spans | Per 1,000 names | Distinct terms | One word |
|---|--:|--:|--:|--:|
| the words themselves | 1,020 | 186.5 | 70 | 97.2% |
| the dictionary form of each word | 247 | 45.2 | 44 | 98.8% |
| the sense the dictionary carries each word in | 203 | 37.1 | 25 | **100%** |

**Rung 2 fails on the column this whole design rests on, and both of the examples that motivated it fail before any code runs.** WordNet holds no entry for `base form`, so `lemma` cannot meet it; it reads `article` as a piece of prose and `determiner` as a conclusive argument, so those two never meet either. What most frequent sense buys here is 203 spans of which **every one is a single word** — against the measurement that shaped the matcher, where the multi-word term was the signal and the single-word term was the noise. Its largest term is `subject` and `theme` reading as `Topic`, because WordNet holds all three in one entry: the same artefact that already puts `music` under every theme this tree reports, arriving by a second route into the one reading built to need no English in between. The rest is `cite` as `Referring`, `place` and `put` as `Set`, `sum` as `Amount`, `auto` as `Automobile`, `program` as `Plan` — a hand audit of the 25 distinct terms finds one (`surname` as `FamilyName`) anyone would defend, against a stated abandon criterion of 40 in 50.

It stays in the tree, reported apart and voting on nothing, because the figure is the argument. What would revisit it is **not** a different disambiguation: the failure is not that the wrong sense was chosen, it is that a single-word sense match is the noise the design already measured. `TermReadingDiagnostic` pins both findings, so a change that makes the rung productive has to rewrite a stated expectation.

### The branch already separates the real matches from the collisions, and nothing uses it

This is the most promising thing the term reading has produced and it was found by looking at the picture rather than the rate. Group the 1,020 word-rung spans by the chain OLiA states above each concept:

| | Spans | What arrives there |
|---|--:|---|
| The four branches OLiA **places** | 588 | `topic` 153, `source` 117, `set`, `other`, `evidence`, `given`, `text`, `title`, `author`, `document`, `heading`, `citation`, `part of`, `person`, `function`, `object`, `url`, `control`, `comparison`, `result`, `condition`, `list`, `summary` — English collisions, nearly all of them |
| The concepts it states **no parent** for | 432 | `token` 59, `verb` 32, `phrase` 34, `noun` 25, `abbreviation` 16, `symbol` 14, `prefix`, `suffix`, `clause`, `initialism`, `acronym`, `derivation`, `stem`, `punctuation`, `plural`, `affix`, `singular`, `inflected`, `common noun`, `noun phrase`, `base form`, `collocation` |

Of the placed branches only `identifier` and `sentence` belong. Of the unplaced ones **every single term is this repository working in OLiA's field**, and that is a much cleaner separation than term length, than the frequency weight, and than either broader rung achieved.

**It is a citation, not a heuristic.** OLiA states no superclass for those concepts because their parent is an anonymous restriction or lives in an ontology it imports rather than carries — so "states no parent here" is the publisher's own structure, and `StatedAncestry` already computes it. Three known-noise branches remain inside it (`Root` 53, `First` 47, `Second` 19, `Foreign` 24, `Head` 15) so it is not free of collisions, but it removes 588 spans of them at a stroke without a word being listed.

**What has to be checked before it is believed**: this is one taxonomy's shape and it may be a fact about OLiA rather than about term taxonomies. FIBO's hierarchy is dense and complete, so a "states no parent" rule would select almost nothing there. The measurement is whether the placed/unplaced split predicts a hand audit on a *second* source — which is another reason the panel comes first.

**Rung 3 is refused on the same evidence, unbuilt.** A domain-level match is a claim that two words are about the same *area*, which is weaker again than a claim that they mean the same thing — and rung 2 already collapsed into this tree's measured domain artefacts (`topic`, `cite`) while comparing something narrower. A rung that generalises further would find those artefacts sooner and more often. Building it to say so would cost a day to confirm what the row above already shows; the measurement that would revisit it is a rung 2 that discriminates on a repository OLiA should say nothing about.

### The trap, which is why this is not simply a good idea

**Climb far enough and everything meets.** `topic` and `verb` share an ancestor; so do `swap` and `sentence`. A match at a shared root is not evidence, it is arithmetic — and the current reading's measured defect is already that it matches *too much*, at 97.2% one-word spans on the narrowest rung. Naive expansion raises recall against a precision problem and would make the reading strictly worse. **The sense rung is that prediction confirmed at one step**: it generalises no further than a shared dictionary entry and already comes back 100% one word long.

**The rescue proposed was that the depth of the meeting point is itself a precision signal** — two concepts meeting at a node deep in the tree shown to be near each other, two meeting only at the root shown to be unrelated — with Wu–Palmer as the bounded form, twice the depth of the least common subsumer over the summed depths of the pair.

**That rescue is refused by the measurement above and it has to be said here too.** No hypernym is climbed yet, so the least common subsumer of a match is the concept itself and its depth is exactly what `StatedDepth` reports; and where it is deep the match is `Result`, `URL`, `Book` and `Movie`, and where it is shallow the match is `Verb`, `Noun`, `Token` and `Diacritic`. Wu–Palmer over an expansion would inherit that, because the numerator it is built on is the depth that was measured to point the wrong way. What is left of the idea is the bound, which is sound, over a statistic that is not.

### The doctrinal collision, to be settled before any of it is written

The backlog already states, for synonymy: *where a source publishes none, the reading abstains rather than borrowing WordNet, because a WordNet synonym of a term's head noun is a statement about English and not about the taxonomy.* OLiA publishes `altLabel` for a small fraction of its terms. So the honest position is that **subsumption may be borrowed and synonymy may not** — WordNet stating that a noun is a kind of another noun is a fact about the words, and both sides of this match are words; WordNet stating that two words are interchangeable says nothing about whether a *taxonomy* would use them for one concept.

And there is a second hazard. The term matcher exists precisely because a match identifier-to-identifier needs no English in between. Expanding both sides through WordNet puts English back in between — which is what the theme reading already does, and what `SubjectPlacementDiagnostic` pins as failing at leaf grain, where the floor of agreement under every subject drowns the signal. **A term matcher that generalises too freely collapses into the reading it was built to be independent of.**

That hazard is no longer a prediction. The sense rung's largest term is `subject` and `theme` reading as `Topic`, which is the same `topic` artefact the theme reading was already measured to be carrying — the collapse happened at the *first* step of generalisation, before any hypernym was climbed.

### What settles it, stated before it runs

Three arms, all on the panel `-Dcs.evaluation.dir` is being built for, each reported at several depth cut-offs so the cut-off is a reported figure and not a chosen one:

1. **Recall it should buy.** Terms this repository writes that OLiA states in other words. Hand-audit fifty near misses and record how many a hypernym reading recovers.
2. **Precision it must not cost.** The out-of-domain arm, unchanged: a repository OLiA should say nothing about. If generalising raises the out-of-domain rate as fast as the in-domain one, it has bought nothing.
3. ~~**Whether depth discriminates.**~~ **Run, and refuted** — the section above carries the figures. The prediction was that `topic`, `source`, `first` and `result` would meet their OLiA concept near the root and `verb`, `clause` and `affix` would meet deep. `result` is six rungs down and `verb`, `clause` and `affix` are one, two and two, and what the branch rule refused is deeper than what it admitted on both trees read. It cost an afternoon and it refused the premise before anything was built on it, which is what it was queued to do.

**Abandon if:** depth does not separate the matches the branch reading already separates. **It did not**, and the reason the two citations disagree is legible rather than mysterious: OLiA's depth records which branch a concept is in, and its two deepest branches are discourse relations and named entities, both spelled in ordinary English. So the branch reading stands and depth votes on nothing.

# Verbal forms — the rest of the behaviour reading

## Verbal forms — the rest of the behaviour reading

## First: the reading is computed and rendered nowhere

`ThemeReading.of` calls `Behaviours.in(...)` on every run and `RepositoryThemes` carries the result, and **nothing consumes `behaviours()`**. No report, no page, no assertion. `ThemeReport` still imported `Behaviour` and `Behaviours` without using either, which is how it was found. The README's verb table was therefore stated on the authority of a run no present output reproduces, and has been removed.

That is precisely the failure the reachability half of the bundled-resource contract exists to catch — see [`LIMITS.md`](LIMITS.md) — arriving on computed evidence rather than on a bundled file. Restoring the section to the theme report, with an assertion that fails if it disappears again, comes before the three slices below.

## What it does today

`Behaviours` reads a declared method name as a clause: the leading word where the dictionary carries a verb entry for it, and the rest as what the verb acts on. 592 of this repository's methods read that way — read (84), name (21), refuse (21), carry (15). Three parts of the question it was asked are **not** answered yet, and each is a separate slice.

**Class names are not read as structures.** A type name is not a clause but it is not nothing either: `WordSegmenter` is an agent noun over a verb, `TopicTally` a noun over a noun, `ParsedRepository` a participle over a noun. WordNet carries the derivational links (`segmenter` → `segment`) that would recover the verb inside the agent noun, which would let a type say what it *does* rather than only what it is called. *Measurement:* the share of declared types whose name yields a verb, and whether the verb it yields matches the verbs of the methods it declares. A type whose name promises one thing and whose methods do another is a finding worth having.

**The verb is chosen without context.** `massByTopic` reads as the verb *mass* because English can mass troops; the parse knows it is a getter and the reading does not ask. A part of speech is a fact about a word in a position, and only the position is missing. *Measurement:* the count of clauses whose verb disagrees with what the declaration does — a method returning a value and taking none is not performing its first word.

**The structured form stops at verb and object.** What a consumer wants is a specification: subject (the declaring type), verb, object, and the condition a test name states after `when` or `that`. The clause is already parsed far enough to carry the first three; the fourth is a grammar rule about where a subordinate clause begins. *Measurement:* the share of test names that yield a condition, against the share that state one in prose.

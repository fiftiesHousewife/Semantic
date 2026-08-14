# The run at computational linguistics — a stated goal, a bounded budget, and every attempt recorded

## The run at computational linguistics — a stated goal, a bounded budget, and every attempt recorded

**The goal, stated before the attempts so it cannot be moved to fit them:** the reading must place this
repository in the semantic domain of computational linguistics, evidenced in the suite, on strong supporting
evidence, with nothing hard-coded. **Ten attempts at most.** Each attempt names the false signal it is
attacking, states the root cause, changes one thing, and records what moved — including where it made things
worse, because an attempt that is quietly dropped is an attempt that will be made again.

The false signals are the measure of progress. A reading that arrives at `linguistics` while still carrying
`baseball` has not been fixed, it has been outweighed, and the next corpus will expose it.

| # | The false signal | Root cause attacked | What it changed | Result |
|--:|---|---|---|---|
| 4 | — | **The gains were not yet evidenced anywhere a build could fail.** | Assertions, not prose: the leading topic of the whole repository must be `linguistics` and must lead `music` by half again; its witnesses must include `word`, `parse`, `verb`; `cs.CL` must stand among the five nearest of 152 published subjects and all five must be computer science | **Green.** The reading is now pinned to the goal, so any regression in the vote fails `selfRead` rather than being noticed in a report months later. The remaining leaf defect is renarrowed: it is no longer the senses — `cs.CL` meets this tree on `linguistics` first — it is that a short vague description is punished least, and `cs.ET` is the vaguest arXiv publishes |
| 3 | `look`, `inside` and every Wiktionary-only word | **A word the sense-labelled resource said nothing about reported coverage `1.000` — complete confidence on no evidence at all.** It was the amplifier under every headword-only reading | `SenseCoverage` reads an unlabelled word as uncovered, and a headword topic covers the fewest senses a claim can concern — one, which follows from a claim existing rather than being chosen | **`linguistics` becomes the top topic of the whole summary.** `lexicon/test` qualifies for the first time and reads `linguistics`, `administration`, `lexicography`; `lexicon/main` reads `publishing`, `linguistics`, `philosophy`. Documentation now fails its null at 999 of 999. `chemistry`, `biology`, `military`, `buildings` survive in the extraction module |
| 2 | `baseball`, `soccer` | **Each resource was normalised to one unit, so a resource stating a single label handed that label the whole unit.** `first` is written 116 times, Wiktionary states one topic for it, and `baseball` took 81% of the word. Precision in a resource had become volume in the reading | The unit is the **observation**, not the resource: each labelled sense is one observation split among that sense's labels, and a headword set is one observation split among its labels. `SenseCoverage` dropped from the vote, where it was double-counting the discount `PhraseTopics` already applies | **`baseball` and `soccer` both gone.** `lexicon/main` now reads `computing`, `lexicography`, `theatre` — **`lexicography` is the first genuine domain label the summary has ever carried.** `chemistry`, `biology`, `military`, `literature` survive, and `buildings`, `mechanics`, `plants`, `theatre` arrive |
| 1 | `astronomy`, `mythology` | **A product name read as an English word.** `jupiter` written 230 times, 117 of them `import org.junit.jupiter`, voting as the Roman god; `blob`, `owl`, `sha`, `alt` the same shape | `OfferedWords` no longer offers a dependency's own name to a dictionary at all — a coordinate denotes an artefact and asking what it *means* is a category error. `Weights.dependency` deleted with it, being a weight nothing could read | **`astronomy` gone from every scope.** `api/main` loses `computing` and gains `heraldry`; `engine/test` loses `programming` and gains `law`. `baseball`, `soccer`, `military`, `chemistry` all survive — they were never carried by imports |

---

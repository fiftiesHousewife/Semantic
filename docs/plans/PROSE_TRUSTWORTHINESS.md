# How far a non-code entry can be trusted, measured rather than assumed

## How far a non-code entry can be trusted, measured rather than assumed

A declared name compiles. A README, a javadoc statement and a comment do not, and nothing anywhere checks
that they still describe the thing they sit above. The reading currently treats all three as one form worth
one constant — `Weights.prose` at 0.5, chosen and not derived — and that is the last large unmeasured
judgement in the tree.

**Prose is not one kind of evidence.** At least five kinds are already in this corpus and the reading cannot
tell them apart:

| Kind | Example here | What it is worth |
|---|---|---|
| A statement that restates its own declaration | a javadoc over `TopicTally` beginning *"Accumulates one file's identifier occurrences"* | **less than nothing new** — the words are already counted at the declaration, so the phrase double-counts a name |
| A statement that says what the name cannot | `NameForm`'s explanation of why a constructor is not collected | the most valuable prose there is, and the only kind the weight is currently right for |
| A statement that has gone stale | `NameForm.LOCAL` says it covers *"a pattern binding"*; the parse does not collect one | **negative** — it is evidence for a reading the code refutes |
| Boilerplate repeated verbatim | licence headers, generated banners, the provenance headers on eleven bundled resources | nothing, and it is written once per file so it scales with the corpus |
| Documentation that is *about* this reading | `README.md` quotes λ and the theme table; `BACKLOG.md` quotes the term rate | it puts the reading's own output back into the corpus the reading reads |

**Four measurements, each of which settles one row.**

1. **Redundancy.** The share of a javadoc's content words that already appear in the declaration it sits
   above. High share is a restatement, and a restatement corroborates nothing — it is one observation
   counted twice. *Ships when a phrase's worth falls with its overlap and the theme table moves.*
2. **Staleness, as a divergence.** A declaration's own topical reading against its javadoc's. The machinery
   is already in the tree: two distributions over one topic space is exactly what `JensenShannon` compares,
   and the null is the field of javadoc-to-declaration divergences across the repository. A comment far from
   the code it sits on is either the most informative prose in the file or a lie, and **the reading cannot
   tell which** — so it reports the pair and does not guess. *Ships when the ten most divergent javadocs in
   this tree are read by hand and the split between the two is recorded.*
3. **Boilerplate, by repetition rather than by a list.** A block of prose appearing identically in *n* files
   is worth what one occurrence is worth, not *n*. **This is the doctrinal edge of the item and it must be
   argued before it is built**: the doctrine forbids a curated observation of a corpus, and a repetition
   count is an observation of *this* corpus. The defence is that it is computed at read time from the tree
   in hand rather than extracted once and bundled — the same standing `WordSpecificity` has, moved from a
   published list to the corpus itself. If that defence does not hold, the item is refused and the
   duplication stays.
4. **Self-reference.** `README.md` and `BACKLOG.md` carry this reading's own figures, so every theme the
   reading reports is written back into the corpus it reports on. The fixed point is explicitly not chased —
   `CLAUDE.md` says so — but nothing measures how large the effect is. *Ships when the reading is run with
   the repository's own reports excluded and the two theme tables are printed side by side.* If the top of
   the ranking moves, every figure quoted anywhere in this tree needs that caveat attached.

**Why it is HIGH.** Prose is 37,605 of this repository's 50,723 read word occurrences — 74% of everything the
reading has to go on — and its weight is the one number in the pipeline that was picked rather than derived.
A 74% share resting on a chosen constant is where the largest unexamined error in the reading must be.

**Abandon if:** redundancy and staleness both turn out to be near-uniform across the corpus, in which case
one constant was the right model after all and the honest thing is to say so and keep it.

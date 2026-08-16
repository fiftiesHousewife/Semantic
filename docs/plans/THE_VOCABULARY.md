# The words this repository chose

`output/vocabulary.md` ranks every word of every declared name by its term of the Jensen–Shannon divergence
against two references that state their own contents. It works — the top of the ranking is `word`, `topic`,
`sense`, `concept`, `occurrences` — and five things about it are still wrong. Each is stated here with what
would settle it, ordered by what a fix costs rather than by how much it moves.

## The cutoff is picked, and it is the only one of the five that cannot be fixed locally

The report prints a fixed 250 rows. The number was chosen, and a chosen bound is the one thing the doctrine
refuses outright.

**A count is also not comparable.** 250 of this tree's 843 named words is a different slice from 250 of a
panel member's vocabulary, so no figure taken at the cutoff means the same thing on two repositories. That is
what makes it urgent rather than untidy: the panel cannot report a vocabulary until the cutoff means one
thing everywhere.

**A share of the divergence is not the answer either, and the measurement says why.** Over the published
names, 632 words carry a positive claim and 0.2705 bits between them. Half the bits are held by 50 words,
three quarters by 139, and the 250 the report prints hold 89.1%. Cutting at three quarters would therefore
drop 111 rows — and they are `arxiv`, `fibo`, `json`, `ontologies`, `translingual`, `csf`, `hypernym`,
`olia`, `skos`, `nist`, `antonymous`, `credence`, `initialism` and `segmenter`, every one written between 3
and 6 times. **A word's term of the divergence scales with how often it was written**, so a mass cutoff drops
the rarest words first, and the rarest words here are the proper nouns of every resource the library reads.
It would keep `root`, `header`, `total` and `head` and discard the vocabulary the report exists to show.
`./gradlew vocabularyMass` prints the accumulation for all three populations.

**The derived cutoff is a permutation null over the vocabulary**, which is the rule this library already
applies everywhere a winner is declared. Draw the repository's word counts against the reference under the
null that it writes the reference's distribution, take the largest claim any word attains across 999 draws,
and set the bar at the `1/(n+1)` quantile because every word is tested at once. `PermutationNull` and
`ChanceExpectedBest` are the classes; a scope is one draw there and a word is one draw here, and nothing new
is needed but the resampling unit. Words above the bar are the vocabulary; below it is what a repository of
this size and shape would have produced against these references anyway.

**Measurement:** how many words clear the bar, on this tree and on each panel member, against the 250 the
report prints today. A bar that admits nearly all 632 says the references are too weak to refuse anything; a
bar that admits under 50 says the null is drawn wrong, because `hypernym` and `skos` are not chance.

**Until then, state the denominator that is derived.** The summary line says the rows hold 63.4% of the
reading, which is the *occurrence* share; the ranking is over divergence and they hold 89.1% of that. The
second figure is bounded at one by the statistic's own definition and is what lets a reader judge a cutoff
they did not choose. It costs one line and does not wait for the null.

## A run the dictionary carries whole is being split

`PieceCost` prices candidate pieces against the 20,000-word frequency list, which carries neither
`collocated` nor `synset`, so the segmenter breaks each into pieces it can price.

| Written | Read as | In the ranking | The dictionary carries |
|---|---|---|---|
| `CollocatedWords` | col + located | `col` 14, `located` 7 | `collocate`, a verb |
| `synsetOffset` | syn + set | `syn` 12 | `synset`, a noun |
| `markdown` | mark + down | `mark` 7 | — |

**A run the dictionary carries whole is one word, whatever the frequency list says.** It is the same
open-class coverage the reading already cites at every other step, it needs no new resource and no threshold,
and it is grammar rather than vocabulary. It does not reach `markdown`, which is in neither resource.

**Measurement:** the count of declared names whose reading changes, and whether any name is made worse — a
run the dictionary carries that the author did mean as two words is the failure mode, and `metadata` is the
shape of it.

## `classpath` is the first real cost `CitedTokens.NONE` has been shown to carry

`fromClasspath` reads as from / class / path, which puts `class` 68 at 109th and inflates `path` 73 at 27th.
`classpath` is in neither WordNet nor the frequency list, so the rule above cannot reach it. This is the seam
the doctrine holds open, and it now has a live instance with a number on it rather than a hypothetical.

**Measurement:** stated in `THE_SPLITTER.md` — the count of identifiers whose reading changes when a boundary
is proposed and arbitrated, against the count that would change if it were simply applied.

## Two populations the reading answers with one rule

**A one- or two-letter word in prose is a symbol reading.** `a` 3,787 and `s` 589 stand second and fourth of
everything written, because the dictionary carries the letters of the alphabet as nouns — `a` the ampere, `e`
the base of natural logarithms. `ContentWords` states the rule and `Thresholds.shortestProseWord` holds the
figure, and its javadoc says why it cannot simply be applied here: *it applies only to words nothing chose,
and a name is offered whole however short it is, because an author writing `id` meant `id`.* So the rule
needs the population a word was written in, which `WrittenWords` already records as `namedOccurrencesOf`.
Folding it into `FunctionWords` instead would make the report state that English supplied `s`, and English
did not — the splitter broke at the possessive, which UAX #29 rules WB6 and WB7 close from the other end.

**`e` 43 stands 13th and is a parse question.** It is the catch parameter. A catch parameter is a declaration,
so the parse hands it over, and nothing citable says a one-letter name is not a chosen word. What would
settle it is the count of one-letter declared names by the kind of declaration they are: if they are almost
all catch parameters and loop indices, the parse can report them apart on the same grounds it already reads
declarations rather than uses.

## The dictionary is WordNet 3.1 and ordinary English has moved

`FunctionWords` calls a word the language's when no open class carries it and the frequency list does.
Five words defeat it: `wiki` 6, `sql` 4, `login` 2, `api` 1 and `keyword` 1, all in the frequency list at
ranks 9,688 to 14,270 and in no open class, because they entered English after WordNet's last release. That
is 17 occurrences over 8 words, one of them — `wiki`, 168th — inside the first 250 places.

It is small, and it is the failure mode to watch rather than one to fix now: **the cost grows with how modern
the repository is**, so a panel member full of `json`, `oauth`, `kubernetes` and `webhook` would lose far
more of its vocabulary than this tree does. What would settle it is a second frequency list with a later
cut-off, or a dictionary that states its own release date beside its coverage.

## The vocabulary reading does not fold published runs, though step 2 does

`part` 26 and `speech` 16 are two rows of the ranking. `CollocatedWords` already reads `part of speech` as
one word for the topical vote, over the 69,713 collocations the two bundled resources state. The vocabulary
reading is offered the splitter's words directly and never asks.

**Measurement:** the count of rows that merge, and whether the merged row outranks either of its parts —
`part of speech` should stand where neither `part` nor `speech` does.

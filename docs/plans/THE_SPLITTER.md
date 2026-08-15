# The identifier splitter, and the cited catalogues rule 4 needs

## The identifier splitter — the letter/digit boundary

**Rules 1, 2, 3 and 5 have landed** in `IdentifierWords`, alongside the ported `Tokeniser` rather than inside
it: explicit separators including the dot and dollar, the lower→upper boundary, the acronym-run boundary, and
the residual run to `WordSegmenter`. Four of the plan's five documented mis-splits now read correctly, and
`refusesALineRange` stopped reading as *refuses / aline / range*, which is what let a method name be read as a
clause at all.

Two things are left:

**Rule 4, the letter↔digit boundary — the citation exists, and it says do not break.** This was recorded as
blocked on a catalogue. It was blocked on the wrong half. [UAX #29](https://www.unicode.org/reports/tr29/)
states rules WB9 `AHLetter × Numeric` and WB10 `Numeric × AHLetter`, where `×` is defined in its own Table 1
as *do not allow break here*, under the prose "do not break within sequences of digits, or digits adjacent to
letters (`3a`, or `A3`)". Unicode publishes it as a boundary rule and states the annex "may be cited as a
normative reference by other specifications", so it is grammar of exactly the kind this library already
admits — the same sort of thing as the acronym-run rule, and not a list of tokens.

So `utf8Decode` reading as utf8 / decode is **cited today**, and the code has been obeying a published
standard while its javadoc apologised for a gap. A catalogue of cited tokens is what would be needed to
**override** that default for a particular run — never to obey it. What is left of rule 4 is therefore not a
blocker but a question with a smaller shape: which runs, if any, a published catalogue says should break
against Unicode's default.

The state of the art makes the opposite choice and shows what it costs. Ronin, the current best identifier
splitter, ships a hand-written `constants.py` of special terms containing exactly `utf8`, `ipv4` and `J2SE`,
which its own README calls "surely incomplete". That is the list this library refuses, maintained by hand,
solving the case a standards body had already ruled on.

**Byte offsets.** A token should carry the offset it began at, which is what lets a token's evidence carry a
line-accurate permalink rather than a line-accurate-to-the-declaration one.

**Measurement:** the nine-identifier table in the plan, now pinned in `TokeniserTest` so a widening shows up
as a rewritten expectation rather than as a silent change, plus the count of live identifiers whose reading
changes. **The live instances this paragraph named are gone**: `aprefix`, `asuffix`, `aword`, `acompound` and
`jwnlexception` were in the unread tail when it was written and are in none of it now, so what is left of the
splitter is rule 4 and the offsets rather than the mis-splits.

*Blocked on nothing.*

## The sequence of a name's words — landed, and what it left behind

**The topical reading reads adjacency now.** `CollocatedWords` takes the longest run a resource publishes at
each position of a phrase, left to right, with no two runs overlapping — the walk `TermSpans` already
performed over a published taxonomy, run over the collocations the two topical resources state.
`PublishedPhrases` pools those: 31,025 multi-word lemmas WordNet Domains labels and 42,865 multi-word entries
Wiktionary's topic vocabulary carries, 69,713 entries reaching 26 words. It runs before anything is offered
to a dictionary, because offering drops what it cannot read and a dropped word closes the gap between two
words the author never wrote next to each other.

**What it measured.** Over this repository, 300 of 10,886 phrases carry a published run, in 99 distinct runs.
The commonest are `part_of_speech` (41), `frequency_list` (22), `head_word` (17), `computer_science` (12),
`normal_form` (12), `noun_phrase` (11), `adjective_phrase` (10) — terms this library is written about, each
carrying one subject the resource states for the run against the several its words pool separately. The
reading settles more of what it observes than before, 75.5% of the mass unsettled against 76.1%, and
`grammar` clears the bar it had been under: it is now a topic this repository is *about*, on the strength of
`part of speech` alone, and `PinnedThemeFindings` states so.

**What nearly ended it, and the rule that answered.** The plan said to abandon this if the matches were
one-word terms adjacent by accident, and the first measurement said they were: the commonest published run in
the tree was `to the` at 78 occurrences, voting *mathematics*, with `out of` (*nautical*), `in one`
(*theater*) and `up to` behind it. A collocation dictionary states those as readily as it states `noun
phrase`. **A run is admitted only where its first and last words carry subject matter on their own** — the
same open-class coverage `ContentWords` already cites to decide which words reach the resources at all, so no
list is written and nothing new is asked of a resource. It refuses 58 distinct runs over 282 occurrences and
keeps `part of speech`, because English builds a noun phrase with a preposition inside it and the boundary of
a constituent is what says whether one was written.

**What it cost, and what is left.** The edge rule refuses a term whose first word is an adjective the reading
would not have read alone: `geometric mean`, `lexical semantics`, `lexical database`. `ContentWords` asks for
a noun or a verb, so an adjective reaches the resources only where the dictionary also carries it as a noun —
`regular expression` and `absolute value` survive by that accident and `lexical semantics` does not. Reading
adjectives is what would settle it, and it is a change to step 3 rather than to this walk. Two runs the
walk admits are wrong and say what else is unfinished: `mark down` (14) is `markdown` as the segmenter split
it, so the fold is restoring a run the splitter should never have divided, and `four hundred` is a numeral
pair the resources read as *sociology*.

**What this does not do.** λ does not move, because `LegibilityTally` counts word occurrences and a run the
topical reading takes as one word is still two words there — the two readings answer different questions and
only one of them was changed. It reads phrases the two *topical* resources publish. A published field's own
vocabulary is still matched a word at a time in step 8 by `TermSpans`, which has always read order, and
nothing yet carries a taxonomy's multi-word labels into the topical reading — 89% of FIBO's labels and 81% of
OLiA's are more than one word. That join is the next thing this makes possible rather than something it did.

## The cited catalogues — what rule 4 needs

`CitedTokens.NONE` recognises nothing, which is why `userid` currently refuses to split — `id` ranks 4690 and
a two-letter piece must rank inside 1000 to count as a word. The catalogues that fix this are published
standards extracted by named Gradle tasks and bundled with provenance headers, exactly as `sql-functions.tsv`
is:

- **Language keyword catalogues** — JLS §3.9, Python's `keyword.kwlist`, the ECMAScript reserved-word
  grammar, the Go spec's keyword list.
- **Standard-library API index** — extracted from the platform itself, not downloaded: `javap` over
  `java.base`'s exported packages, `sys.stdlib_module_names`, `module.builtinModules`.
- **`github/linguist` data** — `languages.yml`, `vendor.yml`, `generated.rb`. Verify the MIT licence at
  adoption.

**The catalogue already in the tree was tried against this and refused, with the measurement recorded in
`CitedTokenCatalogueTest`.** The Wikidata initialism registry looks like it would fill the seam in one line:
74,397 tokens, provenance-headed, CC0, already read for votes elsewhere. It carries 14,322 three-letter
tokens and 1,195 of the ten thousand commonest English words, including the ones a Java file is actually made
of — `CODE`, `DATA`, `NAME`, `TYPE`, `LIST`, `NODE`, `SIZE`. Arbitrating candidate pieces against it would
find a reading for very nearly any run of letters, which is the failure `PieceCost` holds short pieces to a
rarity floor to avoid. A registry of what readers write *for an entity* is not a statement about whether a
run of letters *in an identifier* is one thing, and the size of the catalogue is what disguises that.

The registry states a prominence per reading, so narrowing it is available and is the obvious next attempt.
It is a **bound, and a bound must be derived**: the threshold has to be fitted on repositories this reading
was not written for, which makes it one more thing waiting on the panel rather than a number to pick here.

**The keyword half is superseded and the demotion half is moot.** The parse reads declarations, so the
language's own words never arrive — they are never declarations — and neither do the platform's, which are
uses of somebody else's. `PlatformPackages` handles the one place platform names do arrive, the import
section, by asking `ModuleFinder.ofSystem()` which packages the platform exports.

What the catalogues are still needed for is **rule 4 of the splitter**, which has nothing to arbitrate with
until one exists. `utf8`, `ipv6`, `base64` and `co2` are single tokens in the catalogues that name them, and
the letter/digit split must be proposed for a citation to dispose of rather than simply applied.

**Measurement:** the count of identifiers whose reading changes when the boundary is proposed and arbitrated,
against the count that would change if it were simply applied. The difference is what the citation is buying.

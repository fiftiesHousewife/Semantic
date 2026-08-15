# The identifier splitter, and the cited catalogues rule 4 needs

## The identifier splitter — the letter/digit boundary

**Rules 1, 2, 3 and 5 have landed** in `IdentifierWords`, alongside the ported `Tokeniser` rather than inside
it: explicit separators including the dot and dollar, the lower→upper boundary, the acronym-run boundary, and
the residual run to `WordSegmenter`. Four of the plan's five documented mis-splits now read correctly, and
`refusesALineRange` stopped reading as *refuses / aline / range*, which is what let a method name be read as a
clause at all.

Two things are left:

**Rule 4, the letter↔digit boundary, proposed not applied.** Both readings go forward as candidates and a
catalogue citation decides. `utf8Decode` still reads as one token because `utf8` is a single token in the
catalogues that name it — and this repository bundles no such catalogue, so there is nothing yet to arbitrate
with. It is blocked on the item below, and deliberately: this is where a lesser design would put a list.

**Byte offsets.** A token should carry the offset it began at, which is what lets a token's evidence carry a
line-accurate permalink rather than a line-accurate-to-the-declaration one.

**Measurement:** the nine-identifier table in the plan, now pinned in `TokeniserTest` so a widening shows up
as a rewritten expectation rather than as a silent change, plus the count of live identifiers whose reading
changes. **The live instances this paragraph named are gone**: `aprefix`, `asuffix`, `aword`, `acompound` and
`jwnlexception` were in the unread tail when it was written and are in none of it now, so what is left of the
splitter is rule 4 and the offsets rather than the mis-splits.

*Blocked on nothing.*

## The sequence of a name's words — the priority

A name is split into an ordered list and then read as a bag of words. Position is used twice — the last word
of a name is its head, and the first word of a method name is its verb — and **adjacency is used nowhere**.
`PhraseTopics` collects the words that agree on a subject into a set and scores the subject by what they
agree on and how much of the name agrees, so nothing in the topical reading distinguishes `citationSource`
from `sourceCitation` beyond which of the two is head.

That order is not missing; it is produced and then dropped. `Vocabulary.IDENTIFIER.phrasesOf` yields an
ordered list per name, and `TermSpans` already reads it that way — longest published term at each position,
left to right, no two matches overlapping. **The topical reading cannot**, and the vocabularies say what that
costs: 89% of FIBO's labels and 81% of OLiA's are more than one word, so a reading that matches a word at a
time is refusing most of what a published field states about itself.

What it is, concretely: carry the sequence from the splitter through the citation step, and admit a phrase
where only a word is admitted now — `word segmenter` before `word` and `segmenter` separately, and only where
a resource publishes the phrase. It is a precursor rather than the phrase reading itself: the reading cannot
match phrases until the phrases survive step 2.

**Measurement:** the count of declared names in which a bundled vocabulary publishes an ordered multi-word
match that the single-word reading currently splits apart, and what the topical reading does with them once
it can see them. **Abandon if** the multi-word matches are almost all one-word terms adjacent by accident,
which is the failure mode a longest-match-left-to-right rule already has to defend against.

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

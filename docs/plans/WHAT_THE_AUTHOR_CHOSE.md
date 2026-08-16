# What the author chose

One question, asked of every word that reaches a reading: **did somebody choose this word to say something,
or did the language, the platform, the tool, the licence or this library's own arithmetic put it there?**

Three plans used to ask it separately — one about the splitter's grammar, one about the vocabulary ranking's
cutoff, one about the words a licence and a lemmatiser leave behind — and each answered it in a different
place, so the same word was refused twice and admitted once. They are one plan because the answer belongs in
one place: **the vocabulary reading states the partition, and every later step consumes it rather than
re-deriving it.**

Nothing below needs a list of words. Every item is either a rule about the position a name holds in the
grammar, or a question put to a resource that states its own contents — the two things the doctrine admits.
And nothing below is a gate: a word the reading did not choose keeps the place it earned and is reported
under what put it there, which is why the ranking's numbering has gaps.

---

## The partition

Four sources of a word nobody chose, and the citable thing that says so for each.

| The word arrived because | What says so | State |
|---|---|---|
| **English requires it** — `by` in `massByTopic` | A word no open class carries that the frequency list does | Landed — `FunctionWords`, 38 of 843 named words |
| **The syntax bound it** — `catch (IOException e)`, `List<Foo> getFooList()` | The position the name holds in the parse | `e` next; the restated type after it |
| **Somebody else wrote it** — the platform's API, a licence header, a Javadoc tag | The platform's own runtime, the count of files a comment appears in, Javadoc's own model of itself | Type names and Javadoc landed; method names and the header open |
| **This library manufactured it** — `ab` from `abstains`, `wa` from `was`, `s` from a possessive | A dictionary that carries the run whole, and UAX #29 | All three open, all three cheap |

---

## The order, and why it is that order

**A cleanup that changes what the ranking contains must land before any bound that cuts it, and before the
ranking is run on a repository it was not written for.** Both of those are measurements *of* the ranking, and
a bound derived over a ranking led by `ab` and `e` is a bound derived for this library's own defects. That is
the whole ordering rule; within it, cheapest first.

Two items are exceptions and can land at any point, because they cannot be seen on this tree at all: the
copied comment and the restated type are measured on Apache Tika and are invisible here.

| | Item | What it costs | The number that judges it |
|--:|---|---|---|
| 1 | A run the dictionary carries whole is one word | A seam on the segmenter and one class | **Landed.** 31 of 49 distinct runs, 134 of 266 occurrences |
| 2 | A catch parameter is not a name about a subject | One `NameForm` | **Landed.** 52 of 52 short catch parameters are `e`, and every catch parameter in the tree is `e` |
| 3 | The possessive is not a word boundary | One rule beside the acronym run | **Landed.** `s` 589 gone, and λ fell 0.992 → 0.984 because it had been counting a false citation |
| 4 | The lemmatiser stops manufacturing nouns | Preferring a stated inflection to a derived one | **Two of three landed.** `wa` 268 and `ha` 174 gone; `doe` 191 remains, and §4 says exactly why |
| 5 | A published run is one row of the ranking | The reading already computes it | **Landed.** `part_of_speech` 44th where `part` fell to 382nd and `speech` left |
| 6 | A word weighs observed against expected, never frequency alone | Replaces `WordSpecificity`'s scale | Every theme figure moves; the placement is what says whether it moved the right way |
| 7 | The cutoff is a permutation null over the vocabulary | A resampling unit | **Landed.** 259 of 859 named words clear a bar of 0.000194 bits, holding 86.5% of the divergence, where 250 had been picked |
| 8 | The ranking runs on a repository it was not written for | A clone, 37 seconds | **Landed.** 805 of 4,582 words clear Tika's bar holding 88.2% of the divergence against 86.5% here — and `get` stands first |
| 9 | Step 8 consumes the partition | The term matcher reads the ranking | Spans lost, concept by concept |
| — | A type restated in its own declaration's name | A parse pass over each declaration's own types | **21% of every OLiA span on Tika** |
| — | A comment copied into more than one file weighs `1/n` | A second pass, which `ParsedRepository` already makes | **45.1% of Tika's comment word occurrences**, 0.3% here |
| — | The platform's own method names | Unmeasured — the enumeration was too slow to sit in a test | The share of Tika's spans whose word the platform declares |

---

## 1. A run the dictionary carries whole is one word

`PieceCost` prices candidate pieces against a 20,000-word frequency list. A run that list does not carry is
broken into pieces it does, however ordinary the run is as English.

**Measured over every glued run this repository's declared names contain**: the segmenter split 49 distinct
runs over 266 occurrences, and **the dictionary carries 31 of them whole, over 134 occurrences** — more than
half of everything the segmenter did.

**On Tika it is worth four times as much, and it was mangling that repository's central concept**: 91 of 325
distinct runs over **1,375 of 3,046 occurrences**, led by `extractor` read as extract / or **244 times** on a
library whose subject is extraction, `mapper` as map / per 240, `wrapper` as wrap / per 84, `bigram` as
big / ram 75, `filename` as file / name 71, `parsing` as par / sing 52 and `append` as app / end 41.

| Written | Read as | Times | The dictionary calls it |
|---|---|--:|---|
| `abstains` | ab / stains | 22 | verb *abstain* |
| `synset` | syn / set | 15 | noun *synset* |
| `headword` | head / word | 14 | noun *headword* |
| `collocated` | col / located | 11 | verb *collocate* |
| `enclosing` | enc / losing | 7 | noun *enclosing*, verb *enclose* |
| `annotation` | an / notation | 2 | noun *annotation* |
| `permutation` | per / mutation | 2 | noun *permutation* |
| `descriptor` | de / script / or | 2 | noun *descriptor* |
| `splitter` | sp / litter | 1 | noun *splitter* |

**A run the dictionary carries whole is one word, whatever the frequency list says.** It is the same
open-class coverage the reading already cites at every other step, it needs no new resource and no threshold,
and it is grammar rather than vocabulary. It reaches the segmenter through a seam of the same shape as
`CitedTokens` and separate from it, because "a published catalogue names this token" and "a dictionary
carries this word" are two different questions and only the first should also make a *piece* cheap to read.

**What settles it:** every run in the table above reads whole. **Abandon if** it makes a reading worse — a
run the dictionary carries that the author did mean as two words is the failure mode. None of the 31 is one:
`lookup`, `superclass`, `masthead` and `wordnet` are all runs the author meant as one word and the frequency
list simply lacks.

**What it does not reach**, and what that says: 18 runs the dictionary does not carry either, `classpath`
among them at `class` 68 and `path` 73. That is the first live cost `CitedTokens.NONE` has been shown to
carry, with a number on it rather than a hypothetical.

## 2. A catch parameter is not a name about a subject

`e` stands **thirteenth** in this tree's vocabulary ranking on 43 occurrences, and nothing refuses it: the
dictionary carries `e` as a noun, so the open-class question that removes `the` and `of` admits it.

**Measured by the kind of declaration each short name stands in**: 52 catch parameters, 17 method parameters,
10 type parameters, 6 lambda parameters, 4 locals, 3 fields. **Every one of the 52 catch parameters is `e`,
and every catch clause in the tree names its parameter `e`.** The other short names are `to` 7, `id` 8,
`at` 7, `of` 1 and the type parameters `K`, `V`, `T`, `A`.

So the rule is the parse's and not a length rule. A length rule would take `id` with it, which is a name an
author meant — `Thresholds.shortestProseWord`'s javadoc already says why that rule stops at prose. A catch
clause binds a name to a type the language requires it to write immediately beside it; what the name stands
for is that type, and a type is a use, already read where it was declared. That is the declaration rule
arriving in one more place, and it costs nothing else in this tree.

**What settles it:** `e` leaves the ranking of what this repository called things, and no other word leaves
with it. **Abandon if** a repository names catch parameters descriptively and loses real words — report the
count of catch parameters whose name is more than two letters, per member.

## 3. The possessive is not a word boundary

`s` is written 589 times in this tree's prose and stands fourth of everything written, because the splitter
breaks `resource's` into resource and s, and the dictionary carries `s` as a noun.

[UAX #29](https://www.unicode.org/reports/tr29/) rules WB6 and WB7 state that a letter, an apostrophe and a
letter do not break. It is the same standard, the same table and the same operator the letter/digit rule
already cites, so this is grammar and it needs no resource.

**What settles it:** `s` leaves the prose ranking's top twenty. **Abandon if** it glues a genuine boundary —
count the identifiers whose reading changes, which should be none, since an identifier carries no apostrophe.

## 4. The lemmatiser stops manufacturing nouns — two of three closed

| Offered as | Occurrences | Rank in the frequency list | Weight it votes at | What it was |
|---|--:|--:|--:|---|
| `wa` | 268 | 4,068 | 0.839 | `was` |
| `doe` | 191 | 14,598 | **0.968** | `does` |
| `ha` | 174 | 9,792 | 0.928 | `has` |

633 occurrences. The first sighting of `ha` is *"a path **has** been edited"*.

`ContentWords` exists to refuse exactly these, by asking WordNet whether the surface has an open-class entry.
It is reached around because the lemma is taken **before** that question is asked: strip the `s`, and an
auxiliary becomes a noun WordNet does carry. The rarer the accident, the higher the weight, so the three
commonest auxiliaries in English vote harder than `taxonomy` does. Tika's reading is 77% prose, so the same
defect there is larger by the ratio of the corpora.

**WordNet's exception list is what answers it, and it answers two of the three.** The list *states* that
`was` is a form of `be` and `has` a form of `have`; `wa` and `ha` are what a suffix rule *derived* when a
caller asked for a noun. A citation outranks an inference, so a stated verb inflection is preferred over a
derived noun — and where the surface is itself a noun the dictionary indexes, `left` and `saw`, nothing was
inferred and the noun stands. `netball` has left the reading altogether, which was a topic `wa` carried
alone, and `astronomy` is now carried by `blob`, `class`, `sha`, `intensity` and `node` rather than by `ha`.

**`doe` 191 remains, and the reason is exact**: `does` is a *regular* `-es` form, so WordNet's exception list
states nothing about it and both readings are derived — strip `es` for the verb `do`, strip `s` for the noun
`doe`. The standing preference for the noun then decides it. What would settle the third is a rule for
choosing between two derived readings, and every candidate so far is a threshold rather than a statement:
preferring the commoner lemma reads `leaves` as `leave` rather than `leaf`, which is wrong in code.

**What settles the rest:** `doe` leaves the word table, and no word a WordNet open-class query would have
kept leaves with it. **Abandon if** the rule costs a real lemma — measure how many words are offered under a
different form.

## 5. A published run is one row of the ranking

`part` 26 and `speech` 16 are two rows. `CollocatedWords` already reads `part of speech` as one word for the
topical vote, over the 69,713 collocations the two bundled resources state, taking the longest run at each
position left to right with no two runs overlapping and requiring both edges to carry subject matter. The
vocabulary reading is handed the splitter's words directly and never asks.

Neither reference carries a run, so a folded run's share in both references is zero and its claim is the
largest the statistic allows. That is the correct answer and it is worth saying out loud: a term a dictionary
publishes and neither reference writes is exactly what a specialist vocabulary is.

**Measured on the published names:** `part_of_speech` stands **44th on 16 occurrences**, `part` fell from 26
occurrences to 10 and from where it stood to 382nd, and `speech` left the ranking altogether. The merged row
outranks either of its parts by an order of magnitude, which is what the run being a term rather than two
adjacent words means.

**λ does not move, and that is deliberate.** The two tallies answer different questions and only one of them
folds: λ is the share of word occurrences a resource can be cited for, and a run read as one word is still
two words written. `LegibilityTally` cites the splitter's words and records the folded ones, in two named
passes over the same phrase.

## 6. A word weighs observed against expected, never frequency alone

**A weight read off a frequency list alone is blind to how often this repository wrote the word**, and that
is the wrong half of the question. `WordSpecificity` is `log(rank) / log(size)`: it says how rare a word is
in English and nothing about whether this author reached for it. Under it, a word written once and a word
written two hundred times weigh the same, and a word this repository writes at exactly English's own rate
weighs whatever its rank happens to be rather than nothing at all.

The vocabulary ranking already does it properly — its claim is this repository's share of a word against the
reference's share of it, as a term of the Jensen–Shannon divergence, non-negative and bounded at one bit by
the statistic's own definition. **That is the same statistic, computed correctly, in a place where it does
not vote**; `WordSpecificity` is the incorrect one, computed in the place where it does. `PhraseSpecificity`
inherits it, so every term match is ranked by it too.

**What settles it:** the placement. The reading places this repository at `cs.CL` of 152 published subjects,
and a weight that is a better statement of what the author chose should not move it away. Report the
placement, the leading themes and the term ranking before and after. **Abandon if** the placement degrades —
in which case frequency alone was carrying something the ratio is not, and that is worth knowing.

**Blast radius:** every figure in `output/`. It is item 6 rather than item 1 for that reason.

## 7. The cutoff is a permutation null over the vocabulary — landed

The report printed a fixed 250 rows. The number was chosen, and a chosen bound is the one thing the doctrine
refuses outright.

**A count is also not comparable.** 250 of this tree's 843 named words is a different slice from 250 of a
panel member's vocabulary, so no figure taken at the cutoff means the same thing on two repositories. That is
what makes it urgent rather than untidy: the panel cannot report a vocabulary until the cutoff means one
thing everywhere.

**A share of the divergence is not the answer, and the measurement says why.** Over the published names, 632
words carry a positive claim and 0.2705 bits between them. Half the bits are held by 50 words, three quarters
by 139, and the 250 the report prints hold 89.1%. Cutting at three quarters would drop 111 rows — `arxiv`,
`fibo`, `json`, `ontologies`, `translingual`, `csf`, `hypernym`, `olia`, `skos`, `nist`, `antonymous`,
`credence`, `initialism` and `segmenter` among them, every one written between 3 and 6 times. **A word's term
of the divergence scales with how often it was written**, so a mass cutoff drops the rarest words first, and
the rarest words here are the proper nouns of every resource the library reads. `./gradlew vocabularyMass`
prints the accumulation for all three populations.

**The derived cutoff is a permutation null**, which is the rule this library already applies everywhere a
winner is declared. Draw a repository of this one's size under the null that it writes the reference's own
distribution, score each drawn word by the same claim the ranking uses, and set the bar where
`ChanceExpectedBest` puts it for a field of this many words — because every word is tested at once.
`PermutationNull` and `ChanceExpectedBest` are the classes; a scope is one draw there and a word is one draw
here, and nothing new is needed but the resampling unit.

**One bar per reference, and a word must clear each.** That is the ranking's own weakest-claim rule applied
to the bound: pooling the references would need a weight nothing states, and clearing each in turn needs
none.

**What it measured, on the names the build publishes.** The bar is **0.000194 bits** against ordinary
English and **0.000231 bits** against the platform's own API, drawn over 999 resamples yielding 2.4 million
and 1.5 million scored words. **259 of 859 words clear it**, holding 63.3% of what was written and 86.5% of
the divergence — where the picked cutoff was 250. Two very different rules landing ten rows apart is not the
result; the result is that this one states what it is.

**It passes both of the tests that were set for it.** A bar admitting nearly every word would say the
references are too weak to refuse anything, and one admitting under fifty would say the null is drawn wrong,
because `hypernym` and `skos` are not chance. Every word the mass cutoff would have dropped clears this one:
`arxiv`, `fibo`, `csf`, `hypernym`, `olia`, `skos`, `antonymous`, `credence`, `initialism`, `nist` and
`segmenter`, each written three to six times, each at 0.000234 or 0.000312 bits against a bar of 0.000194.

The report also states the divergence share the rows hold, which is bounded at one by the statistic's own
definition, beside the occurrence share it always quoted.

**A property worth stating, because it is what makes the bar comparable at all**: a reference concentrated on
few words sets a higher bar than one spread thin, since a word's term of the divergence scales with the share
it holds. So the two references do not have to agree on a number, and a word clears each in turn.

**What is left:** running it on a panel member, which is item 8. A cutoff that means one thing everywhere is
the reason the panel could not report a vocabulary, and it has not yet been asked to.

## 8. The ranking runs on a repository it was not written for — landed, and it found the largest defect

Apache Tika, pinned at `43cbdae6`: 2,149 Java files, λ = 0.972 over 770,028 word occurrences.

**The cutoff transfers, which is what it was derived for.**

| | Words clearing the bar | The bar, against ordinary English | Share of the divergence they hold |
|---|--:|--:|--:|
| this repository | 259 of 859 | 0.000194 bits | 86.5% |
| Tika `43cbdae6` | 805 of 4,582 | 0.000020 bits | 88.2% |

The row count differs by a factor of three and the share of the divergence agrees to within two points. A
picked count could not have done that, and it is what was stopping the panel from reporting a vocabulary.

**The subject matter comes through**: `metadata` 2nd, `config` 3rd, `parse` 5th, `tika` 6th, `xhtml` 13th,
`json` 15th, `extract` 16th, `emit` 17th, `embedded` 23rd, `pipes` 24th, `detect` 26th.

**And `get` stands first.** 2,652 occurrences, 2.80% of everything Tika declared, the largest claim of all
4,582 words — with `set` 21st at 1,343, and `name` 4th, `max` 8th, `id` 9th, `length` 10th, `start` 12th,
`num` 18th, `count` 22nd, `b` 25th, `index` 27th, `size` 28th and `len` 30th behind them. The reason no
reference refuses them is exact: `PlatformVocabulary` asks `ModuleFinder.ofSystem()` for the **type** names
the platform exports, and these are **method** names. The platform declares them thousands of times and the
reference cannot see one.

**This tree could never have shown it.** `get` is never written as a declared name here at all, because this
codebase declares no getters. The defect that dominates the out-of-domain member's ranking is invisible on
the tree the reading was developed against, which is the whole argument for a panel in one line.

**Two more, both the splitter's**: `tis` 498, first seen at `TikaCLI.java:196` where `TikaInputStream` is
abbreviated, and `mill` 323, which is `millis` broken at a boundary the frequency list cannot price.

**A member costs 37 seconds to fetch.** `git init`, `git fetch --depth 1 origin <sha>`, `git checkout
FETCH_HEAD` — 442 MB for Tika. Adding `--filter=blob:none` makes it *slower*, 87 seconds, because the filter
defers each blob and the checkout then fetches 2,149 files one round trip at a time.

## 9. Step 8 consumes the partition

`TermSpans` matches a published taxonomy's concepts against declared names and has never been told which
words of those names the author chose. It re-derives nothing and asks nothing: `Set` 1,754 and `List` 966 on
Tika are 21% of every span, and both are words the platform declares and the vocabulary reading already sorts
past 670th of 838.

**One hazard, and the term reading already names it.** Dropping a word from the middle of a name closes a gap
between two words that were never adjacent, so a term matched across that gap is one this library
manufactured. A word the partition places outside the author's choices must be **marked** rather than
removed, so the topical reading can decline to count it while the span walk keeps its positions.

**Measurement:** spans lost, concept by concept, on both trees. **Abandon if** it removes a name whose author
plainly meant the word — `TokenList` as a declared *type* is the author naming a thing, not restating a type.

---

## The two that cannot be seen on this tree

### A type restated inside its own declaration's name

`List<Foo> getFooList()` names `List` twice, and the second one is the return type spelled again. Same for
`Set<String> mimeSet`, `Map<String, Integer> countMap`, `Exception parseException`.

Against OLiA on Tika: `Set` 1,754 spans and `List` 966 — together **21% of every span the vocabulary finds**
— and not one is a type *use* leaking through the parse. The sites are `PDFParserConfig`'s setters and
`OneNoteHeader`'s fields. It is Java's naming conventions colliding with ordinary English nouns a taxonomy
happens to claim, which is why neither the declaration rule nor the depth reading touches it.

The parse can state it with no list: for each declaration, the simple names of the types it names — return
type, parameter types, field type, and their type arguments. A word of the declared name that repeats one of
them is the type quoted. It must mark rather than remove, for the reason item 9 gives.

### A comment copied into every file is written once and counted once per copy

| Read against | Java files | Comment word occurrences | In a comment whose text appears in more than one file |
|---|--:|--:|--:|
| this repository | 379 | 46,900 | 148 — **0.3%** |
| Tika `43cbdae6` | 2,149 | 573,224 | 258,326 — **45.1%** |

The Apache licence header sits in **2,140 of Tika's 2,149 Java files**, 115 words each, and alone contributes
`license` 19,287, `apache` 6,436, `distributed` 6,434, and `law`, `compliance`, `warranties`, `permissions`,
`governing`, `conditions`, `applicable` and `obtain` at 2,142 apiece. Tika's second theme is that header.
**Tika is not about law.**

**The fix is a weight and not a gate**, which is the doctrine's own precedent. A comment whose text appears in
*n* files was written once, so it weighs `1/n`. It is derived from the tree in hand, bounded in `(0, 1]` by
its own definition, and needs no bundled resource. `ParsedRepository` already reads in two passes.

**What settles it:** Tika's `law` leaves the reported themes, and this repository's figures move by no more
than the 0.3% the measurement predicts. **Abandon if** it removes a comment a single author genuinely wrote
in two files and that removal changes a reported theme.

### The platform's own method names

`set` as a setter's verb echoes no type, and neither do `get`, `is`, `has`, `to`, `from`, `of`, `new`,
`builder`, `factory`, `iterator`.

**A hand-written list of Java convention words is what the doctrine refuses**, and `VocabularyProvenanceTest`
would require it to carry a Source line naming this project — the same status `panel.tsv` carries, which says
outright that it is a fixture and never votes. So the list cannot be written and also vote.

The route that is open is the one `PlatformPackages` already takes: **where a standard's own runtime can be
asked, ask it.** It is already taken for *type* names — `PlatformVocabulary` reads `ModuleFinder.ofSystem()`,
and it is why `get` never appears as a declared name in this tree's ranking and `set` 19, `value` 26, `map`
3, `object` 3, `list` 1 and `string` 1 all sort past 670th of 838. What is missing is the *method* names, and
the enumeration was started and abandoned because reflecting over every exported class was too slow to sit
inside a test; reading type names from `ModuleReader.list()` without loading the classes is the cheap half.

**What settles it:** the share of Tika's OLiA spans whose word the platform itself declares. **Abandon if**
it also claims words the platform declares only incidentally and that a repository plainly chose — the JDK
declares a `Character`, and Tika's `Character` is a real match against a linguistic ontology.

---

## What the splitter still owes, beyond the partition

**The letter/digit boundary is closed.** UAX #29 rules WB9 and WB10 state `AHLetter × Numeric` and
`Numeric × AHLetter`, where `×` is *do not allow break here*. So `utf8Decode` reading as utf8 / decode is
cited grammar, and a catalogue is what would **override** that default for a particular run rather than what
was needed to obey it. Two documents claimed `Tokeniser` splits on digit boundaries; its splitter is
`(?<=[a-z])(?=[A-Z])|[_-]` and never has.

**Byte offsets.** A token should carry the offset it began at, which is what lets a token's evidence carry a
line-accurate permalink rather than a line-accurate-to-the-declaration one.

**The adjective edge.** A published run whose first word is an adjective the reading refuses alone is refused
with it: `geometric mean`, `lexical semantics`, `lexical database`. `ContentWords` asks for a noun or a verb,
so an adjective reaches the resources only where the dictionary also carries it as a noun — `regular
expression` and `absolute value` survive by that accident. It is a change to step 3 rather than to the walk.

**The cited catalogues, and the one already in the tree that was refused.** `CitedTokens.NONE` recognises
nothing, which is why `userid` refuses to split — `id` ranks 4690 and a two-letter piece must rank inside
1000. The catalogues that would fix it are published standards extracted by named Gradle tasks and bundled
with provenance headers, as `sql-functions.tsv` is: language keyword tables, a platform API index, and
`github/linguist`'s data files.

The Wikidata initialism registry looks like it would fill the seam in one line — 74,397 tokens,
provenance-headed, CC0, already read for votes elsewhere. `CitedTokenCatalogueTest` measures why it does not:
14,322 three-letter tokens and 1,195 of the ten thousand commonest English words, including the ones a Java
file is actually made of — `CODE`, `DATA`, `NAME`, `TYPE`, `LIST`, `NODE`, `SIZE`. Arbitrating candidate
pieces against it would find a reading for very nearly any run of letters. The registry states a prominence
per reading, so narrowing it is the obvious next attempt, and it is a **bound, so it must be derived** — on
repositories this reading was not written for.

`Tokeniser` itself remains the narrow schema-identifier grammar, ported unchanged and known to be too narrow:
it mis-splits `XMLHttpRequest`, `parseHTTPResponse`, `toJSONString`, `getDSLContext` and `IPv6Address`. The
class javadoc names each and `TokeniserTest` pins each, so widening it is a deliberate change to a stated
expectation rather than an accident.

---

## What has landed

- **A word English put inside a name is told from a word the author chose.** `by` stood fourth of 843 named
  words, and both references argued for it: ordinary English writes it at 0.5613% against 2.70% here, and the
  platform's own API at 0.0151%. `FunctionWords` answers it from two bundled resources and no list — a name
  names a thing, an action, or a property of one, and a word the dictionary places in none of the three that
  the frequency list carries is one the language supplied. 38 of 843 named words are the language's.
- **Javadoc's own syntax is not read as the author's prose.** `JavadocProse` reads a javadoc through
  JavaParser's own model: a block tag's name is Javadoc's, a `@param` tag's name is a parameter already read
  where it was declared, and what an inline tag points at is a use. On Tika that removes `param` 2,768,
  `code` 2,195, `link` 1,729, `return` 1,430, `throws` 746, `see` 343 and `since` 244.
- **The platform's own type names are a reference the ranking is read against.** `PlatformVocabulary` reads
  `ModuleFinder.ofSystem()` and splits the type names by the same grammar this repository's names are split
  by, which is what refuses `set`, `value`, `map`, `object`, `list` and `string` where a frequency list of
  English would have argued *for* five of the six.
- **A doc comment's HTML, a package read once per file, and a toolchain import** all left the corpus: `<p>`,
  `<em>` and `<b>` were arriving as the words p, em and b over 778 occurrences; `semantics` was counted once
  per Java file against 30 packages; and `junit`, `assertj` and `j2html` are what the repository is checked
  with rather than what it is about. λ moved from 0.984 to 0.992.
- **A name's words are read in the order they were written.** `CollocatedWords` folds a published run into
  one word for the topical vote, and the edge rule — a run must begin and end on a word carrying subject
  matter — is what made it usable: the first measurement's commonest run was `to the`, voting *mathematics*
  78 times.
- **The identifier splitter's rules 1, 2, 3 and 5 landed** in `IdentifierWords` beside the ported tokeniser:
  the dot and dollar as separators, the lower→upper boundary, the acronym-run boundary, and the residual run
  to `WordSegmenter`. `carriesAPrefix` read as carries / aprefix and `JWNLException` as jwnlexception; both
  are gone.

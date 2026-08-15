# What the author wrote, and what the language, the tool and the licence put there

The reading turns on one rule: read declarations, not uses. The parse enforces it for names, and it was never
enforced anywhere else. Everything below is the same rule arriving somewhere it had not reached — a comment
pasted into every file, a tag name Javadoc requires, a type spelled twice, an auxiliary a lemmatiser turned
into a noun. None of it needs a word list; all of it is structure a parse or a published resource can state.

**Every figure here is measured, on this repository and on Apache Tika pinned at `43cbdae6`.** The two trees
disagree so sharply on the first item that it is worth saying why up front: this repository carries no
boilerplate headers, so the largest defect in the reading **cannot appear on the tree the reading was
developed against**. It is the clearest example so far of what the doctrine means by not marking your own
homework.

---

## 1. A comment copied into every file is written once, and votes once per copy

| Read against | Java files | Comment word occurrences | In a comment whose text appears in more than one file |
|---|--:|--:|--:|
| this repository | 379 | 46,900 | 148 — **0.3%** |
| Tika `43cbdae6` | 2,149 | 573,224 | 258,326 — **45.1%** |

The Apache Software Foundation licence header sits in **2,140 of Tika's 2,149 Java files**, 115 words each.
It alone contributes `license` 19,287, `apache` 6,436, `distributed` 6,434, and `law`, `compliance`,
`warranties`, `permissions`, `governing`, `conditions`, `applicable` and `obtain` at 2,142 apiece.

That is where Tika's second theme comes from. The reading reports `law` at ι = 0.0257 carried by `license`
10,825 and `compliance` 2,148, and reports `apache` 7,028 carrying `geography`. **Tika is not about law.** A
legal instrument required by its foundation is pasted into every file, and the reading counted it 2,140
times.

**The fix is a weight and not a gate**, which is the doctrine's own precedent — a generator marker demotes a
file rather than erasing it. A comment whose text appears in *n* files was written once, so it weighs
`1/n`: the ASF header then counts once for the whole repository, which is exactly how many times somebody
wrote it. A comment unique to a file weighs 1. It is derived from the tree in hand, bounded in `(0, 1]` by
its own definition, and it needs no bundled resource — a within-reading statistic of the same kind as the
permutation null, not a curated observation shipped in a jar.

`ParsedRepository` already reads in two passes, because an import can only be sorted once every package the
repository declares has been seen. Which comments are shared is the same shape of question and belongs in the
same second pass.

**What settles it:** Tika's `law` must leave the reported themes, and this repository's figures must not move
by more than the 0.3% the measurement above predicts. **Abandon if** it removes a comment a single author
genuinely wrote in two files and that removal changes a reported theme — in which case the weight is right
and the threshold of *more than one file* is wrong.

## 2. The lemmatiser turns three auxiliaries into rare nouns, at near-maximum weight

Measured on this repository, from the words the reading actually offered to the resources:

| Offered as | Occurrences | Rank in the frequency list | Specificity it votes at | What it was |
|---|--:|--:|--:|---|
| `wa` | 268 | 4,068 | 0.839 | `was` |
| `doe` | 191 | 14,598 | **0.968** | `does` |
| `ha` | 174 | 9,792 | 0.928 | `has` |

633 occurrences in a 381-file repository. The first sighting of `ha` is *"a path **has** been edited"*.

`ContentWords` exists to refuse exactly these words, by asking WordNet whether the surface has an open-class
entry — which is how the reading avoids a stop list. It is evaded because the lemma is taken **before** that
question is asked: strip the `s`, and an auxiliary becomes a noun WordNet does carry. The rarer the accident,
the higher the weight, so the three commonest auxiliaries in English vote harder than `taxonomy` does.

Tika's reading is 77% prose, so the same defect there is larger by the ratio of the corpora.

**What settles it:** `wa`, `doe` and `ha` leave the word table, and no word a WordNet open-class query would
have kept leaves with them. **Abandon if** asking the question on the surface first costs a real lemma —
measure how many words are offered under a different form.

## 3. A type restated inside its own declaration's name is that type quoted

`List<Foo> getFooList()` names `List` twice, and the second one is not a word the author chose — it is the
return type spelled again. Same for `Set<String> mimeSet`, `Map<String, Integer> countMap`,
`Exception parseException`. The type is a use, already read wherever it was declared.

The measured size of it, against OLiA on Tika: `Set` 1,754 spans and `List` 966 — together **21% of every
span the vocabulary finds** — and not one of them is a type *use* leaking through the parse. The sites are
`PDFParserConfig`'s setters (`setSortByPosition`, `setWordSeparator`) and `OneNoteHeader`'s fields
(`fcrLegacyFreeChunkList`, `fcrHashedChunkList`). It is Java's naming conventions colliding with ordinary
English nouns a taxonomy happens to claim, which is why neither the declaration rule nor the depth reading
touches it.

The parse can state it with no list: for each declaration, the simple names of the types it names — return
type, parameter types, field type, and their type arguments. A word of the declared name that repeats one of
them is the type quoted.

**One hazard, and the term reading already names it.** Dropping a word from the middle of a name closes a gap
between two words that were never adjacent, so a term matched across the gap would be one this library
manufactured. The word must be **marked** rather than removed, so the topical reading can decline to count it
while the span walk keeps its positions.

**What settles it:** `Set` and `List` leave the leading terms of the Tika reading, and the number of matched
spans this repository loses is reported concept by concept. **Abandon if** it removes a name whose author
plainly meant the word — `TokenList` as a declared *type* is the author naming a thing, not restating a type.

## 4. The rest of Java's own vocabulary: ask the platform, do not write a list

`set` as a setter's verb is not covered by anything above: it echoes no type. Nor are `get`, `is`, `has`,
`to`, `from`, `of`, `new`, `builder`, `factory`, `iterator`.

**A hand-written list of Java convention words is what the doctrine refuses**, and `VocabularyProvenanceTest`
would require it to carry a Source line naming this project — the same status `panel.tsv` carries, which
says outright that it is a fixture and never votes. So the list cannot be written and also vote.

The route that is open is the one `PlatformPackages` already takes: **where a standard's own runtime can be
asked, ask it.** `ModuleFinder.ofSystem()` yields every type in every exported package, and those types yield
their own method names. `set`, `get`, `list`, `result`, `object`, `exception`, `string`, `first`, `next`,
`size`, `iterator` are all names the platform declares. That is the platform stating its own vocabulary: no
bundled file, no provenance header, current with whatever JDK is running, and pointable at any classpath —
configurable in the only sense that survives review.

**Unmeasured.** The enumeration was started and abandoned because reflecting over every exported class was
too slow to sit inside a test; reading type names from `ModuleReader.list()` without loading the classes is
the cheap half and covers the type names but not the method names.

**What settles it:** the share of Tika's OLiA spans whose word the platform itself declares. **Abandon if**
it also claims words the platform declares only incidentally and that a repository plainly chose — the JDK
declares a `Character`, and Tika's `Character` is a real match against a linguistic ontology.

## 5. Articles, forms of *to be*, and prepositions are still in the table

From the words this repository offered: `the` 657 at rank 1, `one` 810 at 39, `it` 555 at 14, `are` 336 at
15, `from` 124 at 20, `and` 112 at 3, `not` 98 at 27, `that` 86 at 9, `over` 122 at 69, `here` 127 at 203.

They vote at low weight, because specificity is `log(rank)/log(size)` and rank 1 is worth 0 — so this is not
the defect that items 1 to 3 are. But it is not nothing either: they are among the most frequent entries in
the table, and item 2 shows the mechanism meant to remove them is reachable around.

**The mechanism already exists and should not be replaced by a list.** `ContentWords` asks WordNet for an
open-class entry, which is what refuses the words English uses to hold a sentence together without any stop
list existing. What is not established is where it is and is not applied: `OfferedWords.of()` offers a chosen
name whether or not a dictionary knows it, which is right for `mimeSet` and wrong for `the`.

**What settles it:** each of those words leaves the offered table, and λ is reported before and after so the
denominator's movement is visible rather than absorbed. **Abandon if** removing them moves any reported theme
by more than the rounding the report prints — in which case they were carrying a reading, and that is worth
knowing.

## 6. A word whose sense in code is not the sense the dictionary ranks first

This one is not a leakage of another language's vocabulary; it is English read in the wrong sense, and the
out-of-domain reading is what made it visible. From Tika's scope tables:

| Word | Times | What it carries there |
|---|--:|---|
| `pipe` | 1,312 | `hydraulics`, at 10.9% of one scope's divergence |
| `detector` | 1,230 | `electrotechnology`, at 11.4% of another |
| `stream` | 1,743 | `geography` |
| `root` 470, `log` 491, `tree` 114, `stub` 82 | | `plants` |

Every one is a word a programmer uses in a sense a general dictionary does not rank first, and `tika-pipes`
is a module name rather than plumbing. It belongs to `SENSE_DISAMBIGUATION` and is recorded here because it
was found in the same pass: what a repository outside the reading's development tree gives is a list of
concrete failures to judge a disambiguation against, which this repository could not supply.

## 7. What an import is, in words

Imports cast no vote today — `OfferedWords.of()` returns nothing for `NameForm.IMPORT` — so `junit`,
`assertj` and `j2html` are absent from the 2,055 words this repository offers. They appear only in the
**legibility tail**, as words nothing could be cited for, which inflates λ's denominator without changing a
theme. Whether that is right is a separate question: λ claims to be the share of what was written that can be
cited, and an import was written.

The opportunity is the other direction. **A coordinate denotes exactly one artefact, so nothing needs
disambiguating** — and Maven Central publishes a POM per artefact carrying that artefact's own
`<description>`. A repository's dependencies could then be read as prose its authors did not write but did
choose. That is `DEPENDENCIES_AS_DOMAIN`'s premise; what is new here is the source of the text. The missing
piece is the import-to-coordinate mapping, which a build already knows for itself.

---

## What has been done

**Javadoc's own syntax is no longer read as the author's prose.** `JavadocProse` reads a javadoc through
JavaParser's own model of it: block-tag names are Javadoc's, a `@param` tag's name is a parameter already
read where it was declared, and what an inline tag points at is a **use** — the declaration rule arriving
inside prose. On Tika that removes `param` 2,768, `code` 2,195, `link` 1,729, `return` 1,430, `throws` 746,
`see` 343 and `since` 244. `JavaSourceTest`'s pinned expectation was rewritten deliberately, because a
javadoc now arrives trimmed and without its tags.

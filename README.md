# code-semantics

A codebase is a corpus of names. This library reads a **repository** the way a data-inference engine reads a
datasource: it turns identifiers into words, cites each word to a published dictionary, pools the citations
as weighted votes, and stores the result as a graph in which every node and every edge names the line that
evidenced it.

It reads at three levels — the repository, the pull request and the commit — over code and over the prose
that surrounds it, and it answers questions of the form *what is this scope about, compared with that one*.

The full design is [`docs/CODE_SEMANTICS_LIBRARY_PLAN.md`](docs/CODE_SEMANTICS_LIBRARY_PLAN.md).

---

## The governing rule

**Every signal is a weighted vote from a citable derived resource. No hand-written vocabulary, no exclusion
list, no gate.**

A reading that cannot cite a source abstains, and abstention carries zero weight rather than a zero-valued
vote. A rule that must dominate expresses as a high-magnitude signed vote, never as an out-of-band override,
so a resolved reading is a pure function of its recorded votes and the trail explains itself.

Four consequences that shape the code:

- **A refutation is evidence.** Evidence mass sums the absolute weight cast, so a vote *against* still counts
  as something having been said. Only a total absence of evidence abstains.
- **A citation outranks an assertion.** Cited readings are consulted before any structural heuristic.
- **A bound is derived, never chosen.** Every statistic the library reports has a maximum that follows from
  its definition — a share bounds itself at 1; a Jensen–Shannon divergence bounds itself at 1 bit.
- **Attribution is a type, not a convention.** A vote requires a `SourceAnchor`, so an unattributed vote
  cannot be constructed.

## What it does not do

It does not judge code quality. It does not authenticate, clone or fetch — it is handed a local clone path
and a `RepositoryFacts` record another process assembled. It does not resolve types by default, because a
library that requires a buildable repository cannot analyse most repositories. It does not rank concepts
without a reference, because a single-scope ranking is a weak reading and a divergence against a stated
reference is a strong one. And it does not delete evidence: orphaned commits after a force-push, tokens
nothing could read, and blobs with zero legibility all stay in the graph, because what was observed and not
understood is a finding.

---

## Modules

| Module | Holds |
|---|---|
| `lexicon` | The bundled lexical resources and the readers over them — WordNet via extjwnl, Wiktionary abbreviations and topics, Wikidata names and initialisms, the DuckDB function catalogue. A verbatim port; see below. |
| `lexicon-extraction` | The Gradle tasks that regenerate those resources from their published sources. This is where the plan's new catalogues — language keyword tables, standard-library API indexes, `github/linguist` data — belong. |
| `code-semantics-api` | Model records, stage contracts and the identifier-reading grammar: the attributed evidence trail, `SourceAnchor`, `RepositoryFacts`, the pooled log-odds arithmetic, the tokeniser, and the word segmenter with its cost model and morphology. |
| `code-semantics-engine` | The reading pipeline: the pooled accumulator, the legibility reading the self test runs, and the twelve stages of the plan as they land. |

`build-logic/` holds the convention plugins (`cs.java-conventions`, `cs.java-library`, `cs.maven-publish`,
`cs.aggregate-tasks`). Module build files stay minimal by design.

### The `lexicon` module is a port

It is copied verbatim from the Business Intelligence project, package names (`org.fifties.housewife.bi.lexicon`)
included, so that a fix in either repository transfers as a straight diff. Prefer re-syncing it over diverging
it; if it must diverge, say so in the module's own README rather than silently.

Its resources total roughly 34 MB and each file carries a `#` provenance header naming its source and
licence. **A bundled resource without a provenance header is a build failure**: `VocabularyProvenanceTest`
ports across with the module and covers both resource directories. Its sibling — the reachability contract,
that every bundled resource is named by production bytecode and that bytecode by something else — needs a
classpath scanner and is in the backlog rather than the tree.

`sql-functions.tsv` is the precedent every catalogue this library adds must follow. Its own header states the
principle: *a schema token equal to a function's name is a fact about the standard this tool executes rather
than an observation of any corpus.*

Every bundled file's declared source and licence is summarised in [`NOTICE.md`](NOTICE.md), including one gap
stated rather than papered over: WordNet arrives through `extjwnl` on the classpath, and neither the Princeton
licence nor extjwnl's EPL/LGPL is stated in this repository yet.

---

## Building

```bash
./gradlew checkAll          # every module's tests and coverage floor
./gradlew selfRead          # read this repository with the library and print the report
./gradlew build             # jars
./gradlew dependencyUpdates # available dependency upgrades
```

Java 21 toolchain, `-Xlint:all -Werror`, Error Prone, JaCoCo at an 80% instruction floor on every module
(measured: 97.5% / 96.7% / 92.4% / 89.0% instructions).

---

## The self test

`./gradlew selfRead` points the library at this repository and reports the one statistic it can take of itself
with what is in the tree today: **legibility λ**, the share of the code's own word occurrences that at least
one bundled resource can be cited for. The report lands at
`code-semantics-engine/build/reports/self-reading/self-reading.md`; the run below is on the tree at the commit
this README ships in.

Read the limits before the number. It is a **lexical scan of a working tree**, and every word of that is a
constraint: no parse, so no reading belongs to a declaration; no git read, so nothing is pinned by a commit
SHA and no permalink is rendered; no votes, because a vote requires an anchor and an anchor requires a
revision. It counts, cites and abstains. The `package` and `import` sections are stepped over — a rule about
where a name sits, not about what one means, because those lines are a file's coordinates rather than its
vocabulary. Comments are stepped over too: prose is evidence in its own right and counting it here would
flatter a figure that is about what the *code* is written in.

| Scope | Files | Identifiers | The language's own | The author's words | Read | λ |
|---|--:|--:|--:|--:|--:|--:|
| `code-semantics-api/src/main/java` | 24 | 1,627 | 451 (27.7%) | 1,793 | 1,756 | **0.979** |
| `code-semantics-api/src/test/java` | 13 | 1,743 | 281 (16.1%) | 3,056 | 2,886 | **0.944** |
| `code-semantics-engine/src/main/java` | 20 | 1,927 | 497 (25.8%) | 2,110 | 2,084 | **0.988** |
| `code-semantics-engine/src/test/java` | 12 | 1,818 | 296 (16.3%) | 2,850 | 2,812 | **0.987** |
| `lexicon-extraction/src/main/java` | 16 | 2,242 | 545 (24.3%) | 2,377 | 2,339 | **0.984** |
| `lexicon-extraction/src/test/java` | 10 | 1,223 | 220 (18.0%) | 1,773 | 1,743 | **0.983** |
| `lexicon/src/main/java` | 11 | 2,665 | 696 (26.1%) | 2,880 | 2,832 | **0.983** |
| `lexicon/src/test/java` | 10 | 1,355 | 151 (11.1%) | 2,316 | 2,291 | **0.989** |
| **repository** | 116 | 14,600 | 3,137 (21.5%) | 19,155 | 18,743 | **0.978** |

The author's words are 19,155 occurrences of 1,090 distinct surfaces, 328 of them (30.1%) written exactly
once. 408 glued runs no boundary divided were read by the segmenter; 412 occurrences across 101 surfaces
nothing could be cited for at all. Reading 116 files cost 0.2 s, recorded rather than estimated.

**21.5% of identifier occurrences are the language's own words**, cited to
`javax.lang.model.SourceVersion` — the platform's own implementation of JLS §3.9 — so the demotion the plan
asks for is already made by citation rather than by a list. It is not the same measurement as the plan's
13.5%, and the difference is the denominator: that figure was keywords as a share of *word* occurrences across
931 files, this one is keywords as a share of *identifier* occurrences with the import section stepped over.
Both are reported with what they divide by, which is the only way either is worth quoting.

### Which resource carried it

Shares overlap by construction — a word both WordNet and the frequency list carry is counted under each — so
they do not sum to one and are not presented as if they did. The last column is what answers the question the
shares cannot: what the reading would lose if that resource were withdrawn.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 17,485 | 91.3% | 154 |
| `lexicon:wordnet-sense` | 15,316 | 80.0% | 364 |
| `lexicon:wiktionary-topic` | 14,576 | 76.1% | 79 |
| `lexicon:wordnet-domain` | 10,336 | 54.0% | 17 |
| `lexicon:wikidata-initialism` | 7,611 | 39.7% | 32 |
| `lexicon:wiktionary-abbreviation` | 5,623 | 29.4% | 0 |
| `lexicon:wikidata-name` | 5,547 | 29.0% | 2 |
| `catalogue:query-language-function` | 1,371 | 7.2% | 2 |

Two of those readings are deliberately broad. The name registry knows Self and Ray as surnames however
ordinary they read as words, and the initialism registry knows a great many three-letter capitals tokens —
which is exactly why the last column matters: **the name registry carries 29.0% of the corpus and exactly 2
occurrences on its own.** Withdrawing it would move λ by 0.0001. A λ of 0.978 that rested on a surname list
would be a bad number dressed as a good one, and this table is how a reader can tell that it does not.

### What nothing could read

The tail is the finding, not the residue — what a repository wrote that no published resource covers, kept
because a design which silently drops it can never be asked the question. The top of it:

| Word | Occurrences | First seen |
|---|--:|---|
| `wiktionary` | 63 | `EvidenceSource.java:41` |
| `segmenter` | 62 | `WordSegmenter.java:25` |
| `tokeniser` | 24 | `Tokeniser.java:21` |
| `charsets` | 17 | `WordRanks.java:55` |
| `unmodifiable` | 17 | `CitedWords.java:42` |
| `tokenise` | 16 | `Tokeniser.java:29` |
| `aprefix` | 10 | `WordMorphology.java:43` |
| `asuffix` | 10 | `WordMorphology.java:43` |
| `jwnlexception` | 10 | `WordNetAbbreviations.java:59` |
| `unparseable` | 10 | `CompoundParses.java:58` |
| `aword` | 9 | `PieceCostTest.java:26` |

It names three separate defects, each already in the backlog and each now carrying a measurement:

1. **`aprefix`, `asuffix`, `aword`, `acompound`, `jwnlexception` are the tokeniser's missing rules, caught in
   live code.** `carriesAPrefix` reads carries / aprefix because there is no acronym-run boundary and no rule
   for a single capital before a word; `JWNLException` reads jwnlexception for the same reason. The narrowness
   was already documented in `Tokeniser`'s javadoc and is now pinned by a test — and the self test found
   instances of it in this repository's own names, which is the difference between a known limitation and a
   measured one.
2. **`charsets` and `unmodifiable` are the missing catalogues.** They are fragments of `StandardCharsets` and
   `unmodifiableList` — names the platform published, which a standard-library API index extracted from the
   platform itself would cite whole and demote as the platform's vocabulary rather than leave for the
   frequency list to fail on. Nothing here should be fixed by widening a word list.
3. **`wiktionary`, `segmenter`, `tokeniser`, `tokenise`, `permalink`, `vendored` are the honest abstentions.**
   Proper nouns of the resources themselves, British-spelled derivations the Leipzig list does not carry, and
   domain words. A reading that guessed at these would be inventing evidence; abstention is the correct
   outcome, and the graph recording that they were *seen and not read* is the point.

The number to hold onto is not λ. It is that λ is reported with its denominator, its per-resource support and
its tail, so a consumer can see how thin a reading is before using it — which is what the plan means by
reporting legibility beside intensity rather than instead of it.

---

## What it reads this repository as

The same command reports the second reading: **which subjects this codebase's names belong to**, from the
two bundled resources that place a word in a subject — WordNet Domains, which labels each of a word's senses,
and Wiktionary's topic vocabulary, which labels the headword. Each word occurrence commits one unit of mass
per resource, divided among the readings that resource names, so an ambiguous word does not shout. The report
is at `code-semantics-engine/build/reports/self-reading/themes.md`, and
`python3 docs/self-reading/build_themes_page.py` turns its export into a page.

| Theme | ι | References | Leads | Lines led | Share | Carried by |
|---|--:|--:|--:|--:|--:|---|
| `mathematics` | 0.0592 | 13,811 | 54 | 4,165 | 43.8% | `assert` 841 · `string` 807 · `map` 734 |
| `sciences` | 0.0474 | 15,805 | 13 | 1,023 | 10.8% | `assert` 841 · `string` 807 · `that` 701 |
| `linguistics` | 0.0337 | 3,831 | 21 | 1,367 | 14.4% | `word` 900 · `lexicon` 298 · `reading` 296 |
| `law` | 0.0320 | 3,498 | 19 | 717 | 7.5% | `string` 807 · `evidence` 416 · `file` 304 |
| `music` | 0.0276 | 3,877 | 4 | 225 | 2.4% | `string` 1,614 · `set` 464 · `topic` 378 |
| `pure_science` | 0.0210 | 1,124 | 16 | 1,050 | 11.0% | `assert` 841 · `class` 83 · `size` 60 |

**Read that table as the weak reading it is, and the witnesses are why you can.** `linguistics` is right —
this repository is about words. `mathematics` leading 43.8% of its lines is `set`, `map` and `assert`;
`music` is `string`; further down, `jewellery` is `string` and nothing else. The resources are not wrong
about English. The reading is asking what a word means with nothing around it, and a word alone is
ambiguous — which is the failure the plan names in §16 and answers with a comparison rather than a count.

### The comparison, which is the reading worth acting on

A theme written at the same density everywhere contributes almost nothing to a divergence, so the ambiguity
that dominates a count cancels. Each source set is compared with the whole repository by Jensen–Shannon
divergence — bounded at 1 bit by its own definition, symmetric, and additively decomposable, so each theme's
share of the difference is itself a bounded share. Then each divergence is judged against the field a scope
of **its own size** draws by chance: 999 resamples of the same number of files, drawn from the repository.

| Scope | Divergence | Null median | Excess | Chance draws at least as far |
|---|--:|--:|--:|--:|
| `code-semantics-api/src/main/java` | 0.0420 | 0.0119 | +0.0301 | 0 of 999 |
| `code-semantics-api/src/test/java` | 0.0523 | 0.0219 | +0.0304 | 0 of 999 |
| `code-semantics-engine/src/main/java` | 0.0278 | 0.0062 | +0.0215 | 0 of 999 |
| `code-semantics-engine/src/test/java` | 0.0258 | 0.0124 | +0.0133 | 0 of 999 |
| `lexicon-extraction/src/main/java` | 0.0526 | 0.0181 | +0.0346 | 0 of 999 |
| `lexicon-extraction/src/test/java` | 0.0464 | 0.0276 | +0.0188 | 24 of 999 |
| `lexicon/src/main/java` | 0.0480 | 0.0254 | +0.0226 | 6 of 999 |
| `lexicon/src/test/java` | 0.0519 | 0.0277 | +0.0242 | 11 of 999 |

Every scope stands outside its own null, so every ranking below it is printed; a scope that had not would
have had its ranking **withheld**, because a caveat is not what gets quoted. The largest single contribution
anywhere is `pure_science`, which the test source sets are over and the main ones under — and its witness is
`assert`, written 841 times. That is a true reading of what separates a test from a class, wearing a label
from a dictionary of English rather than one of software.

Two fixes are in `BACKLOG.md`, and neither is a word list: sense disambiguation (the sibling words in one
identifier, the enclosing declaration, the file's own pooled domain), and extracting Wiktionary's published
topic hierarchy so `sciences`, `natural-sciences` and `physical-sciences` pool as the one label they nearly
are instead of splitting a theme three ways.

---

## Where the work starts

The first vertical slice is §20 of the plan: one repository (`junit-team/junit-framework`), one language,
two contrasting pull requests, and deliberately naive sense disambiguation, so that the contextual readings
of §9 are later measured against a stated baseline rather than assumed to help.

Its acceptance is stated as measurements rather than features, and the load-bearing one is the **noise**
gate: a dependency-bump pull request's observed divergence must not exceed its permutation null. A statistic
that finds semantic content in a version bump is wrong, and that single measurement is what distinguishes a
real reading from a plausible-looking one.

`BACKLOG.md` carries the slices.

---

## Licence

The library's own code is Apache-2.0 — [`LICENSE`](LICENSE), and the same terms are declared in the published
POM. **The bundled lexical data is not covered by it**: each file states its own source and licence in a
provenance header, and two of them (the Wiktionary extractions) are CC BY-SA 4.0, which is share-alike and
attaches to those files rather than to the code that reads them. [`NOTICE.md`](NOTICE.md) summarises all seven
and names the one gap — WordNet's own terms, which arrive through `extjwnl` on the classpath and are not
stated in this repository yet.

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
(measured on the tree this README ships in: `code-semantics-api` 97.5%, `code-semantics-engine`
92.0%, `lexicon` 92.4%, `lexicon-extraction` 89.0%).

---

## The self test

`./gradlew selfRead` points the library at this repository and reports what it is written in, what it is
about, and what it does. The reports land in `code-semantics-engine/build/reports/self-reading/`, and
`python3 docs/self-reading/build_themes_page.py` turns the export into a page where every claim links to the
line it came from. The runs below are the tree this README ships in, which is what makes them checkable —
and perishable: **any commit that adds or removes a file moves every count here**, so they are regenerated
and landed in a commit that touches no source.

### What it reads, and what it refuses to

A Java file is mostly somebody else's vocabulary quoted. `String`, `List` and `assertThat` are *uses* of
declarations the platform and the test framework made, and a use is not a word this codebase chose. So the
reading runs over a **parse**, and takes only what this repository committed to:

| Kind | What is taken | What it is worth |
|---|---|--:|
| Declared names | types, methods, fields, parameters, locals, components, constants | 1.0 |
| Dependencies | imports that are neither the platform's own packages nor this tree's | 0.5 |
| Prose | javadoc, comments, and the repository's own README, plan and backlog | 0.25 |

Prose is 77.8% of the words by volume, so at parity it would decide every theme by weight of volume alone; a
quarter is a stated starting point, and the report prints **what share of each theme came from names** so the
number has something to be tuned against.

Four published resources draw every boundary, and not one line of vocabulary is written here:

- **`ModuleFinder.ofSystem()`** states which packages are the platform's, so `java.util` is set aside where
  `net.sf.extjwnl` is kept. Of 981 imports, 565 were the platform's, 158 this tree's own coordinates, and
  **258 were a choice worth reading**.
- **WordNet**, an open-class dictionary by construction, states which words carry subject matter — so the
  words English uses to hold a sentence together are refused without a stop list existing — and lemmatises
  what survives, so `words` and `word` are one subject.
- **The Leipzig frequency list** states how much a word narrows a subject. A word nothing chose is weighted
  by `log(rank)/log(20,000)`, the surprisal the list itself states.
- **The reading's own shape** states how much a word committed to a subject. A word placed in five subjects
  gives each a fifth of itself, weighted *again* by that fifth — Simpson's concentration index, so an
  ambiguous word says less in total and less about each subject in particular. `file` is law, computing,
  tools and records, and its appearance in a class name is not evidence for any of them.

One-and-two-letter words are refused whichever they are, because a dictionary entry for a one-letter form is
about a symbol — `a` the ampere, `be` beryllium, `em` a printer's measure — and a name can be a sentence with
an article in it.

### Legibility λ

| Scope | Files | Declarations | Words in names | Words in prose | Read | λ |
|---|--:|--:|--:|--:|--:|--:|
| **repository** | 177 | 3,574 | 8,954 | 31,437 (77.8%) | 39,477 | **0.977** |

## What it reads this repository as

| Theme | ι | From names | Leads | Lines led | Share | Carried by (most mass first) |
|---|--:|--:|--:|--:|--:|---|
| `law` | 0.0845 | 60.8% | 39 | 3,258 | 25.3% | `cite` · `evidence` · `answer` · `licence` |
| `linguistics` | 0.0708 | 69.8% | 28 | 1,927 | 15.0% | `word` · `abbreviation` · `sense` · `hypernym` |
| `mathematics` | 0.0640 | 61.3% | 23 | 2,040 | 15.9% | `divergence` · `mean` · `add` |
| `number` | 0.0339 | 53.9% | 10 | 843 | 6.6% | `nothing` · `zero` · `one` · `rank` |
| `politics` | 0.0299 | 67.6% | 12 | 777 | 6.0% | `vote` · `refuse` · `state` |

Witnesses are ordered by the **mass each word carried**, not by how often it was written. Read that way the
reading is defensible: this library is about words, senses, abbreviations and hypernyms; its mathematics is
divergence and means; and it really does spend its time on votes, refusals and states.

`law` leads, and it is the one to argue with. Its witnesses — `cite`, `evidence`, `answer`, `licence` — are
every one of them a word this library is genuinely about, and every one of them a word the dictionary also
places somewhere else. The commitment rule took it from 48 files led to 39. Whether a library about citation
and evidence *is* about law in any useful sense is a question a dictionary cannot settle, and this reading
does not pretend to.

## What it says this repository does

A method name is a clause and a test name is a sentence, so the suite is a specification wherever that
convention holds. **539 declared methods** name a clause the dictionary can read as a verb and what the verb
acts on; a name whose first word has no verb entry yields no behaviour rather than a guessed one.

| Verb | Times | For instance |
|---|--:|---|
| `read` | 81 | read a repository · read a file · read only the content words of a sentence |
| `name` | 20 | name a stem · name the line each declaration sits on |
| `refuse` | 19 | refuse a citation that would name no resource · refuse a line range that runs backwards |
| `carry` | 14 | carry a prefix · carry the line each declaration sits on |

Getting there needed the backlog's `[HIGH]` splitter defect fixed: `refusesALineRange` was reading as
*refuses / aline / range*. The acronym-run boundary now lands in `IdentifierWords`, alongside the ported
tokeniser rather than inside it, and four of the plan's five documented mis-splits read correctly —
`XMLHttpRequest`, `parseHTTPResponse`, `getDSLContext`, `JWNLException`. The letter/digit boundary is
deliberately still absent, because `utf8` is one token in the catalogues that name it.

## Words carried in from somewhere else

A metaphor is a word carried in from a subject the reader already knows, so it is a word whose own topical
reading diverges from the repository's — measured with the same Jensen–Shannon divergence, in bits, over the
words this repository used as **names** rather than merely in a sentence. They are **candidates**: a distance
cannot tell a figure of speech from a technical term the resources are too coarse for, which is why the
subjects and a link are printed beside each one.

### The comparison, which is the reading worth acting on

Each scope is compared with the whole repository, then judged against the field a scope of **its own size**
draws by chance: 999 seeded resamples. Nine scopes — eight source sets and the documentation — are read, and
a scope that does not stand outside its own null has its ranking **withheld entirely**, because a caveat is
not what gets quoted.

### What is still wrong, and what would fix it

Two labels are still counted five ways: `sciences`, `natural-sciences`, `physical-sciences`, `engineering`
and `computing` fire on the same words and lead almost nothing between them, because they are Wiktionary's
own hierarchy. Extracting that published hierarchy would pool a label with its parent by citation.

And the reading still asks what a word means with nothing around it. Every remaining oddity traces to that
one gap — a function word with a noun homograph, a legal sense of `cite` in a library that cites dictionaries
— which is sense disambiguation, `[HIGH]` in `BACKLOG.md`, with the numbers above as the baseline it has to
move.

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

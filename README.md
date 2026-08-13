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

`./gradlew selfRead` points the library at this repository and reports two readings of it. The reports land
in `code-semantics-engine/build/reports/self-reading/`; the runs below are the tree this README ships in,
which is what makes them checkable — clone it, run the command, and the figures should be these.

That also makes them perishable. The corpus is the repository itself, so **any commit that adds or removes a
Java file moves every count on this page.** They are regenerated and landed in a commit that touches no Java,
which is the only way a stated measurement and the thing it measures can be the same tree.

**What it reads, and what it refuses to.** A Java file is mostly somebody else's vocabulary quoted:
`String`, `List` and `assertThat` are *uses* of declarations the platform and the test framework made, and a
use is not a word this codebase chose. So the reading runs over a **parse**, and takes only:

- every name this repository **declared** — types, methods, fields, parameters, locals, record components,
  enum constants;
- the **prose** it wrote, in javadoc and comments;
- the **dependencies** it named, where the import is neither the platform's own package nor this tree's.

Three published resources decide those boundaries, and not one line of vocabulary is written here.
`javax.lang.model` states the keyword table; `ModuleFinder.ofSystem()` states which packages are the
platform's, so `java.util` is set aside where `net.sf.extjwnl` is kept; and WordNet — an open-class
dictionary by construction — states which words in a sentence carry subject matter, so the words English uses
to hold a sentence together are refused without a stop list existing. Of 896 imports, 518 were the platform's,
126 this repository's own coordinates, and **252 were a choice worth reading**.

Every word is read as its **dictionary form**, so `words` and `word` are one subject rather than two, and a
word nothing chose is weighted by how much it **narrows** a subject — `log(rank) / log(20,000)` against the
frequency list, which is the surprisal the list itself states. It is a weight and never a gate: the commonest
word in English still votes, at the smallest weight the list can express.

Still not done, and stated rather than glossed: no git read, so nothing is pinned by a commit SHA and no
permalink is rendered; and no votes, because a vote requires an anchor and an anchor requires a revision.

### Legibility λ

| Scope | Files | Declarations | Words in names | Words in prose | Read | λ |
|---|--:|--:|--:|--:|--:|--:|
| **repository** | 160 | 3,224 | 8,191 | 15,340 (65.2%) | 22,927 | **0.974** |

23,531 word occurrences of 2,204 distinct surfaces, 818 of them (37.1%) written exactly once; 604 occurrences
across 167 surfaces nothing could be cited for at all. The tail is the finding rather than the residue — the
top of it is `junit`, `assertj` and `extjwnl`, which are dependency names no dictionary carries, and
`aprefix`/`asuffix`/`jwnlexception`, which are the tokeniser's missing acronym rule caught in live code.

The per-resource table in the report carries a column no share can replace: **what each resource carries
alone**. The frequency list cites 92.4% of occurrences and is the only citation for 818 of them; the Wikidata
name registry cites 40.3% and is the only citation for 11. A λ that rested on a surname list would be a bad
number dressed as a good one, and that column is how a reader can tell that it does not.

## What it reads this repository as

The second reading places those words in subjects, through the two bundled resources that do that — WordNet
Domains, which labels each of a word's senses, and Wiktionary's topic vocabulary, which labels the headword.
Each word occurrence commits one unit of mass per resource, divided among the readings that resource names,
so an ambiguous word does not shout.

| Theme | ι | References | Leads | Lines led | Share | Carried by (most mass first) |
|---|--:|--:|--:|--:|--:|---|
| `mathematics` | 0.0551 | 9,526 | 62 | 4,020 | 38.9% | `divergence` · `name` · `mean` · `domain` |
| `sciences` | 0.0443 | 10,715 | 9 | 729 | 7.0% | `word` · `topic` · `occurrence` |
| `linguistics` | 0.0421 | 4,076 | 39 | 2,862 | 27.7% | `word` · `sense` · `reading` · `abbreviation` |
| `law` | 0.0339 | 2,254 | 21 | 1,080 | 10.4% | `cite` · `evidence` · `file` · `answer` |
| `computer_science` | 0.0232 | 1,570 | 4 | 320 | 3.1% | `word` · `code` · `file` · `parser` |
| `publishing` | 0.0212 | 2,131 | 2 | 67 | 0.6% | `dictionary` · `source` · `read` · `reference` |

The witnesses are ordered by the **mass each word actually carried**, not by how often it was written, which
is what makes the column an explanation rather than a word count. Read that way the top themes are defensible:
this repository really is about words, senses, readings, citation and evidence, and its mathematics really is
divergence and means.

Two results are still wrong, and both are visible rather than hidden. **`mythology` is `jupiter`** — a real
theme of one source set, whose witness is the JUnit Jupiter dependency it imports, because the dictionary
knows Jupiter as a Roman god and is not wrong to. And **`sciences`, `natural-sciences`, `physical-sciences`,
`engineering` and `computing` fire together** on the same words while leading almost no files between them:
they are Wiktionary's own hierarchy, so one theme is counted five times.

### The comparison, which is the reading worth acting on

A theme written at the same density everywhere contributes almost nothing to a divergence. Each source set is
compared with the whole repository by Jensen–Shannon divergence — bounded at 1 bit by its own definition,
symmetric, additively decomposable — and then judged against the field a scope of **its own size** draws by
chance: 999 seeded resamples of the same number of files.

| Scope | Divergence | Null median | Excess | Chance draws at least as far |
|---|--:|--:|--:|--:|
| `code-semantics-api/src/main/java` | 0.0232 | 0.0086 | +0.0147 | 0 of 999 |
| `code-semantics-api/src/test/java` | 0.0366 | 0.0163 | +0.0203 | 0 of 999 |
| `code-semantics-engine/src/main/java` | 0.0161 | 0.0034 | +0.0128 | 0 of 999 |
| `code-semantics-engine/src/test/java` | 0.0206 | 0.0082 | +0.0124 | 0 of 999 |
| `lexicon-extraction/src/main/java` | 0.0461 | 0.0132 | +0.0329 | 0 of 999 |
| `lexicon-extraction/src/test/java` | 0.0654 | 0.0210 | +0.0444 | 0 of 999 |
| `lexicon/src/main/java` | 0.0411 | 0.0190 | +0.0221 | 0 of 999 |
| `lexicon/src/test/java` | 0.0321 | 0.0209 | +0.0113 | 11 of 999 |

Every scope stands outside its own null, so every ranking is printed. A scope that had not would have had its
ranking **withheld entirely**, because a caveat is not what gets quoted.

Both fixes are in `BACKLOG.md` and neither is a word list: sense disambiguation (the sibling words in one
identifier, the enclosing declaration, the file's pooled domain), and extracting Wiktionary's published topic
hierarchy so a label pools with its parent by citation.

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

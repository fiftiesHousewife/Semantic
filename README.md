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
| `code-semantics-api` | Model records, stage contracts and the identifier-reading grammar: the attributed evidence trail, `SourceAnchor`, `RepositoryFacts`, the pooled log-odds arithmetic, the tokeniser and the word segmenter. |
| `code-semantics-engine` | The reading pipeline: the pooled accumulator today, and the twelve stages of the plan as they land. |

`build-logic/` holds the convention plugins (`cs.java-conventions`, `cs.java-library`, `cs.contract-library`,
`cs.maven-publish`, `cs.aggregate-tasks`). Module build files stay minimal by design.

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

---

## Building

```bash
./gradlew checkAll          # every module's tests and coverage floor
./gradlew build             # jars
./gradlew dependencyUpdates # available dependency upgrades
```

Java 21 toolchain, `-Xlint:all -Werror`, Error Prone, JaCoCo at an 80% instruction floor for modules that
carry behaviour (contract modules opt out via `cs.contract-library`).

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

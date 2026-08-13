# Backlog

Slices of `docs/CODE_SEMANTICS_LIBRARY_PLAN.md`, ordered so that each one produces a measurement rather than
only a capability. Nothing here is scheduled; the order is what the previous slice makes possible.

---

## Already in the tree

- The pooled arithmetic, the closed-axis accumulator and the attributed evidence trail, ported and green.
- `SourceAnchor`, `RepositoryFacts`, `PullRequestFacts` — the plan's own records, with the permalink rules
  enforced at construction.
- `ConceptId` / `ConceptVote` / `Citation` / `ConceptEvidence` and the `SymbolPipelineStage` contract.
- `BlobOrigin` — the one closed axis the pipeline resolves per file revision, and the accumulator's first
  real consumer.
- `Tokeniser`, `WordRanks`, `WordSegmenter` and the 20,000-word Leipzig frequency list.
- The whole `lexicon` module, verbatim, and `lexicon-extraction` minus the fixture-corpus task whose target
  does not exist here.
- `VocabularyProvenanceTest` over both bundled resource directories. Porting it found one header —
  `wikidata-initialisms.tsv` — stating its licence only inside its Source line; it now carries its own
  `Licence:` line.

---

## [HIGH] The identifier splitter

`Tokeniser` mis-splits five of nine identifiers taken from real source; the class javadoc names each. Build
`IdentifierSplitter` alongside it, taking an identifier and a language and returning ordered lowercase tokens
each carrying the byte offset it began at — the offset is what lets a token's evidence carry a line-accurate
permalink.

The grammar, in order, all of it rules about where a word sits:

1. Explicit separators `_ - . $ ::`
2. Lower→upper boundary
3. Acronym-run boundary `(?<=[A-Z])(?=[A-Z][a-z])`
4. Letter↔digit boundary, **proposed not applied** — both readings go forward as candidates and a catalogue
   citation decides. This is where a lesser design would put a list, and it must not.
5. A residual lowercase run goes to `WordSegmenter`.

**Measurement:** the nine-identifier table in the plan, plus the count of live identifiers whose reading
changes. Ships when the five known mis-splits read correctly and nothing that read correctly regresses.

*Blocked on nothing.*

## [HIGH] The cited catalogues

`CitedTokens.NONE` recognises nothing, which is why `userid` currently refuses to split — `id` ranks 4705 and
a two-letter piece must rank inside 1000 to count as a word. The catalogues that fix this are published
standards extracted by named Gradle tasks and bundled with provenance headers, exactly as `sql-functions.tsv`
is:

- **Language keyword catalogues** — JLS §3.9, Python's `keyword.kwlist`, the ECMAScript reserved-word
  grammar, the Go spec's keyword list.
- **Standard-library API index** — extracted from the platform itself, not downloaded: `javap` over
  `java.base`'s exported packages, `sys.stdlib_module_names`, `module.builtinModules`.
- **`github/linguist` data** — `languages.yml`, `vendor.yml`, `generated.rb`. Verify the MIT licence at
  adoption.

**Measurement:** the share of word occurrences a catalogue demotes. Over the source project's 931 Java files,
Java keywords were 13.5% of 381,466 word occurrences and a forty-name sample of JDK tokens a further 11.1%.

*Enables rule 4 of the splitter to arbitrate rather than guess.*

## [HIGH] The open-space accumulator

`AxisEvidenceAccumulator` partitions over an enum's constants, so unvoted values sit at the neutral prior and
contribute `e⁰ = 1` each. Over ~10⁵ synsets the partition would be almost entirely neutral prior and the
posterior would mean nothing. Build the sibling whose partition runs over the **voted values plus one
explicit abstention mass**, so confidence reads as the winner's share among contenders and the abstention
mass is represented rather than implied by an enum's size.

**Measurement:** confidence on a token with two contending senses must not move when a third, unvoted sense
exists in WordNet.

## [MEDIUM] Stages 1–3 — the repository read

`RepositoryWalk` (blob rows off a ref), `ProvenanceRead` (JGit `RevWalk` + `RenameDetector`),
`HostMetadataRead` (`RepositoryFacts` in, pull request and review nodes out). No network: the library is
handed a clone path.

The unit of observation is the **blob** — a `(blobSha, path)` pair. It is content-addressed, so an unchanged
file across five hundred commits is one observation parsed once. That single choice does most of the work in
incremental re-analysis and most of the work on generated code, and it is not a tuning decision.

## [MEDIUM] Stage 5 — the syntax parse

tree-sitter, one parser interface across a polyglot tree, symbol extraction as `.scm` queries per language.
**Measure the core/grammar version skew first** (core 0.26.6 against `tree-sitter-java` 0.23.5): ABI
compatibility across it is not something to assume, and if it does not hold the alternative is `jtreesitter`,
which needs Java 22 and is therefore a toolchain decision.

Error tolerance is a requirement, not a nicety: a pull request's head commit does not always compile, and a
parser that refuses such a file cannot analyse the pull requests that most need analysing.

## [MEDIUM] The store

DuckDB as the system of record, node and edge tables, recursive CTEs. The graph is a schema, not a product;
GraphML/GraphSON and N-Quads fall out of a straight `SELECT`, so a consumer who wants Cypher or SPARQL gets
it without the library taking the dependency.

**The measurement that would revisit this:** instrument the query log of the first slice and record the
maximum traversal depth any answered question actually needed. Containment is a fixed five-level tree and
hypernymy is already bounded at 6. If a real question needs unbounded variable-length paths over a non-tree
edge, that is what a dedicated graph engine buys and nothing else does.

## [MEDIUM] Intensity and divergence

Within-blob share, scope intensity under a blob weighting, legibility reported beside it, and Jensen–Shannon
divergence with its additive per-concept decomposition. Then the permutation null: 999 resamples of `|S|`
blobs drawn uniformly without replacement from `R`, reporting the observed divergence, the null median, the
excess and the observed value's rank.

**Reporting the denominator is not optional.** A scope at `λ = 0.02` has an intensity reading and the
consumer must be told how thin it is.

## [MEDIUM] The first vertical slice

`junit-team/junit-framework`, `.java` only, sense disambiguation deliberately reduced to WordNet's most
frequent sense so the contextual readings are later measured against a stated baseline rather than assumed to
help. Two contrasting pull requests: #5970 (a labelled human change) and #5974 (a `renovate[bot]` dependency
bump).

Acceptance, as measurements:

| Gate | Ships only if |
|---|---|
| Attribution | 50 sampled `READS_AS` edges render permalinks that resolve and highlight the exact evidencing lines |
| Signal | #5970's top divergence concepts name documentation and Kotlin |
| **Noise** | **#5974's observed divergence does not exceed its permutation null** |
| Rename | A pure file rename produces a concept-intensity delta of exactly zero |
| Legibility | `λ` is reported for every scope, and the slice records its actual value rather than predicting it |
| Cost | Full analysis time over the repository is recorded, not estimated |

The noise gate is the load-bearing one. A dependency bump has no semantic content; a statistic that finds
some is wrong, and this is the single measurement that separates a real reading from a plausible-looking one.

## [LOW] Sense disambiguation

Sibling tokens in the same identifier (shared hypernym chains, offsets intersected before flattening to
lemmas), the enclosing declaration's tokens decayed by scope distance, and the file's pooled topical domain
as a prior. Each a vote, none a gate. Measured against the most-frequent-sense baseline the first slice
establishes.

## [LOW] Version stamps

`ParseVersion` (re-parses every blob), `ReadingVersion` (re-derives tokens and concepts from the retained
parse), `AggregationVersion` (one `GROUP BY` over tables already on disk). Each stamp buys back the cost of
the one above it. A weight retune fingerprints the weights record directly and bumps none of the three.

## [LOW] The reachability contract

The provenance half of the bundled-resource contract is in the tree; the reachability half is not. It asserts
that every bundled resource is named by a production class, and that the class naming it is itself named by
something else — the floor on being called, since a class nothing else names is dead by construction.

It needs a small classpath bytecode scanner (`ClasspathClasses` / `ClassReferences` in the source project).
Bytecode rather than source, because the two disagree in precisely the case that matters: a class named only
in a javadoc link reads as referenced and compiles to nothing, so prose alone makes a dead class look used to
a reader and to a grep alike.

**Why it earns its place:** bundled data nothing loads is not inert. It ships, so it carries its licence; it
is maintained, so it costs; and it is cited, so it lends its authority to behaviour it never touched. All
three were true at once in the source project — 24,889 surnames behind a loader with no callers, while two
unrelated classes explained their behaviour by "the surname list", a file no execution had ever read.

## [LOW] Visualisation

A concept map laid out by the hypernym tree — the taxonomy supplies the coordinates, so no force simulation
is needed and none should be used — and a divergence bar over the ranked per-concept shares, which chart as
diverging bars with a real axis maximum of 1.

**What must not be built** is a force-directed view over every node kind at once. One mid-sized repository at
one commit yields 6,211 distinct words, 24.8% of them occurring exactly once. A whole-graph rendering is
unreadable by construction, and readability is not a layout parameter.

---

## Open questions, each with the measurement that settles it

- **Does the tree-sitter core/grammar version skew hold?** Parse a known file with core 0.26.6 and
  `tree-sitter-java` 0.23.5 and compare the symbol set against a hand-checked expectation.
- **Is a larger frequency prior worth it?** Run the segmenter over a fixed set of a thousand unsplit
  lowercase identifiers with the Leipzig list and with each alternative, and compare accuracy. Pay for the
  larger resource only if the difference is real.
- **Does `duckpgq` earn a place?** It is real but lightly exercised (6,957 downloads in one week). Adopt only
  as optional sugar over a schema already correct without it.
- **What is WordNet's licence position in this repository?** Neither the Princeton licence nor extjwnl's
  EPL/LGPL is stated in-tree. That is a real gap inherited with the port.

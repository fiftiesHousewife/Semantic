# The repository read, the store, the divergence and the first vertical slice

## Stages 1–3 — the repository read

`RepositoryWalk` (blob rows off a ref), `ProvenanceRead` (JGit `RevWalk` + `RenameDetector`),
`HostMetadataRead` (`RepositoryFacts` in, pull request and review nodes out). No network: the library is
handed a clone path.

The unit of observation is the **blob** — a `(blobSha, path)` pair. It is content-addressed, so an unchanged
file across five hundred commits is one observation parsed once. That single choice does most of the work in
incremental re-analysis and most of the work on generated code, and it is not a tuning decision.

## The store

DuckDB as the system of record, node and edge tables, recursive CTEs. The test convention forwards only
`-Dcs.clone.dir` to a forked JVM today; the `cs.store.dir` and `cs.duckdb.temp` forwards were removed as
scaffolding for absent code and belong back in `cs.java-conventions` with the first store diagnostic that
reads them. The graph is a schema, not a product;
GraphML/GraphSON and N-Quads fall out of a straight `SELECT`, so a consumer who wants Cypher or SPARQL gets
it without the library taking the dependency.

**The measurement that would revisit this:** instrument the query log of the first slice and record the
maximum traversal depth any answered question actually needed. Containment is a fixed five-level tree and
hypernymy is already bounded at 6. If a real question needs unbounded variable-length paths over a non-tree
edge, that is what a dedicated graph engine buys and nothing else does.

## Intensity and divergence

**Landed over the working tree, at file granularity**: within-file share, scope intensity under a uniform
weighting, Jensen–Shannon divergence with its additive decomposition, and the 999-draw permutation null. What
is left is the part that needs stages 1–3 — the blob as the unit of observation rather than the file, the
changed-lines weighting a pull request and a commit need, and legibility reported beside every intensity
rather than in its own report.

Within-blob share, scope intensity under a blob weighting, legibility reported beside it, and Jensen–Shannon
divergence with its additive per-concept decomposition. Then the permutation null: 999 resamples of `|S|`
blobs drawn uniformly without replacement from `R`, reporting the observed divergence, the null median, the
excess and the observed value's rank.

**Reporting the denominator is not optional.** A scope at `λ = 0.02` has an intensity reading and the
consumer must be told how thin it is.

## The first vertical slice

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

## Version stamps

`ParseVersion` (re-parses every blob), `ReadingVersion` (re-derives tokens and concepts from the retained
parse), `AggregationVersion` (one `GROUP BY` over tables already on disk). Each stamp buys back the cost of
the one above it. A weight retune fingerprints the weights record directly and bumps none of the three.

## After those, the plan's own order resumes

The polyglot parse, the store, and the first vertical slice against `junit-team/junit-framework` — the first
time this library reads something that is not itself. `-Dcs.panel.dir` and the out-of-domain arm are what
turn every figure here from an instrument reading itself into a measurement.

---

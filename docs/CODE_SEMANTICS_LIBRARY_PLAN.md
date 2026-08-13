# Code semantics as a cited graph — Plan

A codebase is a corpus of names, and this project already reads names for a living. The classification
pipeline turns `co2_per_capita` into words, cites each word to a published dictionary, pools the citations
as weighted votes and records what evidenced the verdict. Nothing in that machinery is about tables. It is
about identifiers, and a method called `resolveNextPageCursor` is an identifier with the same problem.

This plan proposes an independent library — usable outside this project, with its own artefact and its own
store — that reads a **repository** the way the inference engine reads a datasource: at the level of the
repo, the pull request and the commit; over the code itself as well as the prose that surrounds it; storing
the result as a graph in which every node and every edge names the line that evidenced it.

The governing rule is inherited unchanged. **Every signal is a weighted vote from a citable derived
resource. No hand-written vocabulary, no exclusion list, no gate.** A reading that cannot cite a source
abstains, and abstention carries zero weight rather than a zero-valued vote. Where this plan is uncertain
it says what measurement would settle the question rather than asserting an answer.

---

# Part I — What already exists

## 1. The classification pipeline, and which of it is about tables

The engine decides three orthogonal axes per column — `SemanticRole` (what the value intrinsically is),
`KeyRole` (how it participates relationally), `AnalyticRole` (how it aggregates) — each resolved by its own
`AxisEvidenceAccumulator`. The accumulator is the reusable core, and it is not tabular at all.

`inference-engine/src/main/java/org/fifties/housewife/bi/inference/engine/pipeline/AxisEvidenceAccumulator.java`
performs log-linear pooling: each vote is a signed log-odds contribution, a value's support is the plain sum
of its votes, the winner is the maximum, and confidence is the winner's softmax posterior. Three properties
make it the right instrument for code:

- **A refutation is evidence.** `evidenceMass` sums `|weight|`, so a vote *against* still counts as
  something having been said; only a total absence of evidence abstains.
- **No overrides.** A rule that must dominate expresses as a high-magnitude signed vote, so a resolved axis
  is a pure function of its recorded votes and the trail explains itself.
- **Abstention is explicit.** `winner <= 0.0` returns the `unknown` sentinel at confidence zero rather than
  the least-bad guess.

The evidence trail is `AxisVote<A>` — `(value, weight, EvidenceSource source, String detail)`. The `detail`
field is a free-text naming of the matched signal. **In a code library that field becomes a permalink**, and
that single substitution is most of requirement 3.

| Component | What it decides | Reusable for code |
|---|---|---|
| `AxisEvidenceAccumulator` | pooled log-odds → winner + posterior | **Yes**, with one change (§4) |
| `AxisVote` / `EvidenceSource` / `StructuralEvidence` | the attributed evidence trail | **Yes** |
| `PooledLogOdds.squash(logOdds, scale)` = `2/(1+e^{-x/s}) − 1` | bounded score from unbounded evidence | **Yes** |
| `ColumnPipelineStage` — `StructuralEvidence evaluate(ColumnContext)` | the stage contract: pure, side-effect free, order-independent within a phase | **Yes**, as a shape |
| `ClassificationPipeline` / `MultiTablePipelineStage` | ordered composition where order *is* load-bearing across phases | **Yes**, as a shape |
| `Weights` / `Thresholds` (Lombok `@Value @Builder`, named constants, no YAML) | tuning surface | **Yes**, as a convention |
| `SemanticRole` / `KeyRole` / `AnalyticRole` | what a *value* is, how it *joins*, how it *aggregates* | No — every one is a fact about data, not about code |
| `StatisticalEvidenceStage`, `DateValueEvidenceStage`, `NonCalendarValues`, `ValueShape` | readings over sampled *values* | No — code has no value distribution |
| `UniqueKeyDetectionStage`, `ForeignKeyDetectionStage`, `FunctionalDependencyStage` | relational structure | No |

## 2. The word resources, and the exact question each answers

Verified in `lexicon/src/main/resources/` and `inference-api/src/main/resources/`. Every bundled file carries
a `#` provenance header naming source and licence — a contract `VocabularyProvenanceTest` enforces.

| Resource | Version / size | Obtained by | Licence | The question it answers |
|---|---|---|---|---|
| WordNet | **3.1**, via `net.sf.extjwnl:extjwnl:2.0.5` + `net.sf.extjwnl:extjwnl-data-wn31:1.2` (11,065,764-byte jar) | Maven Central; `Dictionary.getDefaultResourceInstance()` reads it off the classpath, never extracted to disk | Princeton WordNet licence (permissive); extjwnl EPL/LGPL. **Neither is stated in-repo — a real gap** | What senses has this word; what is its noun/verb lemma; do two nouns share a direct hypernym; are two words antonyms |
| WordNet Domains | 3.2 lifted to 3.0; 92,617 entries / 3.6 MB | bundled `wordnet-domains.txt` | CC BY 3.0 (FBK + the morungos lift) | Which subject domain claims this sense |
| Wiktionary abbreviations | 45,633 senses / 2.7 MB | `:lexicon-extraction:extractWiktionary` over the kaikki.org wiktextract JSONL (English ~500 MB, Translingual ~14 MB) | **CC BY-SA 4.0 — share-alike** | What expansion has a reader been cited as writing for this token, in what topic, and for a unit symbol what quantity |
| Wiktionary topics | 185,768 headwords / 10.9 MB | same task | CC BY-SA 4.0 | Which domains claim this word, including collocations WordNet Domains lacks |
| Wikidata name tokens | 408,732 rows, 44 scripts / 10.9 MB | `extractWikidataNames` via the QLever SPARQL endpoint | **CC0 1.0** | Is this token a given or family name in any script |
| Wikidata initialisms | 189,977 readings / 6.5 MB | `extractWikidataInitialisms` via QLever | CC0 1.0 | What entity does the registry record this capitals token as a short name of, and how prominent |
| DuckDB function catalogue | 506 functions / 45 KB, engine v1.5.5 | `extractSqlFunctions` — no download, reads `duckdb_functions()` from the embedded engine | MIT | Is this token the query language's own vocabulary, and does the entry's own description state the words of a proposed reading |
| Leipzig frequency list | 20,000 words / 166 KB, `common-english-words.txt` | `GenerateCommonEnglishWordsTest` over three Leipzig corpora, normalised per-million before merging | CC BY 4.0 | How common is this word — rank is line position |

**SCOWL, CMUdict and Google Books Ngrams are not used anywhere.** They appear only as rejected or deferred
options in `docs/ACRONYM_READING_PLAN.md` and `docs/EVIDENCE_DEBT_PLAN.md`. The frequency prior that is
actually consulted is the Leipzig list above. `labels.yml` is not a bundled vocabulary at all — it is a
per-datasource, user-editable file written beside `datasource.json`, where a user's uncited fact is allowed
to live precisely because it is theirs and not the tool's.

`sql-functions.tsv` deserves separate notice, because it is the exact precedent this library needs. Its
header states the principle: *"A schema token equal to a function's name is a fact about the standard this
tool executes rather than an observation of any corpus."* A curated statement of a published standard is
citable; a curated observation of a corpus is not. That distinction is what will let a code library know that
`final`, `static` and `return` are the language's words and not the author's, without ever writing a stop
list.

## 3. The doctrine the library inherits

| Rule | Where stated | Consequence for this library |
|---|---|---|
| Signals are votes, never gates or hand lists | `TOPICAL_DOMAIN_PLAN.md`, restated in six plans | No `GENERATED_PATHS` set, no `STOP_WORDS`, no vendored-directory list |
| A reading that cannot cite abstains, and abstention is a *correct outcome* | `TOPICAL_DOMAIN_PLAN.md` — *"the honest label is 'Tra Name', not a guessed 'Track Name'"* | A token no resource reads contributes nothing, and the graph records that it was seen and not read |
| A signal that cannot speak must abstain, **not vote zero** | `NAMEABLE_ENTITY_PLAN.md` | Zero weight, not a zero-valued vote — tested directly, not inferred from the arithmetic |
| A citation outranks an assertion | `VOCABULARY_RETIREMENT_PLAN.md` | Cited readings are consulted before any structural heuristic |
| A bound must be derived, never chosen — *"the bound is derived rather than chosen: it is what `percent` means"* | `VOCABULARY_RETIREMENT_PLAN.md` §7.7 | Every statistic in §11 has a maximum that follows from its definition |
| A winner qualifies against the **chance-expected maximum** of its field, not a fixed sigma count | `KPI_AND_INTERESTINGNESS_PLAN.md` N3 | A small PR's divergence is judged against a permutation null, not a constant |
| Every bundled resource carries a provenance header, and one nothing reads fails the build | `NAMEABLE_ENTITY_PLAN.md` | `VocabularyProvenanceTest` / `VocabularyReachabilityTest` port across unchanged |
| Grammar is not vocabulary | `VOCABULARY_RETIREMENT_PLAN.md` §7.5 | The identifier splitter's rules are grammar and are permitted; a list of words is not |
| Do not mark your own homework | `NAMEABLE_ENTITY_PLAN.md` | The repos a reading is tuned on and the repos it is measured on are drawn disjointly |

## 4. The extraction seam, measured

Three things must change. Everything else ports.

**(a) The tokeniser's grammar is too narrow for code.** `Tokeniser.TOKEN_SPLITTER` is
`(?<=[a-z])(?=[A-Z])|[_\-]`. Run against nine identifiers taken from real source, it mis-splits five:

| identifier | `Tokeniser` today | correct |
|---|---|---|
| `AxisEvidenceAccumulator` | `axis, evidence, accumulator` | ✓ |
| `co2_per_capita` | `co2, per, capita` | ✓ |
| `XMLHttpRequest` | `xmlhttp, request` | `xml, http, request` |
| `parseHTTPResponse` | `parse, httpresponse` | `parse, http, response` |
| `toJSONString` | `to, jsonstring` | `to, json, string` |
| `getDSLContext` | `get, dslcontext` | `get, dsl, context` |
| `IPv6Address` | `ipv6address` | `ip, v6, address` (or `ipv6, address`) |
| `utf8Decode` | `utf8decode` | `utf8, decode` |
| `ft_1` | `ft, 1` | ✓ |

The missing rules are grammar, not vocabulary: an acronym-run boundary `(?<=[A-Z])(?=[A-Z][a-z])`, and a
letter/digit boundary that *proposes* a split for a citation to dispose of — `utf8`, `ipv6`, `base64` and
`co2` are single tokens in the catalogues that name them.

**(b) The accumulator's partition assumes a closed enum.** `posterior` sums `exp(logOdds)` over
`getEnumConstants()`, so unvoted values sit at the neutral prior and contribute `e⁰ = 1` each. WordNet 3.1
has on the order of 10⁵ synsets; a partition over all of them would be almost entirely neutral prior, and the
posterior would be meaningless. An open value space needs a sibling accumulator whose partition runs over the
**voted values plus one explicit abstention mass**. Confidence then means "the winner's share among
contenders", which is the honest reading, and the abstention mass is represented rather than implied by an
enum's size.

**(c) The context record is about columns.** `ColumnContext` carries `distinctCount`, `nullRatio`,
`skewness`, `sampleValues`. A code library's context carries a symbol's kind, its span, its enclosing
declarations and the identifiers in scope. The *shape* — an immutable record, a `@FunctionalInterface`
returning an evidence record, no side effects — ports exactly.

`WordNetContrast` ports without change, including its trap: `sharedHypernyms` intersects **synset offsets**
and only then flattens to lemmas, because two words can share a lemma string across unrelated synsets.
`sharedHypernymChain` walks upward to `CHAIN_CEILING = 6` and returns one lemma set per level, nearest first,
because the nearest shared parent is often unreadable (`forehand` and `backhand` share `return`) while the
level above names the category. `WordSegmenter` ports too, and is what will split `dslcontext` when no case
boundary exists.

---

# Part II — The library

## 5. Scope, and what it is handed

Working name **`code-semantics`**, root package `org.fifties.housewife.codesemantics`, published as its own
artefact with `lexicon` as its only dependency on this project.

It is handed a **local clone path** and a **`RepositoryFacts` record** carrying the GitHub metadata another
process fetched. It performs no authentication, no cloning, no network access of any kind at analysis time.
Every resource it consults is bundled or on the classpath. This is not only requirement 5; it is what makes
the library testable offline and reproducible.

```java
public record RepositoryFacts(String host, String owner, String name, String defaultBranch,
                              List<PullRequestFacts> pullRequests) {

    public RepositoryFacts {
        Objects.requireNonNull(host, "host");
        Objects.requireNonNull(owner, "owner");
        Objects.requireNonNull(name, "name");
        pullRequests = List.copyOf(pullRequests);
    }
}
```

## 6. The three levels, and the unit of observation at each

The unit of observation is the **blob** — a `(blobSha, path)` pair. A blob is content-addressed, so an
unchanged file across five hundred commits is one observation parsed once. This single choice does most of
the work in §15 (incremental re-analysis) and §16 (generated code), and it is not a tuning decision.

| Level | Scope is | Observation set | Blob weighting `π` |
|---|---|---|---|
| **Repo** | the tree at a ref | every tracked blob | uniform |
| **Pull request** | the merge diff against its base | blobs changed between `base.sha` and `head.sha` | proportional to changed lines |
| **Commit** | one commit against its first parent | blobs the commit changed | proportional to changed lines |

At repo level a 4,000-line generated parser is one observation and a 30-line record is one observation. At PR
and commit level the weight is the change's own size, which is what a diff is about. Both weightings are
probability distributions over the scope's blobs, so both feed §11 unchanged.

## 7. The pipeline, stage by stage

Two phases, following `ClassificationPipeline`: within a phase order is immaterial and evidence merges;
across phases order is load-bearing and is fixed in one place.

| # | Stage | In | Out |
|---|---|---|---|
| 1 | `RepositoryWalk` | clone path, ref | `FileRevision` rows — `(blobSha, path, mode, byteLength)` |
| 2 | `ProvenanceRead` | clone path | `Commit`, `Author`, `PARENT_OF`, `RENAMED_TO` — JGit `RevWalk` + `RenameDetector` |
| 3 | `HostMetadataRead` | `RepositoryFacts` | `PullRequest`, `Label`, `ReviewComment`, `PROPOSES`, `MERGED_AS` |
| 4 | `LanguageReading` | path, first bytes, `.gitattributes` | language; **votes** on `generated` and `vendored` (§16) |
| 5 | `SyntaxParse` | blob bytes + language | `Symbol` rows — kind, name, byte span, line span, enclosing symbol |
| 6 | `IdentifierSplit` | every identifier in the span | `Token` rows with position and occurrence count |
| 7 | `CatalogueDemotion` | `Token` + language | a signed vote *against* the token carrying repo meaning |
| 8 | `SenseCitation` | `Token` + sibling tokens + enclosing prose | `CITES` edges: `(sense, weight, source, anchor)` |
| 9 | `ConceptResolution` | the citations for one token | `READS_AS` edge — winning concept + posterior, or abstention |
| 10 | `ConceptClosure` | `Concept` | `HYPERNYM_OF` edges to `CHAIN_CEILING`; `COORDINATE_WITH` by shared offset |
| 11 | `ScopeAggregation` | concept assignments × containment × `π` | `ConceptIntensity` rows per scope (§11) |
| 12 | `ScopeComparison` | two scopes | divergence, per-concept contribution, permutation null (§11) |

Phase boundary sits after stage 10. Stages 1–3 are independent of each other; 4–10 are per-blob and
embarrassingly parallel; 11–12 are aggregations over tables already written.

The stage contract:

```java
@FunctionalInterface
public interface SymbolPipelineStage {

    ConceptEvidence evaluate(SymbolContext context);
}
```

```java
public record ConceptEvidence(List<ConceptVote> concepts, List<Citation> citations) {

    public static final ConceptEvidence NONE = new ConceptEvidence(List.of(), List.of());

    public static ConceptEvidence merge(final Collection<ConceptEvidence> parts) {
        return new ConceptEvidence(
                parts.stream().flatMap(part -> part.concepts().stream()).toList(),
                parts.stream().flatMap(part -> part.citations().stream()).toList());
    }
}
```

```java
public record ConceptVote(ConceptId value, double weight, EvidenceSource source, SourceAnchor anchor) {

    public ConceptVote {
        Objects.requireNonNull(value, "value");
        Objects.requireNonNull(anchor, "anchor");
    }
}
```

## 8. Identifier splitting

Input is one identifier string plus its language. Output is an ordered list of lowercase tokens, each with
the byte offset it began at — the offset is what lets a token's evidence carry a line-accurate permalink.

The grammar, in order, all of it rules about *where a word sits* rather than claims about what a token means:

1. Explicit separators: `_`, `-`, `.`, `$`, `::`.
2. Lower→upper boundary — `parsePage` → `parse|Page`.
3. Acronym-run boundary `(?<=[A-Z])(?=[A-Z][a-z])` — `XMLHttpRequest` → `XML|Http|Request`.
4. Letter↔digit boundary, **proposed not applied**: both the split and the unsplit reading go forward as
   candidates, and a catalogue citation decides. `utf8` is cited whole; `ft_1` is not, and splits.
5. A residual lowercase run no rule divided goes to `WordSegmenter`, which scores candidate splits by Zipf
   cost against the Leipzig ranks and returns nothing when no split reads as words.

Stage 4 is where a lesser design would put a list. It does not: the candidate set is generated by grammar and
arbitrated by citation, so a token no catalogue names simply splits, and one that is named does not.

## 9. Sense disambiguation and concept assignment

A token in isolation is ambiguous — `set` has 116 WordNet senses. Three contexts disambiguate, each a vote,
none a gate:

- **Sibling tokens in the same identifier.** `pageCursor` and `mouseCursor` share a token and disagree about
  it. The reading is `WordNetContrast.sharedHypernyms` between the token and its siblings: a sense whose
  hypernym chain meets a sibling's is corroborated. This is `CertifiedSenses`' slot-mate mechanism applied to
  an identifier's own words instead of a schema's column names.
- **The enclosing declaration's tokens.** A local `key` inside `HttpHeaderParser` reads differently from one
  inside `EncryptionService`. Weight decays with declaration distance — a fact about scope, which is grammar.
- **The topical domain of the file.** `LexiconTopicalDomains` pools WordNet Domains votes over the words of a
  whole datasource; the same deriver over a whole file, then a whole package, gives a prior the per-token
  reading is scored against. It abstains when the pooled evidence is thin, and abstention is the common case
  for a small file — correctly.

A concept is a **WordNet synset** — `(offset, POS)`. It is the unit that concepts are counted in because it
is the unit the hypernym relation is defined over, and because `sharedHypernyms` intersects offsets rather
than lemma names. Counting in lemmas would silently merge `bank` the institution with `bank` the riverside.

Tokens no resource reads — `dsl`, `bi`, most project-specific initialisms — abstain. They are recorded as
`Token` nodes with no `READS_AS` edge, so the graph can answer "what did this repo write that nothing could
read", which is a genuinely useful question and is lost by any design that silently drops them.

## 10. Aggregation: symbol → file → commit → PR → repo

Aggregation is a sum of weights up the containment tree, and it happens exactly once, at the blob. Everything
above the blob is a weighted mean of blob readings, never a re-sum of token occurrences.

- **Symbol → blob.** `w(c, b) = Σ` over concept votes in the blob, of the vote's weight, after the
  accumulator has resolved each token. A method name's tokens count once per *occurrence*, so a method called
  forty times contributes its declaration once and its call sites forty times — which is right, because a
  concept a codebase repeatedly invokes is a concept the codebase is about.
- **Blob → scope.** §11. A weighted mean of within-blob shares, never a pooled sum.
- **Commit → PR.** A PR's scope is its merge diff, not the union of its commits' diffs. A commit that adds a
  line and a later commit in the same PR that removes it net to nothing, and the merge diff says so.
- **PR / commit → repo.** Not an aggregation. A repo's intensity is read from its tree, and a PR's from its
  diff; they are two different scopes over the same graph and are compared, not summed.

## 11. Intensity — the definition

**Within-blob share.** For blob `b`, let `w(c, b) ≥ 0` be the total resolved weight of concept `c`, and
`W(b) = Σ_c w(c, b)`. Define

> `s(c, b) = w(c, b) / W(b)`

Bounded `[0, 1]`, summing to 1 over `c`. A blob with `W(b) = 0` — one that is all keywords and abstentions —
contributes **zero weight**, not a zero-valued share; it is removed from the scope, not entered as a uniform
one.

**Intensity in a scope.** For scope `S` with blob weighting `π` (§6, a probability distribution over the
blobs of `S`):

> **`ι(c, S) = Σ_b π(b) · s(c, b)`**

- Bounded `[0, 1]`. **The maximum is 1 and it is derivable, not chosen**: it is attained exactly when every
  blob in scope puts all of its resolved weight on `c`. It is what a share means.
- `Σ_c ι(c, S) = 1` exactly, so `ι(·, S)` is a probability distribution over concepts. That is what makes
  §11's comparison well-defined rather than a ratio of incommensurables.
- Under uniform `π` a 40,000-line generated parser and a 30-line record are one observation each. That is a
  structural answer to a failure mode, not a tuned constant.

**Legibility, reported beside it.** `λ(S) = Σ_b π(b) ·` (resolved token occurrences / total token
occurrences in `b`). Bounded `[0, 1]`, maximum derivable. A scope with `λ = 0.02` has an intensity reading,
and the consumer must be told how thin it is. Reporting the denominator is not optional.

**Relative intensity.** Comparing two scopes is a comparison of two distributions, and the statistic is the
**Jensen–Shannon divergence** in bits, with `M = ½(ι_S + ι_R)`:

> `JSD(S ‖ R) = ½ D_KL(ι_S ‖ M) + ½ D_KL(ι_R ‖ M)`

Chosen over KL divergence for three reasons that are properties, not preferences:

1. **Its maximum is exactly 1 bit and is derivable** — attained if and only if the two supports are disjoint.
   KL is unbounded, and is *infinite* whenever a concept appears in one scope and not the other, which is the
   normal case for a PR against a repo. An unbounded statistic cannot be compared across repos.
2. **It is symmetric.** "How different is this PR from the repo" and the reverse are one number.
3. **It decomposes additively.** `JSD = Σ_c j(c)` where

   > `j(c) = ½·ι_S(c)·log₂(ι_S(c)/m(c)) + ½·ι_R(c)·log₂(ι_R(c)/m(c))`,  `m(c) = ½(ι_S(c)+ι_R(c))`

   Each `j(c) ≥ 0` and they sum exactly to the total. So **each concept's share of the divergence,
   `j(c)/JSD`, is itself bounded in `[0, 1]` and the shares sum to 1.** That ranked share *is* relative
   intensity: which concepts account for the difference, and how much of it each accounts for. Direction —
   whether the concept concentrates in `S` or in `R` — is the sign of `ι_S(c) − ι_R(c)`, reported separately,
   because magnitude is bounded and direction is a bit.

**Is the divergence more than chance?** A PR touching three files will show a large `JSD` against a
thousand-file repo purely because three is a small sample. The instrument is this project's own N3
selection-adjustment, transplanted: draw `B = 999` resamples of `|S|` blobs uniformly without replacement
from `R`, recompute `ι` and `JSD` for each, and report

- the observed `JSD`,
- the null median,
- the **excess** `JSD_obs − median(JSD_null)`, and
- the observed value's rank among the null draws.

A PR whose observed divergence does not exceed its null has no semantic content beyond its size, and the
library must say so rather than rank its concepts.

The three comparisons requirement 4 asks for are the same statistic with different `R`:

| Question | `S` | `R` |
|---|---|---|
| What is this PR about? | the PR's merge diff | the repo at the PR's merge base |
| What changed this quarter? | the repo at `HEAD` | the repo at the commit nearest 90 days prior |
| How do these two repos differ? | repo A at `HEAD` | repo B at `HEAD` |
| Is this repo unusual? | the repo | the pooled distribution over a reference corpus of repos |

## 12. The store

| Candidate | Licence | Traversal | Aggregation | Embeddable | Verdict |
|---|---|---|---|---|---|
| **DuckDB `1.5.5.1` + node/edge tables + recursive CTEs** | MIT | recursive CTE; the `duckpgq` community extension adds `MATCH` | native columnar — every statistic in §11 is one `GROUP BY` | single file, in-process | **Chosen** |
| Neo4j embedded (`org.neo4j:neo4j`) | **GPLv3** (verified: `neo4j/neo4j` `master` `LICENSE.txt`) | Cypher, best in class | weak for the group-by workload | yes | Rejected — GPLv3 propagates to every consumer of an independently distributed library |
| TinkerPop TinkerGraph `3.8.1` | Apache 2.0 | Gremlin | in-memory only; persistence is a GraphSON/Kryo dump | yes | Rejected as system of record; **kept as an export target** |
| Apache Jena `6.2.0` / RDF4J `6.0.0` | Apache 2.0 / EDL | SPARQL property paths — the best fit for hypernym closure, and named graphs give provenance for free | verbose and slow at 10⁷–10⁸ triples | yes | Rejected as system of record; **kept as an export target** |
| Oxigraph | — | — | — | — | Rejected: **no Maven Central artefact** (`repo1.maven.org/maven2/io/github/oxigraph/` returns 404). A JNI or subprocess bridge is not a dependency this library should own |
| JanusGraph | Apache 2.0 | Gremlin | good | **no** — requires a Cassandra/HBase/BerkeleyDB backend | Rejected: wrong operational shape for an embedded library |

**DuckDB is the system of record; the graph is a schema, not a product.** Four reasons:

1. **The workload is aggregation, not traversal.** Every question in requirement 4 is a `GROUP BY` over an
   occurrence table with tens of millions of rows. This project's 931 main-source Java files alone yield
   319,648 identifier occurrences splitting into 381,466 word occurrences; a thousand-repo corpus is
   comfortably 10⁸ rows. That is a columnar engine's job.
2. **The traversals actually required are shallow and known in advance.** Containment is a fixed five-level
   tree (repo → commit/PR → blob → symbol → token). The only genuinely recursive edge is hypernymy, and its
   depth is already bounded at 6 by `WordNetContrast.CHAIN_CEILING` — above that *"the taxonomy speaks only
   in abstractions no category label could carry"*. A depth-bounded recursive CTE covers it. **The
   measurement that would settle this**: instrument the query log of the first slice and record the maximum
   traversal depth any answered question actually needed. If a real question needs unbounded variable-length
   paths over a non-tree edge, revisit — that is what a dedicated graph engine buys and nothing else does.
3. **Operational shape.** MIT, single file, in-process, no server. Identical to this project's existing
   store, so a consumer here pays nothing new.
4. **Interchange is a projection, not a migration.** The node and edge tables export to GraphML/GraphSON for
   TinkerPop and to N-Quads for Jena or RDF4J by a straight `SELECT`. A consumer who wants Cypher or SPARQL
   gets it without the library taking the dependency, and RDF-star or named graphs carry the per-edge
   attribution cleanly.

Two notes on the SQL layer. `duckpgq` is real — it appears in the DuckDB community extension index with
6,957 downloads in the week to 2026-08-13 — but that figure also says it is not widely exercised, so it is
adopted as optional sugar over a schema that is already correct without it, never as a load-bearing
dependency. And jOOQ, which this project uses heavily, is **not** proposed here: an independent library
should not import jOOQ's licensing question, and the queries involved are a few dozen prepared statements.

## 13. The graph schema

Node kinds. Every row additionally carries `(analysisId, readingVersion)`.

| Node | Key | Properties |
|---|---|---|
| `Repo` | `host/owner/name` | `defaultBranch`, `analysedAt`, `analysedRef` |
| `Commit` | `sha` | `authoredAt`, `committedAt`, `messageSubject`, `messageBody`, `parentCount`, `authorId` |
| `PullRequest` | `repoId, number` | `title`, `body`, `state`, `mergedAt`, `mergeCommitSha`, `baseSha`, `headSha`, `authorLogin`, `authorIsBot` |
| `ReviewComment` | `id` | `body`, `path`, `line`, `createdAt`, `authorLogin` |
| `Label` | `repoId, name` | — |
| `Author` | `login` (or `email` when unlinked) | `isBot` |
| `FileRevision` | `blobSha, path` | `language`, `lineCount`, `generatedSupport`, `vendoredSupport`, `legibility` |
| `Symbol` | `blobSha, fqn` | `kind ∈ {package, type, method, field, parameter, local}`, `name`, `startLine`, `endLine`, `bodyFingerprint` |
| `Token` | `surface` | `normalised`, `catalogued ∈ {keyword, stdlib, none}` |
| `Sense` | `source, key` | `source ∈ {wordnet, wiktionary, wikidata, catalogue}`, `gloss` |
| `Concept` | `synsetOffset, pos` | `lemmas`, `domains` |

Edge kinds. Every edge carries `anchor` — a `SourceAnchor` (§14) — and every edge that is a vote carries a
signed `weight` and an `EvidenceSource`.

| Edge | From → To | Properties |
|---|---|---|
| `CONTAINS` | Repo→Commit, Commit→FileRevision, FileRevision→Symbol, Symbol→Symbol | — |
| `PARENT_OF` | Commit→Commit | `ordinal` |
| `TOUCHES` | Commit→FileRevision | `addedLines`, `removedLines` |
| `PROPOSES` / `MERGED_AS` | PullRequest→Commit | — |
| `DISCUSSES` | ReviewComment→FileRevision | `line` |
| `LABELLED` | PullRequest→Label | — |
| `AUTHORED` | Author→Commit, Author→PullRequest, Author→ReviewComment | — |
| `WRITES` | Symbol→Token | `position`, `occurrences` |
| `CITES` | Token→Sense | `weight`, `source`, `anchor` |
| `READS_AS` | Token→Concept | `weight`, `confidence` (posterior among contenders) |
| `HYPERNYM_OF` | Concept→Concept | `depth` |
| `COORDINATE_WITH` | Concept→Concept | `sharedOffset` |
| `REFERENCES` | Symbol→Symbol | `kind ∈ {calls, extends, implements, reads, writes}`, `resolved` |
| `RENAMED_TO` | Symbol→Symbol, FileRevision→FileRevision | `commitSha`, `similarity` |

One derived table, which is a measurement rather than an edge:

```
ConceptIntensity(scopeKind, scopeId, conceptId, intensity, legibility, blobCount, occurrenceCount,
                 aggregationVersion)
```

## 14. Attribution — permalinks

The library stores the **components** of a permalink and renders late. A repo that moves owner then renders
correctly without a rewrite.

```java
public record SourceAnchor(String host, String owner, String repo, String commitSha,
                           String path, int startLine, int endLine) {

    private static final int SHA_LENGTH = 40;

    public SourceAnchor {
        Objects.requireNonNull(commitSha, "commitSha");
        if (commitSha.length() != SHA_LENGTH) {
            throw new IllegalArgumentException("a permalink pins a full commit sha: " + commitSha);
        }
        if (startLine > endLine) {
            throw new IllegalArgumentException("line range runs backwards: " + startLine + ".." + endLine);
        }
    }

    public URI permalink() {
        final String anchor = startLine == endLine
                ? "#L%d".formatted(startLine)
                : "#L%d-L%d".formatted(startLine, endLine);
        return URI.create("https://%s/%s/%s/blob/%s/%s%s"
                .formatted(host, owner, repo, commitSha, encodedPath(), anchor));
    }
}
```

Rules, each of which is a correctness requirement rather than a style choice:

- **Always a 40-hex commit SHA, never a branch or tag.** A ref moves; a permalink that moves is not
  attribution. This is exactly what GitHub's own `y` shortcut does to a blob URL.
- **Line numbers are 1-based and inclusive**, and a single line renders `#Ln` with no range — GitHub
  highlights `#L5-L5` differently from `#L5`.
- **Path segments are percent-encoded individually**; `/` survives.
- The blob permalink is the only anchor form the library emits for code. The diff anchor
  `…/pull/{n}/files#diff-{hash}` is deliberately **not** used: its hash construction is a GitHub
  implementation detail that has changed, and a construction that can silently rot is not attribution.
- Non-code anchors are simple and documented: commit `…/commit/{sha}`; PR `…/pull/{n}`; review comment
  `…/pull/{n}#discussion_r{id}`.
- `host` comes from `RepositoryFacts`, never from a constant, so an enterprise host works.

Because `ConceptVote` requires a non-null `SourceAnchor`, **an unattributed vote cannot be constructed**. The
graph's attribution guarantee is a type, not a convention.

## 15. Incremental re-analysis

- Everything below `FileRevision` is keyed on blob SHA, which is content-addressed. A commit touching 3 of
  931 files introduces 3 new blob rows; the other 928 are reused. This is the natural key, not a cache.
- New commits: `RevWalk.markStart(newTip); markUninteresting(lastAnalysedTip)`, take the union of changed
  blobs, parse only those.
- **Force-push and rebase**: the recorded tip is no longer an ancestor of the new tip. Detect by merge-base
  and re-walk from there. Orphaned commit rows stay — their permalinks still resolve, and deleting evidence
  because history was rewritten would be a lie about what was observed.
- **Three version stamps**, separated for the reason this project separates two (`ClassificationVersion`,
  currently 43, forces a full re-read of every table; `GenerationVersion`, currently 26, re-composes in
  seconds from profiles already on disk). Each stamp buys back the cost of the one above it:

  | Stamp | Bumped when | Cost of a bump |
  |---|---|---|
  | `ParseVersion` | the grammar set or symbol extraction changes | re-parses every blob — the expensive one |
  | `ReadingVersion` | splitting, citation or concept-resolution rules change | re-derives tokens and concepts per blob from the retained parse |
  | `AggregationVersion` | scope statistics change | one `GROUP BY` over tables already on disk |

  A weight retune fingerprints the `Weights` record directly and bumps none of the three — the same
  discipline `GenerationVersion` already documents.

## 16. Failure modes, each answered by a reading

**A variable named `data` means nothing.** Partly true, and the honest response splits in two. Tokens that
are the *language's own words* are demoted by `CatalogueDemotion`, citing a published standard — the JLS
keyword table, the JDK's own `java.base` API index. Measured over this repository's 931 main-source Java
files: Java language keywords are **13.5%** of all 381,466 word occurrences, and a forty-name sample of JDK
and package tokens adds a further **11.1%** — a quarter of the corpus, removed by citation and not by a list.
But `data` is not a keyword; it is an English word with a real sense, and it *should* count. Its intensity in
a repo about data will be high and completely uninformative when that repo is compared with another data
repo — which is precisely what §11's divergence says. **The failure is not the token. It is asking for
intensity without a reference.** The library's answer is that a single-scope intensity ranking is a weak
reading and a divergence against a stated reference is a strong one, and the API should make the second
easier to reach than the first.

The same measurement makes the point structurally: `org`, `bi`, `fifties` and `housewife` appear in **931 of
931 files** — the package coordinates. Their within-blob share is near-constant, so their contribution `j(c)`
to any divergence is near zero. A statistic that is a *comparison* discards them for free; one that is a
*count* never can.

**Generated code drowns hand-written code.** Three independent answers, all votes:

1. Structural: the blob is the observation unit, so a 40,000-line generated file is one observation.
2. The repository's own statement: `.gitattributes` `linguist-generated=true`. The strongest evidence there
   is, because the repo said it.
3. Published generator conventions, cited not listed: `javax.annotation.processing.Generated`, the
   `// Code generated by … DO NOT EDIT.` line the Go toolchain specifies, `<auto-generated>` in .NET. Each is
   a documented standard and therefore citable; each is a heavy vote, never a gate, so a hand-edited file
   carrying a stale marker is demoted rather than erased.

**A vendored dependency is not this repo's semantics.** `.gitattributes` `linguist-vendored` where present.
Where absent, a reading derivable from the history alone with no list at all: **a path whose blobs entered in
a single commit that added hundreds of files and were never subsequently edited is a drop, not development.**
Authorship concentration and edit recency are both computable from the commit graph the library already
builds.

**A rename is not a new concept.** JGit's `RenameDetector` gives `RENAMED_TO` at file level; at symbol level,
identity is the `bodyFingerprint` — a hash of the symbol's body with identifiers normalised — matched across
a commit's before and after trees. A `RENAMED_TO` edge means concept mass **moves**; it is not minted. The
falsifiable consequence, which belongs in the test suite: for a pure file rename, the `ConceptIntensity`
delta must be **exactly zero**. For a *symbol* rename the delta must be zero on the concepts the two names
share and non-zero only on the concepts where they differ — because renaming `fetchPage` to `loadPage`
genuinely does change which concepts the codebase writes, and a design that reported zero there would be
wrong in the other direction.

**Bot noise.** Measured over the 100 most recently closed pull requests of `junit-team/junit-framework` on
2026-08-13: **80 are authored by `renovate[bot]`**, 4 have an empty body, and only **5 of 100 carry any
label**. Two consequences the library must be built around. First, PR labels are far too sparse to be a
primary signal and can only ever be a light corroborating vote. Second, a bot-authored dependency bump has no
semantic content, and the permutation null of §11 is what says so — the library does not need to know what
`renovate` is.

## 17. Libraries

Versions verified against `repo1.maven.org` on 2026-08-13. Where a fact is not verified it says so.

| Purpose | Library | Version | Licence | Note |
|---|---|---|---|---|
| Parsing (primary) | `io.github.bonede:tree-sitter` + per-grammar artefacts | core `0.26.6`; `tree-sitter-java 0.23.5`, `tree-sitter-python 0.25.0`, `tree-sitter-go 0.25.0`, `tree-sitter-typescript 0.23.2` | tree-sitter MIT | JNI. **The core/grammar version skew (0.26 vs 0.23) is the first thing to measure** — ABI compatibility across it is not something to assume |
| Parsing (alternative) | `io.github.tree-sitter:jtreesitter` | `0.26.1` | MIT | The tree-sitter organisation's own binding, on the FFM API. **Requires Java 22+**; this project's toolchain is 21, so adopting it is a toolchain decision, not just a dependency one |
| Java type resolution (optional) | `com.github.javaparser:javaparser-symbol-solver-core` | `3.28.2` | Apache 2.0 / LGPL-3 dual | Turns `REFERENCES` from name-matching into real resolution. **Optional by design** — a library that requires a resolvable classpath cannot analyse a repo it cannot build |
| Java type resolution (alternative) | `org.eclipse.jdt:org.eclipse.jdt.core` | `3.46.0` | EPL-2.0 | Better resolution, heavier and Eclipse-runtime-shaped API |
| Git | `org.eclipse.jgit:org.eclipse.jgit` | `7.7.1.202607240634-r` | Eclipse Distribution License (BSD-3) | `RevWalk`, `TreeWalk`, `RenameDetector`, `DiffFormatter`. Pure Java, no `git` binary |
| Store | `org.duckdb:duckdb_jdbc` | `1.5.5.1` | MIT | Matches this project's pinned version |
| Graph export | `org.apache.tinkerpop:tinkergraph-gremlin` | `3.8.1` (4.0.0 is at `beta.3` — not yet) | Apache 2.0 | Export target only |
| RDF export | `org.apache.jena:jena-arq` | `6.2.0` | Apache 2.0 | Export target only; RDF4J `6.0.0` (EDL) is the equivalent alternative |
| Lexicon | `net.sf.extjwnl:extjwnl` + `extjwnl-data-wn31` | `2.0.5` / `1.2` | extjwnl EPL/LGPL; WordNet 3.1 Princeton licence | Via this project's `lexicon` module |
| Caching | `com.github.ben-manes.caffeine:caffeine` | `3.2.4` | Apache 2.0 | Sense lookups are hot and repeat |
| Test | `org.junit.jupiter:junit-jupiter` `6.1.3`, `org.assertj:assertj-core` `3.27.3` | | EPL-2.0 / Apache 2.0 | AssertJ `4.0.0-M1` exists but is a milestone |

**Rejected, with the reason.** `srcML` — a native C++ binary with no Maven artefact, and GPL-licensed (verify
before any reconsideration); the packaging alone disqualifies it for an embedded library. `universal-ctags` —
a native binary whose tag output is line-granular and syntactically shallow; retained only as a possible
fallback for a language no tree-sitter grammar covers. GitHub GraphQL — requires authentication, which
requirement 5 places outside this library.

**Why tree-sitter over an AST library.** A repository is polyglot: this one holds 1,649 `.java`, 232
`.ts`/`.tsx`, 27 `.kts`, 10 `.sh` and 8 `.yml` tracked files. One parser interface across all of them, with
symbol extraction expressed declaratively as `.scm` queries per language, is the difference between a library
and a Java tool. Error tolerance matters independently: a PR's head commit does not always compile, and a
parser that refuses such a file cannot analyse the PRs that most need analysing.

## 18. Word resources — what this library adds

Everything in §2 ports. Three additions, each of which must be a **published standard extracted by a named
Gradle task and bundled with a provenance header**, exactly as `sql-functions.tsv` is.

| Resource | Source | Licence | The question it answers |
|---|---|---|---|
| **Language keyword catalogues** | Each language specification's own keyword table — JLS §3.9; Python's `keyword.kwlist`; the ECMAScript reserved-word grammar; the Go spec's keyword list | The token list is a statement of the standard, not an expressive work — the `sql-functions.tsv` precedent exactly | Is this token the language's grammar rather than the author's word |
| **Standard-library API index** | Extracted from the platform itself, not downloaded: `javap` over `java.base`'s exported packages; Python's `sys.stdlib_module_names`; Node's `module.builtinModules` | Each platform's own licence covers its API names as statements of its standard | Is this token the platform's vocabulary rather than this repo's |
| **`github/linguist` data** | `languages.yml`, `vendor.yml`, `generated.rb` | **MIT — verify at adoption** | What language is this path; does the host's own tool call it generated or vendored |

Two resources are named in the brief and are **not** proposed. **SCOWL** and **CMUdict** answer questions the
Leipzig frequency list already answers here — is this a word, how common is it — and this project has already
found that widening a word list is not what fixes an unread token (`ACRONYM_READING_PLAN.md`). **Google Books
Ngrams** is CC BY 3.0 but the raw dataset is on the order of terabytes for a frequency prior the 166 KB
Leipzig list supplies. The measurement that would settle either: run the segmenter over a fixed set of a
thousand unsplit lowercase identifiers with each prior and compare accuracy. Pay for the larger resource only
if the difference is real.

One resource is refused on doctrine rather than on cost. **An embedding is not a citation.** A sentence or
code embedding yields a similarity with no nameable warrant — it cannot answer *why*, and a reading that
cannot be interrogated cannot be cited. Embeddings are therefore admissible only as a **candidate generator**
whose proposals a citable reading then confirms or refuses, never as evidence in their own right. This is the
same line `VOCABULARY_RETIREMENT_PLAN.md` draws between a citation and an assertion.

## 19. Visualising the semantic domain

The library ships queries and a projection, not a canvas. Two views, and one that must not be built.

- **Concept map.** Nodes are concepts, sized by `ι(c, S)`, positioned by the hypernym tree, edges are
  `HYPERNYM_OF`. This is a tree layout: the taxonomy already supplies the coordinates, so no force simulation
  is needed and none should be used. Clicking a node opens its evidencing permalinks.
- **Divergence bar.** The ranked `j(c)/JSD` shares between two scopes, signed by direction. It is a bounded
  share, so it charts as a diverging bar with a real axis maximum of 1 — no auto-scaled axis, no invented
  ceiling.

The reference viewer uses `@xyflow/react` for the concept map and ECharts for the divergence bar, both
already present in this project's frontend, so a consumer here adds nothing.

**What must not be built** is a force-directed view over every node kind at once. This repository's 931
main-source Java files yield 6,211 distinct words, of which 24.8% occur exactly once — and that is one
mid-sized repository at one commit. A whole-graph rendering is unreadable by construction, and readability
is not a layout parameter.

## 20. The first vertical slice

The smallest thing that produces a real graph over a real repo and a real PR. One language, one repo, two
PRs, one deliberately naive disambiguation.

**Subject.** `junit-team/junit-framework` — public, JVM, large enough to be real, and with a PR stream that
is 80% bot (§16), which makes it an honest test of the noise readings on day one rather than a flattering
one.

**The two PRs, chosen as a contrast pair:**

| PR | Author | Labels | Why |
|---|---|---|---|
| #5970 *Add Kotlin tabs to advanced topics* | `danil-pavlov` | `type: enhancement`, `theme: documentation`, `component: Platform`, `component: Kotlin` | A real human change with a nameable subject — one of only 5 labelled PRs in the 100 sampled |
| #5974 *Update dependency io.github.classgraph:classgraph to v4.8.190 (main)* | `renovate[bot]` | none | A dependency bump: no semantic content whatsoever |

**Scope of the slice.** Stages 1–3 in full (JGit + supplied metadata). Stage 4 for `.java` only; every other
path records `language = null` and abstains. Stage 5 with `tree-sitter-java`, extracting types, methods and
fields. Stage 6 with the widened grammar of §8. Stage 7 against the JLS keyword table and the `java.base` API
index. Stage 9 deliberately reduced to **WordNet's most frequent sense** — no disambiguation at all — so that
§9's contextual readings are later measured against a stated baseline rather than assumed to help. Stages 11
and 12 in full, including the permutation null.

**Acceptance, stated as measurements rather than as features.**

| Gate | Ships only if |
|---|---|
| Attribution | 50 sampled `READS_AS` edges render permalinks that resolve and highlight the exact lines that evidenced them — verified once by hand, then by test |
| Signal | PR #5970's top divergence concepts name documentation and Kotlin |
| **Noise** | **PR #5974's observed `JSD` does not exceed its permutation null.** A dependency bump has no semantic content; a statistic that finds some is wrong, and this is the single measurement that distinguishes a real reading from a plausible-looking one |
| Rename | A pure file rename produces a `ConceptIntensity` delta of exactly zero |
| Legibility | `λ` is reported for every scope, and the slice records its actual value on this repo rather than predicting it |
| Cost | The full analysis time over the repo is recorded, not estimated |

## 21. What this deliberately does not do

- **It does not judge code quality.** Nothing here reads complexity, coverage or churn as a virtue. The graph
  says what a codebase is *about*; what it should be about is not a question a dictionary can answer.
- **It does not infer intent from commit messages beyond their words.** A commit message is prose and is
  tokenised and read like any other prose. Conventional-commit prefixes are a published convention and may be
  cited as such; they are not a taxonomy of purpose.
- **It does not authenticate, clone or fetch.** Requirement 5, and also what makes it reproducible.
- **It does not resolve types by default.** Symbol resolution is an optional enricher, because a library that
  requires a buildable repo cannot analyse most repos.
- **It does not rank concepts without a reference.** Single-scope intensity is exposed, but the API makes
  divergence against a stated reference the shorter path, because it is the honest one.
- **It does not delete evidence.** Orphaned commits after a force-push, tokens nothing could read, and blobs
  with zero legibility all remain in the graph. What was observed and not understood is a finding.

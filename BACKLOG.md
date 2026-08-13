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
- `Tokeniser`, `WordRanks`, `WordSegmenter` and the 20,000-word Leipzig frequency list. The segmenter is split
  by responsibility into `PieceCost` (what one candidate piece costs to read), `CompoundParses` (the candidate
  covers, including the one leading branding residual) and `WordMorphology` (a known word grown by an affix),
  each directly tested.
- **The open-space accumulator** — `OpenSpaceAccumulator`, partitioning over the voted values plus one
  explicit abstention mass, so confidence reads as the winner's share among contenders and what nothing could
  read sits in the denominator instead of being implied by a vocabulary's size. Its test states the
  distinction against `AxisEvidenceAccumulator` directly rather than inferring it from the arithmetic.
- **The theme reading** — `TopicCitations` over WordNet Domains and Wiktionary topics, `TopicDistribution`
  (the plan's ι), `JensenShannon` with its additive per-topic decomposition, and `PermutationNull` at 999
  seeded resamples. Reports each source set's divergence from the repository, the topics accounting for it,
  and whether a scope of that size draws as much by chance — with the words carrying every claim, ordered by
  the mass each carried rather than by how often it was written. `ContentWords` cites WordNet's open-class
  coverage to keep prose to the words that carry subject matter and to read every word as its dictionary
  form; `WordSpecificity` weights a word nothing chose by the surprisal the frequency list states. All eight
  scopes currently stand outside their nulls.
- **The parse** — `JavaSource` over JavaParser 3.28.2, reading only what a repository *declared* (types,
  methods, fields, parameters, locals, components, constants), the prose it wrote, and the imports that are
  neither the platform's nor its own. A use of somebody else's declaration is never read, which is what
  removes `String`, `List` and `assertThat` without naming any of them. `PlatformPackages` cites
  `ModuleFinder.ofSystem()` for what the platform exports; `ImportOrigins` sorts an import by prefix walk
  against that and against the packages this tree declares.
- **The self test** — `./gradlew selfRead`. `IdentifierWords`, `CitedWords` over eight bundled resources,
  `LegibilityTally` and `LegibilityReport`. It reads this repository and reports λ per source set with the
  denominator, the per-resource support, what rests on each resource alone, and the unread tail with a site
  for each. Current result in the README: **λ = 0.979** over 40,557 read word occurrences in 178 files, documentation included.
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

**Measurement:** the nine-identifier table in the plan, now pinned in `TokeniserTest` so a widening shows up
as a rewritten expectation rather than as a silent change, plus the count of live identifiers whose reading
changes. The self test already names live instances: `aprefix` (10), `asuffix` (10), `aword` (9), `acompound`
(4) and `jwnlexception` (10) are in the unread tail because there is no acronym-run rule and no rule for a
single capital in front of a word. Ships when the five known mis-splits read correctly, those tail entries
disappear, and nothing that read correctly regresses.

*Blocked on nothing.*

## [HIGH] The cited catalogues

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

The Java half of the first item is **already cited without a bundled file**: `JavaLanguageKeywords` delegates
to `javax.lang.model.SourceVersion`, which is the platform's own implementation of the JLS keyword table. The
same trick does not exist for the other languages, and a contextual keyword (`var`, `record`, `sealed`,
`yield`) is deliberately not named by it, because whether one is a keyword is a fact about where it sits and a
scan cannot see that.

**Measurement:** the share of word occurrences a catalogue demotes. Over the source project's 931 Java files,
Java keywords were 13.5% of 381,466 word occurrences and a forty-name sample of JDK tokens a further 11.1%. On
this repository the keyword citation already demotes 3,137 of 14,600 identifier occurrences (21.5%); the
standard-library index is what would then read `charsets` and `unmodifiable`, which the self test's tail names
as unread fragments of `StandardCharsets` and `unmodifiableList`.

*Enables rule 4 of the splitter to arbitrate rather than guess.*

## [MEDIUM] Stages 1–3 — the repository read

`RepositoryWalk` (blob rows off a ref), `ProvenanceRead` (JGit `RevWalk` + `RenameDetector`),
`HostMetadataRead` (`RepositoryFacts` in, pull request and review nodes out). No network: the library is
handed a clone path.

The unit of observation is the **blob** — a `(blobSha, path)` pair. It is content-addressed, so an unchanged
file across five hundred commits is one observation parsed once. That single choice does most of the work in
incremental re-analysis and most of the work on generated code, and it is not a tuning decision.

## [MEDIUM] Stage 5 — the syntax parse

**A Java parse is in the tree** (`JavaSource`, JavaParser 3.28.2) and the self read runs on it, which is what
lets the reading tell a declaration from a use. It is one language, no symbol resolution, and its error
tolerance is measured rather than assumed — see the item below. What follows is still the polyglot stage:

tree-sitter, one parser interface across a polyglot tree, symbol extraction as `.scm` queries per language.
**Measure the core/grammar version skew first** (core 0.26.6 against `tree-sitter-java` 0.23.5): ABI
compatibility across it is not something to assume, and if it does not hold the alternative is `jtreesitter`,
which needs Java 22 and is therefore a toolchain decision.

Error tolerance is a requirement, not a nicety: a pull request's head commit does not always compile, and a
parser that refuses such a file cannot analyse the pull requests that most need analysing.

## [MEDIUM] The store

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

## [MEDIUM] Intensity and divergence

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

## [MEDIUM] Sense disambiguation — the parts context does not reach

**The sibling half has landed.** `PhraseTopics` reads a phrase's words as context for one another: a subject
scores by the geometric mean of what its agreeing words committed, times the share of the phrase that agrees,
and the phrase commits what it settled on. That is the plan's first disambiguating vote, and it took `law`
from 39 files led to 28 without anything being excluded.

Two of the plan's three contexts remain, and both reach further than a phrase can:

The **enclosing declaration's** tokens, decayed by scope distance — a local called `key` inside
`HttpHeaderParser` reads differently from one inside `EncryptionService`, and neither phrase contains the
other's words. And the **file's pooled topical domain** as a prior over its own phrases, which is what would
finally settle `jupiter` in an import as the test framework a test file imports rather than a Roman god.
Each a vote, none a gate. The sibling reading is also still shallower than the plan asks: it agrees on
labels where the plan intersects hypernym chains, so two words meaning neighbouring things agree on nothing.

**Measurement, now available as a baseline rather than a prediction:** `mythology` is a qualified theme of
one source set and its witness is `jupiter`, from the JUnit Jupiter import — the dictionary knows Jupiter as
a Roman god, and nothing in the reading knows the file meant a test framework. A disambiguation that does not
remove that reading has not helped.

## [HIGH] Verbal forms — the rest of the behaviour reading

`Behaviours` reads a declared method name as a clause: the leading word where the dictionary carries a verb
entry for it, and the rest as what the verb acts on. 539 of this repository's methods read that way — read
(81), name (20), refuse (19), carry (14). Three parts of the question it was asked are **not** answered yet,
and each is a separate slice.

**Class names are not read as structures.** A type name is not a clause but it is not nothing either:
`WordSegmenter` is an agent noun over a verb, `TopicTally` a noun over a noun, `ParsedRepository` a participle
over a noun. WordNet carries the derivational links (`segmenter` → `segment`) that would recover the verb
inside the agent noun, which would let a type say what it *does* rather than only what it is called.
*Measurement:* the share of declared types whose name yields a verb, and whether the verb it yields matches
the verbs of the methods it declares. A type whose name promises one thing and whose methods do another is a
finding worth having.

**The verb is chosen without context.** `massByTopic` reads as the verb *mass* because English can mass
troops; the parse knows it is a getter and the reading does not ask. A part of speech is a fact about a word
in a position, and only the position is missing. *Measurement:* the count of clauses whose verb disagrees
with what the declaration does — a method returning a value and taking none is not performing its first word.

**The structured form stops at verb and object.** What a consumer wants is a specification: subject
(the declaring type), verb, object, and the condition a test name states after `when` or `that`. The clause
is already parsed far enough to carry the first three; the fourth is a grammar rule about where a
subordinate clause begins. *Measurement:* the share of test names that yield a condition, against the share
that state one in prose.

## [MEDIUM] The Wiktionary topic hierarchy

`sciences`, `natural-sciences` and `physical-sciences` fire together on the same words and split one theme
three ways; `computing` and `computer_science` are the same subject under two resources' labels. Wiktionary
publishes its topic hierarchy as its own module data, so pooling a label with its parent would be a citation
rather than a synonym list — which is the only form this library may take. Extract it with a named Gradle
task and a provenance header, exactly as the other TSVs are.

**Measurement:** the count of distinct topics (493 today) and whether the top of the ranking changes when
siblings pool. Five labels — `sciences`, `natural-sciences`, `physical-sciences`, `engineering`,
`computing` — currently fire on the same words and lead almost no files between them, which is one theme
counted five times. A fold that only reduces the label count without moving the reading has bought nothing.

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

**A first viewer exists** for the theme reading — `docs/self-reading/build_themes_page.py` renders
`themes.json` as a page whose every figure is copied from the export, so the picture and the report cannot
disagree. Its layout is deterministic (themes on rows ordered by intensity, arcs joining two themes when the
same word was read as both), which is the same discipline the concept map below demands and for the same
reason: no force simulation, because readability is not a layout parameter. What it draws is the shared
*word*, which makes the polysemy that dominates a raw ranking visible instead of hiding it.

Still to build: a concept map laid out by the hypernym tree — the taxonomy supplies the coordinates, so no force simulation
is needed and none should be used — and a divergence bar over the ranked per-concept shares, which chart as
diverging bars with a real axis maximum of 1.

**What must not be built** is a force-directed view over every node kind at once. One mid-sized repository at
one commit yields 6,211 distinct words, 24.8% of them occurring exactly once. A whole-graph rendering is
unreadable by construction, and readability is not a layout parameter.

## [MEDIUM] The parser's error tolerance, measured

The plan chose tree-sitter for parsing partly because error recovery is a documented strength, and the self
read uses JavaParser instead — pure Java, no grammar binary, no JNI and no version skew, which for a
Java-only reading is the cheaper honest choice. Its recovery is **narrower than the plan assumes, and now
measured**: an error inside a method body leaves the surrounding declarations readable, while an error in the
structure that holds the bodies — an unclosed type, a malformed signature — yields nothing at all for the
whole file. `JavaSourceTest` pins both.

**Measurement that settles the choice:** take the head commits of a sample of open pull requests, count how
many parse at all under each of JavaParser and `tree-sitter-java`, and count the declarations each recovers.
A parser that refuses the commits most worth reading cannot be the one the pipeline standardises on.

## [LOW] What the self test cannot yet say

Each of these is a limit of the reading rather than a bug in it, and each is answered by a slice above rather
than by tuning this one.

- **A parse is not a resolution.** A declaration is known by its position in the syntax, so a call to a method
  this repository declared is indistinguishable from a call to somebody else's and neither is read. The plan
  counts a name once per occurrence, which this cannot yet do honestly: it would need to attribute a call to
  the declaration it reaches, and that is `javaparser-symbol-solver`, optional by design.
- **It reads a working tree, not a revision.** Nothing is pinned by a commit SHA, so no permalink is rendered
  and no vote is cast — `ConceptVote` could not be constructed without an anchor, which is the type system
  doing its job. Stages 1–3 are what change this.
- **It asks WordNet for noun and verb lemmas only**, which is the coverage the `Lexicon` contract exposes. An
  adjective or adverb the dictionary knows and neither part of speech carries reads as uncited, so the WordNet
  column understates its own resource — the direction an unverified figure should err in.
- **It drops prose.** Comments carry words the pipeline will read as prose evidence in its own right, and
  counting them in a figure about what the code is written in would flatter it. A prose legibility figure
  reported *beside* the code one is the honest form, and needs the prose reading first.
- **λ over one scope is a weak reading**, exactly as §16 of the plan says of intensity. It is reported because
  a denominator must be, not because a single-scope number is the interesting one. The divergence against a
  stated reference is.

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

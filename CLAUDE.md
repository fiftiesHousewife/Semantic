# Claude Code Session Notes

This document is the authoritative reference for code style, architecture decisions and the pre-push checklist in this repository. It carries the conventions of the Business Intelligence project, from which this library's evidence machinery is ported, plus the doctrine that is specific to reading code.

---

## The doctrine

Everything below about style is negotiable in the way conventions are. This section is not.

**Every signal is a weighted vote from a citable derived resource. No hand-written vocabulary, no exclusion list, no gate.**

| Rule | Consequence here |
|---|---|
| Signals are votes, never gates or hand lists | No `GENERATED_PATHS` set, no `STOP_WORDS`, no vendored-directory list. A generator marker is a heavy vote, so a hand-edited file carrying a stale marker is demoted rather than erased |
| A reading that cannot cite abstains, and abstention is a *correct outcome* | A token no resource reads contributes nothing, and the graph records that it was seen and not read |
| A signal that cannot speak must abstain, **not vote zero** | Zero weight, not a zero-valued vote — and test that directly rather than inferring it from the arithmetic |
| A citation outranks an assertion | Cited readings run before any structural heuristic |
| A bound must be derived, never chosen | Every reported statistic has a maximum that follows from its definition. A share bounds itself at 1; JSD bounds itself at 1 bit; KL is unbounded and is therefore not used |
| A winner qualifies against the **chance-expected maximum** of its field | A small pull request's divergence is judged against a permutation null, never a fixed sigma count |
| Grammar is not vocabulary | The identifier splitter's rules are grammar and are permitted. A list of words is not |
| Every bundled resource carries a provenance header, and one nothing reads fails the build | `VocabularyProvenanceTest` enforces the first half over both resource directories; `BundledResourceReachabilityTest` enforces the second over the artefacts the build publishes. The dead-class half of the contract — the class naming a resource must itself be named — is backlogged, not dropped |
| Do not mark your own homework | The repositories a reading is tuned on and the repositories it is measured on are drawn disjointly |
| An embedding is not a citation | Admissible only as a candidate generator whose proposals a citable reading confirms, never as evidence in its own right |

**A curated statement of a published standard is citable; a curated observation of a corpus is not.** That distinction is what lets the library know `final`, `static` and `return` are the language's words and not the author's, without ever writing a stop list. The precedent is `lexicon/src/main/resources/sql-functions.tsv`, whose own header states it.

The cheapest form of that precedent needs no bundled file at all: **where a standard's own runtime can be asked the question, ask it.** `PlatformPackages` cites `ModuleFinder.ofSystem()` for which packages are the platform's, so `java.util` is set aside where `net.sf.extjwnl` is kept; `ContentWords` cites WordNet's open-class coverage for which words in a sentence carry subject matter, so the words English uses to hold a sentence together are refused without a stop list existing. An extracted table can go stale against its standard; a delegation cannot.

**Read declarations, not uses.** Most of what a Java file contains is somebody else's vocabulary quoted — `String`, `List`, `assertThat` — and a use is not a word this repository chose. The parse is what tells the two apart, and that single rule removes the platform and the test framework from every reading without naming any of them. It is grammar, and grammar is permitted where a list of names to ignore is not.

### Where the doctrine is currently held open

- `CitedTokens.NONE` is the default the word segmenter runs on: it recognises nothing, so a compound is read by word frequency alone. That is deliberate. Implementations must be backed by an extracted, provenance-headed resource — a specification's own keyword table, a platform's own API index — never by tokens curated from the repositories the library was developed against. **The one bundled catalogue that looks like it would fill the seam does not**, and `CitedTokenCatalogueTest` measures why rather than asserting it: the Wikidata initialism registry carries 74,397 tokens, 14,322 of them three letters long, and 1,195 of them among the ten thousand commonest English words — `THE`, `OF`, `AND`, and the ones a Java file actually contains, `CODE`, `DATA`, `NAME`, `TYPE`, `LIST`, `NODE`, `SIZE`. A segmenter arbitrating against it would find a reading for very nearly any run of letters. Narrowing it by the prominence the registry itself states is the obvious next move and is a **bound, so it must be derived** — on repositories this reading was not written for, not on this one.
- `Tokeniser` is the narrow schema-identifier grammar, ported unchanged and **known to be too narrow for code**: it mis-splits `XMLHttpRequest`, `parseHTTPResponse`, `toJSONString`, `getDSLContext` and `IPv6Address`. The class javadoc names each and `TokeniserTest` pins each, so widening the grammar is a deliberate change to a stated expectation rather than an accident. It is grammar work, not vocabulary work. The live instances this named — `carriesAPrefix` read as carries / aprefix, `JWNLException` as jwnlexception — are no longer in the unread tail: the acronym-run rule and the rule for a single capital in front of a word landed in `IdentifierWords`, beside the ported grammar rather than inside it. What is left of the splitter is the letter/digit boundary, blocked on a catalogue, and byte offsets on a token.
- `AxisEvidenceAccumulator` partitions over a **closed** enum. Concepts are an open space of ~10⁵ synsets and need a sibling accumulator whose partition runs over the voted values plus one explicit abstention mass.

---

## Project setup

### Version catalogs

All versions live in `gradle/libs.versions.toml`. No hardcoded versions in build files. **Every catalog entry is consumed by a module.** An entry naming a library nothing declares states an intention the tree cannot check, and the version it pins goes stale unread, so an entry arrives with the module that uses it and leaves when that module stops.

### build-logic convention plugins

Multi-module structure with a `build-logic/` included build. The root `build.gradle.kts` carries aggregate tasks only — no `allprojects {}`, no `subprojects {}`. Convention plugins are named `cs.<concern>.gradle.kts`. Submodule build files are `plugins { id("cs.xxx") }` plus module-specific dependencies, and nothing else.

| Plugin | For |
|---|---|
| `cs.java-conventions` | Java 21 toolchain, `-Xlint:all -Werror`, Error Prone, JaCoCo at an 80% instruction floor |
| `cs.java-library` | The above plus `java-library` and AssertJ |
| `cs.maven-publish` | Sources and javadoc jars, `mavenJava` publication |
| `cs.aggregate-tasks` | `checkAll` |

---

## Code quality standards

### Structure

- **Single responsibility.** If you need the word "and" to describe what a class does, split it. When splitting, name each resulting class after what it does — a split produces two classes that each make sense on their own, never a "main" class and a "helper".
- **150 lines is the hard limit, ~50 the target.** A class approaching 150 is a signal to split by responsibility.
- **Break complex logic into many small named methods.** Every extracted method is a candidate for a direct unit test.
- **Polymorphism over conditionals.** Replace `if`/`else if` chains that switch on type or kind with enums carrying behaviour, strategy interfaces, or ordered lists of rules. No enum switches, no `instanceof` chains.
- **Prefer non-static code.** Instance methods on well-named classes that can be injected and tested, over static utilities scattered about.

### Naming

- No `*Helper`, `*Util`, `*Manager`, `*Processor`. Name a class after what it represents or produces.
- No methods starting with `handle`, `process`, `do`, `perform`. Name a method after what it returns or what it changes.
- No abbreviations unless universally understood in context (`id`, `url`, `sha`).
- **No invented idioms, and no term borrowed from a field that means something else there.** A word chosen because it sounds precise is a word every reader has to be taught, and one already in use elsewhere teaches them something false. Where a concept has a standard name in statistics, machine learning or linguistics, use that name; where it has none, use plain English that says the mechanism. Two are in the tree now and are wrong:

  | In the tree | Where it comes from, and why it misleads | Use instead |
  |---|---|---|
  | `panel` | Econometrics, where panel data is repeated observations of the same units *over time*. This is a set of repositories read once each | **evaluation set** — the repositories a reading is measured on, held out from the ones it was developed against |
  | `arm` | Clinical trials, where an arm is a group receiving one treatment. This column says what a member is there to demonstrate | **expected result** — and its values are ordinary controls: a member the vocabulary should fire on is a positive control, one it should stay silent on a negative control |
- Parameterless factories are `newInstance()`, not `of()`.
- No magic strings. A literal appearing more than once, or whose meaning is not self-evident, is a named constant — named after the value, with no `VAR_`/`STR_`/`KEY_` prefix.
- **Prefer monadic functions.** A method taking a string label to vary its behaviour should be several clearly-named methods instead.

### Correctness

- **Fail fast — no null checks as control flow.** Never `if (x != null)` to branch, guard or default. Never `Map.get()` followed by a null check — use `getOrDefault`, `computeIfAbsent`, or let it fail. The only acceptable null checks are `Objects.requireNonNull` at API boundaries and `@JsonInclude(NON_NULL)`. A genuinely optional value is `Optional` in the contract; never return null.
- **Never swallow exceptions.** No catch-log-and-continue. Catch only at a well-defined boundary where a meaningful error can be returned.
- **Prefer immutable objects.** Records, `final` fields, `List.copyOf`. No setters.
- `final` on locals and fields wherever they are not reassigned; on parameters too unless a long list makes it noise.
- Always curly braces, even for single-line bodies.
- `java.nio.file.Path` / `Files` only. Never `java.io.File`, `FileInputStream`, `FileOutputStream`.
- Lombok `@Slf4j` for logging. Never `System.out.println`, never `e.printStackTrace()`.
- Package-private (not `private`) for helper methods that deserve a direct test.

### Style

- 120-character lines, in Java and in Kotlin build scripts. **Markdown is never hard-wrapped**: a wrap falls mid-clause and the raw file reads badly, so a paragraph, a bullet or a table row is one line however long, and the editor soft-wraps it.
- **Prefer `forEach` over enhanced for-loops** when the body is a single call or a collection populate. A traditional loop is correct only when the body needs `continue`, `break`, `return`, an index, or a checked exception.
- **Prefer filters over bucket loops, streams over indexed loops.** A loop classifying elements through an `if`/`else if` chain is one filter per bucket with each predicate a named method. A loop pairing an index with element access is `IntStream.range(...)`. Multiple passes over a small list are cheaper than one pass nobody can read.
- **One fluent call per line.** A chain breaks before every `.`, each call indented one step past its receiver — never two calls run together on one line. Where calls cannot chain — a `Pattern.matcher` wrapping another matcher's result — name each intermediate as a local rather than nesting the expressions.
- Static imports where they clarify (assertions, constants); not where the originating class carries important context.
- **No spurious comments.** A comment is spurious if it restates the code. Comments explain *why* something non-obvious is done, or document a gotcha.
- **Javadoc is blunt, factual and terse.** State what the thing is, and the gotcha if there is one. Stop. A caller who reads two sentences should know what they need.
- **Never narrate history.** What the code used to do, what it cost before, which run or defect changed it, how many seconds it saved — none of that belongs in a javadoc. `git log` and the backlog hold it.
- **No measurements.** Figures move with every commit; a javadoc quoting one is wrong by the next. They live in `output/json/` and in the backlog.
- **No essays and no rhetoric.** No building to a conclusion, no rhetorical contrast ("X is worse than Y, not better"), no restating one point in three shapes, no throat-clearing before the fact. If a paragraph does not change what a caller does, delete it.
- **Never reference plan documents or section numbers in code comments.** State the reasoning itself. Strip any pre-existing reference you find.

### Reader-facing prose: reports, README, headings

The long form of these rules, with the examples and a review checklist, is the `written-english` skill — [`docs/SKILLS.md`](.claude/skills/SKILLS.md) indexes it and states how to install it. What follows is the condensed form, which binds whether or not the skill is loaded.

Everything a reader outside this project sees — every file under `output/`, the README, and **every heading in either** — holds to this. It is stricter than the javadoc rule above, not looser.

- **No metaphor, in a heading or anywhere else.** *How the two sides were made to meet* says nothing; **Matches per normalisation** says what the table holds. State the mechanism in short, plain, factual phrases. The same refusal applies to *abstains*, *votes*, *speaks* and *earns*: state the arithmetic — a weight of zero, a share of the total.
- **Define an ambiguous term where it first appears, and link the definition somebody else published.** *Sense*, *scope*, *span*, *mass*, *rung* all carry an everyday meaning and a technical one. Give the technical one in a clause at first use and link the publisher who states it — for *sense*, WordNet's own documentation. Where no external definition exists, **use a commoner English word, or the standard term of the relevant specialist field — never a meaning invented here.** A term this project genuinely coined belongs in [`docs/GLOSSARY.md`](docs/GLOSSARY.md), defined, and linked at first use.
- **Terse and structural.** Bullets and tables before paragraphs; a paragraph carrying three figures is a table with three rows. No elaboration, no padding, no narrative of what the reading used to do.
- **Active voice.** Name what does the thing. *The branch rule refuses 56 terms*, never *56 terms were refused*. A passive sentence hides the actor, and the actor is what a reader needs to check the claim.
- **A worked example beside anything specialist.** One named word, its two shares, and the arithmetic that produced its figure.
- **A link's text is the thing it names** — `TermSpans`, never the URL.
- **Never write an HTML entity into markdown.** `&nbsp;` is escaped to text by the page renderer and appears literally in the table. Write the character.

---

## Test standards

- **Test-drive everything.** The failing test comes before the fix.
- **No comments in tests.** Method names are self-documenting; structure is arrange, act, assert.
- **No underscores in test names, and never the word "test".** Plain English camelCase sentences describing the behaviour: `refusesAShortPieceTooRareToCountAsAWordWithoutACitation`.
- **`assertAll` for multiple assertions** on the same object, so every failure is reported.
- **JUnit `@TempDir`** for temporary files. Never create them by hand.
- **No disabled tests, no commented-out code.** A disabled test is a lie — it looks like coverage and provides none. Delete it or fix it.
- **Never hand over a manual verification checklist.** Encode the scenario in the suite. Manual checking is for taste only.
- **Never dismiss a flaky test.** Investigate immediately.
- Tagged tests: `generate`, `diagnostic`, `pinned` and `backtest` are excluded by default, so `checkAll` runs none of them. Run a tag with `-Dinclude.tags=diagnostic`, which also streams the forked JVM's console output. The `pinned` findings assert this tree's own figures — run them before a push, because a change that moves a pin passes the gate without them.
- **The self test is `./gradlew read`.** It runs every `diagnostic`-tagged reading over this repository and writes three files under `output/json/`: `reading.json` (the answers, versioned and validated against `reading-export.schema.json`), `evidence.json` (the workings behind them, versioned and validated by nothing) and `changes.json` (what moved since the previous reading, written only where there is one of the same `schemaVersion` to compare against). **A reading writes JSON and nothing else** — there is no markdown, no HTML and no SVG, and `PublishedFormat` refuses any name that is not `.json`. Point it at another clone with `-Dcs.clone.dir=<path>`. The test convention forwards three properties to the forked JVM — `cs.clone.dir`, `cs.evaluation.dir` and `cs.taxonomy` — and nothing else, so a property read inside a test has to be one of those or be passed as a task argument. The corpus it reports on is this repository — **including its own documentation**, so any commit that changes a source file *or a markdown file* moves every figure in it. The report is inside the thing it reports on, and there is no commit at which the two agree exactly: writing the figures down changes them. So quote them as a reading **of a named commit**, regenerate with `./gradlew read` whenever the reading itself changes, and do not chase the fixed point. A figure that is a commit or two old is honest; one taken from a different version of the reader is not.

### Measurement is the argument

This library's claims are measurements. A change that cannot be shown to move a number is not shipped on the strength of being reasonable. Where a decision is uncertain, state the measurement that would settle it and run it, rather than asserting an answer — the plan does this throughout and the code should too.

---

## Pre-push checklist

1. `./gradlew cleanTest checkAll` — **a cached `BUILD SUCCESSFUL` reads exactly like a real green.** Run `cleanTest` before trusting one.
2. Gate on the actual `BUILD SUCCESSFUL` log line, not a background exit code.
3. Never run Gradle concurrently with another Gradle invocation, and never pipe Gradle through `tail`.
4. If the change adds, removes or renames a Java file — or changes how a name is read — run `./gradlew read`, then land the regenerated figures in a follow-up commit that touches no Java.
5. **Never `git push` without explicit instruction.**

---

## Agent session environment (macOS sandbox)

The agent shell runs inside a macOS sandbox profile that constrains its child processes.

- **Commands handed to the user must be a single physical line.** Backslash continuations do not survive the copy-into-`!` path.
- Long-lived child processes accumulating under the agent shell tighten the sandbox for the rest of the session; subsequent browser launches then fail with `bootstrap_check_in … Permission denied (1100)`, which is sticky and not fixable from inside the session. Do not spawn long-lived servers from the agent shell.
- **Gradle's macOS toolchain detection fails in the agent shell** and reports `Cannot find a Java installation`. It shells out to `/usr/libexec/java_home`, which the sandbox blocks, so Gradle sees only the JVM it is already running on — the installed JDKs are readable and runnable, and only the detector is blind. Pass the path: `-Dorg.gradle.java.installations.paths=/Library/Java/JavaVirtualMachines/jdk-25.jdk/Contents/Home`. A shell outside the sandbox reads it from `~/.gradle/gradle.properties` and needs nothing.
- The agent can write only within this repository tree and the session scratchpad. Anything outside it — including a sibling directory — needs the user's own shell, prefixed with `!`.

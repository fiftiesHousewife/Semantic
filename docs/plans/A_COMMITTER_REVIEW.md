# One committer, one review document

What a committer did to a codebase, as one structured document per committer per repository. It answers four questions and attaches no verdict to any of them.

| | The question | Where the figures come from |
|---|---|---|
| 1 | What did they work on? | the semantic reading, run over the files each change touches |
| 2 | How much, and where? | files by kind, declarations, the scopes and modules spanned |
| 3 | What kind of work was it? | the three sources that name a change, and whether they agree |
| 4 | What did it leave in the code? | complexity, duplication, tests, published surface, security surface |

**The unit is the committer over history.** [`fetch/fetch-commit-changes.sh`](../../fetch/fetch-commit-changes.sh) writes any clone's commits in the shape the change path already reads, and a commit is a base and a head the way a pull request is. The per-pull-request reports are then one grouping of the same figures.

**Authorship is a stated fact.** A tool that writes code writes its own name into the commit — `Co-authored-by` trailers, author addresses such as `noreply@anthropic.com`, actor logins such as `copilot-swe-agent[bot]`. [Debt Behind the AI Boom](https://arxiv.org/html/2603.28592v2) identifies AI authorship exactly this way over 302,579 commits across 29 tools. Every figure below is reported for attributed and unattributed commits side by side. **A commit with no trailer is unstated, never human**, and the document says so.

**No composite score.** A number combining complexity, duplication and coverage is an assertion with no publisher behind it. The document states the figures and the reader judges.

---

## What the document holds

One section per question, each opening with the figure and reaching the list behind it.

| Section | States | Banded against |
|---|---|---|
| **Subject** | the words the committer's changed files write above both references, the concepts the bundled vocabularies state for the terms those files write, and how far each statement sits from the code it describes | the chance bar each figure carries already |
| **Scale** | commits, files by kind, declarations added, removed and kept, scopes and modules touched, statements against prose lines | the repository's own quartiles |
| **Kind** | what the statement calls the change under Conventional Commits, what the tracker calls it, what the shape calls it, and how often the three agree | the counts themselves |
| **Code left** | complexity, method length, nesting and parameters at median, 75th centile and worst; types arriving with no test; test methods added | the repository's own 75th centile |
| **Duplication** | bodies repeated inside a change, and bodies a change adds that already stood in the tree | a permutation null over the tree's own bodies |
| **Surface** | declarations added to and removed from the published API, and dependencies added, removed and moved | Semantic Versioning's own definition of an incompatible change |
| **Security** | shapes a published weakness catalogue defines, imports in the platform's own security packages, and dependencies an advisory names | each row quotes its publisher's definition |

The last three sections do not exist yet. What each needs is below.

---

## What a new commit needs measured

### 1. Duplication against the whole tree

[`RepeatedBodies`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/RepeatedBodies.java) compares a change's bodies against each other. A body copied out of the codebase is invisible to that, and it is the pattern [GitClear's 211 million lines](https://www.gitclear.com/ai_assistant_code_quality_2025_research) puts most of the rise in churn on: code clones grew fourfold while moved code fell.

**Exact repeats need no threshold.** Index every method body in the tree at base by its printed parse — the same comparison `RepeatedBodies` makes, so formatting and comments play no part — then look up each body the change adds. A hit publishes the added method, the statements it carries, and where the body already stood.

**Near repeats need a derived bound, and that is the whole difficulty.** [PMD's copy-paste detector](https://docs.pmd-code.org/latest/pmd_userdocs_cpd.html) runs Karp–Rabin over a token stream with a minimum-tokens parameter, and that parameter is chosen by whoever runs it. Quoting its default would be choosing a bound. The derivation this library already uses everywhere applies unchanged:

1. Take the added body's token sequence and its nearest neighbour in the tree.
2. Draw 999 pairs of bodies of the same statement count at random from the same tree.
3. Report the body only where its nearest neighbour is closer than all 999.

**Worked example.** A change adds a 14-statement method. Its closest match in the tree shares 46 of 61 tokens in sequence. Among 999 random pairs of 14-statement bodies from that repository the best shares 31. The body is reported, and the figure stated is 46 against 31.

**Cost.** Bucketing by statement count keeps the comparison to bodies of the same size. The null is drawn once per repository per size band, not once per body.

**What settles it**: a repository with known copy-paste and one without, and the count each produces.

### 2. Code moved rather than written

[`MovedDeclarationsProbe`](../../code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/MovedDeclarationsProbe.java) counts declarations whose body stands at both ends under another name. It sits in a test source set and has never run against a sample containing refactoring — tika's thirteen pull requests contain none.

**What settles it**: a repository whose history carries a named refactoring commit, and whether the probe finds it.

### 3. How old the code was when it was changed

GitClear's third pattern is code rewritten shortly after it was written. The commit timestamps the fetch pins are enough to measure it, given the commit that last touched each changed line.

**The window must not be chosen.** Two weeks is GitClear's window and no bound follows from it. The figure is therefore the **distribution of line ages at the moment of change**, stated at median, 75th centile and worst like every other spread in the report, with the repository's own distribution beside it.

**What is owed**: `fetch-commit-changes.sh` writes, per changed file, the commit that last touched each line at base.

### 4. The published surface

The parse records which declaration a name is and never its modifiers, so nothing in the tree can tell a removal from the published API from a removal of something private. That single gap leaves two rows of [`change-shape-types.tsv`](../../lexicon/src/main/resources/change-shape-types.tsv) unfillable and blocks the plainest quality signal a reviewer wants.

Adding modifiers to the parse is pure shape and JavaParser carries them already. It turns on:

| Measurement | Citation |
|---|---|
| a declaration removed from the published API | [Semantic Versioning](https://semver.org/) calls it an incompatible change, which Conventional Commits correlates with the `BREAKING CHANGE` footer |
| a member whose visibility widened between base and head | the same definition, applied to the surface the change enlarged |
| the share of added declarations the build publishes | the figures already counted, split by the modifier |

**What settles it**: the `removes declarations and adds none` row of the bundled mapping stops answering nothing.

### 5. Dependencies

A change adding a coordinate adds code the committer did not write and the reviewer did not read. The coordinate is a fact the build file states, so the measurement needs no judgement: coordinates added, removed, and moved between versions, read from the poms at base and at head the change path already parses.

### 6. Breadth

How many scopes and modules one change spans. A change touching nine modules and one touching one are different review loads at identical file counts, and the scope machinery answers it already.

---

## Static security review: what can honestly be identified

**The refusals first**, because they bound everything else.

| Refused | Why |
|---|---|
| a hand-written list of dangerous methods | it is the doctrine's central prohibition, and a list nobody published is an assertion |
| taint or dataflow analysis | it needs type resolution and a call graph. No symbol solver is on the classpath, and the honest answer to a question the machinery cannot ask is silence |
| a security score, or the word *insecure* | the document states a shape and names who defined it |
| any rule needing to know what a name refers to | `a == b` on two strings is [CWE-597](https://cwe.mitre.org/data/definitions/597.html) only where both are strings, and the parse cannot say |

Three routes remain, and all three cite a publisher.

### Route 1 — the weakness catalogue already bundled

[`cwe-terms.tsv`](../../lexicon/src/main/resources/cwe-terms.tsv) carries 993 weaknesses of CWE 4.13, each with MITRE's own name, definition, abstraction level and parent. It is read today as a term vocabulary — it answers whether a repository *writes* security words.

A second reading of the same file answers a different question: **which weaknesses are a shape the parse alone decides.** The form is the one [`change-shape-types.tsv`](../../lexicon/src/main/resources/change-shape-types.tsv) already uses for Conventional Commits — one row per measurable shape, quoting the publisher's definition beside the measurement taken to cover it, so a reader can check the pairing rather than trust it.

| The parse measures | The weakness | MITRE's definition, quoted |
|---|---|---|
| a `catch` block carrying no statements | [CWE-390](https://cwe.mitre.org/data/definitions/390.html) | The product detects a specific error, but takes no actions to handle the error |
| any other block carrying no statements | [CWE-1071](https://cwe.mitre.org/data/definitions/1071.html) | The source code contains an empty code block |
| `catch (Exception)` or `catch (Throwable)` | [CWE-396](https://cwe.mitre.org/data/definitions/396.html) | Catching overly broad exceptions promotes complex error handling code that is more likely to contain security vulnerabilities |
| `throws Exception` on a declaration | [CWE-397](https://cwe.mitre.org/data/definitions/397.html) | Throwing overly broad exceptions promotes complex error handling code |
| a `finalize()` declaration | [CWE-586](https://cwe.mitre.org/data/definitions/586.html) | The product contains an explicit call to the finalize() method |

**The credential row is the interesting one**, because it is where the two products meet. [CWE-798](https://cwe.mitre.org/data/definitions/798.html) is hard-coded credentials, and deciding it needs to know that a field named `password` or `apiSecret` is about credentials. A hand list of such words is refused. The bundled resources already answer it: the reading resolves each word of a declared name to the subjects WordNet Domains and Wiktionary state for it, so the rule becomes **a field the bundled resources place under a security or cryptography subject, initialised from a string literal**. The vote is a citation, the shape is the parse, and neither is a list written here.

**What settles the whole route**: every row runs against the eleven evaluation members. A row firing on a repository with no security domain is a row measuring the wrong thing. **Abandon a row if** it cannot be decided by the parse alone, or if its count on the out-of-domain members is not near zero.

### Route 2 — the platform states its own security surface

[`PlatformPackages`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PlatformPackages.java) already asks `ModuleFinder.ofSystem()` which packages the platform exports. The same delegation answers which of them the platform itself calls security: `java.security`, `java.security.cert`, `javax.crypto`, `javax.net.ssl`, `javax.security.auth`, and the reflection packages beside them.

A change adding imports of those is a change touching the platform's own security surface. The document states the count added and the count standing at base, and states nothing about whether the change is sound.

**Deprecation is free and stronger.** The platform marks its own members `@Deprecated(forRemoval = true)` — `SecurityManager` under [JEP 411](https://openjdk.org/jeps/411) among them — and Java 25 carries [`java.lang.classfile`](https://openjdk.org/jeps/484) in the platform itself, so reading that annotation out of the JDK's own class files needs no dependency. A change adding a use of an API the platform has marked for removal is a fact the platform published.

### Route 3 — advisories against the dependencies a change adds

[OSV](https://osv.dev/) and the [GitHub Advisory Database](https://github.com/advisories) state which coordinate-and-version pairs carry a known vulnerability. The library reads no network, so this arrives the way pull requests do: a fetch step writes the advisory rows beside the clone and the reading joins the coordinates the change adds against them.

**What it states**: a change added a dependency an advisory names, with the advisory's own identifier. **What it never states**: that the change introduced a vulnerability — the advisory is about a coordinate, and whether the code reaches the affected path is the dataflow question refused above.

---

## Order, and why

1. **The published surface (4).** Cheapest, pure shape, unblocks two rows the bundled mapping already states, and every other section reads better with it.
2. **Whole-tree exact duplication (1, first half).** The machinery exists and only the index is missing; it is the pattern the literature puts most of the churn on.
3. **CWE shapes (route 1), the five parse-decidable rows.** One bundled resource, one new reader, measured on the eleven.
4. **AI attribution from the trailers**, which turns every existing figure into a comparison the literature does not have.
5. **Dependencies (5) and the platform's security packages (route 2)**, which share the same import and pom reading.
6. **Near-duplicate with its permutation null (1, second half)**, then **line age (3)**, then **advisories (route 3)**, each of which needs the fetch step extended.

**The comparison this makes possible.** [The 302,579-commit study](https://arxiv.org/html/2603.28592v2) has no human comparison group, which its authors decline on attribution grounds. These figures measure both sides with one instrument, over repositories carrying both, reported side by side with no verdict. **Abandon if** the two are indistinguishable on every shape — which is itself worth publishing.

## References

- [AI Copilot Code Quality: 2025 Data Suggests 4x Growth in Code Clones](https://www.gitclear.com/ai_assistant_code_quality_2025_research), GitClear, 211 million lines.
- [Common Weakness Enumeration](https://cwe.mitre.org/), The MITRE Corporation, catalog 4.13.
- [Conventional Commits v1.0.0](https://www.conventionalcommits.org/en/v1.0.0/).
- [Debt Behind the AI Boom: A Large-Scale Empirical Study of AI-Generated Code in the Wild](https://arxiv.org/html/2603.28592v2), 6,299 repositories, 302,579 AI-attributed commits.
- [JEP 411: Deprecate the Security Manager for Removal](https://openjdk.org/jeps/411).
- [JEP 484: Class-File API](https://openjdk.org/jeps/484).
- [OSV](https://osv.dev/), the open source vulnerability database.
- [PMD Copy-Paste Detector](https://docs.pmd-code.org/latest/pmd_userdocs_cpd.html).
- [Semantic Versioning 2.0.0](https://semver.org/).

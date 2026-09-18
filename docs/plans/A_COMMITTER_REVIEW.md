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
| **Security** | transport security switched off, secrets and keys committed, algorithms the platform refuses, and dependencies an advisory names | each row quotes its publisher's definition |

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

## Static security review

[`STATIC_SECURITY_ANALYSIS.md`](STATIC_SECURITY_ANALYSIS.md) carries the rules, their citations and their worked examples. Three things a parse can find, each cited by the party that defined it:

| | Finds | Cited by |
|---|---|---|
| **A** | transport security switched off — a platform TLS interface implemented with an empty body, a `verify` returning a constant, a process-wide verifier replaced | CWE-295 and CWE-297, with `javax.net.ssl` read from the platform's own class files |
| **B** | a secret or a key committed — a PEM private-key boundary, a JWT, a provider's own documented token format, and a literal whose entropy exceeds 999 drawn from the tree's own literals | RFC 7468, RFC 7519, each provider's documentation, and a permutation null |
| **C** | an algorithm the platform itself refuses | `Security.getProperty("jdk.tls.disabledAlgorithms")`, asked of the runtime rather than extracted |

**String literals enter there and nowhere else.** The semantic reading discards a literal as somebody else's vocabulary quoted; the security path reads literals as shape, and nothing it finds reaches a subject figure.

**Refused**: taint and dataflow analysis, whether a finding is reachable, a severity score, a detection tool's rule set adopted whole, and the words *insecure*, *vulnerable* and *unsafe*.

---

## Order, and why

1. **The published surface (4).** Cheapest, pure shape, unblocks two rows the bundled mapping already states, and every other section reads better with it.
2. **Whole-tree exact duplication (1, first half).** The machinery exists and only the index is missing; it is the pattern the literature puts most of the churn on.
3. **The disabled-algorithm list, then the two RFC grammars**, from [`STATIC_SECURITY_ANALYSIS.md`](STATIC_SECURITY_ANALYSIS.md). One runtime delegation and no new resource file.
4. **AI attribution from the trailers**, which turns every existing figure into a comparison the literature does not have.
5. **Dependencies (5), and the TLS interfaces read from the platform's class files.**
6. **Near-duplicate with its permutation null (1, second half)**, then **line age (3)**, then the entropy null and the dependency advisories, each of which needs the fetch step extended or the literal corpus indexed.

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

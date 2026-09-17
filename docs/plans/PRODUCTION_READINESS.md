# Production readiness: two products

The library does two things and currently ships them as one. This plan separates them, states what each owes before anyone depends on it, and orders the work by what a measurement says rather than by what is nearly finished.

**Product A — what a repository is about.** A summary a person reads and a debug file a person argues with. Semantic analysis only: words, terms, and what a publisher states about them. No shape, no metrics, no placement.

**Product B — what a committer does to code.** Shape-based, per committer, over history rather than over a fetched pull request set. What kind of work, and what quality. AI-authored work is the case it is built for.

Nothing below is ranked by appeal. Every step names the figure it would move and the measurement that would end it.

---

## Where the two products stand today

| | A, the reading | B, the change analysis |
|---|---|---|
| Ships as | `reading.json` 34.0, `evidence.json` 7.0 | `pull-requests.json` 5.0 |
| Schema | 1,019 lines | 1,282 lines |
| A consumer can produce it | yes — `ExportedReading.of(path, commit)` | yes, from 2026-09-16 — `ReadPullRequests` |
| Sources | 12 concept taxonomies, 23 bundled resources | 3 standards: Conventional Commits, the tracker, the shape mapping |
| Measured accuracy | `evaluationAnswers`: a vocabulary fires on 7 of 7 positive controls, and the reading is silent on 2 of 4 negatives — both exceptions being right answers a domainless control counts as wrong | unmeasured |
| Known to be wrong | the placement: arXiv 4/11, OpenAlex 0/11, CSO 5/11 | — |

---

## A. The reading

### A1. Take the placement out. It is measured wrong and the reason is not incidental

`arXiv` and `OpenAlex` answer on two of eleven members and are wrong both times; across the whole set they name the stated area 4 and 0 times of 11. The reason was chased to the bottom on 2026-09-17 and is recorded in [backlog row 19](../../BACKLOG.md): comparing a repository to a subject through roughly two hundred generic domain labels cannot separate a derivatives pricing library from a poverty study, because both read as economy, finance, commerce and mathematics. A defect in the subject space was found and repaired on the way — `DistinctiveSubjects` takes subjects from 0.6612 to 0.8820 bits apart — and it does not move precision@10 off zero. The representation is the limit, not the data.

**Done on 2026-09-17, at the answer and not yet at the block.** `EvidenceKinds` had a last rung, `PLACED_SUBJECT`, reached only where no vocabulary had answered; it is gone, with `AnswerFromAScheme`. A repository no vocabulary can read now states nothing, which is what the doctrine asks of a reading that cannot cite. The cascade's structure makes the blast radius provable rather than hopeful: a rung reached only on backoff can change nothing above it, and `stillAnswersFromAVocabularyWhereASchemeAlsoPlaced` pins that.

**What is still to remove**, and it is 37 main and 62 test files so it is a decision rather than a tidy-up: the `placedIn` block itself, `PlacedField`, `PlacedUnder`, `SubjectNull`, `SubjectPlacement` and the arXiv resource. Until then the workings are still published, and a reader of `placedIn` sees `standsApartFromChance` computed over a space 0.66 bits wide. **That is the honest reason to finish it**: the figures are no longer reachable as answers, and they are still readable as evidence.

**What it keeps**: CSO as a taxonomy, which answers by matching terms and is right where the ontology is deep — `key agreement` for santuario against 91 cryptography concepts, `unicast` for aeron against 34.

**Measured, as far as one shell allows.** maven was re-read and now states nothing where it had answered *Audio and Speech Processing*, *Biometric Identification and Security* and *computer science* about a build tool. This repository's own reading is unchanged at `OLiA BaseForm`, and the `pinned` findings pass, which is what says no figure moved above the rung. besu's read completed in 162.3 s but its export write fell outside the ten-minute limit the agent shell imposes, so **its committed reading is stale and still shows the old three answers** — it is the same case as maven and it is not yet re-measured. The remaining nine cannot change: they answer above the rung.

**Done 2026-09-17.** All eleven were re-read: besu and maven now state nothing, the other nine are unchanged, and `evaluationAnswers` — added because `evaluationScore` read the placement the reading no longer answers from — puts a vocabulary firing on 7 of 7 positive controls and the reading silent on 2 of 4 negatives. OpenAlex is removed outright: 3.3 MB of resource, two lexicon readers, six extraction classes, eight probes and `evaluationScore` with `SubjectAncestry`, which scored OpenAlex placements and had no other subject.

### A2. Two files, and each one honest about what it is for

The summary is read by somebody deciding whether to care. The debug file is read by somebody who does not believe the summary. They are different documents and the tight schema belongs to the first.

- **The summary** carries the answers and the evidence for each: the vocabulary, the term, the concept, the publisher's own definition, how far past its chance bar it stands, and one site. Nothing that cannot be checked against a published statement.
- **The debug file** carries the workings already in `evidence.json` — every word offered with what each resource states about it, every topic a rule removed with the rule that removed it, every run nothing read.

**What is owed**: `evidence.json` is assembled by `EvidenceWorkings` in a test source set, so a consumer gets the answers and not the workings. It moves to the published source set the way `PullRequestSet` did, or the debug product does not exist outside this repository.

**What settles it**: a consumer compiled against the published jars alone writes both files. That test exists for the pull request path (`ReadPullRequestsTest`) and is the shape to copy.

### A3. Speed, measured before it is chased

The read is dominated by one stage. `readTimings` last put export assembly at **72.9 s of a 106.1 s read**, and the term-order null at the heart of it builds a deal per vocabulary per resample. Three memoisations in August took a read 44% faster and moved no figure.

**The rule that keeps this honest**: no performance change ships without `./gradlew read` and the `pinned` tag before and after, because a faster reading that moves a figure is a different reading.

**What settles it**: a stated target — a mid-sized repository read in under a minute — and `readTimings` as the gate. **Abandon a change if** it moves any published figure.

### A4. More sources, and the measurement each one owes

Adding a vocabulary moves every other vocabulary's bar, because the bar is drawn against the field of vocabularies judged together. So a source is not free and each arrives with the eleven re-read.

Ranked by what a reader gets, not by row count:

| Candidate | Licence | Why |
|---|---|---|
| FIX's 4,445 code names | already bundled, unextracted | each carries an `xsd:documentation` synopsis; readable where BIAN's DDD names are not |
| BIAN's ISO 20022 annotations | Apache-2.0 | ISO business-component types quoted inside BIAN's own files, so ISO's licence is not engaged |
| LexInfo 3.0 with OntoLex | CC BY 4.0 / CC0 | the one clean linguistics ecosystem beyond OLiA |
| EDAM | pending PRONOM's promotion | bioinformatics, and the shape of a domain this has no member for |

**What settles each**: the eleven members read before and after, and whether the candidate answers where nothing did without taking an answer from a vocabulary that was right. **Abandon a candidate if** it costs a right answer anywhere.

### A5. The coverage statement the library owes a stranger

The reading answers where it has a vocabulary and abstains elsewhere. That is correct and it is currently unstated. Two of eleven members get no answer at all, and a reader should know that before depending on this rather than after.

**What is owed**: the README states which domains are covered, by which publisher, and what happens outside them.

---

## B. What a committer does to code

### B1. The unit is the committer over history, not the author of a fetched pull request

Today's reports are per author per fetched pull request set. `fetch/fetch-commit-changes.sh` already writes any clone's commits in the shape the statement path reads, and a commit is a base and a head like a pull request is. The unit becomes the committer, and the corpus becomes the history.

**What settles it**: the reports drawn per committer over a repository's history, and the per-pull-request reports reproduced from them.

### B2. AI authorship is a stated fact, not an inference

This is the part that needs no new science. A tool that writes code writes its own name into the commit: `Co-authored-by` trailers, author emails such as `noreply@anthropic.com`, actor logins such as `copilot-swe-agent[bot]`. [A study of 302,579 AI-attributed commits across 6,299 repositories](https://arxiv.org/html/2603.28592v2) identifies AI authorship exactly this way across 29 tools.

That satisfies the doctrine without argument: the attribution is a statement by the party that made the change, cited from the commit, not a classifier's guess. **A commit with no such trailer is not "human" — it is unstated**, and the reading says so rather than assuming.

**What is owed**: a bundled resource of the trailers and addresses the tools themselves publish, through [the taxonomy-adding steps](../../.claude/skills/adding-a-taxonomy/SKILL.md), with a provenance header naming each tool's own documentation. It is a mapping, like `change-shape-types.tsv`.

**What settles it**: this repository's own 621 commits, every one of which states `Co-Authored-By: Claude Opus 5`, against a repository with none.

### B3. The three shapes the literature already points at, two of which are built

[GitClear's analysis of 211 million lines](https://www.gitclear.com/ai_assistant_code_quality_2025_research) puts code churn at 3.3% before AI tooling, 5.7% in 2024 and 7.1% in 2025, and locates the rise in three patterns: **moved code, copy-pasted code, and code rewritten shortly after it was written**. All three are shape, all three are measurable here, and two already are.

| Pattern | State | What is left |
|---|---|---|
| **copy-pasted** | `RepeatedBodies` measures exact repeated bodies inside a change, publishing the statements repeated and the biggest repeated body, because the total alone ranks trivia first | read the change's bodies against the **whole tree**, not only against each other, which finds a body copied out of the codebase |
| **moved** | `MovedDeclarationsProbe` counts declarations whose body stands at both ends under another name | nothing on tika's thirteen pull requests, which contain no refactoring; it needs a sample that does |
| **rewritten soon after** | not built | commit timestamps, which the fetch pins; a line's age at the moment it is changed. The window is the one thing here that must not be chosen — two weeks is GitClear's, not a derived bound, so the figure is the distribution of ages and not a count past a threshold |

### B4. The quality figures, and the one gap that matters

Already measured per change: files by kind, declarations added and removed by kind, statements and prose lines, McCabe complexity and method length and nesting and parameters at median, 75th centile and worst against the repository's own, types arriving with no test, test methods added, bodies repeated.

**The gap is visibility.** `NameForm` states which declaration a name is and never whether the published surface carries it, which is why the breaking-change row in `change-shape-types.tsv` names nothing. Adding modifiers to the parse turns on *public API removed* — Semantic Versioning's own incompatible change — and it is pure shape.

**What is refused**: a composite score. A number combining complexity, duplication and test coverage is an assertion with no publisher behind it. The report states the figures and the reader judges, as it does now.

### B5. What would make this a finding rather than a dashboard

The study above has 302,579 AI commits and **no human comparison group**, which its authors decline on attribution grounds. This library measures both sides with one instrument and can state the comparison the literature avoids.

**What settles it**: the same figures over AI-attributed and unattributed commits in repositories carrying both, reported side by side with no verdict attached. **Abandon if** the two are indistinguishable on every shape — which would itself be worth publishing.

---

## Order, and why

1. **A1, take the placement out.** Everything else packages a claim that is wrong more often than it is right.
2. **A2, the debug file reaches a consumer.** Product A is two files and one of them cannot be produced outside this repository.
3. **B2, AI attribution from the trailers.** Cheap, citable, and the thing product B is for.
4. **B3, the whole-tree duplication read.** The machinery exists; the change is where it points.
5. **A5, the coverage statement**, then **A4, sources**, then **B4, visibility**, then **A3, speed**.

Publishing waits on 1 and 2. [Row 31](../../BACKLOG.md) has the Maven Central mechanics ready — POM, signing, bundle, `releaseCheck` — and they are not what is missing.

## References

- [AI Copilot Code Quality: 2025 Data Suggests 4x Growth in Code Clones](https://www.gitclear.com/ai_assistant_code_quality_2025_research), GitClear, 211 million lines.
- [Debt Behind the AI Boom: A Large-Scale Empirical Study of AI-Generated Code in the Wild](https://arxiv.org/html/2603.28592v2), 6,299 repositories, 302,579 AI-attributed commits, 22.7% issue survival.
- [McCabe, A Complexity Measure](https://doi.org/10.1109/TSE.1976.233837), which the complexity figures are.

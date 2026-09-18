# Evaluating a change, and documenting what was found

A structured evaluation of one pull request, organised by published standards rather than by a scheme invented here, and written out in the format static analysis already has.

**What the literature says the document is for.** [Bacchelli and Bird](https://www.microsoft.com/en-us/research/wp-content/uploads/2016/02/ICSE202013-codereview.pdf) observed, interviewed and surveyed reviewers at Microsoft and classified hundreds of review comments: finding defects is the stated motivation, and understanding the change is the actual bottleneck. [Mäntylä and Lassenius](https://aaltodoc.aalto.fi/server/api/core/bitstreams/cab054e8-0c06-47ab-8754-54bb09a0a6d3/content) classified what reviews of nine industrial and 23 academic systems really found: **75% of it does not affect the external behaviour of the code** — documentation, visual representation and structure — against 25% functional.

So the document leads with what the change is and what it touches, and states weaknesses after. A tool that opens with a defect list is answering the question reviewers ask second.

---

## Four axes, each anchored to a published standard

| Axis | The question | The standard |
|---|---|---|
| **Nature** | what kind of work is this | [ISO/IEC/IEEE 14764](https://www.iso.org/standard/80710.html) maintenance categories, beside the Conventional Commits word already read |
| **Content** | what is the change about | the semantic reading, which the library already produces |
| **Quality** | what weaknesses does it leave | [ISO/IEC 5055](https://www.iso.org/standard/80623.html), whose measures are counts of CWE weaknesses |
| **Reviewability** | can a reviewer see it at all | the [Cisco and SmartBear](https://static1.smartbear.co/support/media/resources/cc/book/code-review-cisco-case-study.pdf) study of 2,500 reviews over 3.2 million lines |

---

## The quality axis: ISO/IEC 5055 is the spine

**This is the finding that reorganises the whole report.** ISO/IEC 5055:2021 is the first ISO standard to measure software quality from the internal structure of the source rather than from how it behaves when run. It partitions code quality into four characteristics and defines each as a **count of occurrences of named weaknesses**:

| Characteristic | Weaknesses the standard names |
|---|--:|
| Maintainability | 29 parent, no contributing |
| Reliability | 35 parent, 39 contributing |
| Security | 36 parent, 37 contributing |
| Performance Efficiency | stated in the same form |

**Every weakness is a CWE**, and [`cwe-terms.tsv`](../../lexicon/src/main/resources/cwe-terms.tsv) already bundles 993 of them with MITRE's own definition, abstraction level and parent. The standard supplies the partition; the bundled file supplies the definitions; the parse supplies the measurement. Nothing is invented here.

**It also resolves the composite-score refusal.** A number combining complexity, duplication and coverage is an assertion with no publisher. Four counts of named weaknesses against an ISO standard are the standard's own measure, published under its own definition. The four stay four — rolling them into one is the assertion, and that stays refused.

### The admissibility filter, and why the coverage figure is the headline

A 5055 weakness enters only where **the parse alone decides it**. Many need type resolution or dataflow, and there is no symbol solver — see the decision recorded against OpenRewrite. The work is a triage of every parent weakness into three piles:

| Pile | Example | What happens |
|---|---|---|
| the parse decides it | an empty `catch` block, a method over a stated size, a class with no comment | measured |
| it needs types | string comparison with `==` | abstains, and is named as abstaining |
| it needs dataflow | SQL built from untrusted input | abstains, and is named as abstaining |

**Publish the coverage.** *This reads 14 of the 29 maintainability weaknesses ISO 5055 names, 9 of the 36 security weaknesses, and states nothing about the rest* is the honest headline, and it is the doctrine's abstention turned into a number a reader can check. A tool reporting four characteristics without saying how much of each standard it reaches is claiming the standard's authority for a fraction of its content.

### The licence gate is closed, and the mapping is already in the tree

**Checked 2026-09-18.** CISQ's own [list of weaknesses per measure](https://www.it-cisq.org/pdf/cisq-weaknesses-in-ascqm.pdf) downloads without registration — 31 pages, 139 distinct CWE identifiers, June 2019 — and **carries no copyright notice and no licence statement anywhere in its body**. The only copyright in the file is embedded font metadata. Unstated terms are not permissive terms, so that document cannot be bundled.

**MITRE publishes the same mapping itself, under a licence this project has already accepted.** The CISQ measures are CWE categories in MITRE's own catalogue:

| Category | Measure |
|---|---|
| [CWE-1305](https://cwe.mitre.org/data/definitions/1305.html) | CISQ Quality Measures (2020), the view the four sit under |
| [CWE-1306](https://cwe.mitre.org/data/definitions/1306.html) | Reliability |
| [CWE-1307](https://cwe.mitre.org/data/definitions/1307.html) | Maintainability |
| [CWE-1308](https://cwe.mitre.org/data/definitions/1308.html) | Security |
| [CWE-1309](https://cwe.mitre.org/data/definitions/1309.html) | Efficiency |

Each names its weaknesses through `Has_Member` relationships in the catalogue XML, and `MemberOf` CWE-1305 above them.

**Everything needed is already downloaded, pinned and parsed.** [`cwe-terms.tsv`](../../lexicon/src/main/resources/cwe-terms.tsv) is extracted from the CWE 4.13 catalogue XML, pinned by blob id, under the [CWE Terms of Use](https://cwe.mitre.org/about/termsofuse.html) — free to use under a non-exclusive royalty-free licence with MITRE's copyright attributed. `CweConcepts` already reads `Weaknesses`, `Categories` and `Related_Weakness` with its `View_ID`. Every ISO 5055 member weakness is already a row: 407, 478, 1041, 1074, 1080, 1085 and 1095 are all in the bundled file.

**So the whole frame costs one column.** The extraction currently drops categories, and the header says why: *"categories and views — a category is a grouping a view draws for navigation, not a weakness."* That reasoning holds for most CWE categories and does not hold for these four, which are not navigation: they are the membership MITRE publishes for an ISO standard's measures. Add a `measure` column stating which of the four a weakness belongs to, re-extract from the pinned blob, and the mapping is cited to MITRE rather than to a PDF with no terms.

**The counts come from the XML, not from a summary.** CISQ's PDF states 29 parent maintainability weaknesses and the CWE-1307 page lists 28 members; the extraction settles it and the header records what it found.

---

## The nature axis: two standards and one measurable disagreement

[ISO/IEC/IEEE 14764](https://www.iso.org/standard/80710.html) normalises Swanson's categories internationally and defines four, each in the standard's own words:

| Category | The standard's definition |
|---|---|
| **corrective** | reactive modification of a software product performed after delivery to correct discovered problems |
| **adaptive** | modification performed after delivery to keep a software product usable in a changed or changing environment |
| **perfective** | modification after delivery to improve performance or maintainability |
| **preventive** | modification after delivery to detect and correct latent faults before they become effective faults |

This sits **beside** Conventional Commits rather than replacing it. Conventional Commits names what a commit message declares; 14764 names what kind of maintenance the work is. A dependency bump is `build` to one and *adaptive* to the other, and both are true.

**The measurable finding nobody publishes.** [Herzig, Just and Zeller](https://www.st.cs.uni-saarland.de/softevo/bugclassify/paper/icse2013-bugclassify.pdf) examined more than 7,000 issue reports across five open-source projects and found **33.8% misclassified** — filed as bugs, resolved as a feature, a documentation update or a refactoring. On average 39% of files marked defective never had a bug.

This library already names every change three independent ways: **what the statement says**, **what the tracker says**, and **what the shape says**. The disagreement between them is exactly what Herzig measured by hand, and it can be reported per repository, for nothing, on any tree with a tracker. **What settles it**: the three-way agreement rate over the eleven evaluation members, stated with no verdict attached.

---

## The reviewability axis

The Cisco study of 2,500 reviews over 3.2 million lines found defect detection falling from **87% under 100 lines to 28% over 1,000**, and inspection rates under 300 lines per hour giving the best detection.

**The unit is the problem, and the library already solved it.** A line count moves with the formatter, the javadoc and the braces. Statements do not. So the report states **statements** as its own figure, banded against the repository's own quartiles as every other figure is, and **lines** beside it because the published evidence is in lines. It cites the evidence and sets no threshold of its own — a size band is a fact about the change, and what a team does about it is theirs.

---

## Documenting the findings: SARIF for findings, the project's JSON for measures

**A finding and a measure are different things and belong in different files.**

| | Is | Example | Where it goes |
|---|---|---|---|
| **Finding** | located at a file and a line, and cites a rule | an empty catch at `Foo.java:44` | SARIF |
| **Measure** | a figure over the whole change | complexity at the 75th centile, 31 types added | `pull-requests.json` |

[SARIF 2.1.0](https://docs.oasis-open.org/sarif/sarif/v2.1.0/sarif-v2.1.0.html) is an **OASIS Standard** and the interchange format static analysis already has. It fits this project's output almost exactly:

| SARIF carries | This project has |
|---|---|
| `tool.driver.rules[]` with `id`, `name`, `helpUri` | the CWE identifier, MITRE's name, and the weakness permalink already in `cwe-terms.tsv` |
| `taxa` and taxonomy relationships, designed for CWE | the `broader` column, CWE's own ChildOf relation in view 1000 |
| `result.locations[].physicalLocation.region` | the file and line every finding already carries |
| `partialFingerprints` | what `changes.json` does by hand when it says a finding entered or left |
| `invocation` and `tool.driver.version` | the commit, the seed and the schema version |

**What it buys.** [GitHub code scanning consumes a subset of the SARIF 2.1.0 schema](https://docs.github.com/en/code-security/code-scanning/integrating-with-code-scanning/sarif-support-for-code-scanning), so emitting SARIF puts findings in the pull request UI with no integration written. Every other consumer that reads static analysis reads it too.

**What it does not buy, and must not be faked.** SARIF carries `level` — `error`, `warning`, `note`, `none` — and a severity is exactly what this project refuses to assert. Emit `none`, and put the standard's own characteristic in a property rather than inventing a rank. A severity written into a published format is an assertion that travels.

**A worked example.** An empty catch at `TopicTally.java:44` becomes one `result`, `ruleId` `CWE-390`, `helpUri` the MITRE permalink already in the bundled row, `message` MITRE's own sentence, `level` `none`, and a property naming ISO 5055 Reliability. A reviewer opening the pull request on GitHub sees it at the line. Nothing about it was written here except the location.

---

## What the document holds, in the order the literature says to put it

1. **What the change is about** — the subject reading, the concepts the vocabularies state, how far the statement sits from the code. Understanding first, because that is the bottleneck Bacchelli and Bird measured.
2. **What kind of work** — the three namings, the 14764 category, and whether the three agree.
3. **How much, and can it be reviewed** — files by kind, declarations, statements and lines, against the repository's own quartiles and the Cisco evidence.
4. **What it leaves** — the four ISO 5055 characteristics, each a count with its coverage stated beside it.
5. **The findings themselves** — as SARIF, linked, not inlined.

---

## Order, and what settles each

| | Step | What settles it |
|--:|---|---|
| 1 | **Done 2026-09-18** — the CISQ PDF states no terms and is refused; MITRE's own categories CWE-1306 to CWE-1309 carry the same mapping under a licence already accepted | the mapping has a citable publisher |
| 1b | Add a `measure` column to `cwe-terms.tsv` from the catalogue's `Has_Member` relationships, re-extracted from the pinned blob | `VocabularyProvenanceTest` passes, and the four member counts are stated in the header |
| 2 | Triage every 5055 parent weakness into parse-decidable, needs-types, needs-dataflow, and publish the coverage | the coverage figure exists and is stated in the export |
| 3 | Emit SARIF for the findings half, `level` `none` throughout | GitHub code scanning renders a fetched pull request's findings |
| 4 | Map the three namings onto the 14764 categories and report the three-way agreement | the rate over the eleven evaluation members, no verdict attached |
| 5 | Add lines beside statements and cite the Cisco bands | a reader can place a change against published evidence |

**Abandon a weakness if** it cannot be decided by the parse alone. **Abandon the whole 5055 frame if** coverage of any characteristic is so thin that naming the characteristic overstates what was read — and say which, rather than reporting three of four.

## References

- [Bacchelli, A. and Bird, C. (2013), *Expectations, Outcomes, and Challenges of Modern Code Review*](https://www.microsoft.com/en-us/research/wp-content/uploads/2016/02/ICSE202013-codereview.pdf), ICSE.
- [CISQ, Automated Source Code Quality Measures](https://www.it-cisq.org/standards/code-quality-standards/). Its weakness list states no licence terms and is not bundled; MITRE's categories [CWE-1306](https://cwe.mitre.org/data/definitions/1306.html) to [CWE-1309](https://cwe.mitre.org/data/definitions/1309.html) carry the same mapping.
- [Cisco Systems and SmartBear, *Code Review at Cisco Systems*](https://static1.smartbear.co/support/media/resources/cc/book/code-review-cisco-case-study.pdf), 2,500 reviews over 3.2 million lines.
- [Common Weakness Enumeration](https://cwe.mitre.org/), The MITRE Corporation.
- [Herzig, K., Just, S. and Zeller, A. (2013), *It's Not a Bug, It's a Feature: How Misclassification Impacts Bug Prediction*](https://www.st.cs.uni-saarland.de/softevo/bugclassify/paper/icse2013-bugclassify.pdf), ICSE. 7,000 issue reports, 33.8% misclassified.
- [ISO/IEC 5055:2021](https://www.iso.org/standard/80623.html), Automated source code quality measures.
- [ISO/IEC/IEEE 14764:2022](https://www.iso.org/standard/80710.html), Software maintenance.
- [Mäntylä, M. V. and Lassenius, C. (2009), *What Types of Defects Are Really Discovered in Code Reviews?*](https://aaltodoc.aalto.fi/server/api/core/bitstreams/cab054e8-0c06-47ab-8754-54bb09a0a6d3/content), IEEE Transactions on Software Engineering.
- [SARIF Version 2.1.0](https://docs.oasis-open.org/sarif/sarif/v2.1.0/sarif-v2.1.0.html), OASIS Standard.
- [SARIF support for code scanning](https://docs.github.com/en/code-security/code-scanning/integrating-with-code-scanning/sarif-support-for-code-scanning), GitHub.

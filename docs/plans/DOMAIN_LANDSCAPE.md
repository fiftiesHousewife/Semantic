# The domain landscape of a large institution, and which standards can be cited for it

## The domain landscape of a large institution, and which standards can be cited for it

A bank is not one domain. It is a dozen business domains, a set of enterprise functions any large corporate has, and the technical domains underneath both — and a reading that offers only *finance* will read a payments service, an HR system and a risk engine as the same thing.

### Two kinds of taxonomy, and they do not match the same way

This distinction decides the design, and conflating them is the mistake to avoid:

| | **Term taxonomy** | **Functional taxonomy** |
|---|---|---|
| States | what a thing in the domain is called | what a business *does*, as a partition of activity |
| Examples | FIBO, CDM, XBRL element names, FpML, ESCO skills | **NIST CSF functions** (extracted), APQC PCF, BIAN service landscape, Basel event types, ISO 20022 business areas |
| Grain | a term, matched against an identifier | a capability, matched against a whole scope |
| How it reads | longest-match n-gram over a phrase — the matcher above | **not the matcher.** A scope's aggregate reading compared against each functional area, which is the divergence machinery already in the tree |
| Answers | "this file writes the language of derivatives" | "this repository is trade processing, not wealth management" |

A functional taxonomy has perhaps a hundred labels and none of them appear in code — nobody writes `ManageEnterpriseRisk` — so matching it term-by-term would find nothing and mean nothing. It is a **reference distribution** to diverge against, which is what §16 of the plan already does for scopes.

### The domains, and the standard that could speak for each

Verified nowhere yet. **Every licence below is a claim to check, not a finding**, and the ones marked *code-shaped* are those whose terms are already identifiers — the `sql-functions.tsv` case, and the only ones the matcher can use directly.

**Financial business domains**

| Domain | Candidate standard | Publisher | Licence to check | Code-shaped |
|---|---|---|---|:--:|
| Trade processing, derivatives | **CDM (Common Domain Model)** | FINOS / ISDA | Apache-2.0 expected — it is a FINOS project on GitHub | **yes** |
| Markets, derivatives documents | **FpML** | ISDA | FpML Public License, unreachable from here | **yes** |
| Products, instruments | **ISDA Product Taxonomy**; **ISO 10962 CFI** | ISDA; ISO | ISDA unknown; ISO paywalled | no |
| Payments | **ISO 20022** message components and business areas | ISO 20022 RA | "use and reproduce" ≠ redistribute | **yes** |
| Consumer cards | **ISO 18245** merchant category codes; **PCI DSS** control set | ISO; PCI SSC | ISO paywalled; PCI free with terms | no |
| Reference data, entities | **GLEIF** LEI and Entity Legal Forms | GLEIF | **CC0** expected — the strongest licence position of any candidate | no |
| Venues | **ISO 10383** market identifier codes | SWIFT as RA | published free, terms to check | no |
| Risk | **Basel** operational-risk event types; **ORX Reference Taxonomy** | BIS; ORX | BIS reproduction terms; ORX unknown | no |
| Finance, accounting | **US GAAP Financial Reporting Taxonomy** (XBRL); **IFRS Taxonomy** | FASB; IFRS Foundation | FASB free-use to check; IFRS restrictive | **yes** — `AssetsCurrent`, `CashAndCashEquivalentsAtCarryingValue` |
| Contract mechanics | **ACTUS** | ACTUS Financial Research | already vendored inside FIBO's own repository under FIBO's MIT | **yes** |
| Desktop interop | **FDC3** context types | FINOS | Apache-2.0 expected | **yes** — `fdc3.instrument`, `fdc3.position` |
| Wealth management | *no single standard found* | — | — | — |

**Enterprise functions any large corporate has**

| Domain | Candidate standard | Publisher | Licence to check | Code-shaped |
|---|---|---|---|:--:|
| The whole functional partition | **APQC Process Classification Framework**, cross-industry and its Banking PCF | APQC | free with registration; redistribution terms to check | no — functional |
| Banking capabilities | **BIAN Service Landscape** — 323 service domains, each with a role definition and a stated three-level place | BIAN | **Apache-2.0, verified 2026-08-16 in the publisher's own file** — [bian-official/public](https://github.com/bian-official/public/blob/main/LICENSE) and [bian-official/artefacts](https://github.com/bian-official/artefacts) both state it. This row previously recorded "none stated" and ruled BIAN out; that verdict was wrong, and it was wrong because the licence was looked for on BIAN's own pages rather than in the repository it publishes | no — functional |
| Enterprise architecture | **TOGAF**, and its **Technical Reference Model** | The Open Group | **unread — awaiting human review.** Not reachable from the build or an agent shell. Expect it to sit with ITIL and COBIT: free to use under registration, and that is not redistribution in a published artefact | no — functional |
| HR, skills, occupations | **ESCO** (native SKOS, ~13k skills); **O\*NET**; **ISCO-08** | EU Commission; US DoL; ILO | ESCO under the EU reuse decision; O\*NET CC BY | no |
| Procurement | **CPV** common procurement vocabulary; **UNSPSC** | EU; GS1 US | CPV under EU reuse; UNSPSC licensed | no |
| Security | **NIST CSF** functions; **SP 800-53** control families | NIST | **public domain, verified** — `usnistgov/oscal-content`'s own `LICENSE.md` states a US Government work and waives copyright worldwide through CC0 1.0 | no — functional. **CSF extracted** |
| IT service management | ITIL; COBIT | AXELOS; ISACA | proprietary — expect to rule both out | no |

**Technical domains**

| Domain | Candidate standard | Licence to check | Code-shaped |
|---|---|---|:--:|
| Computing | **CSO** (above) | CC BY 4.0, unstated on the download page | no |
| Data management | **DCAT** and **Dublin Core**; **ISO/IEC 11179** metadata registry | W3C and DCMI open; ISO paywalled | **yes** for DCAT terms |
| Web and general | **schema.org** | CC BY-SA — share-alike, so read carefully before bundling | **yes** |

### Licences awaiting human review

**Nothing in this table is extracted, fetched or bundled until somebody outside this project has read the terms and written the verdict into the row above.** Each is here because it was named as wanted, not because its terms permit use. An agent shell cannot reach any of these publishers, so none of them can be settled the way arXiv's MIT and NIST's CC0 were — from the publisher's own file.

| Source | What it would supply | What has to be established |
|---|---|---|
| **TOGAF / TRM** (The Open Group) | a functional partition of enterprise architecture and a technical reference model | whether any licence permits redistribution, and whether registration terms bind it. Not reachable from the build or an agent shell |
| **APQC PCF** | the cross-industry and Banking process classification | redistribution terms behind the registration wall |

**BIAN has left this table** — its licence was read at the source and it is Apache-2.0. The lesson is worth keeping: it was ruled out for a year on a licence looked for in the wrong place. **Look in the repository a publisher publishes, not on the pages around it.** That is the same file arXiv's MIT was read from, and CSO is still blocked on exactly the mistake this row made.

### What BIAN publishes, read at the source

It is a better fit than this page assumed, and it satisfies every requirement the section below states:

| Requirement | BIAN |
|---|---|
| A partition of what a business **does** | **323 service domains**, one directory each in [bian-official/artefacts](https://github.com/bian-official/artefacts), under 8 business areas |
| Prose per category | **yes** — each `…Specification.csv` states a `Role Definition` and an `Example of use` |
| Hierarchy, stated by the publisher | **yes, three levels in the file itself** — Business Area, Business Domain, Service Domain |
| Redistributable | Apache-2.0, verified in the publisher's own `LICENSE` |
| Pinnable to a revision with a verified blob id | **yes** — it is a git repository, so the extractor contract applies unchanged |

Worked example, `AccountReconciliation`: Business Area *Operations*, Business Domain *Accounting Services*, Role Definition *"Match, reconcile and resolve identified discrepancies between accounts. Includes nostro/vostro arrangements"*.

**Counted at the clone rather than through the contents API, which does not paginate and returned the same listing three times.** The figure was recorded here as 969 and is 323.

**Its prose is better than arXiv's, which is the finding that matters.** Role Definition is stated for 319 of 323 domains at a **median of 36 words** — twice arXiv's 18 — from 3 words to 155, and `Example of use` is stated for all 323 beside it, so a domain's reference distribution can pool both. `Executive Summary` and `Key Features` are empty throughout and are not worth reading. The three-level place is complete: Business Area, Business Domain and Service Domain are stated for all 323. The eight business areas are Products 75, Business Development 58, Operations 53, Customers 32, Channels 31, Resource Management 30, Finance And Risk Management 27, Business Management 17.

**Two things to hold to whatever the verdicts are.** A source whose licence cannot be established is not bundled, however well it fits — that rule is what let arXiv in and kept ACM CCS out. And **two cleared standards are two sources, two extractions and two readings reported separately, never one merged file**: a blend of BIAN and TOGAF curated here is this project's own vocabulary under two publishers' names, it is an adaptation of both rather than a citation of either, and no revision could be pinned or blob id verified for it. That is the extractor contract as much as the doctrine.

### The requirement, stated plainly: a functional taxonomy is what places a repository

The distinction at the top of this page is the design, and it is worth restating as a requirement because the two kinds are not interchangeable and only one of them answers "what is this repository for".

**What is bundled today, by kind:**

| Source | Kind | Read by |
|---|---|---|
| **arXiv** — 152 subjects, each with the description arXiv states | functional | the subject placement, and it is the only functional reading in the tree |
| **NIST CSF 2.0** — six functions and the outcome NIST states for each | functional | **nothing** |
| OLiA, FIBO, `sql-functions`, Wikidata, Wiktionary | term | the term matcher and the topic reading |

So the gap is not that functional taxonomies are absent. It is that **one functional taxonomy is read and it classifies research papers**, which is why a text-extraction toolkit and a linguistics library both land in `cs.CL` Computation and Language, and why a payments system has no category at all.

**A functional taxonomy is admissible here only if it states prose per category.** That is what the divergence compares; a partition of bare labels cannot be read functionally at all. It is the property that decides several candidates already measured:

| Candidate | Prose per category | Consequence |
|---|---|---|
| arXiv | yes, median 18 words | readable, and it survives truncation to a half — see [the classification plan](CLASSIFYING_A_REPOSITORY.md) |
| NIST CSF | yes, one stated outcome per subcategory | readable the day somebody writes the reading |
| **PyPI Trove** | **no** | a term taxonomy of activities, and it cannot feed the description arm at all |
| **GitHub topics** | yes, but for formats rather than activities | measured this session: ten of the twelve names a text-extraction toolkit needs are absent, and nothing published maps its flat set onto Trove's `::` paths |
| BIAN, TOGAF, APQC | expected yes — each states what a capability or process *does* | this is the property to confirm while the licence is being read |

**NIST CSF is the cheapest functional reading available and it costs no licence work.** It is bundled, its terms are verified, and nothing reads it. What it needs is set out at the end of this page: a reference distribution per function, a null that permutes the statement-to-function assignment rather than resampling files, and a known answer to fail against. It is also the only way to show the functional machinery generalises past arXiv before a single new source is fetched.

### BIAN read against this repository, which is the control it has to pass

**It passes, and by more than FIBO did.** `FunctionalPlacementProbe` places a repository against a functional taxonomy held in a file rather than on the classpath, so a candidate is measured before anything decides to bundle it — `SubjectAreas.of` already takes concepts and asks nothing about where they came from, so no reading was added. Run against the 319 service domains BIAN states a role definition for, at commit `a928c56e`:

| | |
|---|--:|
| Concepts stated | 319 |
| Concepts the reading could place | 315 |
| Nearest service domain | Session Dialogue, **43.0%** |
| A taxonomy of chance reaches | **37.4%** over 984 draws |

**Chance places this repository better than BIAN does**, so the verdict is that the taxonomy is large and nothing more. A banking capability model saying nothing about a library of lemmas and senses is the known answer, and it is a stronger silence than FIBO's — FIBO still matched 252 spans, where BIAN's placement loses to its own null outright.

The run also settles something the section above only argued: **the placement machinery is not arXiv's.** A second functional taxonomy, from a file, through the same `SubjectAreas`, `SubjectPlacement` and `SubjectNull`, with nothing specialised for it.

### Licences read at the source since this page was written

Each was read in the publisher's own repository, which is where BIAN's was found after a year of being recorded as absent:

| Source | Verdict | Read in |
|---|---|---|
| **BIAN** | **Apache-2.0** | `bian-official/artefacts/LICENSE` |
| **OpenTelemetry semantic conventions** | **Apache-2.0** — the conventions repository states it on its own, which is what [the technical taxonomies plan](TECHNICAL_TAXONOMIES.md) asked for | `open-telemetry/semantic-conventions/LICENSE` |
| **FDC3** | **not Apache-2.0** — the Community Specification License 1.0, which governs participation in a specification and states it is not intended for source code. This page predicted Apache-2.0 and was wrong; redistribution of the context-type list needs a human read of that licence | `finos/FDC3/LICENSE.md` |
| **schema.org** | **unsettled, and the discrepancy is the point** — `schemaorg/schemaorg` states Apache-2.0 for the repository while this page records CC BY-SA for the vocabulary. Repository and vocabulary can differ, so the terms attached to the *terms* are what must be read | `schemaorg/schemaorg/LICENSE` |
| **FINOS CDM** | unread — `LICENSE.md` is not on `main`, so the default branch has to be found first | — |

### The domain this repository is in, which is the cheapest test there is

The general resources already stumble onto roughly the right labels for this tree — `linguistics`, `semantics`, `grammar`, `mathematics` — but they arrive as everyday dictionary topics rather than as a subject anyone would name. A computing taxonomy would say it precisely, and there are three candidates:

| Source | Would place this tree under | Licence to check |
|---|---|---|
| **CSO** | `natural language processing`, `computational linguistics`, `word sense disambiguation`, `information retrieval`, `semantic web` | CC BY 4.0, unstated on the download page |
| **MSC 2020** (mathematics subject classification, AMS and zbMATH) | `68T50` natural language processing, `94A17` entropy and measures of information — which is Jensen–Shannon exactly, and `62` statistics for the permutation null | a SKOS edition is published; terms unverified, and NC has been reported for it |
| **OntoLex-lemon** (W3C) and **OLiA** | the model this library *implements* — lexical entry, sense, form, reference | W3C community report terms; OLiA CC BY |

**A fourth candidate landed first, and it is both of the ones this section wanted.** arXiv's subject scheme covers mathematics (`math.ST`, `math.PR`, `math.CT`, `math.IT`) and language (`cs.CL`, `cs.IR`) in one taxonomy, and it is the only one of the four whose licence could be read in the publisher's own file — MIT, in `arxiv/arxiv-base`. MSC stays unverified: there is no route to `msc2020.org` from here, NC has been reported, and a third-party copy on GitHub would be laundering by the same argument that ruled out IEEE's. CSO still needs its CC BY read in the data file rather than on the pages around it.

### What the hop measured, and where it is thin

Read **at the level the taxonomy reports at** — every category description under an archive, pooled, which is what the `broader` column already holds — the answer is unambiguous:

| Subject | Divergence |
|---|--:|
| `cs` Computer Science | **0.2504** |
| `nlin` Nonlinear Sciences | 0.3796 |
| `grp_physics` Physics | 0.4291 |
| `math` Mathematics | 0.4999 |

against a chance-nearest of 0.3424 over 999 draws. Computer science wins by 0.13 bits, which is half the distance again to the runner-up, and mathematics — the subject a `category-theory` reading would have predicted — is last but three.

**At the leaves it is much weaker.** The whole top of the ranking is computer science, which is right, but the nearest single subject is `cs.ET` *Emerging Technologies* at 0.3295 and `cs.CL` is only seventh at 0.4003.

**The per-topic decomposition was proposed as the fix and it is refuted.** `SharedMass` ranks by what a scope and a subject both put in the same topics — the agreement rather than the difference, bounded at 1 because shares sum to 1, and its complement is the total variation distance. It was run at the leaves against its own null, drawn the same way. It changes the order below the winner and nothing above it: `cs.ET` still first, `cs.CL` still seventh. Two statistics that disagree about breadth agree about the answer, so **breadth was never the cause** — which was the hypothesis, and it was wrong.

**The witnesses say what the cause is.** Every row now carries the topics the two readings met on, and `law` and `music` are in nearly all of them — including `cs.AI` (*law, music, mathematics, programming*) and `cs.CE` (*law, music, mathematics, programming*). Those are this repository's own pooled-sense artefacts, `law` from `cite`, `witness` and `verdict` and `music` from `topic`, `phrase` and `theme`, and they are its second and fifth topics by mass. They put a **floor of agreement under every subject alike**, and at leaf grain the real signal — `linguistics`, which appears in only two of the twelve rows — is smaller than that floor. Pooling clears it because the difference between all of computer science and all of astrophysics is larger than the floor; a single thirty-word description is not.

So the leaf grain is **not blocked on the comparison, it is blocked on the senses** — items 1 and 2 of the list above, the abstention-aware leader and WordNet's most frequent sense. That is a better-supported conclusion than the one this section previously predicted, and it costs nothing extra: the same two fixes are already the top of the queue for their own reasons. `SubjectPlacementDiagnostic` pins the defect as a stated expectation, so when the senses are read properly the assertion fails and someone has to rewrite it.

### Two reweightings, tried and reverted

`./gradlew wordVotes -Pwords="theme topic phrase"` prints every vote the resources cast for a word, which is how the floor was traced to its source. The three words carrying `music` are read like this:

| Word | Occurrences | What the resources say |
|---|--:|---|
| `topic` | 315 | Wiktionary alone, a flat third each to **medicine, computing, music**; WordNet labels nothing |
| `phrase` | 89 | Wiktionary {grammar, dance, music}, WordNet {grammar, music, linguistics} at 0.5 coverage — so **music 0.333 against linguistics 0.111** |
| `theme` | 65 | seven subjects, **music largest at 0.22**, linguistics smallest at 0.10 |

The repository's most-written word is a flat third music, and it is written 315 times. Two reweightings were implemented and measured against that, and **both were reverted**:

- **The commitment as `p²`**, which is what `TopicCommitment`'s own javadoc describes and what the code does not do — it returns `p`, and `PhraseTopics` then normalises, so the squaring survives only as the phrase-level Simpson index in `coherence()`. Making it literal moves `music` from 0.0357 to 0.0305, but it **sharpens toward whatever a word's largest label is, and for these three words that label is music**: the leaf placement's nearest subject became `eess.AS` *Audio and Speech Processing* and stopped beating its null. Wrong direction. The javadoc and the code still disagree and one of them has to move.
- **Abstention on a flat word** — a subject holding no more than the uniform spread over the subjects the word names has said nothing, so `(p − 1/n) / (1 − 1/n)` and a word with `n` equal labels votes for nothing. `topic` abstains exactly, which is the intended effect. The theme table improves a great deal: `music` falls to 0.0249 and out of the top five, `medicine` leaves it entirely, and **`linguistics` rises to 0.0596 leading 27 files and 12.3% of the lines**. But the placement gets *worse*: `nucl-th` *Nuclear Theory* arrives third, `cs.CL` falls to sixth, and nothing beats chance at all.

**The floor did not disappear, it changed identity — from `music` to `law`.** Under abstention `law` becomes the top theme at 0.0666, because `cite` and `witness` are not flat: WordNet labels only the courtroom sense of `cite` and the bibliographic sense carries no label at all, so the concentration rule reads a confident wrong answer as strong evidence. That is the measurement settling the argument. **Reweighting cannot fix a sense that was never read**, and the queue is right as it stands: most-frequent-sense first, then re-run both variants — the harness is now in the tree, so each is a two-line change and one `read`.

**That makes this repository the in-domain corpus for stage 3, and it costs nothing to read.** FIBO used this tree as the out-of-domain control because the right answer was known to be *nothing*. CSO inverts it: the right answer is known to be *computational linguistics*, and a taxonomy that cannot place a library about lemmas, senses and word frequencies under language is failing the easiest case it will ever be given. Run it here first, before any panel is cloned.

Two limits on that, stated so the result is not over-claimed. It is a **smoke test, not the measurement** — a known-answer check on the tree the reading was developed against is exactly what the doctrine means by marking your own homework, so the held-out panel (`apache/lucene` → information retrieval, `netty/netty` → computer networks, `bcgit/bc-java` → cryptography) is still what decides. And a taxonomy naming this tree `natural language processing` has told us something we already knew; what would be worth having is the branch it puts *beside* that one.

### What to do with this

1. **Verify the licences in one pass**, cheapest and most permissive first: GLEIF (CC0), NIST (public domain), FINOS CDM and FDC3 (Apache-2.0), ESCO, CPV, then FpML, ISO 20022, APQC. A source whose licence cannot be established does not get bundled, however well it fits.
2. **Take the code-shaped ones first.** CDM, FDC3, XBRL, ACTUS and FpML state terms a program actually writes, and the matcher can use them the day they are extracted. A classification of *businesses* or *occupations* cannot be matched against identifiers and should not be bundled as if it could.
3. **Keep functional taxonomies out of the matcher.** APQC and BIAN, if their licences permit, belong to a separate reading: a scope's topical distribution diverged against each functional area, reported as "this repository reads as trade processing", with the same permutation null. That is a different slice and should be measured separately, or it will be credited to the term matcher.
4. **One shape for all of them** — the SKOS-shaped columns above, one TSV per source, each carrying its own provenance header.

**NIST CSF is the one that went first**, and not because security is the most interesting domain. It was the only functional taxonomy on this page whose licence could be *verified from the publisher's own file* — `usnistgov/oscal-content` states a US Government work and a worldwide CC0 waiver in its `LICENSE.md` — and the only one reachable without a registration wall.

**BIAN is now the second, and it clears both bars NIST cleared.** Apache-2.0 in the publisher's own `LICENSE`, and a copy anyone can fetch and pin. That leaves APQC — the taxonomy this section was originally written about — as the one still blocked on redistribution terms behind a registration wall, and it is no longer the only route to a functional partition of what a bank does.

**The order that follows.** NIST CSF is still first to be *read*, because it is bundled, it is small, and it is the cheapest way to show the functional machinery works on something that is not arXiv. BIAN is first to be *extracted*, because it is the largest functional taxonomy this project can lawfully bundle and it is the one an estate of banking repositories would actually be placed against. Neither lands before [the extractors](THE_EXTRACTORS.md) are restructured, and that restructure needs a second design pass: `PinnedSource` as specified describes one document at one blob id, where BIAN is 323 directories of CSV and FIBO is a checkout.

### What the extracted framework is still waiting on

The file is bundled and nothing in the engine reads it, which is the honest state for a resource whose reading has not been built. What it needs is not the matcher:

- **A reference distribution per function.** Each function's own overview plus every category and subcategory statement beneath it, read through `ContentWords` and `TopicCitations` exactly as a scope is, so a function and a scope are two distributions over the same topic space and `JensenShannon` compares them directly. `definitionsUnder` is already the accessor for it.
- **A null of the right shape.** `PermutationNull` resamples files within a repository and answers the wrong question again here. Permute the **statement-to-function assignment** within the framework, preserving how many statements each function has, so a function keeps its size and only which sentences belong to it is chance.
- **A known answer to fail against.** This tree is *not* a security codebase, so the honest first result is that no function clears its null. A functional reading that confidently places a lemma-and-frequency library under `PROTECT` has told us the reading is measuring nothing. Two panel members with a known answer would settle it — `bcgit/bc-java` under `PROTECT`, and something with no security surface at all — which needs the panel `-Dcs.evaluation.dir` is being built for anyway.

**Abandon if:** no repository with a real security surface clears the permuted-assignment null, or this tree clears it. Either one means the six functions are being told apart by everyday English rather than by what they partition.

**The measurement stays the same and applies per domain:** a domain's vocabulary must fire on a repository in that domain and not on one outside it. With a dozen domains the honest form is a full table rather than a pair of numbers: one repository per domain down the side, one vocabulary across the top, and every cell how much that vocabulary fired on that repository. What has to hold is that each vocabulary fires hardest on the repository from its own field, by more than a permuted assignment of terms to concepts would give it.

---

# Extending the taxonomies

Adding a vocabulary or a scheme touches ten files and two hand-written enumerations. This states what that costs, what each of the three ways out costs, and the one measurement that settles the change.

## What it costs today

Counted on the change that bundled Wikipedia's summaries of CSO's linked topics, 2026-08-29:

| | |
|---|---|
| Extraction | `CsoAbstractsExtraction`, `CsoAbstractsTsv` |
| Registration | a `BundledExtractions` entry |
| The resource | `cso-abstracts.tsv`, with its provenance header |
| The reader | `CsoAbstracts` |
| Where it is read | `CsoSubjects` |
| Notices | a `NOTICE.md` row, a README section |
| Tests | two |

A *matched vocabulary* costs more: an entry in `MatchedTaxonomies` or `ControlTaxonomies` stating its index, its one-line description and — since 2026-08-29 — where its publisher publishes it. A *subject scheme* costs a `PlacedField` factory and a line in `ExportedReading.placedIn`.

**Three of those statements are already in the file.** The header states the source and the licence; the enum states the name, the publisher and the description. Nothing checks that the two agree, and nothing could.

## The constraint that decides the design

`TermOrderNull` passes `judged.size()` as the field a vocabulary's permutation bar is read at, and `ChanceExpectedBest` sets the bar at the `1/(n+1)` quantile of that field. **Adding a vocabulary therefore moves every other vocabulary's published bar**, on every reading, whether or not the new one matches anything.

That is not an argument against discovery. It is an argument that **the set discovered has to be published**, so a bar that moved because the set changed is attributable rather than mysterious. `changes.json` compares figure by figure and would report seven moved bars with no cause stated anywhere.

The second constraint is already recorded: `BundledVocabulary.files()` does not recurse, because a resource moved into a subdirectory would silently empty the list both provenance tests walk. Any discovery mechanism inherits that hazard and must fail on a set smaller than it has ever seen rather than on an empty one.

## The three ways, and what each is for

| | What it solves | What it does not |
|---|---|---|
| **A skill** | Repeatability. [`adding-a-taxonomy`](../../.claude/skills/adding-a-taxonomy/SKILL.md) already states the invariants and the eight files | Nothing about the cost. A skill documents ten files; it does not make them nine |
| **A plugin** | A *consumer's* own vocabulary, in their own jar, without a fork. `ServiceLoader<TermIndex>` is Java's own answer and needs no scan, no build change and no module descriptor — a `META-INF/services` entry on the classpath | Nothing about the bundled set, which is where the ten files are. `InjectedTaxonomy.named` already takes one file by path |
| **Discovery** | The bundled set. A vocabulary states its own name, publisher and kind in the header it already carries, and the enumerations stop existing | Nothing on its own — it is only admissible with the field published beside it |

## The candidates, surveyed 2026-08-31

Three fields were surveyed, one per repository whose unread runs reach no bundled resource. The gap is measured from the committed `evidence.json` of each reading, counting only runs recorded under `NO_WORD_REACHED_A_RESOURCE` and `NO_RESOURCE_STATED_A_TOPIC`.

| Repository | Unread runs with no resource | Field with no bundled vocabulary |
|---|---|---|
| tika | `config` 503, `xhtml` 352, and `pdf`, `ocr`, `charset`, `mime`, `parser`, `metadata` | document formats, text extraction |
| besu | `frame` 791, `blockchain` 624, `tx` 304, and `gas`, `nonce`, `merkle`, `validator` | distributed ledger |
| santuario | `baos` 237, `cert` 199, `inbound xml sec` 186, `secure validation` 148, `sig` 136 | XML security, public-key infrastructure |

### What each survey found

| Field | Strongest admissible candidate | Licence, as quoted | Pinned by | Shape | What it misses |
|---|---|---|---|---|---|
| Document formats | [PRONOM](https://www.nationalarchives.gov.uk/pronom/) | Open Government Licence v3.0, stated in the site footer | numbered signature-file releases | labels: format names, extensions, media types | `ocr`, `parser`, `charset` as concepts |
| Document formats, second | [EDAM](https://github.com/edamontology/edamontology) format branch | CC BY-SA 4.0, stated in the repository's `LICENSE` | dated release tags, a Zenodo DOI per release | labels or prose, and the extraction must choose | coverage of `xhtml`, `ocr` and `mime` is unmeasured, not refuted |
| Distributed ledger | [ethereum/execution-specs](https://github.com/ethereum/execution-specs) | CC0 1.0, stated in `LICENSE.md` | a commit SHA | labels or prose, and the extraction must choose | `consensus` is named only obliquely |
| XML security | the [NIST CSRC glossary](https://csrc.nist.gov/glossary) | NIST states its own works public information, on the copyright page rather than on the glossary page | the digest of a downloaded archive; the export is rebuilt daily and carries no version | prose: one definition per term, each citing its source document | `canonicalization` and `keystore`, which are the two most XML-specific gap words |
| XML security, second | the [IANA JOSE registries](https://www.iana.org/assignments/jose/jose.xhtml) | CC0 1.0, stated in IANA's own licensing terms | a dated table, pinned by digest | labels: parameter and algorithm names with a description column | everything outside algorithm naming |

### What the licence gate refused, and it refused the obvious answer in every field

| Refused | Why |
|---|---|
| W3C XML Signature 1.1, XML Encryption 1.1, XHTML and HTML term indices | the W3C Document License permits verbatim copies and forbids modification, and an extracted table is a modification |
| ISO 22739, *Blockchain and DLT — Vocabulary* | ISO sells its standards. This is the gate that already refused ISO 20022 |
| RFC 4949, *Internet Security Glossary v2* | "Distribution of this memo is unlimited" grants verbatim redistribution of the memo, not extraction into a TSV |
| ETSI EN 319 electronic-signature terminology | reproduction is restricted to ETSI members and standardisation purposes |
| Library of Congress Sustainability of Digital Formats | no rights statement retrieved, and no pinnable revision confirmed |
| `ethereum/EIPs` | CC0, and a corpus of documents rather than a curated statement of terms. Mining terms out of it is the corpus observation the doctrine refuses |
| EthOn | one vendor's ontology aligned to the Yellow Paper, not a standards body's statement, and unpinned by any tag |

### The two findings that hold across all three fields

**The strongest candidate in every field is not a glossary.** A format registry, a specification written as Python, and a daily-rebuilt glossary export are three shapes no bundled vocabulary has. Each needs an extraction rule stating which of its names count as stated terms, and that rule is this project's choice rather than the publisher's — which is the doctrine line, not the licence gate. `sql-functions.tsv` is the nearest precedent: it asks a standard's own runtime the question instead of curating an answer.

**Three of the seven candidates cannot state a version.** The CSRC glossary export is rebuilt daily, PRONOM's releases are numbered but its records are not, and EDAM's OWL file is DOI-pinned per release. `ContentDigest` covers all three, and a digest pin with no publisher version beside it is weaker provenance than every resource bundled today carries.

### What settles each, and none of it is settled by argument

One measurement per candidate, all of the same shape: extract the labels, bundle behind a flag, and count what moves.

[`fetch-candidate-vocabularies.sh`](../../fetch-candidate-vocabularies.sh) fetches every candidate's source into `~/vocabulary-sources`, recording each file's pin and sha256 in a manifest. It needs a shell with network access — the agent sandbox and the extraction JVMs have none — and an extraction then takes the fetched copy by path.

| Candidate | The count that settles it |
|---|---|
| PRONOM or EDAM | the share of tika's `xhtml` 352 and `config` 503 occurrences that move from unread to matched |
| `ethereum/execution-specs` | whether besu's `blockchain` 624, `frame` 791 and `tx` 304 are read, and whether the vocabulary stays silent on the eleven members where it should |
| the CSRC glossary | whether santuario's `cert` 199, `sig` 136 and `inbound xml sec` 186 fall out of the unread tail without any evaluation member's placement regressing. A 10,023-term prose source that also fires on every non-security repository is a cost |

Every one of them is read against the permutation null and not against its own count, because a vocabulary of several hundred terms raises every other vocabulary's bar on all twelve readings. **That is why step 3 below runs first.**

## What to build, in order

1. **Three more keyed lines in the provenance header** — `# Name:`, `# Publisher:`, `# Kind:` — enforced by `VocabularyProvenanceTest` exactly as `# Source:` and `# Licence:` already are. The header becomes the whole statement of what a resource is, which is where the doctrine already puts source and licence. **Landed 2026-09-04**, and see below for what the kinds turned out to be.
2. **`BundledTaxonomies` reads those headers** and replaces `MatchedTaxonomies` and `ControlTaxonomies`. The matched/control split goes with them: both enums' own javadoc says which is which depends on the repository under reading rather than on the vocabulary, and `ControlTaxonomies`' javadoc calling them "of a field the read repositories are not in" was already true only of this repository.
3. **The export states the field's membership**, not only its size. `taxonomies[].bar.field` is 7; beside it belongs the seven names, so a moved bar can be read against a changed set.
4. **`ServiceLoader<TermIndex>` for a consumer's own**, entering the same field and published in the same list as the bundled ones — a vocabulary somebody else wrote is judged by the same bar or it is not evidence.

## What step 1 landed, and the two things it settled that the step did not state

`VocabularyProvenanceTest` reads all three lines off every one of the 24 bundled resources, and `BundledVocabulary.stated` is what reads a `# Key: value` line back.

**`terms | subjects` covers 11 of the 24 files.** The two ways a taxonomy of concepts can be read are the two this step named, and they are what a reading selects on. The other 13 are not taxonomies at all, and forcing either value onto them would have been a false statement in the one place the doctrine puts true ones. The closed set is five, each naming what a row is rather than what this library does with it:

| Kind | A row is | Files |
|--:|---|--:|
| `terms` | a concept a publisher states, whose labels are matched against declared names | 6 |
| `subjects` | a concept a publisher states, carrying prose a reading is compared against | 5 |
| `words` | what a dictionary or a name registry states about a word or a sense | 8 |
| `identifiers` | a name a standard's own registry or runtime states | 2 |
| `frequencies` | a count or a share, read as a denominator | 3 |

### Step 2a: the header is the statement, and the classes stop repeating it — landed 2026-09-04

The three keys step 1 named could not carry what step 2 needs, because the enums state five things and not three. A taxonomy's header now carries all seven, and `StatedProvenance` reads them:

| Key | On | Replaces |
|---|---|---|
| `# Name:` | all 24 | — |
| `# Publisher:` | all 24 | — |
| `# Kind:` | all 24 | the matched/control split, once step 2b lands |
| `# Short name:` | the 11 taxonomies | `TermIndex.source()`, `PublishedSubjects.scheme()` and `TermVocabularies.publisher()` — the same string in three places |
| `# Published at:` | the 11 | `PublishedSubjects.publishedAt()` and the enums' `publishedAt()` |
| `# Description:` | the 11 | the enums' `description()` |
| `# Subject:` | the 11 | the enums' `subject()` |

Eleven constants are gone from seven classes: `ArxivSubjects`, `OpenAlexTopics`, `CsoSubjects` and `BianServiceDomains` read their name and their link off the file, and `LinguisticTerms`, `ComputingTerms` and `FinanceTerms` read the name a match cites off it.

### Step 2b: one list of what is bundled — landed 2026-09-04

`BundledTaxonomies` is the seven, in the order the two lists concatenated to, and `MatchedTaxonomies` and `ControlTaxonomies` are deleted. Nothing about a vocabulary is stated in it: the name a match cites, the description, the subject and the link all come off the resource's own header through `TermVocabularies`, and what is left per entry is the `TermIndex` and, for CSO alone, that its concepts are the ones its index reaches a term for rather than the whole published list.

`TermVocabularies` stays. `PublishedTermRuns` needs the seven vocabularies' concepts and lives in `code-semantics-engine`, which sits below the module a `TermIndex` lives in — so the membership list is in `lexicon` and the indexes are in `skos-matching`. **Three enumerations became two, not one**, and the plan counted two because it had not found the third.

### The one place the split was load-bearing, and what moving it cost

Nine of the ten call sites concatenated the two lists, so the split was already ignored. The tenth was not. `ReadingEvidence` recorded the matched taxonomies' matches from readings narrowed by `SpecificTerms` — the terms the reference corpus says are a vocabulary's own — and the controls' matches from the whole index, because the controls' readings were taken here rather than reused. **Nothing decided that**: it followed from which enum a vocabulary sat in, and the export narrows all seven when it publishes them.

So the evidence recorded five of its seven vocabularies on a basis the export does not publish them on. `matching` now reads every one of the seven the way the export does, `matchingWithControls` is deleted, and `reading.json` is untouched by the change because the export never took that path.

### What the eleven members measured

`evaluationReadAll` over all eleven, then jpos read a second time against the old code for a straight before and after:

| | Result |
|---|---|
| `reading.json` | **every published figure identical.** The one difference is `summary.commit`, blank in a single-member run and populated by the sweep, which is a metadata artefact this repository already knew about |
| `evidence.json`, OLiA and CSO | unchanged — 111 and 100 matches on jpos, 238 and 221 on tika |
| `evidence.json`, the other five | fewer matches, which is the narrowing arriving. On jpos: CWE 5 to 3, FIX 47 to 42, FpML 70 to 65, FIBO and BIAN unchanged. On tika: FpML 114 to 93, FIBO 157 to 155, FIX 70 to 66, CWE 13 to 7 |

**Only `matches` moves in `evidence.json`** — no other key of it differs, and no key of `reading.json` does. The answers this library publishes are untouched; the workings behind five of the seven vocabularies are now recorded on the basis the answers use.

### What step 2 cannot do, and this is a finding rather than a decision

**The matched list is not derivable from the header, and `TaxonomyShape` — the class that claimed to derive it — is dead.** Its javadoc says prose per concept means a distribution to place against and labels without prose mean terms to match, naming CSO, OLiA and FIBO as the second case. Read against the files: OLiA states 1,216 definitions over 1,312 concepts, FIBO 1,792 over 1,833, FIX 7,003 over 7,170, and CSO is the only one of the seven stating none. The rule would now put six of the seven matched vocabularies in the placed set. Nothing calls it — `InjectedTaxonomy.shape()` is its only caller and nothing calls that — so no reading is wrong; the rule is simply stale, and the files moved under it when the definitions the extractions had been discarding were carried.

So `# Kind:` states what a row is and not what the reading does with it. BIAN is the case that settles it: it carries prose for all 319 rows, so its rows are `subjects`, and the reading matches its labels as terms anyway. **Which vocabularies a reading matches is this library's choice, and it stays in code.** What the header can check is the other direction, and step 2b enforces it: a resource stating `# Kind: terms` that no reading matches is a vocabulary bundled and never read.

**The header is written twice and only one of the pair is checked.** The renderer in `lexicon-extraction` holds the header, the committed TSV carries a copy, and nothing compares them — which was already true of `Source:` and `Licence:` and is now true of three lines a reading will select on. `sql-functions` is the one source needing neither a network route nor a local copy: regenerated through its renderer, the committed file gains exactly the three lines and nothing else, so that pair is shown to agree. The other nineteen rest on care. Closing that is its own row.

### Step 4: a consumer's own vocabulary — landed 2026-09-06

`ProvidedTermIndexes` reads `ServiceLoader.load(TermIndex.class)` and orders the result by the sources' own names, because `ServiceLoader` yields providers in an order the deployment decides and a reading must not change because two jars swapped places. `ExportedReading.vocabulariesBesidesOlia()` is the one statement of the default field — the bundled vocabularies, then the provided ones — and the default export path takes it, so registering an implementation in `META-INF/services` is the whole of the cost. `JudgedTaxonomies` refuses a field where two vocabularies state one source name, because the bar and every match cite the name and a shared one says nothing.

A provided vocabulary is judged as evidence and nothing more: the description, subject and link the pages print read off the bundled resources' provenance headers, and `EvidenceKinds` states an empty coverage line for a source it holds no header for. That is the honest floor — what the consumer's jar does not state, no page invents.

## The criterion

A refactor that changes no reading has a byte-equality test, and this one does: **run the eleven evaluation members with the seven enumerated vocabularies and with the seven discovered from their headers, and require every published figure to be identical.** Anything that moves is a disagreement between what a file states about itself and what the enumeration stated about it, which is the defect this change exists to remove.

Step 3 moves figures by adding a field, so it is a schema change and takes its own reading.

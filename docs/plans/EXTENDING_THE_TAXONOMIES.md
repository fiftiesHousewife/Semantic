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

| Candidate | The count that settles it |
|---|---|
| PRONOM or EDAM | the share of tika's `xhtml` 352 and `config` 503 occurrences that move from unread to matched |
| `ethereum/execution-specs` | whether besu's `blockchain` 624, `frame` 791 and `tx` 304 are read, and whether the vocabulary stays silent on the eleven members where it should |
| the CSRC glossary | whether santuario's `cert` 199, `sig` 136 and `inbound xml sec` 186 fall out of the unread tail without any evaluation member's placement regressing. A 10,023-term prose source that also fires on every non-security repository is a cost |

Every one of them is read against the permutation null and not against its own count, because a vocabulary of several hundred terms raises every other vocabulary's bar on all twelve readings. **That is why step 3 below runs first.**

## What to build, in order

1. **Three more keyed lines in the provenance header** — `# Name:`, `# Publisher:`, `# Kind: terms \| subjects` — enforced by `VocabularyProvenanceTest` exactly as `# Source:` and `# Licence:` already are. The header becomes the whole statement of what a resource is, which is where the doctrine already puts source and licence.
2. **`BundledTaxonomies` reads those headers** and replaces `MatchedTaxonomies` and `ControlTaxonomies`. The matched/control split goes with them: both enums' own javadoc says which is which depends on the repository under reading rather than on the vocabulary, and `ControlTaxonomies`' javadoc calling them "of a field the read repositories are not in" was already true only of this repository.
3. **The export states the field's membership**, not only its size. `taxonomies[].bar.field` is 7; beside it belongs the seven names, so a moved bar can be read against a changed set.
4. **`ServiceLoader<TermIndex>` for a consumer's own**, entering the same field and published in the same list as the bundled ones — a vocabulary somebody else wrote is judged by the same bar or it is not evidence.

## The criterion

A refactor that changes no reading has a byte-equality test, and this one does: **run the eleven evaluation members with the seven enumerated vocabularies and with the seven discovered from their headers, and require every published figure to be identical.** Anything that moves is a disagreement between what a file states about itself and what the enumeration stated about it, which is the defect this change exists to remove.

Step 3 moves figures by adding a field, so it is a schema change and takes its own reading.

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
- **The phrase as the unit of the topical reading** — `PhraseTopics` scores a subject by the geometric mean
  of what its agreeing words committed times the share of the phrase that agrees, and the phrase commits what
  it settled on. `SenseCoverage` then discounts a label by the share of the word it speaks for, which is what
  moved `law` off the top. `ContentWords` lemmatises and keeps prose to its content words; `WordSpecificity`
  weights a word nothing chose by the surprisal the frequency list states.
- **The topic hierarchy** — `TopicHierarchyExtraction` bundles wiktextract's own generalisation map at a
  pinned revision, verified by the blob id that revision holds so a run with no network route still cites the
  permalink. `StatedTopics` folds a label another label of the same word already implies back into it, which
  is what stopped one theme being counted six times: the vocabulary went from 519 distinct topics to 479,
  `sciences` and its four restatements left the top of the ranking entirely, and `computing` leads.
- **Behaviours** — `Behaviours` reads 592 declared method names as clauses, verb first, by asking the
  dictionary which word is a verb. `ForeignWords` ranks the names whose own subject is furthest from the
  repository's, as metaphor candidates.
- **The documentation as a scope**, read as prose with code quotations stepped over, and `SourceLinks`
  rendering a `SourceAnchor` permalink where the working copy has a remote and an editor link where it does
  not.
- **The self test** — `./gradlew selfRead`. `IdentifierWords`, `CitedWords` over eight bundled resources,
  `LegibilityTally` and `LegibilityReport`. It reads this repository and reports λ per source set with the
  denominator, the per-resource support, what rests on each resource alone, and the unread tail with a site
  for each. Current result in the README: **λ = 0.979** over 44,598 read word occurrences in 195 files, documentation included.
- The whole `lexicon` module, verbatim, and `lexicon-extraction` minus the fixture-corpus task whose target
  does not exist here.
- `VocabularyProvenanceTest` over both bundled resource directories. Porting it found one header —
  `wikidata-initialisms.tsv` — stating its licence only inside its Source line; it now carries its own
  `Licence:` line.

---

## Next, in order

Each of these is next because of something the reading measured, not because of where it sits in the plan.
The figures they have to move are on this tree, at the commit this file ships in.

| # | Do this | Because the reading measured | It ships when |
|--:|---|---|---|
| 1 | **Make "leads" mean something** | **92 of the 178 files that have a leader are led at a share under a fifth**, and they hold 7,643 of the 13,711 led lines. The plan document is led by `law` holding 7.6% of it | a topic leads a file only where it clears that file's own abstention mass, and lines led falls to what it should be |
| 2 | **Read WordNet's most frequent sense** | the reading pools every labelled sense equally, which is *worse* than the naive baseline the plan already specifies for stage 9 | `law`'s remaining 11 files led, and whether `cite` stops voting law at all |
| 3 | **Run on a repository this reading was not written for** | `law` is under-represented in the one module ported from elsewhere and over-represented in the code written for this reading — every figure so far is an instrument reading itself | a second tree is read through `-Dcs.clone.dir` and its themes are reported beside these |
| 4 | **Verbal forms — the rest of it** | 592 methods read as clauses; no class name does, and the verb is chosen without the position that would settle it | the item below, with its three measurements |
| 5 | **Stages 1–3, the git read** | no reading is pinned to a commit, so no permalink is rendered and no vote can be cast at all | `SourceAnchor` renders from a real revision and the witnesses become permalinks |

After those, the plan's own order resumes: the polyglot parse, the store, and the first vertical slice
against `junit-team/junit-framework`, which is the first time this library reads something that is not itself.

---

## [HIGH] Read a repository against its industry's own vocabulary

The two bundled resources are general dictionaries, and a general dictionary only labels a word's specialist
senses — which is why this repository reads as *computing, law, music* and why `cite` votes law. A domain
vocabulary states the terms an industry actually writes, and a repository in that industry writes them too.

### The measurement that shaped the design, run before any of it was written

3,837 FIBO T-Box labels, matched by longest n-gram against this repository's 63,275 identifier occurrences.
This tree is out of domain for a finance ontology, so **every match here is a false positive by
construction**:

| Term length | Distinct terms | Matches on this tree |
|--:|--:|--:|
| 1 word | 306 | **1,789** |
| 2 words | 1,244 | 2 |
| 3+ words | 2,287 | 1 |

The one-word hits are `name` (460), `share` (231), `value` (198) — FIBO does declare classes labelled
*action*, *balance*, *butterfly*. All three multi-word hits are property labels (`is implied by`). Genuine
multi-word class matches out of domain: **zero**.

**So the multi-word term is the signal and the single-word term is the noise**, and neither fact was chosen.
A stop list is forbidden, so the weight comes from a resource: `PhraseSpecificity`, the n-gram extension of
`WordSpecificity`, reads the surprisal of an n-gram off the bundled frequency list. `name` weighs almost
nothing; `interest rate swap` weighs near the ceiling.

### The sources, and what each licence actually says

| Source | Domain | Publishes | Licence as stated | Verdict |
|---|---|---|---|---|
| **FIBO** | finance, and banking through its own `FBC`/`LOAN`/`BE`/`CAE` modules | OWL in RDF/XML, `rdfs:label` + `cmns-av:synonym` (422) + `cmns-av:abbreviation` (810) | **MIT**, verified from the repository's own `LICENSE` | **Ships first** |
| **CSO** | computing, ~15,000 topics | CSV/OWL over a SKOS-derived schema, `klink:relatedEquivalent` for synonymy | CC BY 4.0 on the publisher's pages — **not stated on the download page** | Stage 3, after the licence is verified in the file itself |
| **STW** | economics | native SKOS with English `altLabel`s | CC BY 4.0 **at v9.20**; v9.02 is **ODbL**, whose share-alike would attach to the derived file | Stage 5, pinned to a version whose licence was read |
| **FpML** | markets, derivatives | 236 coding schemes, 5,881 codes, in OASIS genericode; plus XSD element names | **FpML Public License 3.0 — verified**, read from the publisher | **Ships alongside FIBO.** See below |
| **ISO 20022** | payments | message components and a data dictionary, `CstmrCdtTrfInitn`, `Dbtr`, `Cdtr` | *"used and reproduced freely"* under the IPR policy — **"use" is not "redistribute"** | Needs a legal read before anything is bundled |
| ACM CCS | computing | SKOS | educational and research use only | Ruled out — a jar on Maven Central is neither |
| IEEE Thesaurus | engineering | PDF, e-mail gated | CC BY-NC-ND 4.0 | Ruled out twice: NC and ND. A third party's MIT-stamped RDF conversion of it is laundering, not a licence |
| GICS | industry | 4-tier classification | proprietary to S&P and MSCI | Ruled out |
| BIAN | banking | a service landscape, not a vocabulary | none stated | Ruled out — an unstated licence is a no |
| EuroVoc, LCSH, NAICS, JEL | — | — | mostly fine | Ruled out on **fitness**: they classify legislation, books and businesses, not the terms a codebase writes |

**A schema is a better citation for code than a thesaurus, and the doctrine already says so.**
`sql-functions.tsv`'s own header states the principle — *a schema token equal to a function's name is a fact
about the standard this tool executes rather than an observation of any corpus*. FpML and ISO 20022 are
exactly that case and are the only candidates whose terms are already **identifiers**: FpML writes
`interestRateSwap` and so does a trading system, so the match is identifier to identifier with no English in
between. A thesaurus needs lemmatising, splitting and n-gram alignment before it can meet code; a schema
does not. That is the argument for putting them ahead of CSO and STW **if their licences permit
redistribution**, and the licence is the whole question:

**FpML is settled, and it is the cleanest source found so far.** The FpML Public License 3.0 (effective
2026-02-01, licensor ISDA) grants *"a world-wide, royalty-free, non-exclusive license … to use, reproduce,
modify, display, perform, and distribute the FpML Specifications (or portions thereof) with or without
modifications, or as part of a Larger Work"*, and a Larger Work may be distributed under a licence of our
choice provided it does not limit the recipient's rights to the Specifications themselves. Two conditions
attach and both are satisfied by the provenance header this library already writes:

- the **Exhibit A notice** goes in the derived file's header, verbatim;
- the designation *FpML* may identify the specification and state the version, but must not be used as part
  of a trademark for this library, and any compliance claim must name the version. So the header names the
  exact scheme versions and the file claims nothing beyond citing them.

What it publishes is better suited to this library than a thesaurus:

| | Measured |
|---|--:|
| Coding schemes (`fpml.org/spec/coding-scheme/codelist.zip`, 388 KB) | 236 |
| Codes across them | 5,881 |
| Codes that are already single-token identifiers | **2,657** |

`asset-class-2-1.xml` states `Commodity`, `Credit`, `Equity`, `ForeignExchange`, `InterestRate`,
`SecuritiesFinancing` — the words a trading system's identifiers are actually built from. And
`product-taxonomy-4-0.xml` publishes **a hierarchy in the code itself**:
`Commodity:Agricultural:Dairy:Option:Cash`. Each colon is a broader/narrower step, so the `broader` column
falls out of the code with no inference at all — the strongest form of the citation this library asks for.

The format is **OASIS genericode**, with `Code`, `Source` and `Description` columns and a `CanonicalVersionUri`
per scheme, so the extraction is a plain XML read and each scheme is a concept scheme.

**ISO 20022** remains open: read `iso20022.org/terms-use` and the IPR policy against the words *redistribute
in a derived work*. If it clears, the External Code Sets are the interesting part.

### One shape for every source

Whatever a source publishes — OWL, SKOS, CSV, XSD — the extraction normalises it to the same
**SKOS-shaped** columns, and the bundled form stays a TSV:

```
concept   prefLabel   altLabel   broader   kind   module
```

That is what "convert it to SKOS" should mean here. Emitting SKOS *RDF* and reading it back would take an
RDF dependency (`jena-arq` is in the catalogue, consumed by nothing) to arrive at the same four facts, and
the reading needs a term-to-concept index rather than a graph. Normalising the vocabulary is the win; the
serialisation is not. A conversion also **inherits the source's licence** — restating IEEE's thesaurus in
SKOS does not make it redistributable, and the derived file's header must carry the original terms.

### The matcher

`TopicCitations.of(String word)` takes one word, and `PhraseTopics` reads a phrase as a bag, so word order
is discarded. But **81% of FIBO's labels are multi-word**, and `Vocabulary.IDENTIFIER.phrasesOf` already
yields an *ordered* word list per identifier — the ordering is sitting there unused.

A new `PhraseReading` implementation runs longest-match left to right over the raw ordered words, bounded by
the index's own longest term. A hit emits a span and advances past it; a miss advances one word and records
nothing. **A partial match abstains**: only a term the resource actually publishes votes, and a prefix that
is not itself a published term is not a citation. It matches the raw words rather than the offered lemmas,
because `OfferedWords` drops function words and would manufacture adjacency the author never wrote.

`PhraseTopics` is at the line limit, so it splits: `AgreeingWords` (today's body, moved), `MatchedTerms`
(the span reading), and a pooled `PhraseTopics` over an ordered list of both. `TopicCitations` does not
change — the term reading is its sibling, not its replacement.

**Synonyms are never grouped by hand.** SKOS `altLabel`, `klink:relatedEquivalent` and `cmns-av:synonym`
are each a published statement of synonymy, so each is a citation. Where a source publishes none — FIBO
largely does not, at 11% coverage — the reading abstains rather than borrowing WordNet, because a WordNet
synonym of a term's head noun is a statement about English and not about the taxonomy.

**Lemmatise both sides, and keep both keys.** `securities` lemmatises to `security`, which is a first-class
*computing* concept: collapsing them destroys evidence in exactly the case the taxonomy was added for. Index
the surface form and the lemma as separate keys onto one concept, weight the surface match higher, and
record which fired.

### What settles it, stated before it runs

A domain vocabulary must fire on a repository in its domain and **not** on one outside it. Held-out
in-domain: `OpenGamma/Strata` and `apache/fineract`, both Apache-2.0. Out of domain: `netty/netty`,
`junit-team/junit-framework`, `bcgit/bc-java`, and this tree — whose out-of-domain arm is already measured
above. Tuned on `paritytrading/parity` and `JavaMoney/moneta`, drawn disjointly.

Two nulls, because the existing one is the wrong shape: `PermutationNull` resamples files *within* a
repository and cannot answer a between-repository question. Pool the panel's files for the first; permute
the **term-to-concept** assignment within the taxonomy for the second, preserving branch and term-length
distributions, so the matcher hits the same spans in the same places and only the branch reported is chance.

**Abandon if:** in-domain mass does not clear the pooled null; multi-word matches in domain are not orders
of magnitude above the 3-in-63,275 baseline; discrimination survives only when single-word terms are
excluded **by hand**; or an audit of 50 sampled spans finds fewer than 40 genuine.

### Stage 1, specified to the file

Written here rather than under `docs/` on purpose: `docs/*.md` is read by the reading, and a specification
full of derivatives vocabulary would put `ForeignExchange` and `InterestRate` into the corpus and then find
them. The working notes are no longer parsed, so a specification costs the reading nothing.

**Nothing in `code-semantics-engine/src/main` changes in this stage.** The theme reading is untouched; if a
kill criterion fires, the extraction task, the resource and the diagnostic are deleted and no reading was
ever affected.

#### The bundled file

`lexicon/src/main/resources/fpml-schemes.tsv`, six columns, tab separated, sorted by `concept`:

| Column | From | Example |
|---|---|---|
| `concept` | `CanonicalVersionUri` + `#` + code | `http://www.fpml.org/coding-scheme/asset-class-2-1#InterestRate` |
| `prefLabel` | the code exactly as published | `InterestRate` |
| `altLabel` | empty — genericode states no synonymy, and the reading abstains rather than borrowing WordNet | |
| `broader` | the parent path's concept where the code is colon-delimited, else the scheme's own concept | `…product-taxonomy-4-0#Commodity:Agricultural:Dairy:Option` |
| `kind` | `code` | `code` |
| `scheme` | `ShortName` from the scheme's `Identification` | `assetClassScheme` |

Header carries `Source:` naming the archive URL and each scheme's own `Version`, `Licence:` naming the FpML
Public License 3.0, and **Exhibit A verbatim**. `VocabularyProvenanceTest` covers it the moment it lands.

#### Extraction — `lexicon-extraction`

| Class | Does one thing |
|---|---|
| `FpmlCodeList` | the archive on disk or fetched, its SHA-256 checked against a recorded constant |
| `ContentDigest` | SHA-256 over bytes, the sibling of `GitBlobId` for a source that is not a git blob |
| `GenericodeScheme` | one genericode document read to `Identification` (short name, version, canonical URI) plus its rows |
| `SchemeCode` | record: `code`, `source`, `description` |
| `FpmlConcepts` | codes to concept rows, deriving `broader` from the colon path |
| `FpmlSchemeTsv` | renders the TSV under the provenance header |
| `FpmlSchemeExtraction` | `main`, wired to `./gradlew :lexicon-extraction:extractFpmlSchemes` |

`GitBlobId` cannot pin this: the archive is not in git. The digest is ours rather than the publisher's, so
the header must say so — *"SHA-256 recorded at extraction; the publisher states no checksum"* — and each
scheme's own `Version` is the publisher's statement that actually matters.

#### Reading — `lexicon` and `code-semantics-engine`

| Class | Does one thing |
|---|---|
| `FpmlSchemes` (lexicon) | the bundled TSV as a term index: `conceptsOf(String term)`, `longestTerm()`, `broaderOf(String concept)` |
| `TermIndex` (engine, interface) | what a term index must answer, so a second source needs no new reading |
| `TermSpans` (engine) | the longest-match, non-overlapping cover of a phrase's ordered words |
| `TermSpan` (engine, record) | `from`, `to`, `words`, `concept`, `source` |
| `PhraseSpecificity` (engine) | an n-gram's surprisal off the bundled frequency list, the sibling of `WordSpecificity` |
| `DomainTermDiagnostic` (engine, test, `@Tag("diagnostic")`) | runs the panel and writes `domain-terms.md` |

`./gradlew domainRead`, modelled on `selfRead`, reading `-Dcs.panel.dir` — which `cs.java-conventions`
must forward beside `cs.clone.dir`, the only two properties the test convention passes to the forked JVM.

#### Tests that come first

- `GenericodeSchemeTest` — reads a scheme's identity and rows from a fixture; refuses a document stating no
  `Identification` rather than reading it as empty.
- `FpmlConceptsTest` — `Commodity:Agricultural:Dairy:Option:Cash` yields the parent
  `Commodity:Agricultural:Dairy:Option` as `broader`; a code with no colon takes the scheme as `broader`.
- `ContentDigestTest` — the digest of known bytes, against a value `shasum` also produces.
- `FpmlSchemeTsvTest` — sorted rows under a header carrying the licence and Exhibit A.
- `TermSpansTest` — longest wins and spans do not overlap; a prefix that is not itself a published term
  **abstains**; matching runs over the raw ordered words, not the offered lemmas.
- `PhraseSpecificityTest` — `name` weighs near nothing, `interest rate swap` near the ceiling, both bounded
  in `[0, 1]` by the frequency list's own length.
- `FpmlSchemesTest` — the bundled file answers `InterestRate`, and an unknown term yields nothing.

#### What stage 1 reports, and what would end it

`domainRead` writes, per repository in the panel: matched spans per thousand identifier occurrences, split
by term length; the schemes that matched; and the count of files where nothing matched. The out-of-domain
arm is already measured for FIBO — 1,789 one-word against 3 multi-word on this tree — and FpML's codes are
single tokens, so **the one-word rate is exactly what has to be shown to be discriminating here**. That is
the risk this stage exists to measure: FpML may be code-shaped and still be measuring the English words
*credit*, *equity* and *option*.

Abandon if in-domain matching does not clear the pooled permutation null, or if it clears only once
single-token codes are excluded by hand.

### Staging

1. **FIBO terms and a diagnostic, with the reading untouched.** `extractFiboTerms`, `fibo-terms.tsv`,
   `FiboTerms`, `TermIndex`, `TermSpans`, `PhraseSpecificity`, and `./gradlew domainRead` behind
   `-Dcs.panel.dir`. If a kill criterion fires, two files are deleted and no reading was ever corrupted.
2. **The votes join the reading** — `MatchedTerms`, `TermCitations`, new `EvidenceSource` and `Weights`
   entries, and the FIBO module as the roll-up level the resource itself names.
3. **CSO and the branch confusion matrix**, which is also the first real attempt on `computing` versus
   `computer_science` — if CSO maps them, that mapping is CSO's statement rather than ours.
4. **Synonymy and abbreviations**, and the surface-versus-lemma comparison as an A/B on the held-out panel.
5. **STW**, only if the first three pass.

Note the roll-up here runs **opposite** to `StatedTopics`: there the resource published a closure and the
hierarchy subtracts what was derived; here the resource states one concept and the hierarchy rolls it up.
Same interface shape, opposite direction, and the javadoc has to say so.

---

## [HIGH] The domain landscape of a large institution, and which standards can be cited for it

A bank is not one domain. It is a dozen business domains, a set of enterprise functions any large corporate
has, and the technical domains underneath both — and a reading that offers only *finance* will read a
payments service, an HR system and a risk engine as the same thing.

### Two kinds of taxonomy, and they do not match the same way

This distinction decides the design, and conflating them is the mistake to avoid:

| | **Term taxonomy** | **Functional taxonomy** |
|---|---|---|
| States | what a thing in the domain is called | what a business *does*, as a partition of activity |
| Examples | FIBO, CDM, XBRL element names, FpML, ESCO skills | APQC PCF, BIAN service landscape, Basel event types, ISO 20022 business areas |
| Grain | a term, matched against an identifier | a capability, matched against a whole scope |
| How it reads | longest-match n-gram over a phrase — the matcher above | **not the matcher.** A scope's aggregate reading compared against each functional area, which is the divergence machinery already in the tree |
| Answers | "this file writes the language of derivatives" | "this repository is trade processing, not wealth management" |

A functional taxonomy has perhaps a hundred labels and none of them appear in code — nobody writes
`ManageEnterpriseRisk` — so matching it term-by-term would find nothing and mean nothing. It is a
**reference distribution** to diverge against, which is what §16 of the plan already does for scopes.

### The domains, and the standard that could speak for each

Verified nowhere yet. **Every licence below is a claim to check, not a finding**, and the ones marked
*code-shaped* are those whose terms are already identifiers — the `sql-functions.tsv` case, and the only
ones the matcher can use directly.

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
| Banking capabilities | **BIAN Service Landscape** | BIAN | none stated — already ruled out | no — functional |
| HR, skills, occupations | **ESCO** (native SKOS, ~13k skills); **O\*NET**; **ISCO-08** | EU Commission; US DoL; ILO | ESCO under the EU reuse decision; O\*NET CC BY | no |
| Procurement | **CPV** common procurement vocabulary; **UNSPSC** | EU; GS1 US | CPV under EU reuse; UNSPSC licensed | no |
| Security | **NIST CSF** functions; **SP 800-53** control families | NIST | **US Government work — public domain** | no |
| IT service management | ITIL; COBIT | AXELOS; ISACA | proprietary — expect to rule both out | no |

**Technical domains**

| Domain | Candidate standard | Licence to check | Code-shaped |
|---|---|---|:--:|
| Computing | **CSO** (above) | CC BY 4.0, unstated on the download page | no |
| Data management | **DCAT** and **Dublin Core**; **ISO/IEC 11179** metadata registry | W3C and DCMI open; ISO paywalled | **yes** for DCAT terms |
| Web and general | **schema.org** | CC BY-SA — share-alike, so read carefully before bundling | **yes** |

### What to do with this

1. **Verify the licences in one pass**, cheapest and most permissive first: GLEIF (CC0), NIST (public
   domain), FINOS CDM and FDC3 (Apache-2.0), ESCO, CPV, then FpML, ISO 20022, APQC. A source whose licence
   cannot be established does not get bundled, however well it fits.
2. **Take the code-shaped ones first.** CDM, FDC3, XBRL, ACTUS and FpML state terms a program actually
   writes, and the matcher can use them the day they are extracted. A classification of *businesses* or
   *occupations* cannot be matched against identifiers and should not be bundled as if it could.
3. **Keep functional taxonomies out of the matcher.** APQC and BIAN, if their licences permit, belong to a
   separate reading: a scope's topical distribution diverged against each functional area, reported as
   "this repository reads as trade processing", with the same permutation null. That is a different slice
   and should be measured separately, or it will be credited to the term matcher.
4. **One shape for all of them** — the six SKOS-shaped columns above, one TSV per source, each carrying its
   own provenance header.

**The measurement stays the same and applies per domain:** a domain's vocabulary must fire on a repository
in that domain and not on one outside it. With a dozen domains the honest form is a confusion matrix rather
than a pair of numbers — one repository per domain down the side, one vocabulary across the top, and the
diagonal has to win against a permuted-assignment null.

---

## [MEDIUM] The identifier splitter — the letter/digit boundary

**Rules 1, 2, 3 and 5 have landed** in `IdentifierWords`, alongside the ported `Tokeniser` rather than inside
it: explicit separators including the dot and dollar, the lower→upper boundary, the acronym-run boundary, and
the residual run to `WordSegmenter`. Four of the plan's five documented mis-splits now read correctly, and
`refusesALineRange` stopped reading as *refuses / aline / range*, which is what let a method name be read as a
clause at all.

Two things are left:

**Rule 4, the letter↔digit boundary, proposed not applied.** Both readings go forward as candidates and a
catalogue citation decides. `utf8Decode` still reads as one token because `utf8` is a single token in the
catalogues that name it — and this repository bundles no such catalogue, so there is nothing yet to arbitrate
with. It is blocked on the item below, and deliberately: this is where a lesser design would put a list.

**Byte offsets.** A token should carry the offset it began at, which is what lets a token's evidence carry a
line-accurate permalink rather than a line-accurate-to-the-declaration one.

**Measurement:** the nine-identifier table in the plan, now pinned in `TokeniserTest` so a widening shows up
as a rewritten expectation rather than as a silent change, plus the count of live identifiers whose reading
changes. The self test already names live instances: `aprefix` (10), `asuffix` (10), `aword` (9), `acompound`
(4) and `jwnlexception` (10) are in the unread tail because there is no acronym-run rule and no rule for a
single capital in front of a word. Ships when the five known mis-splits read correctly, those tail entries
disappear, and nothing that read correctly regresses.

*Blocked on nothing.*

## [LOW] The cited catalogues — what rule 4 needs

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

**The keyword half is superseded and the demotion half is moot.** The parse reads declarations, so the
language's own words never arrive — they are never declarations — and neither do the platform's, which are
uses of somebody else's. `PlatformPackages` handles the one place platform names do arrive, the import
section, by asking `ModuleFinder.ofSystem()` which packages the platform exports.

What the catalogues are still needed for is **rule 4 of the splitter**, which has nothing to arbitrate with
until one exists. `utf8`, `ipv6`, `base64` and `co2` are single tokens in the catalogues that name them, and
the letter/digit split must be proposed for a citation to dispose of rather than simply applied.

**Measurement:** the count of identifiers whose reading changes when the boundary is proposed and arbitrated,
against the count that would change if it were simply applied. The difference is what the citation is buying.

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

## [MEDIUM] The domain resources only label specialist senses — what is left of it

The theme reading finds this repository to be about **law**, and it is not. The cause is not polysemy, which
is what it looks like; it is the opposite, and it is stated in the bundled resource's own header: *"Factotum
(domain-less) entries are absent from the published lift."* A word's everyday sense carries no domain label,
so **only its specialist senses ever vote**, and the specialist sense is usually not the one the code means.

Measured, on the words carrying the theme:

| Word | What the resources say | Coherence |
|---|---|--:|
| `cite` | `law` — and nothing else, from both resources | **1.000** |
| `licence` | `law` — and nothing else | **1.000** |
| `attribution` | `law` — and nothing else | **1.000** |
| `claim` | `law` 0.88, `insurance` 0.13 | 0.781 |
| `answer` | `law` 0.75, `physiology` 0.25 | 0.625 |
| `word` | `linguistics` 0.19, `religion` 0.19, `computer_science` 0.17, and 18 more | 0.112 |
| `read` | 23 labels, none above 0.10 | 0.060 |

The bibliographic sense of `cite` — the only sense this repository ever means — is domain-less and therefore
invisible. The legal sense is the whole of what the resources say about the word.

**And the coherence rule amplifies exactly this.** A phrase commits Simpson's index over its own shares, so a
word whose only labelled sense is specialist commits a full unit while a word whose meaning is genuinely
general commits almost nothing. One `cite` outweighs roughly forty-seven occurrences of `word` — where `word`
appears 727 times and is unambiguously what this repository is about. Narrowness was taken as confidence; it
is a symptom of missing coverage.

**The control confirms it is the instrument and not the corpus.** `law` is *under*-represented in
`lexicon/src/main/java` — the module ported verbatim from another project — by 14.4% of that scope's
divergence, and *over*-represented in the source sets written for this reading. `witness`, `evidence`,
`attribution`, `claim`, `vote` and `commitment` are names chosen while building an evidence engine, and
English files that vocabulary under law. This is the doctrine's own rule failing: *do not mark your own
homework — the repositories a reading is tuned on and the repositories it is measured on are drawn
disjointly.*

**Fix 1 has landed and it worked.** `SenseCoverage` scales the sense-labelled resource's votes and the
phrase's committed mass by *labelled senses / total senses*, both read from WordNet. Measured on this tree:
`law` went from **first at ι 0.0723 leading 28 files** to **fourth at ι 0.0530 leading 20**, and `linguistics`
is now the theme leading the most files. It also raised the count of files no topic could be resolved for
from 0 to 53, which is the honest consequence: a reading resting on words the resources barely cover should
say so rather than resolve confidently.

**Fix 2 has landed and it worked too.** With the sense-labelled resource properly discounted, the
headword-labelled one dominated — and it labels with a hierarchy it publishes as a closure, so one statement
about a word arrived as six:

| Label | ι before | Leads before | ι after | Carried by, before |
|---|--:|--:|--:|---|
| `sciences` | 0.0651 | 20 | — | occurrence, topic, site, from |
| `natural-sciences` | 0.0403 | 1 | — | topic, site, resource, word |
| `physical-sciences` | 0.0365 | 0 | — | topic, site, resource, word |
| `engineering` | 0.0344 | 0 | — | topic, site, resource, word |
| `computing` | 0.0313 | 0 | **0.0824**, leading 36 | topic, site, resource, word |
| `human-sciences` | 0.0269 | 0 | — | occurrence, least, citation, initialism |
| **together** | **0.2344** | 21 | — | — |

Four had *identical* witnesses and led nothing between them: one theme counted six times, holding 23% of all
topical mass. `StatedTopics` folds a derived label back into the label it was derived from, citing the same
published map that derived it. The vocabulary went from 519 distinct topics to 479, the files no topic could
be resolved for from 54 to 17, and `computing` — a defensible answer for a library that reads code — leads
where five restatements of *sciences* used to sit.

**The rest of the fixes, in the order they are worth doing:**

3. **Read the most frequent sense, as the plan already says.** Stage 9 of the plan is explicitly reduced to
   WordNet's most frequent sense as a stated baseline. The reading currently pools every labelled sense
   equally, which is worse than the baseline it was supposed to start from — and WordNet carries the corpus
   use counts that would settle it. The fold sharpened the case rather than settling it: `music` is now
   fourth, carried by `topic`, whose everyday sense is the one the resource never labelled.
4. **Stop treating narrowness as confidence.** Coherence should be agreement between the phrase's words, not
   the shape of one word's entry.
5. **Read a repository this reading was not written for.** `-Dcs.clone.dir` already points the diagnostic at
   another clone, and until it has been run on one, every figure here is an instrument reading itself.

## [HIGH] Verbal forms — the rest of the behaviour reading

`Behaviours` reads a declared method name as a clause: the leading word where the dictionary carries a verb
entry for it, and the rest as what the verb acts on. 592 of this repository's methods read that way — read
(84), name (21), refuse (21), carry (15). Three parts of the question it was asked are **not** answered yet,
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

## [LOW] The Wiktionary topic hierarchy — what is left of it

**The fold has landed.** `wiktionary-topic-hierarchy.tsv` carries wiktextract's own generalisation map at a
pinned revision, and `StatedTopics` reads it to tell a label a headword was given from one derived off
another it was given. Measured: 519 distinct topics to 479, `sciences` and its four restatements out of the
top fifteen entirely, `computing` first at ι 0.0824 leading 36 files. A fold that only reduced the label
count without moving the reading would have bought nothing; this one moved the top of the table.

Two things it does not do:

**`computing` and `computer_science` are still two labels for one subject**, because they are two
*resources'* labels — Wiktionary's and WordNet Domains's — and no bundled resource states that they are the
same subject. Nothing here may say it either. A hierarchy folds a resource into itself; reconciling two label
spaces needs a citation that maps between them, and WordNet Domains's own hierarchy is the first place to
look for one.

**A root by omission is not a root by statement.** The map generalises 690 of the vocabulary's 719 distinct
labels and is silent about 29 — `law`, `business`, `government`, `media`, `metrology`, `arts` among them.
Some of those are genuinely top-level and some only lack an entry, and the fold cannot tell which: a label
nothing generalises is never folded, so a missing entry silently keeps a duplicate reading alive. The 29 are
few enough to check against the map's own upper levels, and *checking* them is the work — the answer is a
citation or it is nothing.

## [HIGH] A topic that leads a file should hold some of it

**92 of the 178 files that have a leader are led at a share under a fifth, and they hold 7,643 of the 13,711
led lines.** `law` leads the 692-line plan document holding **7.6%** of it; `mathematics` leads `README.md`
at 9.4%, `computing` leads `CLAUDE.md` at 7.4%. Nothing dominates those files. A theme wins by a nose in a
field where every theme is weak, and then takes every one of their lines into its total.

The hierarchy fold made this worse rather than better, which is the honest way round: concentrating mass on
the label a resource actually stated took the files with no leader at all from 54 to 17, so more files now
have a leader that holds almost none of them.

The abstention already knows this. `OpenSpaceAccumulator` resolves the leader's share against the voted mass
*plus* what nothing could read, and that share is carried on every file as `ValueShare.share()` — the
reporting simply ignores it. A topic should lead a file only where its share clears the file's own
abstention, and `TopicRankings` should count lines on that basis.

**Measurement:** lines led, before and after, for every theme in the top ten — and the count of files with no
leader at all, which should rise. A ranking that does not move is a ranking that was already honest, and
this one will move.

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

**A first viewer exists** for the theme reading — `ThemePage` renders the same `ThemeGraph` the export is
written from, so the picture and the report cannot disagree. It is written the way everything else here is:
markup is a DSL of typed tags and never a string in a Java file, the stylesheet and the script are their own
files, and the page carries no document wrapper so whatever renders it supplies one. Its layout is
deterministic (themes on rows ordered by intensity, arcs joining two themes when the same word was read as
both), which is the same discipline the concept map below demands and for the same reason: no force
simulation, because readability is not a layout parameter. What it draws is the shared *word*, which makes
the polysemy that dominates a raw ranking visible instead of hiding it.

**A site is a link only where the reading could render one.** With no remote to permalink into, the reading
renders an editor link — a path on the machine that read the tree, which opens nothing anywhere else and
publishes that machine's layout to everyone the page reaches. The page names such a site and does not anchor
it, and drops the url from the payload its script reads. It is the shape of the real fix rather than the fix:
stages 1–3 are what make a witness a permalink.

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
